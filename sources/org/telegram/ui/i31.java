package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l31 b;

    public /* synthetic */ i31(l31 l31Var, int i10) {
        this.a = i10;
        this.b = l31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l31 l31Var = this.b;
                m31 m31Var = l31Var.v;
                if (l31Var.a != 0) {
                    m31Var.onBackPressed();
                    break;
                } else {
                    m31Var.dismiss();
                    break;
                }
            default:
                AndroidUtilities.showKeyboard(this.b.n.b);
                break;
        }
    }
}
