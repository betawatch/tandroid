package f9;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
