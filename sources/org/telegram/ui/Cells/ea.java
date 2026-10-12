package org.telegram.ui.Cells;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ea extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ fa a;

    public ea(fa faVar) {
        this.a = faVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        fa faVar = this.a;
        int i10 = faVar.I7;
        if (faVar.Je != 2 || MediaDataController.getInstance(i10).getDoubleTapReaction() == null) {
            return false;
        }
        boolean selectReaction = faVar.getMessageObject().selectReaction(ah.i1.b(MediaDataController.getInstance(i10).getDoubleTapReaction()), false, false);
        faVar.X3(faVar.getMessageObject(), null, false, false, false, false);
        faVar.requestLayout();
        ah.d1.b(false);
        if (selectReaction) {
            ga gaVar = faVar.Ke;
            ah.d1.d(gaVar.r, null, gaVar.e[1], null, motionEvent.getX(), motionEvent.getY(), ah.i1.b(MediaDataController.getInstance(i10).getDoubleTapReaction()), faVar.I7, 0);
            ah.d1.f();
        }
        faVar.getViewTreeObserver().addOnPreDrawListener(new da(this, 0));
        return true;
    }
}
