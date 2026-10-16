package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class fe extends org.telegram.ui.Components.yd0 {
    public final /* synthetic */ int L;
    public final /* synthetic */ Object M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fe(Object obj, Context context, int i10) {
        super(context, null);
        this.L = i10;
        this.M = obj;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.L) {
            case 0:
                qe qeVar = (qe) this.M;
                org.telegram.ui.Components.i71 i71Var = qeVar.a1;
                gi.o oVar = qeVar.Y0;
                if (oVar != null && !oVar.isFocusable()) {
                    oVar.setFocusable(true);
                    oVar.setFocusableInTouchMode(true);
                    int y12 = i71Var.y1(3);
                    if (y12 >= 0 && y12 < i71Var.W2.x.size()) {
                        i71Var.B0();
                        i71Var.x0(y12);
                    }
                    oVar.requestFocus();
                }
                break;
            default:
                zh.g gVar = (zh.g) this.M;
                gi.o oVar2 = gVar.Q;
                if (oVar2 != null && !oVar2.isFocusable()) {
                    gVar.Q.setFocusable(true);
                    gVar.Q.setFocusableInTouchMode(true);
                    int y13 = gVar.e.y1(1);
                    if (y13 >= 0 && y13 < gVar.e.W2.x.size()) {
                        gVar.e.B0();
                        gVar.e.x0(y13);
                    }
                    gVar.Q.requestFocus();
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
