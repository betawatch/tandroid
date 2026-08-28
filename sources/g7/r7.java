package g7;

import android.graphics.Paint;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.widget.TextView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class r7 {
    public static p0.c a(m.a1 a1Var) {
        int i9;
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            return new p0.c(d1.f.p(a1Var));
        }
        TextPaint textPaint = new TextPaint(a1Var.getPaint());
        if (i11 >= 23) {
            i9 = 1;
            i10 = 1;
        } else {
            i9 = 0;
            i10 = 0;
        }
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        if (i11 >= 23) {
            i9 = e0.b.c(a1Var);
            i10 = e0.b.g(a1Var);
        }
        if (a1Var.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i11 < 28 || (a1Var.getInputType() & 15) != 3) {
            boolean z10 = a1Var.getLayoutDirection() == 1;
            switch (a1Var.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z10) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(d1.f.h(androidx.emoji2.text.v.e(a1Var.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new p0.c(textPaint, textDirectionHeuristic, i9, i10);
    }

    public static void b(int i9, TextView textView) {
        if (i9 < 0) {
            throw new IllegalArgumentException();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            d1.f.v(i9, textView);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i10 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i9 > Math.abs(i10)) {
            textView.setPadding(textView.getPaddingLeft(), i9 + i10, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void c(int i9, TextView textView) {
        if (i9 < 0) {
            throw new IllegalArgumentException();
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i10 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i9 > Math.abs(i10)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i9 - i10);
        }
    }

    public static ActionMode.Callback d(ActionMode.Callback callback) {
        return (!(callback instanceof u0.i) || Build.VERSION.SDK_INT < 26) ? callback : ((u0.i) callback).a;
    }

    public static ActionMode.Callback e(ActionMode.Callback callback, TextView textView) {
        int i9 = Build.VERSION.SDK_INT;
        return (i9 < 26 || i9 > 27 || (callback instanceof u0.i) || callback == null) ? callback : new u0.i(callback, textView);
    }
}
