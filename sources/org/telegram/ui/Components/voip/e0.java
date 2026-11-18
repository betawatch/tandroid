package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.view.View;
import c8.md;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.fj;
import org.telegram.messenger.t3;
import org.telegram.messenger.u3;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cn0;
import org.telegram.ui.Components.me;
import org.telegram.ui.Components.z10;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.b20;
import org.telegram.ui.f40;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class e0 implements wi.l {
    public static e0 e;
    public wi.n a;
    public a0 b;
    public float c;
    public String d;

    public static ArrayList a(long j3, t3 t3Var) {
        b20 b20Var;
        ArrayList arrayList = t3Var.f;
        ArrayList arrayList2 = new ArrayList();
        f40 f40Var = f40.C5;
        u3 u3Var = null;
        if (f40Var != null && (b20Var = f40Var.Z3) != null && b20Var.b) {
            u3Var = b20Var.e;
        }
        if (u3Var != null && g(t3Var, u3Var, j3)) {
            arrayList2.add(u3Var);
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            u3 u3Var2 = (u3) arrayList.get(i7);
            if (u3Var2 != u3Var && g(t3Var, u3Var2, j3)) {
                arrayList2.add(u3Var2);
            }
        }
        return arrayList2;
    }

    public static boolean g(t3 t3Var, u3 u3Var, long j3) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        if (u3Var == t3Var.z || (groupCallParticipant = u3Var.a) == null || groupCallParticipant.self) {
            return false;
        }
        long B1 = fj.B1(groupCallParticipant.peer);
        if (B1 == j3 || t3Var.d.f(B1) == null) {
            return false;
        }
        return ((u3Var.b ? u3Var.a.presentation : u3Var.a.video) == null || j(u3Var) == null) ? false : true;
    }

    public static String j(u3 u3Var) {
        boolean z10 = u3Var.b;
        TLRPC.GroupCallParticipant groupCallParticipant = u3Var.a;
        return z10 ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint;
    }

    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public static void k() {
        wi.n nVar;
        e0 e0Var = e;
        if (e0Var == null || (nVar = e0Var.a) == null || !nVar.d()) {
            return;
        }
        z10 z10Var = z10.f0;
        wi.n nVar2 = e.a;
        boolean z10 = false;
        ?? r42 = z10Var != null ? 1 : 0;
        if (z10Var != null && z10Var.r) {
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

    public static void m() {
        j1.o();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || sharedInstance.groupCall == null || sharedInstance.isHangingUp()) {
            e0 e0Var = e;
            if (e0Var != null) {
                e = null;
                wi.n nVar = e0Var.a;
                if (nVar != null) {
                    e0Var.a = null;
                    nVar.f();
                    return;
                }
                return;
            }
            return;
        }
        if (e == null) {
            e0 e0Var2 = new e0();
            e0Var2.c = 1.0f;
            e = e0Var2;
        }
        wi.n nVar2 = e.a;
        if (nVar2 == null || !nVar2.d()) {
            e.a = l2.i.d().k(e);
            k();
        }
        e0 e0Var3 = e;
        if (e0Var3.b == null) {
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
                    sb2.append(j(u3Var));
                    sb2.append(':');
                    sb2.append(Math.round(fArr[i7] * 100.0f));
                    sb2.append(';');
                }
                String sb3 = sb2.toString();
                if (!sb3.equals(e0Var3.d)) {
                    e0Var3.d = sb3;
                    e0Var3.c = md.a(fArr, fArr2, 0.45f, 2.35f, null, 0.0f).a;
                }
            }
        }
        e.a.c();
    }

    @Override // wi.l
    public final void D(SurfaceTexture surfaceTexture) {
        surfaceTexture.release();
    }

    @Override // wi.l
    public final /* synthetic */ View E() {
        return null;
    }

    @Override // wi.l
    public final boolean G() {
        return f40.C5 != null && f40.D5;
    }

    @Override // wi.l
    public final int J() {
        a0 a0Var = this.b;
        return Math.round((a0Var != null ? a0Var.n : this.c) * 1000.0f);
    }

    @Override // wi.l
    public final boolean N() {
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
    public final /* synthetic */ boolean O() {
        return false;
    }

    @Override // wi.l
    public final /* synthetic */ e2.c1 Q() {
        return null;
    }

    @Override // wi.l
    public final boolean S() {
        return true;
    }

    @Override // wi.l
    public final void U() {
        this.a = null;
        f40 f40Var = f40.C5;
        if (f40Var != null && f40Var.getWindow() != null) {
            f40Var.getWindow().getDecorView().setVisibility(0);
        }
        org.telegram.messenger.g0.g3(new me(17));
    }

    @Override // wi.l
    public final /* synthetic */ boolean V(boolean z10, float f10, cn0 cn0Var) {
        return false;
    }

    @Override // wi.l
    public final void X(View view) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z10 = false;
        if (sharedInstance != null && sharedInstance.getVideoState(false) != 0) {
            z10 = true;
        }
        g.a = z10;
        this.b = (a0) view;
        f40 f40Var = f40.C5;
        if (f40Var != null) {
            f40Var.y1();
            if (f40Var.getWindow() != null) {
                f40Var.getWindow().getDecorView().setVisibility(4);
            }
        }
        a0 a0Var = this.b;
        if (!a0Var.w) {
            a0Var.w = true;
            a0Var.x = SystemClock.elapsedRealtime();
            VoIPService.getSharedInstance();
            a0Var.H = g.c();
            a0Var.f.a();
            a0Var.j(true);
            org.telegram.messenger.g0.h3(a0Var.J, 250L);
        }
        z10.k(view.getContext());
    }

    @Override // wi.l
    public final int a0() {
        return 1000;
    }

    @Override // wi.l
    public final float b0() {
        return 0.0f;
    }

    @Override // wi.l
    public final void d(View view) {
        g.a = false;
        ((a0) view).i();
        a0 a0Var = this.b;
        if (a0Var == view) {
            this.c = a0Var.n;
            this.b = null;
        }
        f40 f40Var = f40.C5;
        if (f40Var != null) {
            if (f40Var.getWindow() != null) {
                f40Var.getWindow().getDecorView().setVisibility(0);
            }
            f40Var.z1();
        }
        z10.k(view.getContext());
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
    public final void h0(int i7, ArrayList arrayList) {
        g.a(i7, arrayList, true);
    }

    @Override // wi.l
    public final long l() {
        return 0L;
    }

    @Override // wi.l
    public final /* synthetic */ boolean o0() {
        return true;
    }

    @Override // wi.l
    public final boolean p() {
        return true;
    }

    @Override // wi.l
    public final void p0(int i7) {
        g.b(i7, true);
        org.telegram.messenger.g0.h3(new me(17), 300L);
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
        return new a0(this, launchActivity);
    }

    @Override // wi.l
    public final void w(View view) {
        ((a0) view).i();
        if (this.b == view) {
            this.b = null;
        }
    }

    @Override // wi.l
    public final /* synthetic */ void B(View view) {
    }

    @Override // wi.l
    public final /* synthetic */ void L(float f10) {
    }

    @Override // wi.l
    public final void c(long j3) {
    }

    @Override // wi.l
    public final void i(wi.o oVar) {
    }

    @Override // wi.l
    public final /* synthetic */ void H() {
    }

    @Override // wi.l
    public final void Z() {
    }

    @Override // wi.l
    public final void b() {
    }

    @Override // wi.l
    public final void f() {
    }

    @Override // wi.l
    public final /* synthetic */ void j0(Canvas canvas, int i7, int i10) {
    }
}
