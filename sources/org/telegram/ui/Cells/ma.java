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
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.lq;
import org.telegram.ui.bn;
import org.telegram.ui.cx;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ma implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ org.telegram.ui.ActionBar.h2 d;
    public final /* synthetic */ Serializable e;

    public /* synthetic */ ma(bn bnVar, TLRPC.User user, String str, boolean z10, int i7) {
        this.d = bnVar;
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
        org.telegram.ui.ActionBar.h2 h2Var = this.d;
        int i11 = 0;
        switch (i7) {
            case 0:
                cx cxVar = (cx) h2Var;
                ArrayList arrayList = (ArrayList) serializable;
                String M0 = gd.M0(2131743670, null);
                int i12 = org.telegram.ui.ActionBar.n6.xj;
                SpannableStringBuilder R2 = org.telegram.messenger.g0.R2(M0, i12, 0, new f(cxVar, 12), null);
                SpannableString spannableString = new SpannableString(">");
                lq lqVar = new lq(R.drawable.attach_arrow_right, 0);
                lqVar.y = org.telegram.ui.ActionBar.n6.x0(null, i12, false);
                lqVar.I = 0.7f;
                lqVar.J = 0.7f;
                lqVar.F = org.telegram.messenger.g0.L(12.0f);
                spannableString.setSpan(lqVar, 0, spannableString.length(), 33);
                org.telegram.messenger.g0.K2(R2, spannableString, ">");
                lc.b0(cxVar).I(R.raw.contact_check, gd.M0(z10 ? 2131743671 : 2131743672, null), R2).j();
                mp.u1(i10).W1().f(true, arrayList, new fi.e(8));
                mp.u1(i10).W1().a();
                break;
            default:
                bn bnVar = (bn) h2Var;
                String str = (String) serializable;
                Pattern pattern = org.telegram.ui.Components.b5.a;
                if (bnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.x2 j3 = n10.j(bnVar.getParentActivity(), false, 1, null);
                    j3.P = gd.M0(z10 ? 2131752183 : 2131752182, null);
                    j3.Q = true;
                    LinearLayout linearLayout = new LinearLayout(bnVar.getParentActivity());
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(bnVar.getParentActivity());
                    linearLayout.addView(textView, c8.ma.t(-1, -1, 0, 21, 0, 21, 8));
                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, null);
                    textView.setTextSize(1, 16.0f);
                    textView.setText(org.telegram.messenger.g0.W2(gd.a0("ChatWithAdminMessage", null, 2131752181, str, gd.s(i10, false))));
                    TextView textView2 = new TextView(bnVar.getParentActivity());
                    textView2.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                    textView2.setGravity(17);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTypeface(org.telegram.messenger.g0.o());
                    textView2.setText(gd.M0(2131749082, null));
                    org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.Ji, null);
                    int L = org.telegram.messenger.g0.L(8.0f);
                    int i13 = org.telegram.ui.ActionBar.n6.Fi;
                    int x02 = org.telegram.ui.ActionBar.n6.x0(null, i13, false);
                    int i14 = org.telegram.ui.ActionBar.n6.Hi;
                    int x03 = org.telegram.ui.ActionBar.n6.x0(null, i14, false);
                    y k02 = org.telegram.ui.ActionBar.n6.k0(L, L, L, L, x02, x03, x03);
                    org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i13);
                    org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i14);
                    textView2.setBackground(k02);
                    org.telegram.ui.ActionBar.u6.j(textView2, k02, M, M2, null);
                    linearLayout.addView(textView2, c8.ma.t(-1, 48, 0, 16, 12, 16, 8));
                    j3.O = linearLayout;
                    j3.show();
                    textView2.setOnClickListener(new org.telegram.ui.Components.e3(j3, i11));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ma(cx cxVar, boolean z10, int i7, ArrayList arrayList) {
        this.d = cxVar;
        this.b = z10;
        this.c = i7;
        this.e = arrayList;
    }
}
