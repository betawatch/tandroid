package di;

import android.content.Context;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.su0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class o9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.w2[] b;
    public final /* synthetic */ Context c;

    public /* synthetic */ o9(Context context, org.telegram.ui.ActionBar.w2[] w2VarArr) {
        this.a = 0;
        this.c = context;
        this.b = w2VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.w2 w2Var;
        org.telegram.ui.ActionBar.g2 g2Var;
        int i7 = this.a;
        Context context = this.c;
        org.telegram.ui.ActionBar.w2[] w2VarArr = this.b;
        switch (i7) {
            case 0:
                su0 su0Var = new su0(context);
                if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(w2VarArr[0].j1) && (w2Var = w2VarArr[0]) != null && (g2Var = w2Var.j1) != null) {
                    su0Var.a0(g2Var);
                }
                su0Var.show();
                break;
            case 1:
                w2VarArr[0].dismiss();
                vf.c.t(context, gd.N0(2131752023, null));
                break;
            case 2:
                w2VarArr[0].dismiss();
                vf.c.v(context, gd.N0(2131752018, null), false);
                break;
            default:
                w2VarArr[0].dismiss();
                vf.c.t(context, gd.N0(2131752015, null));
                break;
        }
    }

    public /* synthetic */ o9(org.telegram.ui.ActionBar.w2[] w2VarArr, Context context, int i7) {
        this.a = i7;
        this.b = w2VarArr;
        this.c = context;
    }
}
