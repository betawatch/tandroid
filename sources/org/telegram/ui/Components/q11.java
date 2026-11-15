package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class q11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.gj b;
    public final /* synthetic */ long c;
    public final /* synthetic */ String d;

    public /* synthetic */ q11(org.telegram.messenger.gj gjVar, long j3, String str, int i7) {
        this.a = i7;
        this.b = gjVar;
        this.c = j3;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        String str = this.d;
        long j3 = this.c;
        org.telegram.messenger.gj gjVar = this.b;
        switch (i7) {
            case 0:
                org.telegram.messenger.ns f10 = org.telegram.messenger.ns.f(gjVar.K1);
                Long valueOf = Long.valueOf(j3);
                Boolean bool = Boolean.TRUE;
                f10.k(org.telegram.messenger.ns.A1, gjVar, valueOf, str, bool, bool);
                break;
            default:
                x11.f(gjVar, j3, str);
                break;
        }
    }
}
