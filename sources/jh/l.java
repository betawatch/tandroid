package jh;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.de;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class l extends uc0 {
    public final /* synthetic */ int H;
    public final /* synthetic */ Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj, Context context, int i10) {
        super(context, null);
        this.H = i10;
        this.I = obj;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.H) {
            case 0:
                q qVar = (q) this.I;
                m mVar = qVar.M;
                if (mVar != null && !mVar.isFocusable()) {
                    qVar.M.setFocusable(true);
                    qVar.M.setFocusableInTouchMode(true);
                    int x12 = qVar.e.x1(1);
                    if (x12 >= 0 && x12 < qVar.e.U2.x.size()) {
                        qVar.e.B0();
                        qVar.e.x0(x12);
                    }
                    qVar.M.requestFocus();
                }
                break;
            default:
                de deVar = (de) this.I;
                u51 u51Var = deVar.W0;
                m mVar2 = deVar.U0;
                if (mVar2 != null && !mVar2.isFocusable()) {
                    mVar2.setFocusable(true);
                    mVar2.setFocusableInTouchMode(true);
                    int x13 = u51Var.x1(3);
                    if (x13 >= 0 && x13 < u51Var.U2.x.size()) {
                        u51Var.B0();
                        u51Var.x0(x13);
                    }
                    mVar2.requestFocus();
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
