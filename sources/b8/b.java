package b8;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b extends d {
    public final /* synthetic */ int f;
    public final /* synthetic */ g h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(g gVar, int i3) {
        super(gVar);
        this.f = i3;
        this.h = gVar;
    }

    @Override // b8.d
    public final Object b(int i3) {
        switch (this.f) {
            case 0:
                Object[] objArr = this.h.c;
                objArr.getClass();
                return objArr[i3];
            case 1:
                return new e(this.h, i3);
            default:
                Object[] objArr2 = this.h.d;
                objArr2.getClass();
                return objArr2[i3];
        }
    }
}
