package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class cj0 implements TextWatcher {
    public boolean a;
    public final /* synthetic */ EditTextBoldCursor b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ek0 d;

    public cj0(ek0 ek0Var, EditTextBoldCursor editTextBoldCursor, String str) {
        this.d = ek0Var;
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
        int i7 = 0;
        while (true) {
            if (i7 >= editable.length()) {
                z10 = false;
                break;
            }
            char charAt = editable.charAt(i7);
            if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && !((charAt >= '0' && charAt <= '9') || charAt == '-' || charAt == ' '))) {
                break;
            } else {
                i7++;
            }
        }
        this.a = false;
        EditTextBoldCursor editTextBoldCursor = this.b;
        if (z10) {
            editTextBoldCursor.setErrorText(org.telegram.messenger.hd.M0(2131747449, null));
        } else {
            ek0.N0(this.d, editTextBoldCursor, this.c, editable, false);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
