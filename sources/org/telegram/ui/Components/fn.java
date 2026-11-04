package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.m91;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class fn extends k9 {
    public final org.telegram.ui.Cells.j6 H;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 K;
    public final /* synthetic */ jn L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn(jn jnVar, Context context, org.telegram.ui.ActionBar.d2 d2Var, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.L = jnVar;
        this.I = d2Var;
        this.J = z10;
        this.K = e6Var;
        this.H = new org.telegram.ui.Cells.j6(this);
    }

    @Override // org.telegram.ui.Components.k9, android.view.View
    public final void onDraw(Canvas canvas) {
        long j10;
        jn jnVar = this.L;
        if (!jnVar.b || this.e != null) {
            super.onDraw(canvas);
            return;
        }
        org.telegram.ui.Cells.j6 j6Var = this.H;
        j6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        j6Var.a = true;
        j6Var.v = true;
        j6Var.J = this.K;
        Integer num = jnVar.c;
        if (num != null) {
            j6Var.z = num.intValue();
        }
        org.telegram.ui.wm wmVar = jnVar.H;
        if (wmVar != null) {
            j10 = wmVar.a();
        } else {
            org.telegram.ui.ActionBar.d2 d2Var = this.I;
            j10 = d2Var instanceof m91 ? -((m91) d2Var).a : 0L;
        }
        ei.s7.h(j10, canvas, this.a, j6Var);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (!this.J || !getImageReceiver().L()) {
            accessibilityNodeInfo.setVisibleToUser(false);
        } else {
            accessibilityNodeInfo.setText(org.telegram.messenger.bd.M0(2131754798, null));
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.bd.M0(2131747825, null)));
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
