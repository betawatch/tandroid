package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pr implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pr(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        e70 e70Var;
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.o1 o1Var = ((rr) this.b).a;
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
                j70 j70Var = (j70) ((WeakReference) this.b).get();
                if (j70Var == null || (e70Var = j70Var.m) == null || !e70Var.isShowing()) {
                    view.setOnTouchListener(null);
                    return false;
                }
                if (view.getParent() != null) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                }
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 2) {
                    j70Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                } else if (actionMasked == 1) {
                    j70Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    View view2 = j70Var.p0;
                    if (view2 != null) {
                        j70Var.p0 = null;
                        view2.setPressed(false);
                        view2.performClick();
                    }
                    view.setOnTouchListener(null);
                    j70Var.o0 = null;
                } else if (actionMasked == 3) {
                    View view3 = j70Var.p0;
                    if (view3 != null) {
                        view3.setPressed(false);
                        j70Var.p0 = null;
                    }
                    view.setOnTouchListener(null);
                    j70Var.o0 = null;
                }
                return true;
            case 2:
                ka0 ka0Var = (ka0) this.b;
                ka0Var.getClass();
                return org.telegram.ui.ht.q().s(motionEvent, ka0Var.getListView(), ka0Var.w, null, ka0Var.a);
            case 3:
                lb0 lb0Var = (lb0) this.b;
                lb0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    lb0Var.V.a(true);
                }
                return true;
            default:
                return nx0.v((nx0) this.b, motionEvent);
        }
    }
}
