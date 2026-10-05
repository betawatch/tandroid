package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class ae extends org.telegram.ui.Components.ld0 {
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
                me meVar = (me) this.M;
                org.telegram.ui.Components.e71 e71Var = meVar.X0;
                fi.o oVar = meVar.O0;
                if (oVar != null && !oVar.isFocusable()) {
                    oVar.setFocusable(true);
                    oVar.setFocusableInTouchMode(true);
                    int y12 = e71Var.y1(3);
                    if (y12 >= 0 && y12 < e71Var.f3.x.size()) {
                        e71Var.C0();
                        e71Var.y0(y12);
                    }
                    oVar.requestFocus();
                }
                break;
            default:
                yh.h hVar = (yh.h) this.M;
                fi.o oVar2 = hVar.Z;
                if (oVar2 != null && !oVar2.isFocusable()) {
                    hVar.Z.setFocusable(true);
                    hVar.Z.setFocusableInTouchMode(true);
                    int y13 = hVar.e.y1(1);
                    if (y13 >= 0 && y13 < hVar.e.f3.x.size()) {
                        hVar.e.C0();
                        hVar.e.y0(y13);
                    }
                    hVar.Z.requestFocus();
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
