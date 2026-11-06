package bi;

import android.content.Context;
import org.telegram.ui.Components.hu0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.v2[] b;
    public final /* synthetic */ Context c;

    public /* synthetic */ xa(Context context, org.telegram.ui.ActionBar.v2[] v2VarArr) {
        this.a = 0;
        this.c = context;
        this.b = v2VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.v2 v2Var;
        org.telegram.ui.ActionBar.f2 f2Var;
        int i7 = this.a;
        Context context = this.c;
        org.telegram.ui.ActionBar.v2[] v2VarArr = this.b;
        switch (i7) {
            case 0:
                hu0 hu0Var = new hu0(context);
                if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(v2VarArr[0].f1) && (v2Var = v2VarArr[0]) != null && (f2Var = v2Var.f1) != null) {
                    hu0Var.a0(f2Var);
                }
                hu0Var.show();
                break;
            case 1:
                v2VarArr[0].dismiss();
                vf.c.t(context, org.telegram.messenger.hd.M0(2131752035, null));
                break;
            case 2:
                v2VarArr[0].dismiss();
                vf.c.v(context, org.telegram.messenger.hd.M0(2131752030, null), false);
                break;
            default:
                v2VarArr[0].dismiss();
                vf.c.t(context, org.telegram.messenger.hd.M0(2131752027, null));
                break;
        }
    }

    public /* synthetic */ xa(org.telegram.ui.ActionBar.v2[] v2VarArr, Context context, int i7) {
        this.a = i7;
        this.b = v2VarArr;
        this.c = context;
    }
}
