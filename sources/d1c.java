// default package

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class d1c extends r59 {
    public final /* synthetic */ s1c f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1c(s1c s1cVar, Context context) {
        super(context, null);
        this.f3 = s1cVar;
    }

    @Override // r59, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y = motionEvent.getY();
            s1c s1cVar = this.f3;
            if (y < s1cVar.F0(true) - getTop()) {
                s1cVar.dismiss();
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
    }
}
