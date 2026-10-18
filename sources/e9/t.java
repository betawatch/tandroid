package e9;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class t extends v {
    public final /* synthetic */ int f;
    public final /* synthetic */ x h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(x xVar, int i10) {
        super(xVar);
        this.f = i10;
        this.h = xVar;
    }

    @Override // e9.v
    public final Object a(int i10) {
        switch (this.f) {
            case 0:
                return this.h.j()[i10];
            case 1:
                return new w(this.h, i10);
            default:
                return this.h.k()[i10];
        }
    }
}
