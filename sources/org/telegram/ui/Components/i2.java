package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i2 implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditTextBoldCursor b;

    public /* synthetic */ i2(EditTextBoldCursor editTextBoldCursor, int i10) {
        this.a = i10;
        this.b = editTextBoldCursor;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                f4 f4Var = (f4) this.b;
                f4Var.requestFocus();
                AndroidUtilities.showKeyboard(f4Var);
                break;
            case 1:
                ig.z0 z0Var = (ig.z0) this.b;
                z0Var.requestFocus();
                AndroidUtilities.showKeyboard(z0Var);
                break;
            default:
                AndroidUtilities.runOnUIThread(new n70(this.b, 4));
                break;
        }
    }
}
