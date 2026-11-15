package di;

import android.content.Context;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.iu0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class k9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.u2[] b;
    public final /* synthetic */ Context c;

    public /* synthetic */ k9(Context context, org.telegram.ui.ActionBar.u2[] u2VarArr) {
        this.a = 0;
        this.c = context;
        this.b = u2VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.u2 u2Var;
        org.telegram.ui.ActionBar.e2 e2Var;
        int i7 = this.a;
        Context context = this.c;
        org.telegram.ui.ActionBar.u2[] u2VarArr = this.b;
        switch (i7) {
            case 0:
                iu0 iu0Var = new iu0(context);
                if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(u2VarArr[0].j1) && (u2Var = u2VarArr[0]) != null && (e2Var = u2Var.j1) != null) {
                    iu0Var.a0(e2Var);
                }
                iu0Var.show();
                break;
            case 1:
                u2VarArr[0].dismiss();
                vf.c.t(context, hd.M0(2131752035, null));
                break;
            case 2:
                u2VarArr[0].dismiss();
                vf.c.v(context, hd.M0(2131752030, null), false);
                break;
            default:
                u2VarArr[0].dismiss();
                vf.c.t(context, hd.M0(2131752027, null));
                break;
        }
    }

    public /* synthetic */ k9(org.telegram.ui.ActionBar.u2[] u2VarArr, Context context, int i7) {
        this.a = i7;
        this.b = u2VarArr;
        this.c = context;
    }
}
