// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class jmc extends rx4 {
    public final /* synthetic */ cm1 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmc(cm1 cm1Var, cm1 cm1Var2) {
        super(cm1Var, 1.0f);
        this.E = cm1Var2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.E.invalidate();
    }
}
