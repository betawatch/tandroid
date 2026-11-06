package oh;

import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.wp;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public abstract class a {
    public static final SparseArray a = new SparseArray(6);

    public static SpannableStringBuilder a(int i7, CharSequence charSequence, boolean z9) {
        SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(charSequence);
        if (z9) {
            spannableStringBuilder.insert(0, (CharSequence) "* \u2068");
        } else {
            spannableStringBuilder.insert(0, (CharSequence) "* ");
        }
        SparseArray sparseArray = a;
        wp wpVar = (wp) sparseArray.get(i7);
        if (wpVar == null) {
            wpVar = new wp(i7, 0);
            wpVar.a(k6.Wl);
            sparseArray.put(i7, wpVar);
        }
        spannableStringBuilder.setSpan(wpVar, 0, 1, 33);
        if (z9) {
            spannableStringBuilder.append((char) 8297);
        }
        return spannableStringBuilder;
    }
}
