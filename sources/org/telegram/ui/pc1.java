package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class pc1 implements TextWatcher {
    public final /* synthetic */ qc1 a;

    public pc1(qc1 qc1Var) {
        this.a = qc1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        qc1 qc1Var = this.a;
        if (qc1Var.I) {
            return;
        }
        if (qc1Var.a.length() <= 0) {
            qc1Var.d.setText(qc1Var.H);
            return;
        }
        String str = "https://" + qc1Var.getMessagesController().linkPrefix + "/addtheme/" + ((Object) qc1Var.a.getText());
        String formatString = LocaleController.formatString("ThemeHelpLink", R.string.ThemeHelpLink, str);
        int indexOf = formatString.indexOf(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(str, qc1Var, 8), indexOf, str.length() + indexOf, 33);
        }
        qc1Var.d.setText(TextUtils.concat(qc1Var.H, "\n\n", spannableStringBuilder));
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        qc1 qc1Var = this.a;
        if (qc1Var.G) {
            return;
        }
        qc1Var.Z(qc1Var.a.getText().toString(), false);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
