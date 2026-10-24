package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
