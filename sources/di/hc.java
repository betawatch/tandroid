package di;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.oy0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class hc {
    public int a;
    public final RectF b;
    public final org.telegram.ui.Components.u5 c;
    public final org.telegram.ui.Components.u5 d;
    public final org.telegram.ui.Components.u5 e;
    public LinearGradient f;
    public final Matrix g;
    public final Paint h;
    public final boolean i;
    public long j;
    public final ImageReceiver k;
    public final org.telegram.ui.Components.t8 l;
    public final org.telegram.ui.Components.t8 m;
    public oy0 n;
    public oy0 o;
    public boolean p;
    public final org.telegram.ui.Components.dc q;
    public int r;
    public Drawable s;
    public Drawable t;
    public oy0 u;
    public int v;
    public final /* synthetic */ ic w;

    public hc(ic icVar, boolean z10, long j3) {
        String str;
        jc jcVar = icVar.w;
        this.w = icVar;
        this.b = new RectF();
        er erVar = er.h;
        this.c = new org.telegram.ui.Components.u5(icVar, 0L, 600L, erVar);
        this.d = new org.telegram.ui.Components.u5(icVar, 0L, 200L, erVar);
        this.e = new org.telegram.ui.Components.u5(icVar, 0L, 350L, erVar);
        this.f = null;
        this.g = new Matrix();
        this.h = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(icVar);
        this.k = imageReceiver;
        org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        this.l = t8Var;
        org.telegram.ui.Components.t8 t8Var2 = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        this.m = t8Var2;
        this.q = new org.telegram.ui.Components.dc(icVar);
        this.i = z10;
        this.j = j3;
        if (j3 >= 0) {
            TLRPC.User a22 = np.s1(jcVar.n1).a2(Long.valueOf(j3));
            str = q10.k(a22);
            t8Var.r(a22);
            imageReceiver.i0(a22, t8Var, null);
        } else {
            TLRPC.Chat M0 = np.s1(jcVar.n1).M0(Long.valueOf(-j3));
            str = M0 == null ? "" : M0.title;
            t8Var.q(M0);
            imageReceiver.i0(M0, t8Var, null);
        }
        imageReceiver.J0(org.telegram.messenger.g0.L(56.0f));
        imageReceiver.P();
        imageReceiver.B0 = true;
        t8Var2.g(21);
        t8Var2.h(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.c8, jcVar.m1));
        this.n = new oy0(str, 12.0f, null);
    }

    public final void a(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        boolean z10 = false;
        float e10 = this.c.e(false, this.a);
        int i7 = this.a;
        ic icVar = this.w;
        if (i7 >= 0 && i7 < icVar.d.size()) {
            z10 = true;
        }
        float d = this.d.d(z10);
        canvas.save();
        float width = (icVar.getWidth() - org.telegram.messenger.g0.L(80.0f)) / Math.max(1.0f, icVar.n);
        float L = ((icVar.n - (e10 + 0.5f)) * width) + org.telegram.messenger.g0.L(40.0f);
        float L2 = org.telegram.messenger.g0.L(40.0f);
        float f13 = width / 2.0f;
        this.b.set(L - f13, L2 - org.telegram.messenger.g0.L(50.0f), f13 + L, org.telegram.messenger.g0.L(50.0f) + L2);
        float f14 = (0.3f * d) + 0.7f;
        canvas.scale(f14, f14, L, L2);
        float a10 = this.q.a(0.04f);
        canvas.scale(a10, a10, L, L2);
        if (d > 0.0f) {
            float d2 = this.e.d(this.p);
            if (d2 < 1.0f) {
                f12 = 255.0f;
                float L3 = org.telegram.messenger.g0.L(56.0f);
                f10 = 40.0f;
                float L4 = org.telegram.messenger.g0.L(56.0f);
                f11 = 2.0f;
                ImageReceiver imageReceiver = this.k;
                imageReceiver.y0(L - (org.telegram.messenger.g0.L(56.0f) / 2.0f), L2 - (org.telegram.messenger.g0.L(56.0f) / 2.0f), L3, L4);
                imageReceiver.setAlpha(d);
                imageReceiver.h(canvas, null);
                imageReceiver.setAlpha(1.0f);
            } else {
                f10 = 40.0f;
                f11 = 2.0f;
                f12 = 255.0f;
            }
            if (d2 > 0.0f) {
                int i10 = (int) L;
                int L5 = i10 - (org.telegram.messenger.g0.L(56.0f) / 2);
                int i11 = (int) L2;
                int L6 = i11 - (org.telegram.messenger.g0.L(56.0f) / 2);
                int L7 = (org.telegram.messenger.g0.L(56.0f) / 2) + i10;
                int L8 = (org.telegram.messenger.g0.L(56.0f) / 2) + i11;
                org.telegram.ui.Components.t8 t8Var = this.m;
                t8Var.setBounds(L5, L6, L7, L8);
                t8Var.y = (int) (d * f12 * d2);
                t8Var.draw(canvas);
                t8Var.y = ns.e4;
            }
        } else {
            f10 = 40.0f;
            f11 = 2.0f;
            f12 = 255.0f;
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set((L - (this.o.c / f11)) - org.telegram.messenger.g0.L(5.66f), (org.telegram.messenger.g0.L(23.0f) + L2) - (org.telegram.messenger.g0.L(16.0f) / f11), (this.o.c / f11) + L + org.telegram.messenger.g0.L(5.66f), (org.telegram.messenger.g0.L(16.0f) / f11) + org.telegram.messenger.g0.L(23.0f) + L2);
        canvas.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, icVar.f);
        int i12 = (int) (d * f12);
        Paint paint = this.h;
        paint.setAlpha(i12);
        if (this.f != null) {
            Matrix matrix = this.g;
            matrix.reset();
            matrix.postTranslate(0.0f, rectF.top);
            this.f.setLocalMatrix(matrix);
        }
        canvas.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, paint);
        oy0 oy0Var = this.o;
        oy0Var.c(L - (oy0Var.c / f11), org.telegram.messenger.g0.L(23.0f) + L2, d, -1, canvas);
        oy0 oy0Var2 = this.n;
        oy0Var2.p = width - org.telegram.messenger.g0.L(4.0f);
        oy0Var2.c(L - (this.n.k() / f11), org.telegram.messenger.g0.L(42.0f) + L2, d, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, icVar.w.m1), canvas);
        if (this.v > 0) {
            int i13 = (int) L;
            int i14 = (int) L2;
            this.t.setBounds(i13 - org.telegram.messenger.g0.L(12.0f), i14 - org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(12.0f) + i13, i14 - org.telegram.messenger.g0.L(16.0f));
            this.s.setBounds(i13 - org.telegram.messenger.g0.L(12.0f), i14 - org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(12.0f) + i13, i14 - org.telegram.messenger.g0.L(16.0f));
            this.t.setAlpha(i12);
            this.s.setAlpha(i12);
            this.t.draw(canvas);
            this.s.draw(canvas);
            oy0 oy0Var3 = this.u;
            oy0Var3.c(L - (oy0Var3.c / f11), L2 - org.telegram.messenger.g0.L(27.0f), d, -1, canvas);
        }
        canvas.restore();
    }

    public final void b(long j3) {
        String str;
        String str2;
        ic icVar = this.w;
        jc jcVar = icVar.w;
        if (this.i) {
            if ((this.p ? 2666000L : this.j == m10.i(jcVar.n1).e() ? 0L : this.j) != j3) {
                this.p = j3 == 2666000;
                if (j3 == 0 || j3 == 2666000) {
                    j3 = m10.i(jcVar.n1).e();
                }
                this.j = j3;
                if (this.p) {
                    str2 = hd.M0(2131745048, null);
                } else {
                    ImageReceiver imageReceiver = this.k;
                    org.telegram.ui.Components.t8 t8Var = this.l;
                    if (j3 >= 0) {
                        TLRPC.User a22 = np.s1(jcVar.n1).a2(Long.valueOf(this.j));
                        str = q10.k(a22);
                        t8Var.r(a22);
                        imageReceiver.i0(a22, t8Var, null);
                    } else {
                        TLRPC.Chat M0 = np.s1(jcVar.n1).M0(Long.valueOf(-this.j));
                        str = M0 == null ? "" : M0.title;
                        t8Var.q(M0);
                        imageReceiver.i0(M0, t8Var, null);
                    }
                    str2 = str;
                }
                this.n = new oy0(str2, 12.0f, null);
                icVar.invalidate();
            }
        }
    }
}
