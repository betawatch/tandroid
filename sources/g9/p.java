package g9;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class p extends b8.d {
    public final /* synthetic */ int f;
    public final /* synthetic */ s h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(s sVar, int i3) {
        super(sVar);
        this.f = i3;
        this.h = sVar;
    }

    @Override // b8.d
    public final Object a(int i3) {
        switch (this.f) {
            case 0:
                return this.h.k()[i3];
            case 1:
                return new r(this.h, i3);
            default:
                return this.h.l()[i3];
        }
    }
}
