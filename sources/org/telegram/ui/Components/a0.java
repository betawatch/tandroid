package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class a0 extends ReplacementSpan {
    public static final /* synthetic */ int d = 0;
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public a0(View[] viewArr) {
        this.a = 2;
        this.b = new pr(0.33d, 0.0d, 0.67d, 1.0d);
        this.c = viewArr;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        switch (this.a) {
            case 0:
                float f11 = (i12 + i14) / 2.0f;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f10, f11 - AndroidUtilities.dp(7.66f), ((l01) this.c).c + f10 + AndroidUtilities.dp(6.66f), AndroidUtilities.dp(7.66f) + f11);
                canvas.saveLayerAlpha(rectF, 255, 31);
                Paint paint2 = (Paint) this.b;
                paint2.setColor(paint.getColor());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), paint2);
                ((l01) this.c).c(AndroidUtilities.dp(3.33f) + f10, f11, 1.0f, -1, canvas);
                canvas.restore();
                break;
            case 1:
                float dpf2 = AndroidUtilities.dpf2(14.66f);
                float f12 = (i12 + i14) / 2.0f;
                RectF rectF2 = AndroidUtilities.rectTmp;
                float f13 = dpf2 / 2.0f;
                rectF2.set(f10, f12 - f13, ((int) (((l01) this.c).c + AndroidUtilities.dp(10.0f))) + f10, f13 + f12);
                Paint paint3 = (Paint) this.b;
                int i15 = org.telegram.ui.ActionBar.k6.z6;
                paint3.setColor(org.telegram.ui.ActionBar.k6.l1(0.15f, org.telegram.ui.ActionBar.k6.w0(null, i15, false)));
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint3);
                ((l01) this.c).c(f10 + AndroidUtilities.dp(5.0f), f12, Utilities.clamp((paint.getAlpha() * 2) / 255.0f, 1.0f, 0.0f), org.telegram.ui.ActionBar.k6.w0(null, i15, false), canvas);
                break;
            default:
                pr prVar = (pr) this.b;
                canvas.save();
                canvas.translate(f10 + AndroidUtilities.dp(4.0f), i13 / 2.0f);
                long uptimeMillis = (SystemClock.uptimeMillis() % 250) + 500;
                for (int i16 = 0; i16 < 3; i16++) {
                    float min = Math.min(1.0f, (((i16 * 250) + uptimeMillis) % 750) / 667.0f);
                    canvas.drawCircle(AndroidUtilities.dpf2((prVar.getInterpolation(min) * 16.0f) + 1.667f), AndroidUtilities.dp(3.0f), AndroidUtilities.dpf2((min <= 0.425f ? prVar.getInterpolation(min / 0.425f) : 1.0f - prVar.getInterpolation((min - 0.425f) / 0.575f)) * 2.0f), paint);
                }
                canvas.restore();
                for (View view : (View[]) this.c) {
                    view.invalidate();
                }
                break;
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.a) {
            case 0:
                return (int) (((l01) this.c).c + AndroidUtilities.dp(6.66f));
            case 1:
                return (int) (((l01) this.c).c + AndroidUtilities.dp(10.0f));
            default:
                return AndroidUtilities.dp(20.0f);
        }
    }

    public a0(int i10) {
        this.a = 1;
        this.b = new Paint(1);
        this.c = new l01(LocaleController.formatPluralString("BusinessRepliesMore", i10, new Object[0]), 9.33f, AndroidUtilities.bold());
    }

    public a0() {
        this.a = 0;
        this.b = new Paint(1);
        l01 l01Var = new l01("x50", 13.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
        this.c = l01Var;
        l01Var.a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }
}
