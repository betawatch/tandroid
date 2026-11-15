package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class gt implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kt b;

    public /* synthetic */ gt(kt ktVar, int i7) {
        this.a = i7;
        this.b = ktVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                kt ktVar = this.b;
                ktVar.post(new gt(ktVar, 1));
                break;
            default:
                kt ktVar2 = this.b;
                ktVar2.h();
                ktVar2.d();
                break;
        }
    }
}
