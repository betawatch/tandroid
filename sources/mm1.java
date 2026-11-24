// default package

import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class mm1 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ yv1 b;
    public final /* synthetic */ oc7 c;
    public final /* synthetic */ CharSequence d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ mm1(yv1 yv1Var, oc7 oc7Var, CharSequence charSequence, boolean z) {
        this.b = yv1Var;
        this.c = oc7Var;
        this.d = charSequence;
        this.e = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.B9(this.d, this.c, this.e);
                break;
            default:
                yv1 yv1Var = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, yv1Var.Ba, yv1Var.getParentActivity());
                String M0 = jb6.M0(R.string.AppName, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M0;
                String M02 = jb6.M0(2131747564, null);
                oc7 oc7Var = this.c;
                alertDialog$Builder.j(M02, new wg((d) yv1Var, (jm7) oc7Var, this.d, this.e, (byte) 1));
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                heVar.U = jb6.M0(2131745419, null);
                yv1Var.showDialog(heVar);
                oc7Var.z2 = 0;
                oc7.d1().edit().putInt("secretWebpage2", oc7Var.z2).commit();
                break;
        }
    }

    public /* synthetic */ mm1(yv1 yv1Var, CharSequence charSequence, oc7 oc7Var, boolean z) {
        this.b = yv1Var;
        this.d = charSequence;
        this.c = oc7Var;
        this.e = z;
    }
}
