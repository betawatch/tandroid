package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qt implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditTextBoldCursor b;

    public /* synthetic */ qt(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.a = i10;
        this.b = editTextBoldCursor;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                lh.n nVar = (lh.n) this.b;
                nVar.requestFocus();
                AndroidUtilities.showKeyboard(nVar);
                break;
            case 1:
                lh.n nVar2 = (lh.n) this.b;
                nVar2.requestFocus();
                AndroidUtilities.showKeyboard(nVar2);
                break;
            default:
                a4 a4Var = (a4) this.b;
                a4Var.requestFocus();
                AndroidUtilities.showKeyboard(a4Var);
                break;
        }
    }
}
