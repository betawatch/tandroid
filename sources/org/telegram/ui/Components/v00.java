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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class v00 extends FrameLayout {
    public final o6 a;
    public final o6 b;

    public v00(Context context) {
        super(context);
        o6 o6Var = new o6(context, true, true, false);
        this.a = o6Var;
        o6Var.setTextSize(AndroidUtilities.dp(15.0f));
        o6Var.setTypeface(AndroidUtilities.bold());
        int i10 = org.telegram.ui.ActionBar.g6.L6;
        o6Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        o6Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(o6Var, i7.f6.d(-1, 20.0f, (LocaleController.isRTL ? 5 : 3) | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        o6 o6Var2 = new o6(context, true, true, true);
        this.b = o6Var2;
        o6Var2.b(0.45f, 250L, jr.h);
        o6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        o6Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        o6Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        addView(o6Var2, i7.f6.d(-2, 20.0f, (LocaleController.isRTL ? 3 : 5) | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        WeakHashMap weakHashMap = r0.j0.a;
        new r0.x(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }

    public final void a(String str, Runnable runnable) {
        boolean z10 = !LocaleController.isRTL;
        o6 o6Var = this.b;
        o6Var.c(str, z10, true);
        o6Var.setOnClickListener(new t6(1, runnable));
    }

    public final void b(String str, boolean z10) {
        o6 o6Var = this.a;
        if (z10) {
            o6Var.a();
        }
        o6Var.c(str, z10 && !LocaleController.isRTL, true);
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
