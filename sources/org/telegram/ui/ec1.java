package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ec1 implements org.telegram.ui.Components.jo0, org.telegram.ui.Components.j20 {
    public final /* synthetic */ cd1 a;

    public /* synthetic */ ec1(cd1 cd1Var) {
        this.a = cd1Var;
    }

    @Override // org.telegram.ui.Components.jo0
    public void Y(float f10, boolean z4) {
        cd1 cd1Var = this.a;
        cd1Var.i1 = f10;
        cd1Var.k1();
    }

    @Override // org.telegram.ui.Components.jo0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Components.jo0
    public /* synthetic */ int j0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.j20
    public boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = this.a.c;
        if (scroller == null) {
            return true;
        }
        scroller.abortAnimation();
        return true;
    }

    @Override // org.telegram.ui.Components.j20
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        cd1 cd1Var = this.a;
        Scroller scroller = cd1Var.c;
        if (scroller == null) {
            return true;
        }
        scroller.abortAnimation();
        cd1Var.c.fling((int) cd1Var.U1, 0, Math.round(-f10), Math.round(f11), 0, (int) cd1Var.T1, 0, ConnectionsManager.DEFAULT_DATACENTER_ID);
        cd1Var.u0.postInvalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.j20
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        cd1 cd1Var = this.a;
        Scroller scroller = cd1Var.c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        cd1Var.U1 = Utilities.clamp(cd1Var.U1 + f10, cd1Var.T1, 0.0f);
        cd1Var.V0();
        cd1Var.u0.invalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.j20
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.ui.Components.jo0
    public void B() {
    }

    @Override // org.telegram.ui.Components.j20
    public void c1() {
    }

    @Override // org.telegram.ui.Components.j20
    public void onLongPress(MotionEvent motionEvent) {
    }
}
