package di;

import android.view.View;
import ci.t6;
import org.telegram.ui.Components.hs0;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
                hs0 hs0Var = rVar.W;
                t6 t6Var = rVar.a;
                hs0Var.a(t6Var == null ? "" : t6Var.E);
                break;
            default:
                r rVar2 = this.b;
                rVar2.W.b(rVar2.a.E);
                break;
        }
    }
}
