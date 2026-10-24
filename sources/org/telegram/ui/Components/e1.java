package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
