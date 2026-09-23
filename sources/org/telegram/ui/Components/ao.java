package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.wf1;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ao extends w9 {
    public final org.telegram.ui.Cells.m6 G;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 J;
    public final /* synthetic */ fo K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao(fo foVar, Context context, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.K = foVar;
        this.H = n2Var;
        this.I = z10;
        this.J = d6Var;
        this.G = new org.telegram.ui.Cells.m6(this);
    }

    @Override // org.telegram.ui.Components.w9, android.view.View
    public final void onDraw(Canvas canvas) {
        long j3;
        fo foVar = this.K;
        if (!foVar.b || this.e != null) {
            super.onDraw(canvas);
            return;
        }
        org.telegram.ui.Cells.m6 m6Var = this.G;
        m6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        m6Var.a = true;
        m6Var.v = true;
        m6Var.J = this.J;
        Integer num = foVar.c;
        if (num != null) {
            m6Var.z = num.intValue();
        }
        org.telegram.ui.xn xnVar = foVar.G;
        if (xnVar != null) {
            j3 = xnVar.a();
        } else {
            org.telegram.ui.ActionBar.n2 n2Var = this.H;
            j3 = n2Var instanceof wf1 ? -((wf1) n2Var).a : 0L;
        }
        ai.ia.h(j3, canvas, this.a, m6Var);
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
