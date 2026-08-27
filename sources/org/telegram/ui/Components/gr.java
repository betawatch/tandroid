package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class gr extends ImageView {
    public final /* synthetic */ int a = 0;
    public Object b;
    public final /* synthetic */ ViewGroup c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gr(ir irVar, Context context, m5.o oVar) {
        super(context);
        this.c = irVar;
        this.b = oVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                ir irVar = (ir) this.c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (irVar.n || irVar.f)) {
                    irVar.n = false;
                    irVar.f = false;
                    removeCallbacks(irVar.r);
                    removeCallbacks(irVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((m5.o) this.b).b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gr(wj0 wj0Var, Context context) {
        super(context);
        this.c = wj0Var;
    }
}
