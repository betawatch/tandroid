package ci;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class rc {
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
    public final org.telegram.ui.Components.u8 l;
    public final org.telegram.ui.Components.u8 m;
    public ly0 n;
    public ly0 o;
    public boolean p;
    public final org.telegram.ui.Components.gc q;
    public int r;
    public Drawable s;
    public Drawable t;
    public ly0 u;
    public int v;
    public final /* synthetic */ sc w;

    public rc(sc scVar, boolean z10, long j10) {
        String str;
        tc tcVar = scVar.w;
        this.w = scVar;
        this.b = new RectF();
        xq xqVar = xq.h;
        this.c = new org.telegram.ui.Components.u5(scVar, 0L, 600L, xqVar);
        this.d = new org.telegram.ui.Components.u5(scVar, 0L, 200L, xqVar);
        this.e = new org.telegram.ui.Components.u5(scVar, 0L, 350L, xqVar);
        this.f = null;
        this.g = new Matrix();
        this.h = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(scVar);
        this.k = imageReceiver;
        org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        this.l = u8Var;
        org.telegram.ui.Components.u8 u8Var2 = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        this.m = u8Var2;
        this.q = new org.telegram.ui.Components.gc(scVar);
        this.i = z10;
        this.j = j10;
        if (j10 >= 0) {
            TLRPC.User a22 = hp.s1(tcVar.k1).a2(Long.valueOf(j10));
            str = l10.k(a22);
            u8Var.r(a22);
            imageReceiver.i0(a22, u8Var, null);
        } else {
            TLRPC.Chat M0 = hp.s1(tcVar.k1).M0(Long.valueOf(-j10));
            str = M0 == null ? "" : M0.title;
            u8Var.q(M0);
            imageReceiver.i0(M0, u8Var, null);
        }
        imageReceiver.J0(org.telegram.messenger.g0.L(56.0f));
        imageReceiver.P();
        imageReceiver.B0 = true;
        u8Var2.g(21);
        u8Var2.h(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.c8, tcVar.j1));
        this.n = new ly0(str, 12.0f, null);
    }

    public final void a(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        boolean z10 = false;
        float e10 = this.c.e(false, this.a);
        int i3 = this.a;
        sc scVar = this.w;
        if (i3 >= 0 && i3 < scVar.d.size()) {
            z10 = true;
        }
        float d = this.d.d(z10);
        canvas.save();
        float width = (scVar.getWidth() - org.telegram.messenger.g0.L(80.0f)) / Math.max(1.0f, scVar.n);
        float L = ((scVar.n - (e10 + 0.5f)) * width) + org.telegram.messenger.g0.L(40.0f);
        float L2 = org.telegram.messenger.g0.L(40.0f);
        float f13 = width / 2.0f;
        this.b.set(L - f13, L2 - org.telegram.messenger.g0.L(50.0f), f13 + L, org.telegram.messenger.g0.L(50.0f) + L2);
        float f14 = (0.3f * d) + 0.7f;
        canvas.scale(f14, f14, L, L2);
        float a10 = this.q.a(0.04f);
        canvas.scale(a10, a10, L, L2);
        if (d > 0.0f) {
            float d10 = this.e.d(this.p);
            if (d10 < 1.0f) {
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
            if (d10 > 0.0f) {
                int i10 = (int) L;
                int L5 = i10 - (org.telegram.messenger.g0.L(56.0f) / 2);
                int i11 = (int) L2;
                int L6 = i11 - (org.telegram.messenger.g0.L(56.0f) / 2);
                int L7 = (org.telegram.messenger.g0.L(56.0f) / 2) + i10;
                int L8 = (org.telegram.messenger.g0.L(56.0f) / 2) + i11;
                org.telegram.ui.Components.u8 u8Var = this.m;
                u8Var.setBounds(L5, L6, L7, L8);
                u8Var.y = (int) (d * f12 * d10);
                u8Var.draw(canvas);
                u8Var.y = hs.e4;
            }
        } else {
            f10 = 40.0f;
            f11 = 2.0f;
            f12 = 255.0f;
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set((L - (this.o.c / f11)) - org.telegram.messenger.g0.L(5.66f), (org.telegram.messenger.g0.L(23.0f) + L2) - (org.telegram.messenger.g0.L(16.0f) / f11), (this.o.c / f11) + L + org.telegram.messenger.g0.L(5.66f), (org.telegram.messenger.g0.L(16.0f) / f11) + org.telegram.messenger.g0.L(23.0f) + L2);
        canvas.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, scVar.f);
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
        ly0 ly0Var = this.o;
        ly0Var.c(L - (ly0Var.c / f11), org.telegram.messenger.g0.L(23.0f) + L2, d, -1, canvas);
        ly0 ly0Var2 = this.n;
        ly0Var2.p = width - org.telegram.messenger.g0.L(4.0f);
        ly0Var2.c(L - (this.n.k() / f11), org.telegram.messenger.g0.L(42.0f) + L2, d, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, scVar.w.j1), canvas);
        if (this.v > 0) {
            int i13 = (int) L;
            int i14 = (int) L2;
            this.t.setBounds(i13 - org.telegram.messenger.g0.L(12.0f), i14 - org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(12.0f) + i13, i14 - org.telegram.messenger.g0.L(16.0f));
            this.s.setBounds(i13 - org.telegram.messenger.g0.L(12.0f), i14 - org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(12.0f) + i13, i14 - org.telegram.messenger.g0.L(16.0f));
            this.t.setAlpha(i12);
            this.s.setAlpha(i12);
            this.t.draw(canvas);
            this.s.draw(canvas);
            ly0 ly0Var3 = this.u;
            ly0Var3.c(L - (ly0Var3.c / f11), L2 - org.telegram.messenger.g0.L(27.0f), d, -1, canvas);
        }
        canvas.restore();
    }

    public final void b(long j10) {
        String str;
        String str2;
        sc scVar = this.w;
        tc tcVar = scVar.w;
        if (this.i) {
            if ((this.p ? 2666000L : this.j == h10.i(tcVar.k1).e() ? 0L : this.j) != j10) {
                this.p = j10 == 2666000;
                if (j10 == 0 || j10 == 2666000) {
                    j10 = h10.i(tcVar.k1).e();
                }
                this.j = j10;
                if (this.p) {
                    str2 = bd.M0(2131745058, null);
                } else {
                    ImageReceiver imageReceiver = this.k;
                    org.telegram.ui.Components.u8 u8Var = this.l;
                    if (j10 >= 0) {
                        TLRPC.User a22 = hp.s1(tcVar.k1).a2(Long.valueOf(this.j));
                        str = l10.k(a22);
                        u8Var.r(a22);
                        imageReceiver.i0(a22, u8Var, null);
                    } else {
                        TLRPC.Chat M0 = hp.s1(tcVar.k1).M0(Long.valueOf(-this.j));
                        str = M0 == null ? "" : M0.title;
                        u8Var.q(M0);
                        imageReceiver.i0(M0, u8Var, null);
                    }
                    str2 = str;
                }
                this.n = new ly0(str2, 12.0f, null);
                scVar.invalidate();
            }
        }
    }
}
