package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ed1 implements org.telegram.ui.Components.fp0, org.telegram.ui.Components.v20 {
    public final /* synthetic */ ce1 a;

    public /* synthetic */ ed1(ce1 ce1Var) {
        this.a = ce1Var;
    }

    @Override // org.telegram.ui.Components.fp0
    public void X(float f7, boolean z10) {
        ce1 ce1Var = this.a;
        ce1Var.l1 = f7;
        ce1Var.k1();
    }

    @Override // org.telegram.ui.Components.fp0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Components.fp0
    public /* synthetic */ int k0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.v20
    public boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = this.a.c;
        if (scroller == null) {
            return true;
        }
        scroller.abortAnimation();
        return true;
    }

    @Override // org.telegram.ui.Components.v20
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        ce1 ce1Var = this.a;
        Scroller scroller = ce1Var.c;
        if (scroller == null) {
            return true;
        }
        scroller.abortAnimation();
        ce1Var.c.fling((int) ce1Var.X1, 0, Math.round(-f7), Math.round(f10), 0, (int) ce1Var.W1, 0, ConnectionsManager.DEFAULT_DATACENTER_ID);
        ce1Var.x0.postInvalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.v20
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        ce1 ce1Var = this.a;
        Scroller scroller = ce1Var.c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        ce1Var.X1 = Utilities.clamp(ce1Var.X1 + f7, ce1Var.W1, 0.0f);
        ce1Var.V0();
        ce1Var.x0.invalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.v20
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.ui.Components.v20
    public void b1() {
    }

    @Override // org.telegram.ui.Components.v20
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // org.telegram.ui.Components.fp0
    public void z() {
    }
}
