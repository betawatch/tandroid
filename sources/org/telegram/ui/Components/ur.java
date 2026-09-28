package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class ur extends ImageView {
    public final /* synthetic */ int a = 1;
    public Object b;
    public final /* synthetic */ ViewGroup c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur(wr wrVar, Context context, n2.e eVar) {
        super(context);
        this.c = wrVar;
        this.b = eVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                wr wrVar = (wr) this.c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (wrVar.n || wrVar.f)) {
                    wrVar.n = false;
                    wrVar.f = false;
                    removeCallbacks(wrVar.r);
                    removeCallbacks(wrVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((n2.e) this.b).b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur(sk0 sk0Var, Context context) {
        super(context);
        this.c = sk0Var;
    }
}
