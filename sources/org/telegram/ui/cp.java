package org.telegram.ui;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class cp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mp b;
    public final /* synthetic */ long c;

    public /* synthetic */ cp(mp mpVar, long j3, int i7) {
        this.a = i7;
        this.b = mpVar;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                long j3 = this.c;
                mp mpVar = this.b;
                mpVar.n = j3;
                mpVar.r = true;
                mpVar.s0();
                break;
            default:
                mp.e0(this.b, this.c);
                break;
        }
    }
}
