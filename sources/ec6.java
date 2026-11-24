// default package

import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ec6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mf6 b;

    public /* synthetic */ ec6(mf6 mf6Var, byte b) {
        this.a = b;
        this.b = mf6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        mf6 mf6Var = this.b;
        switch (b) {
            case 0:
                mf6Var.d0 = false;
                break;
            case 1:
                mf6Var.y0 = false;
                mf6Var.M1(true, true);
                break;
            default:
                if (mf6Var.getParentActivity() != null && !mf6Var.getParentActivity().isFinishing() && mf6Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mf6Var.getParentActivity());
                    String M0 = k96.M0(2131745878, null);
                    hd hdVar = alertDialog$Builder.a;
                    hdVar.S = M0;
                    hdVar.U = k96.M0(2131745757, null);
                    alertDialog$Builder.j(k96.M0(2131747638, null), new hc6(mf6Var, (byte) 1));
                    alertDialog$Builder.o();
                    break;
                }
                break;
        }
    }
}
