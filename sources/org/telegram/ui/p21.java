package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r21 b;

    public /* synthetic */ p21(r21 r21Var, int i10) {
        this.a = i10;
        this.b = r21Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r21 r21Var = this.b;
                s21 s21Var = r21Var.v;
                if (r21Var.a != 0) {
                    s21Var.onBackPressed();
                    break;
                } else {
                    s21Var.dismiss();
                    break;
                }
            default:
                AndroidUtilities.showKeyboard(this.b.n.d);
                break;
        }
    }
}
