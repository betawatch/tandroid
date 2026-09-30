package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s31 b;

    public /* synthetic */ q31(s31 s31Var, int i10) {
        this.a = i10;
        this.b = s31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s31 s31Var = this.b;
                t31 t31Var = s31Var.v;
                if (s31Var.a != 0) {
                    t31Var.onBackPressed();
                    break;
                } else {
                    t31Var.dismiss();
                    break;
                }
            default:
                AndroidUtilities.showKeyboard(this.b.n.b);
                break;
        }
    }
}
