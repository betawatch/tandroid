package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f0 b;

    public /* synthetic */ c(f0 f0Var, int i7) {
        this.a = i7;
        this.b = f0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        final int i10 = 0;
        final int i11 = 1;
        f0 f0Var = this.b;
        switch (i7) {
            case 0:
                f0Var.dismiss();
                break;
            case 1:
                org.telegram.ui.Cells.k3 k3Var = f0Var.v2;
                org.telegram.messenger.g0.v1(k3Var.d);
                f0Var.D2 = k3Var.getText().toString();
                f0Var.v1();
                f0Var.u1(true);
                f0Var.p1();
                break;
            case 2:
                if (f0Var.f2 != null) {
                    TL_iv.RichMessage l1 = f0Var.l1();
                    if (l1 != null) {
                        f0Var.f2.a(l1);
                    }
                } else if (f0Var.e2 != null && f0Var.m1() != null) {
                    f0Var.e2.a(f0Var.m1());
                }
                f0Var.dismiss();
                break;
            case 3:
                f0Var.dismiss();
                break;
            case 4:
                f0Var.K2 = false;
                f0Var.X0();
                f0Var.J2.O(true);
                f0Var.I0();
                break;
            case 5:
                final f0 f0Var2 = this.b;
                k60 F = k60.F(f0Var2.c, f0Var2.I0, view);
                F.X = org.telegram.messenger.g0.L(450.0f);
                F.t = false;
                F.Y = true;
                ScrollView scrollView = new ScrollView(f0Var2.getContext());
                LinearLayout linearLayout = new LinearLayout(f0Var2.getContext());
                linearLayout.setOrientation(1);
                scrollView.addView(linearLayout);
                F.q(scrollView);
                ArrayList o4 = org.telegram.messenger.f10.o(null);
                ArrayList n10 = org.telegram.messenger.f10.n();
                if (!TextUtils.isEmpty(f0Var2.n2)) {
                    f0Var2.g1(F, linearLayout, true, k21.K0(k21.O0(f0Var2.n2, null, null)), null);
                }
                int size = o4.size();
                int i12 = 0;
                while (i12 < size) {
                    int i13 = i12 + 1;
                    final org.telegram.messenger.y00 y00Var = (org.telegram.messenger.y00) o4.get(i12);
                    if (!TextUtils.equals(y00Var.a, f0Var2.n2)) {
                        f0Var2.g1(F, linearLayout, false, y00Var.b, new Runnable() { // from class: org.telegram.ui.Components.g
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i10) {
                                    case 0:
                                        f0 f0Var3 = f0Var2;
                                        f0Var3.h1();
                                        String str = y00Var.a;
                                        f0Var3.n2 = str;
                                        k21.S0(str);
                                        f0Var3.p1();
                                        break;
                                    default:
                                        f0 f0Var4 = f0Var2;
                                        f0Var4.h1();
                                        String str2 = y00Var.a;
                                        f0Var4.n2 = str2;
                                        k21.S0(str2);
                                        f0Var4.p1();
                                        break;
                                }
                            }
                        });
                    }
                    i12 = i13;
                }
                View d1Var = new org.telegram.ui.ActionBar.d1(f0Var2.getContext(), f0Var2.I0);
                d1Var.setTag(R.id.fit_width_tag, 1);
                linearLayout.addView(d1Var, c8.ha.o(-1, 8));
                int size2 = n10.size();
                while (i10 < size2) {
                    Object obj = n10.get(i10);
                    i10++;
                    final org.telegram.messenger.y00 y00Var2 = (org.telegram.messenger.y00) obj;
                    f0Var2.g1(F, linearLayout, TextUtils.equals(y00Var2.a, f0Var2.n2), y00Var2.b, new Runnable() { // from class: org.telegram.ui.Components.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    f0 f0Var3 = f0Var2;
                                    f0Var3.h1();
                                    String str = y00Var2.a;
                                    f0Var3.n2 = str;
                                    k21.S0(str);
                                    f0Var3.p1();
                                    break;
                                default:
                                    f0 f0Var4 = f0Var2;
                                    f0Var4.h1();
                                    String str2 = y00Var2.a;
                                    f0Var4.n2 = str2;
                                    k21.S0(str2);
                                    f0Var4.p1();
                                    break;
                            }
                        }
                    });
                }
                F.Z();
                break;
            case 6:
                f0.d1(f0Var, view);
                break;
            case 7:
                if (!f0Var.M2) {
                    org.telegram.messenger.g0.g(f0Var.m1());
                    break;
                }
                break;
            case 8:
                f0Var.dismiss();
                break;
            default:
                f0Var.q1(0, 0, true);
                f0Var.dismiss();
                break;
        }
    }
}
