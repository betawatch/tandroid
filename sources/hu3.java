// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class hu3 extends ho {
    public final /* synthetic */ byte e0;
    public final /* synthetic */ qu3 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hu3(qu3 qu3Var, byte b) {
        super(false, false, false);
        this.e0 = b;
        this.f0 = qu3Var;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        byte b = this.e0;
        qu3 qu3Var = this.f0;
        switch (b) {
            case 0:
                qu3Var.invalidate();
                break;
            default:
                qu3Var.invalidate();
                break;
        }
    }
}
