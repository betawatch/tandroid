package ai;

import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class q2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.u2[] b;

    public /* synthetic */ q2(org.telegram.ui.ActionBar.u2[] u2VarArr, int i7) {
        this.a = i7;
        this.b = u2VarArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.u2 u2Var = this.b[0];
                if (u2Var != null) {
                    u2Var.dismiss();
                    break;
                }
                break;
            case 1:
                this.b[0].dismiss();
                break;
            case 2:
                org.telegram.ui.ActionBar.u2 u2Var2 = this.b[0];
                if (u2Var2 != null) {
                    u2Var2.dismiss();
                    break;
                }
                break;
            default:
                this.b[0].dismiss();
                break;
        }
    }
}
