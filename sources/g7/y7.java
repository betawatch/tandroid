package g7;

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class y7 {
    public static void a(Object obj, SpannableStringBuilder spannableStringBuilder, int i9, int i10) {
        for (Object obj2 : spannableStringBuilder.getSpans(i9, i10, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i9 && spannableStringBuilder.getSpanEnd(obj2) == i10 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i9, i10, 33);
    }
}
