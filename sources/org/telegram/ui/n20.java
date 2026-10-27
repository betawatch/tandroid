package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n20 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x50 b;

    public /* synthetic */ n20(x50 x50Var, int i10) {
        this.a = i10;
        this.b = x50Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (this.b.x0 && (U instanceof wn)) {
                    ((wn) U).ga(true, true);
                    break;
                }
                break;
            case 1:
                this.b.dismiss();
                break;
            case 2:
                this.b.E1 = null;
                break;
            default:
                this.b.r0 = null;
                break;
        }
    }
}
