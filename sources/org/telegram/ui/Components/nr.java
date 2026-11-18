package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class nr extends ImageView {
    public final /* synthetic */ int a = 0;
    public Object b;
    public final /* synthetic */ ViewGroup c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr(pr prVar, Context context, hn hnVar) {
        super(context);
        this.c = prVar;
        this.b = hnVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                pr prVar = (pr) this.c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (prVar.n || prVar.f)) {
                    prVar.n = false;
                    prVar.f = false;
                    removeCallbacks(prVar.r);
                    removeCallbacks(prVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((hn) this.b).b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr(vi0 vi0Var, Context context) {
        super(context);
        this.c = vi0Var;
    }
}
