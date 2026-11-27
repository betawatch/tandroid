package com.google.android.gms.cast.framework.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class MediaIntentReceiver extends BroadcastReceiver {
    public static final String ACTION_DISCONNECT = "com.google.android.gms.cast.framework.action.DISCONNECT";
    public static final String ACTION_FORWARD = "com.google.android.gms.cast.framework.action.FORWARD";
    public static final String ACTION_REWIND = "com.google.android.gms.cast.framework.action.REWIND";
    public static final String ACTION_SKIP_NEXT = "com.google.android.gms.cast.framework.action.SKIP_NEXT";
    public static final String ACTION_SKIP_PREV = "com.google.android.gms.cast.framework.action.SKIP_PREV";
    public static final String ACTION_STOP_CASTING = "com.google.android.gms.cast.framework.action.STOP_CASTING";
    public static final String ACTION_TOGGLE_PLAYBACK = "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK";
    public static final String EXTRA_SKIP_STEP_MS = "googlecast-extra_skip_step_ms";
    private static final String TAG = "MediaIntentReceiver";
    private static final he6 log = new he6(TAG, null);

    private static v99 getRemoteMediaClient(md1 md1Var) {
        if (md1Var == null || !md1Var.b()) {
            return null;
        }
        xve.e("Must be called from the main thread.");
        return md1Var.j;
    }

    private void seek(md1 md1Var, long j) {
        v99 remoteMediaClient;
        if (j == 0 || (remoteMediaClient = getRemoteMediaClient(md1Var)) == null || remoteMediaClient.j() || remoteMediaClient.n()) {
            return;
        }
        remoteMediaClient.q(new sw6(remoteMediaClient.a() + j));
    }

    private void togglePlayback(md1 md1Var) {
        v99 remoteMediaClient = getRemoteMediaClient(md1Var);
        if (remoteMediaClient == null) {
            return;
        }
        remoteMediaClient.r();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        baa b;
        v8a d;
        String action = intent.getAction();
        log.b("onReceive action: %s", action);
        if (action == null || (d = (b = id1.c(context).b()).d()) == null) {
            return;
        }
        switch (action.hashCode()) {
            case -1699820260:
                if (action.equals(ACTION_REWIND)) {
                    onReceiveActionRewind(d, intent.getLongExtra(EXTRA_SKIP_STEP_MS, 0L));
                    return;
                }
                break;
            case -945151566:
                if (action.equals(ACTION_SKIP_NEXT)) {
                    onReceiveActionSkipNext(d);
                    return;
                }
                break;
            case -945080078:
                if (action.equals(ACTION_SKIP_PREV)) {
                    onReceiveActionSkipPrev(d);
                    return;
                }
                break;
            case -668151673:
                if (action.equals(ACTION_STOP_CASTING)) {
                    b.b(true);
                    return;
                }
                break;
            case -124479363:
                if (action.equals(ACTION_DISCONNECT)) {
                    b.b(false);
                    return;
                }
                break;
            case 235550565:
                if (action.equals(ACTION_TOGGLE_PLAYBACK)) {
                    onReceiveActionTogglePlayback(d);
                    return;
                }
                break;
            case 1362116196:
                if (action.equals(ACTION_FORWARD)) {
                    onReceiveActionForward(d, intent.getLongExtra(EXTRA_SKIP_STEP_MS, 0L));
                    return;
                }
                break;
            case 1997055314:
                if (action.equals("android.intent.action.MEDIA_BUTTON")) {
                    onReceiveActionMediaButton(d, intent);
                    return;
                }
                break;
        }
        onReceiveOtherAction(context, action, intent);
    }

    public void onReceiveActionForward(v8a v8aVar, long j) {
        if (v8aVar instanceof md1) {
            seek((md1) v8aVar, j);
        }
    }

    public void onReceiveActionMediaButton(v8a v8aVar, Intent intent) {
        if ((v8aVar instanceof md1) && intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Bundle extras = intent.getExtras();
            xve.h(extras);
            KeyEvent keyEvent = (KeyEvent) extras.get("android.intent.extra.KEY_EVENT");
            if (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 85) {
                togglePlayback((md1) v8aVar);
            }
        }
    }

    public void onReceiveActionRewind(v8a v8aVar, long j) {
        if (v8aVar instanceof md1) {
            seek((md1) v8aVar, -j);
        }
    }

    public void onReceiveActionSkipNext(v8a v8aVar) {
        v99 remoteMediaClient;
        if (!(v8aVar instanceof md1) || (remoteMediaClient = getRemoteMediaClient((md1) v8aVar)) == null || remoteMediaClient.n()) {
            return;
        }
        xve.e("Must be called from the main thread.");
        if (remoteMediaClient.w()) {
            v99.x(new qad(remoteMediaClient, (byte) 2));
        } else {
            v99.t();
        }
    }

    public void onReceiveActionSkipPrev(v8a v8aVar) {
        v99 remoteMediaClient;
        if (!(v8aVar instanceof md1) || (remoteMediaClient = getRemoteMediaClient((md1) v8aVar)) == null || remoteMediaClient.n()) {
            return;
        }
        xve.e("Must be called from the main thread.");
        if (remoteMediaClient.w()) {
            v99.x(new qad(remoteMediaClient, (byte) 1));
        } else {
            v99.t();
        }
    }

    public void onReceiveActionTogglePlayback(v8a v8aVar) {
        if (v8aVar instanceof md1) {
            togglePlayback((md1) v8aVar);
        }
    }

    @Deprecated
    public void onReceiveOtherAction(String str, Intent intent) {
        onReceiveOtherAction(null, str, intent);
    }

    public void onReceiveOtherAction(Context context, String str, Intent intent) {
    }
}
