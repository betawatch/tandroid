package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class cg0 extends LinearLayout {
    public static final /* synthetic */ int d = 0;
    public final TextView[] a;
    public final TextView[] b;
    public final /* synthetic */ dg0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg0(dg0 dg0Var, Context context) {
        super(context);
        this.c = dg0Var;
        this.a = new TextView[4];
        this.b = new TextView[4];
        setOrientation(1);
        setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        int i3 = 0;
        while (i3 < 2) {
            LinearLayout f10 = org.telegram.messenger.k5.f(context, 0);
            for (int i10 = 0; i10 < 2; i10++) {
                LinearLayout f11 = org.telegram.messenger.k5.f(context, 1);
                LinearLayout f12 = org.telegram.messenger.k5.f(context, 0);
                int i11 = (i3 * 2) + i10;
                this.a[i11] = new TextView(context);
                this.b[i11] = new TextView(context);
                this.a[i11].setTypeface(org.telegram.messenger.g0.o());
                this.a[i11].setTextSize(1, 17.0f);
                this.b[i11].setTextSize(1, 13.0f);
                this.b[i11].setGravity(3);
                f12.addView(this.a[i11]);
                f11.addView(f12);
                f11.addView(this.b[i11]);
                f10.addView(f11, b8.mf.l(1.0f, -1, -2));
            }
            addView(f10, b8.mf.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, i3 == 0 ? 16.0f : 0.0f));
            i3++;
        }
    }

    public final void a() {
        for (int i3 = 0; i3 < 4; i3++) {
            TextView textView = this.a[i3];
            int i10 = org.telegram.ui.ActionBar.k6.G6;
            dg0 dg0Var = this.c;
            textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(i10, dg0Var.getResourceProvider()));
            this.b[i3].setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.z6, dg0Var.getResourceProvider()));
        }
    }
}
