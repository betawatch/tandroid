package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.gs;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.t3;
import org.telegram.messenger.u3;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fn0;
import org.telegram.ui.Components.ik;
import org.telegram.ui.Components.me;
import org.telegram.ui.Components.rh;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.f40;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class j1 implements wi.l, gs {
    public static j1 w;
    public wi.n a;
    public TLRPC.GroupCallParticipant c;
    public boolean d;
    public t0 e;
    public i1 f;
    public h1 h;
    public final int r;
    public long s;
    public final g1 b = new g1(this);
    public final ik n = new ik(this, 23);

    public j1(int i7) {
        this.r = i7;
        ls.f(i7).b(this, ls.w2);
        ls.f(i7).b(this, ls.B2);
    }

    public static t3 g() {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        t3 t3Var = sharedInstance != null ? sharedInstance.groupCall : null;
        if (sharedInstance == null || t3Var == null || (groupCall = t3Var.b) == null || !groupCall.rtmp_stream || sharedInstance.isHangingUp()) {
            return null;
        }
        return t3Var;
    }

    public static boolean j() {
        wi.n nVar;
        j1 j1Var = w;
        return (j1Var == null || (nVar = j1Var.a) == null || !nVar.e()) ? false : true;
    }

    public static void k(Activity activity) {
        wi.o g10;
        if (g() == null) {
            return;
        }
        if (w == null) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            w = new j1(sharedInstance != null ? sharedInstance.getAccount() : k10.t0);
        }
        j1 j1Var = w;
        wi.n nVar = j1Var.a;
        if (nVar == null || !nVar.d()) {
            j1Var.a = l2.i.d().k(j1Var);
        }
        wi.n nVar2 = j1Var.a;
        if (nVar2.c == 0 && (g10 = nVar2.g(activity, null, true)) != null) {
            t0 t0Var = new t0(g10);
            j1Var.e = t0Var;
            j1Var.b.a = t0Var;
            j1Var.a();
            j1Var.s = SystemClock.elapsedRealtime();
            ik ikVar = j1Var.n;
            org.telegram.messenger.g0.r(ikVar);
            org.telegram.messenger.g0.h3(ikVar, 700L);
            f40 f40Var = f40.C5;
            if (f40Var != null) {
                f40Var.dismiss();
            }
            org.telegram.messenger.g0.g3(new me(19));
        }
    }

    public static void n(boolean z10) {
        f40 f40Var = f40.C5;
        if (f40Var == null || f40Var.getWindow() == null) {
            return;
        }
        f40Var.getWindow().getDecorView().setVisibility(z10 ? 4 : 0);
    }

    public static void o() {
        if (g() != null) {
            if (w == null) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                w = new j1(sharedInstance != null ? sharedInstance.getAccount() : k10.t0);
            }
            j1 j1Var = w;
            wi.n nVar = j1Var.a;
            if (nVar == null || !nVar.d()) {
                j1Var.a = l2.i.d().k(j1Var);
            }
            w.a();
            w.a.c();
            return;
        }
        j1 j1Var2 = w;
        if (j1Var2 != null) {
            w = null;
            int i7 = j1Var2.r;
            ls.f(i7).n(j1Var2, ls.w2);
            ls.f(i7).n(j1Var2, ls.B2);
            wi.n nVar2 = j1Var2.a;
            if (nVar2 != null) {
                j1Var2.a = null;
                nVar2.f();
            }
            j1Var2.m();
        }
    }

    @Override // wi.l
    public final void B(View view) {
        n(true);
    }

    @Override // wi.l
    public final void D(SurfaceTexture surfaceTexture) {
        t0 t0Var = this.e;
        this.e = null;
        this.b.a = null;
        a();
        if (t0Var != null) {
            t0Var.a();
        }
        surfaceTexture.release();
    }

    @Override // wi.l
    public final /* synthetic */ View E() {
        return null;
    }

    @Override // wi.l
    public final boolean G() {
        f40 f40Var = f40.C5;
        return f40Var != null && f40.D5 && f40Var.v1();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032 A[RETURN] */
    @Override // wi.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int J() {
        float f10;
        if (this.b.c > 0) {
            return this.b.c;
        }
        t3 g10 = g();
        if (g10 != null) {
            ArrayList arrayList = g10.f;
            if (!arrayList.isEmpty()) {
                f10 = ((u3) arrayList.get(0)).c;
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
    public final /* synthetic */ boolean O() {
        return false;
    }

    @Override // wi.l
    public final /* synthetic */ e2.c1 Q() {
        return null;
    }

    @Override // wi.l
    public final /* synthetic */ boolean S() {
        return false;
    }

    @Override // wi.l
    public final void U() {
        this.a = null;
        if (this.f != null) {
            n(false);
        }
        m();
        org.telegram.messenger.g0.g3(new me(19));
        org.telegram.messenger.g0.g3(new me(18));
    }

    @Override // wi.l
    public final /* synthetic */ boolean V(boolean z10, float f10, fn0 fn0Var) {
        return false;
    }

    @Override // wi.l
    public final void X(View view) {
        i1 i1Var = (i1) view;
        this.f = i1Var;
        if (!i1Var.b) {
            i1Var.b = true;
            org.telegram.messenger.g0.h3(i1Var.e, 500L);
        }
        i1Var.a();
        this.b.b = this.f.a.d;
        a();
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
        if (f40.C5 == null) {
            f40.f1(launchActivity, org.telegram.messenger.c.a(sharedInstance.getAccount()), null, null, false, null);
        }
        if (this.a == null) {
            return;
        }
        t0 t0Var = this.e;
        this.e = null;
        this.b.a = null;
        this.a.a(new rh(11, this, t0Var));
        org.telegram.messenger.g0.g3(new me(19));
    }

    public final void a() {
        TLRPC.GroupCallParticipant groupCallParticipant;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        t3 g10 = g();
        boolean z10 = false;
        if (!((this.b.a == null && this.b.b == null) ? false : true) || g10 == null || g10.f.isEmpty()) {
            groupCallParticipant = null;
        } else {
            u3 u3Var = (u3) g10.f.get(0);
            groupCallParticipant = u3Var.a;
            z10 = u3Var.b;
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
        if (org.telegram.messenger.s2.a) {
            a8.b("rtmp pip: " + sb3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[RETURN] */
    @Override // wi.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a0() {
        float f10;
        if (this.b.d > 0) {
            return this.b.d;
        }
        t3 g10 = g();
        if (g10 != null) {
            ArrayList arrayList = g10.f;
            if (!arrayList.isEmpty()) {
                f10 = ((u3) arrayList.get(0)).c;
                return f10 <= 0.0f ? 1000 : 9;
            }
        }
        f10 = 0.0f;
        if (f10 <= 0.0f) {
        }
    }

    @Override // wi.l
    public final float b0() {
        return 0.0f;
    }

    @Override // wi.l
    public final void d(View view) {
        n(false);
        i1 i1Var = this.f;
        if (view == i1Var) {
            i1Var.b = false;
            org.telegram.messenger.g0.r(i1Var.e);
            this.f = null;
            this.b.b = null;
            a();
        }
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ls.w2 || i7 == ls.B2) {
            a();
            i1 i1Var = this.f;
            if (i1Var != null) {
                i1Var.a();
            }
        }
    }

    @Override // wi.l
    public final int e() {
        return 10;
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
    public final void i(wi.o oVar) {
        t0 t0Var = new t0(oVar);
        this.e = t0Var;
        this.b.a = t0Var;
        a();
        this.s = SystemClock.elapsedRealtime();
        ik ikVar = this.n;
        org.telegram.messenger.g0.r(ikVar);
        org.telegram.messenger.g0.h3(ikVar, 700L);
    }

    @Override // wi.l
    public final long l() {
        return 0L;
    }

    public final void m() {
        org.telegram.messenger.g0.r(this.n);
        h1 h1Var = this.h;
        if (h1Var != null) {
            h1Var.a.R();
            VideoFrame videoFrame = h1Var.b;
            if (videoFrame != null) {
                videoFrame.release();
                h1Var.b = null;
            }
            this.h = null;
        }
        this.b.a = null;
        this.b.b = null;
        t0 t0Var = this.e;
        if (t0Var != null) {
            t0Var.a();
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
    public final boolean o0() {
        return false;
    }

    @Override // wi.l
    public final /* synthetic */ boolean p() {
        return true;
    }

    @Override // wi.l
    public final /* synthetic */ boolean s() {
        return false;
    }

    @Override // wi.l
    public final void u(Rect rect) {
        rect.setEmpty();
    }

    @Override // wi.l
    public final View v(LaunchActivity launchActivity) {
        return new i1(this, launchActivity);
    }

    @Override // wi.l
    public final void w(View view) {
        if (view == this.f) {
            n(false);
        }
        i1 i1Var = this.f;
        if (view == i1Var) {
            i1Var.b = false;
            org.telegram.messenger.g0.r(i1Var.e);
            this.f = null;
            this.b.b = null;
            a();
        }
        i1 i1Var2 = (i1) view;
        i1Var2.b = false;
        org.telegram.messenger.g0.r(i1Var2.e);
        i1Var2.a.d.release();
    }

    @Override // wi.l
    public final /* synthetic */ void L(float f10) {
    }

    @Override // wi.l
    public final void c(long j3) {
    }

    @Override // wi.l
    public final /* synthetic */ void p0(int i7) {
    }

    @Override // wi.l
    public final /* synthetic */ void H() {
    }

    @Override // wi.l
    public final void b() {
    }

    @Override // wi.l
    public final void f() {
    }

    @Override // wi.l
    public final /* synthetic */ void h0(int i7, ArrayList arrayList) {
    }

    @Override // wi.l
    public final /* synthetic */ void j0(Canvas canvas, int i7, int i10) {
    }
}
