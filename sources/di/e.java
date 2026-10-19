package di;

import android.view.View;
import ci.t6;
import org.telegram.ui.Components.is0;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
                is0 is0Var = rVar.W;
                t6 t6Var = rVar.a;
                is0Var.a(t6Var == null ? "" : t6Var.E);
                break;
            default:
                r rVar2 = this.b;
                rVar2.W.b(rVar2.a.E);
                break;
        }
    }
}
