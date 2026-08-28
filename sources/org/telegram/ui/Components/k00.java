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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class k00 extends FrameLayout {
    public final j6 a;
    public final j6 b;

    public k00(Context context) {
        super(context);
        j6 j6Var = new j6(context, true, true, false);
        this.a = j6Var;
        j6Var.setTextSize(AndroidUtilities.dp(15.0f));
        j6Var.setTypeface(AndroidUtilities.bold());
        int i9 = org.telegram.ui.ActionBar.f6.L6;
        j6Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        j6Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(j6Var, g7.e6.d(-1, 20.0f, (LocaleController.isRTL ? 5 : 3) | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        j6 j6Var2 = new j6(context, true, true, true);
        this.b = j6Var2;
        j6Var2.b(0.45f, 250L, gr.h);
        j6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        j6Var2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        j6Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        addView(j6Var2, g7.e6.d(-2, 20.0f, (LocaleController.isRTL ? 3 : 5) | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        WeakHashMap weakHashMap = r0.j0.a;
        new r0.x(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }

    public final void a(String str, Runnable runnable) {
        boolean z10 = !LocaleController.isRTL;
        j6 j6Var = this.b;
        j6Var.c(str, z10, true);
        j6Var.setOnClickListener(new o6(1, runnable));
    }

    public final void b(String str, boolean z10) {
        j6 j6Var = this.a;
        if (z10) {
            j6Var.a();
        }
        j6Var.c(str, z10 && !LocaleController.isRTL, true);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setText(this.a.getText());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), i10);
    }
}
