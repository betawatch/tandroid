// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class nc1 extends ho {
    public final /* synthetic */ byte e0;
    public final /* synthetic */ oc1 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nc1(oc1 oc1Var, byte b) {
        super(true, false, false);
        this.e0 = b;
        this.f0 = oc1Var;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        byte b = this.e0;
        oc1 oc1Var = this.f0;
        switch (b) {
            case 0:
                oc1Var.invalidateSelf();
                break;
            default:
                oc1Var.invalidateSelf();
                break;
        }
    }
}
