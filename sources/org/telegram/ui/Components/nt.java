package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class nt implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qt b;

    public /* synthetic */ nt(qt qtVar, int i10) {
        this.a = i10;
        this.b = qtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qt qtVar = this.b;
                qtVar.post(new nt(qtVar, 1));
                break;
            default:
                qt qtVar2 = this.b;
                qtVar2.h();
                qtVar2.d();
                break;
        }
    }
}
