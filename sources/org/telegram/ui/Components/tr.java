package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class tr extends ImageView {
    public final /* synthetic */ int a = 1;
    public Object b;
    public final /* synthetic */ ViewGroup c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tr(vr vrVar, Context context, k2.u uVar) {
        super(context);
        this.c = vrVar;
        this.b = uVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                vr vrVar = (vr) this.c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (vrVar.n || vrVar.f)) {
                    vrVar.n = false;
                    vrVar.f = false;
                    removeCallbacks(vrVar.r);
                    removeCallbacks(vrVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((k2.u) this.b).b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tr(gk0 gk0Var, Context context) {
        super(context);
        this.c = gk0Var;
    }
}
