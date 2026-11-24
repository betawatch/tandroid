// default package

import android.text.SpannableStringBuilder;
import android.util.SparseArray;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class bf3 {
    public static final SparseArray a = new SparseArray(6);

    public static SpannableStringBuilder a(int i, CharSequence charSequence, boolean z) {
        SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(charSequence);
        if (z) {
            spannableStringBuilder.insert(0, (CharSequence) "* \u2068");
        } else {
            spannableStringBuilder.insert(0, (CharSequence) "* ");
        }
        SparseArray sparseArray = a;
        cm2 cm2Var = (cm2) sparseArray.get(i);
        if (cm2Var == null) {
            cm2Var = new cm2(i, 0);
            cm2Var.a(bkb.Yl);
            sparseArray.put(i, cm2Var);
        }
        spannableStringBuilder.setSpan(cm2Var, 0, 1, 33);
        if (z) {
            spannableStringBuilder.append((char) 8297);
        }
        return spannableStringBuilder;
    }
}
