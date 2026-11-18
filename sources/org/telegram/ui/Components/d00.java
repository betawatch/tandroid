package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class d00 extends FrameLayout {
    public final n6 a;
    public final n6 b;

    public d00(Context context) {
        super(context);
        n6 n6Var = new n6(context, true, true, false);
        this.a = n6Var;
        n6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        n6Var.setTypeface(org.telegram.messenger.g0.o());
        int i7 = org.telegram.ui.ActionBar.n6.L6;
        org.telegram.ui.ActionBar.u6.Y(n6Var, i7, null);
        n6Var.setGravity(org.telegram.messenger.gd.a0 ? 5 : 3);
        addView(n6Var, c8.ma.d(-1, 20.0f, (org.telegram.messenger.gd.a0 ? 5 : 3) | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        n6 n6Var2 = new n6(context, true, true, true);
        this.b = n6Var2;
        n6Var2.b(0.45f, 250L, lr.h);
        n6Var2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.u6.Y(n6Var2, i7, null);
        n6Var2.setGravity(org.telegram.messenger.gd.a0 ? 3 : 5);
        addView(n6Var2, c8.ma.d(-2, 20.0f, (org.telegram.messenger.gd.a0 ? 3 : 5) | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        WeakHashMap weakHashMap = r0.i0.a;
        new r0.v(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }

    public final void a(String str, Runnable runnable) {
        boolean z10 = !org.telegram.messenger.gd.a0;
        n6 n6Var = this.b;
        n6Var.c(str, z10, true);
        n6Var.setOnClickListener(new s6(1, runnable));
    }

    public final void b(String str, boolean z10) {
        n6 n6Var = this.a;
        if (z10) {
            n6Var.a();
        }
        n6Var.c(str, z10 && !org.telegram.messenger.gd.a0, true);
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
