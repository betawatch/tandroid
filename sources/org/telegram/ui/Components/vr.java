package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        l70 l70Var;
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.p1 p1Var = ((xr) this.b).a;
                if (motionEvent.getActionMasked() != 1 || p1Var == null || !p1Var.isShowing()) {
                    return false;
                }
                Rect rect = AndroidUtilities.rectTmp2;
                view.getHitRect(rect);
                if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
                p1Var.d(true);
                return false;
            case 1:
                q70 q70Var = (q70) ((WeakReference) this.b).get();
                if (q70Var == null || (l70Var = q70Var.m) == null || !l70Var.isShowing()) {
                    view.setOnTouchListener(null);
                    return false;
                }
                if (view.getParent() != null) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                }
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 2) {
                    q70Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                } else if (actionMasked == 1) {
                    q70Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    View view2 = q70Var.p0;
                    if (view2 != null) {
                        q70Var.p0 = null;
                        view2.setPressed(false);
                        view2.performClick();
                    }
                    view.setOnTouchListener(null);
                    q70Var.o0 = null;
                } else if (actionMasked == 3) {
                    View view3 = q70Var.p0;
                    if (view3 != null) {
                        view3.setPressed(false);
                        q70Var.p0 = null;
                    }
                    view.setOnTouchListener(null);
                    q70Var.o0 = null;
                }
                return true;
            case 2:
                ra0 ra0Var = (ra0) this.b;
                ra0Var.getClass();
                return org.telegram.ui.qt.q().s(motionEvent, ra0Var.getListView(), ra0Var.w, null, ra0Var.a);
            case 3:
                sb0 sb0Var = (sb0) this.b;
                sb0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    sb0Var.W.a(true);
                }
                return true;
            default:
                return xx0.v((xx0) this.b, motionEvent);
        }
    }
}
