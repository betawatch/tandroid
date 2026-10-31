package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g00 extends FrameLayout {
    public final f6 a;
    public final f6 b;

    public g00(Context context) {
        super(context);
        f6 f6Var = new f6(context, true, true, false);
        this.a = f6Var;
        f6Var.setTextSize(org.telegram.messenger.i0.L(15.0f));
        f6Var.setTypeface(org.telegram.messenger.i0.o());
        int i10 = org.telegram.ui.ActionBar.t6.L6;
        org.telegram.ui.ActionBar.a7.Z(f6Var, i10, null);
        f6Var.setGravity(org.telegram.messenger.cd.X ? 5 : 3);
        addView(f6Var, w7.b6.d(-1, 20.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        f6 f6Var2 = new f6(context, true, true, true);
        this.b = f6Var2;
        f6Var2.b(0.45f, 250L, gr.h);
        f6Var2.setTextSize(org.telegram.messenger.i0.L(15.0f));
        org.telegram.ui.ActionBar.a7.Z(f6Var2, i10, null);
        f6Var2.setGravity(org.telegram.messenger.cd.X ? 3 : 5);
        addView(f6Var2, w7.b6.d(-2, 20.0f, (org.telegram.messenger.cd.X ? 3 : 5) | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        WeakHashMap weakHashMap = r0.h0.a;
        new r0.v(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }

    public final void a(String str, Runnable runnable) {
        boolean z10 = !org.telegram.messenger.cd.X;
        f6 f6Var = this.b;
        f6Var.c(str, z10, true);
        f6Var.setOnClickListener(new k6(1, runnable));
    }

    public final void b(String str, boolean z10) {
        f6 f6Var = this.a;
        if (z10) {
            f6Var.a();
        }
        f6Var.c(str, z10 && !org.telegram.messenger.cd.X, true);
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
