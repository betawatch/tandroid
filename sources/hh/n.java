package hh;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.jc0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.fe;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class n extends jc0 {
    public final /* synthetic */ int H;
    public final /* synthetic */ Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj, Context context, int i10) {
        super(context, null);
        this.H = i10;
        this.I = obj;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.H) {
            case 0:
                r rVar = (r) this.I;
                o oVar = rVar.M;
                if (oVar != null && !oVar.isFocusable()) {
                    rVar.M.setFocusable(true);
                    rVar.M.setFocusableInTouchMode(true);
                    int x12 = rVar.e.x1(1);
                    if (x12 >= 0 && x12 < rVar.e.U2.x.size()) {
                        rVar.e.B0();
                        rVar.e.x0(x12);
                    }
                    rVar.M.requestFocus();
                }
                break;
            default:
                fe feVar = (fe) this.I;
                k51 k51Var = feVar.W0;
                o oVar2 = feVar.U0;
                if (oVar2 != null && !oVar2.isFocusable()) {
                    oVar2.setFocusable(true);
                    oVar2.setFocusableInTouchMode(true);
                    int x13 = k51Var.x1(3);
                    if (x13 >= 0 && x13 < k51Var.U2.x.size()) {
                        k51Var.B0();
                        k51Var.x0(x13);
                    }
                    oVar2.requestFocus();
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
