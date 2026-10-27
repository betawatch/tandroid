package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e1 implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f5 b;

    public /* synthetic */ e1(int i10, f5 f5Var) {
        this.a = i10;
        this.b = f5Var;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                f5 f5Var = this.b;
                f5Var.requestFocus();
                AndroidUtilities.showKeyboard(f5Var);
                break;
            case 1:
                f5 f5Var2 = this.b;
                f5Var2.requestFocus();
                AndroidUtilities.showKeyboard(f5Var2);
                break;
            default:
                AndroidUtilities.runOnUIThread(new pg(this.b, 3));
                break;
        }
    }
}
