package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class z00 extends FrameLayout {
    public final p6 a;
    public final p6 b;

    public z00(Context context) {
        super(context);
        p6 p6Var = new p6(context, true, true, false);
        this.a = p6Var;
        p6Var.setTextSize(AndroidUtilities.dp(15.0f));
        p6Var.setTypeface(AndroidUtilities.bold());
        int i10 = org.telegram.ui.ActionBar.j6.L6;
        p6Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        p6Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(p6Var, w7.y5.d(-1, 20.0f, (LocaleController.isRTL ? 5 : 3) | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        p6 p6Var2 = new p6(context, true, true, true);
        this.b = p6Var2;
        p6Var2.b(0.45f, 250L, qr.h);
        p6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        p6Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        p6Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        addView(p6Var2, w7.y5.d(-2, 20.0f, (LocaleController.isRTL ? 3 : 5) | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        WeakHashMap weakHashMap = r0.i0.a;
        new r0.w(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }

    public final void a(String str, Runnable runnable) {
        boolean z10 = !LocaleController.isRTL;
        p6 p6Var = this.b;
        p6Var.c(str, z10, true);
        p6Var.setOnClickListener(new u6(1, runnable));
    }

    public final void b(String str, boolean z10) {
        p6 p6Var = this.a;
        if (z10) {
            p6Var.a();
        }
        p6Var.c(str, z10 && !LocaleController.isRTL, true);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setText(this.a.getText());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }
}
