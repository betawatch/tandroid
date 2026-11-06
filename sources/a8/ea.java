package a8;

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public abstract class ea {
    public static void a(SpannableStringBuilder spannableStringBuilder, Object obj, int i7, int i10) {
        for (Object obj2 : spannableStringBuilder.getSpans(i7, i10, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i7 && spannableStringBuilder.getSpanEnd(obj2) == i10 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i7, i10, 33);
    }
}
