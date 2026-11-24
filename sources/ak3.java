// default package

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ak3 extends ig4 {
    public final /* synthetic */ nk3 H0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak3(nk3 nk3Var, Context context, ylb ylbVar) {
        super(context, ylbVar);
        this.H0 = nk3Var;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.H0.p3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}
