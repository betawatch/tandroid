package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class lb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditTextBoldCursor b;
    public final /* synthetic */ org.telegram.ui.ActionBar.h3[] c;

    public /* synthetic */ lb(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.h3[] h3VarArr, int i10) {
        this.a = i10;
        this.b = editTextBoldCursor;
        this.c = h3VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.c[0].setFocusable(true);
                EditTextBoldCursor editTextBoldCursor = this.b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new a3.d(editTextBoldCursor, 21));
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

    public /* synthetic */ lb(org.telegram.ui.ActionBar.h3[] h3VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.a = 0;
        this.c = h3VarArr;
        this.b = editTextBoldCursor;
    }
}
