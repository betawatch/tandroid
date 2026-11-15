package li;

import org.telegram.ui.an;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;
    public final /* synthetic */ long c;

    public /* synthetic */ f(n nVar, long j3, int i7) {
        this.a = i7;
        this.b = nVar;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n.c0(this.b, this.c);
                break;
            default:
                n nVar = this.b;
                nVar.getClass();
                nVar.presentFragment(an.ua(this.c));
                break;
        }
    }
}
