package org.telegram.ui.Cells;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class da extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ ea a;

    public da(ea eaVar) {
        this.a = eaVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        ea eaVar = this.a;
        int i10 = eaVar.I7;
        if (eaVar.Je != 2 || MediaDataController.getInstance(i10).getDoubleTapReaction() == null) {
            return false;
        }
        boolean selectReaction = eaVar.getMessageObject().selectReaction(ah.i1.b(MediaDataController.getInstance(i10).getDoubleTapReaction()), false, false);
        eaVar.X3(eaVar.getMessageObject(), null, false, false, false, false);
        eaVar.requestLayout();
        ah.d1.b(false);
        if (selectReaction) {
            fa faVar = eaVar.Ke;
            ah.d1.d(faVar.r, null, faVar.e[1], null, motionEvent.getX(), motionEvent.getY(), ah.i1.b(MediaDataController.getInstance(i10).getDoubleTapReaction()), eaVar.I7, 0);
            ah.d1.f();
        }
        eaVar.getViewTreeObserver().addOnPreDrawListener(new ca(this, 0));
        return true;
    }
}
