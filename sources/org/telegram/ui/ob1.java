package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ob1 implements org.telegram.ui.Components.pn0, org.telegram.ui.Components.w10 {
    public final /* synthetic */ nc1 a;

    public /* synthetic */ ob1(nc1 nc1Var) {
        this.a = nc1Var;
    }

    @Override // org.telegram.ui.Components.pn0
    public void P(float f10, boolean z10) {
        nc1 nc1Var = this.a;
        nc1Var.h1 = f10;
        nc1Var.k1();
    }

    @Override // org.telegram.ui.Components.pn0
    public /* synthetic */ int a0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.pn0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Components.w10
    public boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = this.a.c;
        if (scroller == null) {
            return true;
        }
        scroller.abortAnimation();
        return true;
    }

    @Override // org.telegram.ui.Components.w10
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        nc1 nc1Var = this.a;
        Scroller scroller = nc1Var.c;
        if (scroller == null) {
            return true;
        }
        scroller.abortAnimation();
        nc1Var.c.fling((int) nc1Var.T1, 0, Math.round(-f10), Math.round(f11), 0, (int) nc1Var.S1, 0, ConnectionsManager.DEFAULT_DATACENTER_ID);
        nc1Var.t0.postInvalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.w10
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        nc1 nc1Var = this.a;
        Scroller scroller = nc1Var.c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        nc1Var.T1 = Utilities.clamp(nc1Var.T1 + f10, nc1Var.S1, 0.0f);
        nc1Var.V0();
        nc1Var.t0.invalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.w10
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.ui.Components.w10
    public void b1() {
    }

    @Override // org.telegram.ui.Components.w10
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // org.telegram.ui.Components.pn0
    public void r() {
    }
}
