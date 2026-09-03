package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.sf1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class wn extends p9 {
    public final org.telegram.ui.Cells.l6 D;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 G;
    public final /* synthetic */ ao H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn(ao aoVar, Context context, org.telegram.ui.ActionBar.p2 p2Var, boolean z4, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.H = aoVar;
        this.E = p2Var;
        this.F = z4;
        this.G = g6Var;
        this.D = new org.telegram.ui.Cells.l6(this);
    }

    @Override // org.telegram.ui.Components.p9, android.view.View
    public final void onDraw(Canvas canvas) {
        long j10;
        ao aoVar = this.H;
        if (!aoVar.b || this.e != null) {
            super.onDraw(canvas);
            return;
        }
        org.telegram.ui.Cells.l6 l6Var = this.D;
        l6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        l6Var.a = true;
        l6Var.v = true;
        l6Var.J = this.G;
        Integer num = aoVar.c;
        if (num != null) {
            l6Var.z = num.intValue();
        }
        org.telegram.ui.xn xnVar = aoVar.D;
        if (xnVar != null) {
            j10 = xnVar.a();
        } else {
            org.telegram.ui.ActionBar.p2 p2Var = this.E;
            j10 = p2Var instanceof sf1 ? -((sf1) p2Var).a : 0L;
        }
        oh.m7.h(j10, canvas, this.a, l6Var);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (!this.F || !getImageReceiver().hasNotThumb()) {
            accessibilityNodeInfo.setVisibleToUser(false);
        } else {
            accessibilityNodeInfo.setText(LocaleController.getString(R.string.AccDescrProfilePicture));
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(R.string.Open)));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.H.b && this.D.a(motionEvent, this)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
