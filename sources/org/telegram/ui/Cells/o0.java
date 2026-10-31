package org.telegram.ui.Cells;

import org.telegram.ui.Components.bi0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class o0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bi0 b;

    public /* synthetic */ o0(bi0 bi0Var, int i10) {
        this.a = i10;
        this.b = bi0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.H(false);
                break;
            default:
                this.b.start();
                break;
        }
    }
}
