package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ig1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class fo extends w9 {
    public final org.telegram.ui.Cells.n6 G;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 J;
    public final /* synthetic */ jo K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fo(jo joVar, Context context, org.telegram.ui.ActionBar.p2 p2Var, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.K = joVar;
        this.H = p2Var;
        this.I = z10;
        this.J = f6Var;
        this.G = new org.telegram.ui.Cells.n6(this);
    }

    @Override // org.telegram.ui.Components.w9, android.view.View
    public final void onDraw(Canvas canvas) {
        long j3;
        jo joVar = this.K;
        if (!joVar.b || this.e != null) {
            super.onDraw(canvas);
            return;
        }
        org.telegram.ui.Cells.n6 n6Var = this.G;
        n6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        n6Var.a = true;
        n6Var.v = true;
        n6Var.J = this.J;
        Integer num = joVar.c;
        if (num != null) {
            n6Var.z = num.intValue();
        }
        org.telegram.ui.eo eoVar = joVar.G;
        if (eoVar != null) {
            j3 = eoVar.a();
        } else {
            org.telegram.ui.ActionBar.p2 p2Var = this.H;
            j3 = p2Var instanceof ig1 ? -((ig1) p2Var).a : 0L;
        }
        zh.a6.h(j3, canvas, this.a, n6Var);
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
