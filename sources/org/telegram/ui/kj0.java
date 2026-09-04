package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class kj0 extends LinearLayout {
    public static final /* synthetic */ int d = 0;
    public final TextView[] a;
    public final TextView[] b;
    public final /* synthetic */ lj0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj0(lj0 lj0Var, Context context) {
        super(context);
        this.c = lj0Var;
        this.a = new TextView[4];
        this.b = new TextView[4];
        setOrientation(1);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        int i10 = 0;
        while (i10 < 2) {
            LinearLayout f7 = org.telegram.messenger.wl.f(context, 0);
            for (int i11 = 0; i11 < 2; i11++) {
                LinearLayout f10 = org.telegram.messenger.wl.f(context, 1);
                LinearLayout f11 = org.telegram.messenger.wl.f(context, 0);
                int i12 = (i10 * 2) + i11;
                this.a[i12] = new TextView(context);
                this.b[i12] = new TextView(context);
                this.a[i12].setTypeface(AndroidUtilities.bold());
                this.a[i12].setTextSize(1, 17.0f);
                this.b[i12].setTextSize(1, 13.0f);
                this.b[i12].setGravity(3);
                f11.addView(this.a[i12]);
                f10.addView(f11);
                f10.addView(this.b[i12]);
                f7.addView(f10, w7.x5.l(1.0f, -1, -2));
            }
            addView(f7, w7.x5.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, i10 == 0 ? 16.0f : 0.0f));
            i10++;
        }
    }

    public final void a() {
        for (int i10 = 0; i10 < 4; i10++) {
            TextView textView = this.a[i10];
            int i11 = org.telegram.ui.ActionBar.j6.G6;
            lj0 lj0Var = this.c;
            textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, lj0Var.getResourceProvider()));
            this.b[i10].setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z6, lj0Var.getResourceProvider()));
        }
    }
}
