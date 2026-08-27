package fh;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
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
