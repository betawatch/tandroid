package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class sz extends FrameLayout {
    public final j6 a;
    public final j6 b;

    public sz(Context context) {
        super(context);
        j6 j6Var = new j6(context, true, true, false);
        this.a = j6Var;
        j6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        j6Var.setTypeface(org.telegram.messenger.g0.o());
        int i7 = org.telegram.ui.ActionBar.k6.L6;
        org.telegram.ui.ActionBar.r6.Z(j6Var, i7, null);
        j6Var.setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
        addView(j6Var, c8.ha.d(-1, 20.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        j6 j6Var2 = new j6(context, true, true, true);
        this.b = j6Var2;
        j6Var2.b(0.45f, 250L, xq.h);
        j6Var2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.r6.Z(j6Var2, i7, null);
        j6Var2.setGravity(org.telegram.messenger.hd.a0 ? 3 : 5);
        addView(j6Var2, c8.ha.d(-2, 20.0f, (org.telegram.messenger.hd.a0 ? 3 : 5) | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        WeakHashMap weakHashMap = r0.i0.a;
        new r0.v(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }

    public final void a(String str, Runnable runnable) {
        boolean z9 = !org.telegram.messenger.hd.a0;
        j6 j6Var = this.b;
        j6Var.c(str, z9, true);
        j6Var.setOnClickListener(new o6(1, runnable));
    }

    public final void b(String str, boolean z9) {
        j6 j6Var = this.a;
        if (z9) {
            j6Var.a();
        }
        j6Var.c(str, z9 && !org.telegram.messenger.hd.a0, true);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setText(this.a.getText());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), i10);
    }
}
