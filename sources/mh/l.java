package mh;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.i61;
import org.telegram.ui.ke;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class l extends cd0 {
    public final /* synthetic */ int I;
    public final /* synthetic */ Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj, Context context, int i10) {
        super(context, null);
        this.I = i10;
        this.J = obj;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.I) {
            case 0:
                p pVar = (p) this.J;
                m mVar = pVar.N;
                if (mVar != null && !mVar.isFocusable()) {
                    pVar.N.setFocusable(true);
                    pVar.N.setFocusableInTouchMode(true);
                    int x12 = pVar.e.x1(1);
                    if (x12 >= 0 && x12 < pVar.e.V2.x.size()) {
                        pVar.e.B0();
                        pVar.e.x0(x12);
                    }
                    pVar.N.requestFocus();
                }
                break;
            default:
                ke keVar = (ke) this.J;
                i61 i61Var = keVar.X0;
                m mVar2 = keVar.V0;
                if (mVar2 != null && !mVar2.isFocusable()) {
                    mVar2.setFocusable(true);
                    mVar2.setFocusableInTouchMode(true);
                    int x13 = i61Var.x1(3);
                    if (x13 >= 0 && x13 < i61Var.V2.x.size()) {
                        i61Var.B0();
                        i61Var.x0(x13);
                    }
                    mVar2.requestFocus();
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
