package jh;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class s extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ t a;

    public s(t tVar) {
        this.a = tVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        t tVar = this.a;
        if (!tVar.e.c.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (tVar.e.f.getLeft() >= motionEvent.getX() || motionEvent.getX() >= tVar.e.f.getRight() || tVar.e.f.getTop() >= motionEvent.getY() || motionEvent.getY() >= tVar.e.f.getBottom())) {
            tVar.e.e(false);
        }
        return super.onSingleTapUp(motionEvent);
    }
}
