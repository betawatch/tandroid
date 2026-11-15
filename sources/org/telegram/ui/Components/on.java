package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.u91;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class on extends i9 {
    public final org.telegram.ui.Cells.j6 H;
    public final /* synthetic */ org.telegram.ui.ActionBar.e2 I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 K;
    public final /* synthetic */ sn L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on(sn snVar, Context context, org.telegram.ui.ActionBar.e2 e2Var, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.L = snVar;
        this.I = e2Var;
        this.J = z10;
        this.K = e6Var;
        this.H = new org.telegram.ui.Cells.j6(this);
    }

    @Override // org.telegram.ui.Components.i9, android.view.View
    public final void onDraw(Canvas canvas) {
        long j3;
        sn snVar = this.L;
        if (!snVar.b || this.e != null) {
            super.onDraw(canvas);
            return;
        }
        org.telegram.ui.Cells.j6 j6Var = this.H;
        j6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        j6Var.a = true;
        j6Var.v = true;
        j6Var.J = this.K;
        Integer num = snVar.c;
        if (num != null) {
            j6Var.z = num.intValue();
        }
        org.telegram.ui.an anVar = snVar.H;
        if (anVar != null) {
            j3 = anVar.a();
        } else {
            org.telegram.ui.ActionBar.e2 e2Var = this.I;
            j3 = e2Var instanceof u91 ? -((u91) e2Var).a : 0L;
        }
        fi.l7.h(j3, canvas, this.a, j6Var);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (!this.J || !getImageReceiver().L()) {
            accessibilityNodeInfo.setVisibleToUser(false);
        } else {
            accessibilityNodeInfo.setText(org.telegram.messenger.hd.M0(2131754798, null));
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.hd.M0(2131747817, null)));
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
