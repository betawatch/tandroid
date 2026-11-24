// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class oo2 extends qo2 {
    public final /* synthetic */ byte f;
    public final /* synthetic */ so2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oo2(so2 so2Var, byte b) {
        super(so2Var);
        this.f = b;
        this.h = so2Var;
    }

    @Override // qo2
    public final Object a(int i) {
        byte b = this.f;
        so2 so2Var = this.h;
        switch (b) {
            case 0:
                return so2Var.g(i);
            case 1:
                return new ro2(so2Var, i);
            default:
                return so2Var.l(i);
        }
    }
}
