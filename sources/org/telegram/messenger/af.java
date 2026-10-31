package org.telegram.messenger;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class af implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cf b;
    public final /* synthetic */ int c;

    public /* synthetic */ af(cf cfVar, int i10, int i11) {
        this.a = i11;
        this.b = cfVar;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                cf cfVar = this.b;
                try {
                    cfVar.b.o(this.c);
                    break;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            case 1:
                cf cfVar2 = this.b;
                try {
                    cfVar2.b.o(this.c);
                    break;
                } catch (Exception e7) {
                    f8.g(e7, true);
                    return;
                }
            case 2:
                cf cfVar3 = this.b;
                try {
                    cfVar3.b.o(this.c);
                    break;
                } catch (Exception e10) {
                    f8.g(e10, true);
                    return;
                }
            default:
                cf cfVar4 = this.b;
                try {
                    cfVar4.b.o(this.c);
                    break;
                } catch (Exception e11) {
                    f8.g(e11, true);
                }
        }
    }
}
