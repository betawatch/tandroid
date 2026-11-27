// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class cb5 implements je8 {
    public static cb5 e;
    public me8 a;
    public za5 b;
    public float c;
    public String d;

    public static ArrayList a(long j, vc2 vc2Var) {
        g75 g75Var;
        ArrayList arrayList = vc2Var.f;
        ArrayList arrayList2 = new ArrayList();
        j95 j95Var = j95.s5;
        wc2 wc2Var = null;
        if (j95Var != null && (g75Var = j95Var.T3) != null && g75Var.b) {
            wc2Var = g75Var.e;
        }
        if (wc2Var != null && c(vc2Var, wc2Var, j)) {
            arrayList2.add(wc2Var);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            wc2 wc2Var2 = (wc2) arrayList.get(i);
            if (wc2Var2 != wc2Var && c(vc2Var, wc2Var2, j)) {
                arrayList2.add(wc2Var2);
            }
        }
        return arrayList2;
    }

    public static boolean c(vc2 vc2Var, wc2 wc2Var, long j) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        if (wc2Var == vc2Var.z || (groupCallParticipant = wc2Var.a) == null || groupCallParticipant.self) {
            return false;
        }
        long B1 = r47.B1(groupCallParticipant.peer);
        if (B1 == j || vc2Var.d.f(B1) == null) {
            return false;
        }
        boolean z = wc2Var.b;
        TLRPC.GroupCallParticipant groupCallParticipant2 = wc2Var.a;
        if ((z ? groupCallParticipant2.presentation : groupCallParticipant2.video) != null) {
            return (z ? groupCallParticipant2.presentationEndpoint : groupCallParticipant2.videoEndpoint) != null;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public static void d() {
        me8 me8Var;
        cb5 cb5Var = e;
        if (cb5Var == null || (me8Var = cb5Var.a) == null || !me8Var.f()) {
            return;
        }
        ra5 ra5Var = ra5.f0;
        me8 me8Var2 = e.a;
        boolean z = false;
        ?? r4 = ra5Var != null ? 1 : 0;
        if (ra5Var != null && ra5Var.r) {
            z = true;
        }
        byte b = me8Var2.c;
        if (b != 3) {
            me8Var2.g = r4;
            me8Var2.h = z;
            if (b == 2) {
                me8Var2.d = r4;
            } else {
                me8Var2.c = r4;
            }
            me8Var2.b.d();
        }
    }

    public static void e() {
        ir9.m();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || sharedInstance.groupCall == null || sharedInstance.isHangingUp()) {
            cb5 cb5Var = e;
            if (cb5Var != null) {
                e = null;
                me8 me8Var = cb5Var.a;
                if (me8Var != null) {
                    cb5Var.a = null;
                    me8Var.h();
                    return;
                }
                return;
            }
            return;
        }
        cb5 cb5Var2 = e;
        if (cb5Var2 == null) {
            cb5Var2 = new cb5();
            cb5Var2.c = 1.0f;
            e = cb5Var2;
        }
        me8 me8Var2 = cb5Var2.a;
        if (me8Var2 == null || !me8Var2.f()) {
            e.a = fc3.b().k(e);
            d();
        }
        cb5 cb5Var3 = e;
        if (cb5Var3.b == null) {
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            VoIPService sharedInstance3 = VoIPService.getSharedInstance();
            vc2 vc2Var = sharedInstance3 != null ? sharedInstance3.groupCall : null;
            if (sharedInstance2 != null && vc2Var != null) {
                ArrayList a = a(sharedInstance2.getSelfId(), vc2Var);
                int max = Math.max(1, a.size());
                float[] fArr = new float[max];
                float[] fArr2 = new float[max];
                Arrays.fill(fArr2, 1.0f);
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < a.size(); i++) {
                    wc2 wc2Var = (wc2) a.get(i);
                    float f = wc2Var.c;
                    if (f <= 0.0f) {
                        f = 0.0f;
                    }
                    fArr[i] = f;
                    boolean z = wc2Var.b;
                    fArr2[i] = z ? 2.0f : 1.0f;
                    TLRPC.GroupCallParticipant groupCallParticipant = wc2Var.a;
                    sb.append(z ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint);
                    sb.append(':');
                    sb.append(Math.round(fArr[i] * 100.0f));
                    sb.append(';');
                }
                String sb2 = sb.toString();
                if (!sb2.equals(cb5Var3.d)) {
                    cb5Var3.d = sb2;
                    cb5Var3.c = xte.a(fArr, fArr2, 0.45f, 2.35f, null, 0.0f).a;
                }
            }
        }
        e.a.e();
    }

    @Override // je8
    public final boolean A0() {
        return true;
    }

    @Override // je8
    public final boolean E() {
        return true;
    }

    @Override // je8
    public final boolean E0() {
        return true;
    }

    @Override // je8
    public final boolean G(boolean z, float f, cz9 cz9Var) {
        return false;
    }

    @Override // je8
    public final void G0(int i) {
        k91.b(i, true);
        hl.d3(new jm3((byte) 16), 300L);
    }

    @Override // je8
    public final boolean H() {
        return false;
    }

    @Override // je8
    public final void J(Rect rect) {
        rect.setEmpty();
    }

    @Override // je8
    public final View K(LaunchActivity launchActivity) {
        return new za5(this, launchActivity);
    }

    @Override // je8
    public final void L(View view) {
        ((za5) view).h();
        if (this.b == view) {
            this.b = null;
        }
    }

    @Override // je8
    public final View P() {
        return null;
    }

    @Override // je8
    public final boolean Q() {
        return j95.s5 != null && j95.t5;
    }

    @Override // je8
    public final int S() {
        return 0;
    }

    @Override // je8
    public final int U() {
        za5 za5Var = this.b;
        return Math.round((za5Var != null ? za5Var.n : this.c) * 1000.0f);
    }

    @Override // je8
    public final boolean X() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        VoIPService sharedInstance2 = VoIPService.getSharedInstance();
        vc2 vc2Var = sharedInstance2 != null ? sharedInstance2.groupCall : null;
        if (sharedInstance == null || vc2Var == null || sharedInstance.isHangingUp() || vc2Var.k()) {
            return false;
        }
        TLRPC.GroupCall groupCall = vc2Var.b;
        return groupCall == null || !groupCall.rtmp_stream;
    }

    @Override // je8
    public final boolean Y() {
        return false;
    }

    @Override // je8
    public final dg8 a0() {
        return null;
    }

    @Override // je8
    public final boolean d0() {
        return true;
    }

    @Override // je8
    public final void g0() {
        this.a = null;
        j95 j95Var = j95.s5;
        if (j95Var != null && j95Var.getWindow() != null) {
            j95Var.getWindow().getDecorView().setVisibility(0);
        }
        hl.c3(new jm3((byte) 16));
    }

    @Override // je8
    public final long getDuration() {
        return 0L;
    }

    @Override // je8
    public final boolean i() {
        return true;
    }

    @Override // je8
    public final long k() {
        return 0L;
    }

    @Override // je8
    public final void l(View view) {
        k91.a = false;
        ((za5) view).h();
        za5 za5Var = this.b;
        if (za5Var == view) {
            this.c = za5Var.n;
            this.b = null;
        }
        j95 j95Var = j95.s5;
        if (j95Var != null) {
            if (j95Var.getWindow() != null) {
                j95Var.getWindow().getDecorView().setVisibility(0);
            }
            j95Var.o1();
        }
        ra5.k(view.getContext());
    }

    @Override // je8
    public final void o0(View view) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z = false;
        if (sharedInstance != null && sharedInstance.getVideoState(false) != 0) {
            z = true;
        }
        k91.a = z;
        this.b = (za5) view;
        j95 j95Var = j95.s5;
        if (j95Var != null) {
            j95Var.n1();
            if (j95Var.getWindow() != null) {
                j95Var.getWindow().getDecorView().setVisibility(4);
            }
        }
        za5 za5Var = this.b;
        if (!za5Var.w) {
            za5Var.w = true;
            za5Var.x = SystemClock.elapsedRealtime();
            VoIPService.getSharedInstance();
            za5Var.H = k91.c();
            za5Var.f.a();
            za5Var.i(true);
            hl.d3(za5Var.J, 250L);
        }
        ra5.k(view.getContext());
    }

    @Override // je8
    public final int q() {
        return 10;
    }

    @Override // je8
    public final int q0() {
        return 1000;
    }

    @Override // je8
    public final float r0() {
        return 0.0f;
    }

    @Override // je8
    public final void s(SurfaceTexture surfaceTexture, Bitmap bitmap) {
        surfaceTexture.release();
    }

    @Override // je8
    public final void u0(int i, ArrayList arrayList) {
        k91.a(i, arrayList, true);
    }

    @Override // je8
    public final boolean v() {
        return false;
    }

    @Override // je8
    public final void T() {
    }

    @Override // je8
    public final void b() {
    }

    @Override // je8
    public final void j() {
    }

    @Override // je8
    public final void p0() {
    }

    @Override // je8
    public final void N(View view) {
    }

    @Override // je8
    public final void R(ne8 ne8Var) {
    }

    @Override // je8
    public final void V(float f) {
    }

    @Override // je8
    public final void g(long j) {
    }

    @Override // je8
    public final void v0(Canvas canvas, int i, int i2) {
    }
}
