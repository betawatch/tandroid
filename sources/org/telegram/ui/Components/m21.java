package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m21 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v21 b;

    public /* synthetic */ m21(v21 v21Var, int i7) {
        this.a = i7;
        this.b = v21Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LinearLayout linearLayout;
        boolean z9;
        int i7 = this.a;
        v21 v21Var = this.b;
        switch (i7) {
            case 0:
                v21Var.dismiss();
                break;
            case 1:
                v21Var.dismiss();
                break;
            case 2:
                v21Var.dismiss();
                break;
            case 3:
                CharSequence charSequence = v21Var.U1;
                if (charSequence != null) {
                    v21Var.V1.a(charSequence);
                }
                v21Var.dismiss();
                break;
            default:
                final v21 v21Var2 = this.b;
                k60 F = k60.F(v21Var2.c, v21Var2.I0, view);
                F.X = org.telegram.messenger.g0.L(450.0f);
                final int i10 = 0;
                F.t = false;
                final int i11 = 1;
                F.Y = true;
                ScrollView scrollView = new ScrollView(v21Var2.getContext());
                LinearLayout linearLayout2 = new LinearLayout(v21Var2.getContext());
                linearLayout2.setOrientation(1);
                scrollView.addView(linearLayout2);
                F.q(scrollView);
                int i12 = 0;
                while (i12 < v21Var2.Z1.length) {
                    if (v21Var2.Y1 == i12) {
                        linearLayout = linearLayout2;
                        z9 = true;
                    } else {
                        linearLayout = linearLayout2;
                        z9 = false;
                    }
                    v21Var2.d1(F, linearLayout, z9, v21Var2.a2[i12], new r2(v21Var2, i12, 10));
                    i12++;
                    linearLayout2 = linearLayout;
                }
                LinearLayout linearLayout3 = linearLayout2;
                View d1Var = new org.telegram.ui.ActionBar.d1(v21Var2.getContext(), v21Var2.I0);
                d1Var.setTag(R.id.fit_width_tag, 1);
                linearLayout3.addView(d1Var, c8.ha.o(-1, 8));
                ArrayList o4 = org.telegram.messenger.f10.o(null);
                ArrayList n10 = org.telegram.messenger.f10.n();
                if (!TextUtils.isEmpty(v21Var2.X1)) {
                    v21Var2.d1(F, linearLayout3, true, k21.K0(k21.O0(v21Var2.X1, null, null)), null);
                }
                int size = o4.size();
                int i13 = 0;
                while (i13 < size) {
                    int i14 = i13 + 1;
                    final org.telegram.messenger.y00 y00Var = (org.telegram.messenger.y00) o4.get(i13);
                    if (!TextUtils.equals(y00Var.a, v21Var2.X1)) {
                        v21Var2.d1(F, linearLayout3, false, y00Var.b, new Runnable() { // from class: org.telegram.ui.Components.l21
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i10) {
                                    case 0:
                                        v21 v21Var3 = v21Var2;
                                        v21Var3.e1();
                                        String str = y00Var.a;
                                        v21Var3.X1 = str;
                                        k21.S0(str);
                                        v21Var3.f1();
                                        break;
                                    default:
                                        v21 v21Var4 = v21Var2;
                                        v21Var4.e1();
                                        String str2 = y00Var.a;
                                        v21Var4.X1 = str2;
                                        k21.S0(str2);
                                        v21Var4.f1();
                                        break;
                                }
                            }
                        });
                    }
                    i13 = i14;
                }
                View d1Var2 = new org.telegram.ui.ActionBar.d1(v21Var2.getContext(), v21Var2.I0);
                d1Var2.setTag(R.id.fit_width_tag, 1);
                linearLayout3.addView(d1Var2, c8.ha.o(-1, 8));
                int size2 = n10.size();
                while (i10 < size2) {
                    Object obj = n10.get(i10);
                    i10++;
                    final org.telegram.messenger.y00 y00Var2 = (org.telegram.messenger.y00) obj;
                    v21Var2.d1(F, linearLayout3, TextUtils.equals(y00Var2.a, v21Var2.X1), y00Var2.b, new Runnable() { // from class: org.telegram.ui.Components.l21
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    v21 v21Var3 = v21Var2;
                                    v21Var3.e1();
                                    String str = y00Var2.a;
                                    v21Var3.X1 = str;
                                    k21.S0(str);
                                    v21Var3.f1();
                                    break;
                                default:
                                    v21 v21Var4 = v21Var2;
                                    v21Var4.e1();
                                    String str2 = y00Var2.a;
                                    v21Var4.X1 = str2;
                                    k21.S0(str2);
                                    v21Var4.f1();
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
