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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class k10 extends FrameLayout {
    public final s6 a;
    public final s6 b;

    public k10(Context context) {
        super(context);
        s6 s6Var = new s6(context, true, true, false);
        this.a = s6Var;
        s6Var.setTextSize(AndroidUtilities.dp(15.0f));
        s6Var.setTypeface(AndroidUtilities.bold());
        int i10 = org.telegram.ui.ActionBar.y6.L6;
        org.telegram.ui.ActionBar.f7.Z(s6Var, i10, null);
        s6Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(s6Var, kb1.h(-1, 20.0f, (LocaleController.isRTL ? 5 : 3) | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        s6 s6Var2 = new s6(context, true, true, true);
        this.b = s6Var2;
        s6Var2.b(0.45f, 250L, ds.h);
        s6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        org.telegram.ui.ActionBar.f7.Z(s6Var2, i10, null);
        s6Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        addView(s6Var2, kb1.h(-2, 20.0f, (LocaleController.isRTL ? 3 : 5) | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        WeakHashMap weakHashMap = r0.i0.a;
        new r0.w(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }

    public final void a(String str, Runnable runnable) {
        boolean z10 = !LocaleController.isRTL;
        s6 s6Var = this.b;
        s6Var.c(str, z10, true);
        s6Var.setOnClickListener(new x6(1, runnable));
    }

    public final void b(String str, boolean z10) {
        s6 s6Var = this.a;
        if (z10) {
            s6Var.a();
        }
        s6Var.c(str, z10 && !LocaleController.isRTL, true);
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
