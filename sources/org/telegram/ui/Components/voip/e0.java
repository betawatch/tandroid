package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.view.View;
import c8.jc;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.ij;
import org.telegram.messenger.r3;
import org.telegram.messenger.s3;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.q10;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.vs;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.b20;
import org.telegram.ui.e40;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class e0 implements ti.m {
    public static e0 e;
    public ti.o a;
    public a0 b;
    public float c;
    public String d;

    public static ArrayList a(long j3, r3 r3Var) {
        b20 b20Var;
        ArrayList arrayList = r3Var.f;
        ArrayList arrayList2 = new ArrayList();
        e40 e40Var = e40.u5;
        s3 s3Var = null;
        if (e40Var != null && (b20Var = e40Var.R3) != null && b20Var.b) {
            s3Var = b20Var.e;
        }
        if (s3Var != null && d(r3Var, s3Var, j3)) {
            arrayList2.add(s3Var);
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            s3 s3Var2 = (s3) arrayList.get(i7);
            if (s3Var2 != s3Var && d(r3Var, s3Var2, j3)) {
                arrayList2.add(s3Var2);
            }
        }
        return arrayList2;
    }

    public static boolean d(r3 r3Var, s3 s3Var, long j3) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        if (s3Var == r3Var.z || (groupCallParticipant = s3Var.a) == null || groupCallParticipant.self) {
            return false;
        }
        long B1 = ij.B1(groupCallParticipant.peer);
        if (B1 == j3 || r3Var.d.f(B1) == null) {
            return false;
        }
        return ((s3Var.b ? s3Var.a.presentation : s3Var.a.video) == null || i(s3Var) == null) ? false : true;
    }

    public static String i(s3 s3Var) {
        boolean z9 = s3Var.b;
        TLRPC.GroupCallParticipant groupCallParticipant = s3Var.a;
        return z9 ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint;
    }

    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public static void k() {
        ti.o oVar;
        e0 e0Var = e;
        if (e0Var == null || (oVar = e0Var.a) == null || !oVar.d()) {
            return;
        }
        q10 q10Var = q10.e0;
        ti.o oVar2 = e.a;
        boolean z9 = false;
        ?? r42 = q10Var != null ? 1 : 0;
        if (q10Var != null && q10Var.r) {
            z9 = true;
        }
        int i7 = oVar2.c;
        if (i7 == 3) {
            return;
        }
        oVar2.f = r42;
        oVar2.g = z9;
        if (i7 == 2) {
            oVar2.d = r42;
        } else {
            oVar2.c = r42;
        }
        oVar2.b.f();
    }

    public static void m() {
        g1.o();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || sharedInstance.groupCall == null || sharedInstance.isHangingUp()) {
            e0 e0Var = e;
            if (e0Var != null) {
                e = null;
                ti.o oVar = e0Var.a;
                if (oVar != null) {
                    e0Var.a = null;
                    oVar.f();
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
        ti.o oVar2 = e.a;
        if (oVar2 == null || !oVar2.d()) {
            e.a = l2.i.d().k(e);
            k();
        }
        e0 e0Var3 = e;
        if (e0Var3.b == null) {
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            VoIPService sharedInstance3 = VoIPService.getSharedInstance();
            r3 r3Var = sharedInstance3 != null ? sharedInstance3.groupCall : null;
            if (sharedInstance2 != null && r3Var != null) {
                ArrayList a10 = a(sharedInstance2.getSelfId(), r3Var);
                int max = Math.max(1, a10.size());
                float[] fArr = new float[max];
                float[] fArr2 = new float[max];
                Arrays.fill(fArr2, 1.0f);
                StringBuilder sb2 = new StringBuilder();
                for (int i7 = 0; i7 < a10.size(); i7++) {
                    s3 s3Var = (s3) a10.get(i7);
                    float f10 = s3Var.c;
                    if (f10 <= 0.0f) {
                        f10 = 0.0f;
                    }
                    fArr[i7] = f10;
                    fArr2[i7] = s3Var.b ? 2.0f : 1.0f;
                    sb2.append(i(s3Var));
                    sb2.append(':');
                    sb2.append(Math.round(fArr[i7] * 100.0f));
                    sb2.append(';');
                }
                String sb3 = sb2.toString();
                if (!sb3.equals(e0Var3.d)) {
                    e0Var3.d = sb3;
                    e0Var3.c = jc.a(fArr, fArr2, 0.45f, 2.35f, null, 0.0f).a;
                }
            }
        }
        e.a.c();
    }

    @Override // ti.m
    public final void C(SurfaceTexture surfaceTexture) {
        surfaceTexture.release();
    }

    @Override // ti.m
    public final /* synthetic */ View D() {
        return null;
    }

    @Override // ti.m
    public final boolean E() {
        return e40.u5 != null && e40.v5;
    }

    @Override // ti.m
    public final int I() {
        a0 a0Var = this.b;
        return Math.round((a0Var != null ? a0Var.n : this.c) * 1000.0f);
    }

    @Override // ti.m
    public final boolean K() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        VoIPService sharedInstance2 = VoIPService.getSharedInstance();
        r3 r3Var = sharedInstance2 != null ? sharedInstance2.groupCall : null;
        if (sharedInstance == null || r3Var == null || sharedInstance.isHangingUp() || r3Var.j()) {
            return false;
        }
        TLRPC.GroupCall groupCall = r3Var.b;
        return groupCall == null || !groupCall.rtmp_stream;
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
    public final boolean P() {
        return true;
    }

    @Override // ti.m
    public final void Q() {
        this.a = null;
        e40 e40Var = e40.u5;
        if (e40Var != null && e40Var.getWindow() != null) {
            e40Var.getWindow().getDecorView().setVisibility(0);
        }
        org.telegram.messenger.g0.h3(new vs(11));
    }

    @Override // ti.m
    public final /* synthetic */ boolean R(boolean z9, float f10, rm0 rm0Var) {
        return false;
    }

    @Override // ti.m
    public final void S(View view) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z9 = false;
        if (sharedInstance != null && sharedInstance.getVideoState(false) != 0) {
            z9 = true;
        }
        g.a = z9;
        this.b = (a0) view;
        e40 e40Var = e40.u5;
        if (e40Var != null) {
            e40Var.x1();
            if (e40Var.getWindow() != null) {
                e40Var.getWindow().getDecorView().setVisibility(4);
            }
        }
        a0 a0Var = this.b;
        if (!a0Var.w) {
            a0Var.w = true;
            a0Var.x = SystemClock.elapsedRealtime();
            VoIPService.getSharedInstance();
            a0Var.G = g.c();
            a0Var.f.a();
            a0Var.j(true);
            org.telegram.messenger.g0.i3(a0Var.I, 250L);
        }
        q10.k(view.getContext());
    }

    @Override // ti.m
    public final int U() {
        return 1000;
    }

    @Override // ti.m
    public final float V() {
        return 0.0f;
    }

    @Override // ti.m
    public final void Z(int i7, ArrayList arrayList) {
        g.a(i7, arrayList, true);
    }

    @Override // ti.m
    public final void e(View view) {
        g.a = false;
        ((a0) view).i();
        a0 a0Var = this.b;
        if (a0Var == view) {
            this.c = a0Var.n;
            this.b = null;
        }
        e40 e40Var = e40.u5;
        if (e40Var != null) {
            if (e40Var.getWindow() != null) {
                e40Var.getWindow().getDecorView().setVisibility(0);
            }
            e40Var.y1();
        }
        q10.k(view.getContext());
    }

    @Override // ti.m
    public final /* synthetic */ boolean e0() {
        return true;
    }

    @Override // ti.m
    public final void f0(int i7) {
        g.b(i7, true);
        org.telegram.messenger.g0.i3(new vs(11), 300L);
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

    @Override // ti.m
    public final boolean r() {
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
        return new a0(this, launchActivity);
    }

    @Override // ti.m
    public final void y(View view) {
        ((a0) view).i();
        if (this.b == view) {
            this.b = null;
        }
    }

    @Override // ti.m
    public final /* synthetic */ void B(View view) {
    }

    @Override // ti.m
    public final /* synthetic */ void J(float f10) {
    }

    @Override // ti.m
    public final void c(long j3) {
    }

    @Override // ti.m
    public final void g(ti.p pVar) {
    }

    @Override // ti.m
    public final /* synthetic */ void F() {
    }

    @Override // ti.m
    public final void T() {
    }

    @Override // ti.m
    public final void b() {
    }

    @Override // ti.m
    public final void f() {
    }

    @Override // ti.m
    public final /* synthetic */ void c0(Canvas canvas, int i7, int i10) {
    }
}
