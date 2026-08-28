package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.we1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class pn extends o9 {
    public final org.telegram.ui.Cells.l6 C;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ org.telegram.ui.ActionBar.b6 F;
    public final /* synthetic */ tn G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pn(tn tnVar, Context context, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.G = tnVar;
        this.D = o2Var;
        this.E = z10;
        this.F = b6Var;
        this.C = new org.telegram.ui.Cells.l6(this);
    }

    @Override // org.telegram.ui.Components.o9, android.view.View
    public final void onDraw(Canvas canvas) {
        long j10;
        tn tnVar = this.G;
        if (!tnVar.b || this.e != null) {
            super.onDraw(canvas);
            return;
        }
        org.telegram.ui.Cells.l6 l6Var = this.C;
        l6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        l6Var.a = true;
        l6Var.v = true;
        l6Var.J = this.F;
        Integer num = tnVar.c;
        if (num != null) {
            l6Var.z = num.intValue();
        }
        org.telegram.ui.qn qnVar = tnVar.C;
        if (qnVar != null) {
            j10 = qnVar.a();
        } else {
            org.telegram.ui.ActionBar.o2 o2Var = this.D;
            j10 = o2Var instanceof we1 ? -((we1) o2Var).a : 0L;
        }
        ih.p7.h(j10, canvas, this.a, l6Var);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (!this.E || !getImageReceiver().hasNotThumb()) {
            accessibilityNodeInfo.setVisibleToUser(false);
        } else {
            accessibilityNodeInfo.setText(LocaleController.getString(R.string.AccDescrProfilePicture));
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(R.string.Open)));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.G.b && this.C.a(motionEvent, this)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
