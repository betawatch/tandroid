package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class n81 implements org.telegram.ui.Components.nn0, org.telegram.ui.Components.o10 {
    public final /* synthetic */ k91 a;

    public /* synthetic */ n81(k91 k91Var) {
        this.a = k91Var;
    }

    @Override // org.telegram.ui.Components.nn0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Components.nn0
    public void k(boolean z10, float f7) {
        k91 k91Var = this.a;
        k91Var.m1 = f7;
        k91Var.p1();
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
        k91 k91Var = this.a;
        Scroller scroller = k91Var.c;
        if (scroller == null) {
            return true;
        }
        scroller.abortAnimation();
        k91Var.c.fling((int) k91Var.Y1, 0, Math.round(-f7), Math.round(f10), 0, (int) k91Var.X1, 0, ConnectionsManager.DEFAULT_DATACENTER_ID);
        k91Var.y0.postInvalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.o10
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        k91 k91Var = this.a;
        Scroller scroller = k91Var.c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        k91Var.Y1 = Utilities.i(k91Var.Y1 + f7, k91Var.X1, 0.0f);
        k91Var.a1();
        k91Var.y0.invalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.o10
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.ui.Components.nn0
    public /* synthetic */ int p0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.o10
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // org.telegram.ui.Components.nn0
    public void C() {
    }

    @Override // org.telegram.ui.Components.o10
    public void e1() {
    }
}
