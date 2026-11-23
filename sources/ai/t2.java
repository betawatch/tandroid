package ai;

import android.view.View;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.w2[] b;

    public /* synthetic */ t2(org.telegram.ui.ActionBar.w2[] w2VarArr, int i7) {
        this.a = i7;
        this.b = w2VarArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.w2 w2Var = this.b[0];
                if (w2Var != null) {
                    w2Var.dismiss();
                    break;
                }
                break;
            case 1:
                this.b[0].dismiss();
                break;
            case 2:
                org.telegram.ui.ActionBar.w2 w2Var2 = this.b[0];
                if (w2Var2 != null) {
                    w2Var2.dismiss();
                    break;
                }
                break;
            default:
                this.b[0].dismiss();
                break;
        }
    }
}
