package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class or extends ImageView {
    public final /* synthetic */ int a = 1;
    public Object b;
    public final /* synthetic */ ViewGroup c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or(rr rrVar, Context context, zz zzVar) {
        super(context);
        this.c = rrVar;
        this.b = zzVar;
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
                return ((GestureDetector) ((zz) this.b).b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or(pk0 pk0Var, Context context) {
        super(context);
        this.c = pk0Var;
    }
}
