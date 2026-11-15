package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class r21 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a31 b;

    public /* synthetic */ r21(a31 a31Var, int i7) {
        this.a = i7;
        this.b = a31Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LinearLayout linearLayout;
        boolean z10;
        int i7 = this.a;
        a31 a31Var = this.b;
        switch (i7) {
            case 0:
                a31Var.dismiss();
                break;
            case 1:
                a31Var.dismiss();
                break;
            case 2:
                a31Var.dismiss();
                break;
            case 3:
                CharSequence charSequence = a31Var.Y1;
                if (charSequence != null) {
                    a31Var.Z1.a(charSequence);
                }
                a31Var.dismiss();
                break;
            default:
                final a31 a31Var2 = this.b;
                m60 F = m60.F(a31Var2.c, a31Var2.J0, view);
                F.X = org.telegram.messenger.g0.L(450.0f);
                final int i10 = 0;
                F.t = false;
                final int i11 = 1;
                F.Y = true;
                ScrollView scrollView = new ScrollView(a31Var2.getContext());
                LinearLayout linearLayout2 = new LinearLayout(a31Var2.getContext());
                linearLayout2.setOrientation(1);
                scrollView.addView(linearLayout2);
                F.q(scrollView);
                int i12 = 0;
                while (i12 < a31Var2.d2.length) {
                    if (a31Var2.c2 == i12) {
                        linearLayout = linearLayout2;
                        z10 = true;
                    } else {
                        linearLayout = linearLayout2;
                        z10 = false;
                    }
                    a31Var2.d1(F, linearLayout, z10, a31Var2.e2[i12], new a2(a31Var2, i12, 13));
                    i12++;
                    linearLayout2 = linearLayout;
                }
                LinearLayout linearLayout3 = linearLayout2;
                View d1Var = new org.telegram.ui.ActionBar.d1(a31Var2.getContext(), a31Var2.J0);
                d1Var.setTag(R.id.fit_width_tag, 1);
                linearLayout3.addView(d1Var, c8.ja.o(-1, 8));
                ArrayList o4 = org.telegram.messenger.c10.o(null);
                ArrayList n10 = org.telegram.messenger.c10.n();
                if (!TextUtils.isEmpty(a31Var2.b2)) {
                    a31Var2.d1(F, linearLayout3, true, p21.K0(p21.O0(a31Var2.b2, null, null)), null);
                }
                int size = o4.size();
                int i13 = 0;
                while (i13 < size) {
                    int i14 = i13 + 1;
                    final org.telegram.messenger.v00 v00Var = (org.telegram.messenger.v00) o4.get(i13);
                    if (!TextUtils.equals(v00Var.a, a31Var2.b2)) {
                        a31Var2.d1(F, linearLayout3, false, v00Var.b, new Runnable() { // from class: org.telegram.ui.Components.q21
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i10) {
                                    case 0:
                                        a31 a31Var3 = a31Var2;
                                        a31Var3.e1();
                                        String str = v00Var.a;
                                        a31Var3.b2 = str;
                                        p21.T0(str);
                                        a31Var3.f1();
                                        break;
                                    default:
                                        a31 a31Var4 = a31Var2;
                                        a31Var4.e1();
                                        String str2 = v00Var.a;
                                        a31Var4.b2 = str2;
                                        p21.T0(str2);
                                        a31Var4.f1();
                                        break;
                                }
                            }
                        });
                    }
                    i13 = i14;
                }
                View d1Var2 = new org.telegram.ui.ActionBar.d1(a31Var2.getContext(), a31Var2.J0);
                d1Var2.setTag(R.id.fit_width_tag, 1);
                linearLayout3.addView(d1Var2, c8.ja.o(-1, 8));
                int size2 = n10.size();
                while (i10 < size2) {
                    Object obj = n10.get(i10);
                    i10++;
                    final org.telegram.messenger.v00 v00Var2 = (org.telegram.messenger.v00) obj;
                    a31Var2.d1(F, linearLayout3, TextUtils.equals(v00Var2.a, a31Var2.b2), v00Var2.b, new Runnable() { // from class: org.telegram.ui.Components.q21
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    a31 a31Var3 = a31Var2;
                                    a31Var3.e1();
                                    String str = v00Var2.a;
                                    a31Var3.b2 = str;
                                    p21.T0(str);
                                    a31Var3.f1();
                                    break;
                                default:
                                    a31 a31Var4 = a31Var2;
                                    a31Var4.e1();
                                    String str2 = v00Var2.a;
                                    a31Var4.b2 = str2;
                                    p21.T0(str2);
                                    a31Var4.f1();
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
