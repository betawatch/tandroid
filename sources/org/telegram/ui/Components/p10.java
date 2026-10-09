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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class p10 extends FrameLayout {
    public final r6 a;
    public final r6 b;

    public p10(Context context) {
        super(context);
        r6 r6Var = new r6(context, true, true, false);
        this.a = r6Var;
        r6Var.setTextSize(AndroidUtilities.dp(15.0f));
        r6Var.setTypeface(AndroidUtilities.bold());
        int i10 = org.telegram.ui.ActionBar.i6.L6;
        r6Var.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i10, false));
        r6Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(r6Var, w7.x5.a(20.0f, 21.0f, 15.0f, 21.0f, 2.0f, -1, (LocaleController.isRTL ? 5 : 3) | 80));
        r6 r6Var2 = new r6(context, true, true, true);
        this.b = r6Var2;
        r6Var2.b(0.45f, 250L, hs.h);
        r6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        r6Var2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i10, false));
        r6Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        addView(r6Var2, w7.x5.a(20.0f, 21.0f, 15.0f, 21.0f, 2.0f, -2, (LocaleController.isRTL ? 3 : 5) | 80));
        WeakHashMap weakHashMap = r0.i0.a;
        new r0.w(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }

    public final void a(String str, Runnable runnable) {
        boolean z10 = !LocaleController.isRTL;
        r6 r6Var = this.b;
        r6Var.c(str, z10, true);
        r6Var.setOnClickListener(new w6(1, runnable));
    }

    public final void b(String str, boolean z10) {
        r6 r6Var = this.a;
        if (z10) {
            r6Var.a();
        }
        r6Var.c(str, z10 && !LocaleController.isRTL, true);
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
