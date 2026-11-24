// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class hc6 implements ed {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mf6 b;

    public /* synthetic */ hc6(mf6 mf6Var, byte b) {
        this.a = b;
        this.b = mf6Var;
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        mf6 mf6Var = this.b;
        switch (b) {
            case 0:
                mf6Var.b[mf6Var.a].e();
                mf6Var.x1(true, true);
                break;
            default:
                mf6Var.m0 = true;
                if (mf6Var.a != 0) {
                    mf6Var.I1(0, true, null, true);
                    break;
                }
                break;
        }
    }
}
