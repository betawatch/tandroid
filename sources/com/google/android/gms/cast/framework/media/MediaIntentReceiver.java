package com.google.android.gms.cast.framework.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import m5.q;
import n5.a;
import n5.c;
import n5.g;
import o5.h;
import o5.i;
import r5.b;
import y5.l;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
        l.e("Must be called from the main thread.");
        return cVar.j;
    }

    private void seek(c cVar, long j10) {
        h remoteMediaClient;
        if (j10 == 0 || (remoteMediaClient = getRemoteMediaClient(cVar)) == null || remoteMediaClient.j() || remoteMediaClient.n()) {
            return;
        }
        remoteMediaClient.q(new q(remoteMediaClient.a() + j10));
    }

    private void togglePlayback(c cVar) {
        h remoteMediaClient = getRemoteMediaClient(cVar);
        if (remoteMediaClient == null) {
            return;
        }
        remoteMediaClient.r();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        n5.h b10;
        g d;
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

    public void onReceiveActionForward(g gVar, long j10) {
        if (gVar instanceof c) {
            seek((c) gVar, j10);
        }
    }

    public void onReceiveActionMediaButton(g gVar, Intent intent) {
        if ((gVar instanceof c) && intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Bundle extras = intent.getExtras();
            l.h(extras);
            KeyEvent keyEvent = (KeyEvent) extras.get("android.intent.extra.KEY_EVENT");
            if (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 85) {
                togglePlayback((c) gVar);
            }
        }
    }

    public void onReceiveActionRewind(g gVar, long j10) {
        if (gVar instanceof c) {
            seek((c) gVar, -j10);
        }
    }

    public void onReceiveActionSkipNext(g gVar) {
        h remoteMediaClient;
        if (!(gVar instanceof c) || (remoteMediaClient = getRemoteMediaClient((c) gVar)) == null || remoteMediaClient.n()) {
            return;
        }
        l.e("Must be called from the main thread.");
        if (remoteMediaClient.w()) {
            h.x(new i(remoteMediaClient, 2));
        } else {
            h.t();
        }
    }

    public void onReceiveActionSkipPrev(g gVar) {
        h remoteMediaClient;
        if (!(gVar instanceof c) || (remoteMediaClient = getRemoteMediaClient((c) gVar)) == null || remoteMediaClient.n()) {
            return;
        }
        l.e("Must be called from the main thread.");
        if (remoteMediaClient.w()) {
            h.x(new i(remoteMediaClient, 1));
        } else {
            h.t();
        }
    }

    public void onReceiveActionTogglePlayback(g gVar) {
        if (gVar instanceof c) {
            togglePlayback((c) gVar);
        }
    }

    public void onReceiveOtherAction(Context context, String str, Intent intent) {
    }

    @Deprecated
    public void onReceiveOtherAction(String str, Intent intent) {
        onReceiveOtherAction(null, str, intent);
    }
}
