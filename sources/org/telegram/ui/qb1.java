package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class qb1 implements org.telegram.ui.Components.on0, org.telegram.ui.Components.t10 {
    public final /* synthetic */ oc1 a;

    public /* synthetic */ qb1(oc1 oc1Var) {
        this.a = oc1Var;
    }

    @Override // org.telegram.ui.Components.on0
    public void Q(float f10, boolean z10) {
        oc1 oc1Var = this.a;
        oc1Var.h1 = f10;
        oc1Var.k1();
    }

    @Override // org.telegram.ui.Components.on0
    public /* synthetic */ int c0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.on0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Components.t10
    public boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = this.a.c;
        if (scroller == null) {
            return true;
        }
        scroller.abortAnimation();
        return true;
    }

    @Override // org.telegram.ui.Components.t10
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        oc1 oc1Var = this.a;
        Scroller scroller = oc1Var.c;
        if (scroller == null) {
            return true;
        }
        scroller.abortAnimation();
        oc1Var.c.fling((int) oc1Var.T1, 0, Math.round(-f10), Math.round(f11), 0, (int) oc1Var.S1, 0, ConnectionsManager.DEFAULT_DATACENTER_ID);
        oc1Var.t0.postInvalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.t10
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        oc1 oc1Var = this.a;
        Scroller scroller = oc1Var.c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        oc1Var.T1 = Utilities.clamp(oc1Var.T1 + f10, oc1Var.S1, 0.0f);
        oc1Var.V0();
        oc1Var.t0.invalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.t10
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.ui.Components.t10
    public void b1() {
    }

    @Override // org.telegram.ui.Components.on0
    public void n() {
    }

    @Override // org.telegram.ui.Components.t10
    public void onLongPress(MotionEvent motionEvent) {
    }
}
