package kh;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
