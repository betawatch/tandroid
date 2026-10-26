package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                AndroidUtilities.runOnUIThread(new o70(this.b, 4));
                break;
        }
    }
}
