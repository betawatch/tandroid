package h9;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class p extends a8.l {
    public final /* synthetic */ int f;
    public final /* synthetic */ s h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(s sVar, int i7) {
        super(sVar);
        this.f = i7;
        this.h = sVar;
    }

    @Override // a8.l
    public final Object a(int i7) {
        switch (this.f) {
            case 0:
                return this.h.k()[i7];
            case 1:
                return new r(this.h, i7);
            default:
                return this.h.l()[i7];
        }
    }
}
