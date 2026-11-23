package ai;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.rq;
import org.telegram.messenger.s2;
import org.telegram.messenger.tr;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.d51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class r2 extends d51 {
    public q2 e;
    public q2[] f = new q2[0];
    public String[] h = new String[0];
    public final n2 n = new n2(this, 0);

    @Override // org.telegram.ui.Components.d51
    public final void Z(ArrayList arrayList, b51 b51Var) {
        n41 i7 = n41.i(6, gd.N0(2131745052, null));
        int i10 = 1;
        i7.L(mp.g1().getBoolean("asr_live_text", true));
        arrayList.add(i7);
        arrayList.add(n41.C(gd.N0(2131745051, null)));
        int i11 = 0;
        if (DictationAsr.E(this.currentAccount)) {
            n41 i12 = n41.i(2, gd.N0(2131745049, null));
            i12.L(DictationAsr.D(this.currentAccount));
            arrayList.add(i12);
            String N0 = gd.N0(2131745048, null);
            n2 n2Var = new n2(this, i10);
            String N02 = gd.N0(2131745057, null);
            int i13 = n6.q6;
            SpannableStringBuilder R2 = org.telegram.messenger.g0.R2(N02, i13, 0, n2Var, null);
            SpannableString spannableString = new SpannableString(">");
            kq kqVar = new kq(R.drawable.msg_arrowright, 0);
            kqVar.a(i13);
            kqVar.c(org.telegram.messenger.g0.L(18.0f));
            kqVar.F = org.telegram.messenger.g0.L(11.0f);
            kqVar.r = -org.telegram.messenger.g0.L(5.0f);
            spannableString.setSpan(kqVar, 0, spannableString.length(), 33);
            SpannableStringBuilder K2 = org.telegram.messenger.g0.K2(R2, spannableString, ">");
            for (ClickableSpan clickableSpan : (ClickableSpan[]) K2.getSpans(0, K2.length(), ClickableSpan.class)) {
                int spanStart = K2.getSpanStart(clickableSpan);
                int spanFlags = K2.getSpanFlags(clickableSpan);
                K2.removeSpan(clickableSpan);
                K2.setSpan(clickableSpan, spanStart, K2.length(), spanFlags);
            }
            arrayList.add(n41.C(TextUtils.concat(N0, " ", K2)));
        }
        i5.c.s(2131745058, null, arrayList);
        q2 q2Var = this.e;
        if (q2Var != null) {
            arrayList.add(n41.j(1, q2Var));
        }
        while (true) {
            q2[] q2VarArr = this.f;
            if (i11 >= q2VarArr.length) {
                arrayList.add(n41.C(null));
                boolean z10 = s2.a;
                n41 e10 = n41.e(4, gd.N0(2131745067, null));
                e10.s = true;
                arrayList.add(e10);
                n41 e11 = n41.e(5, gd.N0(2131745066, null));
                e11.s = true;
                arrayList.add(e11);
                arrayList.add(n41.C(null));
                e0();
                return;
            }
            q2 q2Var2 = q2VarArr[i11];
            if (q2Var2 != null) {
                arrayList.add(n41.j(i11 + 100, q2Var2));
            }
            i11++;
        }
    }

    @Override // org.telegram.ui.Components.d51
    public final CharSequence a0() {
        return gd.N0(2131745035, null);
    }

    @Override // org.telegram.ui.Components.d51
    public final void b0(n41 n41Var, View view) {
        int i7 = n41Var.d;
        if (i7 == 2) {
            mp.g1().edit().putBoolean(i10.i(this.currentAccount).q() ? "asr_local_premium" : "asr_local_free", !DictationAsr.D(r8)).apply();
            for (int i10 = 0; i10 < 4; i10++) {
                if (i10.i(i10).p()) {
                    ks.f(i10).k(ks.E1, new Object[0]);
                }
            }
        } else {
            if (i7 == 4) {
                DictationAsr.s();
                e0();
                return;
            }
            if (i7 == 5) {
                int i11 = 0;
                while (i11 < 4) {
                    if (i10.i(i11).p()) {
                        boolean z10 = i11 == this.currentAccount;
                        tr a02 = tr.a0(i11);
                        a02.a.c(new rq(0, a02, new o2(0, this, z10)));
                    }
                    i11++;
                }
                return;
            }
            if (i7 != 6) {
                return;
            } else {
                mp.g1().edit().putBoolean("asr_live_text", !mp.g1().getBoolean("asr_live_text", true)).apply();
            }
        }
        this.a.g3.O(true);
    }

    @Override // org.telegram.ui.Components.d51
    public final boolean c0(n41 n41Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.d51, org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        q2 q2Var = new q2(context, null, gd.N0(2131745068, null), null, true);
        this.e = q2Var;
        q2Var.setOnClickListener(new ah.d(this, 1));
        d0(context);
        this.fragmentView = super.createView(context);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        DictationAsr.l(this.n);
        h1.j();
        return this.fragmentView;
    }

    public final void d0(Context context) {
        String[] H = DictationAsr.H();
        this.h = H;
        this.f = new q2[H.length];
        int i7 = 0;
        while (i7 < H.length) {
            q M = DictationAsr.M(H[i7]);
            boolean z10 = i7 == 0 || DictationAsr.M(H[i7 + (-1)]) != M;
            boolean z11 = i7 < H.length - 1 && DictationAsr.M(H[i7 + 1]) != M;
            String o4 = l0.o(H[i7]);
            q2[] q2VarArr = this.f;
            String str = H[i7];
            q2 q2Var = new q2(context, str, o4 != null ? o4 : str, (!z10 || M.e <= 0) ? null : org.telegram.messenger.g0.i0(M.e, false, false), z11);
            q2VarArr[i7] = q2Var;
            q2Var.a0 = new a1.e(19, this, q2Var);
            q2Var.setOnClickListener(new p2(0, this, q2Var));
            i7++;
        }
    }

    public final void e0() {
        q2 q2Var = this.e;
        if (q2Var != null) {
            q2Var.c();
        }
        for (q2 q2Var2 : this.f) {
            if (q2Var2 != null) {
                q2Var2.c();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final ek0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        DictationAsr.U(this.n);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
