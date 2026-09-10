package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class bs implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bs(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        r70 r70Var;
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.p1 p1Var = ((ds) this.b).a;
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
                w70 w70Var = (w70) ((WeakReference) this.b).get();
                if (w70Var == null || (r70Var = w70Var.m) == null || !r70Var.isShowing()) {
                    view.setOnTouchListener(null);
                    return false;
                }
                if (view.getParent() != null) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                }
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 2) {
                    w70Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                } else if (actionMasked == 1) {
                    w70Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    View view2 = w70Var.p0;
                    if (view2 != null) {
                        w70Var.p0 = null;
                        view2.setPressed(false);
                        view2.performClick();
                    }
                    view.setOnTouchListener(null);
                    w70Var.o0 = null;
                } else if (actionMasked == 3) {
                    View view3 = w70Var.p0;
                    if (view3 != null) {
                        view3.setPressed(false);
                        w70Var.p0 = null;
                    }
                    view.setOnTouchListener(null);
                    w70Var.o0 = null;
                }
                return true;
            case 2:
                xa0 xa0Var = (xa0) this.b;
                xa0Var.getClass();
                return org.telegram.ui.tt.q().s(motionEvent, xa0Var.getListView(), xa0Var.w, null, xa0Var.a);
            case 3:
                yb0 yb0Var = (yb0) this.b;
                yb0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    yb0Var.c0.a(true);
                }
                return true;
            default:
                return hy0.v((hy0) this.b, motionEvent);
        }
    }
}
