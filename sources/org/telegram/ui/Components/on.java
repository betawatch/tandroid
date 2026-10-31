package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.pb1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class on extends g9 {
    public final org.telegram.ui.Cells.o6 G;
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 J;
    public final /* synthetic */ sn K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on(sn snVar, Context context, org.telegram.ui.ActionBar.k2 k2Var, boolean z10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.K = snVar;
        this.H = k2Var;
        this.I = z10;
        this.J = p6Var;
        this.G = new org.telegram.ui.Cells.o6(this);
    }

    @Override // org.telegram.ui.Components.g9, android.view.View
    public final void onDraw(Canvas canvas) {
        long j10;
        sn snVar = this.K;
        if (!snVar.b || this.e != null) {
            super.onDraw(canvas);
            return;
        }
        org.telegram.ui.Cells.o6 o6Var = this.G;
        o6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        o6Var.a = true;
        o6Var.v = true;
        o6Var.J = this.J;
        Integer num = snVar.c;
        if (num != null) {
            o6Var.z = num.intValue();
        }
        org.telegram.ui.un unVar = snVar.G;
        if (unVar != null) {
            j10 = unVar.a();
        } else {
            org.telegram.ui.ActionBar.k2 k2Var = this.H;
            j10 = k2Var instanceof pb1 ? -((pb1) k2Var).a : 0L;
        }
        th.w5.h(j10, canvas, this.a, o6Var);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (!this.I || !getImageReceiver().L()) {
            accessibilityNodeInfo.setVisibleToUser(false);
        } else {
            accessibilityNodeInfo.setText(org.telegram.messenger.cd.L0(2131754798, null));
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.cd.L0(2131747833, null)));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.K.b && this.G.a(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
