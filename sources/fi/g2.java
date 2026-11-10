package fi;

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
import bi.nd;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class g2 extends f2 {
    public Drawable i;
    public Drawable j;
    public StaticLayout k;
    public float l;
    public float m;
    public Paint n;
    public final /* synthetic */ nd o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(nd ndVar, int i7, int i10, String str) {
        super(ndVar);
        this.o = ndVar;
        this.a = i7;
        Drawable mutate = ndVar.getContext().getResources().getDrawable(i10).mutate();
        this.i = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        String upperCase = str.toUpperCase();
        TextPaint textPaint = (TextPaint) ndVar.c;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(upperCase, textPaint, org.telegram.messenger.g0.q.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.k = staticLayout;
        this.l = staticLayout.getLineCount() > 0 ? this.k.getLineWidth(0) : 0.0f;
        this.m = this.k.getLineCount() > 0 ? this.k.getLineLeft(0) : 0.0f;
        this.b = org.telegram.messenger.g0.N(45.6f) + this.l;
        this.c = org.telegram.messenger.g0.N(36.0f);
    }

    @Override // fi.f2
    public final void a(Canvas canvas, float f10, float f11) {
        float f12 = this.b + f10;
        float f13 = this.c + f11;
        RectF rectF = this.f;
        rectF.set(f10, f11, f12, f13);
        float a10 = this.g.a(0.05f);
        canvas.save();
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), (Paint) this.o.b);
        if (this.j != null) {
            canvas.saveLayerAlpha(rectF, qs.e4, 31);
        }
        if (this.i == null) {
            org.telegram.messenger.e6 f14 = org.telegram.messenger.i6.f(null);
            this.i = f14;
            if (com.google.android.recaptcha.internal.a.u(f14)) {
                f14.a = false;
            }
        }
        if (this.i != null) {
            float L = org.telegram.messenger.g0.L(24.0f) / 2;
            this.i.setBounds((int) ((rectF.left + org.telegram.messenger.g0.L(18.0f)) - L), (int) (((this.c / 2.0f) + rectF.top) - L), (int) (rectF.left + org.telegram.messenger.g0.L(18.0f) + L), (int) ((this.c / 2.0f) + rectF.top + L));
            this.i.draw(canvas);
        }
        if (this.j != null) {
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(rectF.left + org.telegram.messenger.g0.L(18.55f), ((rectF.top + this.c) - org.telegram.messenger.g0.L(5.0f)) - org.telegram.messenger.g0.L(12.55f), rectF.left + org.telegram.messenger.g0.L(29.45f), rectF.left + org.telegram.messenger.g0.L(31.0f));
            canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), this.n);
            this.j.setBounds((int) (rectF.left + org.telegram.messenger.g0.L(18.0f)), (int) (((rectF.top + this.c) - org.telegram.messenger.g0.L(5.0f)) - org.telegram.messenger.g0.L(12.0f)), (int) (rectF.left + org.telegram.messenger.g0.L(30.0f)), (int) ((rectF.top + this.c) - org.telegram.messenger.g0.L(5.0f)));
            this.j.draw(canvas);
            canvas.restore();
        }
        canvas.translate((rectF.left + org.telegram.messenger.g0.L((this.i != null ? 28 : 0) + 6)) - this.m, ((this.c / 2.0f) + rectF.top) - (this.k.getHeight() / 2.0f));
        this.k.draw(canvas);
        canvas.restore();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(nd ndVar, CharSequence charSequence) {
        super(ndVar);
        this.o = ndVar;
        this.a = 5;
        TextPaint textPaint = (TextPaint) ndVar.c;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(charSequence, textPaint, org.telegram.messenger.g0.q.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.k = staticLayout;
        this.l = staticLayout.getLineCount() > 0 ? this.k.getLineWidth(0) : 0.0f;
        this.m = this.k.getLineCount() > 0 ? this.k.getLineLeft(0) : 0.0f;
        this.b = org.telegram.messenger.g0.N(12.0f) + this.l;
        this.c = org.telegram.messenger.g0.N(36.0f);
    }
}
