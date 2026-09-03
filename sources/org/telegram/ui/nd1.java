package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class nd1 implements TextWatcher {
    public final /* synthetic */ od1 a;

    public nd1(od1 od1Var) {
        this.a = od1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        od1 od1Var = this.a;
        if (od1Var.F) {
            return;
        }
        if (od1Var.a.length() <= 0) {
            od1Var.d.setText(od1Var.E);
            return;
        }
        String str = "https://" + od1Var.getMessagesController().linkPrefix + "/addtheme/" + ((Object) od1Var.a.getText());
        String formatString = LocaleController.formatString("ThemeHelpLink", R.string.ThemeHelpLink, str);
        int indexOf = formatString.indexOf(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(str, od1Var, 8), indexOf, str.length() + indexOf, 33);
        }
        od1Var.d.setText(TextUtils.concat(od1Var.E, "\n\n", spannableStringBuilder));
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        od1 od1Var = this.a;
        if (od1Var.D) {
            return;
        }
        od1Var.Z(od1Var.a.getText().toString(), false);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
