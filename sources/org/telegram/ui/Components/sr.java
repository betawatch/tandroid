package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
    public sr(gk0 gk0Var, Context context) {
        super(context);
        this.c = gk0Var;
    }
}
