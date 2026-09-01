package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class id1 implements TextWatcher {
    public final /* synthetic */ jd1 a;

    public id1(jd1 jd1Var) {
        this.a = jd1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        jd1 jd1Var = this.a;
        if (jd1Var.F) {
            return;
        }
        if (jd1Var.a.length() <= 0) {
            jd1Var.d.setText(jd1Var.E);
            return;
        }
        String str = "https://" + jd1Var.getMessagesController().linkPrefix + "/addtheme/" + ((Object) jd1Var.a.getText());
        String formatString = LocaleController.formatString("ThemeHelpLink", R.string.ThemeHelpLink, str);
        int indexOf = formatString.indexOf(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(str, jd1Var, 8), indexOf, str.length() + indexOf, 33);
        }
        jd1Var.d.setText(TextUtils.concat(jd1Var.E, "\n\n", spannableStringBuilder));
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        jd1 jd1Var = this.a;
        if (jd1Var.D) {
            return;
        }
        jd1Var.Z(jd1Var.a.getText().toString(), false);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
