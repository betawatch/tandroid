// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class lad extends bq2 {
    public final /* synthetic */ byte f;
    public final /* synthetic */ dq2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lad(dq2 dq2Var, byte b) {
        super(dq2Var, (char) 0);
        this.f = b;
        this.h = dq2Var;
    }

    @Override // bq2
    public final Object b(int i) {
        byte b = this.f;
        dq2 dq2Var = this.h;
        switch (b) {
            case 0:
                Object[] objArr = dq2Var.d;
                objArr.getClass();
                return objArr[i];
            case 1:
                return new kbd(dq2Var, i);
            default:
                Object[] objArr2 = dq2Var.e;
                objArr2.getClass();
                return objArr2[i];
        }
    }
}
