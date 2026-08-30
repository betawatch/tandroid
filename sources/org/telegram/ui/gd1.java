package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class gd1 implements TextWatcher {
    public final /* synthetic */ hd1 a;

    public gd1(hd1 hd1Var) {
        this.a = hd1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        hd1 hd1Var = this.a;
        if (hd1Var.F) {
            return;
        }
        if (hd1Var.a.length() <= 0) {
            hd1Var.d.setText(hd1Var.E);
            return;
        }
        String str = "https://" + hd1Var.getMessagesController().linkPrefix + "/addtheme/" + ((Object) hd1Var.a.getText());
        String formatString = LocaleController.formatString("ThemeHelpLink", R.string.ThemeHelpLink, str);
        int indexOf = formatString.indexOf(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(str, hd1Var, 8), indexOf, str.length() + indexOf, 33);
        }
        hd1Var.d.setText(TextUtils.concat(hd1Var.E, "\n\n", spannableStringBuilder));
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        hd1 hd1Var = this.a;
        if (hd1Var.D) {
            return;
        }
        hd1Var.Z(hd1Var.a.getText().toString(), false);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
