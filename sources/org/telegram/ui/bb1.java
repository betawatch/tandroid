package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class bb1 extends LinearLayout {
    public static final /* synthetic */ int d = 0;
    public final TextView[] a;
    public final TextView[] b;
    public final TextView[] c;

    public bb1(Context context, int i10) {
        super(context);
        int i11 = i10 * 2;
        this.a = new TextView[i11];
        this.b = new TextView[i11];
        this.c = new TextView[i11];
        setOrientation(1);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        for (int i12 = 0; i12 < i10; i12++) {
            LinearLayout e = org.telegram.messenger.sk.e(context, 0);
            for (int i13 = 0; i13 < 2; i13++) {
                LinearLayout e7 = org.telegram.messenger.sk.e(context, 1);
                LinearLayout e10 = org.telegram.messenger.sk.e(context, 0);
                int i14 = (i12 * 2) + i13;
                this.a[i14] = new TextView(context);
                this.b[i14] = new TextView(context);
                this.c[i14] = new TextView(context);
                this.a[i14].setTypeface(AndroidUtilities.bold());
                this.a[i14].setTextSize(1, 17.0f);
                this.c[i14].setTextSize(1, 13.0f);
                this.c[i14].setGravity(3);
                this.b[i14].setTextSize(1, 13.0f);
                this.b[i14].setPadding(AndroidUtilities.dp(4.0f), 0, 0, 0);
                e10.addView(this.a[i14]);
                e10.addView(this.b[i14]);
                e7.addView(e10);
                e7.addView(this.c[i14]);
                e.addView(e7, w7.z5.l(1.0f, -1, -2));
            }
            addView(e, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 16.0f, -1, 0));
        }
    }

    public final void a(String str, int i10, String str2, String str3) {
        this.a[i10].setText(str);
        this.b[i10].setText(str2);
        this.c[i10].setText(str3);
        b();
    }

    public final void b() {
        int i10 = 0;
        while (true) {
            TextView[] textViewArr = this.a;
            if (i10 >= textViewArr.length) {
                return;
            }
            TextView textView = textViewArr[i10];
            int i11 = org.telegram.ui.ActionBar.g6.G6;
            textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
            this.c[i10].setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.z6, false));
            TextView[] textViewArr2 = this.b;
            Integer num = (Integer) textViewArr2[i10].getTag();
            if (num != null) {
                textViewArr2[i10].setTextColor(org.telegram.ui.ActionBar.g6.x0(null, num.intValue(), false));
            } else {
                textViewArr2[i10].setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
            }
            i10++;
        }
    }

    public void setData(db1 db1Var) {
        TextView[] textViewArr = this.a;
        textViewArr[0].setText(db1Var.b);
        textViewArr[1].setText(db1Var.f);
        textViewArr[2].setText(db1Var.j);
        textViewArr[3].setText(db1Var.n);
        TextView[] textViewArr2 = this.b;
        textViewArr2[0].setText(db1Var.c);
        textViewArr2[0].setTag(Integer.valueOf(db1Var.d ? org.telegram.ui.ActionBar.g6.x6 : org.telegram.ui.ActionBar.g6.p7));
        textViewArr2[1].setText(db1Var.g);
        textViewArr2[1].setTag(Integer.valueOf(db1Var.h ? org.telegram.ui.ActionBar.g6.x6 : org.telegram.ui.ActionBar.g6.p7));
        textViewArr2[2].setText(db1Var.k);
        textViewArr2[2].setTag(Integer.valueOf(db1Var.l ? org.telegram.ui.ActionBar.g6.x6 : org.telegram.ui.ActionBar.g6.p7));
        textViewArr2[3].setText(db1Var.o);
        textViewArr2[3].setTag(Integer.valueOf(db1Var.p ? org.telegram.ui.ActionBar.g6.x6 : org.telegram.ui.ActionBar.g6.p7));
        TextView[] textViewArr3 = this.c;
        textViewArr3[0].setText(db1Var.a);
        textViewArr3[1].setText(db1Var.e);
        textViewArr3[2].setText(db1Var.i);
        textViewArr3[3].setText(db1Var.m);
        b();
    }
}
