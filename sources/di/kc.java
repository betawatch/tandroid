package di;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.xy0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class kc {
    public int a;
    public final RectF b;
    public final org.telegram.ui.Components.d6 c;
    public final org.telegram.ui.Components.d6 d;
    public final org.telegram.ui.Components.d6 e;
    public LinearGradient f;
    public final Matrix g;
    public final Paint h;
    public final boolean i;
    public long j;
    public final ImageReceiver k;
    public final org.telegram.ui.Components.b9 l;
    public final org.telegram.ui.Components.b9 m;
    public xy0 n;
    public xy0 o;
    public boolean p;
    public final org.telegram.ui.Components.mc q;
    public int r;
    public Drawable s;
    public Drawable t;
    public xy0 u;
    public int v;
    public final /* synthetic */ lc w;

    public kc(lc lcVar, boolean z10, long j3) {
        String str;
        mc mcVar = lcVar.w;
        this.w = lcVar;
        this.b = new RectF();
        nr nrVar = nr.h;
        this.c = new org.telegram.ui.Components.d6(lcVar, 0L, 600L, nrVar);
        this.d = new org.telegram.ui.Components.d6(lcVar, 0L, 200L, nrVar);
        this.e = new org.telegram.ui.Components.d6(lcVar, 0L, 350L, nrVar);
        this.f = null;
        this.g = new Matrix();
        this.h = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(lcVar);
        this.k = imageReceiver;
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        this.l = b9Var;
        org.telegram.ui.Components.b9 b9Var2 = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        this.m = b9Var2;
        this.q = new org.telegram.ui.Components.mc(lcVar);
        this.i = z10;
        this.j = j3;
        if (j3 >= 0) {
            TLRPC.User c22 = np.u1(mcVar.n1).c2(Long.valueOf(j3));
            str = p10.l(c22);
            b9Var.r(c22);
            imageReceiver.i0(c22, b9Var, null);
        } else {
            TLRPC.Chat O0 = np.u1(mcVar.n1).O0(Long.valueOf(-j3));
            str = O0 == null ? "" : O0.title;
            b9Var.q(O0);
            imageReceiver.i0(O0, b9Var, null);
        }
        imageReceiver.J0(org.telegram.messenger.g0.L(56.0f));
        imageReceiver.P();
        imageReceiver.B0 = true;
        b9Var2.g(21);
        b9Var2.h(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.c8, mcVar.m1));
        this.n = new xy0(str, 12.0f, null);
    }

    public final void a(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        boolean z10 = false;
        float e10 = this.c.e(false, this.a);
        int i7 = this.a;
        lc lcVar = this.w;
        if (i7 >= 0 && i7 < lcVar.d.size()) {
            z10 = true;
        }
        float d = this.d.d(z10);
        canvas.save();
        float width = (lcVar.getWidth() - org.telegram.messenger.g0.L(80.0f)) / Math.max(1.0f, lcVar.n);
        float L = ((lcVar.n - (e10 + 0.5f)) * width) + org.telegram.messenger.g0.L(40.0f);
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
                org.telegram.ui.Components.b9 b9Var = this.m;
                b9Var.setBounds(L5, L6, L7, L8);
                b9Var.y = (int) (d * f12 * d2);
                b9Var.draw(canvas);
                b9Var.y = ls.e4;
            }
        } else {
            f10 = 40.0f;
            f11 = 2.0f;
            f12 = 255.0f;
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set((L - (this.o.c / f11)) - org.telegram.messenger.g0.L(5.66f), (org.telegram.messenger.g0.L(23.0f) + L2) - (org.telegram.messenger.g0.L(16.0f) / f11), (this.o.c / f11) + L + org.telegram.messenger.g0.L(5.66f), (org.telegram.messenger.g0.L(16.0f) / f11) + org.telegram.messenger.g0.L(23.0f) + L2);
        canvas.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, lcVar.f);
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
        xy0 xy0Var = this.o;
        xy0Var.c(L - (xy0Var.c / f11), org.telegram.messenger.g0.L(23.0f) + L2, d, -1, canvas);
        xy0 xy0Var2 = this.n;
        xy0Var2.p = width - org.telegram.messenger.g0.L(4.0f);
        xy0Var2.c(L - (this.n.k() / f11), org.telegram.messenger.g0.L(42.0f) + L2, d, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, lcVar.w.m1), canvas);
        if (this.v > 0) {
            int i13 = (int) L;
            int i14 = (int) L2;
            this.t.setBounds(i13 - org.telegram.messenger.g0.L(12.0f), i14 - org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(12.0f) + i13, i14 - org.telegram.messenger.g0.L(16.0f));
            this.s.setBounds(i13 - org.telegram.messenger.g0.L(12.0f), i14 - org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(12.0f) + i13, i14 - org.telegram.messenger.g0.L(16.0f));
            this.t.setAlpha(i12);
            this.s.setAlpha(i12);
            this.t.draw(canvas);
            this.s.draw(canvas);
            xy0 xy0Var3 = this.u;
            xy0Var3.c(L - (xy0Var3.c / f11), L2 - org.telegram.messenger.g0.L(27.0f), d, -1, canvas);
        }
        canvas.restore();
    }

    public final void b(long j3) {
        String str;
        String str2;
        lc lcVar = this.w;
        mc mcVar = lcVar.w;
        if (this.i) {
            if ((this.p ? 2666000L : this.j == k10.i(mcVar.n1).e() ? 0L : this.j) != j3) {
                this.p = j3 == 2666000;
                if (j3 == 0 || j3 == 2666000) {
                    j3 = k10.i(mcVar.n1).e();
                }
                this.j = j3;
                if (this.p) {
                    str2 = hd.N0(2131744805, null);
                } else {
                    ImageReceiver imageReceiver = this.k;
                    org.telegram.ui.Components.b9 b9Var = this.l;
                    if (j3 >= 0) {
                        TLRPC.User c22 = np.u1(mcVar.n1).c2(Long.valueOf(this.j));
                        str = p10.l(c22);
                        b9Var.r(c22);
                        imageReceiver.i0(c22, b9Var, null);
                    } else {
                        TLRPC.Chat O0 = np.u1(mcVar.n1).O0(Long.valueOf(-this.j));
                        str = O0 == null ? "" : O0.title;
                        b9Var.q(O0);
                        imageReceiver.i0(O0, b9Var, null);
                    }
                    str2 = str;
                }
                this.n = new xy0(str2, 12.0f, null);
                lcVar.invalidate();
            }
        }
    }
}
