package ki;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gc;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.si;
import org.telegram.messenger.t5;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.t8;
import org.telegram.ui.Components.u5;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class h4 extends Drawable implements p6, is {
    public final Paint a;
    public final Paint b;
    public final ImageReceiver c;
    public final ImageReceiver d;
    public int e;
    public final g5[] f;
    public final oy0 h;
    public final RectF n;
    public final boolean r;
    public final u5 s;
    public boolean w;
    public boolean x;
    public View y;

    public h4(TLRPC.User user) {
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.c = imageReceiver;
        this.d = new ImageReceiver(null);
        this.e = 1;
        this.f = new g5[2];
        this.n = new RectF();
        this.s = new u5(new g4(this, 1), 320L, er.h, 0);
        this.r = false;
        int i7 = j6.d6;
        paint.setColor(j6.x0(null, i7, false));
        paint2.setColor(j6.x0(null, i7, false));
        paint2.setShadowLayer(org.telegram.messenger.g0.L(2.33f), 0.0f, org.telegram.messenger.g0.L(2.0f), j6.r1(0.18f, -16777216));
        t8 t8Var = new t8((e6) null);
        t8Var.r(user);
        imageReceiver.i0(user, t8Var, null);
        imageReceiver.J0(org.telegram.messenger.g0.L(16.0f));
        d();
        this.h = new oy0(q10.p(user), 14.0f, null);
    }

    @Override // org.telegram.ui.Components.p6
    public final void a(fh0 fh0Var) {
        this.y = fh0Var;
        this.d.H0(fh0Var);
        this.c.H0(fh0Var);
    }

    @Override // org.telegram.ui.Components.p6
    public final void b(ImageReceiver imageReceiver) {
        this.x = false;
        this.c.R();
        this.d.R();
        ns.f(m10.t0).n(this, ns.C1);
        g5[] g5VarArr = this.f;
        g5 g5Var = g5VarArr[0];
        if (g5Var != null) {
            g5Var.n(this.y);
        }
        g5 g5Var2 = g5VarArr[1];
        if (g5Var2 != null) {
            g5Var2.n(this.y);
        }
    }

    @Override // org.telegram.ui.Components.p6
    public final void c(ImageReceiver imageReceiver) {
        this.x = true;
        this.c.P();
        this.d.P();
        ns.f(m10.t0).c(this, ns.C1);
        g5[] g5VarArr = this.f;
        g5 g5Var = g5VarArr[0];
        if (g5Var != null) {
            g5Var.a(this.y);
        }
        g5 g5Var2 = g5VarArr[1];
        if (g5Var2 != null) {
            g5Var2.a(this.y);
        }
    }

    public final void d() {
        g5 g5Var;
        TLRPC.TL_messages_stickerSet m0 = si.b0(m10.t0).m0(new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
        if (m0 == null || m0.documents.isEmpty()) {
            this.w = true;
            return;
        }
        TLRPC.Document document = m0.documents.get((int) Math.floor(Math.random() * m0.documents.size()));
        int i7 = 1 - this.e;
        this.e = i7;
        g5[] g5VarArr = this.f;
        g5 g5Var2 = g5VarArr[i7];
        if (g5Var2 != null) {
            g5Var2.n(this.y);
        }
        g5VarArr[this.e] = g5.l(m10.t0, 9, document);
        g5VarArr[this.e].setColorFilter(new PorterDuffColorFilter(j6.x0(null, j6.Fi, false), PorterDuff.Mode.SRC_IN));
        if (this.x && (g5Var = g5VarArr[this.e]) != null) {
            g5Var.a(this.y);
        }
        org.telegram.messenger.g0.i3(new g4(this, 0), 2500L);
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.B0 && this.w && this.x) {
            this.w = false;
            d();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float f13;
        g5 g5Var;
        g5 g5Var2;
        Rect bounds = getBounds();
        int x02 = j6.x0(null, j6.d6, false);
        Paint paint = this.a;
        if (paint.getColor() != x02) {
            paint.setColor(x02);
        }
        Paint paint2 = this.b;
        if (paint2.getColor() != x02) {
            paint2.setColor(x02);
        }
        boolean z10 = this.r;
        float L = org.telegram.messenger.g0.L((z10 ? 48 : 28) + 38 + 6.66f) + this.h.c;
        float f14 = L / 2.0f;
        float L2 = org.telegram.messenger.g0.L(32.0f) / 2.0f;
        RectF rectF = this.n;
        rectF.set(bounds.centerX() - f14, bounds.centerY() - L2, bounds.centerX() + f14, bounds.centerY() + L2);
        canvas.drawRoundRect(rectF, L2, L2, paint);
        float f15 = rectF.left;
        float f16 = rectF.top;
        float L3 = org.telegram.messenger.g0.L(32.0f);
        float L4 = org.telegram.messenger.g0.L(32.0f);
        ImageReceiver imageReceiver = this.c;
        imageReceiver.y0(f15, f16, L3, L4);
        imageReceiver.h(canvas, null);
        this.h.c(org.telegram.messenger.g0.L(36.0f) + rectF.left, rectF.centerY(), 1.0f, j6.x0(null, j6.G6, false), canvas);
        if (z10) {
            float L5 = rectF.right - org.telegram.messenger.g0.L(22.66f);
            canvas.drawCircle(L5, rectF.centerY(), org.telegram.messenger.g0.L(24.0f), paint2);
            float centerY = rectF.centerY() - org.telegram.messenger.g0.L(16.0f);
            float L6 = org.telegram.messenger.g0.L(32.0f);
            float L7 = org.telegram.messenger.g0.L(32.0f);
            ImageReceiver imageReceiver2 = this.d;
            imageReceiver2.y0(L5 - org.telegram.messenger.g0.L(16.0f), centerY, L6, L7);
            imageReceiver2.h(canvas, null);
            return;
        }
        float e10 = this.s.e(false, this.e);
        canvas.save();
        canvas.translate((int) (rectF.right - org.telegram.messenger.g0.L(30.66f)), (int) (rectF.centerY() - org.telegram.messenger.g0.L(12.0f)));
        g5[] g5VarArr = this.f;
        if (e10 >= 1.0f || (g5Var2 = g5VarArr[0]) == null) {
            f10 = 24.0f;
            f11 = 1.0f;
            f12 = 12.0f;
            f13 = 255.0f;
        } else {
            canvas.save();
            f10 = 24.0f;
            canvas.translate(0.0f, (this.e == 0 ? -1 : 1) * org.telegram.messenger.g0.L(9.0f) * e10);
            float f17 = 1.0f - e10;
            f11 = 1.0f;
            float f18 = (f17 * 0.4f) + 0.6f;
            f12 = 12.0f;
            f13 = 255.0f;
            canvas.scale(f18, f18, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
            g5Var2.setBounds(0, 0, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
            g5Var2.setAlpha((int) (f17 * 255.0f));
            g5Var2.draw(canvas);
            canvas.restore();
        }
        if (e10 > 0.0f && (g5Var = g5VarArr[1]) != null) {
            canvas.save();
            canvas.translate(0.0f, (f11 - e10) * org.telegram.messenger.g0.L(9.0f) * (this.e != 1 ? 1 : -1));
            float f19 = (0.4f * e10) + 0.6f;
            canvas.scale(f19, f19, org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(f12));
            g5Var.setBounds(0, 0, org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10));
            g5Var.setAlpha((int) (e10 * f13));
            g5Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    public h4(TLRPC.User user, TLRPC.Document document) {
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(null);
        this.d = imageReceiver2;
        this.e = 1;
        this.f = new g5[2];
        this.n = new RectF();
        this.s = new u5(new g4(this, 1), 320L, er.h, 0);
        this.r = true;
        int i7 = j6.d6;
        paint.setColor(j6.x0(null, i7, false));
        paint2.setColor(j6.x0(null, i7, false));
        paint2.setShadowLayer(org.telegram.messenger.g0.L(2.33f), 0.0f, org.telegram.messenger.g0.L(2.0f), j6.r1(0.18f, -16777216));
        t8 t8Var = new t8((e6) null);
        t8Var.r(user);
        imageReceiver.i0(user, t8Var, null);
        imageReceiver.J0(org.telegram.messenger.g0.L(16.0f));
        imageReceiver2.r0(gc.b(document), "120_120", gc.c(w7.w(document.thumbs, 120, false, null, false), document), "120_120", t5.d(document.thumbs, j6.a7, 0.35f, false), 0L, null, null, 0);
        this.h = new oy0(q10.p(user), 14.0f, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
