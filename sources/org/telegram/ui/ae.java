package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ae extends org.telegram.ui.Components.hd0 {
    public final /* synthetic */ int L;
    public final /* synthetic */ Object M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ae(Object obj, Context context, int i10) {
        super(context, null);
        this.L = i10;
        this.M = obj;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.L) {
            case 0:
                le leVar = (le) this.M;
                org.telegram.ui.Components.r61 r61Var = leVar.a1;
                ei.o oVar = leVar.Y0;
                if (oVar != null && !oVar.isFocusable()) {
                    oVar.setFocusable(true);
                    oVar.setFocusableInTouchMode(true);
                    int w12 = r61Var.w1(3);
                    if (w12 >= 0 && w12 < r61Var.Y2.x.size()) {
                        r61Var.B0();
                        r61Var.x0(w12);
                    }
                    oVar.requestFocus();
                }
                break;
            default:
                xh.h hVar = (xh.h) this.M;
                ei.o oVar2 = hVar.Q;
                if (oVar2 != null && !oVar2.isFocusable()) {
                    hVar.Q.setFocusable(true);
                    hVar.Q.setFocusableInTouchMode(true);
                    int w13 = hVar.e.w1(1);
                    if (w13 >= 0 && w13 < hVar.e.Y2.x.size()) {
                        hVar.e.B0();
                        hVar.e.x0(w13);
                    }
                    hVar.Q.requestFocus();
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
