package oh;

import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.eq;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public abstract class a {
    public static final SparseArray a = new SparseArray(6);

    public static SpannableStringBuilder a(int i7, CharSequence charSequence, boolean z10) {
        SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(charSequence);
        if (z10) {
            spannableStringBuilder.insert(0, (CharSequence) "* \u2068");
        } else {
            spannableStringBuilder.insert(0, (CharSequence) "* ");
        }
        SparseArray sparseArray = a;
        eq eqVar = (eq) sparseArray.get(i7);
        if (eqVar == null) {
            eqVar = new eq(i7, 0);
            eqVar.a(j6.Zl);
            sparseArray.put(i7, eqVar);
        }
        spannableStringBuilder.setSpan(eqVar, 0, 1, 33);
        if (z10) {
            spannableStringBuilder.append((char) 8297);
        }
        return spannableStringBuilder;
    }
}
