package lh;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.ad0;
import org.telegram.ui.Components.g61;
import org.telegram.ui.ke;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class m extends ad0 {
    public final /* synthetic */ int I;
    public final /* synthetic */ Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj, Context context, int i10) {
        super(context, null);
        this.I = i10;
        this.J = obj;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.I) {
            case 0:
                q qVar = (q) this.J;
                n nVar = qVar.N;
                if (nVar != null && !nVar.isFocusable()) {
                    qVar.N.setFocusable(true);
                    qVar.N.setFocusableInTouchMode(true);
                    int x12 = qVar.e.x1(1);
                    if (x12 >= 0 && x12 < qVar.e.V2.x.size()) {
                        qVar.e.B0();
                        qVar.e.x0(x12);
                    }
                    qVar.N.requestFocus();
                }
                break;
            default:
                ke keVar = (ke) this.J;
                g61 g61Var = keVar.X0;
                n nVar2 = keVar.V0;
                if (nVar2 != null && !nVar2.isFocusable()) {
                    nVar2.setFocusable(true);
                    nVar2.setFocusableInTouchMode(true);
                    int x13 = g61Var.x1(3);
                    if (x13 >= 0 && x13 < g61Var.V2.x.size()) {
                        g61Var.B0();
                        g61Var.x0(x13);
                    }
                    nVar2.requestFocus();
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
