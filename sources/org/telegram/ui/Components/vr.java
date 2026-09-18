package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                org.telegram.ui.ActionBar.o1 o1Var = ((xr) this.b).a;
                if (motionEvent.getActionMasked() != 1 || o1Var == null || !o1Var.isShowing()) {
                    return false;
                }
                Rect rect = AndroidUtilities.rectTmp2;
                view.getHitRect(rect);
                if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
                o1Var.d(true);
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
                return org.telegram.ui.ut.q().s(motionEvent, na0Var.getListView(), na0Var.w, null, na0Var.a);
            case 3:
                pb0 pb0Var = (pb0) this.b;
                pb0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    pb0Var.c0.a(true);
                }
                return true;
            default:
                return wx0.v((wx0) this.b, motionEvent);
        }
    }
}
