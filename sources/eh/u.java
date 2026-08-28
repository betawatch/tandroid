package eh;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class u extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ v a;

    public u(v vVar) {
        this.a = vVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        v vVar = this.a;
        if (!vVar.e.c.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (vVar.e.f.getLeft() >= motionEvent.getX() || motionEvent.getX() >= vVar.e.f.getRight() || vVar.e.f.getTop() >= motionEvent.getY() || motionEvent.getY() >= vVar.e.f.getBottom())) {
            vVar.e.e(false);
        }
        return super.onSingleTapUp(motionEvent);
    }
}
