package bi;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.Components.r41;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class u extends mb0 {
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
