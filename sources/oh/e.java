package oh;

import android.view.View;
import nh.d6;
import org.telegram.ui.Components.nr0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;

    public /* synthetic */ e(r rVar, int i10) {
        this.a = i10;
        this.b = rVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                r rVar = this.b;
                nr0 nr0Var = rVar.T;
                d6 d6Var = rVar.a;
                nr0Var.a(d6Var == null ? "" : d6Var.E);
                break;
            default:
                r rVar2 = this.b;
                rVar2.T.b(rVar2.a.E);
                break;
        }
    }
}
