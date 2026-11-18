package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class mg0 extends LinearLayout {
    public static final /* synthetic */ int d = 0;
    public final TextView[] a;
    public final TextView[] b;
    public final /* synthetic */ ng0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mg0(ng0 ng0Var, Context context) {
        super(context);
        this.c = ng0Var;
        this.a = new TextView[4];
        this.b = new TextView[4];
        setOrientation(1);
        setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        int i7 = 0;
        while (i7 < 2) {
            LinearLayout g10 = org.telegram.messenger.f3.g(context, 0);
            for (int i10 = 0; i10 < 2; i10++) {
                LinearLayout g11 = org.telegram.messenger.f3.g(context, 1);
                LinearLayout g12 = org.telegram.messenger.f3.g(context, 0);
                int i11 = (i7 * 2) + i10;
                this.a[i11] = new TextView(context);
                this.b[i11] = new TextView(context);
                this.a[i11].setTypeface(org.telegram.messenger.g0.o());
                this.a[i11].setTextSize(1, 17.0f);
                this.b[i11].setTextSize(1, 13.0f);
                this.b[i11].setGravity(3);
                g12.addView(this.a[i11]);
                g11.addView(g12);
                g11.addView(this.b[i11]);
                g10.addView(g11, c8.ma.l(1.0f, -1, -2));
            }
            addView(g10, c8.ma.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, i7 == 0 ? 16.0f : 0.0f));
            i7++;
        }
    }

    public final void a() {
        for (int i7 = 0; i7 < 4; i7++) {
            TextView textView = this.a[i7];
            int i10 = org.telegram.ui.ActionBar.n6.G6;
            ng0 ng0Var = this.c;
            textView.setTextColor(org.telegram.ui.ActionBar.n6.w0(i10, ng0Var.getResourceProvider()));
            this.b[i7].setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.z6, ng0Var.getResourceProvider()));
        }
    }
}
