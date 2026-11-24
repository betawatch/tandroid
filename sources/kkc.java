// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
