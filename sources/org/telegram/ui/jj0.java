package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class jj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rj0 b;

    public /* synthetic */ jj0(rj0 rj0Var, int i10) {
        this.a = i10;
        this.b = rj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.b.b);
                break;
            default:
                AndroidUtilities.showKeyboard(this.b.c.getEditText());
                break;
        }
    }
}
