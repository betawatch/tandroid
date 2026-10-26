package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
