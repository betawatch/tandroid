package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.HashSet;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class l31 extends LinearLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 a;
    public final org.telegram.ui.Components.w70 b;
    public final org.telegram.ui.Components.w70 c;
    public final fi.d d;
    public final fi.d e;

    public l31(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.a = f6Var;
        setOrientation(1);
        int i7 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.Components.w70 a10 = c8.na.a(context, 15.0f, i7, true, f6Var);
        this.b = a10;
        a10.setGravity(17);
        addView(a10, c8.ha.t(-1, -2, 55, 32, 20, 32, 0));
        org.telegram.ui.Components.w70 a11 = c8.na.a(context, 13.0f, i7, false, f6Var);
        this.c = a11;
        a11.setGravity(17);
        addView(a11, c8.ha.s(-1, -2, 55, 32.0f, 9.33f, 32.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        fi.d h = org.telegram.messenger.k5.h(24, context, f6Var, true);
        this.d = h;
        fi.d h7 = org.telegram.messenger.k5.h(24, context, f6Var, true);
        this.e = h7;
        linearLayout.addView(h, c8.ha.q(0, 42, 1.0f, org.telegram.messenger.qs.x1, 0, 0, 12, 0));
        linearLayout.addView(h7, c8.ha.q(0, 42, 1.0f, org.telegram.messenger.qs.x1, 0, 0, 0, 0));
        addView(linearLayout, c8.ha.t(-1, -2, 55, 24, 18, 24, 16));
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        this.b.setTextColor(org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
        this.c.setTextColor(org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
    }
}
