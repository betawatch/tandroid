package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class fm0 implements TextWatcher {
    public boolean a;
    public final /* synthetic */ EditTextBoldCursor b;
    public final /* synthetic */ String c;
    public final /* synthetic */ kn0 d;

    public fm0(kn0 kn0Var, EditTextBoldCursor editTextBoldCursor, String str) {
        this.d = kn0Var;
        this.b = editTextBoldCursor;
        this.c = str;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (this.a) {
            return;
        }
        boolean z10 = true;
        this.a = true;
        int i10 = 0;
        while (true) {
            if (i10 >= editable.length()) {
                z10 = false;
                break;
            }
            char charAt = editable.charAt(i10);
            if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && !((charAt >= '0' && charAt <= '9') || charAt == '-' || charAt == ' '))) {
                break;
            } else {
                i10++;
            }
        }
        this.a = false;
        EditTextBoldCursor editTextBoldCursor = this.b;
        if (z10) {
            editTextBoldCursor.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
        } else {
            kn0.J0(this.d, editTextBoldCursor, this.c, editable, false);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
