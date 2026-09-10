package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class yr extends ImageView {
    public final /* synthetic */ int a = 0;
    public Object b;
    public final /* synthetic */ ViewGroup c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yr(as asVar, Context context, l2.h hVar) {
        super(context);
        this.c = asVar;
        this.b = hVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                as asVar = (as) this.c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (asVar.n || asVar.f)) {
                    asVar.n = false;
                    asVar.f = false;
                    removeCallbacks(asVar.r);
                    removeCallbacks(asVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((l2.h) this.b).b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yr(pk0 pk0Var, Context context) {
        super(context);
        this.c = pk0Var;
    }
}
