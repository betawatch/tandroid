package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class be1 implements TextWatcher {
    public final /* synthetic */ ce1 a;

    public be1(ce1 ce1Var) {
        this.a = ce1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ce1 ce1Var = this.a;
        if (ce1Var.I) {
            return;
        }
        if (ce1Var.a.length() <= 0) {
            ce1Var.d.setText(ce1Var.H);
            return;
        }
        String str = "https://" + ce1Var.getMessagesController().linkPrefix + "/addtheme/" + ((Object) ce1Var.a.getText());
        String formatString = LocaleController.formatString("ThemeHelpLink", R.string.ThemeHelpLink, str);
        int indexOf = formatString.indexOf(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(str, ce1Var, 8), indexOf, str.length() + indexOf, 33);
        }
        ce1Var.d.setText(TextUtils.concat(ce1Var.H, "\n\n", spannableStringBuilder));
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        ce1 ce1Var = this.a;
        if (ce1Var.G) {
            return;
        }
        ce1Var.Z(ce1Var.a.getText().toString(), false);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
