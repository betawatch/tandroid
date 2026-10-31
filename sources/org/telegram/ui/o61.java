package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class o61 extends LinearLayout implements org.telegram.ui.ActionBar.k6 {
    public final TextView[] a;
    public final TextView[] b;
    public final TextView[] c;

    public o61(Context context, int i10) {
        super(context);
        int i11 = i10 * 2;
        this.a = new TextView[i11];
        this.b = new TextView[i11];
        this.c = new TextView[i11];
        setOrientation(1);
        setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
        for (int i12 = 0; i12 < i10; i12++) {
            LinearLayout f7 = org.telegram.messenger.m5.f(context, 0);
            for (int i13 = 0; i13 < 2; i13++) {
                LinearLayout f10 = org.telegram.messenger.m5.f(context, 1);
                LinearLayout f11 = org.telegram.messenger.m5.f(context, 0);
                int i14 = (i12 * 2) + i13;
                this.a[i14] = new TextView(context);
                this.b[i14] = new TextView(context);
                this.c[i14] = new TextView(context);
                this.a[i14].setTypeface(org.telegram.messenger.i0.o());
                this.a[i14].setTextSize(1, 17.0f);
                this.c[i14].setTextSize(1, 13.0f);
                this.c[i14].setGravity(3);
                this.b[i14].setTextSize(1, 13.0f);
                this.b[i14].setPadding(org.telegram.messenger.i0.L(4.0f), 0, 0, 0);
                f11.addView(this.a[i14]);
                f11.addView(this.b[i14]);
                f10.addView(f11);
                f10.addView(this.c[i14]);
                f7.addView(f10, w7.b6.l(1.0f, -1, -2));
            }
            addView(f7, w7.b6.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 16.0f));
        }
    }

    public final void a(String str, int i10, String str2, String str3) {
        this.a[i10].setText(str);
        this.b[i10].setText(str2);
        this.c[i10].setText(str3);
        updateColors();
    }

    public void setData(q61 q61Var) {
        TextView[] textViewArr = this.a;
        textViewArr[0].setText(q61Var.b);
        textViewArr[1].setText(q61Var.f);
        textViewArr[2].setText(q61Var.j);
        textViewArr[3].setText(q61Var.n);
        TextView[] textViewArr2 = this.b;
        textViewArr2[0].setText(q61Var.c);
        textViewArr2[0].setTag(Integer.valueOf(q61Var.d ? org.telegram.ui.ActionBar.t6.x6 : org.telegram.ui.ActionBar.t6.p7));
        textViewArr2[1].setText(q61Var.g);
        textViewArr2[1].setTag(Integer.valueOf(q61Var.h ? org.telegram.ui.ActionBar.t6.x6 : org.telegram.ui.ActionBar.t6.p7));
        textViewArr2[2].setText(q61Var.k);
        textViewArr2[2].setTag(Integer.valueOf(q61Var.l ? org.telegram.ui.ActionBar.t6.x6 : org.telegram.ui.ActionBar.t6.p7));
        textViewArr2[3].setText(q61Var.o);
        textViewArr2[3].setTag(Integer.valueOf(q61Var.p ? org.telegram.ui.ActionBar.t6.x6 : org.telegram.ui.ActionBar.t6.p7));
        TextView[] textViewArr3 = this.c;
        textViewArr3[0].setText(q61Var.a);
        textViewArr3[1].setText(q61Var.e);
        textViewArr3[2].setText(q61Var.i);
        textViewArr3[3].setText(q61Var.m);
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        TextView[] textViewArr;
        TextView[] textViewArr2;
        TextView[] textViewArr3 = this.a;
        if (textViewArr3 == null || (textViewArr = this.b) == null || (textViewArr2 = this.c) == null) {
            return;
        }
        for (int i10 = 0; i10 < textViewArr3.length; i10++) {
            TextView textView = textViewArr3[i10];
            int i11 = org.telegram.ui.ActionBar.t6.G6;
            textView.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
            textViewArr2[i10].setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.z6, false));
            Integer num = (Integer) textViewArr[i10].getTag();
            if (num != null) {
                textViewArr[i10].setTextColor(org.telegram.ui.ActionBar.t6.x0(null, num.intValue(), false));
            } else {
                textViewArr[i10].setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
