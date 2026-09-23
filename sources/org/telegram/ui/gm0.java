package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class gm0 implements TextWatcher {
    public final /* synthetic */ EditTextBoldCursor a;
    public final /* synthetic */ String b;
    public final /* synthetic */ in0 c;

    public gm0(in0 in0Var, EditTextBoldCursor editTextBoldCursor, String str) {
        this.c = in0Var;
        this.a = editTextBoldCursor;
        this.b = str;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        EditTextBoldCursor editTextBoldCursor = this.a;
        int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
        int i10 = 0;
        while (true) {
            if (i10 >= editable.length()) {
                z10 = false;
                break;
            }
            char charAt = editable.charAt(i10);
            if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && !((charAt >= 'A' && charAt <= 'Z') || charAt == ' ' || charAt == '\'' || charAt == ',' || charAt == '.' || charAt == '&' || charAt == '-' || charAt == '/'))) {
                z10 = true;
                break;
            }
            i10++;
        }
        in0 in0Var = this.c;
        if (z10 && !in0Var.u0) {
            editTextBoldCursor.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
        } else {
            in0Var.t0[intValue] = z10;
            in0.J0(in0Var, editTextBoldCursor, this.b, editable, false);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
