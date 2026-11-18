package ai;

import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class q2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.x2[] b;

    public /* synthetic */ q2(org.telegram.ui.ActionBar.x2[] x2VarArr, int i7) {
        this.a = i7;
        this.b = x2VarArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.x2 x2Var = this.b[0];
                if (x2Var != null) {
                    x2Var.dismiss();
                    break;
                }
                break;
            case 1:
                this.b[0].dismiss();
                break;
            case 2:
                org.telegram.ui.ActionBar.x2 x2Var2 = this.b[0];
                if (x2Var2 != null) {
                    x2Var2.dismiss();
                    break;
                }
                break;
            default:
                this.b[0].dismiss();
                break;
        }
    }
}
