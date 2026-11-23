package org.telegram.messenger;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class ze implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bf b;
    public final /* synthetic */ int c;

    public /* synthetic */ ze(bf bfVar, int i7, int i10) {
        this.a = i10;
        this.b = bfVar;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bf bfVar = this.b;
                try {
                    bfVar.b.o(this.c);
                    break;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 1:
                bf bfVar2 = this.b;
                try {
                    bfVar2.b.o(this.c);
                    break;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
            case 2:
                bf bfVar3 = this.b;
                try {
                    bfVar3.b.o(this.c);
                    break;
                } catch (Exception e12) {
                    a8.g(e12, true);
                    return;
                }
            default:
                bf bfVar4 = this.b;
                try {
                    bfVar4.b.o(this.c);
                    break;
                } catch (Exception e13) {
                    a8.g(e13, true);
                }
        }
    }
}
