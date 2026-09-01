package ah;

import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.oq;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public abstract class a {
    public static final SparseArray a = new SparseArray(6);

    public static SpannableStringBuilder a(int i10, CharSequence charSequence, boolean z4) {
        SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(charSequence);
        if (z4) {
            spannableStringBuilder.insert(0, (CharSequence) "* \u2068");
        } else {
            spannableStringBuilder.insert(0, (CharSequence) "* ");
        }
        SparseArray sparseArray = a;
        oq oqVar = (oq) sparseArray.get(i10);
        if (oqVar == null) {
            oqVar = new oq(i10, 0);
            oqVar.setColorKey(k6.il);
            sparseArray.put(i10, oqVar);
        }
        spannableStringBuilder.setSpan(oqVar, 0, 1, 33);
        if (z4) {
            spannableStringBuilder.append((char) 8297);
        }
        return spannableStringBuilder;
    }
}
