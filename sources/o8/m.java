package o8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class m extends h7.k {
    public final /* synthetic */ int f;
    public final /* synthetic */ p h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(p pVar, int i9) {
        super(pVar);
        this.f = i9;
        this.h = pVar;
    }

    @Override // h7.k
    public final Object a(int i9) {
        switch (this.f) {
            case 0:
                return this.h.i()[i9];
            case 1:
                return new o(this.h, i9);
            default:
                return this.h.j()[i9];
        }
    }
}
