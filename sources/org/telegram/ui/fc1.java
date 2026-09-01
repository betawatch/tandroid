package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class fc1 implements org.telegram.ui.Components.ko0, org.telegram.ui.Components.k20 {
    public final /* synthetic */ ed1 a;

    public /* synthetic */ fc1(ed1 ed1Var) {
        this.a = ed1Var;
    }

    @Override // org.telegram.ui.Components.ko0
    public void X(float f10, boolean z4) {
        ed1 ed1Var = this.a;
        ed1Var.i1 = f10;
        ed1Var.k1();
    }

    @Override // org.telegram.ui.Components.ko0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Components.ko0
    public /* synthetic */ int m0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.k20
    public boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = this.a.c;
        if (scroller == null) {
            return true;
        }
        scroller.abortAnimation();
        return true;
    }

    @Override // org.telegram.ui.Components.k20
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        ed1 ed1Var = this.a;
        Scroller scroller = ed1Var.c;
        if (scroller == null) {
            return true;
        }
        scroller.abortAnimation();
        ed1Var.c.fling((int) ed1Var.U1, 0, Math.round(-f10), Math.round(f11), 0, (int) ed1Var.T1, 0, ConnectionsManager.DEFAULT_DATACENTER_ID);
        ed1Var.u0.postInvalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.k20
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        ed1 ed1Var = this.a;
        Scroller scroller = ed1Var.c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        ed1Var.U1 = Utilities.clamp(ed1Var.U1 + f10, ed1Var.T1, 0.0f);
        ed1Var.V0();
        ed1Var.u0.invalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.k20
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.ui.Components.ko0
    public void A() {
    }

    @Override // org.telegram.ui.Components.k20
    public void X0() {
    }

    @Override // org.telegram.ui.Components.k20
    public void onLongPress(MotionEvent motionEvent) {
    }
}
