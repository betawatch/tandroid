// default package

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ia2 extends ww9 {
    public final /* synthetic */ qa2 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia2(qa2 qa2Var, Context context, t1 t1Var, ylb ylbVar) {
        super(context, t1Var, ylbVar, false);
        this.O = qa2Var;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.O.M && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.ScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return motionEvent.getAction() != 0 ? super.onTouchEvent(motionEvent) : !this.O.M && super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.bottom = gm.L(60.0f) + rect.bottom;
        return super.requestChildRectangleOnScreen(view, rect, z);
    }
}
