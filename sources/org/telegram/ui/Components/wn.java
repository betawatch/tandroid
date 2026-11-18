package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.y91;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class wn extends q9 {
    public final org.telegram.ui.Cells.l6 H;
    public final /* synthetic */ org.telegram.ui.ActionBar.h2 I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 K;
    public final /* synthetic */ ao L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn(ao aoVar, Context context, org.telegram.ui.ActionBar.h2 h2Var, boolean z10, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.L = aoVar;
        this.I = h2Var;
        this.J = z10;
        this.K = i6Var;
        this.H = new org.telegram.ui.Cells.l6(this);
    }

    @Override // org.telegram.ui.Components.q9, android.view.View
    public final void onDraw(Canvas canvas) {
        long j3;
        ao aoVar = this.L;
        if (!aoVar.b || this.e != null) {
            super.onDraw(canvas);
            return;
        }
        org.telegram.ui.Cells.l6 l6Var = this.H;
        l6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        l6Var.a = true;
        l6Var.v = true;
        l6Var.J = this.K;
        Integer num = aoVar.c;
        if (num != null) {
            l6Var.z = num.intValue();
        }
        org.telegram.ui.bn bnVar = aoVar.H;
        if (bnVar != null) {
            j3 = bnVar.a();
        } else {
            org.telegram.ui.ActionBar.h2 h2Var = this.I;
            j3 = h2Var instanceof y91 ? -((y91) h2Var).a : 0L;
        }
        fi.i7.h(j3, canvas, this.a, l6Var);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (!this.J || !getImageReceiver().L()) {
            accessibilityNodeInfo.setVisibleToUser(false);
        } else {
            accessibilityNodeInfo.setText(org.telegram.messenger.gd.M0(2131754798, null));
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.gd.M0(2131747624, null)));
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
