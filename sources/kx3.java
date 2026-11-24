// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class kx3 extends jx3 {
    public Drawable i;
    public Drawable j;
    public StaticLayout k;
    public float l;
    public float m;
    public Paint n;
    public final /* synthetic */ nx3 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public kx3(nx3 nx3Var, int i, int i2, String str) {
        super(nx3Var);
        this.o = nx3Var;
        this.a = i;
        Drawable mutate = nx3Var.getContext().getResources().getDrawable(i2).mutate();
        this.i = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        String upperCase = str.toUpperCase();
        TextPaint textPaint = nx3Var.b;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(upperCase, textPaint, gm.q.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.k = staticLayout;
        this.l = staticLayout.getLineCount() > 0 ? this.k.getLineWidth(0) : 0.0f;
        this.m = this.k.getLineCount() > 0 ? this.k.getLineLeft(0) : 0.0f;
        this.b = gm.N(45.6f) + this.l;
        this.c = gm.N(36.0f);
    }

    @Override // jx3
    public final void a(Canvas canvas, float f, float f2) {
        float f3 = this.b + f;
        float f4 = this.c + f2;
        RectF rectF = this.f;
        rectF.set(f, f2, f3, f4);
        float a = this.g.a(0.05f);
        canvas.save();
        canvas.scale(a, a, rectF.centerX(), rectF.centerY());
        canvas.drawRoundRect(rectF, gm.L(8.0f), gm.L(8.0f), this.o.a);
        if (this.j != null) {
            canvas.saveLayerAlpha(rectF, nm7.d4, 31);
        }
        Drawable drawable = this.i;
        Drawable drawable2 = drawable;
        if (drawable == null) {
            cw3 f5 = gw3.f(null);
            this.i = f5;
            boolean A = wi8.A(f5);
            drawable2 = f5;
            if (A) {
                f5.a = false;
                drawable2 = f5;
            }
        }
        if (drawable2 != null) {
            float L = gm.L(24.0f) / 2;
            this.i.setBounds((int) ((rectF.left + gm.L(18.0f)) - L), (int) (((this.c / 2.0f) + rectF.top) - L), (int) (rectF.left + gm.L(18.0f) + L), (int) ((this.c / 2.0f) + rectF.top + L));
            this.i.draw(canvas);
        }
        if (this.j != null) {
            RectF rectF2 = gm.P;
            rectF2.set(rectF.left + gm.L(18.55f), ((rectF.top + this.c) - gm.L(5.0f)) - gm.L(12.55f), rectF.left + gm.L(29.45f), rectF.left + gm.L(31.0f));
            canvas.drawRoundRect(rectF2, gm.L(6.0f), gm.L(6.0f), this.n);
            this.j.setBounds((int) (rectF.left + gm.L(18.0f)), (int) (((rectF.top + this.c) - gm.L(5.0f)) - gm.L(12.0f)), (int) (rectF.left + gm.L(30.0f)), (int) ((rectF.top + this.c) - gm.L(5.0f)));
            this.j.draw(canvas);
            canvas.restore();
        }
        hg9.m(this.k.getHeight(), 2.0f, (this.c / 2.0f) + rectF.top, (rectF.left + gm.L(6 + (this.i != null ? 28 : 0))) - this.m, canvas);
        this.k.draw(canvas);
        canvas.restore();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kx3(nx3 nx3Var, CharSequence charSequence) {
        super(nx3Var);
        this.o = nx3Var;
        this.a = (byte) 5;
        TextPaint textPaint = nx3Var.b;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(charSequence, textPaint, gm.q.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.k = staticLayout;
        this.l = staticLayout.getLineCount() > 0 ? this.k.getLineWidth(0) : 0.0f;
        this.m = this.k.getLineCount() > 0 ? this.k.getLineLeft(0) : 0.0f;
        this.b = gm.N(12.0f) + this.l;
        this.c = gm.N(36.0f);
    }
}
