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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class a95 implements sa8 {
    public static a95 e;
    public xa8 a;
    public w85 b;
    public float c;
    public String d;

    public static ArrayList a(long j, fc2 fc2Var) {
        e55 e55Var;
        ArrayList arrayList = fc2Var.f;
        ArrayList arrayList2 = new ArrayList();
        h75 h75Var = h75.s5;
        gc2 gc2Var = null;
        if (h75Var != null && (e55Var = h75Var.T3) != null && e55Var.b) {
            gc2Var = e55Var.e;
        }
        if (gc2Var != null && b(fc2Var, gc2Var, j)) {
            arrayList2.add(gc2Var);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            gc2 gc2Var2 = (gc2) arrayList.get(i);
            if (gc2Var2 != gc2Var && b(fc2Var, gc2Var2, j)) {
                arrayList2.add(gc2Var2);
            }
        }
        return arrayList2;
    }

    public static boolean b(fc2 fc2Var, gc2 gc2Var, long j) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        if (gc2Var == fc2Var.z || (groupCallParticipant = gc2Var.a) == null || groupCallParticipant.self) {
            return false;
        }
        long B1 = k27.B1(groupCallParticipant.peer);
        if (B1 == j || fc2Var.d.f(B1) == null) {
            return false;
        }
        boolean z = gc2Var.b;
        TLRPC.GroupCallParticipant groupCallParticipant2 = gc2Var.a;
        if ((z ? groupCallParticipant2.presentation : groupCallParticipant2.video) != null) {
            return (z ? groupCallParticipant2.presentationEndpoint : groupCallParticipant2.videoEndpoint) != null;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public static void c() {
        xa8 xa8Var;
        a95 a95Var = e;
        if (a95Var == null || (xa8Var = a95Var.a) == null || !xa8Var.e()) {
            return;
        }
        o85 o85Var = o85.f0;
        xa8 xa8Var2 = e.a;
        boolean z = false;
        ?? r4 = o85Var != null ? 1 : 0;
        if (o85Var != null && o85Var.r) {
            z = true;
        }
        byte b = xa8Var2.c;
        if (b != 3) {
            xa8Var2.f = r4;
            xa8Var2.g = z;
            if (b == 2) {
                xa8Var2.d = r4;
            } else {
                xa8Var2.c = r4;
            }
            xa8Var2.b.d();
        }
    }

    public static void d() {
        sn9.i();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || sharedInstance.groupCall == null || sharedInstance.isHangingUp()) {
            a95 a95Var = e;
            if (a95Var != null) {
                e = null;
                xa8 xa8Var = a95Var.a;
                if (xa8Var != null) {
                    a95Var.a = null;
                    xa8Var.g();
                    return;
                }
                return;
            }
            return;
        }
        a95 a95Var2 = e;
        if (a95Var2 == null) {
            a95Var2 = new a95();
            a95Var2.c = 1.0f;
            e = a95Var2;
        }
        xa8 xa8Var2 = a95Var2.a;
        if (xa8Var2 == null || !xa8Var2.e()) {
            e.a = mb3.c().k(e);
            c();
        }
        a95 a95Var3 = e;
        if (a95Var3.b == null) {
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            VoIPService sharedInstance3 = VoIPService.getSharedInstance();
            fc2 fc2Var = sharedInstance3 != null ? sharedInstance3.groupCall : null;
            if (sharedInstance2 != null && fc2Var != null) {
                ArrayList a = a(sharedInstance2.getSelfId(), fc2Var);
                int max = Math.max(1, a.size());
                float[] fArr = new float[max];
                float[] fArr2 = new float[max];
                Arrays.fill(fArr2, 1.0f);
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < a.size(); i++) {
                    gc2 gc2Var = (gc2) a.get(i);
                    float f = gc2Var.c;
                    if (f <= 0.0f) {
                        f = 0.0f;
                    }
                    fArr[i] = f;
                    boolean z = gc2Var.b;
                    fArr2[i] = z ? 2.0f : 1.0f;
                    TLRPC.GroupCallParticipant groupCallParticipant = gc2Var.a;
                    sb.append(z ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint);
                    sb.append(':');
                    sb.append(Math.round(fArr[i] * 100.0f));
                    sb.append(';');
                }
                String sb2 = sb.toString();
                if (!sb2.equals(a95Var3.d)) {
                    a95Var3.d = sb2;
                    a95Var3.c = dpe.a(fArr, fArr2, 0.45f, 2.35f, null, 0.0f).a;
                }
            }
        }
        e.a.d();
    }

    @Override // sa8
    public final View C0() {
        return null;
    }

    @Override // sa8
    public final boolean F2() {
        return true;
    }

    @Override // sa8
    public final boolean G0() {
        return h75.s5 != null && h75.t5;
    }

    @Override // sa8
    public final void G2(int i) {
        b91.b(i, true);
        gl.d3(new ql3((byte) 14), 300L);
    }

    @Override // sa8
    public final void L1(View view) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z = false;
        if (sharedInstance != null && sharedInstance.getVideoState(false) != 0) {
            z = true;
        }
        b91.a = z;
        this.b = (w85) view;
        h75 h75Var = h75.s5;
        if (h75Var != null) {
            h75Var.m1();
            if (h75Var.getWindow() != null) {
                h75Var.getWindow().getDecorView().setVisibility(4);
            }
        }
        w85 w85Var = this.b;
        if (!w85Var.w) {
            w85Var.w = true;
            w85Var.x = SystemClock.elapsedRealtime();
            VoIPService.getSharedInstance();
            w85Var.H = b91.c();
            w85Var.f.a();
            w85Var.i(true);
            gl.d3(w85Var.J, 250L);
        }
        o85.k(view.getContext());
    }

    @Override // sa8
    public final int Q0() {
        w85 w85Var = this.b;
        return Math.round((w85Var != null ? w85Var.n : this.c) * 1000.0f);
    }

    @Override // sa8
    public final int S1() {
        return 1000;
    }

    @Override // sa8
    public final boolean U() {
        return true;
    }

    @Override // sa8
    public final boolean a0(boolean z, float f, iv9 iv9Var) {
        return false;
    }

    @Override // sa8
    public final boolean a1() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        VoIPService sharedInstance2 = VoIPService.getSharedInstance();
        fc2 fc2Var = sharedInstance2 != null ? sharedInstance2.groupCall : null;
        if (sharedInstance == null || fc2Var == null || sharedInstance.isHangingUp() || fc2Var.k()) {
            return false;
        }
        TLRPC.GroupCall groupCall = fc2Var.b;
        return groupCall == null || !groupCall.rtmp_stream;
    }

    @Override // sa8
    public final float a2() {
        return 0.0f;
    }

    @Override // sa8
    public final boolean b0() {
        return false;
    }

    @Override // sa8
    public final boolean d1() {
        return false;
    }

    @Override // sa8
    public final long getDuration() {
        return 0L;
    }

    @Override // sa8
    public final boolean j() {
        return true;
    }

    @Override // sa8
    public final oc8 k1() {
        return null;
    }

    @Override // sa8
    public final long m() {
        return 0L;
    }

    @Override // sa8
    public final void n(View view) {
        b91.a = false;
        ((w85) view).h();
        w85 w85Var = this.b;
        if (w85Var == view) {
            this.c = w85Var.n;
            this.b = null;
        }
        h75 h75Var = h75.s5;
        if (h75Var != null) {
            if (h75Var.getWindow() != null) {
                h75Var.getWindow().getDecorView().setVisibility(0);
            }
            h75Var.n1();
        }
        o85.k(view.getContext());
    }

    @Override // sa8
    public final void n0(Rect rect) {
        rect.setEmpty();
    }

    @Override // sa8
    public final void o2(int i, ArrayList arrayList) {
        b91.a(i, arrayList, true);
    }

    @Override // sa8
    public final View p0(LaunchActivity launchActivity) {
        return new w85(this, launchActivity);
    }

    @Override // sa8
    public final boolean p1() {
        return true;
    }

    @Override // sa8
    public final void q0(View view) {
        ((w85) view).h();
        if (this.b == view) {
            this.b = null;
        }
    }

    @Override // sa8
    public final int u() {
        return 10;
    }

    @Override // sa8
    public final void u1() {
        this.a = null;
        h75 h75Var = h75.s5;
        if (h75Var != null && h75Var.getWindow() != null) {
            h75Var.getWindow().getDecorView().setVisibility(0);
        }
        gl.c3(new ql3((byte) 14));
    }

    @Override // sa8
    public final void y(SurfaceTexture surfaceTexture, Bitmap bitmap) {
        surfaceTexture.release();
    }

    @Override // sa8
    public final void L0() {
    }

    @Override // sa8
    public final void P1() {
    }

    @Override // sa8
    public final void e() {
    }

    @Override // sa8
    public final void k() {
    }

    @Override // sa8
    public final void H0(ya8 ya8Var) {
    }

    @Override // sa8
    public final void S0(float f) {
    }

    @Override // sa8
    public final void f(long j) {
    }

    @Override // sa8
    public final void y0(View view) {
    }

    @Override // sa8
    public final void r2(Canvas canvas, int i, int i2) {
    }
}
