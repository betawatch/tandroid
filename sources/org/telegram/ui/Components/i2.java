package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i2 implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditTextBoldCursor b;

    public /* synthetic */ i2(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.a = i10;
        this.b = editTextBoldCursor;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                g4 g4Var = (g4) this.b;
                g4Var.requestFocus();
                AndroidUtilities.showKeyboard(g4Var);
                break;
            default:
                ig.y0 y0Var = (ig.y0) this.b;
                y0Var.requestFocus();
                AndroidUtilities.showKeyboard(y0Var);
                break;
        }
    }
}
