package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xt implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditTextBoldCursor b;

    public /* synthetic */ xt(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.a = i10;
        this.b = editTextBoldCursor;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                fi.o oVar = (fi.o) this.b;
                oVar.requestFocus();
                AndroidUtilities.showKeyboard(oVar);
                break;
            case 1:
                fi.o oVar2 = (fi.o) this.b;
                oVar2.requestFocus();
                AndroidUtilities.showKeyboard(oVar2);
                break;
            default:
                d4 d4Var = (d4) this.b;
                d4Var.requestFocus();
                AndroidUtilities.showKeyboard(d4Var);
                break;
        }
    }
}
