package g;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import v7.q7;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class p extends ContentFrameLayout {
    public final /* synthetic */ r r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar, k.c cVar) {
        super(cVar);
        this.r = rVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.r.j(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            if (x10 < -5 || y3 < -5 || x10 > getWidth() + 5 || y3 > getHeight() + 5) {
                r rVar = this.r;
                rVar.i(rVar.q(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i10) {
        setBackgroundDrawable(q7.b(getContext(), i10));
    }
}
