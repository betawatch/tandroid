package a8;

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public abstract class ha {
    public static void a(SpannableStringBuilder spannableStringBuilder, Object obj, int i7, int i10) {
        for (Object obj2 : spannableStringBuilder.getSpans(i7, i10, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i7 && spannableStringBuilder.getSpanEnd(obj2) == i10 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i7, i10, 33);
    }
}
