package com.google.android.gms.cast.framework.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import b6.m;
import q5.p;
import r5.a;
import r5.c;
import r5.f;
import r5.g;
import s5.h;
import s5.i;
import u5.b;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
    private static final b log = new b(TAG, null);

    private static h getRemoteMediaClient(c cVar) {
        if (cVar == null || !cVar.b()) {
            return null;
        }
        m.e("Must be called from the main thread.");
        return cVar.j;
    }

    private void seek(c cVar, long j10) {
        h remoteMediaClient;
        if (j10 == 0 || (remoteMediaClient = getRemoteMediaClient(cVar)) == null || remoteMediaClient.j() || remoteMediaClient.n()) {
            return;
        }
        remoteMediaClient.q(new p(remoteMediaClient.a() + j10));
    }

    private void togglePlayback(c cVar) {
        h remoteMediaClient = getRemoteMediaClient(cVar);
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
        g b10;
        f d;
        String action = intent.getAction();
        log.b("onReceive action: %s", action);
        if (action == null || (d = (b10 = a.c(context).b()).d()) == null) {
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
                    b10.b(true);
                    return;
                }
                break;
            case -124479363:
                if (action.equals(ACTION_DISCONNECT)) {
                    b10.b(false);
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

    public void onReceiveActionForward(f fVar, long j10) {
        if (fVar instanceof c) {
            seek((c) fVar, j10);
        }
    }

    public void onReceiveActionMediaButton(f fVar, Intent intent) {
        if ((fVar instanceof c) && intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Bundle extras = intent.getExtras();
            m.h(extras);
            KeyEvent keyEvent = (KeyEvent) extras.get("android.intent.extra.KEY_EVENT");
            if (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 85) {
                togglePlayback((c) fVar);
            }
        }
    }

    public void onReceiveActionRewind(f fVar, long j10) {
        if (fVar instanceof c) {
            seek((c) fVar, -j10);
        }
    }

    public void onReceiveActionSkipNext(f fVar) {
        h remoteMediaClient;
        if (!(fVar instanceof c) || (remoteMediaClient = getRemoteMediaClient((c) fVar)) == null || remoteMediaClient.n()) {
            return;
        }
        m.e("Must be called from the main thread.");
        if (remoteMediaClient.w()) {
            h.x(new i(remoteMediaClient, 2));
        } else {
            h.t();
        }
    }

    public void onReceiveActionSkipPrev(f fVar) {
        h remoteMediaClient;
        if (!(fVar instanceof c) || (remoteMediaClient = getRemoteMediaClient((c) fVar)) == null || remoteMediaClient.n()) {
            return;
        }
        m.e("Must be called from the main thread.");
        if (remoteMediaClient.w()) {
            h.x(new i(remoteMediaClient, 1));
        } else {
            h.t();
        }
    }

    public void onReceiveActionTogglePlayback(f fVar) {
        if (fVar instanceof c) {
            togglePlayback((c) fVar);
        }
    }

    public void onReceiveOtherAction(Context context, String str, Intent intent) {
    }

    @Deprecated
    public void onReceiveOtherAction(String str, Intent intent) {
        onReceiveOtherAction(null, str, intent);
    }
}
