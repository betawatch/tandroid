package org.telegram.messenger.voip;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import org.telegram.messenger.at;
import org.telegram.messenger.e20;
import org.telegram.messenger.vs;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.voip.n1;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class VoIPPendingCall {
    private org.telegram.messenger.c accountInstance;
    private final Activity activity;
    private Handler handler;
    private at notificationCenter;
    private final vs observer;
    private final Runnable releaseRunnable;
    private boolean released;
    private final long userId;
    private final boolean video;

    private VoIPPendingCall(Activity activity, long j10, boolean z10, long j11, org.telegram.messenger.c cVar) {
        vs vsVar = new vs() { // from class: org.telegram.messenger.voip.r
            @Override // org.telegram.messenger.vs
            public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
                VoIPPendingCall.this.lambda$new$0(i10, i11, objArr);
            }
        };
        this.observer = vsVar;
        v0 v0Var = new v0(this, 2);
        this.releaseRunnable = v0Var;
        this.activity = activity;
        this.userId = j10;
        this.video = z10;
        this.accountInstance = cVar;
        if (onConnectionStateUpdated(false)) {
            return;
        }
        at f7 = at.f(e20.s0);
        this.notificationCenter = f7;
        f7.b(vsVar, at.T1);
        Handler handler = new Handler(Looper.myLooper());
        this.handler = handler;
        handler.postDelayed(v0Var, j11);
    }

    private boolean isAirplaneMode() {
        return Settings.System.getInt(this.activity.getContentResolver(), "airplane_mode_on", 0) != 0;
    }

    private boolean isConnected(org.telegram.messenger.c cVar) {
        return ConnectionsManager.getInstance(cVar.a).getConnectionState() == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(int i10, int i11, Object[] objArr) {
        if (i10 == at.T1) {
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
        wp r12 = wp.r1(this.accountInstance.a);
        TLRPC.User Z1 = r12.Z1(Long.valueOf(this.userId));
        if (Z1 != null) {
            TLRPC.UserFull a2 = r12.a2(Z1.id);
            n1.m(Z1, this.video, a2 != null && a2.video_calls_available, this.activity, a2, this.accountInstance);
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
        at atVar = this.notificationCenter;
        if (atVar != null) {
            atVar.n(this.observer, at.T1);
        }
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacks(this.releaseRunnable);
        }
        this.released = true;
    }
}
