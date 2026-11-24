// default package

import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class dl1 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ mu1 b;
    public final /* synthetic */ na7 c;
    public final /* synthetic */ CharSequence d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ dl1(mu1 mu1Var, na7 na7Var, CharSequence charSequence, boolean z) {
        this.b = mu1Var;
        this.c = na7Var;
        this.d = charSequence;
        this.e = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.r9(this.d, this.c, this.e);
                break;
            default:
                mu1 mu1Var = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, mu1Var.Ba, mu1Var.getParentActivity());
                String M0 = k96.M0(R.string.AppName, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = M0;
                String M02 = k96.M0(2131747638, null);
                na7 na7Var = this.c;
                alertDialog$Builder.j(M02, new wf((d) mu1Var, (gk7) na7Var, this.d, this.e, (byte) 1));
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                hdVar.U = k96.M0(2131745493, null);
                mu1Var.showDialog(hdVar);
                na7Var.z2 = 0;
                na7.c1().edit().putInt("secretWebpage2", na7Var.z2).commit();
                break;
        }
    }

    public /* synthetic */ dl1(mu1 mu1Var, CharSequence charSequence, na7 na7Var, boolean z) {
        this.b = mu1Var;
        this.d = charSequence;
        this.c = na7Var;
        this.e = z;
    }
}
