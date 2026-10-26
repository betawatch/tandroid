package g;

import a8.kc;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
        return this.r.i(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x9 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            if (x9 < -5 || y3 < -5 || x9 > getWidth() + 5 || y3 > getHeight() + 5) {
                r rVar = this.r;
                rVar.h(rVar.o(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i10) {
        setBackgroundDrawable(kc.b(getContext(), i10));
    }
}
