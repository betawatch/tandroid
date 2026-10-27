package bi;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.ke;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class s extends sd0 {
    public final /* synthetic */ int L;
    public final /* synthetic */ Object M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Object obj, Context context, int i10) {
        super(context, null);
        this.L = i10;
        this.M = obj;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.L) {
            case 0:
                y yVar = (y) this.M;
                t tVar = yVar.Z;
                if (tVar != null && !tVar.isFocusable()) {
                    yVar.Z.setFocusable(true);
                    yVar.Z.setFocusableInTouchMode(true);
                    int D1 = yVar.e.D1(1);
                    if (D1 >= 0 && D1 < yVar.e.g3.y.size()) {
                        yVar.e.C0();
                        yVar.e.y0(D1);
                    }
                    yVar.Z.requestFocus();
                }
                break;
            default:
                ke keVar = (ke) this.M;
                s71 s71Var = keVar.X0;
                t tVar2 = keVar.O0;
                if (tVar2 != null && !tVar2.isFocusable()) {
                    tVar2.setFocusable(true);
                    tVar2.setFocusableInTouchMode(true);
                    int D12 = s71Var.D1(3);
                    if (D12 >= 0 && D12 < s71Var.g3.y.size()) {
                        s71Var.C0();
                        s71Var.y0(D12);
                    }
                    tVar2.requestFocus();
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
