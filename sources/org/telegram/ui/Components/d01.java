package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class d01 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ d01(Runnable runnable, Runnable runnable2, int i10) {
        this.a = i10;
        this.b = runnable;
        this.c = runnable2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h01.b(this.b);
                Runnable runnable = this.c;
                if (runnable != null) {
                    org.telegram.messenger.i0.g3(runnable);
                    break;
                }
                break;
            default:
                this.b.run();
                this.c.run();
                break;
        }
    }
}
