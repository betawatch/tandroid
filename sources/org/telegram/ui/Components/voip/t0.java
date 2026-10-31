package org.telegram.ui.Components.voip;

import org.telegram.ui.Components.ei0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class t0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jg.b1 b;
    public final /* synthetic */ ei0 c;

    public /* synthetic */ t0(jg.b1 b1Var, ei0 ei0Var, int i10) {
        this.a = i10;
        this.b = b1Var;
        this.c = ei0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.g3(new t0(this.b, this.c, 1));
                break;
            default:
                this.b.removeView(this.c);
                break;
        }
    }
}
