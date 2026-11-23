package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class mr extends ImageView {
    public final /* synthetic */ int a = 0;
    public Object b;
    public final /* synthetic */ ViewGroup c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mr(or orVar, Context context, nd0 nd0Var) {
        super(context);
        this.c = orVar;
        this.b = nd0Var;
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
                return ((GestureDetector) ((nd0) this.b).b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mr(xi0 xi0Var, Context context) {
        super(context);
        this.c = xi0Var;
    }
}
