package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ds implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ns b;

    public /* synthetic */ ds(ns nsVar, int i10) {
        this.a = i10;
        this.b = nsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ns.c0(this.b);
                break;
            case 1:
                ns nsVar = this.b;
                if (nsVar.J) {
                    nsVar.d.d.requestFocus();
                    org.telegram.messenger.i0.J3(nsVar.d.d);
                    break;
                }
                break;
            default:
                ns nsVar2 = this.b;
                nsVar2.presentFragment(un.ha(nsVar2.H), true);
                break;
        }
    }
}
