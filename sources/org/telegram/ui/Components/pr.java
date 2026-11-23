package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class pr extends ImageView {
    public final /* synthetic */ int a = 0;
    public Object b;
    public final /* synthetic */ ViewGroup c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pr(rr rrVar, Context context, jn jnVar) {
        super(context);
        this.c = rrVar;
        this.b = jnVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                rr rrVar = (rr) this.c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (rrVar.n || rrVar.f)) {
                    rrVar.n = false;
                    rrVar.f = false;
                    removeCallbacks(rrVar.r);
                    removeCallbacks(rrVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((jn) this.b).b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pr(xi0 xi0Var, Context context) {
        super(context);
        this.c = xi0Var;
    }
}
