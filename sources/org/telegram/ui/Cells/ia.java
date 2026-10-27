package org.telegram.ui.Cells;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ia extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ ja a;

    public ia(ja jaVar) {
        this.a = jaVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        ja jaVar = this.a;
        int i10 = jaVar.I7;
        if (jaVar.Ke != 2 || MediaDataController.getInstance(i10).getDoubleTapReaction() == null) {
            return false;
        }
        boolean selectReaction = jaVar.getMessageObject().selectReaction(bh.x0.b(MediaDataController.getInstance(i10).getDoubleTapReaction()), false, false);
        jaVar.Z3(jaVar.getMessageObject(), null, false, false, false, false);
        jaVar.requestLayout();
        bh.s0.b(false);
        if (selectReaction) {
            ka kaVar = jaVar.Le;
            bh.s0.d(kaVar.r, null, kaVar.e[1], null, motionEvent.getX(), motionEvent.getY(), bh.x0.b(MediaDataController.getInstance(i10).getDoubleTapReaction()), jaVar.I7, 0);
            bh.s0.f();
        }
        jaVar.getViewTreeObserver().addOnPreDrawListener(new ha(this, 0));
        return true;
    }
}
