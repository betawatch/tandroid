package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class vr extends ImageView {
    public final /* synthetic */ int a = 1;
    public Object b;
    public final /* synthetic */ ViewGroup c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr(xr xrVar, Context context, k2.e eVar) {
        super(context);
        this.c = xrVar;
        this.b = eVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                xr xrVar = (xr) this.c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (xrVar.n || xrVar.f)) {
                    xrVar.n = false;
                    xrVar.f = false;
                    removeCallbacks(xrVar.r);
                    removeCallbacks(xrVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((k2.e) this.b).b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr(sk0 sk0Var, Context context) {
        super(context);
        this.c = sk0Var;
    }
}
