package com.google.android.gms.cast.framework.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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
    private static final ce6 log = new ce6(TAG, null);

    private static k89 getRemoteMediaClient(me1 me1Var) {
        if (me1Var == null || !me1Var.b()) {
            return null;
        }
        ite.e("Must be called from the main thread.");
        return me1Var.j;
    }

    private void seek(me1 me1Var, long j) {
        k89 remoteMediaClient;
        if (j == 0 || (remoteMediaClient = getRemoteMediaClient(me1Var)) == null || remoteMediaClient.j() || remoteMediaClient.n()) {
            return;
        }
        remoteMediaClient.q(new nw6(remoteMediaClient.a() + j));
    }

    private void togglePlayback(me1 me1Var) {
        k89 remoteMediaClient = getRemoteMediaClient(me1Var);
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
        l8a b;
        f7a d;
        String action = intent.getAction();
        log.b("onReceive action: %s", action);
        if (action == null || (d = (b = ie1.c(context).b()).d()) == null) {
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

    public void onReceiveActionForward(f7a f7aVar, long j) {
        if (f7aVar instanceof me1) {
            seek((me1) f7aVar, j);
        }
    }

    public void onReceiveActionMediaButton(f7a f7aVar, Intent intent) {
        if ((f7aVar instanceof me1) && intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Bundle extras = intent.getExtras();
            ite.h(extras);
            KeyEvent keyEvent = (KeyEvent) extras.get("android.intent.extra.KEY_EVENT");
            if (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 85) {
                togglePlayback((me1) f7aVar);
            }
        }
    }

    public void onReceiveActionRewind(f7a f7aVar, long j) {
        if (f7aVar instanceof me1) {
            seek((me1) f7aVar, -j);
        }
    }

    public void onReceiveActionSkipNext(f7a f7aVar) {
        k89 remoteMediaClient;
        if (!(f7aVar instanceof me1) || (remoteMediaClient = getRemoteMediaClient((me1) f7aVar)) == null || remoteMediaClient.n()) {
            return;
        }
        ite.e("Must be called from the main thread.");
        if (remoteMediaClient.w()) {
            k89.x(new z7d(remoteMediaClient, (byte) 2));
        } else {
            k89.t();
        }
    }

    public void onReceiveActionSkipPrev(f7a f7aVar) {
        k89 remoteMediaClient;
        if (!(f7aVar instanceof me1) || (remoteMediaClient = getRemoteMediaClient((me1) f7aVar)) == null || remoteMediaClient.n()) {
            return;
        }
        ite.e("Must be called from the main thread.");
        if (remoteMediaClient.w()) {
            k89.x(new z7d(remoteMediaClient, (byte) 1));
        } else {
            k89.t();
        }
    }

    public void onReceiveActionTogglePlayback(f7a f7aVar) {
        if (f7aVar instanceof me1) {
            togglePlayback((me1) f7aVar);
        }
    }

    @Deprecated
    public void onReceiveOtherAction(String str, Intent intent) {
        onReceiveOtherAction(null, str, intent);
    }

    public void onReceiveOtherAction(Context context, String str, Intent intent) {
    }
}
