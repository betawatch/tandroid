package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ib0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jb0 b;

    public /* synthetic */ ib0(jb0 jb0Var, int i10) {
        this.a = i10;
        this.b = jb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.y();
                break;
            default:
                this.b.m(true);
                break;
        }
    }
}
