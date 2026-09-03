package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditTextBoldCursor b;

    public /* synthetic */ q1(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.a = i10;
        this.b = editTextBoldCursor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = this.b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
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
                AndroidUtilities.showKeyboard(this.b);
                break;
            case 5:
                AndroidUtilities.showKeyboard(this.b);
                break;
            case 6:
                EditTextBoldCursor editTextBoldCursor2 = this.b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                break;
            default:
                EditTextBoldCursor editTextBoldCursor3 = this.b;
                editTextBoldCursor3.requestFocus();
                editTextBoldCursor3.setSelection(0, editTextBoldCursor3.length());
                AndroidUtilities.showKeyboard(editTextBoldCursor3);
                break;
        }
    }
}
