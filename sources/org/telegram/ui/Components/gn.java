package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.v91;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class gn extends l9 {
    public final org.telegram.ui.Cells.k6 G;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 J;
    public final /* synthetic */ kn K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn(kn knVar, Context context, org.telegram.ui.ActionBar.f2 f2Var, boolean z9, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.K = knVar;
        this.H = f2Var;
        this.I = z9;
        this.J = f6Var;
        this.G = new org.telegram.ui.Cells.k6(this);
    }

    @Override // org.telegram.ui.Components.l9, android.view.View
    public final void onDraw(Canvas canvas) {
        long j3;
        kn knVar = this.K;
        if (!knVar.b || this.e != null) {
            super.onDraw(canvas);
            return;
        }
        org.telegram.ui.Cells.k6 k6Var = this.G;
        k6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        k6Var.a = true;
        k6Var.v = true;
        k6Var.J = this.J;
        Integer num = knVar.c;
        if (num != null) {
            k6Var.z = num.intValue();
        }
        org.telegram.ui.an anVar = knVar.G;
        if (anVar != null) {
            j3 = anVar.a();
        } else {
            org.telegram.ui.ActionBar.f2 f2Var = this.H;
            j3 = f2Var instanceof v91 ? -((v91) f2Var).a : 0L;
        }
        di.r7.h(j3, canvas, this.a, k6Var);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (!this.I || !getImageReceiver().L()) {
            accessibilityNodeInfo.setVisibleToUser(false);
        } else {
            accessibilityNodeInfo.setText(org.telegram.messenger.hd.M0(2131754798, null));
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.hd.M0(2131747816, null)));
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
