// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class gb1 extends gn {
    public final /* synthetic */ byte e0;
    public final /* synthetic */ hb1 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gb1(hb1 hb1Var, byte b) {
        super(true, false, false);
        this.e0 = b;
        this.f0 = hb1Var;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        byte b = this.e0;
        hb1 hb1Var = this.f0;
        switch (b) {
            case 0:
                hb1Var.invalidateSelf();
                break;
            default:
                hb1Var.invalidateSelf();
                break;
        }
    }
}
