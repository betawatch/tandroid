package org.telegram.ui.Cells;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ca extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ da a;

    public ca(da daVar) {
        this.a = daVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        da daVar = this.a;
        int i10 = daVar.F7;
        if (daVar.Fe != 2 || MediaDataController.getInstance(i10).getDoubleTapReaction() == null) {
            return false;
        }
        boolean selectReaction = daVar.getMessageObject().selectReaction(ng.q0.b(MediaDataController.getInstance(i10).getDoubleTapReaction()), false, false);
        daVar.X3(daVar.getMessageObject(), null, false, false, false, false);
        daVar.requestLayout();
        ng.m0.b(false);
        if (selectReaction) {
            ea eaVar = daVar.Ge;
            ng.m0.d(eaVar.r, null, eaVar.e[1], null, motionEvent.getX(), motionEvent.getY(), ng.q0.b(MediaDataController.getInstance(i10).getDoubleTapReaction()), daVar.F7, 0);
            ng.m0.f();
        }
        daVar.getViewTreeObserver().addOnPreDrawListener(new ba(this, 0));
        return true;
    }
}
