package ai;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.sd0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
                org.telegram.ui.ke keVar = (org.telegram.ui.ke) this.M;
                a71 a71Var = keVar.a1;
                t tVar2 = keVar.Y0;
                if (tVar2 != null && !tVar2.isFocusable()) {
                    tVar2.setFocusable(true);
                    tVar2.setFocusableInTouchMode(true);
                    int y13 = a71Var.y1(3);
                    if (y13 >= 0 && y13 < a71Var.W2.x.size()) {
                        a71Var.B0();
                        a71Var.x0(y13);
                    }
                    tVar2.requestFocus();
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
