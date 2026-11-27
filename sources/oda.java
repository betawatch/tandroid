// default package

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class oda extends v79 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kea b;

    public /* synthetic */ oda(kea keaVar, byte b) {
        this.a = b;
        this.b = keaVar;
    }

    @Override // v79
    public final void b(RecyclerView recyclerView, int i, int i2) {
        z11 z11Var;
        byte b = this.a;
        kea keaVar = this.b;
        switch (b) {
            case 0:
                if (i2 != 0) {
                    keaVar.V0();
                    keaVar.l2 = keaVar.k2;
                }
                v21 v21Var = v21.x;
                if (v21Var != null && (z11Var = v21Var.e) != null && (z11Var.getParent() instanceof View) && ((View) v21.x.e.getParent()).getParent() == keaVar.w1) {
                    v21.e();
                    break;
                }
                break;
            case 1:
                if (i2 != 0) {
                    keaVar.V0();
                    keaVar.l2 = keaVar.k2;
                    break;
                }
                break;
            default:
                if (i2 != 0) {
                    keaVar.V0();
                    keaVar.l2 = keaVar.k2;
                    break;
                }
                break;
        }
    }
}
