package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ur implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ur(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        i70 i70Var;
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.n1 n1Var = ((wr) this.b).a;
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
                oa0 oa0Var = (oa0) this.b;
                oa0Var.getClass();
                return org.telegram.ui.st.q().s(motionEvent, oa0Var.getListView(), oa0Var.w, null, oa0Var.a);
            case 3:
                qb0 qb0Var = (qb0) this.b;
                qb0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    qb0Var.c0.a(true);
                }
                return true;
            default:
                return ux0.v((ux0) this.b, motionEvent);
        }
    }
}
