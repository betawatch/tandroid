package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class sr extends ImageView {
    public final /* synthetic */ int a = 1;
    public Object b;
    public final /* synthetic */ ViewGroup c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sr(ur urVar, Context context, k2.u uVar) {
        super(context);
        this.c = urVar;
        this.b = uVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                ur urVar = (ur) this.c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (urVar.n || urVar.f)) {
                    urVar.n = false;
                    urVar.f = false;
                    removeCallbacks(urVar.r);
                    removeCallbacks(urVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((k2.u) this.b).b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sr(fk0 fk0Var, Context context) {
        super(context);
        this.c = fk0Var;
    }
}
