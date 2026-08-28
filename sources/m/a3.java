package m;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a3 extends TouchDelegate {
    public final View a;
    public final Rect b;
    public final Rect c;
    public final Rect d;
    public final int e;
    public boolean f;

    public a3(Rect rect, Rect rect2, View view) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.b = rect3;
        Rect rect4 = new Rect();
        this.d = rect4;
        Rect rect5 = new Rect();
        this.c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i9 = -scaledTouchSlop;
        rect4.inset(i9, i9);
        rect5.set(rect2);
        this.a = view;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z12 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z11 = this.f;
                if (z11 && !this.d.contains(x10, y10)) {
                    z12 = z11;
                    z10 = false;
                }
            } else {
                if (action == 3) {
                    z11 = this.f;
                    this.f = false;
                }
                z10 = true;
                z12 = false;
            }
            z12 = z11;
            z10 = true;
        } else {
            if (this.b.contains(x10, y10)) {
                this.f = true;
                z10 = true;
            }
            z10 = true;
            z12 = false;
        }
        if (!z12) {
            return false;
        }
        Rect rect = this.c;
        View view = this.a;
        if (!z10 || rect.contains(x10, y10)) {
            motionEvent.setLocation(x10 - rect.left, y10 - rect.top);
        } else {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
