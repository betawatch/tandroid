package g;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import v7.u7;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class q extends ContentFrameLayout {
    public final /* synthetic */ s r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar, k.c cVar) {
        super(cVar);
        this.r = sVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.r.i(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            if (x10 < -5 || y3 < -5 || x10 > getWidth() + 5 || y3 > getHeight() + 5) {
                s sVar = this.r;
                sVar.h(sVar.p(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i10) {
        setBackgroundDrawable(u7.b(getContext(), i10));
    }
}
