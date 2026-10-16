package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class gs extends ImageView {
    public final /* synthetic */ int a = 1;
    public Object b;
    public final /* synthetic */ ViewGroup c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gs(is isVar, Context context, ji.h5 h5Var) {
        super(context);
        this.c = isVar;
        this.b = h5Var;
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
                return ((GestureDetector) ((ji.h5) this.b).b).onTouchEvent(motionEvent);
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
