package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ir extends ImageView {
    public final /* synthetic */ int a = 0;
    public Object b;
    public final /* synthetic */ ViewGroup c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ir(kr krVar, Context context, m5.c0 c0Var) {
        super(context);
        this.c = krVar;
        this.b = c0Var;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                kr krVar = (kr) this.c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (krVar.n || krVar.f)) {
                    krVar.n = false;
                    krVar.f = false;
                    removeCallbacks(krVar.r);
                    removeCallbacks(krVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((m5.c0) this.b).b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ir(uj0 uj0Var, Context context) {
        super(context);
        this.c = uj0Var;
    }
}
