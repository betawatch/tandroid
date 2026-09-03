package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class kc1 implements org.telegram.ui.Components.jo0, org.telegram.ui.Components.k20 {
    public final /* synthetic */ jd1 a;

    public /* synthetic */ kc1(jd1 jd1Var) {
        this.a = jd1Var;
    }

    @Override // org.telegram.ui.Components.jo0
    public void X(float f10, boolean z4) {
        jd1 jd1Var = this.a;
        jd1Var.i1 = f10;
        jd1Var.k1();
    }

    @Override // org.telegram.ui.Components.jo0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Components.jo0
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
        jd1 jd1Var = this.a;
        Scroller scroller = jd1Var.c;
        if (scroller == null) {
            return true;
        }
        scroller.abortAnimation();
        jd1Var.c.fling((int) jd1Var.U1, 0, Math.round(-f10), Math.round(f11), 0, (int) jd1Var.T1, 0, ConnectionsManager.DEFAULT_DATACENTER_ID);
        jd1Var.u0.postInvalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.k20
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        jd1 jd1Var = this.a;
        Scroller scroller = jd1Var.c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        jd1Var.U1 = Utilities.clamp(jd1Var.U1 + f10, jd1Var.T1, 0.0f);
        jd1Var.V0();
        jd1Var.u0.invalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.k20
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.ui.Components.jo0
    public void A() {
    }

    @Override // org.telegram.ui.Components.k20
    public void X0() {
    }

    @Override // org.telegram.ui.Components.k20
    public void onLongPress(MotionEvent motionEvent) {
    }
}
