package org.telegram.ui.Cells;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.wp;
import org.telegram.ui.uw;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ka implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 d;
    public final /* synthetic */ Serializable e;

    public /* synthetic */ ka(wm wmVar, TLRPC.User user, String str, boolean z10, int i3) {
        this.d = wmVar;
        this.e = str;
        this.b = z10;
        this.c = i3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i3 = this.a;
        int i10 = this.c;
        boolean z10 = this.b;
        Serializable serializable = this.e;
        org.telegram.ui.ActionBar.d2 d2Var = this.d;
        int i11 = 0;
        switch (i3) {
            case 0:
                uw uwVar = (uw) d2Var;
                ArrayList arrayList = (ArrayList) serializable;
                String M0 = bd.M0(2131743917, null);
                int i12 = org.telegram.ui.ActionBar.k6.uj;
                SpannableStringBuilder S2 = org.telegram.messenger.g0.S2(M0, i12, 0, new f(uwVar, 11), null);
                SpannableString spannableString = new SpannableString(">");
                wp wpVar = new wp(R.drawable.attach_arrow_right, 0);
                wpVar.y = org.telegram.ui.ActionBar.k6.x0(null, i12, false);
                wpVar.I = 0.7f;
                wpVar.J = 0.7f;
                wpVar.F = org.telegram.messenger.g0.L(12.0f);
                spannableString.setSpan(wpVar, 0, spannableString.length(), 33);
                org.telegram.messenger.g0.K2(S2, spannableString, ">");
                fc.a0(uwVar).I(R.raw.contact_check, bd.M0(z10 ? 2131743918 : 2131743919, null), S2).j();
                hp.s1(i10).U1().f(true, arrayList, new ei.e(8));
                hp.s1(i10).U1().a();
                break;
            default:
                wm wmVar = (wm) d2Var;
                String str = (String) serializable;
                Pattern pattern = org.telegram.ui.Components.t4.a;
                if (wmVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.t2 h = org.telegram.messenger.camera.q.h(wmVar.getParentActivity(), false, 1, null);
                    h.P = bd.M0(z10 ? 2131752194 : 2131752193, null);
                    h.Q = true;
                    LinearLayout linearLayout = new LinearLayout(wmVar.getParentActivity());
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(wmVar.getParentActivity());
                    linearLayout.addView(textView, mf.t(-1, -1, 0, 21, 0, 21, 8));
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
                    textView.setTextSize(1, 16.0f);
                    textView.setText(org.telegram.messenger.g0.X2(bd.a0("ChatWithAdminMessage", null, 2131752192, str, bd.s(i10, false))));
                    TextView textView2 = new TextView(wmVar.getParentActivity());
                    textView2.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                    textView2.setGravity(17);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTypeface(org.telegram.messenger.g0.o());
                    textView2.setText(bd.M0(2131749282, null));
                    org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.Gi, null);
                    int L = org.telegram.messenger.g0.L(8.0f);
                    int i13 = org.telegram.ui.ActionBar.k6.Ci;
                    int x02 = org.telegram.ui.ActionBar.k6.x0(null, i13, false);
                    int i14 = org.telegram.ui.ActionBar.k6.Ei;
                    int x03 = org.telegram.ui.ActionBar.k6.x0(null, i14, false);
                    y k02 = org.telegram.ui.ActionBar.k6.k0(L, L, L, L, x02, x03, x03);
                    org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i13);
                    org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i14);
                    textView2.setBackground(k02);
                    org.telegram.ui.ActionBar.r6.k(textView2, k02, N, N2, null);
                    linearLayout.addView(textView2, mf.t(-1, 48, 0, 16, 12, 16, 8));
                    h.O = linearLayout;
                    h.show();
                    textView2.setOnClickListener(new org.telegram.ui.Components.w2(h, i11));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ka(uw uwVar, boolean z10, int i3, ArrayList arrayList) {
        this.d = uwVar;
        this.b = z10;
        this.c = i3;
        this.e = arrayList;
    }
}
