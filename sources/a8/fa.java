package a8;

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public abstract class fa {
    public static void a(SpannableStringBuilder spannableStringBuilder, Object obj, int i7, int i10) {
        for (Object obj2 : spannableStringBuilder.getSpans(i7, i10, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i7 && spannableStringBuilder.getSpanEnd(obj2) == i10 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i7, i10, 33);
    }
}
