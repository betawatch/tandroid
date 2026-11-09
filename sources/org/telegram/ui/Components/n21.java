package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class n21 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w21 b;

    public /* synthetic */ n21(w21 w21Var, int i7) {
        this.a = i7;
        this.b = w21Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LinearLayout linearLayout;
        boolean z9;
        int i7 = this.a;
        w21 w21Var = this.b;
        switch (i7) {
            case 0:
                w21Var.dismiss();
                break;
            case 1:
                w21Var.dismiss();
                break;
            case 2:
                w21Var.dismiss();
                break;
            case 3:
                CharSequence charSequence = w21Var.U1;
                if (charSequence != null) {
                    w21Var.V1.a(charSequence);
                }
                w21Var.dismiss();
                break;
            default:
                final w21 w21Var2 = this.b;
                l60 F = l60.F(w21Var2.c, w21Var2.I0, view);
                F.X = org.telegram.messenger.g0.L(450.0f);
                final int i10 = 0;
                F.t = false;
                final int i11 = 1;
                F.Y = true;
                ScrollView scrollView = new ScrollView(w21Var2.getContext());
                LinearLayout linearLayout2 = new LinearLayout(w21Var2.getContext());
                linearLayout2.setOrientation(1);
                scrollView.addView(linearLayout2);
                F.q(scrollView);
                int i12 = 0;
                while (i12 < w21Var2.Z1.length) {
                    if (w21Var2.Y1 == i12) {
                        linearLayout = linearLayout2;
                        z9 = true;
                    } else {
                        linearLayout = linearLayout2;
                        z9 = false;
                    }
                    w21Var2.d1(F, linearLayout, z9, w21Var2.a2[i12], new r2(w21Var2, i12, 10));
                    i12++;
                    linearLayout2 = linearLayout;
                }
                LinearLayout linearLayout3 = linearLayout2;
                View d1Var = new org.telegram.ui.ActionBar.d1(w21Var2.getContext(), w21Var2.I0);
                d1Var.setTag(R.id.fit_width_tag, 1);
                linearLayout3.addView(d1Var, c8.ha.o(-1, 8));
                ArrayList o4 = org.telegram.messenger.f10.o(null);
                ArrayList n10 = org.telegram.messenger.f10.n();
                if (!TextUtils.isEmpty(w21Var2.X1)) {
                    w21Var2.d1(F, linearLayout3, true, l21.K0(l21.O0(w21Var2.X1, null, null)), null);
                }
                int size = o4.size();
                int i13 = 0;
                while (i13 < size) {
                    int i14 = i13 + 1;
                    final org.telegram.messenger.y00 y00Var = (org.telegram.messenger.y00) o4.get(i13);
                    if (!TextUtils.equals(y00Var.a, w21Var2.X1)) {
                        w21Var2.d1(F, linearLayout3, false, y00Var.b, new Runnable() { // from class: org.telegram.ui.Components.m21
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i10) {
                                    case 0:
                                        w21 w21Var3 = w21Var2;
                                        w21Var3.e1();
                                        String str = y00Var.a;
                                        w21Var3.X1 = str;
                                        l21.S0(str);
                                        w21Var3.f1();
                                        break;
                                    default:
                                        w21 w21Var4 = w21Var2;
                                        w21Var4.e1();
                                        String str2 = y00Var.a;
                                        w21Var4.X1 = str2;
                                        l21.S0(str2);
                                        w21Var4.f1();
                                        break;
                                }
                            }
                        });
                    }
                    i13 = i14;
                }
                View d1Var2 = new org.telegram.ui.ActionBar.d1(w21Var2.getContext(), w21Var2.I0);
                d1Var2.setTag(R.id.fit_width_tag, 1);
                linearLayout3.addView(d1Var2, c8.ha.o(-1, 8));
                int size2 = n10.size();
                while (i10 < size2) {
                    Object obj = n10.get(i10);
                    i10++;
                    final org.telegram.messenger.y00 y00Var2 = (org.telegram.messenger.y00) obj;
                    w21Var2.d1(F, linearLayout3, TextUtils.equals(y00Var2.a, w21Var2.X1), y00Var2.b, new Runnable() { // from class: org.telegram.ui.Components.m21
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    w21 w21Var3 = w21Var2;
                                    w21Var3.e1();
                                    String str = y00Var2.a;
                                    w21Var3.X1 = str;
                                    l21.S0(str);
                                    w21Var3.f1();
                                    break;
                                default:
                                    w21 w21Var4 = w21Var2;
                                    w21Var4.e1();
                                    String str2 = y00Var2.a;
                                    w21Var4.X1 = str2;
                                    l21.S0(str2);
                                    w21Var4.f1();
                                    break;
                            }
                        }
                    });
                }
                F.Z();
                break;
        }
    }
}
