// default package

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class n92 extends ny9 {
    public final /* synthetic */ v92 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n92(v92 v92Var, Context context, u1 u1Var, vnb vnbVar) {
        super(context, u1Var, vnbVar, false);
        this.O = v92Var;
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
        rect.bottom = hl.L(60.0f) + rect.bottom;
        return super.requestChildRectangleOnScreen(view, rect, z);
    }
}
