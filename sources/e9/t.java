package e9;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
