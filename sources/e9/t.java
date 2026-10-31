package e9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
