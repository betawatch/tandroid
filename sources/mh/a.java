package mh;

import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.rq;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public abstract class a {
    public static final SparseArray a = new SparseArray(6);

    public static SpannableStringBuilder a(int i10, CharSequence charSequence, boolean z10) {
        SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(charSequence);
        if (z10) {
            spannableStringBuilder.insert(0, (CharSequence) "* \u2068");
        } else {
            spannableStringBuilder.insert(0, (CharSequence) "* ");
        }
        SparseArray sparseArray = a;
        rq rqVar = (rq) sparseArray.get(i10);
        if (rqVar == null) {
            rqVar = new rq(i10, 0);
            rqVar.setColorKey(i6.il);
            sparseArray.put(i10, rqVar);
        }
        spannableStringBuilder.setSpan(rqVar, 0, 1, 33);
        if (z10) {
            spannableStringBuilder.append((char) 8297);
        }
        return spannableStringBuilder;
    }
}
