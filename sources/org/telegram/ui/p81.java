package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p81 implements org.telegram.ui.Components.mn0, org.telegram.ui.Components.o10 {
    public final /* synthetic */ m91 a;

    public /* synthetic */ p81(m91 m91Var) {
        this.a = m91Var;
    }

    @Override // org.telegram.ui.Components.mn0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Components.mn0
    public void k(boolean z10, float f7) {
        m91 m91Var = this.a;
        m91Var.m1 = f7;
        m91Var.o1();
    }

    @Override // org.telegram.ui.Components.o10
    public boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = this.a.c;
        if (scroller == null) {
            return true;
        }
        scroller.abortAnimation();
        return true;
    }

    @Override // org.telegram.ui.Components.o10
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        m91 m91Var = this.a;
        Scroller scroller = m91Var.c;
        if (scroller == null) {
            return true;
        }
        scroller.abortAnimation();
        m91Var.c.fling((int) m91Var.Y1, 0, Math.round(-f7), Math.round(f10), 0, (int) m91Var.X1, 0, ConnectionsManager.DEFAULT_DATACENTER_ID);
        m91Var.y0.postInvalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.o10
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        m91 m91Var = this.a;
        Scroller scroller = m91Var.c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        m91Var.Y1 = Utilities.i(m91Var.Y1 + f7, m91Var.X1, 0.0f);
        m91Var.Z0();
        m91Var.y0.invalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.o10
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.ui.Components.mn0
    public /* synthetic */ int p0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.o10
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // org.telegram.ui.Components.mn0
    public void C() {
    }

    @Override // org.telegram.ui.Components.o10
    public void e1() {
    }
}
