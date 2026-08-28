package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class m91 extends LinearLayout {
    public static final /* synthetic */ int d = 0;
    public final TextView[] a;
    public final TextView[] b;
    public final TextView[] c;

    public m91(Context context, int i9) {
        super(context);
        int i10 = i9 * 2;
        this.a = new TextView[i10];
        this.b = new TextView[i10];
        this.c = new TextView[i10];
        setOrientation(1);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        for (int i11 = 0; i11 < i9; i11++) {
            LinearLayout f10 = org.telegram.messenger.ll.f(context, 0);
            for (int i12 = 0; i12 < 2; i12++) {
                LinearLayout f11 = org.telegram.messenger.ll.f(context, 1);
                LinearLayout f12 = org.telegram.messenger.ll.f(context, 0);
                int i13 = (i11 * 2) + i12;
                this.a[i13] = new TextView(context);
                this.b[i13] = new TextView(context);
                this.c[i13] = new TextView(context);
                this.a[i13].setTypeface(AndroidUtilities.bold());
                this.a[i13].setTextSize(1, 17.0f);
                this.c[i13].setTextSize(1, 13.0f);
                this.c[i13].setGravity(3);
                this.b[i13].setTextSize(1, 13.0f);
                this.b[i13].setPadding(AndroidUtilities.dp(4.0f), 0, 0, 0);
                f12.addView(this.a[i13]);
                f12.addView(this.b[i13]);
                f11.addView(f12);
                f11.addView(this.c[i13]);
                f10.addView(f11, g7.e6.l(1.0f, -1, -2));
            }
            addView(f10, g7.e6.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 16.0f));
        }
    }

    public final void a(String str, int i9, String str2, String str3) {
        this.a[i9].setText(str);
        this.b[i9].setText(str2);
        this.c[i9].setText(str3);
        b();
    }

    public final void b() {
        int i9 = 0;
        while (true) {
            TextView[] textViewArr = this.a;
            if (i9 >= textViewArr.length) {
                return;
            }
            TextView textView = textViewArr[i9];
            int i10 = org.telegram.ui.ActionBar.f6.G6;
            textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
            this.c[i9].setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.z6, false));
            TextView[] textViewArr2 = this.b;
            Integer num = (Integer) textViewArr2[i9].getTag();
            if (num != null) {
                textViewArr2[i9].setTextColor(org.telegram.ui.ActionBar.f6.w0(null, num.intValue(), false));
            } else {
                textViewArr2[i9].setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
            }
            i9++;
        }
    }

    public void setData(o91 o91Var) {
        TextView[] textViewArr = this.a;
        textViewArr[0].setText(o91Var.b);
        textViewArr[1].setText(o91Var.f);
        textViewArr[2].setText(o91Var.j);
        textViewArr[3].setText(o91Var.n);
        TextView[] textViewArr2 = this.b;
        textViewArr2[0].setText(o91Var.c);
        textViewArr2[0].setTag(Integer.valueOf(o91Var.d ? org.telegram.ui.ActionBar.f6.x6 : org.telegram.ui.ActionBar.f6.p7));
        textViewArr2[1].setText(o91Var.g);
        textViewArr2[1].setTag(Integer.valueOf(o91Var.h ? org.telegram.ui.ActionBar.f6.x6 : org.telegram.ui.ActionBar.f6.p7));
        textViewArr2[2].setText(o91Var.k);
        textViewArr2[2].setTag(Integer.valueOf(o91Var.l ? org.telegram.ui.ActionBar.f6.x6 : org.telegram.ui.ActionBar.f6.p7));
        textViewArr2[3].setText(o91Var.o);
        textViewArr2[3].setTag(Integer.valueOf(o91Var.p ? org.telegram.ui.ActionBar.f6.x6 : org.telegram.ui.ActionBar.f6.p7));
        TextView[] textViewArr3 = this.c;
        textViewArr3[0].setText(o91Var.a);
        textViewArr3[1].setText(o91Var.e);
        textViewArr3[2].setText(o91Var.i);
        textViewArr3[3].setText(o91Var.m);
        b();
    }
}
