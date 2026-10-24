package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class o91 extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public final TextView[] a;
    public final TextView[] b;
    public final TextView[] c;

    public o91(Context context, int i10) {
        super(context);
        int i11 = i10 * 2;
        this.a = new TextView[i11];
        this.b = new TextView[i11];
        this.c = new TextView[i11];
        setOrientation(1);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        for (int i12 = 0; i12 < i10; i12++) {
            LinearLayout e = org.telegram.messenger.sl.e(context, 0);
            for (int i13 = 0; i13 < 2; i13++) {
                LinearLayout e7 = org.telegram.messenger.sl.e(context, 1);
                LinearLayout e10 = org.telegram.messenger.sl.e(context, 0);
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
            addView(e, w7.z5.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 16.0f));
        }
    }

    public final void a(String str, int i10, String str2, String str3) {
        this.a[i10].setText(str);
        this.b[i10].setText(str2);
        this.c[i10].setText(str3);
        updateColors();
    }

    public void setData(q91 q91Var) {
        TextView[] textViewArr = this.a;
        textViewArr[0].setText(q91Var.b);
        textViewArr[1].setText(q91Var.f);
        textViewArr[2].setText(q91Var.j);
        textViewArr[3].setText(q91Var.n);
        TextView[] textViewArr2 = this.b;
        textViewArr2[0].setText(q91Var.c);
        textViewArr2[0].setTag(Integer.valueOf(q91Var.d ? org.telegram.ui.ActionBar.k6.x6 : org.telegram.ui.ActionBar.k6.p7));
        textViewArr2[1].setText(q91Var.g);
        textViewArr2[1].setTag(Integer.valueOf(q91Var.h ? org.telegram.ui.ActionBar.k6.x6 : org.telegram.ui.ActionBar.k6.p7));
        textViewArr2[2].setText(q91Var.k);
        textViewArr2[2].setTag(Integer.valueOf(q91Var.l ? org.telegram.ui.ActionBar.k6.x6 : org.telegram.ui.ActionBar.k6.p7));
        textViewArr2[3].setText(q91Var.o);
        textViewArr2[3].setTag(Integer.valueOf(q91Var.p ? org.telegram.ui.ActionBar.k6.x6 : org.telegram.ui.ActionBar.k6.p7));
        TextView[] textViewArr3 = this.c;
        textViewArr3[0].setText(q91Var.a);
        textViewArr3[1].setText(q91Var.e);
        textViewArr3[2].setText(q91Var.i);
        textViewArr3[3].setText(q91Var.m);
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        TextView[] textViewArr;
        TextView[] textViewArr2;
        TextView[] textViewArr3 = this.a;
        if (textViewArr3 == null || (textViewArr = this.b) == null || (textViewArr2 = this.c) == null) {
            return;
        }
        for (int i10 = 0; i10 < textViewArr3.length; i10++) {
            TextView textView = textViewArr3[i10];
            int i11 = org.telegram.ui.ActionBar.k6.G6;
            textView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
            textViewArr2[i10].setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.z6, false));
            Integer num = (Integer) textViewArr[i10].getTag();
            if (num != null) {
                textViewArr[i10].setTextColor(org.telegram.ui.ActionBar.k6.x0(null, num.intValue(), false));
            } else {
                textViewArr[i10].setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
