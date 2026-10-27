package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l2 implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditTextBoldCursor b;

    public /* synthetic */ l2(EditTextBoldCursor editTextBoldCursor, int i10) {
        this.a = i10;
        this.b = editTextBoldCursor;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                h4 h4Var = (h4) this.b;
                h4Var.requestFocus();
                AndroidUtilities.showKeyboard(h4Var);
                break;
            case 1:
                jg.a1 a1Var = (jg.a1) this.b;
                a1Var.requestFocus();
                AndroidUtilities.showKeyboard(a1Var);
                break;
            default:
                AndroidUtilities.runOnUIThread(new p70(this.b, 4));
                break;
        }
    }
}
