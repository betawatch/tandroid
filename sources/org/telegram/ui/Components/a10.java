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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class a10 extends FrameLayout {
    public final k6 a;
    public final k6 b;

    public a10(Context context) {
        super(context);
        k6 k6Var = new k6(context, true, true, false);
        this.a = k6Var;
        k6Var.setTextSize(AndroidUtilities.dp(15.0f));
        k6Var.setTypeface(AndroidUtilities.bold());
        int i10 = org.telegram.ui.ActionBar.k6.L6;
        k6Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
        k6Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(k6Var, k7.c6.d(-1, 20.0f, (LocaleController.isRTL ? 5 : 3) | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        k6 k6Var2 = new k6(context, true, true, true);
        this.b = k6Var2;
        k6Var2.b(0.45f, 250L, pr.h);
        k6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        k6Var2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
        k6Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        addView(k6Var2, k7.c6.d(-2, 20.0f, (LocaleController.isRTL ? 3 : 5) | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        WeakHashMap weakHashMap = r0.j0.a;
        new r0.x(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }

    public final void a(String str, Runnable runnable) {
        boolean z4 = !LocaleController.isRTL;
        k6 k6Var = this.b;
        k6Var.c(str, z4, true);
        k6Var.setOnClickListener(new p6(1, runnable));
    }

    public final void b(String str, boolean z4) {
        k6 k6Var = this.a;
        if (z4) {
            k6Var.a();
        }
        k6Var.c(str, z4 && !LocaleController.isRTL, true);
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
