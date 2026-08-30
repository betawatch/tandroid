package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class pr extends ImageView {
    public final /* synthetic */ int a = 1;
    public Object b;
    public final /* synthetic */ ViewGroup c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pr(sr srVar, Context context, org.telegram.ui.Cells.f1 f1Var) {
        super(context);
        this.c = srVar;
        this.b = f1Var;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                sr srVar = (sr) this.c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (srVar.n || srVar.f)) {
                    srVar.n = false;
                    srVar.f = false;
                    removeCallbacks(srVar.r);
                    removeCallbacks(srVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((org.telegram.ui.Cells.f1) this.b).b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pr(pk0 pk0Var, Context context) {
        super(context);
        this.c = pk0Var;
    }
}
