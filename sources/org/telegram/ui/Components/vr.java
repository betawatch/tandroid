package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vr implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vr(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        i70 i70Var;
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.n1 n1Var = ((xr) this.b).a;
                if (motionEvent.getActionMasked() != 1 || n1Var == null || !n1Var.isShowing()) {
                    return false;
                }
                Rect rect = AndroidUtilities.rectTmp2;
                view.getHitRect(rect);
                if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
                n1Var.d(true);
                return false;
            case 1:
                n70 n70Var = (n70) ((WeakReference) this.b).get();
                if (n70Var == null || (i70Var = n70Var.m) == null || !i70Var.isShowing()) {
                    view.setOnTouchListener(null);
                    return false;
                }
                if (view.getParent() != null) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                }
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 2) {
                    n70Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                } else if (actionMasked == 1) {
                    n70Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    View view2 = n70Var.p0;
                    if (view2 != null) {
                        n70Var.p0 = null;
                        view2.setPressed(false);
                        view2.performClick();
                    }
                    view.setOnTouchListener(null);
                    n70Var.o0 = null;
                } else if (actionMasked == 3) {
                    View view3 = n70Var.p0;
                    if (view3 != null) {
                        view3.setPressed(false);
                        n70Var.p0 = null;
                    }
                    view.setOnTouchListener(null);
                    n70Var.o0 = null;
                }
                return true;
            case 2:
                na0 na0Var = (na0) this.b;
                na0Var.getClass();
                return org.telegram.ui.st.q().s(motionEvent, na0Var.getListView(), na0Var.w, null, na0Var.a);
            case 3:
                pb0 pb0Var = (pb0) this.b;
                pb0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    pb0Var.c0.a(true);
                }
                return true;
            default:
                return vx0.v((vx0) this.b, motionEvent);
        }
    }
}
