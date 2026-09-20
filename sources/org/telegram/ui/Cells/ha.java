package org.telegram.ui.Cells;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class ha extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ ia a;

    public ha(ia iaVar) {
        this.a = iaVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        ia iaVar = this.a;
        int i10 = iaVar.I7;
        if (iaVar.Je != 2 || MediaDataController.getInstance(i10).getDoubleTapReaction() == null) {
            return false;
        }
        boolean selectReaction = iaVar.getMessageObject().selectReaction(zg.o0.b(MediaDataController.getInstance(i10).getDoubleTapReaction()), false, false);
        iaVar.X3(iaVar.getMessageObject(), null, false, false, false, false);
        iaVar.requestLayout();
        zg.k0.b(false);
        if (selectReaction) {
            ja jaVar = iaVar.Ke;
            zg.k0.d(jaVar.r, null, jaVar.e[1], null, motionEvent.getX(), motionEvent.getY(), zg.o0.b(MediaDataController.getInstance(i10).getDoubleTapReaction()), iaVar.I7, 0);
            zg.k0.f();
        }
        iaVar.getViewTreeObserver().addOnPreDrawListener(new ga(this, 0));
        return true;
    }
}
