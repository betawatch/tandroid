package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.view.View;
import c8.jd;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.gj;
import org.telegram.messenger.r3;
import org.telegram.messenger.s3;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ih;
import org.telegram.ui.Components.s10;
import org.telegram.ui.Components.um0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.c40;
import org.telegram.ui.y10;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class f0 implements wi.l {
    public static f0 e;
    public wi.n a;
    public b0 b;
    public float c;
    public String d;

    public static ArrayList e(long j3, r3 r3Var) {
        y10 y10Var;
        ArrayList arrayList = r3Var.f;
        ArrayList arrayList2 = new ArrayList();
        c40 c40Var = c40.C5;
        s3 s3Var = null;
        if (c40Var != null && (y10Var = c40Var.Z3) != null && y10Var.b) {
            s3Var = y10Var.e;
        }
        if (s3Var != null && g(r3Var, s3Var, j3)) {
            arrayList2.add(s3Var);
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            s3 s3Var2 = (s3) arrayList.get(i7);
            if (s3Var2 != s3Var && g(r3Var, s3Var2, j3)) {
                arrayList2.add(s3Var2);
            }
        }
        return arrayList2;
    }

    public static boolean g(r3 r3Var, s3 s3Var, long j3) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        if (s3Var == r3Var.z || (groupCallParticipant = s3Var.a) == null || groupCallParticipant.self) {
            return false;
        }
        long B1 = gj.B1(groupCallParticipant.peer);
        if (B1 == j3 || r3Var.d.f(B1) == null) {
            return false;
        }
        return ((s3Var.b ? s3Var.a.presentation : s3Var.a.video) == null || i(s3Var) == null) ? false : true;
    }

    public static String i(s3 s3Var) {
        boolean z10 = s3Var.b;
        TLRPC.GroupCallParticipant groupCallParticipant = s3Var.a;
        return z10 ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint;
    }

    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public static void k() {
        wi.n nVar;
        f0 f0Var = e;
        if (f0Var == null || (nVar = f0Var.a) == null || !nVar.d()) {
            return;
        }
        s10 s10Var = s10.f0;
        wi.n nVar2 = e.a;
        boolean z10 = false;
        ?? r42 = s10Var != null ? 1 : 0;
        if (s10Var != null && s10Var.r) {
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
        k1.o();
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
            e.a = l2.i.d().k(e);
            k();
        }
        f0 f0Var3 = e;
        if (f0Var3.b == null) {
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            VoIPService sharedInstance3 = VoIPService.getSharedInstance();
            r3 r3Var = sharedInstance3 != null ? sharedInstance3.groupCall : null;
            if (sharedInstance2 != null && r3Var != null) {
                ArrayList e10 = e(sharedInstance2.getSelfId(), r3Var);
                int max = Math.max(1, e10.size());
                float[] fArr = new float[max];
                float[] fArr2 = new float[max];
                Arrays.fill(fArr2, 1.0f);
                StringBuilder sb2 = new StringBuilder();
                for (int i7 = 0; i7 < e10.size(); i7++) {
                    s3 s3Var = (s3) e10.get(i7);
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
                if (!sb3.equals(f0Var3.d)) {
                    f0Var3.d = sb3;
                    f0Var3.c = jd.a(fArr, fArr2, 0.45f, 2.35f, null, 0.0f).a;
                }
            }
        }
        e.a.c();
    }

    @Override // wi.l
    public final void C(SurfaceTexture surfaceTexture) {
        surfaceTexture.release();
    }

    @Override // wi.l
    public final /* synthetic */ View D() {
        return null;
    }

    @Override // wi.l
    public final boolean F() {
        return c40.C5 != null && c40.D5;
    }

    @Override // wi.l
    public final int L() {
        b0 b0Var = this.b;
        return Math.round((b0Var != null ? b0Var.n : this.c) * 1000.0f);
    }

    @Override // wi.l
    public final boolean N() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        VoIPService sharedInstance2 = VoIPService.getSharedInstance();
        r3 r3Var = sharedInstance2 != null ? sharedInstance2.groupCall : null;
        if (sharedInstance == null || r3Var == null || sharedInstance.isHangingUp() || r3Var.j()) {
            return false;
        }
        TLRPC.GroupCall groupCall = r3Var.b;
        return groupCall == null || !groupCall.rtmp_stream;
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
    public final boolean T() {
        return true;
    }

    @Override // wi.l
    public final void V() {
        this.a = null;
        c40 c40Var = c40.C5;
        if (c40Var != null && c40Var.getWindow() != null) {
            c40Var.getWindow().getDecorView().setVisibility(0);
        }
        org.telegram.messenger.g0.h3(new ih(15));
    }

    @Override // wi.l
    public final /* synthetic */ boolean X(boolean z10, float f10, um0 um0Var) {
        return false;
    }

    @Override // wi.l
    public final void Y(View view) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z10 = false;
        if (sharedInstance != null && sharedInstance.getVideoState(false) != 0) {
            z10 = true;
        }
        g.a = z10;
        this.b = (b0) view;
        c40 c40Var = c40.C5;
        if (c40Var != null) {
            c40Var.x1();
            if (c40Var.getWindow() != null) {
                c40Var.getWindow().getDecorView().setVisibility(4);
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
            org.telegram.messenger.g0.i3(b0Var.J, 250L);
        }
        s10.k(view.getContext());
    }

    @Override // wi.l
    public final void a(View view) {
        g.a = false;
        ((b0) view).i();
        b0 b0Var = this.b;
        if (b0Var == view) {
            this.c = b0Var.n;
            this.b = null;
        }
        c40 c40Var = c40.C5;
        if (c40Var != null) {
            if (c40Var.getWindow() != null) {
                c40Var.getWindow().getDecorView().setVisibility(0);
            }
            c40Var.y1();
        }
        s10.k(view.getContext());
    }

    @Override // wi.l
    public final int b0() {
        return 1000;
    }

    @Override // wi.l
    public final float c0() {
        return 0.0f;
    }

    @Override // wi.l
    public final int d() {
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
    public final void j0(int i7, ArrayList arrayList) {
        g.a(i7, arrayList, true);
    }

    @Override // wi.l
    public final long l() {
        return 0L;
    }

    @Override // wi.l
    public final boolean p() {
        return true;
    }

    @Override // wi.l
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // wi.l
    public final /* synthetic */ boolean t0() {
        return true;
    }

    @Override // wi.l
    public final void u(Rect rect) {
        rect.setEmpty();
    }

    @Override // wi.l
    public final void u0(int i7) {
        g.b(i7, true);
        org.telegram.messenger.g0.i3(new ih(15), 300L);
    }

    @Override // wi.l
    public final View w(LaunchActivity launchActivity) {
        return new b0(this, launchActivity);
    }

    @Override // wi.l
    public final void x(View view) {
        ((b0) view).i();
        if (this.b == view) {
            this.b = null;
        }
    }

    @Override // wi.l
    public final /* synthetic */ void A(View view) {
    }

    @Override // wi.l
    public final /* synthetic */ void M(float f10) {
    }

    @Override // wi.l
    public final void c(long j3) {
    }

    @Override // wi.l
    public final void j(wi.o oVar) {
    }

    @Override // wi.l
    public final /* synthetic */ void G() {
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
    public final /* synthetic */ void o0(Canvas canvas, int i7, int i10) {
    }
}
