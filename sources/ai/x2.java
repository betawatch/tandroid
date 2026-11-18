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
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.rq;
import org.telegram.messenger.tr;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.y21;
import org.telegram.ui.Components.z41;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class x2 extends b51 {
    public w2 e;
    public w2[] f = new w2[0];
    public String[] h = new String[0];
    public final t2 n = new t2(this, 0);

    @Override // org.telegram.ui.Components.b51
    public final void Z(ArrayList arrayList, z41 z41Var) {
        int i7 = 0;
        int i10 = 1;
        if (DictationAsr.u(this.currentAccount) && j1.h()) {
            l41 i11 = l41.i(2, gd.M0(2131745055, null));
            i11.L(DictationAsr.z(this.currentAccount));
            arrayList.add(i11);
            String M0 = gd.M0(2131745054, null);
            t2 t2Var = new t2(this, i10);
            String M02 = gd.M0(2131745061, null);
            int i12 = n6.q6;
            SpannableStringBuilder R2 = org.telegram.messenger.g0.R2(M02, i12, 0, t2Var, null);
            SpannableString spannableString = new SpannableString(">");
            lq lqVar = new lq(R.drawable.msg_arrowright, 0);
            lqVar.a(i12);
            lqVar.c(org.telegram.messenger.g0.L(18.0f));
            lqVar.F = org.telegram.messenger.g0.L(11.0f);
            lqVar.r = -org.telegram.messenger.g0.L(5.0f);
            spannableString.setSpan(lqVar, 0, spannableString.length(), 33);
            SpannableStringBuilder K2 = org.telegram.messenger.g0.K2(R2, spannableString, ">");
            for (ClickableSpan clickableSpan : (ClickableSpan[]) K2.getSpans(0, K2.length(), ClickableSpan.class)) {
                int spanStart = K2.getSpanStart(clickableSpan);
                int spanFlags = K2.getSpanFlags(clickableSpan);
                K2.removeSpan(clickableSpan);
                K2.setSpan(clickableSpan, spanStart, K2.length(), spanFlags);
            }
            arrayList.add(l41.C(TextUtils.concat(M0, " ", K2)));
        }
        i5.c.s(2131745062, null, arrayList);
        w2 w2Var = this.e;
        if (w2Var != null) {
            arrayList.add(l41.j(1, w2Var));
        }
        while (true) {
            w2[] w2VarArr = this.f;
            if (i7 >= w2VarArr.length) {
                arrayList.add(l41.C(null));
                l41 i13 = l41.i(3, gd.M0(2131745064, null));
                i13.L(DictationAsr.x());
                arrayList.add(i13);
                arrayList.add(l41.C(gd.M0(2131745063, null)));
                boolean z10 = org.telegram.messenger.s2.a;
                l41 e10 = l41.e(4, gd.M0(2131745073, null));
                e10.s = true;
                arrayList.add(e10);
                l41 e11 = l41.e(5, gd.M0(2131745072, null));
                e11.s = true;
                arrayList.add(e11);
                arrayList.add(l41.C(null));
                e0();
                return;
            }
            w2 w2Var2 = w2VarArr[i7];
            if (w2Var2 != null) {
                arrayList.add(l41.j(i7 + 100, w2Var2));
            }
            i7++;
        }
    }

    @Override // org.telegram.ui.Components.b51
    public final CharSequence a0() {
        return gd.M0(2131745041, null);
    }

    @Override // org.telegram.ui.Components.b51
    public final void b0(l41 l41Var, View view) {
        int i7 = l41Var.d;
        if (i7 == 2) {
            mp.g1().edit().putBoolean(j10.i(this.currentAccount).q() ? "asr_local_premium" : "asr_local_free", !DictationAsr.z(r8)).apply();
            for (int i10 = 0; i10 < 4; i10++) {
                if (j10.i(i10).p()) {
                    ks.f(i10).k(ks.E1, new Object[0]);
                }
            }
        } else {
            if (i7 != 3) {
                if (i7 == 4) {
                    DictationAsr.p();
                    e0();
                    return;
                } else {
                    if (i7 != 5) {
                        return;
                    }
                    int i11 = 0;
                    while (i11 < 4) {
                        if (j10.i(i11).p()) {
                            boolean z10 = i11 == this.currentAccount;
                            tr a02 = tr.a0(i11);
                            a02.a.c(new rq(0, a02, new u2(0, this, z10)));
                        }
                        i11++;
                    }
                    return;
                }
            }
            mp.g1().edit().putBoolean("asr_google", !DictationAsr.x()).apply();
        }
        this.a.g3.O(true);
    }

    @Override // org.telegram.ui.Components.b51
    public final boolean c0(l41 l41Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.b51, org.telegram.ui.ActionBar.h2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        w2 w2Var = new w2(context, null, gd.M0(2131745074, null), null, true);
        this.e = w2Var;
        w2Var.setOnClickListener(new ah.d(this, 1));
        d0(context);
        this.fragmentView = super.createView(context);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        DictationAsr.g.add(this.n);
        j1.j();
        return this.fragmentView;
    }

    public final void d0(Context context) {
        String[] C = DictationAsr.C();
        this.h = C;
        this.f = new w2[C.length];
        int i7 = 0;
        while (i7 < C.length) {
            t H = DictationAsr.H(C[i7]);
            boolean z10 = i7 == 0 || DictationAsr.H(C[i7 + (-1)]) != H;
            boolean z11 = i7 < C.length - 1 && DictationAsr.H(C[i7 + 1]) != H;
            String Q0 = y21.Q0(C[i7]);
            w2[] w2VarArr = this.f;
            String str = C[i7];
            w2 w2Var = new w2(context, str, Q0 != null ? Q0 : str, (!z10 || H.c <= 0) ? null : org.telegram.messenger.g0.i0(H.c, false, false), z11);
            w2VarArr[i7] = w2Var;
            w2Var.setOnClickListener(new v2(0, this, w2Var));
            i7++;
        }
    }

    public final void e0() {
        w2 w2Var = this.e;
        if (w2Var != null) {
            w2Var.b();
        }
        for (w2 w2Var2 : this.f) {
            if (w2Var2 != null) {
                w2Var2.b();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final ck0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onFragmentDestroy() {
        DictationAsr.N(this.n);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
