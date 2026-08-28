package j7;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a extends h7.k {
    public final /* synthetic */ int f;
    public final /* synthetic */ d h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(d dVar, int i9) {
        super(dVar);
        this.f = i9;
        this.h = dVar;
    }

    @Override // h7.k
    public final Object b(int i9) {
        switch (this.f) {
            case 0:
                Object[] objArr = this.h.c;
                objArr.getClass();
                return objArr[i9];
            case 1:
                return new c(this.h, i9);
            default:
                Object[] objArr2 = this.h.d;
                objArr2.getClass();
                return objArr2[i9];
        }
    }
}
