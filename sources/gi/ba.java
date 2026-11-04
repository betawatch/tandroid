package gi;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ba implements m2 {
    public final /* synthetic */ va a;

    public ba(va vaVar) {
        this.a = vaVar;
    }

    @Override // gi.m2
    public final void setInvert(float f10) {
        va vaVar = this.a;
        org.telegram.messenger.g0.o3(vaVar.n, f10 > 0.5f);
        org.telegram.messenger.g0.r3(vaVar.n, f10 > 0.5f);
    }

    @Override // gi.m2
    public final void invalidate() {
    }
}
