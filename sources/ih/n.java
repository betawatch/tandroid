package ih;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class n extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ List b;
    public final /* synthetic */ o c;
    public final /* synthetic */ p d;

    public n(p pVar, View view, List list, o oVar) {
        this.d = pVar;
        this.a = view;
        this.b = list;
        this.c = oVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        View view = this.a;
        int scrollY = view.getScrollY() + y10;
        int paddingLeft = x10 - view.getPaddingLeft();
        int paddingTop = scrollY - view.getPaddingTop();
        p pVar = this.d;
        int i10 = paddingLeft - pVar.c;
        int i11 = paddingTop - pVar.d;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            if (((k) it.next()).getBounds().contains(i10, i11)) {
                pVar.b = true;
                return true;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        p pVar = this.d;
        if (pVar.b) {
            View view = this.a;
            view.playSoundEffect(0);
            pVar.b = false;
            int x10 = (int) motionEvent.getX();
            int scrollY = view.getScrollY() + ((int) motionEvent.getY());
            int paddingLeft = x10 - view.getPaddingLeft();
            int paddingTop = scrollY - view.getPaddingTop();
            int i10 = paddingLeft - pVar.c;
            int i11 = paddingTop - pVar.d;
            for (k kVar : this.b) {
                if (kVar.getBounds().contains(i10, i11)) {
                    this.c.o(kVar, i10, i11);
                    return true;
                }
            }
        }
        return false;
    }
}
