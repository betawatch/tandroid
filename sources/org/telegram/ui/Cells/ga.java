package org.telegram.ui.Cells;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
        if (haVar.Ie != 2 || MediaDataController.getInstance(i10).getDoubleTapReaction() == null) {
            return false;
        }
        boolean selectReaction = haVar.getMessageObject().selectReaction(ah.j1.b(MediaDataController.getInstance(i10).getDoubleTapReaction()), false, false);
        haVar.X3(haVar.getMessageObject(), null, false, false, false, false);
        haVar.requestLayout();
        ah.e1.b(false);
        if (selectReaction) {
            ia iaVar = haVar.Je;
            ah.e1.d(iaVar.r, null, iaVar.e[1], null, motionEvent.getX(), motionEvent.getY(), ah.j1.b(MediaDataController.getInstance(i10).getDoubleTapReaction()), haVar.I7, 0);
            ah.e1.f();
        }
        haVar.getViewTreeObserver().addOnPreDrawListener(new fa(this, 0));
        return true;
    }
}
