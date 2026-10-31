package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g0 b;

    public /* synthetic */ c(g0 g0Var, int i10) {
        this.a = i10;
        this.b = g0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        final int i11 = 0;
        final int i12 = 1;
        g0 g0Var = this.b;
        switch (i10) {
            case 0:
                g0Var.dismiss();
                break;
            case 1:
                org.telegram.ui.Cells.m3 m3Var = g0Var.s2;
                org.telegram.messenger.i0.v1(m3Var.d);
                g0Var.A2 = m3Var.getText().toString();
                g0Var.v1();
                g0Var.u1(true);
                g0Var.p1();
                break;
            case 2:
                if (g0Var.c2 != null) {
                    TL_iv.RichMessage l1 = g0Var.l1();
                    if (l1 != null) {
                        g0Var.c2.a(l1);
                    }
                } else if (g0Var.b2 != null && g0Var.m1() != null) {
                    g0Var.b2.a(g0Var.m1());
                }
                g0Var.dismiss();
                break;
            case 3:
                g0Var.dismiss();
                break;
            case 4:
                g0Var.H2 = false;
                g0Var.X0();
                g0Var.G2.O(true);
                g0Var.I0();
                break;
            case 5:
                final g0 g0Var2 = this.b;
                z60 F = z60.F(g0Var2.c, g0Var2.I0, view);
                F.X = org.telegram.messenger.i0.L(450.0f);
                F.t = false;
                F.Y = true;
                ScrollView scrollView = new ScrollView(g0Var2.getContext());
                LinearLayout linearLayout = new LinearLayout(g0Var2.getContext());
                linearLayout.setOrientation(1);
                scrollView.addView(linearLayout);
                F.q(scrollView);
                ArrayList o10 = org.telegram.messenger.t10.o(null);
                ArrayList n10 = org.telegram.messenger.t10.n();
                if (!TextUtils.isEmpty(g0Var2.k2)) {
                    g0Var2.g1(F, linearLayout, true, m31.K0(m31.O0(g0Var2.k2, null, null)), null);
                }
                int size = o10.size();
                int i13 = 0;
                while (i13 < size) {
                    int i14 = i13 + 1;
                    final org.telegram.messenger.m10 m10Var = (org.telegram.messenger.m10) o10.get(i13);
                    if (!TextUtils.equals(m10Var.a, g0Var2.k2)) {
                        g0Var2.g1(F, linearLayout, false, m10Var.b, new Runnable() { // from class: org.telegram.ui.Components.g
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        g0 g0Var3 = g0Var2;
                                        g0Var3.h1();
                                        String str = m10Var.a;
                                        g0Var3.k2 = str;
                                        m31.S0(str);
                                        g0Var3.p1();
                                        break;
                                    default:
                                        g0 g0Var4 = g0Var2;
                                        g0Var4.h1();
                                        String str2 = m10Var.a;
                                        g0Var4.k2 = str2;
                                        m31.S0(str2);
                                        g0Var4.p1();
                                        break;
                                }
                            }
                        });
                    }
                    i13 = i14;
                }
                View h1Var = new org.telegram.ui.ActionBar.h1(g0Var2.getContext(), g0Var2.I0);
                h1Var.setTag(R.id.fit_width_tag, 1);
                linearLayout.addView(h1Var, w7.b6.o(-1, 8));
                int size2 = n10.size();
                while (i11 < size2) {
                    Object obj = n10.get(i11);
                    i11++;
                    final org.telegram.messenger.m10 m10Var2 = (org.telegram.messenger.m10) obj;
                    g0Var2.g1(F, linearLayout, TextUtils.equals(m10Var2.a, g0Var2.k2), m10Var2.b, new Runnable() { // from class: org.telegram.ui.Components.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i12) {
                                case 0:
                                    g0 g0Var3 = g0Var2;
                                    g0Var3.h1();
                                    String str = m10Var2.a;
                                    g0Var3.k2 = str;
                                    m31.S0(str);
                                    g0Var3.p1();
                                    break;
                                default:
                                    g0 g0Var4 = g0Var2;
                                    g0Var4.h1();
                                    String str2 = m10Var2.a;
                                    g0Var4.k2 = str2;
                                    m31.S0(str2);
                                    g0Var4.p1();
                                    break;
                            }
                        }
                    });
                }
                F.Z();
                break;
            case 6:
                g0.d1(g0Var, view);
                break;
            case 7:
                if (!g0Var.J2) {
                    org.telegram.messenger.i0.g(g0Var.m1());
                    break;
                }
                break;
            case 8:
                g0Var.dismiss();
                break;
            default:
                g0Var.q1(0, 0, true);
                g0Var.dismiss();
                break;
        }
    }
}
