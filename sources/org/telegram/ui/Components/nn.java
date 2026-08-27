package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.we1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class nn extends n9 {
    public final org.telegram.ui.Cells.i6 C;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 F;
    public final /* synthetic */ rn G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nn(rn rnVar, Context context, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.G = rnVar;
        this.D = n2Var;
        this.E = z10;
        this.F = c6Var;
        this.C = new org.telegram.ui.Cells.i6(this);
    }

    @Override // org.telegram.ui.Components.n9, android.view.View
    public final void onDraw(Canvas canvas) {
        long j10;
        rn rnVar = this.G;
        if (!rnVar.b || this.e != null) {
            super.onDraw(canvas);
            return;
        }
        org.telegram.ui.Cells.i6 i6Var = this.C;
        i6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        i6Var.a = true;
        i6Var.v = true;
        i6Var.J = this.F;
        Integer num = rnVar.c;
        if (num != null) {
            i6Var.z = num.intValue();
        }
        org.telegram.ui.rn rnVar2 = rnVar.C;
        if (rnVar2 != null) {
            j10 = rnVar2.a();
        } else {
            org.telegram.ui.ActionBar.n2 n2Var = this.D;
            j10 = n2Var instanceof we1 ? -((we1) n2Var).a : 0L;
        }
        jh.l7.h(j10, canvas, this.a, i6Var);
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
