package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.w91;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class vn extends p9 {
    public final org.telegram.ui.Cells.k6 H;
    public final /* synthetic */ org.telegram.ui.ActionBar.g2 I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 K;
    public final /* synthetic */ zn L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn(zn znVar, Context context, org.telegram.ui.ActionBar.g2 g2Var, boolean z10, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.L = znVar;
        this.I = g2Var;
        this.J = z10;
        this.K = i6Var;
        this.H = new org.telegram.ui.Cells.k6(this);
    }

    @Override // org.telegram.ui.Components.p9, android.view.View
    public final void onDraw(Canvas canvas) {
        long j3;
        zn znVar = this.L;
        if (!znVar.b || this.e != null) {
            super.onDraw(canvas);
            return;
        }
        org.telegram.ui.Cells.k6 k6Var = this.H;
        k6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        k6Var.a = true;
        k6Var.v = true;
        k6Var.J = this.K;
        Integer num = znVar.c;
        if (num != null) {
            k6Var.z = num.intValue();
        }
        org.telegram.ui.bn bnVar = znVar.H;
        if (bnVar != null) {
            j3 = bnVar.a();
        } else {
            org.telegram.ui.ActionBar.g2 g2Var = this.I;
            j3 = g2Var instanceof w91 ? -((w91) g2Var).a : 0L;
        }
        fi.i7.h(j3, canvas, this.a, k6Var);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (!this.J || !getImageReceiver().M()) {
            accessibilityNodeInfo.setVisibleToUser(false);
        } else {
            accessibilityNodeInfo.setText(org.telegram.messenger.gd.N0(2131754797, null));
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.gd.N0(2131747623, null)));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.L.b && this.H.a(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
