package org.telegram.messenger;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class vc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cd b;
    public final /* synthetic */ int c;

    public /* synthetic */ vc(cd cdVar, int i10, int i11) {
        this.a = i11;
        this.b = cdVar;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                cd cdVar = this.b;
                cdVar.P = false;
                cdVar.j(this.c);
                break;
            case 1:
                cd cdVar2 = this.b;
                cdVar2.P = false;
                cdVar2.j(this.c);
                break;
            case 2:
                this.b.W0(this.c, null, true, null);
                break;
            default:
                this.b.W0(this.c, null, true, null);
                break;
        }
    }
}
