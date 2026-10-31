package org.telegram.ui.Components;

import android.text.Spannable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class o31 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x31 b;

    public /* synthetic */ o31(x31 x31Var, int i10) {
        this.a = i10;
        this.b = x31Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LinearLayout linearLayout;
        boolean z10;
        int i10 = this.a;
        x31 x31Var = this.b;
        switch (i10) {
            case 0:
                x31Var.dismiss();
                break;
            case 1:
                x31Var.dismiss();
                break;
            case 2:
                x31Var.dismiss();
                break;
            case 3:
                Spannable spannable = x31Var.U1;
                if (spannable != null) {
                    x31Var.V1.a(spannable);
                }
                x31Var.dismiss();
                break;
            default:
                final x31 x31Var2 = this.b;
                z60 F = z60.F(x31Var2.c, x31Var2.I0, view);
                F.X = org.telegram.messenger.i0.L(450.0f);
                final int i11 = 0;
                F.t = false;
                final int i12 = 1;
                F.Y = true;
                ScrollView scrollView = new ScrollView(x31Var2.getContext());
                LinearLayout linearLayout2 = new LinearLayout(x31Var2.getContext());
                linearLayout2.setOrientation(1);
                scrollView.addView(linearLayout2);
                F.q(scrollView);
                int i13 = 0;
                while (i13 < x31Var2.Z1.length) {
                    if (x31Var2.Y1 == i13) {
                        linearLayout = linearLayout2;
                        z10 = true;
                    } else {
                        linearLayout = linearLayout2;
                        z10 = false;
                    }
                    x31Var2.d1(F, linearLayout, z10, x31Var2.a2[i13], new qq(x31Var2, i13, 5));
                    i13++;
                    linearLayout2 = linearLayout;
                }
                LinearLayout linearLayout3 = linearLayout2;
                View h1Var = new org.telegram.ui.ActionBar.h1(x31Var2.getContext(), x31Var2.I0);
                h1Var.setTag(R.id.fit_width_tag, 1);
                linearLayout3.addView(h1Var, w7.b6.o(-1, 8));
                ArrayList o10 = org.telegram.messenger.t10.o(null);
                ArrayList n10 = org.telegram.messenger.t10.n();
                if (!TextUtils.isEmpty(x31Var2.X1)) {
                    x31Var2.d1(F, linearLayout3, true, m31.K0(m31.O0(x31Var2.X1, null, null)), null);
                }
                int size = o10.size();
                int i14 = 0;
                while (i14 < size) {
                    int i15 = i14 + 1;
                    final org.telegram.messenger.m10 m10Var = (org.telegram.messenger.m10) o10.get(i14);
                    if (!TextUtils.equals(m10Var.a, x31Var2.X1)) {
                        x31Var2.d1(F, linearLayout3, false, m10Var.b, new Runnable() { // from class: org.telegram.ui.Components.n31
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        x31 x31Var3 = x31Var2;
                                        x31Var3.e1();
                                        String str = m10Var.a;
                                        x31Var3.X1 = str;
                                        m31.S0(str);
                                        x31Var3.f1();
                                        break;
                                    default:
                                        x31 x31Var4 = x31Var2;
                                        x31Var4.e1();
                                        String str2 = m10Var.a;
                                        x31Var4.X1 = str2;
                                        m31.S0(str2);
                                        x31Var4.f1();
                                        break;
                                }
                            }
                        });
                    }
                    i14 = i15;
                }
                View h1Var2 = new org.telegram.ui.ActionBar.h1(x31Var2.getContext(), x31Var2.I0);
                h1Var2.setTag(R.id.fit_width_tag, 1);
                linearLayout3.addView(h1Var2, w7.b6.o(-1, 8));
                int size2 = n10.size();
                while (i11 < size2) {
                    Object obj = n10.get(i11);
                    i11++;
                    final org.telegram.messenger.m10 m10Var2 = (org.telegram.messenger.m10) obj;
                    x31Var2.d1(F, linearLayout3, TextUtils.equals(m10Var2.a, x31Var2.X1), m10Var2.b, new Runnable() { // from class: org.telegram.ui.Components.n31
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i12) {
                                case 0:
                                    x31 x31Var3 = x31Var2;
                                    x31Var3.e1();
                                    String str = m10Var2.a;
                                    x31Var3.X1 = str;
                                    m31.S0(str);
                                    x31Var3.f1();
                                    break;
                                default:
                                    x31 x31Var4 = x31Var2;
                                    x31Var4.e1();
                                    String str2 = m10Var2.a;
                                    x31Var4.X1 = str2;
                                    m31.S0(str2);
                                    x31Var4.f1();
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
