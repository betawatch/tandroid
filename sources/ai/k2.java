package ai;

import android.view.View;
import org.telegram.ui.ActionBar.w2;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class k2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w2[] b;

    public /* synthetic */ k2(w2[] w2VarArr, int i7) {
        this.a = i7;
        this.b = w2VarArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                w2 w2Var = this.b[0];
                if (w2Var != null) {
                    w2Var.dismiss();
                    break;
                }
                break;
            case 1:
                this.b[0].dismiss();
                break;
            case 2:
                w2 w2Var2 = this.b[0];
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
