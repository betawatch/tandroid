package di;

import android.content.Context;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.qu0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class n9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.x2[] b;
    public final /* synthetic */ Context c;

    public /* synthetic */ n9(Context context, org.telegram.ui.ActionBar.x2[] x2VarArr) {
        this.a = 0;
        this.c = context;
        this.b = x2VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.x2 x2Var;
        org.telegram.ui.ActionBar.h2 h2Var;
        int i7 = this.a;
        Context context = this.c;
        org.telegram.ui.ActionBar.x2[] x2VarArr = this.b;
        switch (i7) {
            case 0:
                qu0 qu0Var = new qu0(context);
                if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(x2VarArr[0].j1) && (x2Var = x2VarArr[0]) != null && (h2Var = x2Var.j1) != null) {
                    qu0Var.a0(h2Var);
                }
                qu0Var.show();
                break;
            case 1:
                x2VarArr[0].dismiss();
                vf.c.t(context, gd.M0(2131752024, null));
                break;
            case 2:
                x2VarArr[0].dismiss();
                vf.c.v(context, gd.M0(2131752019, null), false);
                break;
            default:
                x2VarArr[0].dismiss();
                vf.c.t(context, gd.M0(2131752016, null));
                break;
        }
    }

    public /* synthetic */ n9(org.telegram.ui.ActionBar.x2[] x2VarArr, Context context, int i7) {
        this.a = i7;
        this.b = x2VarArr;
        this.c = context;
    }
}
