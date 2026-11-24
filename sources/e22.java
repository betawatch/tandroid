// default package

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class e22 extends oq4 {
    public final i22 K;

    public e22(i22 i22Var, ylb ylbVar, Context context) {
        super(context, ylbVar);
        this.K = i22Var;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.K.c1(this.r, true);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
