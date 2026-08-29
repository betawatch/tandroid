package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ot implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditTextBoldCursor b;

    public /* synthetic */ ot(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.a = i10;
        this.b = editTextBoldCursor;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                jh.m mVar = (jh.m) this.b;
                mVar.requestFocus();
                AndroidUtilities.showKeyboard(mVar);
                break;
            case 1:
                jh.m mVar2 = (jh.m) this.b;
                mVar2.requestFocus();
                AndroidUtilities.showKeyboard(mVar2);
                break;
            default:
                d4 d4Var = (d4) this.b;
                d4Var.requestFocus();
                AndroidUtilities.showKeyboard(d4Var);
                break;
        }
    }
}
