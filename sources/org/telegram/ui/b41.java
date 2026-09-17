package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b41 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d41 b;

    public /* synthetic */ b41(d41 d41Var, int i10) {
        this.a = i10;
        this.b = d41Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d41 d41Var = this.b;
                e41 e41Var = d41Var.v;
                if (d41Var.a != 0) {
                    e41Var.onBackPressed();
                    break;
                } else {
                    e41Var.dismiss();
                    break;
                }
            default:
                AndroidUtilities.showKeyboard(this.b.n.b);
                break;
        }
    }
}
