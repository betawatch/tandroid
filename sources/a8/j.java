package a8;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class j extends l {
    public final /* synthetic */ int f;
    public final /* synthetic */ o h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(o oVar, int i7) {
        super(oVar);
        this.f = i7;
        this.h = oVar;
    }

    @Override // a8.l
    public final Object b(int i7) {
        switch (this.f) {
            case 0:
                Object[] objArr = this.h.c;
                objArr.getClass();
                return objArr[i7];
            case 1:
                return new m(this.h, i7);
            default:
                Object[] objArr2 = this.h.d;
                objArr2.getClass();
                return objArr2[i7];
        }
    }
}
