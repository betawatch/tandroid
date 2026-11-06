package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g21 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ p21 b;

    public /* synthetic */ g21(p21 p21Var, int i7) {
        this.a = i7;
        this.b = p21Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LinearLayout linearLayout;
        boolean z9;
        int i7 = this.a;
        p21 p21Var = this.b;
        switch (i7) {
            case 0:
                p21Var.dismiss();
                break;
            case 1:
                p21Var.dismiss();
                break;
            case 2:
                p21Var.dismiss();
                break;
            case 3:
                CharSequence charSequence = p21Var.U1;
                if (charSequence != null) {
                    p21Var.V1.a(charSequence);
                }
                p21Var.dismiss();
                break;
            default:
                final p21 p21Var2 = this.b;
                k60 F = k60.F(p21Var2.c, p21Var2.I0, view);
                F.X = org.telegram.messenger.g0.L(450.0f);
                final int i10 = 0;
                F.t = false;
                final int i11 = 1;
                F.Y = true;
                ScrollView scrollView = new ScrollView(p21Var2.getContext());
                LinearLayout linearLayout2 = new LinearLayout(p21Var2.getContext());
                linearLayout2.setOrientation(1);
                scrollView.addView(linearLayout2);
                F.q(scrollView);
                int i12 = 0;
                while (i12 < p21Var2.Z1.length) {
                    if (p21Var2.Y1 == i12) {
                        linearLayout = linearLayout2;
                        z9 = true;
                    } else {
                        linearLayout = linearLayout2;
                        z9 = false;
                    }
                    p21Var2.d1(F, linearLayout, z9, p21Var2.a2[i12], new r2(p21Var2, i12, 10));
                    i12++;
                    linearLayout2 = linearLayout;
                }
                LinearLayout linearLayout3 = linearLayout2;
                View d1Var = new org.telegram.ui.ActionBar.d1(p21Var2.getContext(), p21Var2.I0);
                d1Var.setTag(R.id.fit_width_tag, 1);
                linearLayout3.addView(d1Var, c8.ha.o(-1, 8));
                ArrayList o4 = org.telegram.messenger.f10.o(null);
                ArrayList n10 = org.telegram.messenger.f10.n();
                if (!TextUtils.isEmpty(p21Var2.X1)) {
                    p21Var2.d1(F, linearLayout3, true, e21.K0(e21.O0(p21Var2.X1, null, null)), null);
                }
                int size = o4.size();
                int i13 = 0;
                while (i13 < size) {
                    int i14 = i13 + 1;
                    final org.telegram.messenger.y00 y00Var = (org.telegram.messenger.y00) o4.get(i13);
                    if (!TextUtils.equals(y00Var.a, p21Var2.X1)) {
                        p21Var2.d1(F, linearLayout3, false, y00Var.b, new Runnable() { // from class: org.telegram.ui.Components.f21
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i10) {
                                    case 0:
                                        p21 p21Var3 = p21Var2;
                                        p21Var3.e1();
                                        String str = y00Var.a;
                                        p21Var3.X1 = str;
                                        e21.S0(str);
                                        p21Var3.f1();
                                        break;
                                    default:
                                        p21 p21Var4 = p21Var2;
                                        p21Var4.e1();
                                        String str2 = y00Var.a;
                                        p21Var4.X1 = str2;
                                        e21.S0(str2);
                                        p21Var4.f1();
                                        break;
                                }
                            }
                        });
                    }
                    i13 = i14;
                }
                View d1Var2 = new org.telegram.ui.ActionBar.d1(p21Var2.getContext(), p21Var2.I0);
                d1Var2.setTag(R.id.fit_width_tag, 1);
                linearLayout3.addView(d1Var2, c8.ha.o(-1, 8));
                int size2 = n10.size();
                while (i10 < size2) {
                    Object obj = n10.get(i10);
                    i10++;
                    final org.telegram.messenger.y00 y00Var2 = (org.telegram.messenger.y00) obj;
                    p21Var2.d1(F, linearLayout3, TextUtils.equals(y00Var2.a, p21Var2.X1), y00Var2.b, new Runnable() { // from class: org.telegram.ui.Components.f21
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    p21 p21Var3 = p21Var2;
                                    p21Var3.e1();
                                    String str = y00Var2.a;
                                    p21Var3.X1 = str;
                                    e21.S0(str);
                                    p21Var3.f1();
                                    break;
                                default:
                                    p21 p21Var4 = p21Var2;
                                    p21Var4.e1();
                                    String str2 = y00Var2.a;
                                    p21Var4.X1 = str2;
                                    e21.S0(str2);
                                    p21Var4.f1();
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
