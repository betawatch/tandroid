package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ze1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class tn extends t9 {
    public final org.telegram.ui.Cells.j6 C;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 F;
    public final /* synthetic */ xn G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tn(xn xnVar, Context context, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.G = xnVar;
        this.D = o2Var;
        this.E = z10;
        this.F = c6Var;
        this.C = new org.telegram.ui.Cells.j6(this);
    }

    @Override // org.telegram.ui.Components.t9, android.view.View
    public final void onDraw(Canvas canvas) {
        long j10;
        xn xnVar = this.G;
        if (!xnVar.b || this.e != null) {
            super.onDraw(canvas);
            return;
        }
        org.telegram.ui.Cells.j6 j6Var = this.C;
        j6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        j6Var.a = true;
        j6Var.v = true;
        j6Var.J = this.F;
        Integer num = xnVar.c;
        if (num != null) {
            j6Var.z = num.intValue();
        }
        org.telegram.ui.tn tnVar = xnVar.C;
        if (tnVar != null) {
            j10 = tnVar.a();
        } else {
            org.telegram.ui.ActionBar.o2 o2Var = this.D;
            j10 = o2Var instanceof ze1 ? -((ze1) o2Var).a : 0L;
        }
        lh.l7.h(j10, canvas, this.a, j6Var);
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
