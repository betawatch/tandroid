package fh;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditTextBoldCursor b;

    public /* synthetic */ k(int i9, EditTextBoldCursor editTextBoldCursor) {
        this.a = i9;
        this.b = editTextBoldCursor;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                s sVar = (s) this.b;
                sVar.requestFocus();
                AndroidUtilities.showKeyboard(sVar);
                break;
            case 1:
                g3 g3Var = (g3) this.b;
                g3Var.requestFocus();
                AndroidUtilities.showKeyboard(g3Var);
                break;
            case 2:
                pf.o oVar = (pf.o) this.b;
                oVar.requestFocus();
                AndroidUtilities.showKeyboard(oVar);
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
