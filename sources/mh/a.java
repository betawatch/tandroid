package mh;

import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.pq;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
        pq pqVar = (pq) sparseArray.get(i10);
        if (pqVar == null) {
            pqVar = new pq(i10, 0);
            pqVar.setColorKey(h6.il);
            sparseArray.put(i10, pqVar);
        }
        spannableStringBuilder.setSpan(pqVar, 0, 1, 33);
        if (z10) {
            spannableStringBuilder.append((char) 8297);
        }
        return spannableStringBuilder;
    }
}
