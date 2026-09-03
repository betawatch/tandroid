package n7;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class a extends l7.k {
    public final /* synthetic */ int f;
    public final /* synthetic */ d h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(d dVar, int i10) {
        super(dVar);
        this.f = i10;
        this.h = dVar;
    }

    @Override // l7.k
    public final Object a(int i10) {
        switch (this.f) {
            case 0:
                Object[] objArr = this.h.c;
                objArr.getClass();
                return objArr[i10];
            case 1:
                return new c(this.h, i10);
            default:
                Object[] objArr2 = this.h.d;
                objArr2.getClass();
                return objArr2[i10];
        }
    }
}
