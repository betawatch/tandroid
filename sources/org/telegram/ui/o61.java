package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class o61 implements org.telegram.ui.Components.om0, org.telegram.ui.Components.u00 {
    public final /* synthetic */ l71 a;

    public /* synthetic */ o61(l71 l71Var) {
        this.a = l71Var;
    }

    @Override // org.telegram.ui.Components.om0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Components.om0
    public void k(boolean z10, float f10) {
        l71 l71Var = this.a;
        l71Var.n1 = f10;
        l71Var.p1();
    }

    @Override // org.telegram.ui.Components.u00
    public boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = this.a.c;
        if (scroller == null) {
            return true;
        }
        scroller.abortAnimation();
        return true;
    }

    @Override // org.telegram.ui.Components.u00
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        l71 l71Var = this.a;
        Scroller scroller = l71Var.c;
        if (scroller == null) {
            return true;
        }
        scroller.abortAnimation();
        l71Var.c.fling((int) l71Var.Z1, 0, Math.round(-f10), Math.round(f11), 0, (int) l71Var.Y1, 0, ConnectionsManager.DEFAULT_DATACENTER_ID);
        l71Var.z0.postInvalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.u00
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        l71 l71Var = this.a;
        Scroller scroller = l71Var.c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        l71Var.Z1 = Utilities.i(l71Var.Z1 + f10, l71Var.Y1, 0.0f);
        l71Var.a1();
        l71Var.z0.invalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.u00
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.ui.Components.om0
    public /* synthetic */ int q0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.u00
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // org.telegram.ui.Components.om0
    public void D() {
    }

    @Override // org.telegram.ui.Components.u00
    public void a1() {
    }
}
