package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.y91;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class yn extends q9 {
    public final org.telegram.ui.Cells.l6 H;
    public final /* synthetic */ org.telegram.ui.ActionBar.g2 I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 K;
    public final /* synthetic */ co L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yn(co coVar, Context context, org.telegram.ui.ActionBar.g2 g2Var, boolean z10, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.L = coVar;
        this.I = g2Var;
        this.J = z10;
        this.K = h6Var;
        this.H = new org.telegram.ui.Cells.l6(this);
    }

    @Override // org.telegram.ui.Components.q9, android.view.View
    public final void onDraw(Canvas canvas) {
        long j3;
        co coVar = this.L;
        if (!coVar.b || this.e != null) {
            super.onDraw(canvas);
            return;
        }
        org.telegram.ui.Cells.l6 l6Var = this.H;
        l6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        l6Var.a = true;
        l6Var.v = true;
        l6Var.J = this.K;
        Integer num = coVar.c;
        if (num != null) {
            l6Var.z = num.intValue();
        }
        org.telegram.ui.bn bnVar = coVar.H;
        if (bnVar != null) {
            j3 = bnVar.a();
        } else {
            org.telegram.ui.ActionBar.g2 g2Var = this.I;
            j3 = g2Var instanceof y91 ? -((y91) g2Var).a : 0L;
        }
        fi.i7.h(j3, canvas, this.a, l6Var);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (!this.J || !getImageReceiver().L()) {
            accessibilityNodeInfo.setVisibleToUser(false);
        } else {
            accessibilityNodeInfo.setText(org.telegram.messenger.hd.N0(2131754797, null));
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.hd.N0(2131747623, null)));
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
