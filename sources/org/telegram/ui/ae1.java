package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class ae1 implements TextWatcher {
    public final /* synthetic */ be1 a;

    public ae1(be1 be1Var) {
        this.a = be1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        be1 be1Var = this.a;
        if (be1Var.I) {
            return;
        }
        if (be1Var.a.length() <= 0) {
            be1Var.d.setText(be1Var.H);
            return;
        }
        String str = "https://" + be1Var.getMessagesController().linkPrefix + "/addtheme/" + ((Object) be1Var.a.getText());
        String formatString = LocaleController.formatString("ThemeHelpLink", R.string.ThemeHelpLink, str);
        int indexOf = formatString.indexOf(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(str, be1Var, 8), indexOf, str.length() + indexOf, 33);
        }
        be1Var.d.setText(TextUtils.concat(be1Var.H, "\n\n", spannableStringBuilder));
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        be1 be1Var = this.a;
        if (be1Var.G) {
            return;
        }
        be1Var.Z(be1Var.a.getText().toString(), false);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
