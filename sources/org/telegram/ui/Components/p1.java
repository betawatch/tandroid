package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class p1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.nr b;

    public /* synthetic */ p1(org.telegram.messenger.nr nrVar, int i7) {
        this.a = i7;
        this.b = nrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.nr nrVar = this.b;
                if (nrVar != null) {
                    nrVar.j(false);
                    break;
                }
                break;
            default:
                org.telegram.messenger.nr nrVar2 = this.b;
                if (nrVar2 != null) {
                    nrVar2.j(false);
                    break;
                }
                break;
        }
    }
}
