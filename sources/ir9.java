// default package

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ir9 implements je8, fn7 {
    public static ir9 w;
    public me8 a;
    public TLRPC.GroupCallParticipant c;
    public boolean d;
    public ke8 e;
    public hr9 f;
    public gr9 h;
    public final int r;
    public long s;
    public final fr9 b = new fr9(this);
    public final li7 n = new li7(this, (byte) 22);

    public ir9(int i) {
        this.r = i;
        jn7.f(i).a(this, jn7.w2);
        jn7.f(i).a(this, jn7.B2);
    }

    public static vc2 c() {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        vc2 vc2Var = sharedInstance != null ? sharedInstance.groupCall : null;
        if (sharedInstance == null || vc2Var == null || (groupCall = vc2Var.b) == null || !groupCall.rtmp_stream || sharedInstance.isHangingUp()) {
            return null;
        }
        return vc2Var;
    }

    public static boolean d() {
        me8 me8Var;
        ir9 ir9Var = w;
        return (ir9Var == null || (me8Var = ir9Var.a) == null || !me8Var.g()) ? false : true;
    }

    public static void e(Activity activity) {
        ne8 i;
        if (c() != null) {
            ir9 ir9Var = w;
            if (ir9Var == null) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                ir9 ir9Var2 = new ir9(sharedInstance != null ? sharedInstance.getAccount() : yac.t0);
                w = ir9Var2;
                ir9Var = ir9Var2;
            }
            me8 me8Var = ir9Var.a;
            if (me8Var == null || !me8Var.f()) {
                ir9Var.a = fc3.b().k(ir9Var);
            }
            me8 me8Var2 = ir9Var.a;
            if (me8Var2.c != 0 || (i = me8Var2.i(activity, null, true)) == null) {
                return;
            }
            ke8 ke8Var = new ke8(i);
            ir9Var.e = ke8Var;
            ir9Var.b.a = ke8Var;
            ir9Var.a();
            ir9Var.s = SystemClock.elapsedRealtime();
            li7 li7Var = ir9Var.n;
            hl.r(li7Var);
            hl.d3(li7Var, 700L);
            j95 j95Var = j95.s5;
            if (j95Var != null) {
                j95Var.dismiss();
            }
            er9 er9Var = er9.Q0;
            if (er9Var != null) {
                er9Var.dismiss();
            }
            hl.c3(new pg6((byte) 22));
        }
    }

    public static void h(boolean z) {
        j95 j95Var = j95.s5;
        if (j95Var != null && j95Var.getWindow() != null) {
            j95Var.getWindow().getDecorView().setVisibility(z ? 4 : 0);
        }
        er9 er9Var = er9.Q0;
        if (er9Var == null || er9Var.getWindow() == null) {
            return;
        }
        er9Var.getWindow().getDecorView().setVisibility(z ? 4 : 0);
    }

    public static void m() {
        vc2 c = c();
        ir9 ir9Var = w;
        if (c != null) {
            if (ir9Var == null) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                ir9Var = new ir9(sharedInstance != null ? sharedInstance.getAccount() : yac.t0);
                w = ir9Var;
            }
            me8 me8Var = ir9Var.a;
            if (me8Var == null || !me8Var.f()) {
                ir9Var.a = fc3.b().k(ir9Var);
            }
            w.a();
            w.a.e();
            return;
        }
        if (ir9Var != null) {
            w = null;
            int i = ir9Var.r;
            jn7.f(i).n(ir9Var, jn7.w2);
            jn7.f(i).n(ir9Var, jn7.B2);
            me8 me8Var2 = ir9Var.a;
            if (me8Var2 != null) {
                ir9Var.a = null;
                me8Var2.h();
            }
            ir9Var.f();
        }
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
        return false;
    }

    @Override // je8
    public final boolean G(boolean z, float f, cz9 cz9Var) {
        return false;
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
        return new hr9(this, launchActivity);
    }

    @Override // je8
    public final void L(View view) {
        if (view == this.f) {
            h(false);
        }
        hr9 hr9Var = this.f;
        if (view == hr9Var) {
            hr9Var.b = false;
            hl.r(hr9Var.e);
            this.f = null;
            this.b.b = null;
            a();
        }
        hr9 hr9Var2 = (hr9) view;
        hr9Var2.b = false;
        hl.r(hr9Var2.e);
        hr9Var2.a.d.e();
    }

    @Override // je8
    public final void N(View view) {
        h(true);
    }

    @Override // je8
    public final View P() {
        return null;
    }

    @Override // je8
    public final boolean Q() {
        return er9.Q0 != null && j95.t5;
    }

    @Override // je8
    public final void R(ne8 ne8Var) {
        ke8 ke8Var = new ke8(ne8Var);
        this.e = ke8Var;
        this.b.a = ke8Var;
        a();
        this.s = SystemClock.elapsedRealtime();
        li7 li7Var = this.n;
        hl.r(li7Var);
        hl.d3(li7Var, 700L);
    }

    @Override // je8
    public final int S() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031 A[RETURN] */
    @Override // je8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int U() {
        float f;
        if (this.b.c > 0) {
            return this.b.c;
        }
        vc2 c = c();
        if (c != null) {
            ArrayList arrayList = c.f;
            if (!arrayList.isEmpty()) {
                f = ((wc2) arrayList.get(0)).c;
                if (f <= 0.0f) {
                    return Math.round(f * 1000.0f);
                }
                return 16;
            }
        }
        f = 0.0f;
        if (f <= 0.0f) {
        }
    }

    @Override // je8
    public final boolean X() {
        return c() != null;
    }

    @Override // je8
    public final boolean Y() {
        return false;
    }

    public final void a() {
        TLRPC.GroupCallParticipant groupCallParticipant;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        vc2 c = c();
        boolean z = false;
        if (!((this.b.a == null && this.b.b == null) ? false : true) || c == null || c.f.isEmpty()) {
            groupCallParticipant = null;
        } else {
            wc2 wc2Var = (wc2) c.f.get(0);
            groupCallParticipant = wc2Var.a;
            z = wc2Var.b;
        }
        TLRPC.GroupCallParticipant groupCallParticipant2 = this.c;
        if (groupCallParticipant == groupCallParticipant2 && z == this.d) {
            return;
        }
        if (groupCallParticipant2 != null) {
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 != null) {
                sharedInstance2.removeExtraRemoteSink(this.c, this.d, this.b);
            }
            this.c = null;
        }
        if (groupCallParticipant == null || sharedInstance == null || !sharedInstance.addExtraRemoteSink(groupCallParticipant, z, this.b)) {
            return;
        }
        this.c = groupCallParticipant;
        this.d = z;
        StringBuilder sb = new StringBuilder("bound ");
        sb.append(z ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint);
        String sb2 = sb.toString();
        if (f11.a) {
            cc4.b("rtmp pip: ".concat(sb2));
        }
    }

    @Override // je8
    public final dg8 a0() {
        return null;
    }

    @Override // je8
    public final boolean d0() {
        return false;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.w2 || i == jn7.B2) {
            a();
            hr9 hr9Var = this.f;
            if (hr9Var != null) {
                hr9Var.a();
            }
        }
    }

    public final void f() {
        hl.r(this.n);
        gr9 gr9Var = this.h;
        if (gr9Var != null) {
            gr9Var.a.K();
            VideoFrame videoFrame = gr9Var.b;
            if (videoFrame != null) {
                videoFrame.release();
                gr9Var.b = null;
            }
            this.h = null;
        }
        this.b.a = null;
        this.b.b = null;
        ke8 ke8Var = this.e;
        if (ke8Var != null) {
            ke8Var.a();
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

    @Override // je8
    public final void g0() {
        this.a = null;
        if (this.f != null) {
            h(false);
        }
        f();
        hl.c3(new pg6((byte) 22));
        hl.c3(new pg6((byte) 21));
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
        h(false);
        hr9 hr9Var = this.f;
        if (view == hr9Var) {
            hr9Var.b = false;
            hl.r(hr9Var.e);
            this.f = null;
            this.b.b = null;
            a();
        }
    }

    @Override // je8
    public final void o0(View view) {
        hr9 hr9Var = (hr9) view;
        this.f = hr9Var;
        if (!hr9Var.b) {
            hr9Var.b = true;
            hl.d3(hr9Var.e, 500L);
        }
        hr9Var.a();
        this.b.b = this.f.a.d;
        a();
    }

    @Override // je8
    public final void p0() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (sharedInstance == null || launchActivity == null || c() == null) {
            me8 me8Var = this.a;
            if (me8Var != null) {
                me8Var.b();
                return;
            }
            return;
        }
        if (j95.s5 == null && er9.Q0 == null) {
            j95.T0(launchActivity, k5.a(sharedInstance.getAccount()), null, null, false, null);
        }
        if (this.a != null) {
            ke8 ke8Var = this.e;
            this.e = null;
            this.b.a = null;
            this.a.a(new v35(this, ke8Var, (byte) 29));
            hl.c3(new pg6((byte) 22));
        }
    }

    @Override // je8
    public final int q() {
        return 10;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c A[RETURN] */
    @Override // je8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int q0() {
        float f;
        if (this.b.d > 0) {
            return this.b.d;
        }
        vc2 c = c();
        if (c != null) {
            ArrayList arrayList = c.f;
            if (!arrayList.isEmpty()) {
                f = ((wc2) arrayList.get(0)).c;
                return f <= 0.0f ? 1000 : 9;
            }
        }
        f = 0.0f;
        if (f <= 0.0f) {
        }
    }

    @Override // je8
    public final float r0() {
        return 0.0f;
    }

    @Override // je8
    public final void s(SurfaceTexture surfaceTexture, Bitmap bitmap) {
        ke8 ke8Var = this.e;
        this.e = null;
        this.b.a = null;
        a();
        if (ke8Var != null) {
            ke8Var.a();
        }
        surfaceTexture.release();
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
    public final void G0(int i) {
    }

    @Override // je8
    public final void V(float f) {
    }

    @Override // je8
    public final void g(long j) {
    }

    @Override // je8
    public final void u0(int i, ArrayList arrayList) {
    }

    @Override // je8
    public final void v0(Canvas canvas, int i, int i2) {
    }
}
