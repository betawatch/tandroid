package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class cd1 implements org.telegram.ui.Components.no0, org.telegram.ui.Components.r20 {
    public final /* synthetic */ ae1 a;

    public /* synthetic */ cd1(ae1 ae1Var) {
        this.a = ae1Var;
    }

    @Override // org.telegram.ui.Components.no0
    public void W(float f7, boolean z10) {
        ae1 ae1Var = this.a;
        ae1Var.l1 = f7;
        ae1Var.k1();
    }

    @Override // org.telegram.ui.Components.no0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Components.no0
    public /* synthetic */ int k0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.r20
    public boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = this.a.c;
        if (scroller == null) {
            return true;
        }
        scroller.abortAnimation();
        return true;
    }

    @Override // org.telegram.ui.Components.r20
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        ae1 ae1Var = this.a;
        Scroller scroller = ae1Var.c;
        if (scroller == null) {
            return true;
        }
        scroller.abortAnimation();
        ae1Var.c.fling((int) ae1Var.X1, 0, Math.round(-f7), Math.round(f10), 0, (int) ae1Var.W1, 0, ConnectionsManager.DEFAULT_DATACENTER_ID);
        ae1Var.x0.postInvalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.r20
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        ae1 ae1Var = this.a;
        Scroller scroller = ae1Var.c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        ae1Var.X1 = Utilities.clamp(ae1Var.X1 + f7, ae1Var.W1, 0.0f);
        ae1Var.V0();
        ae1Var.x0.invalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.r20
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.ui.Components.r20
    public void b1() {
    }

    @Override // org.telegram.ui.Components.r20
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // org.telegram.ui.Components.no0
    public void y() {
    }
}
