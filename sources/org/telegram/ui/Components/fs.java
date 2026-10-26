package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class fs extends ImageView {
    public final /* synthetic */ int a = 1;
    public Object b;
    public final /* synthetic */ ViewGroup c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fs(hs hsVar, Context context, jg.s0 s0Var) {
        super(context);
        this.c = hsVar;
        this.b = s0Var;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                hs hsVar = (hs) this.c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (hsVar.n || hsVar.f)) {
                    hsVar.n = false;
                    hsVar.f = false;
                    removeCallbacks(hsVar.r);
                    removeCallbacks(hsVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((jg.s0) this.b).b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fs(fl0 fl0Var, Context context) {
        super(context);
        this.c = fl0Var;
    }
}
