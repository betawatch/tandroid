package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tr implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tr(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        j70 j70Var;
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.p1 p1Var = ((vr) this.b).a;
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
                o70 o70Var = (o70) ((WeakReference) this.b).get();
                if (o70Var == null || (j70Var = o70Var.m) == null || !j70Var.isShowing()) {
                    view.setOnTouchListener(null);
                    return false;
                }
                if (view.getParent() != null) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                }
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 2) {
                    o70Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                } else if (actionMasked == 1) {
                    o70Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    View view2 = o70Var.p0;
                    if (view2 != null) {
                        o70Var.p0 = null;
                        view2.setPressed(false);
                        view2.performClick();
                    }
                    view.setOnTouchListener(null);
                    o70Var.o0 = null;
                } else if (actionMasked == 3) {
                    View view3 = o70Var.p0;
                    if (view3 != null) {
                        view3.setPressed(false);
                        o70Var.p0 = null;
                    }
                    view.setOnTouchListener(null);
                    o70Var.o0 = null;
                }
                return true;
            case 2:
                pa0 pa0Var = (pa0) this.b;
                pa0Var.getClass();
                return org.telegram.ui.pt.q().s(motionEvent, pa0Var.getListView(), pa0Var.w, null, pa0Var.a);
            case 3:
                qb0 qb0Var = (qb0) this.b;
                qb0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    qb0Var.W.a(true);
                }
                return true;
            default:
                return xx0.v((xx0) this.b, motionEvent);
        }
    }
}
