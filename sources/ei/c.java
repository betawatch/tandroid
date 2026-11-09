package ei;

import android.view.View;
import di.k6;
import org.telegram.ui.Components.tp0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                tp0 tp0Var = nVar.W;
                k6 k6Var = nVar.a;
                tp0Var.a(k6Var == null ? "" : k6Var.E);
                break;
            default:
                n nVar2 = this.b;
                nVar2.W.b(nVar2.a.E);
                break;
        }
    }
}
