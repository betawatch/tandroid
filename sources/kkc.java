// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class kkc extends qv4 {
    public final /* synthetic */ uk1 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kkc(uk1 uk1Var, uk1 uk1Var2) {
        super(uk1Var, 1.0f);
        this.E = uk1Var2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.E.invalidate();
    }
}
