package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h21 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q21 b;

    public /* synthetic */ h21(q21 q21Var, int i3) {
        this.a = i3;
        this.b = q21Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LinearLayout linearLayout;
        boolean z10;
        int i3 = this.a;
        q21 q21Var = this.b;
        switch (i3) {
            case 0:
                q21Var.dismiss();
                break;
            case 1:
                q21Var.dismiss();
                break;
            case 2:
                q21Var.dismiss();
                break;
            case 3:
                CharSequence charSequence = q21Var.V1;
                if (charSequence != null) {
                    q21Var.W1.a(charSequence);
                }
                q21Var.dismiss();
                break;
            default:
                final q21 q21Var2 = this.b;
                f60 F = f60.F(q21Var2.c, q21Var2.J0, view);
                F.X = org.telegram.messenger.g0.L(450.0f);
                final int i10 = 0;
                F.t = false;
                final int i11 = 1;
                F.Y = true;
                ScrollView scrollView = new ScrollView(q21Var2.getContext());
                LinearLayout linearLayout2 = new LinearLayout(q21Var2.getContext());
                linearLayout2.setOrientation(1);
                scrollView.addView(linearLayout2);
                F.q(scrollView);
                int i12 = 0;
                while (i12 < q21Var2.a2.length) {
                    if (q21Var2.Z1 == i12) {
                        linearLayout = linearLayout2;
                        z10 = true;
                    } else {
                        linearLayout = linearLayout2;
                        z10 = false;
                    }
                    q21Var2.d1(F, linearLayout, z10, q21Var2.b2[i12], new o2(q21Var2, i12, 10));
                    i12++;
                    linearLayout2 = linearLayout;
                }
                LinearLayout linearLayout3 = linearLayout2;
                View c1Var = new org.telegram.ui.ActionBar.c1(q21Var2.getContext(), q21Var2.J0);
                c1Var.setTag(R.id.fit_width_tag, 1);
                linearLayout3.addView(c1Var, b8.mf.o(-1, 8));
                ArrayList o10 = org.telegram.messenger.x00.o(null);
                ArrayList n4 = org.telegram.messenger.x00.n();
                if (!TextUtils.isEmpty(q21Var2.Y1)) {
                    q21Var2.d1(F, linearLayout3, true, f21.K0(f21.O0(q21Var2.Y1, null, null)), null);
                }
                int size = o10.size();
                int i13 = 0;
                while (i13 < size) {
                    int i14 = i13 + 1;
                    final org.telegram.messenger.q00 q00Var = (org.telegram.messenger.q00) o10.get(i13);
                    if (!TextUtils.equals(q00Var.a, q21Var2.Y1)) {
                        q21Var2.d1(F, linearLayout3, false, q00Var.b, new Runnable() { // from class: org.telegram.ui.Components.g21
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i10) {
                                    case 0:
                                        q21 q21Var3 = q21Var2;
                                        q21Var3.e1();
                                        String str = q00Var.a;
                                        q21Var3.Y1 = str;
                                        f21.S0(str);
                                        q21Var3.f1();
                                        break;
                                    default:
                                        q21 q21Var4 = q21Var2;
                                        q21Var4.e1();
                                        String str2 = q00Var.a;
                                        q21Var4.Y1 = str2;
                                        f21.S0(str2);
                                        q21Var4.f1();
                                        break;
                                }
                            }
                        });
                    }
                    i13 = i14;
                }
                View c1Var2 = new org.telegram.ui.ActionBar.c1(q21Var2.getContext(), q21Var2.J0);
                c1Var2.setTag(R.id.fit_width_tag, 1);
                linearLayout3.addView(c1Var2, b8.mf.o(-1, 8));
                int size2 = n4.size();
                while (i10 < size2) {
                    Object obj = n4.get(i10);
                    i10++;
                    final org.telegram.messenger.q00 q00Var2 = (org.telegram.messenger.q00) obj;
                    q21Var2.d1(F, linearLayout3, TextUtils.equals(q00Var2.a, q21Var2.Y1), q00Var2.b, new Runnable() { // from class: org.telegram.ui.Components.g21
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    q21 q21Var3 = q21Var2;
                                    q21Var3.e1();
                                    String str = q00Var2.a;
                                    q21Var3.Y1 = str;
                                    f21.S0(str);
                                    q21Var3.f1();
                                    break;
                                default:
                                    q21 q21Var4 = q21Var2;
                                    q21Var4.e1();
                                    String str2 = q00Var2.a;
                                    q21Var4.Y1 = str2;
                                    f21.S0(str2);
                                    q21Var4.f1();
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
