package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class oj0 extends LinearLayout {
    public static final /* synthetic */ int d = 0;
    public final TextView[] a;
    public final TextView[] b;
    public final /* synthetic */ pj0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oj0(pj0 pj0Var, Context context) {
        super(context);
        this.c = pj0Var;
        this.a = new TextView[4];
        this.b = new TextView[4];
        setOrientation(1);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        int i10 = 0;
        while (i10 < 2) {
            LinearLayout e = org.telegram.messenger.sk.e(context, 0);
            for (int i11 = 0; i11 < 2; i11++) {
                LinearLayout e7 = org.telegram.messenger.sk.e(context, 1);
                LinearLayout e10 = org.telegram.messenger.sk.e(context, 0);
                int i12 = (i10 * 2) + i11;
                this.a[i12] = new TextView(context);
                this.b[i12] = new TextView(context);
                this.a[i12].setTypeface(AndroidUtilities.bold());
                this.a[i12].setTextSize(1, 17.0f);
                this.b[i12].setTextSize(1, 13.0f);
                this.b[i12].setGravity(3);
                e10.addView(this.a[i12]);
                e7.addView(e10);
                e7.addView(this.b[i12]);
                e.addView(e7, w7.z5.l(1.0f, -1, -2));
            }
            addView(e, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, i10 == 0 ? 16.0f : 0.0f, -1, 0));
            i10++;
        }
    }

    public final void a() {
        for (int i10 = 0; i10 < 4; i10++) {
            TextView textView = this.a[i10];
            int i11 = org.telegram.ui.ActionBar.g6.G6;
            pj0 pj0Var = this.c;
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, pj0Var.getResourceProvider()));
            this.b[i10].setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.z6, pj0Var.getResourceProvider()));
        }
    }
}
