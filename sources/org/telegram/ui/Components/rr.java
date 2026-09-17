package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class rr extends ImageView {
    public final /* synthetic */ int a = 1;
    public Object b;
    public final /* synthetic */ ViewGroup c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rr(tr trVar, Context context, l.d dVar) {
        super(context);
        this.c = trVar;
        this.b = dVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                tr trVar = (tr) this.c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (trVar.n || trVar.f)) {
                    trVar.n = false;
                    trVar.f = false;
                    removeCallbacks(trVar.r);
                    removeCallbacks(trVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((l.d) this.b).b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rr(fk0 fk0Var, Context context) {
        super(context);
        this.c = fk0Var;
    }
}
