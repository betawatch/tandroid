package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class c31 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l31 b;

    public /* synthetic */ c31(l31 l31Var, int i7) {
        this.a = i7;
        this.b = l31Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LinearLayout linearLayout;
        boolean z10;
        int i7 = this.a;
        l31 l31Var = this.b;
        switch (i7) {
            case 0:
                l31Var.dismiss();
                break;
            case 1:
                l31Var.dismiss();
                break;
            case 2:
                l31Var.dismiss();
                break;
            case 3:
                CharSequence charSequence = l31Var.Y1;
                if (charSequence != null) {
                    l31Var.Z1.a(charSequence);
                }
                l31Var.dismiss();
                break;
            default:
                final l31 l31Var2 = this.b;
                x60 G = x60.G(l31Var2.c, l31Var2.J0, view);
                G.a0 = org.telegram.messenger.g0.L(450.0f);
                final int i10 = 0;
                G.t = false;
                final int i11 = 1;
                G.b0 = true;
                ScrollView scrollView = new ScrollView(l31Var2.getContext());
                LinearLayout linearLayout2 = new LinearLayout(l31Var2.getContext());
                linearLayout2.setOrientation(1);
                scrollView.addView(linearLayout2);
                G.q(scrollView);
                int i12 = 0;
                while (i12 < l31Var2.d2.length) {
                    if (l31Var2.c2 == i12) {
                        linearLayout = linearLayout2;
                        z10 = true;
                    } else {
                        linearLayout = linearLayout2;
                        z10 = false;
                    }
                    l31Var2.e1(G, linearLayout, z10, l31Var2.e2[i12], new org.telegram.ui.ii(l31Var2, i12, 18));
                    i12++;
                    linearLayout2 = linearLayout;
                }
                LinearLayout linearLayout3 = linearLayout2;
                View d1Var = new org.telegram.ui.ActionBar.d1(l31Var2.getContext(), l31Var2.J0);
                d1Var.setTag(R.id.fit_width_tag, 1);
                linearLayout3.addView(d1Var, c8.na.o(-1, 8));
                ArrayList o4 = org.telegram.messenger.y00.o(null);
                ArrayList n10 = org.telegram.messenger.y00.n();
                if (!TextUtils.isEmpty(l31Var2.b2)) {
                    l31Var2.e1(G, linearLayout3, true, a31.L0(a31.P0(l31Var2.b2, null, null)), null);
                }
                int size = o4.size();
                int i13 = 0;
                while (i13 < size) {
                    int i14 = i13 + 1;
                    final org.telegram.messenger.r00 r00Var = (org.telegram.messenger.r00) o4.get(i13);
                    if (!TextUtils.equals(r00Var.a, l31Var2.b2)) {
                        l31Var2.e1(G, linearLayout3, false, r00Var.b, new Runnable() { // from class: org.telegram.ui.Components.b31
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i10) {
                                    case 0:
                                        l31 l31Var3 = l31Var2;
                                        l31Var3.f1();
                                        String str = r00Var.a;
                                        l31Var3.b2 = str;
                                        a31.U0(str);
                                        l31Var3.g1();
                                        break;
                                    default:
                                        l31 l31Var4 = l31Var2;
                                        l31Var4.f1();
                                        String str2 = r00Var.a;
                                        l31Var4.b2 = str2;
                                        a31.U0(str2);
                                        l31Var4.g1();
                                        break;
                                }
                            }
                        });
                    }
                    i13 = i14;
                }
                View d1Var2 = new org.telegram.ui.ActionBar.d1(l31Var2.getContext(), l31Var2.J0);
                d1Var2.setTag(R.id.fit_width_tag, 1);
                linearLayout3.addView(d1Var2, c8.na.o(-1, 8));
                int size2 = n10.size();
                while (i10 < size2) {
                    Object obj = n10.get(i10);
                    i10++;
                    final org.telegram.messenger.r00 r00Var2 = (org.telegram.messenger.r00) obj;
                    l31Var2.e1(G, linearLayout3, TextUtils.equals(r00Var2.a, l31Var2.b2), r00Var2.b, new Runnable() { // from class: org.telegram.ui.Components.b31
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    l31 l31Var3 = l31Var2;
                                    l31Var3.f1();
                                    String str = r00Var2.a;
                                    l31Var3.b2 = str;
                                    a31.U0(str);
                                    l31Var3.g1();
                                    break;
                                default:
                                    l31 l31Var4 = l31Var2;
                                    l31Var4.f1();
                                    String str2 = r00Var2.a;
                                    l31Var4.b2 = str2;
                                    a31.U0(str2);
                                    l31Var4.g1();
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
