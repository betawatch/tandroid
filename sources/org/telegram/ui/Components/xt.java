package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
