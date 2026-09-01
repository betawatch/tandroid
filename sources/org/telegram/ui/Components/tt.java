package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tt implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditTextBoldCursor b;

    public /* synthetic */ tt(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.a = i10;
        this.b = editTextBoldCursor;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                mh.m mVar = (mh.m) this.b;
                mVar.requestFocus();
                AndroidUtilities.showKeyboard(mVar);
                break;
            case 1:
                mh.m mVar2 = (mh.m) this.b;
                mVar2.requestFocus();
                AndroidUtilities.showKeyboard(mVar2);
                break;
            default:
                a4 a4Var = (a4) this.b;
                a4Var.requestFocus();
                AndroidUtilities.showKeyboard(a4Var);
                break;
        }
    }
}
