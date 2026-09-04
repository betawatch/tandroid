package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.eg1;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class yn extends x9 {
    public final org.telegram.ui.Cells.l6 G;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 J;
    public final /* synthetic */ co K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yn(co coVar, Context context, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.K = coVar;
        this.H = n2Var;
        this.I = z10;
        this.J = f6Var;
        this.G = new org.telegram.ui.Cells.l6(this);
    }

    @Override // org.telegram.ui.Components.x9, android.view.View
    public final void onDraw(Canvas canvas) {
        long j3;
        co coVar = this.K;
        if (!coVar.b || this.e != null) {
            super.onDraw(canvas);
            return;
        }
        org.telegram.ui.Cells.l6 l6Var = this.G;
        l6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        l6Var.a = true;
        l6Var.v = true;
        l6Var.J = this.J;
        Integer num = coVar.c;
        if (num != null) {
            l6Var.z = num.intValue();
        }
        org.telegram.ui.co coVar2 = coVar.G;
        if (coVar2 != null) {
            j3 = coVar2.a();
        } else {
            org.telegram.ui.ActionBar.n2 n2Var = this.H;
            j3 = n2Var instanceof eg1 ? -((eg1) n2Var).a : 0L;
        }
        bi.p9.h(j3, canvas, this.a, l6Var);
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
