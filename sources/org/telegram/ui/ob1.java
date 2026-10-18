package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class ob1 implements org.telegram.ui.Components.bp0, org.telegram.ui.Components.r20 {
    public final /* synthetic */ mc1 a;

    public /* synthetic */ ob1(mc1 mc1Var) {
        this.a = mc1Var;
    }

    @Override // org.telegram.ui.Components.bp0
    public void L(float f7, boolean z10) {
        mc1 mc1Var = this.a;
        mc1Var.l1 = f7;
        mc1Var.k1();
    }

    @Override // org.telegram.ui.Components.bp0
    public /* synthetic */ int Y() {
        return 0;
    }

    @Override // org.telegram.ui.Components.bp0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
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
        mc1 mc1Var = this.a;
        Scroller scroller = mc1Var.c;
        if (scroller == null) {
            return true;
        }
        scroller.abortAnimation();
        mc1Var.c.fling((int) mc1Var.X1, 0, Math.round(-f7), Math.round(f10), 0, (int) mc1Var.W1, 0, ConnectionsManager.DEFAULT_DATACENTER_ID);
        mc1Var.x0.postInvalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.r20
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        mc1 mc1Var = this.a;
        Scroller scroller = mc1Var.c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        mc1Var.X1 = Utilities.clamp(mc1Var.X1 + f7, mc1Var.W1, 0.0f);
        mc1Var.V0();
        mc1Var.x0.invalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.r20
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.ui.Components.r20
    public void N0() {
    }

    @Override // org.telegram.ui.Components.r20
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // org.telegram.ui.Components.bp0
    public void v() {
    }
}
