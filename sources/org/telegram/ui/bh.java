package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class bh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditTextBoldCursor b;

    public /* synthetic */ bh(EditTextBoldCursor editTextBoldCursor, int i10) {
        this.a = i10;
        this.b = editTextBoldCursor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.J3(this.b);
                break;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.i0.J3(editTextBoldCursor);
                break;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = this.b;
                editTextBoldCursor2.requestFocus();
                org.telegram.messenger.i0.J3(editTextBoldCursor2);
                break;
            case 3:
                org.telegram.messenger.i0.J3(this.b);
                break;
            case 4:
                org.telegram.messenger.i0.J3(this.b);
                break;
            default:
                EditTextBoldCursor editTextBoldCursor3 = this.b;
                editTextBoldCursor3.requestFocus();
                org.telegram.messenger.i0.J3(editTextBoldCursor3);
                break;
        }
    }
}
