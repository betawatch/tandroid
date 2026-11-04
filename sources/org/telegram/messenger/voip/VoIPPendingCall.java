package org.telegram.messenger.voip;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.voip.n1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class VoIPPendingCall {
    private org.telegram.messenger.c accountInstance;
    private final Activity activity;
    private Handler handler;
    private hs notificationCenter;
    private final cs observer;
    private final Runnable releaseRunnable;
    private boolean released;
    private final long userId;
    private final boolean video;

    private VoIPPendingCall(Activity activity, long j10, boolean z10, long j11, org.telegram.messenger.c cVar) {
        cs csVar = new cs() { // from class: org.telegram.messenger.voip.n
            @Override // org.telegram.messenger.cs
            public final void didReceivedNotification(int i3, int i10, Object[] objArr) {
                VoIPPendingCall.this.lambda$new$0(i3, i10, objArr);
            }
        };
        this.observer = csVar;
        p0 p0Var = new p0(this, 2);
        this.releaseRunnable = p0Var;
        this.activity = activity;
        this.userId = j10;
        this.video = z10;
        this.accountInstance = cVar;
        if (onConnectionStateUpdated(false)) {
            return;
        }
        hs f10 = hs.f(h10.t0);
        this.notificationCenter = f10;
        f10.b(csVar, hs.T1);
        Handler handler = new Handler(Looper.myLooper());
        this.handler = handler;
        handler.postDelayed(p0Var, j11);
    }

    private boolean isAirplaneMode() {
        return Settings.System.getInt(this.activity.getContentResolver(), "airplane_mode_on", 0) != 0;
    }

    private boolean isConnected(org.telegram.messenger.c cVar) {
        return ConnectionsManager.getInstance(cVar.a).getConnectionState() == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(int i3, int i10, Object[] objArr) {
        if (i3 == hs.T1) {
            onConnectionStateUpdated(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1() {
        onConnectionStateUpdated(true);
    }

    private boolean onConnectionStateUpdated(boolean z10) {
        if (this.released || !(z10 || isConnected(this.accountInstance) || isAirplaneMode())) {
            return false;
        }
        hp s12 = hp.s1(this.accountInstance.a);
        TLRPC.User a22 = s12.a2(Long.valueOf(this.userId));
        if (a22 != null) {
            TLRPC.UserFull b22 = s12.b2(a22.id);
            n1.m(a22, this.video, b22 != null && b22.video_calls_available, this.activity, b22, this.accountInstance);
        } else if (isAirplaneMode()) {
            n1.m(null, this.video, false, this.activity, null, this.accountInstance);
        }
        release();
        return true;
    }

    public static VoIPPendingCall startOrSchedule(Activity activity, long j10, boolean z10, org.telegram.messenger.c cVar) {
        return new VoIPPendingCall(activity, j10, z10, 1000L, cVar);
    }

    public void release() {
        if (this.released) {
            return;
        }
        hs hsVar = this.notificationCenter;
        if (hsVar != null) {
            hsVar.n(this.observer, hs.T1);
        }
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacks(this.releaseRunnable);
        }
        this.released = true;
    }
}
