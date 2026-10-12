package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ge1 implements TextWatcher {
    public final /* synthetic */ he1 a;

    public ge1(he1 he1Var) {
        this.a = he1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        he1 he1Var = this.a;
        if (he1Var.I) {
            return;
        }
        if (he1Var.a.length() <= 0) {
            he1Var.d.setText(he1Var.H);
            return;
        }
        String str = "https://" + he1Var.getMessagesController().linkPrefix + "/addtheme/" + ((Object) he1Var.a.getText());
        String formatString = LocaleController.formatString("ThemeHelpLink", R.string.ThemeHelpLink, str);
        int indexOf = formatString.indexOf(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(str, he1Var, 8), indexOf, str.length() + indexOf, 33);
        }
        he1Var.d.setText(TextUtils.concat(he1Var.H, "\n\n", spannableStringBuilder));
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        he1 he1Var = this.a;
        if (he1Var.G) {
            return;
        }
        he1Var.Z(he1Var.a.getText().toString(), false);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
