package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class f00 extends FrameLayout {
    public final o6 a;
    public final o6 b;

    public f00(Context context) {
        super(context);
        o6 o6Var = new o6(context, true, true, false);
        this.a = o6Var;
        o6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        o6Var.setTypeface(org.telegram.messenger.g0.o());
        int i7 = org.telegram.ui.ActionBar.m6.L6;
        org.telegram.ui.ActionBar.t6.Y(o6Var, i7, null);
        o6Var.setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
        addView(o6Var, c8.ma.d(-1, 20.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        o6 o6Var2 = new o6(context, true, true, true);
        this.b = o6Var2;
        o6Var2.b(0.45f, 250L, nr.h);
        o6Var2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.t6.Y(o6Var2, i7, null);
        o6Var2.setGravity(org.telegram.messenger.hd.a0 ? 3 : 5);
        addView(o6Var2, c8.ma.d(-2, 20.0f, (org.telegram.messenger.hd.a0 ? 3 : 5) | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        WeakHashMap weakHashMap = r0.i0.a;
        new r0.v(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }

    public final void a(String str, Runnable runnable) {
        boolean z10 = !org.telegram.messenger.hd.a0;
        o6 o6Var = this.b;
        o6Var.c(str, z10, true);
        o6Var.setOnClickListener(new t6(1, runnable));
    }

    public final void b(String str, boolean z10) {
        o6 o6Var = this.a;
        if (z10) {
            o6Var.a();
        }
        o6Var.c(str, z10 && !org.telegram.messenger.hd.a0, true);
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
