package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class lr extends ImageView {
    public final /* synthetic */ int a = 1;
    public Object b;
    public final /* synthetic */ ViewGroup c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lr(or orVar, Context context, o4.g gVar) {
        super(context);
        this.c = orVar;
        this.b = gVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                or orVar = (or) this.c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (orVar.n || orVar.f)) {
                    orVar.n = false;
                    orVar.f = false;
                    removeCallbacks(orVar.r);
                    removeCallbacks(orVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((o4.g) this.b).b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lr(fk0 fk0Var, Context context) {
        super(context);
        this.c = fk0Var;
    }
}
