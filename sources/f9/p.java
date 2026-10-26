package f9;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class p extends a8.d {
    public final /* synthetic */ int f;
    public final /* synthetic */ s h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(s sVar, int i10) {
        super(sVar);
        this.f = i10;
        this.h = sVar;
    }

    @Override // a8.d
    public final Object a(int i10) {
        switch (this.f) {
            case 0:
                return this.h.j()[i10];
            case 1:
                return new r(this.h, i10);
            default:
                return this.h.k()[i10];
        }
    }
}
