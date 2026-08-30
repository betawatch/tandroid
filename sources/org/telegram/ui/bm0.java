package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class bm0 implements TextWatcher {
    public final /* synthetic */ EditTextBoldCursor a;
    public final /* synthetic */ String b;
    public final /* synthetic */ dn0 c;

    public bm0(dn0 dn0Var, EditTextBoldCursor editTextBoldCursor, String str) {
        this.c = dn0Var;
        this.a = editTextBoldCursor;
        this.b = str;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z4;
        EditTextBoldCursor editTextBoldCursor = this.a;
        int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
        int i10 = 0;
        while (true) {
            if (i10 >= editable.length()) {
                z4 = false;
                break;
            }
            char charAt = editable.charAt(i10);
            if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && !((charAt >= 'A' && charAt <= 'Z') || charAt == ' ' || charAt == '\'' || charAt == ',' || charAt == '.' || charAt == '&' || charAt == '-' || charAt == '/'))) {
                z4 = true;
                break;
            }
            i10++;
        }
        dn0 dn0Var = this.c;
        if (z4 && !dn0Var.r0) {
            editTextBoldCursor.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
        } else {
            dn0Var.q0[intValue] = z4;
            dn0.J0(dn0Var, editTextBoldCursor, this.b, editable, false);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
