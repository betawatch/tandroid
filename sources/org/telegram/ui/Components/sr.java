package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sr implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sr(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        k70 k70Var;
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.p1 p1Var = ((ur) this.b).a;
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
                p70 p70Var = (p70) ((WeakReference) this.b).get();
                if (p70Var == null || (k70Var = p70Var.m) == null || !k70Var.isShowing()) {
                    view.setOnTouchListener(null);
                    return false;
                }
                if (view.getParent() != null) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                }
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 2) {
                    p70Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                } else if (actionMasked == 1) {
                    p70Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    View view2 = p70Var.p0;
                    if (view2 != null) {
                        p70Var.p0 = null;
                        view2.setPressed(false);
                        view2.performClick();
                    }
                    view.setOnTouchListener(null);
                    p70Var.o0 = null;
                } else if (actionMasked == 3) {
                    View view3 = p70Var.p0;
                    if (view3 != null) {
                        view3.setPressed(false);
                        p70Var.p0 = null;
                    }
                    view.setOnTouchListener(null);
                    p70Var.o0 = null;
                }
                return true;
            case 2:
                qa0 qa0Var = (qa0) this.b;
                qa0Var.getClass();
                return org.telegram.ui.rt.q().s(motionEvent, qa0Var.getListView(), qa0Var.w, null, qa0Var.a);
            case 3:
                rb0 rb0Var = (rb0) this.b;
                rb0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    rb0Var.W.a(true);
                }
                return true;
            default:
                return xx0.v((xx0) this.b, motionEvent);
        }
    }
}
