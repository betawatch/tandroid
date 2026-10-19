package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class mb1 implements org.telegram.ui.Components.bp0, org.telegram.ui.Components.r20 {
    public final /* synthetic */ kc1 a;

    public /* synthetic */ mb1(kc1 kc1Var) {
        this.a = kc1Var;
    }

    @Override // org.telegram.ui.Components.bp0
    public void L(float f7, boolean z10) {
        kc1 kc1Var = this.a;
        kc1Var.l1 = f7;
        kc1Var.k1();
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
        kc1 kc1Var = this.a;
        Scroller scroller = kc1Var.c;
        if (scroller == null) {
            return true;
        }
        scroller.abortAnimation();
        kc1Var.c.fling((int) kc1Var.X1, 0, Math.round(-f7), Math.round(f10), 0, (int) kc1Var.W1, 0, ConnectionsManager.DEFAULT_DATACENTER_ID);
        kc1Var.x0.postInvalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.r20
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        kc1 kc1Var = this.a;
        Scroller scroller = kc1Var.c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        kc1Var.X1 = Utilities.clamp(kc1Var.X1 + f7, kc1Var.W1, 0.0f);
        kc1Var.V0();
        kc1Var.x0.invalidate();
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
