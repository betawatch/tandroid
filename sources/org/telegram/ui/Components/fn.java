package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.z91;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class fn extends k9 {
    public final org.telegram.ui.Cells.k6 G;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 J;
    public final /* synthetic */ jn K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn(jn jnVar, Context context, org.telegram.ui.ActionBar.f2 f2Var, boolean z9, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.K = jnVar;
        this.H = f2Var;
        this.I = z9;
        this.J = h6Var;
        this.G = new org.telegram.ui.Cells.k6(this);
    }

    @Override // org.telegram.ui.Components.k9, android.view.View
    public final void onDraw(Canvas canvas) {
        long j3;
        jn jnVar = this.K;
        if (!jnVar.b || this.e != null) {
            super.onDraw(canvas);
            return;
        }
        org.telegram.ui.Cells.k6 k6Var = this.G;
        k6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        k6Var.a = true;
        k6Var.v = true;
        k6Var.J = this.J;
        Integer num = jnVar.c;
        if (num != null) {
            k6Var.z = num.intValue();
        }
        org.telegram.ui.cn cnVar = jnVar.G;
        if (cnVar != null) {
            j3 = cnVar.a();
        } else {
            org.telegram.ui.ActionBar.f2 f2Var = this.H;
            j3 = f2Var instanceof z91 ? -((z91) f2Var).a : 0L;
        }
        di.s7.h(j3, canvas, this.a, k6Var);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (!this.I || !getImageReceiver().L()) {
            accessibilityNodeInfo.setVisibleToUser(false);
        } else {
            accessibilityNodeInfo.setText(org.telegram.messenger.id.M0(2131754798, null));
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.id.M0(2131747817, null)));
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
