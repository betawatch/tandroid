package c8;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class a extends a8.l {
    public final /* synthetic */ int f;
    public final /* synthetic */ d h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(d dVar, int i7) {
        super(dVar);
        this.f = i7;
        this.h = dVar;
    }

    @Override // a8.l
    public final Object b(int i7) {
        switch (this.f) {
            case 0:
                Object[] objArr = this.h.c;
                objArr.getClass();
                return objArr[i7];
            case 1:
                return new c(this.h, i7);
            default:
                Object[] objArr2 = this.h.d;
                objArr2.getClass();
                return objArr2[i7];
        }
    }
}
