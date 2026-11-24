// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class n54 implements x56, us2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;

    public /* synthetic */ n54(float f, byte b) {
        this.a = b;
        this.b = f;
    }

    @Override // us2
    public final void accept(Object obj) {
        byte b = this.a;
        float f = this.b;
        ad8 ad8Var = (ad8) obj;
        switch (b) {
            case 1:
                ad8Var.c(f);
                break;
            default:
                ad8Var.R(f);
                break;
        }
    }

    @Override // x56
    public final void invoke(Object obj) {
        ((mc8) obj).q(this.b);
    }
}
