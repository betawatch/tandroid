package org.telegram.ui;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class fr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pr b;

    public /* synthetic */ fr(pr prVar, int i7) {
        this.a = i7;
        this.b = prVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pr.d0(this.b);
                break;
            case 1:
                pr prVar = this.b;
                if (prVar.K) {
                    prVar.d.d.requestFocus();
                    org.telegram.messenger.g0.J3(prVar.d.d);
                    break;
                }
                break;
            default:
                pr prVar2 = this.b;
                prVar2.presentFragment(an.ua(prVar2.I), true);
                break;
        }
    }
}
