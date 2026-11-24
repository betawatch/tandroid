// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class bs8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rs8 b;
    public final /* synthetic */ int c;

    public /* synthetic */ bs8(rs8 rs8Var, int i, byte b) {
        this.a = b;
        this.b = rs8Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        rs8 rs8Var = this.b;
        switch (b) {
            case 0:
                rs8Var.f.scrollBy(0, i);
                break;
            default:
                va vaVar = rs8Var.f;
                if (vaVar != null) {
                    vaVar.setSpanCount(i);
                    break;
                }
                break;
        }
    }
}
