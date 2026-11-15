package hi;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class y9 implements m2 {
    public final /* synthetic */ sa a;

    public y9(sa saVar) {
        this.a = saVar;
    }

    @Override // hi.m2
    public final void setInvert(float f10) {
        sa saVar = this.a;
        org.telegram.messenger.g0.o3(saVar.n, f10 > 0.5f);
        org.telegram.messenger.g0.r3(saVar.n, f10 > 0.5f);
    }

    @Override // hi.m2
    public final void invalidate() {
    }
}
