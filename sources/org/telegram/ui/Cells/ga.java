package org.telegram.ui.Cells;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ga extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ ha a;

    public ga(ha haVar) {
        this.a = haVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        ha haVar = this.a;
        int i10 = haVar.I7;
        if (haVar.Je != 2 || MediaDataController.getInstance(i10).getDoubleTapReaction() == null) {
            return false;
        }
        boolean selectReaction = haVar.getMessageObject().selectReaction(zg.p0.b(MediaDataController.getInstance(i10).getDoubleTapReaction()), false, false);
        haVar.X3(haVar.getMessageObject(), null, false, false, false, false);
        haVar.requestLayout();
        zg.l0.b(false);
        if (selectReaction) {
            ja jaVar = haVar.Ke;
            zg.l0.d(jaVar.r, null, jaVar.e[1], null, motionEvent.getX(), motionEvent.getY(), zg.p0.b(MediaDataController.getInstance(i10).getDoubleTapReaction()), haVar.I7, 0);
            zg.l0.f();
        }
        haVar.getViewTreeObserver().addOnPreDrawListener(new fa(this, 0));
        return true;
    }
}
