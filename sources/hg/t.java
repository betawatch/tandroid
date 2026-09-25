package hg;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditTextBoldCursor b;

    public /* synthetic */ t(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.a = i10;
        this.b = editTextBoldCursor;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                u uVar = (u) this.b;
                uVar.requestFocus();
                AndroidUtilities.showKeyboard(uVar);
                break;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                break;
            case 2:
                c6 c6Var = (c6) this.b;
                c6Var.requestFocus();
                AndroidUtilities.showKeyboard(c6Var);
                break;
            default:
                xh.a2 a2Var = (xh.a2) this.b;
                a2Var.requestFocus();
                AndroidUtilities.showKeyboard(a2Var);
                break;
        }
    }
}
