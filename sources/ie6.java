// default package

import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ie6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qh6 b;

    public /* synthetic */ ie6(qh6 qh6Var, byte b) {
        this.a = b;
        this.b = qh6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        qh6 qh6Var = this.b;
        switch (b) {
            case 0:
                qh6Var.d0 = false;
                break;
            case 1:
                qh6Var.y0 = false;
                qh6Var.N1(true, true);
                break;
            default:
                if (qh6Var.getParentActivity() != null && !qh6Var.getParentActivity().isFinishing() && qh6Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qh6Var.getParentActivity());
                    String M0 = ob6.M0(2131745798, null);
                    id idVar = alertDialog$Builder.a;
                    idVar.S = M0;
                    idVar.U = ob6.M0(2131745677, null);
                    alertDialog$Builder.j(ob6.M0(2131747558, null), new ke6(qh6Var, (byte) 1));
                    alertDialog$Builder.o();
                    break;
                }
                break;
        }
    }
}
