// default package

import android.graphics.Canvas;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class bj3 extends rm0 {
    @Override // r59, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // rm0
    public final int z1() {
        return gm.L(48.0f);
    }

    @Override // rm0, r59, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }
}
