package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class fz implements TextWatcher {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ EditTextBoldCursor c;

    public /* synthetic */ fz(EditTextBoldCursor editTextBoldCursor, int i10) {
        this.a = i10;
        this.c = editTextBoldCursor;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
                if (!this.b && editable.length() > 32) {
                    this.b = true;
                    editable.delete(32, editable.length());
                    EditTextBoldCursor editTextBoldCursor = this.c;
                    org.telegram.messenger.i0.E3(editTextBoldCursor);
                    try {
                        editTextBoldCursor.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    this.b = false;
                    break;
                }
                break;
            default:
                if (!this.b && editable.length() > 40) {
                    this.b = true;
                    editable.delete(40, editable.length());
                    EditTextBoldCursor editTextBoldCursor2 = this.c;
                    org.telegram.messenger.i0.E3(editTextBoldCursor2);
                    try {
                        editTextBoldCursor2.performHapticFeedback(3, 2);
                    } catch (Exception unused2) {
                    }
                    this.b = false;
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void d(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
