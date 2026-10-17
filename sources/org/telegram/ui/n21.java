package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p21 b;

    public /* synthetic */ n21(p21 p21Var, int i10) {
        this.a = i10;
        this.b = p21Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p21 p21Var = this.b;
                q21 q21Var = p21Var.v;
                if (p21Var.a != 0) {
                    q21Var.onBackPressed();
                    break;
                } else {
                    q21Var.dismiss();
                    break;
                }
            default:
                AndroidUtilities.showKeyboard(this.b.n.b);
                break;
        }
    }
}
