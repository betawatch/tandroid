package bi;

import android.content.Context;
import org.telegram.ui.Components.iu0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.w2[] b;
    public final /* synthetic */ Context c;

    public /* synthetic */ xa(Context context, org.telegram.ui.ActionBar.w2[] w2VarArr) {
        this.a = 0;
        this.c = context;
        this.b = w2VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.w2 w2Var;
        org.telegram.ui.ActionBar.f2 f2Var;
        int i7 = this.a;
        Context context = this.c;
        org.telegram.ui.ActionBar.w2[] w2VarArr = this.b;
        switch (i7) {
            case 0:
                iu0 iu0Var = new iu0(context);
                if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(w2VarArr[0].i1) && (w2Var = w2VarArr[0]) != null && (f2Var = w2Var.i1) != null) {
                    iu0Var.a0(f2Var);
                }
                iu0Var.show();
                break;
            case 1:
                w2VarArr[0].dismiss();
                vf.c.t(context, org.telegram.messenger.id.M0(2131752035, null));
                break;
            case 2:
                w2VarArr[0].dismiss();
                vf.c.v(context, org.telegram.messenger.id.M0(2131752030, null), false);
                break;
            default:
                w2VarArr[0].dismiss();
                vf.c.t(context, org.telegram.messenger.id.M0(2131752027, null));
                break;
        }
    }

    public /* synthetic */ xa(org.telegram.ui.ActionBar.w2[] w2VarArr, Context context, int i7) {
        this.a = i7;
        this.b = w2VarArr;
        this.c = context;
    }
}
