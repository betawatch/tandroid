package org.telegram.messenger;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final /* synthetic */ class af implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cf b;
    public final /* synthetic */ int c;

    public /* synthetic */ af(cf cfVar, int i7, int i10) {
        this.a = i10;
        this.b = cfVar;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                cf cfVar = this.b;
                try {
                    cfVar.b.o(this.c);
                    break;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 1:
                cf cfVar2 = this.b;
                try {
                    cfVar2.b.o(this.c);
                    break;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
            case 2:
                cf cfVar3 = this.b;
                try {
                    cfVar3.b.o(this.c);
                    break;
                } catch (Exception e12) {
                    a8.g(e12, true);
                    return;
                }
            default:
                cf cfVar4 = this.b;
                try {
                    cfVar4.b.o(this.c);
                    break;
                } catch (Exception e13) {
                    a8.g(e13, true);
                }
        }
    }
}
