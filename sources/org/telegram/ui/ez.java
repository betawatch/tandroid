package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ez implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditTextBoldCursor b;

    public /* synthetic */ ez(EditTextBoldCursor editTextBoldCursor, int i10) {
        this.a = i10;
        this.b = editTextBoldCursor;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.v1(this.b);
                break;
            case 1:
                org.telegram.messenger.i0.v1(this.b);
                break;
            default:
                org.telegram.messenger.i0.v1(this.b);
                break;
        }
    }
}
