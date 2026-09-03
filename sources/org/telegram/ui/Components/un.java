package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.sf1;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class un extends p9 {
    public final org.telegram.ui.Cells.k6 D;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 G;
    public final /* synthetic */ yn H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un(yn ynVar, Context context, org.telegram.ui.ActionBar.p2 p2Var, boolean z4, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.H = ynVar;
        this.E = p2Var;
        this.F = z4;
        this.G = f6Var;
        this.D = new org.telegram.ui.Cells.k6(this);
    }

    @Override // org.telegram.ui.Components.p9, android.view.View
    public final void onDraw(Canvas canvas) {
        long j10;
        yn ynVar = this.H;
        if (!ynVar.b || this.e != null) {
            super.onDraw(canvas);
            return;
        }
        org.telegram.ui.Cells.k6 k6Var = this.D;
        k6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        k6Var.a = true;
        k6Var.v = true;
        k6Var.J = this.G;
        Integer num = ynVar.c;
        if (num != null) {
            k6Var.z = num.intValue();
        }
        org.telegram.ui.zn znVar = ynVar.D;
        if (znVar != null) {
            j10 = znVar.a();
        } else {
            org.telegram.ui.ActionBar.p2 p2Var = this.E;
            j10 = p2Var instanceof sf1 ? -((sf1) p2Var).a : 0L;
        }
        nh.m7.h(j10, canvas, this.a, k6Var);
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
