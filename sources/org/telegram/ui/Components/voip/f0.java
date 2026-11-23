package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.view.View;
import c8.nd;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.fj;
import org.telegram.messenger.t3;
import org.telegram.messenger.u3;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.ne;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.a20;
import org.telegram.ui.e40;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class f0 implements wi.l {
    public static f0 e;
    public wi.n a;
    public b0 b;
    public float c;
    public String d;

    public static ArrayList a(long j3, t3 t3Var) {
        a20 a20Var;
        ArrayList arrayList = t3Var.f;
        ArrayList arrayList2 = new ArrayList();
        e40 e40Var = e40.C5;
        u3 u3Var = null;
        if (e40Var != null && (a20Var = e40Var.Z3) != null && a20Var.b) {
            u3Var = a20Var.e;
        }
        if (u3Var != null && d(t3Var, u3Var, j3)) {
            arrayList2.add(u3Var);
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            u3 u3Var2 = (u3) arrayList.get(i7);
            if (u3Var2 != u3Var && d(t3Var, u3Var2, j3)) {
                arrayList2.add(u3Var2);
            }
        }
        return arrayList2;
    }

    public static boolean d(t3 t3Var, u3 u3Var, long j3) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        if (u3Var == t3Var.z || (groupCallParticipant = u3Var.a) == null || groupCallParticipant.self) {
            return false;
        }
        long B1 = fj.B1(groupCallParticipant.peer);
        if (B1 == j3 || t3Var.d.f(B1) == null) {
            return false;
        }
        return ((u3Var.b ? u3Var.a.presentation : u3Var.a.video) == null || e(u3Var) == null) ? false : true;
    }

    public static String e(u3 u3Var) {
        boolean z10 = u3Var.b;
        TLRPC.GroupCallParticipant groupCallParticipant = u3Var.a;
        return z10 ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint;
    }

    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public static void g() {
        wi.n nVar;
        f0 f0Var = e;
        if (f0Var == null || (nVar = f0Var.a) == null || !nVar.d()) {
            return;
        }
        org.telegram.ui.Components.a20 a20Var = org.telegram.ui.Components.a20.f0;
        wi.n nVar2 = e.a;
        boolean z10 = false;
        ?? r42 = a20Var != null ? 1 : 0;
        if (a20Var != null && a20Var.r) {
            z10 = true;
        }
        int i7 = nVar2.c;
        if (i7 == 3) {
            return;
        }
        nVar2.f = r42;
        nVar2.g = z10;
        if (i7 == 2) {
            nVar2.d = r42;
        } else {
            nVar2.c = r42;
        }
        nVar2.b.f();
    }

    public static void h() {
        k1.k();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || sharedInstance.groupCall == null || sharedInstance.isHangingUp()) {
            f0 f0Var = e;
            if (f0Var != null) {
                e = null;
                wi.n nVar = f0Var.a;
                if (nVar != null) {
                    f0Var.a = null;
                    nVar.f();
                    return;
                }
                return;
            }
            return;
        }
        if (e == null) {
            f0 f0Var2 = new f0();
            f0Var2.c = 1.0f;
            e = f0Var2;
        }
        wi.n nVar2 = e.a;
        if (nVar2 == null || !nVar2.d()) {
            e.a = l2.j.d().j(e);
            g();
        }
        f0 f0Var3 = e;
        if (f0Var3.b == null) {
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            VoIPService sharedInstance3 = VoIPService.getSharedInstance();
            t3 t3Var = sharedInstance3 != null ? sharedInstance3.groupCall : null;
            if (sharedInstance2 != null && t3Var != null) {
                ArrayList a10 = a(sharedInstance2.getSelfId(), t3Var);
                int max = Math.max(1, a10.size());
                float[] fArr = new float[max];
                float[] fArr2 = new float[max];
                Arrays.fill(fArr2, 1.0f);
                StringBuilder sb2 = new StringBuilder();
                for (int i7 = 0; i7 < a10.size(); i7++) {
                    u3 u3Var = (u3) a10.get(i7);
                    float f10 = u3Var.c;
                    if (f10 <= 0.0f) {
                        f10 = 0.0f;
                    }
                    fArr[i7] = f10;
                    fArr2[i7] = u3Var.b ? 2.0f : 1.0f;
                    sb2.append(e(u3Var));
                    sb2.append(':');
                    sb2.append(Math.round(fArr[i7] * 100.0f));
                    sb2.append(';');
                }
                String sb3 = sb2.toString();
                if (!sb3.equals(f0Var3.d)) {
                    f0Var3.d = sb3;
                    f0Var3.c = nd.a(fArr, fArr2, 0.45f, 2.35f, null, 0.0f).a;
                }
            }
        }
        e.a.c();
    }

    @Override // wi.l
    public final /* synthetic */ boolean A1(boolean z10, float f10, en0 en0Var) {
        return false;
    }

    @Override // wi.l
    public final /* synthetic */ boolean C2() {
        return true;
    }

    @Override // wi.l
    public final void D1(View view) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z10 = false;
        if (sharedInstance != null && sharedInstance.getVideoState(false) != 0) {
            z10 = true;
        }
        g.a = z10;
        this.b = (b0) view;
        e40 e40Var = e40.C5;
        if (e40Var != null) {
            e40Var.y1();
            if (e40Var.getWindow() != null) {
                e40Var.getWindow().getDecorView().setVisibility(4);
            }
        }
        b0 b0Var = this.b;
        if (!b0Var.w) {
            b0Var.w = true;
            b0Var.x = SystemClock.elapsedRealtime();
            VoIPService.getSharedInstance();
            b0Var.H = g.c();
            b0Var.f.a();
            b0Var.j(true);
            org.telegram.messenger.g0.h3(b0Var.J, 250L);
        }
        org.telegram.ui.Components.a20.k(view.getContext());
    }

    @Override // wi.l
    public final void D2(int i7) {
        g.b(i7, true);
        org.telegram.messenger.g0.h3(new ne(17), 300L);
    }

    @Override // wi.l
    public final void E0(SurfaceTexture surfaceTexture) {
        surfaceTexture.release();
    }

    @Override // wi.l
    public final /* synthetic */ View K0() {
        return null;
    }

    @Override // wi.l
    public final boolean O0() {
        return e40.C5 != null && e40.D5;
    }

    @Override // wi.l
    public final int V1() {
        return 1000;
    }

    @Override // wi.l
    public final int b1() {
        b0 b0Var = this.b;
        return Math.round((b0Var != null ? b0Var.n : this.c) * 1000.0f);
    }

    @Override // wi.l
    public final float d2() {
        return 0.0f;
    }

    @Override // wi.l
    public final boolean f0() {
        return true;
    }

    @Override // wi.l
    public final long getDuration() {
        return 0L;
    }

    @Override // wi.l
    public final boolean h1() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        VoIPService sharedInstance2 = VoIPService.getSharedInstance();
        t3 t3Var = sharedInstance2 != null ? sharedInstance2.groupCall : null;
        if (sharedInstance == null || t3Var == null || sharedInstance.isHangingUp() || t3Var.j()) {
            return false;
        }
        TLRPC.GroupCall groupCall = t3Var.b;
        return groupCall == null || !groupCall.rtmp_stream;
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
        g.a = false;
        ((b0) view).i();
        b0 b0Var = this.b;
        if (b0Var == view) {
            this.c = b0Var.n;
            this.b = null;
        }
        e40 e40Var = e40.C5;
        if (e40Var != null) {
            if (e40Var.getWindow() != null) {
                e40Var.getWindow().getDecorView().setVisibility(0);
            }
            e40Var.z1();
        }
        org.telegram.ui.Components.a20.k(view.getContext());
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
    public final void n2(int i7, ArrayList arrayList) {
        g.a(i7, arrayList, true);
    }

    @Override // wi.l
    public final boolean o1() {
        return true;
    }

    @Override // wi.l
    public final void v1() {
        this.a = null;
        e40 e40Var = e40.C5;
        if (e40Var != null && e40Var.getWindow() != null) {
            e40Var.getWindow().getDecorView().setVisibility(0);
        }
        org.telegram.messenger.g0.g3(new ne(17));
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
        return new b0(this, launchActivity);
    }

    @Override // wi.l
    public final void z0(View view) {
        ((b0) view).i();
        if (this.b == view) {
            this.b = null;
        }
    }

    @Override // wi.l
    public final /* synthetic */ void B0(View view) {
    }

    @Override // wi.l
    public final void I(wi.o oVar) {
    }

    @Override // wi.l
    public final void c(long j3) {
    }

    @Override // wi.l
    public final /* synthetic */ void d1(float f10) {
    }

    @Override // wi.l
    public final void P1() {
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
    public final /* synthetic */ void t2(Canvas canvas, int i7, int i10) {
    }
}
