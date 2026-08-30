package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j31 b;

    public /* synthetic */ g31(j31 j31Var, int i10) {
        this.a = i10;
        this.b = j31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j31 j31Var = this.b;
                k31 k31Var = j31Var.v;
                if (j31Var.a != 0) {
                    k31Var.onBackPressed();
                    break;
                } else {
                    k31Var.dismiss();
                    break;
                }
            default:
                AndroidUtilities.showKeyboard(this.b.n.b);
                break;
        }
    }
}
