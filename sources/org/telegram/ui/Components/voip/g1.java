package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.messenger.r3;
import org.telegram.messenger.s3;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dt;
import org.telegram.ui.Components.ex;
import org.telegram.ui.Components.l10;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.c40;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class g1 implements ti.m, ls {
    public static g1 w;
    public ti.o a;
    public TLRPC.GroupCallParticipant c;
    public boolean d;
    public q0 e;
    public f1 f;
    public e1 h;
    public final int r;
    public long s;
    public final d1 b = new d1(this);
    public final dt n = new dt(this, 20);

    public g1(int i7) {
        this.r = i7;
        qs.f(i7).b(this, qs.w2);
        qs.f(i7).b(this, qs.B2);
    }

    public static r3 d() {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        r3 r3Var = sharedInstance != null ? sharedInstance.groupCall : null;
        if (sharedInstance == null || r3Var == null || (groupCall = r3Var.b) == null || !groupCall.rtmp_stream || sharedInstance.isHangingUp()) {
            return null;
        }
        return r3Var;
    }

    public static boolean i() {
        ti.o oVar;
        g1 g1Var = w;
        return (g1Var == null || (oVar = g1Var.a) == null || !oVar.e()) ? false : true;
    }

    public static void k(Activity activity) {
        ti.q g10;
        if (d() == null) {
            return;
        }
        if (w == null) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            w = new g1(sharedInstance != null ? sharedInstance.getAccount() : p10.s0);
        }
        g1 g1Var = w;
        ti.o oVar = g1Var.a;
        if (oVar == null || !oVar.d()) {
            g1Var.a = l2.i.d().k(g1Var);
        }
        ti.o oVar2 = g1Var.a;
        if (oVar2.c == 0 && (g10 = oVar2.g(activity, null, true)) != null) {
            q0 q0Var = new q0(g10);
            g1Var.e = q0Var;
            g1Var.b.a = q0Var;
            g1Var.a();
            g1Var.s = SystemClock.elapsedRealtime();
            dt dtVar = g1Var.n;
            org.telegram.messenger.g0.r(dtVar);
            org.telegram.messenger.g0.i3(dtVar, 700L);
            c40 c40Var = c40.u5;
            if (c40Var != null) {
                c40Var.dismiss();
            }
            org.telegram.messenger.g0.h3(new l10(11));
        }
    }

    public static void n(boolean z9) {
        c40 c40Var = c40.u5;
        if (c40Var == null || c40Var.getWindow() == null) {
            return;
        }
        c40Var.getWindow().getDecorView().setVisibility(z9 ? 4 : 0);
    }

    public static void o() {
        if (d() != null) {
            if (w == null) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                w = new g1(sharedInstance != null ? sharedInstance.getAccount() : p10.s0);
            }
            g1 g1Var = w;
            ti.o oVar = g1Var.a;
            if (oVar == null || !oVar.d()) {
                g1Var.a = l2.i.d().k(g1Var);
            }
            w.a();
            w.a.c();
            return;
        }
        g1 g1Var2 = w;
        if (g1Var2 != null) {
            w = null;
            int i7 = g1Var2.r;
            qs.f(i7).n(g1Var2, qs.w2);
            qs.f(i7).n(g1Var2, qs.B2);
            ti.o oVar2 = g1Var2.a;
            if (oVar2 != null) {
                g1Var2.a = null;
                oVar2.f();
            }
            g1Var2.m();
        }
    }

    @Override // ti.m
    public final void B(View view) {
        n(true);
    }

    @Override // ti.m
    public final void C(SurfaceTexture surfaceTexture) {
        q0 q0Var = this.e;
        this.e = null;
        this.b.a = null;
        a();
        if (q0Var != null) {
            q0Var.a();
        }
        surfaceTexture.release();
    }

    @Override // ti.m
    public final /* synthetic */ View D() {
        return null;
    }

    @Override // ti.m
    public final boolean E() {
        c40 c40Var = c40.u5;
        return c40Var != null && c40.v5 && c40Var.u1();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032 A[RETURN] */
    @Override // ti.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int I() {
        float f10;
        if (this.b.c > 0) {
            return this.b.c;
        }
        r3 d = d();
        if (d != null) {
            ArrayList arrayList = d.f;
            if (!arrayList.isEmpty()) {
                f10 = ((s3) arrayList.get(0)).c;
                if (f10 <= 0.0f) {
                    return Math.round(f10 * 1000.0f);
                }
                return 16;
            }
        }
        f10 = 0.0f;
        if (f10 <= 0.0f) {
        }
    }

    @Override // ti.m
    public final boolean K() {
        return d() != null;
    }

    @Override // ti.m
    public final /* synthetic */ boolean L() {
        return false;
    }

    @Override // ti.m
    public final /* synthetic */ e2.c1 M() {
        return null;
    }

    @Override // ti.m
    public final /* synthetic */ boolean P() {
        return false;
    }

    @Override // ti.m
    public final void Q() {
        this.a = null;
        if (this.f != null) {
            n(false);
        }
        m();
        org.telegram.messenger.g0.h3(new l10(11));
        org.telegram.messenger.g0.h3(new l10(10));
    }

    @Override // ti.m
    public final /* synthetic */ boolean R(boolean z9, float f10, qm0 qm0Var) {
        return false;
    }

    @Override // ti.m
    public final void S(View view) {
        f1 f1Var = (f1) view;
        this.f = f1Var;
        if (!f1Var.b) {
            f1Var.b = true;
            org.telegram.messenger.g0.i3(f1Var.e, 500L);
        }
        f1Var.a();
        this.b.b = this.f.a.d;
        a();
    }

    @Override // ti.m
    public final void T() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (sharedInstance == null || launchActivity == null || d() == null) {
            ti.o oVar = this.a;
            if (oVar != null) {
                oVar.b();
                return;
            }
            return;
        }
        if (c40.u5 == null) {
            c40.e1(launchActivity, org.telegram.messenger.c.a(sharedInstance.getAccount()), null, null, false, null);
        }
        if (this.a == null) {
            return;
        }
        q0 q0Var = this.e;
        this.e = null;
        this.b.a = null;
        this.a.a(new ex(7, this, q0Var));
        org.telegram.messenger.g0.h3(new l10(11));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[RETURN] */
    @Override // ti.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int U() {
        float f10;
        if (this.b.d > 0) {
            return this.b.d;
        }
        r3 d = d();
        if (d != null) {
            ArrayList arrayList = d.f;
            if (!arrayList.isEmpty()) {
                f10 = ((s3) arrayList.get(0)).c;
                return f10 <= 0.0f ? 1000 : 9;
            }
        }
        f10 = 0.0f;
        if (f10 <= 0.0f) {
        }
    }

    @Override // ti.m
    public final float V() {
        return 0.0f;
    }

    public final void a() {
        TLRPC.GroupCallParticipant groupCallParticipant;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        r3 d = d();
        boolean z9 = false;
        if (!((this.b.a == null && this.b.b == null) ? false : true) || d == null || d.f.isEmpty()) {
            groupCallParticipant = null;
        } else {
            s3 s3Var = (s3) d.f.get(0);
            groupCallParticipant = s3Var.a;
            z9 = s3Var.b;
        }
        TLRPC.GroupCallParticipant groupCallParticipant2 = this.c;
        if (groupCallParticipant == groupCallParticipant2 && z9 == this.d) {
            return;
        }
        if (groupCallParticipant2 != null) {
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 != null) {
                sharedInstance2.removeExtraRemoteSink(this.c, this.d, this.b);
            }
            this.c = null;
        }
        if (groupCallParticipant == null || sharedInstance == null || !sharedInstance.addExtraRemoteSink(groupCallParticipant, z9, this.b)) {
            return;
        }
        this.c = groupCallParticipant;
        this.d = z9;
        StringBuilder sb2 = new StringBuilder("bound ");
        sb2.append(z9 ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint);
        String sb3 = sb2.toString();
        if (org.telegram.messenger.r2.a) {
            a8.b("rtmp pip: " + sb3);
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.w2 || i7 == qs.B2) {
            a();
            f1 f1Var = this.f;
            if (f1Var != null) {
                f1Var.a();
            }
        }
    }

    @Override // ti.m
    public final void e(View view) {
        n(false);
        f1 f1Var = this.f;
        if (view == f1Var) {
            f1Var.b = false;
            org.telegram.messenger.g0.r(f1Var.e);
            this.f = null;
            this.b.b = null;
            a();
        }
    }

    @Override // ti.m
    public final boolean e0() {
        return false;
    }

    @Override // ti.m
    public final void g(ti.q qVar) {
        q0 q0Var = new q0(qVar);
        this.e = q0Var;
        this.b.a = q0Var;
        a();
        this.s = SystemClock.elapsedRealtime();
        dt dtVar = this.n;
        org.telegram.messenger.g0.r(dtVar);
        org.telegram.messenger.g0.i3(dtVar, 700L);
    }

    @Override // ti.m
    public final long getDuration() {
        return 0L;
    }

    @Override // ti.m
    public final boolean h() {
        return true;
    }

    @Override // ti.m
    public final int j() {
        return 10;
    }

    @Override // ti.m
    public final long l() {
        return 0L;
    }

    public final void m() {
        org.telegram.messenger.g0.r(this.n);
        e1 e1Var = this.h;
        if (e1Var != null) {
            e1Var.a.R();
            VideoFrame videoFrame = e1Var.b;
            if (videoFrame != null) {
                videoFrame.release();
                e1Var.b = null;
            }
            this.h = null;
        }
        this.b.a = null;
        this.b.b = null;
        q0 q0Var = this.e;
        if (q0Var != null) {
            q0Var.a();
            this.e = null;
        }
        if (this.c != null) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                sharedInstance.removeExtraRemoteSink(this.c, this.d, this.b);
            }
            this.c = null;
        }
    }

    @Override // ti.m
    public final /* synthetic */ boolean r() {
        return true;
    }

    @Override // ti.m
    public final /* synthetic */ boolean u() {
        return false;
    }

    @Override // ti.m
    public final void v(Rect rect) {
        rect.setEmpty();
    }

    @Override // ti.m
    public final View x(LaunchActivity launchActivity) {
        return new f1(this, launchActivity);
    }

    @Override // ti.m
    public final void y(View view) {
        if (view == this.f) {
            n(false);
        }
        f1 f1Var = this.f;
        if (view == f1Var) {
            f1Var.b = false;
            org.telegram.messenger.g0.r(f1Var.e);
            this.f = null;
            this.b.b = null;
            a();
        }
        f1 f1Var2 = (f1) view;
        f1Var2.b = false;
        org.telegram.messenger.g0.r(f1Var2.e);
        f1Var2.a.d.release();
    }

    @Override // ti.m
    public final /* synthetic */ void J(float f10) {
    }

    @Override // ti.m
    public final void c(long j3) {
    }

    @Override // ti.m
    public final /* synthetic */ void f0(int i7) {
    }

    @Override // ti.m
    public final /* synthetic */ void F() {
    }

    @Override // ti.m
    public final void b() {
    }

    @Override // ti.m
    public final void f() {
    }

    @Override // ti.m
    public final /* synthetic */ void Z(int i7, ArrayList arrayList) {
    }

    @Override // ti.m
    public final /* synthetic */ void c0(Canvas canvas, int i7, int i10) {
    }
}
