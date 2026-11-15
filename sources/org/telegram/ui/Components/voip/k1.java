package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.ns;
import org.telegram.messenger.r3;
import org.telegram.messenger.s3;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.ih;
import org.telegram.ui.Components.um0;
import org.telegram.ui.Components.zj;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.c40;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class k1 implements wi.l, is {
    public static k1 w;
    public wi.n a;
    public TLRPC.GroupCallParticipant c;
    public boolean d;
    public u0 e;
    public j1 f;
    public i1 h;
    public final int r;
    public long s;
    public final h1 b = new h1(this);
    public final zj n = new zj(this, 23);

    public k1(int i7) {
        this.r = i7;
        ns.f(i7).b(this, ns.w2);
        ns.f(i7).b(this, ns.B2);
    }

    public static r3 g() {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        r3 r3Var = sharedInstance != null ? sharedInstance.groupCall : null;
        if (sharedInstance == null || r3Var == null || (groupCall = r3Var.b) == null || !groupCall.rtmp_stream || sharedInstance.isHangingUp()) {
            return null;
        }
        return r3Var;
    }

    public static boolean i() {
        wi.n nVar;
        k1 k1Var = w;
        return (k1Var == null || (nVar = k1Var.a) == null || !nVar.e()) ? false : true;
    }

    public static void k(Activity activity) {
        wi.o g10;
        if (g() == null) {
            return;
        }
        if (w == null) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            w = new k1(sharedInstance != null ? sharedInstance.getAccount() : m10.t0);
        }
        k1 k1Var = w;
        wi.n nVar = k1Var.a;
        if (nVar == null || !nVar.d()) {
            k1Var.a = l2.i.d().k(k1Var);
        }
        wi.n nVar2 = k1Var.a;
        if (nVar2.c == 0 && (g10 = nVar2.g(activity, null, true)) != null) {
            u0 u0Var = new u0(g10);
            k1Var.e = u0Var;
            k1Var.b.a = u0Var;
            k1Var.e();
            k1Var.s = SystemClock.elapsedRealtime();
            zj zjVar = k1Var.n;
            org.telegram.messenger.g0.r(zjVar);
            org.telegram.messenger.g0.i3(zjVar, 700L);
            c40 c40Var = c40.C5;
            if (c40Var != null) {
                c40Var.dismiss();
            }
            org.telegram.messenger.g0.h3(new ih(17));
        }
    }

    public static void n(boolean z10) {
        c40 c40Var = c40.C5;
        if (c40Var == null || c40Var.getWindow() == null) {
            return;
        }
        c40Var.getWindow().getDecorView().setVisibility(z10 ? 4 : 0);
    }

    public static void o() {
        if (g() != null) {
            if (w == null) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                w = new k1(sharedInstance != null ? sharedInstance.getAccount() : m10.t0);
            }
            k1 k1Var = w;
            wi.n nVar = k1Var.a;
            if (nVar == null || !nVar.d()) {
                k1Var.a = l2.i.d().k(k1Var);
            }
            w.e();
            w.a.c();
            return;
        }
        k1 k1Var2 = w;
        if (k1Var2 != null) {
            w = null;
            int i7 = k1Var2.r;
            ns.f(i7).n(k1Var2, ns.w2);
            ns.f(i7).n(k1Var2, ns.B2);
            wi.n nVar2 = k1Var2.a;
            if (nVar2 != null) {
                k1Var2.a = null;
                nVar2.f();
            }
            k1Var2.m();
        }
    }

    @Override // wi.l
    public final void A(View view) {
        n(true);
    }

    @Override // wi.l
    public final void C(SurfaceTexture surfaceTexture) {
        u0 u0Var = this.e;
        this.e = null;
        this.b.a = null;
        e();
        if (u0Var != null) {
            u0Var.a();
        }
        surfaceTexture.release();
    }

    @Override // wi.l
    public final /* synthetic */ View D() {
        return null;
    }

    @Override // wi.l
    public final boolean F() {
        c40 c40Var = c40.C5;
        return c40Var != null && c40.D5 && c40Var.u1();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032 A[RETURN] */
    @Override // wi.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int L() {
        float f10;
        if (this.b.c > 0) {
            return this.b.c;
        }
        r3 g10 = g();
        if (g10 != null) {
            ArrayList arrayList = g10.f;
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

    @Override // wi.l
    public final boolean N() {
        return g() != null;
    }

    @Override // wi.l
    public final /* synthetic */ boolean P() {
        return false;
    }

    @Override // wi.l
    public final /* synthetic */ e2.c1 R() {
        return null;
    }

    @Override // wi.l
    public final /* synthetic */ boolean T() {
        return false;
    }

    @Override // wi.l
    public final void V() {
        this.a = null;
        if (this.f != null) {
            n(false);
        }
        m();
        org.telegram.messenger.g0.h3(new ih(17));
        org.telegram.messenger.g0.h3(new ih(16));
    }

    @Override // wi.l
    public final /* synthetic */ boolean X(boolean z10, float f10, um0 um0Var) {
        return false;
    }

    @Override // wi.l
    public final void Y(View view) {
        j1 j1Var = (j1) view;
        this.f = j1Var;
        if (!j1Var.b) {
            j1Var.b = true;
            org.telegram.messenger.g0.i3(j1Var.e, 500L);
        }
        j1Var.a();
        this.b.b = this.f.a.d;
        e();
    }

    @Override // wi.l
    public final void Z() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (sharedInstance == null || launchActivity == null || g() == null) {
            wi.n nVar = this.a;
            if (nVar != null) {
                nVar.b();
                return;
            }
            return;
        }
        if (c40.C5 == null) {
            c40.e1(launchActivity, org.telegram.messenger.c.a(sharedInstance.getAccount()), null, null, false, null);
        }
        if (this.a == null) {
            return;
        }
        u0 u0Var = this.e;
        this.e = null;
        this.b.a = null;
        this.a.a(new gh(12, this, u0Var));
        org.telegram.messenger.g0.h3(new ih(17));
    }

    @Override // wi.l
    public final void a(View view) {
        n(false);
        j1 j1Var = this.f;
        if (view == j1Var) {
            j1Var.b = false;
            org.telegram.messenger.g0.r(j1Var.e);
            this.f = null;
            this.b.b = null;
            e();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[RETURN] */
    @Override // wi.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b0() {
        float f10;
        if (this.b.d > 0) {
            return this.b.d;
        }
        r3 g10 = g();
        if (g10 != null) {
            ArrayList arrayList = g10.f;
            if (!arrayList.isEmpty()) {
                f10 = ((s3) arrayList.get(0)).c;
                return f10 <= 0.0f ? 1000 : 9;
            }
        }
        f10 = 0.0f;
        if (f10 <= 0.0f) {
        }
    }

    @Override // wi.l
    public final float c0() {
        return 0.0f;
    }

    @Override // wi.l
    public final int d() {
        return 10;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.w2 || i7 == ns.B2) {
            e();
            j1 j1Var = this.f;
            if (j1Var != null) {
                j1Var.a();
            }
        }
    }

    public final void e() {
        TLRPC.GroupCallParticipant groupCallParticipant;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        r3 g10 = g();
        boolean z10 = false;
        if (!((this.b.a == null && this.b.b == null) ? false : true) || g10 == null || g10.f.isEmpty()) {
            groupCallParticipant = null;
        } else {
            s3 s3Var = (s3) g10.f.get(0);
            groupCallParticipant = s3Var.a;
            z10 = s3Var.b;
        }
        TLRPC.GroupCallParticipant groupCallParticipant2 = this.c;
        if (groupCallParticipant == groupCallParticipant2 && z10 == this.d) {
            return;
        }
        if (groupCallParticipant2 != null) {
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 != null) {
                sharedInstance2.removeExtraRemoteSink(this.c, this.d, this.b);
            }
            this.c = null;
        }
        if (groupCallParticipant == null || sharedInstance == null || !sharedInstance.addExtraRemoteSink(groupCallParticipant, z10, this.b)) {
            return;
        }
        this.c = groupCallParticipant;
        this.d = z10;
        StringBuilder sb2 = new StringBuilder("bound ");
        sb2.append(z10 ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint);
        String sb3 = sb2.toString();
        if (org.telegram.messenger.r2.a) {
            a8.b("rtmp pip: " + sb3);
        }
    }

    @Override // wi.l
    public final long getDuration() {
        return 0L;
    }

    @Override // wi.l
    public final boolean h() {
        return true;
    }

    @Override // wi.l
    public final void j(wi.o oVar) {
        u0 u0Var = new u0(oVar);
        this.e = u0Var;
        this.b.a = u0Var;
        e();
        this.s = SystemClock.elapsedRealtime();
        zj zjVar = this.n;
        org.telegram.messenger.g0.r(zjVar);
        org.telegram.messenger.g0.i3(zjVar, 700L);
    }

    @Override // wi.l
    public final long l() {
        return 0L;
    }

    public final void m() {
        org.telegram.messenger.g0.r(this.n);
        i1 i1Var = this.h;
        if (i1Var != null) {
            i1Var.a.R();
            VideoFrame videoFrame = i1Var.b;
            if (videoFrame != null) {
                videoFrame.release();
                i1Var.b = null;
            }
            this.h = null;
        }
        this.b.a = null;
        this.b.b = null;
        u0 u0Var = this.e;
        if (u0Var != null) {
            u0Var.a();
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

    @Override // wi.l
    public final /* synthetic */ boolean p() {
        return true;
    }

    @Override // wi.l
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // wi.l
    public final boolean t0() {
        return false;
    }

    @Override // wi.l
    public final void u(Rect rect) {
        rect.setEmpty();
    }

    @Override // wi.l
    public final View w(LaunchActivity launchActivity) {
        return new j1(this, launchActivity);
    }

    @Override // wi.l
    public final void x(View view) {
        if (view == this.f) {
            n(false);
        }
        j1 j1Var = this.f;
        if (view == j1Var) {
            j1Var.b = false;
            org.telegram.messenger.g0.r(j1Var.e);
            this.f = null;
            this.b.b = null;
            e();
        }
        j1 j1Var2 = (j1) view;
        j1Var2.b = false;
        org.telegram.messenger.g0.r(j1Var2.e);
        j1Var2.a.d.release();
    }

    @Override // wi.l
    public final /* synthetic */ void M(float f10) {
    }

    @Override // wi.l
    public final void c(long j3) {
    }

    @Override // wi.l
    public final /* synthetic */ void u0(int i7) {
    }

    @Override // wi.l
    public final /* synthetic */ void G() {
    }

    @Override // wi.l
    public final void b() {
    }

    @Override // wi.l
    public final void f() {
    }

    @Override // wi.l
    public final /* synthetic */ void j0(int i7, ArrayList arrayList) {
    }

    @Override // wi.l
    public final /* synthetic */ void o0(Canvas canvas, int i7, int i10) {
    }
}
