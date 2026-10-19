package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.re1;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class ko extends w9 {
    public final org.telegram.ui.Cells.l6 G;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 J;
    public final /* synthetic */ oo K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ko(oo ooVar, Context context, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.K = ooVar;
        this.H = n2Var;
        this.I = z10;
        this.J = d6Var;
        this.G = new org.telegram.ui.Cells.l6(this);
    }

    @Override // org.telegram.ui.Components.w9, android.view.View
    public final void onDraw(Canvas canvas) {
        long j10;
        oo ooVar = this.K;
        if (!ooVar.b || this.e != null) {
            super.onDraw(canvas);
            return;
        }
        org.telegram.ui.Cells.l6 l6Var = this.G;
        l6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        l6Var.a = true;
        l6Var.v = true;
        l6Var.J = this.J;
        Integer num = ooVar.c;
        if (num != null) {
            l6Var.z = num.intValue();
        }
        org.telegram.ui.qn qnVar = ooVar.G;
        if (qnVar != null) {
            j10 = qnVar.a();
        } else {
            org.telegram.ui.ActionBar.n2 n2Var = this.H;
            j10 = n2Var instanceof re1 ? -((re1) n2Var).a : 0L;
        }
        ci.d8.h(j10, canvas, this.a, l6Var);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (!this.I || !getImageReceiver().hasNotThumb()) {
            accessibilityNodeInfo.setVisibleToUser(false);
        } else {
            accessibilityNodeInfo.setText(LocaleController.getString(R.string.AccDescrProfilePicture));
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(R.string.Open)));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.K.b && this.G.a(motionEvent, this)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
