package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class wr implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wr(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        j70 j70Var;
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.n1 n1Var = ((yr) this.b).a;
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
                oa0 oa0Var = (oa0) this.b;
                oa0Var.getClass();
                return org.telegram.ui.pt.q().s(motionEvent, oa0Var.getListView(), oa0Var.w, null, oa0Var.a);
            case 3:
                ob0 ob0Var = (ob0) this.b;
                ob0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    ob0Var.c0.a(true);
                }
                return true;
            default:
                return ux0.v((ux0) this.b, motionEvent);
        }
    }
}
