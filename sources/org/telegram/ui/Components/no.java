package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.kg1;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class no extends z9 {
    public final org.telegram.ui.Cells.m6 G;
    public final /* synthetic */ org.telegram.ui.ActionBar.m2 H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 J;
    public final /* synthetic */ ro K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public no(ro roVar, Context context, org.telegram.ui.ActionBar.m2 m2Var, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.K = roVar;
        this.H = m2Var;
        this.I = z10;
        this.J = c6Var;
        this.G = new org.telegram.ui.Cells.m6(this);
    }

    @Override // org.telegram.ui.Components.z9, android.view.View
    public final void onDraw(Canvas canvas) {
        long j10;
        ro roVar = this.K;
        if (!roVar.b || this.e != null) {
            super.onDraw(canvas);
            return;
        }
        org.telegram.ui.Cells.m6 m6Var = this.G;
        m6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        m6Var.a = true;
        m6Var.v = true;
        m6Var.J = this.J;
        Integer num = roVar.c;
        if (num != null) {
            m6Var.z = num.intValue();
        }
        org.telegram.ui.fo foVar = roVar.G;
        if (foVar != null) {
            j10 = foVar.a();
        } else {
            org.telegram.ui.ActionBar.m2 m2Var = this.H;
            j10 = m2Var instanceof kg1 ? -((kg1) m2Var).a : 0L;
        }
        bi.s9.h(j10, canvas, this.a, m6Var);
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
