package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class oz extends FrameLayout {
    public final h6 a;
    public final h6 b;

    public oz(Context context) {
        super(context);
        h6 h6Var = new h6(context, true, true, false);
        this.a = h6Var;
        h6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        int i3 = org.telegram.ui.ActionBar.k6.L6;
        org.telegram.ui.ActionBar.r6.Z(h6Var, i3, null);
        h6Var.setGravity(org.telegram.messenger.bd.a0 ? 5 : 3);
        addView(h6Var, b8.mf.d(-1, 20.0f, (org.telegram.messenger.bd.a0 ? 5 : 3) | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        h6 h6Var2 = new h6(context, true, true, true);
        this.b = h6Var2;
        h6Var2.b(0.45f, 250L, xq.h);
        h6Var2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.r6.Z(h6Var2, i3, null);
        h6Var2.setGravity(org.telegram.messenger.bd.a0 ? 3 : 5);
        addView(h6Var2, b8.mf.d(-2, 20.0f, (org.telegram.messenger.bd.a0 ? 3 : 5) | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        WeakHashMap weakHashMap = r0.i0.a;
        new r0.v(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }

    public final void a(String str, Runnable runnable) {
        boolean z10 = !org.telegram.messenger.bd.a0;
        h6 h6Var = this.b;
        h6Var.c(str, z10, true);
        h6Var.setOnClickListener(new m6(1, runnable));
    }

    public final void b(String str, boolean z10) {
        h6 h6Var = this.a;
        if (z10) {
            h6Var.a();
        }
        h6Var.c(str, z10 && !org.telegram.messenger.bd.a0, true);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setText(this.a.getText());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), i10);
    }
}
