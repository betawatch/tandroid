package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class jq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pr b;

    public /* synthetic */ jq(pr prVar, int i10) {
        this.a = i10;
        this.b = prVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.v0();
                break;
            default:
                pr prVar = this.b;
                prVar.getMessagesController().T2(0, prVar.M, true);
                break;
        }
    }
}
