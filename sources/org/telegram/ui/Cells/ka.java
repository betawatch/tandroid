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
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.wp;
import org.telegram.ui.cn;
import org.telegram.ui.zw;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ka implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 d;
    public final /* synthetic */ Serializable e;

    public /* synthetic */ ka(cn cnVar, TLRPC.User user, String str, boolean z9, int i7) {
        this.d = cnVar;
        this.e = str;
        this.b = z9;
        this.c = i7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        int i10 = this.c;
        boolean z9 = this.b;
        Serializable serializable = this.e;
        org.telegram.ui.ActionBar.f2 f2Var = this.d;
        int i11 = 0;
        switch (i7) {
            case 0:
                zw zwVar = (zw) f2Var;
                ArrayList arrayList = (ArrayList) serializable;
                String M0 = id.M0(2131743907, null);
                int i12 = org.telegram.ui.ActionBar.m6.uj;
                SpannableStringBuilder S2 = org.telegram.messenger.g0.S2(M0, i12, 0, new f(zwVar, 11), null);
                SpannableString spannableString = new SpannableString(">");
                wp wpVar = new wp(R.drawable.attach_arrow_right, 0);
                wpVar.y = org.telegram.ui.ActionBar.m6.x0(null, i12, false);
                wpVar.H = 0.7f;
                wpVar.I = 0.7f;
                wpVar.E = org.telegram.messenger.g0.L(12.0f);
                spannableString.setSpan(wpVar, 0, spannableString.length(), 33);
                org.telegram.messenger.g0.K2(S2, spannableString, ">");
                gc.a0(zwVar).I(R.raw.contact_check, id.M0(z9 ? 2131743908 : 2131743909, null), S2).j();
                qp.s1(i10).U1().f(true, arrayList, new di.e(8));
                qp.s1(i10).U1().a();
                break;
            default:
                cn cnVar = (cn) f2Var;
                String str = (String) serializable;
                Pattern pattern = org.telegram.ui.Components.u4.a;
                if (cnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.w2 h = org.telegram.messenger.camera.q.h(cnVar.getParentActivity(), false, 1, null);
                    h.O = id.M0(z9 ? 2131752194 : 2131752193, null);
                    h.P = true;
                    LinearLayout linearLayout = new LinearLayout(cnVar.getParentActivity());
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(cnVar.getParentActivity());
                    linearLayout.addView(textView, c8.ha.t(-1, -1, 0, 21, 0, 21, 8));
                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, null);
                    textView.setTextSize(1, 16.0f);
                    textView.setText(org.telegram.messenger.g0.X2(id.a0("ChatWithAdminMessage", null, 2131752192, str, id.s(i10, false))));
                    TextView textView2 = new TextView(cnVar.getParentActivity());
                    textView2.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                    textView2.setGravity(17);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTypeface(org.telegram.messenger.g0.o());
                    textView2.setText(id.M0(2131749274, null));
                    org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.Gi, null);
                    int L = org.telegram.messenger.g0.L(8.0f);
                    int i13 = org.telegram.ui.ActionBar.m6.Ci;
                    int x02 = org.telegram.ui.ActionBar.m6.x0(null, i13, false);
                    int i14 = org.telegram.ui.ActionBar.m6.Ei;
                    int x03 = org.telegram.ui.ActionBar.m6.x0(null, i14, false);
                    y k02 = org.telegram.ui.ActionBar.m6.k0(L, L, L, L, x02, x03, x03);
                    org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i13);
                    org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i14);
                    textView2.setBackground(k02);
                    org.telegram.ui.ActionBar.t6.j(textView2, k02, M, M2, null);
                    linearLayout.addView(textView2, c8.ha.t(-1, 48, 0, 16, 12, 16, 8));
                    h.N = linearLayout;
                    h.show();
                    textView2.setOnClickListener(new org.telegram.ui.Components.x2(h, i11));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ka(zw zwVar, boolean z9, int i7, ArrayList arrayList) {
        this.d = zwVar;
        this.b = z9;
        this.c = i7;
        this.e = arrayList;
    }
}
