// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class nca extends Drawable implements zx, fn7 {
    public final Paint a;
    public final Paint b;
    public final ImageReceiver c;
    public final ImageReceiver d;
    public int e;
    public final wl[] f;
    public final pkb h;
    public final RectF n;
    public final boolean r;
    public final mm s;
    public boolean w;
    public boolean x;
    public e29 y;

    public nca(TLRPC.User user, TLRPC.Document document) {
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(null);
        this.d = imageReceiver2;
        this.e = 1;
        this.f = new wl[2];
        this.n = new RectF();
        this.s = new mm(new mca(this, (byte) 1), 320L, k43.h, 0);
        this.r = true;
        int i = aob.d6;
        paint.setColor(aob.w0(null, i, false));
        paint2.setColor(aob.w0(null, i, false));
        paint2.setShadowLayer(hl.L(2.33f), 0.0f, hl.L(2.0f), aob.p1(0.18f, -16777216));
        rb0 rb0Var = new rb0((vnb) null);
        rb0Var.q(user);
        imageReceiver.U(user, rb0Var, null);
        imageReceiver.q0(hl.L(16.0f));
        imageReceiver2.Z(jn5.b(document), "120_120", jn5.c(xb4.w(document.thumbs, jn7.E1, false, null, false), document), "120_120", lp3.d(document.thumbs, aob.a7, 0.35f, false), 0L, null, null, 0);
        this.h = new pkb(lbc.r(user), 14.0f, null);
    }

    @Override // zx
    public final void a(e29 e29Var) {
        this.y = e29Var;
        this.d.p0(e29Var);
        this.c.p0(e29Var);
    }

    @Override // zx
    public final void b(ImageReceiver imageReceiver) {
        this.x = false;
        this.c.K();
        this.d.K();
        jn7.f(yac.t0).n(this, jn7.C1);
        wl[] wlVarArr = this.f;
        wl wlVar = wlVarArr[0];
        if (wlVar != null) {
            wlVar.o(this.y);
        }
        wl wlVar2 = wlVarArr[1];
        if (wlVar2 != null) {
            wlVar2.o(this.y);
        }
    }

    @Override // zx
    public final void c(ImageReceiver imageReceiver) {
        this.x = true;
        this.c.I();
        this.d.I();
        jn7.f(yac.t0).b(this, jn7.C1);
        wl[] wlVarArr = this.f;
        wl wlVar = wlVarArr[0];
        if (wlVar != null) {
            wlVar.b(this.y);
        }
        wl wlVar2 = wlVarArr[1];
        if (wlVar2 != null) {
            wlVar2.b(this.y);
        }
    }

    public final void d() {
        wl wlVar;
        TLRPC.TL_messages_stickerSet n0 = ls6.d0(yac.t0).n0(new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
        if (n0 == null || n0.documents.isEmpty()) {
            this.w = true;
            return;
        }
        TLRPC.Document document = n0.documents.get((int) Math.floor(Math.random() * n0.documents.size()));
        int i = 1 - this.e;
        this.e = i;
        wl[] wlVarArr = this.f;
        wl wlVar2 = wlVarArr[i];
        if (wlVar2 != null) {
            wlVar2.o(this.y);
        }
        wlVarArr[this.e] = wl.l(yac.t0, 9, document);
        wlVarArr[this.e].setColorFilter(new PorterDuffColorFilter(aob.w0(null, aob.Fi, false), PorterDuff.Mode.SRC_IN));
        if (this.x && (wlVar = wlVarArr[this.e]) != null) {
            wlVar.b(this.y);
        }
        hl.d3(new mca(this, (byte) 0), 2500L);
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.B0 && this.w && this.x) {
            this.w = false;
            d();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        wl wlVar;
        wl wlVar2;
        Rect bounds = getBounds();
        int w0 = aob.w0(null, aob.d6, false);
        Paint paint = this.a;
        if (paint.getColor() != w0) {
            paint.setColor(w0);
        }
        Paint paint2 = this.b;
        if (paint2.getColor() != w0) {
            paint2.setColor(w0);
        }
        boolean z = this.r;
        float L = hl.L((z ? 48 : 28) + 38 + 6.66f) + this.h.c;
        float f5 = L / 2.0f;
        float L2 = hl.L(32.0f) / 2.0f;
        RectF rectF = this.n;
        rectF.set(bounds.centerX() - f5, bounds.centerY() - L2, bounds.centerX() + f5, bounds.centerY() + L2);
        canvas.drawRoundRect(rectF, L2, L2, paint);
        float f6 = rectF.left;
        float f7 = rectF.top;
        float L3 = hl.L(32.0f);
        float L4 = hl.L(32.0f);
        ImageReceiver imageReceiver = this.c;
        imageReceiver.i0(f6, f7, L3, L4);
        imageReceiver.h(canvas, null);
        this.h.c(hl.L(36.0f) + rectF.left, rectF.centerY(), 1.0f, aob.w0(null, aob.G6, false), canvas);
        if (z) {
            float L5 = rectF.right - hl.L(22.66f);
            canvas.drawCircle(L5, rectF.centerY(), hl.L(24.0f), paint2);
            float centerY = rectF.centerY() - hl.L(16.0f);
            float L6 = hl.L(32.0f);
            float L7 = hl.L(32.0f);
            ImageReceiver imageReceiver2 = this.d;
            imageReceiver2.i0(L5 - hl.L(16.0f), centerY, L6, L7);
            imageReceiver2.h(canvas, null);
            return;
        }
        float e = this.s.e(false, this.e);
        canvas.save();
        canvas.translate((int) (rectF.right - hl.L(30.66f)), (int) (rectF.centerY() - hl.L(12.0f)));
        wl[] wlVarArr = this.f;
        if (e >= 1.0f || (wlVar2 = wlVarArr[0]) == null) {
            f = 24.0f;
            f2 = 1.0f;
            f3 = 12.0f;
            f4 = 255.0f;
        } else {
            canvas.save();
            f = 24.0f;
            canvas.translate(0.0f, (this.e == 0 ? -1 : 1) * hl.L(9.0f) * e);
            float f8 = 1.0f - e;
            f2 = 1.0f;
            float f9 = (f8 * 0.4f) + 0.6f;
            f3 = 12.0f;
            f4 = 255.0f;
            canvas.scale(f9, f9, hl.L(12.0f), hl.L(12.0f));
            wlVar2.setBounds(0, 0, hl.L(24.0f), hl.L(24.0f));
            wlVar2.setAlpha((int) (f8 * 255.0f));
            wlVar2.draw(canvas);
            canvas.restore();
        }
        if (e > 0.0f && (wlVar = wlVarArr[1]) != null) {
            canvas.save();
            canvas.translate(0.0f, (f2 - e) * hl.L(9.0f) * (this.e != 1 ? 1 : -1));
            float f10 = (0.4f * e) + 0.6f;
            canvas.scale(f10, f10, hl.L(f3), hl.L(f3));
            wlVar.setBounds(0, 0, hl.L(f), hl.L(f));
            wlVar.setAlpha((int) (e * f4));
            wlVar.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public nca(TLRPC.User user) {
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.c = imageReceiver;
        this.d = new ImageReceiver(null);
        this.e = 1;
        this.f = new wl[2];
        this.n = new RectF();
        this.s = new mm(new mca(this, (byte) 1), 320L, k43.h, 0);
        this.r = false;
        int i = aob.d6;
        paint.setColor(aob.w0(null, i, false));
        paint2.setColor(aob.w0(null, i, false));
        paint2.setShadowLayer(hl.L(2.33f), 0.0f, hl.L(2.0f), aob.p1(0.18f, -16777216));
        rb0 rb0Var = new rb0((vnb) null);
        rb0Var.q(user);
        imageReceiver.U(user, rb0Var, null);
        imageReceiver.q0(hl.L(16.0f));
        d();
        this.h = new pkb(lbc.r(user), 14.0f, null);
    }
}
