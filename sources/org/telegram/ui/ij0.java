package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ij0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qj0 b;

    public /* synthetic */ ij0(qj0 qj0Var, int i10) {
        this.a = i10;
        this.b = qj0Var;
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
