package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditTextBoldCursor b;
    public final /* synthetic */ org.telegram.ui.ActionBar.g3[] c;

    public /* synthetic */ q8(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.g3[] g3VarArr, int i10) {
        this.a = i10;
        this.b = editTextBoldCursor;
        this.c = g3VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.c[0].setFocusable(true);
                EditTextBoldCursor editTextBoldCursor = this.b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new b(editTextBoldCursor, 13));
                break;
            case 1:
                AndroidUtilities.hideKeyboard(this.b);
                this.c[0].dismiss();
                break;
            default:
                AndroidUtilities.hideKeyboard(this.b);
                this.c[0].dismiss();
                break;
        }
    }

    public /* synthetic */ q8(org.telegram.ui.ActionBar.g3[] g3VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.a = 0;
        this.c = g3VarArr;
        this.b = editTextBoldCursor;
    }
}
