package a8;

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
