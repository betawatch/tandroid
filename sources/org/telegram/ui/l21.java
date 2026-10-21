package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n21 b;

    public /* synthetic */ l21(n21 n21Var, int i10) {
        this.a = i10;
        this.b = n21Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n21 n21Var = this.b;
                o21 o21Var = n21Var.v;
                if (n21Var.a != 0) {
                    o21Var.onBackPressed();
                    break;
                } else {
                    o21Var.dismiss();
                    break;
                }
            default:
                AndroidUtilities.showKeyboard(this.b.n.b);
                break;
        }
    }
}
