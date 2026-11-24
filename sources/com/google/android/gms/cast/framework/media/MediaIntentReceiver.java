package com.google.android.gms.cast.framework.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
    private static final dc6 log = new dc6(TAG, null);

    private static i69 getRemoteMediaClient(ed1 ed1Var) {
        if (ed1Var == null || !ed1Var.b()) {
            return null;
        }
        fre.e("Must be called from the main thread.");
        return ed1Var.j;
    }

    private void seek(ed1 ed1Var, long j) {
        i69 remoteMediaClient;
        if (j == 0 || (remoteMediaClient = getRemoteMediaClient(ed1Var)) == null || remoteMediaClient.j() || remoteMediaClient.n()) {
            return;
        }
        remoteMediaClient.q(new nu6(remoteMediaClient.a() + j));
    }

    private void togglePlayback(ed1 ed1Var) {
        i69 remoteMediaClient = getRemoteMediaClient(ed1Var);
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
        j6a b;
        d5a d;
        String action = intent.getAction();
        log.b("onReceive action: %s", action);
        if (action == null || (d = (b = ad1.c(context).b()).d()) == null) {
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

    public void onReceiveActionForward(d5a d5aVar, long j) {
        if (d5aVar instanceof ed1) {
            seek((ed1) d5aVar, j);
        }
    }

    public void onReceiveActionMediaButton(d5a d5aVar, Intent intent) {
        if ((d5aVar instanceof ed1) && intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Bundle extras = intent.getExtras();
            fre.h(extras);
            KeyEvent keyEvent = (KeyEvent) extras.get("android.intent.extra.KEY_EVENT");
            if (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 85) {
                togglePlayback((ed1) d5aVar);
            }
        }
    }

    public void onReceiveActionRewind(d5a d5aVar, long j) {
        if (d5aVar instanceof ed1) {
            seek((ed1) d5aVar, -j);
        }
    }

    public void onReceiveActionSkipNext(d5a d5aVar) {
        i69 remoteMediaClient;
        if (!(d5aVar instanceof ed1) || (remoteMediaClient = getRemoteMediaClient((ed1) d5aVar)) == null || remoteMediaClient.n()) {
            return;
        }
        fre.e("Must be called from the main thread.");
        if (remoteMediaClient.w()) {
            i69.x(new x5d(remoteMediaClient, (byte) 2));
        } else {
            i69.t();
        }
    }

    public void onReceiveActionSkipPrev(d5a d5aVar) {
        i69 remoteMediaClient;
        if (!(d5aVar instanceof ed1) || (remoteMediaClient = getRemoteMediaClient((ed1) d5aVar)) == null || remoteMediaClient.n()) {
            return;
        }
        fre.e("Must be called from the main thread.");
        if (remoteMediaClient.w()) {
            i69.x(new x5d(remoteMediaClient, (byte) 1));
        } else {
            i69.t();
        }
    }

    public void onReceiveActionTogglePlayback(d5a d5aVar) {
        if (d5aVar instanceof ed1) {
            togglePlayback((ed1) d5aVar);
        }
    }

    @Deprecated
    public void onReceiveOtherAction(String str, Intent intent) {
        onReceiveOtherAction(null, str, intent);
    }

    public void onReceiveOtherAction(Context context, String str, Intent intent) {
    }
}
