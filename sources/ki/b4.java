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
import org.telegram.messenger.gs;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.si;
import org.telegram.messenger.u5;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.rh0;
import org.telegram.ui.Components.w6;
import org.telegram.ui.Components.xy0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class b4 extends Drawable implements w6, gs {
    public final Paint a;
    public final Paint b;
    public final ImageReceiver c;
    public final ImageReceiver d;
    public int e;
    public final p5[] f;
    public final xy0 h;
    public final RectF n;
    public final boolean r;
    public final d6 s;
    public boolean w;
    public boolean x;
    public View y;

    public b4(TLRPC.User user) {
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.c = imageReceiver;
        this.d = new ImageReceiver(null);
        this.e = 1;
        this.f = new p5[2];
        this.n = new RectF();
        this.s = new d6(new a4(this, 1), 320L, nr.h, 0);
        this.r = false;
        int i7 = m6.d6;
        paint.setColor(m6.x0(null, i7, false));
        paint2.setColor(m6.x0(null, i7, false));
        paint2.setShadowLayer(org.telegram.messenger.g0.L(2.33f), 0.0f, org.telegram.messenger.g0.L(2.0f), m6.r1(0.18f, -16777216));
        b9 b9Var = new b9((h6) null);
        b9Var.r(user);
        imageReceiver.i0(user, b9Var, null);
        imageReceiver.J0(org.telegram.messenger.g0.L(16.0f));
        d();
        this.h = new xy0(p10.q(user), 14.0f, null);
    }

    @Override // org.telegram.ui.Components.w6
    public final void a(rh0 rh0Var) {
        this.y = rh0Var;
        this.d.H0(rh0Var);
        this.c.H0(rh0Var);
    }

    @Override // org.telegram.ui.Components.w6
    public final void b(ImageReceiver imageReceiver) {
        this.x = false;
        this.c.R();
        this.d.R();
        ls.f(k10.t0).n(this, ls.C1);
        p5[] p5VarArr = this.f;
        p5 p5Var = p5VarArr[0];
        if (p5Var != null) {
            p5Var.n(this.y);
        }
        p5 p5Var2 = p5VarArr[1];
        if (p5Var2 != null) {
            p5Var2.n(this.y);
        }
    }

    @Override // org.telegram.ui.Components.w6
    public final void c(ImageReceiver imageReceiver) {
        this.x = true;
        this.c.P();
        this.d.P();
        ls.f(k10.t0).c(this, ls.C1);
        p5[] p5VarArr = this.f;
        p5 p5Var = p5VarArr[0];
        if (p5Var != null) {
            p5Var.a(this.y);
        }
        p5 p5Var2 = p5VarArr[1];
        if (p5Var2 != null) {
            p5Var2.a(this.y);
        }
    }

    public final void d() {
        p5 p5Var;
        TLRPC.TL_messages_stickerSet o02 = si.d0(k10.t0).o0(new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
        if (o02 == null || o02.documents.isEmpty()) {
            this.w = true;
            return;
        }
        TLRPC.Document document = o02.documents.get((int) Math.floor(Math.random() * o02.documents.size()));
        int i7 = 1 - this.e;
        this.e = i7;
        p5[] p5VarArr = this.f;
        p5 p5Var2 = p5VarArr[i7];
        if (p5Var2 != null) {
            p5Var2.n(this.y);
        }
        p5VarArr[this.e] = p5.l(k10.t0, 9, document);
        p5VarArr[this.e].setColorFilter(new PorterDuffColorFilter(m6.x0(null, m6.Fi, false), PorterDuff.Mode.SRC_IN));
        if (this.x && (p5Var = p5VarArr[this.e]) != null) {
            p5Var.a(this.y);
        }
        org.telegram.messenger.g0.h3(new a4(this, 0), 2500L);
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ls.B0 && this.w && this.x) {
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
        p5 p5Var;
        p5 p5Var2;
        Rect bounds = getBounds();
        int x02 = m6.x0(null, m6.d6, false);
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
        this.h.c(org.telegram.messenger.g0.L(36.0f) + rectF.left, rectF.centerY(), 1.0f, m6.x0(null, m6.G6, false), canvas);
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
        p5[] p5VarArr = this.f;
        if (e10 >= 1.0f || (p5Var2 = p5VarArr[0]) == null) {
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
            p5Var2.setBounds(0, 0, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
            p5Var2.setAlpha((int) (f17 * 255.0f));
            p5Var2.draw(canvas);
            canvas.restore();
        }
        if (e10 > 0.0f && (p5Var = p5VarArr[1]) != null) {
            canvas.save();
            canvas.translate(0.0f, (f11 - e10) * org.telegram.messenger.g0.L(9.0f) * (this.e != 1 ? 1 : -1));
            float f19 = (0.4f * e10) + 0.6f;
            canvas.scale(f19, f19, org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(f12));
            p5Var.setBounds(0, 0, org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10));
            p5Var.setAlpha((int) (e10 * f13));
            p5Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    public b4(TLRPC.User user, TLRPC.Document document) {
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(null);
        this.d = imageReceiver2;
        this.e = 1;
        this.f = new p5[2];
        this.n = new RectF();
        this.s = new d6(new a4(this, 1), 320L, nr.h, 0);
        this.r = true;
        int i7 = m6.d6;
        paint.setColor(m6.x0(null, i7, false));
        paint2.setColor(m6.x0(null, i7, false));
        paint2.setShadowLayer(org.telegram.messenger.g0.L(2.33f), 0.0f, org.telegram.messenger.g0.L(2.0f), m6.r1(0.18f, -16777216));
        b9 b9Var = new b9((h6) null);
        b9Var.r(user);
        imageReceiver.i0(user, b9Var, null);
        imageReceiver.J0(org.telegram.messenger.g0.L(16.0f));
        imageReceiver2.r0(gc.b(document), "120_120", gc.c(w7.w(document.thumbs, 120, false, null, false), document), "120_120", u5.d(document.thumbs, m6.a7, 0.35f, false), 0L, null, null, 0);
        this.h = new xy0(p10.q(user), 14.0f, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
