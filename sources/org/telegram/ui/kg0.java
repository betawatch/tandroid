package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class kg0 extends LinearLayout {
    public static final /* synthetic */ int d = 0;
    public final TextView[] a;
    public final TextView[] b;
    public final /* synthetic */ lg0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg0(lg0 lg0Var, Context context) {
        super(context);
        this.c = lg0Var;
        this.a = new TextView[4];
        this.b = new TextView[4];
        setOrientation(1);
        setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        int i7 = 0;
        while (i7 < 2) {
            LinearLayout f10 = org.telegram.messenger.k5.f(context, 0);
            for (int i10 = 0; i10 < 2; i10++) {
                LinearLayout f11 = org.telegram.messenger.k5.f(context, 1);
                LinearLayout f12 = org.telegram.messenger.k5.f(context, 0);
                int i11 = (i7 * 2) + i10;
                this.a[i11] = new TextView(context);
                this.b[i11] = new TextView(context);
                this.a[i11].setTypeface(org.telegram.messenger.g0.o());
                this.a[i11].setTextSize(1, 17.0f);
                this.b[i11].setTextSize(1, 13.0f);
                this.b[i11].setGravity(3);
                f12.addView(this.a[i11]);
                f11.addView(f12);
                f11.addView(this.b[i11]);
                f10.addView(f11, c8.ha.l(1.0f, -1, -2));
            }
            addView(f10, c8.ha.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, i7 == 0 ? 16.0f : 0.0f));
            i7++;
        }
    }

    public final void a() {
        for (int i7 = 0; i7 < 4; i7++) {
            TextView textView = this.a[i7];
            int i10 = org.telegram.ui.ActionBar.l6.G6;
            lg0 lg0Var = this.c;
            textView.setTextColor(org.telegram.ui.ActionBar.l6.w0(i10, lg0Var.getResourceProvider()));
            this.b[i7].setTextColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.z6, lg0Var.getResourceProvider()));
        }
    }
}
