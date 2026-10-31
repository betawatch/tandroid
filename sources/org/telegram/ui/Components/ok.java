package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ok implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bl b;
    public final /* synthetic */ org.telegram.messenger.za c;

    public /* synthetic */ ok(bl blVar, org.telegram.messenger.za zaVar, int i10) {
        this.a = i10;
        this.b = blVar;
        this.c = zaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bl.U(this.b, this.c);
                break;
            default:
                org.telegram.messenger.za zaVar = this.c;
                try {
                    ((bh.d) zaVar).z();
                } catch (Exception unused) {
                }
                org.telegram.messenger.i0.g3(new ok(this.b, zaVar, 0));
                break;
        }
    }
}
