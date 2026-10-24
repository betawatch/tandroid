package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditTextBoldCursor b;

    public /* synthetic */ n70(EditTextBoldCursor editTextBoldCursor, int i10) {
        this.a = i10;
        this.b = editTextBoldCursor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.showKeyboard(this.b);
                break;
            case 1:
                AndroidUtilities.showKeyboard(this.b);
                break;
            case 2:
                AndroidUtilities.showKeyboard(this.b);
                break;
            case 3:
                AndroidUtilities.showKeyboard(this.b);
                break;
            case 4:
                EditTextBoldCursor editTextBoldCursor = this.b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                break;
            default:
                EditTextBoldCursor editTextBoldCursor2 = this.b;
                editTextBoldCursor2.requestFocus();
                editTextBoldCursor2.setSelection(0, editTextBoldCursor2.length());
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                break;
        }
    }
}
