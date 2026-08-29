package nh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class f2 extends e2 {
    public Drawable i;
    public Drawable j;
    public StaticLayout k;
    public float l;
    public float m;
    public Paint n;
    public final /* synthetic */ i2 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(i2 i2Var, int i10, int i11, String str) {
        super(i2Var);
        this.o = i2Var;
        this.a = i10;
        Drawable mutate = i2Var.getContext().getResources().getDrawable(i11).mutate();
        this.i = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        String upperCase = str.toUpperCase();
        TextPaint textPaint = i2Var.b;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(upperCase, textPaint, AndroidUtilities.displaySize.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.k = staticLayout;
        this.l = staticLayout.getLineCount() > 0 ? this.k.getLineWidth(0) : 0.0f;
        this.m = this.k.getLineCount() > 0 ? this.k.getLineLeft(0) : 0.0f;
        this.b = AndroidUtilities.dpf2(45.6f) + this.l;
        this.c = AndroidUtilities.dpf2(36.0f);
    }

    @Override // nh.e2
    public final void a(Canvas canvas, float f9, float f10) {
        float f11 = this.b + f9;
        float f12 = this.c + f10;
        RectF rectF = this.f;
        rectF.set(f9, f10, f11, f12);
        float a2 = this.g.a(0.05f);
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.o.a);
        if (this.j != null) {
            canvas.saveLayerAlpha(rectF, 255, 31);
        }
        if (this.i == null) {
            Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable(null);
            this.i = emojiBigDrawable;
            if (emojiBigDrawable instanceof Emoji.EmojiDrawable) {
                ((Emoji.EmojiDrawable) emojiBigDrawable).fullSize = false;
            }
        }
        if (this.i != null) {
            float dp = AndroidUtilities.dp(24.0f) / 2;
            this.i.setBounds((int) ((rectF.left + AndroidUtilities.dp(18.0f)) - dp), (int) (((this.c / 2.0f) + rectF.top) - dp), (int) (rectF.left + AndroidUtilities.dp(18.0f) + dp), (int) ((this.c / 2.0f) + rectF.top + dp));
            this.i.draw(canvas);
        }
        if (this.j != null) {
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(rectF.left + AndroidUtilities.dp(18.55f), ((rectF.top + this.c) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(12.55f), rectF.left + AndroidUtilities.dp(29.45f), rectF.left + AndroidUtilities.dp(31.0f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.n);
            this.j.setBounds((int) (rectF.left + AndroidUtilities.dp(18.0f)), (int) (((rectF.top + this.c) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(12.0f)), (int) (rectF.left + AndroidUtilities.dp(30.0f)), (int) ((rectF.top + this.c) - AndroidUtilities.dp(5.0f)));
            this.j.draw(canvas);
            canvas.restore();
        }
        canvas.translate((rectF.left + AndroidUtilities.dp((this.i != null ? 28 : 0) + 6)) - this.m, ((this.c / 2.0f) + rectF.top) - (this.k.getHeight() / 2.0f));
        this.k.draw(canvas);
        canvas.restore();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(i2 i2Var, CharSequence charSequence) {
        super(i2Var);
        this.o = i2Var;
        this.a = 5;
        TextPaint textPaint = i2Var.b;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(charSequence, textPaint, AndroidUtilities.displaySize.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.k = staticLayout;
        this.l = staticLayout.getLineCount() > 0 ? this.k.getLineWidth(0) : 0.0f;
        this.m = this.k.getLineCount() > 0 ? this.k.getLineLeft(0) : 0.0f;
        this.b = AndroidUtilities.dpf2(12.0f) + this.l;
        this.c = AndroidUtilities.dpf2(36.0f);
    }
}
