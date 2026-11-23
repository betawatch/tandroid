package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d31 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m31 b;

    public /* synthetic */ d31(m31 m31Var, int i7) {
        this.a = i7;
        this.b = m31Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LinearLayout linearLayout;
        boolean z10;
        int i7 = this.a;
        m31 m31Var = this.b;
        switch (i7) {
            case 0:
                m31Var.dismiss();
                break;
            case 1:
                m31Var.dismiss();
                break;
            case 2:
                m31Var.dismiss();
                break;
            case 3:
                CharSequence charSequence = m31Var.Y1;
                if (charSequence != null) {
                    m31Var.Z1.a(charSequence);
                }
                m31Var.dismiss();
                break;
            default:
                final m31 m31Var2 = this.b;
                a70 G = a70.G(m31Var2.c, m31Var2.J0, view);
                G.a0 = org.telegram.messenger.g0.L(450.0f);
                final int i10 = 0;
                G.t = false;
                final int i11 = 1;
                G.b0 = true;
                ScrollView scrollView = new ScrollView(m31Var2.getContext());
                LinearLayout linearLayout2 = new LinearLayout(m31Var2.getContext());
                linearLayout2.setOrientation(1);
                scrollView.addView(linearLayout2);
                G.q(scrollView);
                int i12 = 0;
                while (i12 < m31Var2.d2.length) {
                    if (m31Var2.c2 == i12) {
                        linearLayout = linearLayout2;
                        z10 = true;
                    } else {
                        linearLayout = linearLayout2;
                        z10 = false;
                    }
                    m31Var2.e1(G, linearLayout, z10, m31Var2.e2[i12], new org.telegram.ui.ii(m31Var2, i12, 16));
                    i12++;
                    linearLayout2 = linearLayout;
                }
                LinearLayout linearLayout3 = linearLayout2;
                View d1Var = new org.telegram.ui.ActionBar.d1(m31Var2.getContext(), m31Var2.J0);
                d1Var.setTag(R.id.fit_width_tag, 1);
                linearLayout3.addView(d1Var, c8.ma.o(-1, 8));
                ArrayList o4 = org.telegram.messenger.a10.o(null);
                ArrayList n10 = org.telegram.messenger.a10.n();
                if (!TextUtils.isEmpty(m31Var2.b2)) {
                    m31Var2.e1(G, linearLayout3, true, b31.L0(b31.P0(m31Var2.b2, null, null)), null);
                }
                int size = o4.size();
                int i13 = 0;
                while (i13 < size) {
                    int i14 = i13 + 1;
                    final org.telegram.messenger.t00 t00Var = (org.telegram.messenger.t00) o4.get(i13);
                    if (!TextUtils.equals(t00Var.a, m31Var2.b2)) {
                        m31Var2.e1(G, linearLayout3, false, t00Var.b, new Runnable() { // from class: org.telegram.ui.Components.c31
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i10) {
                                    case 0:
                                        m31 m31Var3 = m31Var2;
                                        m31Var3.f1();
                                        String str = t00Var.a;
                                        m31Var3.b2 = str;
                                        b31.U0(str);
                                        m31Var3.g1();
                                        break;
                                    default:
                                        m31 m31Var4 = m31Var2;
                                        m31Var4.f1();
                                        String str2 = t00Var.a;
                                        m31Var4.b2 = str2;
                                        b31.U0(str2);
                                        m31Var4.g1();
                                        break;
                                }
                            }
                        });
                    }
                    i13 = i14;
                }
                View d1Var2 = new org.telegram.ui.ActionBar.d1(m31Var2.getContext(), m31Var2.J0);
                d1Var2.setTag(R.id.fit_width_tag, 1);
                linearLayout3.addView(d1Var2, c8.ma.o(-1, 8));
                int size2 = n10.size();
                while (i10 < size2) {
                    Object obj = n10.get(i10);
                    i10++;
                    final org.telegram.messenger.t00 t00Var2 = (org.telegram.messenger.t00) obj;
                    m31Var2.e1(G, linearLayout3, TextUtils.equals(t00Var2.a, m31Var2.b2), t00Var2.b, new Runnable() { // from class: org.telegram.ui.Components.c31
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    m31 m31Var3 = m31Var2;
                                    m31Var3.f1();
                                    String str = t00Var2.a;
                                    m31Var3.b2 = str;
                                    b31.U0(str);
                                    m31Var3.g1();
                                    break;
                                default:
                                    m31 m31Var4 = m31Var2;
                                    m31Var4.f1();
                                    String str2 = t00Var2.a;
                                    m31Var4.b2 = str2;
                                    b31.U0(str2);
                                    m31Var4.g1();
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
