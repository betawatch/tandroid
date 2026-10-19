package ai;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.sd0;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
                x xVar = (x) this.M;
                t tVar = xVar.Q;
                if (tVar != null && !tVar.isFocusable()) {
                    xVar.Q.setFocusable(true);
                    xVar.Q.setFocusableInTouchMode(true);
                    int y12 = xVar.e.y1(1);
                    if (y12 >= 0 && y12 < xVar.e.W2.x.size()) {
                        xVar.e.B0();
                        xVar.e.x0(y12);
                    }
                    xVar.Q.requestFocus();
                }
                break;
            default:
                org.telegram.ui.ie ieVar = (org.telegram.ui.ie) this.M;
                b71 b71Var = ieVar.a1;
                t tVar2 = ieVar.Y0;
                if (tVar2 != null && !tVar2.isFocusable()) {
                    tVar2.setFocusable(true);
                    tVar2.setFocusableInTouchMode(true);
                    int y13 = b71Var.y1(3);
                    if (y13 >= 0 && y13 < b71Var.W2.x.size()) {
                        b71Var.B0();
                        b71Var.x0(y13);
                    }
                    tVar2.requestFocus();
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
