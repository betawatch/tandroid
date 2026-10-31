package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class bs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gs b;

    public /* synthetic */ bs(gs gsVar, int i10) {
        this.a = i10;
        this.b = gsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.X(false);
                break;
            default:
                this.b.O(true);
                break;
        }
    }
}
