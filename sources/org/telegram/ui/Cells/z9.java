package org.telegram.ui.Cells;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class z9 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ aa a;

    public z9(aa aaVar) {
        this.a = aaVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        aa aaVar = this.a;
        int i10 = aaVar.E7;
        if (aaVar.Ee != 2 || MediaDataController.getInstance(i10).getDoubleTapReaction() == null) {
            return false;
        }
        boolean selectReaction = aaVar.getMessageObject().selectReaction(ig.q0.b(MediaDataController.getInstance(i10).getDoubleTapReaction()), false, false);
        aaVar.W3(aaVar.getMessageObject(), null, false, false, false, false);
        aaVar.requestLayout();
        ig.m0.b(false);
        if (selectReaction) {
            ba baVar = aaVar.Fe;
            ig.m0.d(baVar.r, null, baVar.e[1], null, motionEvent.getX(), motionEvent.getY(), ig.q0.b(MediaDataController.getInstance(i10).getDoubleTapReaction()), aaVar.E7, 0);
            ig.m0.f();
        }
        aaVar.getViewTreeObserver().addOnPreDrawListener(new y9(this, 0));
        return true;
    }
}
