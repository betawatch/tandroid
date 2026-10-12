package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class gs extends ImageView {
    public final /* synthetic */ int a = 1;
    public Object b;
    public final /* synthetic */ ViewGroup c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gs(is isVar, Context context, ji.d4 d4Var) {
        super(context);
        this.c = isVar;
        this.b = d4Var;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                is isVar = (is) this.c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (isVar.n || isVar.f)) {
                    isVar.n = false;
                    isVar.f = false;
                    removeCallbacks(isVar.r);
                    removeCallbacks(isVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((ji.d4) this.b).b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gs(gl0 gl0Var, Context context) {
        super(context);
        this.c = gl0Var;
    }
}
