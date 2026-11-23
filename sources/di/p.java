package di;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.vb0;
import org.telegram.ui.xd;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class p extends vb0 {
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
                g51 g51Var = xdVar.Y0;
                q qVar2 = xdVar.P0;
                if (qVar2 != null && !qVar2.isFocusable()) {
                    qVar2.setFocusable(true);
                    qVar2.setFocusableInTouchMode(true);
                    int A12 = g51Var.A1(3);
                    if (A12 >= 0 && A12 < g51Var.g3.E.size()) {
                        g51Var.C0();
                        g51Var.y0(A12);
                    }
                    qVar2.requestFocus();
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
