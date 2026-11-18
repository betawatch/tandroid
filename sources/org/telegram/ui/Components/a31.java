package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class a31 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k31 b;

    public /* synthetic */ a31(k31 k31Var, int i7) {
        this.a = i7;
        this.b = k31Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LinearLayout linearLayout;
        boolean z10;
        int i7 = this.a;
        k31 k31Var = this.b;
        switch (i7) {
            case 0:
                k31Var.dismiss();
                break;
            case 1:
                k31Var.dismiss();
                break;
            case 2:
                k31Var.dismiss();
                break;
            case 3:
                CharSequence charSequence = k31Var.Y1;
                if (charSequence != null) {
                    k31Var.Z1.a(charSequence);
                }
                k31Var.dismiss();
                break;
            default:
                final k31 k31Var2 = this.b;
                y60 G = y60.G(k31Var2.c, k31Var2.J0, view);
                G.a0 = org.telegram.messenger.g0.L(450.0f);
                final int i10 = 0;
                G.t = false;
                final int i11 = 1;
                G.b0 = true;
                ScrollView scrollView = new ScrollView(k31Var2.getContext());
                LinearLayout linearLayout2 = new LinearLayout(k31Var2.getContext());
                linearLayout2.setOrientation(1);
                scrollView.addView(linearLayout2);
                G.q(scrollView);
                int i12 = 0;
                while (i12 < k31Var2.d2.length) {
                    if (k31Var2.c2 == i12) {
                        linearLayout = linearLayout2;
                        z10 = true;
                    } else {
                        linearLayout = linearLayout2;
                        z10 = false;
                    }
                    k31Var2.e1(G, linearLayout, z10, k31Var2.e2[i12], new org.telegram.ui.ii(k31Var2, i12, 16));
                    i12++;
                    linearLayout2 = linearLayout;
                }
                LinearLayout linearLayout3 = linearLayout2;
                View e1Var = new org.telegram.ui.ActionBar.e1(k31Var2.getContext(), k31Var2.J0);
                e1Var.setTag(R.id.fit_width_tag, 1);
                linearLayout3.addView(e1Var, c8.ma.o(-1, 8));
                ArrayList o4 = org.telegram.messenger.z00.o(null);
                ArrayList n10 = org.telegram.messenger.z00.n();
                if (!TextUtils.isEmpty(k31Var2.b2)) {
                    k31Var2.e1(G, linearLayout3, true, y21.L0(y21.P0(k31Var2.b2, null, null)), null);
                }
                int size = o4.size();
                int i13 = 0;
                while (i13 < size) {
                    int i14 = i13 + 1;
                    final org.telegram.messenger.s00 s00Var = (org.telegram.messenger.s00) o4.get(i13);
                    if (!TextUtils.equals(s00Var.a, k31Var2.b2)) {
                        k31Var2.e1(G, linearLayout3, false, s00Var.b, new Runnable() { // from class: org.telegram.ui.Components.z21
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i10) {
                                    case 0:
                                        k31 k31Var3 = k31Var2;
                                        k31Var3.f1();
                                        String str = s00Var.a;
                                        k31Var3.b2 = str;
                                        y21.U0(str);
                                        k31Var3.g1();
                                        break;
                                    default:
                                        k31 k31Var4 = k31Var2;
                                        k31Var4.f1();
                                        String str2 = s00Var.a;
                                        k31Var4.b2 = str2;
                                        y21.U0(str2);
                                        k31Var4.g1();
                                        break;
                                }
                            }
                        });
                    }
                    i13 = i14;
                }
                View e1Var2 = new org.telegram.ui.ActionBar.e1(k31Var2.getContext(), k31Var2.J0);
                e1Var2.setTag(R.id.fit_width_tag, 1);
                linearLayout3.addView(e1Var2, c8.ma.o(-1, 8));
                int size2 = n10.size();
                while (i10 < size2) {
                    Object obj = n10.get(i10);
                    i10++;
                    final org.telegram.messenger.s00 s00Var2 = (org.telegram.messenger.s00) obj;
                    k31Var2.e1(G, linearLayout3, TextUtils.equals(s00Var2.a, k31Var2.b2), s00Var2.b, new Runnable() { // from class: org.telegram.ui.Components.z21
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    k31 k31Var3 = k31Var2;
                                    k31Var3.f1();
                                    String str = s00Var2.a;
                                    k31Var3.b2 = str;
                                    y21.U0(str);
                                    k31Var3.g1();
                                    break;
                                default:
                                    k31 k31Var4 = k31Var2;
                                    k31Var4.f1();
                                    String str2 = s00Var2.a;
                                    k31Var4.b2 = str2;
                                    y21.U0(str2);
                                    k31Var4.g1();
                                    break;
                            }
                        }
                    });
                }
                G.a0();
                break;
        }
    }
}
