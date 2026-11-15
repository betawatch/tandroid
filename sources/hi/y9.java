package hi;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
