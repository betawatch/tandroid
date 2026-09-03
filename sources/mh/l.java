package mh;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.h61;
import org.telegram.ui.ke;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                    int w12 = pVar.e.w1(1);
                    if (w12 >= 0 && w12 < pVar.e.V2.x.size()) {
                        pVar.e.B0();
                        pVar.e.x0(w12);
                    }
                    pVar.N.requestFocus();
                }
                break;
            default:
                ke keVar = (ke) this.J;
                h61 h61Var = keVar.X0;
                m mVar2 = keVar.V0;
                if (mVar2 != null && !mVar2.isFocusable()) {
                    mVar2.setFocusable(true);
                    mVar2.setFocusableInTouchMode(true);
                    int w13 = h61Var.w1(3);
                    if (w13 >= 0 && w13 < h61Var.V2.x.size()) {
                        h61Var.B0();
                        h61Var.x0(w13);
                    }
                    mVar2.requestFocus();
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
