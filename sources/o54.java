// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class o54 implements x56 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y54 b;

    public /* synthetic */ o54(y54 y54Var, byte b) {
        this.a = b;
        this.b = y54Var;
    }

    @Override // x56
    public final void invoke(Object obj) {
        byte b = this.a;
        y54 y54Var = this.b;
        mc8 mc8Var = (mc8) obj;
        switch (b) {
            case 2:
                mc8Var.K(y54Var.P);
                break;
            default:
                mc8Var.C(y54Var.R);
                break;
        }
    }
}
