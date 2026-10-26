package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.af1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class lo extends y9 {
    public final org.telegram.ui.Cells.q6 G;
    public final /* synthetic */ org.telegram.ui.ActionBar.r2 H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ org.telegram.ui.ActionBar.u6 J;
    public final /* synthetic */ po K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo(po poVar, Context context, org.telegram.ui.ActionBar.r2 r2Var, boolean z10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.K = poVar;
        this.H = r2Var;
        this.I = z10;
        this.J = u6Var;
        this.G = new org.telegram.ui.Cells.q6(this);
    }

    @Override // org.telegram.ui.Components.y9, android.view.View
    public final void onDraw(Canvas canvas) {
        long j10;
        po poVar = this.K;
        if (!poVar.b || this.e != null) {
            super.onDraw(canvas);
            return;
        }
        org.telegram.ui.Cells.q6 q6Var = this.G;
        q6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        q6Var.a = true;
        q6Var.v = true;
        q6Var.J = this.J;
        Integer num = poVar.c;
        if (num != null) {
            q6Var.z = num.intValue();
        }
        org.telegram.ui.un unVar = poVar.G;
        if (unVar != null) {
            j10 = unVar.a();
        } else {
            org.telegram.ui.ActionBar.r2 r2Var = this.H;
            j10 = r2Var instanceof af1 ? -((af1) r2Var).a : 0L;
        }
        di.a8.h(j10, canvas, this.a, q6Var);
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
