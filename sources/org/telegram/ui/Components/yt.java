package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class yt implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditTextBoldCursor b;

    public /* synthetic */ yt(int i10, EditTextBoldCursor editTextBoldCursor) {
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
                f4 f4Var = (f4) this.b;
                f4Var.requestFocus();
                AndroidUtilities.showKeyboard(f4Var);
                break;
        }
    }
}
