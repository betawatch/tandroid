// default package

import android.app.Activity;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class aw9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dw9 b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ he d;

    public /* synthetic */ aw9(dw9 dw9Var, Activity activity, he heVar, byte b) {
        this.a = b;
        this.b = dw9Var;
        this.c = activity;
        this.d = heVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        he heVar = this.d;
        Activity activity = this.c;
        dw9 dw9Var = this.b;
        switch (b) {
            case 0:
                dw9Var.n = false;
                if (!activity.isFinishing()) {
                    try {
                        heVar.dismiss();
                        break;
                    } catch (Exception e) {
                        fc4.g(e, true);
                        return;
                    }
                }
                break;
            default:
                if (!activity.isFinishing()) {
                    dw9Var.n = false;
                    try {
                        heVar.dismiss();
                    } catch (Exception e2) {
                        fc4.g(e2, true);
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    String M0 = jb6.M0(R.string.AppName, null);
                    he heVar2 = alertDialog$Builder.a;
                    heVar2.S = M0;
                    heVar2.U = jb6.M0(2131751687, null);
                    alertDialog$Builder.j(jb6.M0(2131747564, null), null);
                    alertDialog$Builder.o().setCanceledOnTouchOutside(true);
                    break;
                }
                break;
        }
    }
}
