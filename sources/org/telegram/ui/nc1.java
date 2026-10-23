package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class nc1 implements TextWatcher {
    public final /* synthetic */ oc1 a;

    public nc1(oc1 oc1Var) {
        this.a = oc1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        oc1 oc1Var = this.a;
        if (oc1Var.I) {
            return;
        }
        if (oc1Var.a.length() <= 0) {
            oc1Var.d.setText(oc1Var.H);
            return;
        }
        String str = "https://" + oc1Var.getMessagesController().linkPrefix + "/addtheme/" + ((Object) oc1Var.a.getText());
        String formatString = LocaleController.formatString("ThemeHelpLink", R.string.ThemeHelpLink, str);
        int indexOf = formatString.indexOf(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(str, oc1Var, 8), indexOf, str.length() + indexOf, 33);
        }
        oc1Var.d.setText(TextUtils.concat(oc1Var.H, "\n\n", spannableStringBuilder));
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        oc1 oc1Var = this.a;
        if (oc1Var.G) {
            return;
        }
        oc1Var.Z(oc1Var.a.getText().toString(), false);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
