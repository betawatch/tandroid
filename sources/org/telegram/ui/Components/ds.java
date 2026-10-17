package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class ds extends ImageView {
    public final /* synthetic */ int a = 1;
    public Object b;
    public final /* synthetic */ ViewGroup c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ds(fs fsVar, Context context, k0.b bVar) {
        super(context);
        this.c = fsVar;
        this.b = bVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                fs fsVar = (fs) this.c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (fsVar.n || fsVar.f)) {
                    fsVar.n = false;
                    fsVar.f = false;
                    removeCallbacks(fsVar.r);
                    removeCallbacks(fsVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((k0.b) this.b).b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ds(cl0 cl0Var, Context context) {
        super(context);
        this.c = cl0Var;
    }
}
