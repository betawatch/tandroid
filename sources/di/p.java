package di;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.xd;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class p extends yb0 {
    public final /* synthetic */ int M;
    public final /* synthetic */ Object N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i7, Context context, Object obj) {
        super(context, null);
        this.M = i7;
        this.N = obj;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.M) {
            case 0:
                t tVar = (t) this.N;
                q qVar = tVar.a0;
                if (qVar != null && !qVar.isFocusable()) {
                    tVar.a0.setFocusable(true);
                    tVar.a0.setFocusableInTouchMode(true);
                    int A1 = tVar.e.A1(1);
                    if (A1 >= 0 && A1 < tVar.e.g3.E.size()) {
                        tVar.e.C0();
                        tVar.e.y0(A1);
                    }
                    tVar.a0.requestFocus();
                }
                break;
            default:
                xd xdVar = (xd) this.N;
                h51 h51Var = xdVar.Y0;
                q qVar2 = xdVar.P0;
                if (qVar2 != null && !qVar2.isFocusable()) {
                    qVar2.setFocusable(true);
                    qVar2.setFocusableInTouchMode(true);
                    int A12 = h51Var.A1(3);
                    if (A12 >= 0 && A12 < h51Var.g3.E.size()) {
                        h51Var.C0();
                        h51Var.y0(A12);
                    }
                    qVar2.requestFocus();
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
