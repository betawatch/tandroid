package org.telegram.ui.Cells;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class da extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ ea a;

    public da(ea eaVar) {
        this.a = eaVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        ea eaVar = this.a;
        int i9 = eaVar.E7;
        if (eaVar.Ee != 2 || MediaDataController.getInstance(i9).getDoubleTapReaction() == null) {
            return false;
        }
        boolean selectReaction = eaVar.getMessageObject().selectReaction(hg.r0.b(MediaDataController.getInstance(i9).getDoubleTapReaction()), false, false);
        eaVar.X3(eaVar.getMessageObject(), null, false, false, false, false);
        eaVar.requestLayout();
        hg.n0.b(false);
        if (selectReaction) {
            fa faVar = eaVar.Fe;
            hg.n0.d(faVar.r, null, faVar.e[1], null, motionEvent.getX(), motionEvent.getY(), hg.r0.b(MediaDataController.getInstance(i9).getDoubleTapReaction()), eaVar.E7, 0);
            hg.n0.f();
        }
        eaVar.getViewTreeObserver().addOnPreDrawListener(new ca(this, 0));
        return true;
    }
}
