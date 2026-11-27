// default package

import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class gm1 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ zu1 b;
    public final /* synthetic */ uc7 c;
    public final /* synthetic */ CharSequence d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ gm1(zu1 zu1Var, uc7 uc7Var, CharSequence charSequence, boolean z) {
        this.b = zu1Var;
        this.c = uc7Var;
        this.d = charSequence;
        this.e = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.C9(this.d, this.c, this.e);
                break;
            default:
                zu1 zu1Var = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, zu1Var.Ba, zu1Var.getParentActivity());
                String M0 = ob6.M0(R.string.AppName, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                String M02 = ob6.M0(2131747558, null);
                uc7 uc7Var = this.c;
                alertDialog$Builder.j(M02, new ag((e) zu1Var, (fn7) uc7Var, this.d, this.e, (byte) 1));
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                idVar.U = ob6.M0(2131745413, null);
                zu1Var.showDialog(idVar);
                uc7Var.z2 = 0;
                uc7.e1().edit().putInt("secretWebpage2", uc7Var.z2).commit();
                break;
        }
    }

    public /* synthetic */ gm1(zu1 zu1Var, CharSequence charSequence, uc7 uc7Var, boolean z) {
        this.b = zu1Var;
        this.d = charSequence;
        this.c = uc7Var;
        this.e = z;
    }
}
