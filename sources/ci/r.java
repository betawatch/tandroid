package ci;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.gb0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.xd;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class r extends gb0 {
    public final /* synthetic */ int M;
    public final /* synthetic */ Object N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i3, Context context, Object obj) {
        super(context, null);
        this.M = i3;
        this.N = obj;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.M) {
            case 0:
                v vVar = (v) this.N;
                s sVar = vVar.a0;
                if (sVar != null && !sVar.isFocusable()) {
                    vVar.a0.setFocusable(true);
                    vVar.a0.setFocusableInTouchMode(true);
                    int A1 = vVar.e.A1(1);
                    if (A1 >= 0 && A1 < vVar.e.g3.E.size()) {
                        vVar.e.C0();
                        vVar.e.y0(A1);
                    }
                    vVar.a0.requestFocus();
                }
                break;
            default:
                xd xdVar = (xd) this.N;
                l41 l41Var = xdVar.Y0;
                s sVar2 = xdVar.P0;
                if (sVar2 != null && !sVar2.isFocusable()) {
                    sVar2.setFocusable(true);
                    sVar2.setFocusableInTouchMode(true);
                    int A12 = l41Var.A1(3);
                    if (A12 >= 0 && A12 < l41Var.g3.E.size()) {
                        l41Var.C0();
                        l41Var.y0(A12);
                    }
                    sVar2.requestFocus();
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
