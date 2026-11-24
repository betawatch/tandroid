// default package

import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class de6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mh6 b;

    public /* synthetic */ de6(mh6 mh6Var, byte b) {
        this.a = b;
        this.b = mh6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        mh6 mh6Var = this.b;
        switch (b) {
            case 0:
                mh6Var.d0 = false;
                break;
            case 1:
                mh6Var.y0 = false;
                mh6Var.N1(true, true);
                break;
            default:
                if (mh6Var.getParentActivity() != null && !mh6Var.getParentActivity().isFinishing() && mh6Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mh6Var.getParentActivity());
                    String M0 = jb6.M0(2131745804, null);
                    he heVar = alertDialog$Builder.a;
                    heVar.S = M0;
                    heVar.U = jb6.M0(2131745683, null);
                    alertDialog$Builder.j(jb6.M0(2131747564, null), new ge6(mh6Var, (byte) 1));
                    alertDialog$Builder.o();
                    break;
                }
                break;
        }
    }
}
