package ei;

import android.view.View;
import di.s6;
import org.telegram.ui.Components.vs0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                vs0 vs0Var = rVar.W;
                s6 s6Var = rVar.a;
                vs0Var.a(s6Var == null ? "" : s6Var.E);
                break;
            default:
                r rVar2 = this.b;
                rVar2.W.b(rVar2.a.E);
                break;
        }
    }
}
