package ei;

import android.view.View;
import di.j6;
import org.telegram.ui.Components.sp0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
                j6 j6Var = nVar.a;
                sp0Var.a(j6Var == null ? "" : j6Var.E);
                break;
            default:
                n nVar2 = this.b;
                nVar2.W.b(nVar2.a.E);
                break;
        }
    }
}
