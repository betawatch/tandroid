package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ee1 implements TextWatcher {
    public final /* synthetic */ fe1 a;

    public ee1(fe1 fe1Var) {
        this.a = fe1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        fe1 fe1Var = this.a;
        if (fe1Var.I) {
            return;
        }
        if (fe1Var.a.length() <= 0) {
            fe1Var.d.setText(fe1Var.H);
            return;
        }
        String str = "https://" + fe1Var.getMessagesController().linkPrefix + "/addtheme/" + ((Object) fe1Var.a.getText());
        String formatString = LocaleController.formatString("ThemeHelpLink", R.string.ThemeHelpLink, str);
        int indexOf = formatString.indexOf(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(str, fe1Var, 8), indexOf, str.length() + indexOf, 33);
        }
        fe1Var.d.setText(TextUtils.concat(fe1Var.H, "\n\n", spannableStringBuilder));
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        fe1 fe1Var = this.a;
        if (fe1Var.G) {
            return;
        }
        fe1Var.Z(fe1Var.a.getText().toString(), false);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
