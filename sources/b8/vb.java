package b8;

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class vb {
    public static void a(SpannableStringBuilder spannableStringBuilder, Object obj, int i3, int i10) {
        for (Object obj2 : spannableStringBuilder.getSpans(i3, i10, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i3 && spannableStringBuilder.getSpanEnd(obj2) == i10 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i3, i10, 33);
    }
}
