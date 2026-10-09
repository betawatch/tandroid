package org.telegram.ui.Cells;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
        boolean selectReaction = faVar.getMessageObject().selectReaction(zg.n0.b(MediaDataController.getInstance(i10).getDoubleTapReaction()), false, false);
        faVar.X3(faVar.getMessageObject(), null, false, false, false, false);
        faVar.requestLayout();
        zg.j0.b(false);
        if (selectReaction) {
            ga gaVar = faVar.Ke;
            zg.j0.d(gaVar.r, null, gaVar.e[1], null, motionEvent.getX(), motionEvent.getY(), zg.n0.b(MediaDataController.getInstance(i10).getDoubleTapReaction()), faVar.I7, 0);
            zg.j0.f();
        }
        faVar.getViewTreeObserver().addOnPreDrawListener(new da(this, 0));
        return true;
    }
}
