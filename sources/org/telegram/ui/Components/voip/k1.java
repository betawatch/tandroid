package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.fs;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.t3;
import org.telegram.messenger.u3;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.ne;
import org.telegram.ui.Components.ph;
import org.telegram.ui.Components.rc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.e40;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class k1 implements wi.l, fs {
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
    public final rc n = new rc(this, 26);

    public k1(int i7) {
        this.r = i7;
        ks.f(i7).b(this, ks.w2);
        ks.f(i7).b(this, ks.B2);
    }

    public static t3 d() {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        t3 t3Var = sharedInstance != null ? sharedInstance.groupCall : null;
        if (sharedInstance == null || t3Var == null || (groupCall = t3Var.b) == null || !groupCall.rtmp_stream || sharedInstance.isHangingUp()) {
            return null;
        }
        return t3Var;
    }

    public static boolean e() {
        wi.n nVar;
        k1 k1Var = w;
        return (k1Var == null || (nVar = k1Var.a) == null || !nVar.e()) ? false : true;
    }

    public static void g(Activity activity) {
        wi.o g10;
        if (d() == null) {
            return;
        }
        if (w == null) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            w = new k1(sharedInstance != null ? sharedInstance.getAccount() : i10.t0);
        }
        k1 k1Var = w;
        wi.n nVar = k1Var.a;
        if (nVar == null || !nVar.d()) {
            k1Var.a = l2.j.d().j(k1Var);
        }
        wi.n nVar2 = k1Var.a;
        if (nVar2.c == 0 && (g10 = nVar2.g(activity, null, true)) != null) {
            u0 u0Var = new u0(g10);
            k1Var.e = u0Var;
            k1Var.b.a = u0Var;
            k1Var.a();
            k1Var.s = SystemClock.elapsedRealtime();
            rc rcVar = k1Var.n;
            org.telegram.messenger.g0.r(rcVar);
            org.telegram.messenger.g0.h3(rcVar, 700L);
            e40 e40Var = e40.C5;
            if (e40Var != null) {
                e40Var.dismiss();
            }
            org.telegram.messenger.g0.g3(new ne(19));
        }
    }

    public static void i(boolean z10) {
        e40 e40Var = e40.C5;
        if (e40Var == null || e40Var.getWindow() == null) {
            return;
        }
        e40Var.getWindow().getDecorView().setVisibility(z10 ? 4 : 0);
    }

    public static void k() {
        if (d() != null) {
            if (w == null) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                w = new k1(sharedInstance != null ? sharedInstance.getAccount() : i10.t0);
            }
            k1 k1Var = w;
            wi.n nVar = k1Var.a;
            if (nVar == null || !nVar.d()) {
                k1Var.a = l2.j.d().j(k1Var);
            }
            w.a();
            w.a.c();
            return;
        }
        k1 k1Var2 = w;
        if (k1Var2 != null) {
            w = null;
            int i7 = k1Var2.r;
            ks.f(i7).n(k1Var2, ks.w2);
            ks.f(i7).n(k1Var2, ks.B2);
            wi.n nVar2 = k1Var2.a;
            if (nVar2 != null) {
                k1Var2.a = null;
                nVar2.f();
            }
            k1Var2.h();
        }
    }

    @Override // wi.l
    public final /* synthetic */ boolean A1(boolean z10, float f10, en0 en0Var) {
        return false;
    }

    @Override // wi.l
    public final void B0(View view) {
        i(true);
    }

    @Override // wi.l
    public final boolean C2() {
        return false;
    }

    @Override // wi.l
    public final void D1(View view) {
        j1 j1Var = (j1) view;
        this.f = j1Var;
        if (!j1Var.b) {
            j1Var.b = true;
            org.telegram.messenger.g0.h3(j1Var.e, 500L);
        }
        j1Var.a();
        this.b.b = this.f.a.d;
        a();
    }

    @Override // wi.l
    public final void E0(SurfaceTexture surfaceTexture) {
        u0 u0Var = this.e;
        this.e = null;
        this.b.a = null;
        a();
        if (u0Var != null) {
            u0Var.a();
        }
        surfaceTexture.release();
    }

    @Override // wi.l
    public final void I(wi.o oVar) {
        u0 u0Var = new u0(oVar);
        this.e = u0Var;
        this.b.a = u0Var;
        a();
        this.s = SystemClock.elapsedRealtime();
        rc rcVar = this.n;
        org.telegram.messenger.g0.r(rcVar);
        org.telegram.messenger.g0.h3(rcVar, 700L);
    }

    @Override // wi.l
    public final /* synthetic */ View K0() {
        return null;
    }

    @Override // wi.l
    public final boolean O0() {
        e40 e40Var = e40.C5;
        return e40Var != null && e40.D5 && e40Var.v1();
    }

    @Override // wi.l
    public final void P1() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (sharedInstance == null || launchActivity == null || d() == null) {
            wi.n nVar = this.a;
            if (nVar != null) {
                nVar.b();
                return;
            }
            return;
        }
        if (e40.C5 == null) {
            e40.f1(launchActivity, org.telegram.messenger.c.a(sharedInstance.getAccount()), null, null, false, null);
        }
        if (this.a == null) {
            return;
        }
        u0 u0Var = this.e;
        this.e = null;
        this.b.a = null;
        this.a.a(new ph(12, this, u0Var));
        org.telegram.messenger.g0.g3(new ne(19));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[RETURN] */
    @Override // wi.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int V1() {
        float f10;
        if (this.b.d > 0) {
            return this.b.d;
        }
        t3 d = d();
        if (d != null) {
            ArrayList arrayList = d.f;
            if (!arrayList.isEmpty()) {
                f10 = ((u3) arrayList.get(0)).c;
                return f10 <= 0.0f ? 1000 : 9;
            }
        }
        f10 = 0.0f;
        if (f10 <= 0.0f) {
        }
    }

    public final void a() {
        TLRPC.GroupCallParticipant groupCallParticipant;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        t3 d = d();
        boolean z10 = false;
        if (!((this.b.a == null && this.b.b == null) ? false : true) || d == null || d.f.isEmpty()) {
            groupCallParticipant = null;
        } else {
            u3 u3Var = (u3) d.f.get(0);
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

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032 A[RETURN] */
    @Override // wi.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b1() {
        float f10;
        if (this.b.c > 0) {
            return this.b.c;
        }
        t3 d = d();
        if (d != null) {
            ArrayList arrayList = d.f;
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
    public final float d2() {
        return 0.0f;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.w2 || i7 == ks.B2) {
            a();
            j1 j1Var = this.f;
            if (j1Var != null) {
                j1Var.a();
            }
        }
    }

    @Override // wi.l
    public final /* synthetic */ boolean f0() {
        return true;
    }

    @Override // wi.l
    public final long getDuration() {
        return 0L;
    }

    public final void h() {
        org.telegram.messenger.g0.r(this.n);
        i1 i1Var = this.h;
        if (i1Var != null) {
            i1Var.a.S();
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
    public final boolean h1() {
        return d() != null;
    }

    @Override // wi.l
    public final /* synthetic */ boolean i1() {
        return false;
    }

    @Override // wi.l
    public final boolean j() {
        return true;
    }

    @Override // wi.l
    public final void l(View view) {
        i(false);
        j1 j1Var = this.f;
        if (view == j1Var) {
            j1Var.b = false;
            org.telegram.messenger.g0.r(j1Var.e);
            this.f = null;
            this.b.b = null;
            a();
        }
    }

    @Override // wi.l
    public final /* synthetic */ boolean l0() {
        return false;
    }

    @Override // wi.l
    public final long n() {
        return 0L;
    }

    @Override // wi.l
    public final /* synthetic */ e2.c1 n1() {
        return null;
    }

    @Override // wi.l
    public final /* synthetic */ boolean o1() {
        return false;
    }

    @Override // wi.l
    public final void v1() {
        this.a = null;
        if (this.f != null) {
            i(false);
        }
        h();
        org.telegram.messenger.g0.g3(new ne(19));
        org.telegram.messenger.g0.g3(new ne(18));
    }

    @Override // wi.l
    public final void w0(Rect rect) {
        rect.setEmpty();
    }

    @Override // wi.l
    public final int y() {
        return 10;
    }

    @Override // wi.l
    public final View y0(LaunchActivity launchActivity) {
        return new j1(this, launchActivity);
    }

    @Override // wi.l
    public final void z0(View view) {
        if (view == this.f) {
            i(false);
        }
        j1 j1Var = this.f;
        if (view == j1Var) {
            j1Var.b = false;
            org.telegram.messenger.g0.r(j1Var.e);
            this.f = null;
            this.b.b = null;
            a();
        }
        j1 j1Var2 = (j1) view;
        j1Var2.b = false;
        org.telegram.messenger.g0.r(j1Var2.e);
        j1Var2.a.d.release();
    }

    @Override // wi.l
    public final /* synthetic */ void D2(int i7) {
    }

    @Override // wi.l
    public final void c(long j3) {
    }

    @Override // wi.l
    public final /* synthetic */ void d1(float f10) {
    }

    @Override // wi.l
    public final /* synthetic */ void T0() {
    }

    @Override // wi.l
    public final void b() {
    }

    @Override // wi.l
    public final void f() {
    }

    @Override // wi.l
    public final /* synthetic */ void n2(int i7, ArrayList arrayList) {
    }

    @Override // wi.l
    public final /* synthetic */ void t2(Canvas canvas, int i7, int i10) {
    }
}
