package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ht implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditTextBoldCursor b;

    public /* synthetic */ ht(int i9, EditTextBoldCursor editTextBoldCursor) {
        this.a = i9;
        this.b = editTextBoldCursor;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                gh.o oVar = (gh.o) this.b;
                oVar.requestFocus();
                AndroidUtilities.showKeyboard(oVar);
                break;
            case 1:
                gh.o oVar2 = (gh.o) this.b;
                oVar2.requestFocus();
                AndroidUtilities.showKeyboard(oVar2);
                break;
            default:
                z3 z3Var = (z3) this.b;
                z3Var.requestFocus();
                AndroidUtilities.showKeyboard(z3Var);
                break;
        }
    }
}
