package bi;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.r41;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class u extends lb0 {
    public final /* synthetic */ int L;
    public final /* synthetic */ Object M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i7, Context context, Object obj) {
        super(context, null);
        this.L = i7;
        this.M = obj;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.L) {
            case 0:
                z zVar = (z) this.M;
                v vVar = zVar.Z;
                if (vVar != null && !vVar.isFocusable()) {
                    zVar.Z.setFocusable(true);
                    zVar.Z.setFocusableInTouchMode(true);
                    int A1 = zVar.e.A1(1);
                    if (A1 >= 0 && A1 < zVar.e.f3.D.size()) {
                        zVar.e.C0();
                        zVar.e.y0(A1);
                    }
                    zVar.Z.requestFocus();
                }
                break;
            default:
                org.telegram.ui.zd zdVar = (org.telegram.ui.zd) this.M;
                r41 r41Var = zdVar.X0;
                v vVar2 = zdVar.O0;
                if (vVar2 != null && !vVar2.isFocusable()) {
                    vVar2.setFocusable(true);
                    vVar2.setFocusableInTouchMode(true);
                    int A12 = r41Var.A1(3);
                    if (A12 >= 0 && A12 < r41Var.f3.D.size()) {
                        r41Var.C0();
                        r41Var.y0(A12);
                    }
                    vVar2.requestFocus();
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
