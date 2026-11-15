package org.telegram.ui.Cells;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.eq;
import org.telegram.ui.an;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ka implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ org.telegram.ui.ActionBar.e2 d;
    public final /* synthetic */ Serializable e;

    public /* synthetic */ ka(an anVar, TLRPC.User user, String str, boolean z10, int i7) {
        this.d = anVar;
        this.e = str;
        this.b = z10;
        this.c = i7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        int i10 = this.c;
        boolean z10 = this.b;
        Serializable serializable = this.e;
        org.telegram.ui.ActionBar.e2 e2Var = this.d;
        int i11 = 0;
        switch (i7) {
            case 0:
                yw ywVar = (yw) e2Var;
                ArrayList arrayList = (ArrayList) serializable;
                String M0 = hd.M0(2131743907, null);
                int i12 = org.telegram.ui.ActionBar.j6.xj;
                SpannableStringBuilder S2 = org.telegram.messenger.g0.S2(M0, i12, 0, new f(ywVar, 12), null);
                SpannableString spannableString = new SpannableString(">");
                eq eqVar = new eq(R.drawable.attach_arrow_right, 0);
                eqVar.y = org.telegram.ui.ActionBar.j6.x0(null, i12, false);
                eqVar.I = 0.7f;
                eqVar.J = 0.7f;
                eqVar.F = org.telegram.messenger.g0.L(12.0f);
                spannableString.setSpan(eqVar, 0, spannableString.length(), 33);
                org.telegram.messenger.g0.K2(S2, spannableString, ">");
                cc.a0(ywVar).I(R.raw.contact_check, hd.M0(z10 ? 2131743908 : 2131743909, null), S2).j();
                np.s1(i10).U1().f(true, arrayList, new fi.e(8));
                np.s1(i10).U1().a();
                break;
            default:
                an anVar = (an) e2Var;
                String str = (String) serializable;
                Pattern pattern = org.telegram.ui.Components.t4.a;
                if (anVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.u2 i13 = i20.i(anVar.getParentActivity(), false, 1, null);
                    i13.P = hd.M0(z10 ? 2131752194 : 2131752193, null);
                    i13.Q = true;
                    LinearLayout linearLayout = new LinearLayout(anVar.getParentActivity());
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(anVar.getParentActivity());
                    linearLayout.addView(textView, c8.ja.t(-1, -1, 0, 21, 0, 21, 8));
                    org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.G6, null);
                    textView.setTextSize(1, 16.0f);
                    textView.setText(org.telegram.messenger.g0.X2(hd.a0("ChatWithAdminMessage", null, 2131752192, str, hd.s(i10, false))));
                    TextView textView2 = new TextView(anVar.getParentActivity());
                    textView2.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                    textView2.setGravity(17);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTypeface(org.telegram.messenger.g0.o());
                    textView2.setText(hd.M0(2131749274, null));
                    org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.Ji, null);
                    int L = org.telegram.messenger.g0.L(8.0f);
                    int i14 = org.telegram.ui.ActionBar.j6.Fi;
                    int x02 = org.telegram.ui.ActionBar.j6.x0(null, i14, false);
                    int i15 = org.telegram.ui.ActionBar.j6.Hi;
                    int x03 = org.telegram.ui.ActionBar.j6.x0(null, i15, false);
                    y k02 = org.telegram.ui.ActionBar.j6.k0(L, L, L, L, x02, x03, x03);
                    org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i14);
                    org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i15);
                    textView2.setBackground(k02);
                    org.telegram.ui.ActionBar.q6.j(textView2, k02, M, M2, null);
                    linearLayout.addView(textView2, c8.ja.t(-1, 48, 0, 16, 12, 16, 8));
                    i13.O = linearLayout;
                    i13.show();
                    textView2.setOnClickListener(new org.telegram.ui.Components.w2(i13, i11));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ka(yw ywVar, boolean z10, int i7, ArrayList arrayList) {
        this.d = ywVar;
        this.b = z10;
        this.c = i7;
        this.e = arrayList;
    }
}
