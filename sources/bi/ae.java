package bi;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class ae {
    public int a;
    public final RectF b;
    public final org.telegram.ui.Components.w5 c;
    public final org.telegram.ui.Components.w5 d;
    public final org.telegram.ui.Components.w5 e;
    public LinearGradient f;
    public final Matrix g;
    public final Paint h;
    public final boolean i;
    public long j;
    public final ImageReceiver k;
    public final org.telegram.ui.Components.w8 l;
    public final org.telegram.ui.Components.w8 m;
    public my0 n;
    public my0 o;
    public boolean p;
    public final org.telegram.ui.Components.ic q;
    public int r;
    public Drawable s;
    public Drawable t;
    public my0 u;
    public int v;
    public final /* synthetic */ be w;

    public ae(be beVar, boolean z9, long j3) {
        String str;
        ce ceVar = beVar.w;
        this.w = beVar;
        this.b = new RectF();
        xq xqVar = xq.h;
        this.c = new org.telegram.ui.Components.w5(beVar, 0L, 600L, xqVar);
        this.d = new org.telegram.ui.Components.w5(beVar, 0L, 200L, xqVar);
        this.e = new org.telegram.ui.Components.w5(beVar, 0L, 350L, xqVar);
        this.f = null;
        this.g = new Matrix();
        this.h = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(beVar);
        this.k = imageReceiver;
        org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        this.l = w8Var;
        org.telegram.ui.Components.w8 w8Var2 = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        this.m = w8Var2;
        this.q = new org.telegram.ui.Components.ic(beVar);
        this.i = z9;
        this.j = j3;
        if (j3 >= 0) {
            TLRPC.User a22 = qp.s1(ceVar.j1).a2(Long.valueOf(j3));
            str = t10.k(a22);
            w8Var.r(a22);
            imageReceiver.i0(a22, w8Var, null);
        } else {
            TLRPC.Chat M0 = qp.s1(ceVar.j1).M0(Long.valueOf(-j3));
            str = M0 == null ? "" : M0.title;
            w8Var.q(M0);
            imageReceiver.i0(M0, w8Var, null);
        }
        imageReceiver.J0(org.telegram.messenger.g0.L(56.0f));
        imageReceiver.P();
        imageReceiver.A0 = true;
        w8Var2.g(21);
        w8Var2.h(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.c8, ceVar.i1));
        this.n = new my0(str, 12.0f, null);
    }

    public final void a(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        boolean z9 = false;
        float e10 = this.c.e(false, this.a);
        int i7 = this.a;
        be beVar = this.w;
        if (i7 >= 0 && i7 < beVar.d.size()) {
            z9 = true;
        }
        float d = this.d.d(z9);
        canvas.save();
        float width = (beVar.getWidth() - org.telegram.messenger.g0.L(80.0f)) / Math.max(1.0f, beVar.n);
        float L = ((beVar.n - (e10 + 0.5f)) * width) + org.telegram.messenger.g0.L(40.0f);
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
                org.telegram.ui.Components.w8 w8Var = this.m;
                w8Var.setBounds(L5, L6, L7, L8);
                w8Var.y = (int) (d * f12 * d2);
                w8Var.draw(canvas);
                w8Var.y = qs.e4;
            }
        } else {
            f10 = 40.0f;
            f11 = 2.0f;
            f12 = 255.0f;
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set((L - (this.o.c / f11)) - org.telegram.messenger.g0.L(5.66f), (org.telegram.messenger.g0.L(23.0f) + L2) - (org.telegram.messenger.g0.L(16.0f) / f11), (this.o.c / f11) + L + org.telegram.messenger.g0.L(5.66f), (org.telegram.messenger.g0.L(16.0f) / f11) + org.telegram.messenger.g0.L(23.0f) + L2);
        canvas.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, beVar.f);
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
        my0 my0Var = this.o;
        my0Var.c(L - (my0Var.c / f11), org.telegram.messenger.g0.L(23.0f) + L2, d, -1, canvas);
        my0 my0Var2 = this.n;
        my0Var2.p = width - org.telegram.messenger.g0.L(4.0f);
        my0Var2.c(L - (this.n.k() / f11), org.telegram.messenger.g0.L(42.0f) + L2, d, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, beVar.w.i1), canvas);
        if (this.v > 0) {
            int i13 = (int) L;
            int i14 = (int) L2;
            this.t.setBounds(i13 - org.telegram.messenger.g0.L(12.0f), i14 - org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(12.0f) + i13, i14 - org.telegram.messenger.g0.L(16.0f));
            this.s.setBounds(i13 - org.telegram.messenger.g0.L(12.0f), i14 - org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(12.0f) + i13, i14 - org.telegram.messenger.g0.L(16.0f));
            this.t.setAlpha(i12);
            this.s.setAlpha(i12);
            this.t.draw(canvas);
            this.s.draw(canvas);
            my0 my0Var3 = this.u;
            my0Var3.c(L - (my0Var3.c / f11), L2 - org.telegram.messenger.g0.L(27.0f), d, -1, canvas);
        }
        canvas.restore();
    }

    public final void b(long j3) {
        String str;
        String str2;
        be beVar = this.w;
        ce ceVar = beVar.w;
        if (this.i) {
            if ((this.p ? 2666000L : this.j == p10.i(ceVar.j1).e() ? 0L : this.j) != j3) {
                this.p = j3 == 2666000;
                if (j3 == 0 || j3 == 2666000) {
                    j3 = p10.i(ceVar.j1).e();
                }
                this.j = j3;
                if (this.p) {
                    str2 = org.telegram.messenger.id.M0(2131745051, null);
                } else {
                    ImageReceiver imageReceiver = this.k;
                    org.telegram.ui.Components.w8 w8Var = this.l;
                    if (j3 >= 0) {
                        TLRPC.User a22 = qp.s1(ceVar.j1).a2(Long.valueOf(this.j));
                        str = t10.k(a22);
                        w8Var.r(a22);
                        imageReceiver.i0(a22, w8Var, null);
                    } else {
                        TLRPC.Chat M0 = qp.s1(ceVar.j1).M0(Long.valueOf(-this.j));
                        str = M0 == null ? "" : M0.title;
                        w8Var.q(M0);
                        imageReceiver.i0(M0, w8Var, null);
                    }
                    str2 = str;
                }
                this.n = new my0(str2, 12.0f, null);
                beVar.invalidate();
            }
        }
    }
}
