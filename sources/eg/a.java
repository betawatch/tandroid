package eg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import android.util.Pair;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.n6;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class a extends ReplacementSpan {
    public final Drawable a;
    public final Drawable b;
    public boolean c;
    public boolean d;
    public final n6 e;
    public final TextPaint f;
    public final int h;

    public a(org.telegram.ui.Cells.s1 s1Var, TextPaint textPaint, int i10) {
        this.f = textPaint;
        n6 n6Var = new n6(false, false, true, false);
        this.e = n6Var;
        n6Var.k(0.3f, 250L, jr.h);
        n6Var.setCallback(s1Var);
        n6Var.t(AndroidUtilities.dp(11.5f));
        n6Var.u(AndroidUtilities.bold());
        n6Var.q("", true, true);
        n6Var.b = 17;
        Drawable mutate = s1Var.getContext().getDrawable(R.drawable.mini_boost_profile_badge).mutate();
        this.a = mutate;
        Drawable mutate2 = s1Var.getContext().getDrawable(R.drawable.mini_boost_profile_badge2).mutate();
        this.b = mutate2;
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), mutate2.getIntrinsicHeight());
        this.h = i10;
        n6Var.q(i10 > 1 ? String.valueOf(i10) : "", false, true);
    }

    public static Pair a(org.telegram.ui.Cells.s1 s1Var, TextPaint textPaint, int i10) {
        SpannableString spannableString = new SpannableString("d");
        a aVar = new a(s1Var, textPaint, i10);
        spannableString.setSpan(aVar, 0, 1, 33);
        return new Pair(spannableString, aVar);
    }

    public final int b() {
        return (int) (this.e.e() + AndroidUtilities.dp((this.d ? 8 : 0) + 16));
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f9, int i12, int i13, int i14, Paint paint) {
        TextPaint textPaint = this.f;
        int color = textPaint.getColor();
        n6 n6Var = this.e;
        int color2 = n6Var.a.getColor();
        Drawable drawable = this.b;
        Drawable drawable2 = this.a;
        if (color != color2) {
            n6Var.r(textPaint.getColor());
            int color3 = n6Var.a.getColor();
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable2.setColorFilter(new PorterDuffColorFilter(color3, mode));
            drawable.setColorFilter(new PorterDuffColorFilter(n6Var.a.getColor(), mode));
        }
        canvas.save();
        canvas.translate(f9 + ((!this.d || this.c) ? 0 : AndroidUtilities.dp(8.0f)), -AndroidUtilities.dp(0.2f));
        if (this.h == 1) {
            canvas.translate(AndroidUtilities.dp(1.5f), 0.0f);
            drawable2.draw(canvas);
        } else {
            drawable.draw(canvas);
        }
        canvas.translate(AndroidUtilities.dp(16.0f), 0.0f);
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set(0, 0, (int) n6Var.d(), (int) n6Var.e);
        n6Var.setBounds(rect);
        n6Var.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return b();
    }
}
