package lh;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditTextBoldCursor b;

    public /* synthetic */ j(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.a = i10;
        this.b = editTextBoldCursor;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                eh.b bVar = (eh.b) this.b;
                bVar.requestFocus();
                AndroidUtilities.showKeyboard(bVar);
                break;
            case 1:
                u2 u2Var = (u2) this.b;
                u2Var.requestFocus();
                AndroidUtilities.showKeyboard(u2Var);
                break;
            case 2:
                vf.n nVar = (vf.n) this.b;
                nVar.requestFocus();
                AndroidUtilities.showKeyboard(nVar);
                break;
            default:
                EditTextBoldCursor editTextBoldCursor = this.b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                break;
        }
    }
}
