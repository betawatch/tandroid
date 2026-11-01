package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
    public ir(nj0 nj0Var, Context context) {
        super(context);
        this.c = nj0Var;
    }
}
