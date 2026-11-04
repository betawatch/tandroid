package ci;

import android.content.Context;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.gu0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.t2[] b;
    public final /* synthetic */ Context c;

    public /* synthetic */ v9(Context context, org.telegram.ui.ActionBar.t2[] t2VarArr) {
        this.a = 0;
        this.c = context;
        this.b = t2VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.t2 t2Var;
        org.telegram.ui.ActionBar.d2 d2Var;
        int i3 = this.a;
        Context context = this.c;
        org.telegram.ui.ActionBar.t2[] t2VarArr = this.b;
        switch (i3) {
            case 0:
                gu0 gu0Var = new gu0(context);
                if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(t2VarArr[0].g1) && (t2Var = t2VarArr[0]) != null && (d2Var = t2Var.g1) != null) {
                    gu0Var.a0(d2Var);
                }
                gu0Var.show();
                break;
            case 1:
                t2VarArr[0].dismiss();
                sf.c.t(context, bd.M0(2131752035, null));
                break;
            case 2:
                t2VarArr[0].dismiss();
                sf.c.v(context, bd.M0(2131752030, null), false);
                break;
            default:
                t2VarArr[0].dismiss();
                sf.c.t(context, bd.M0(2131752027, null));
                break;
        }
    }

    public /* synthetic */ v9(org.telegram.ui.ActionBar.t2[] t2VarArr, Context context, int i3) {
        this.a = i3;
        this.b = t2VarArr;
        this.c = context;
    }
}
