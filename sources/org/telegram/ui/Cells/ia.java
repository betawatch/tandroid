package org.telegram.ui.Cells;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
        if (jaVar.Ie != 2 || MediaDataController.getInstance(i10).getDoubleTapReaction() == null) {
            return false;
        }
        boolean selectReaction = jaVar.getMessageObject().selectReaction(yg.p0.b(MediaDataController.getInstance(i10).getDoubleTapReaction()), false, false);
        jaVar.X3(jaVar.getMessageObject(), null, false, false, false, false);
        jaVar.requestLayout();
        yg.l0.b(false);
        if (selectReaction) {
            ka kaVar = jaVar.Je;
            yg.l0.d(kaVar.r, null, kaVar.e[1], null, motionEvent.getX(), motionEvent.getY(), yg.p0.b(MediaDataController.getInstance(i10).getDoubleTapReaction()), jaVar.I7, 0);
            yg.l0.f();
        }
        jaVar.getViewTreeObserver().addOnPreDrawListener(new ha(this, 0));
        return true;
    }
}
