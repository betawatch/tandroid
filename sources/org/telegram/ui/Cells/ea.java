package org.telegram.ui.Cells;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
