package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class jb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditTextBoldCursor b;
    public final /* synthetic */ org.telegram.ui.ActionBar.k3[] c;

    public /* synthetic */ jb(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.k3[] k3VarArr, int i10) {
        this.a = i10;
        this.b = editTextBoldCursor;
        this.c = k3VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.c[0].setFocusable(true);
                EditTextBoldCursor editTextBoldCursor = this.b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new u6(editTextBoldCursor, 3));
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

    public /* synthetic */ jb(org.telegram.ui.ActionBar.k3[] k3VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.a = 0;
        this.c = k3VarArr;
        this.b = editTextBoldCursor;
    }
}
