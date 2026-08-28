package hg;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class u0 extends kh.d {
    public SpannableStringBuilder d0;

    public void setLvlRequiredState(int i9) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.d0).append((CharSequence) LocaleController.formatPluralString("ReactionLevelRequiredBtn", i9, new Object[0]));
        f(spannableStringBuilder, true);
    }
}
