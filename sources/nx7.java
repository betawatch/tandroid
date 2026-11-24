// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class nx7 implements ed {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rx7 b;

    public /* synthetic */ nx7(rx7 rx7Var, byte b) {
        this.a = b;
        this.b = rx7Var;
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        rx7 rx7Var = this.b;
        switch (b) {
            case 0:
                rx7Var.d(true);
                rx7Var.R.M1(null, 0, true);
                break;
            default:
                rx7Var.d(true);
                rx7Var.R.finishFragment();
                break;
        }
    }
}
