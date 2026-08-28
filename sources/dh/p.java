package dh;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class p extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ List b;
    public final /* synthetic */ q c;
    public final /* synthetic */ r d;

    public p(r rVar, View view, List list, q qVar) {
        this.d = rVar;
        this.a = view;
        this.b = list;
        this.c = qVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        View view = this.a;
        int scrollY = view.getScrollY() + y10;
        int paddingLeft = x10 - view.getPaddingLeft();
        int paddingTop = scrollY - view.getPaddingTop();
        r rVar = this.d;
        int i9 = paddingLeft - rVar.c;
        int i10 = paddingTop - rVar.d;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            if (((l) it.next()).getBounds().contains(i9, i10)) {
                rVar.b = true;
                return true;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        r rVar = this.d;
        if (rVar.b) {
            View view = this.a;
            view.playSoundEffect(0);
            rVar.b = false;
            int x10 = (int) motionEvent.getX();
            int scrollY = view.getScrollY() + ((int) motionEvent.getY());
            int paddingLeft = x10 - view.getPaddingLeft();
            int paddingTop = scrollY - view.getPaddingTop();
            int i9 = paddingLeft - rVar.c;
            int i10 = paddingTop - rVar.d;
            for (l lVar : this.b) {
                if (lVar.getBounds().contains(i9, i10)) {
                    this.c.e(lVar, i9, i10);
                    return true;
                }
            }
        }
        return false;
    }
}
