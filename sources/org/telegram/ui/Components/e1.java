package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e1 implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e5 b;

    public /* synthetic */ e1(int i10, e5 e5Var) {
        this.a = i10;
        this.b = e5Var;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                e5 e5Var = this.b;
                e5Var.requestFocus();
                AndroidUtilities.showKeyboard(e5Var);
                break;
            case 1:
                e5 e5Var2 = this.b;
                e5Var2.requestFocus();
                AndroidUtilities.showKeyboard(e5Var2);
                break;
            default:
                AndroidUtilities.runOnUIThread(new pg(this.b, 4));
                break;
        }
    }
}
