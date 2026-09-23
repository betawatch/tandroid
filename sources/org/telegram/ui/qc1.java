package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class qc1 implements org.telegram.ui.Components.eo0, org.telegram.ui.Components.j20 {
    public final /* synthetic */ od1 a;

    public /* synthetic */ qc1(od1 od1Var) {
        this.a = od1Var;
    }

    @Override // org.telegram.ui.Components.eo0
    public void X(float f7, boolean z10) {
        od1 od1Var = this.a;
        od1Var.l1 = f7;
        od1Var.k1();
    }

    @Override // org.telegram.ui.Components.eo0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Components.eo0
    public /* synthetic */ int m0() {
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
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        od1 od1Var = this.a;
        Scroller scroller = od1Var.c;
        if (scroller == null) {
            return true;
        }
        scroller.abortAnimation();
        od1Var.c.fling((int) od1Var.X1, 0, Math.round(-f7), Math.round(f10), 0, (int) od1Var.W1, 0, ConnectionsManager.DEFAULT_DATACENTER_ID);
        od1Var.x0.postInvalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.j20
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        od1 od1Var = this.a;
        Scroller scroller = od1Var.c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        od1Var.X1 = Utilities.clamp(od1Var.X1 + f7, od1Var.W1, 0.0f);
        od1Var.V0();
        od1Var.x0.invalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.j20
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.ui.Components.eo0
    public void B() {
    }

    @Override // org.telegram.ui.Components.j20
    public void b1() {
    }

    @Override // org.telegram.ui.Components.j20
    public void onLongPress(MotionEvent motionEvent) {
    }
}
