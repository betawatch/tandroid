package ei;

import android.view.View;
import di.k6;
import org.telegram.ui.Components.sp0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;

    public /* synthetic */ c(n nVar, int i7) {
        this.a = i7;
        this.b = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                n nVar = this.b;
                sp0 sp0Var = nVar.W;
                k6 k6Var = nVar.a;
                sp0Var.a(k6Var == null ? "" : k6Var.E);
                break;
            default:
                n nVar2 = this.b;
                nVar2.W.b(nVar2.a.E);
                break;
        }
    }
}
