package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class sz extends FrameLayout {
    public final i6 a;
    public final i6 b;

    public sz(Context context) {
        super(context);
        i6 i6Var = new i6(context, true, true, false);
        this.a = i6Var;
        i6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        i6Var.setTypeface(org.telegram.messenger.g0.o());
        int i7 = org.telegram.ui.ActionBar.m6.L6;
        org.telegram.ui.ActionBar.t6.Y(i6Var, i7, null);
        i6Var.setGravity(org.telegram.messenger.id.a0 ? 5 : 3);
        addView(i6Var, c8.ha.d(-1, 20.0f, (org.telegram.messenger.id.a0 ? 5 : 3) | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        i6 i6Var2 = new i6(context, true, true, true);
        this.b = i6Var2;
        i6Var2.b(0.45f, 250L, wq.h);
        i6Var2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.t6.Y(i6Var2, i7, null);
        i6Var2.setGravity(org.telegram.messenger.id.a0 ? 3 : 5);
        addView(i6Var2, c8.ha.d(-2, 20.0f, (org.telegram.messenger.id.a0 ? 3 : 5) | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        WeakHashMap weakHashMap = r0.i0.a;
        new r0.v(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }

    public final void a(String str, Runnable runnable) {
        boolean z9 = !org.telegram.messenger.id.a0;
        i6 i6Var = this.b;
        i6Var.c(str, z9, true);
        i6Var.setOnClickListener(new n6(1, runnable));
    }

    public final void b(String str, boolean z9) {
        i6 i6Var = this.a;
        if (z9) {
            i6Var.a();
        }
        i6Var.c(str, z9 && !org.telegram.messenger.id.a0, true);
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
