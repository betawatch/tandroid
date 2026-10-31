package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ir extends ImageView {
    public final /* synthetic */ int a = 0;
    public Object b;
    public final /* synthetic */ ViewGroup c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ir(lr lrVar, Context context, m2.t tVar) {
        super(context);
        this.c = lrVar;
        this.b = tVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                lr lrVar = (lr) this.c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (lrVar.n || lrVar.f)) {
                    lrVar.n = false;
                    lrVar.f = false;
                    removeCallbacks(lrVar.r);
                    removeCallbacks(lrVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((m2.t) this.b).b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ir(mj0 mj0Var, Context context) {
        super(context);
        this.c = mj0Var;
    }
}
