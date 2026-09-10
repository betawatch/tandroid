package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class x3 implements TextWatcher {
    public boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ EditTextBoldCursor c;

    public x3(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.b = i10;
        this.c = editTextBoldCursor;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (this.a) {
            return;
        }
        int length = editable.length();
        int i10 = this.b;
        if (length > i10) {
            this.a = true;
            editable.delete(i10, editable.length());
            EditTextBoldCursor editTextBoldCursor = this.c;
            AndroidUtilities.shakeView(editTextBoldCursor);
            try {
                editTextBoldCursor.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            this.a = false;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
