package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class a71 implements org.telegram.ui.Components.lm0, org.telegram.ui.Components.y00 {
    public final /* synthetic */ x71 a;

    public /* synthetic */ a71(x71 x71Var) {
        this.a = x71Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Components.lm0
    public void l(boolean z9, float f10) {
        x71 x71Var = this.a;
        x71Var.m1 = f10;
        x71Var.p1();
    }

    @Override // org.telegram.ui.Components.y00
    public boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = this.a.c;
        if (scroller == null) {
            return true;
        }
        scroller.abortAnimation();
        return true;
    }

    @Override // org.telegram.ui.Components.y00
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        x71 x71Var = this.a;
        Scroller scroller = x71Var.c;
        if (scroller == null) {
            return true;
        }
        scroller.abortAnimation();
        x71Var.c.fling((int) x71Var.Y1, 0, Math.round(-f10), Math.round(f11), 0, (int) x71Var.X1, 0, ConnectionsManager.DEFAULT_DATACENTER_ID);
        x71Var.y0.postInvalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.y00
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        x71 x71Var = this.a;
        Scroller scroller = x71Var.c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        x71Var.Y1 = Utilities.i(x71Var.Y1 + f10, x71Var.X1, 0.0f);
        x71Var.a1();
        x71Var.y0.invalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.y00
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.ui.Components.lm0
    public /* synthetic */ int q0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.y00
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // org.telegram.ui.Components.lm0
    public void D() {
    }

    @Override // org.telegram.ui.Components.y00
    public void d1() {
    }
}
