package ai;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.sq;
import org.telegram.messenger.ur;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class a3 extends e51 {
    public z2 e;
    public z2[] f = new z2[0];
    public String[] h = new String[0];
    public final w2 n = new w2(this, 0);

    @Override // org.telegram.ui.Components.e51
    public final void Z(ArrayList arrayList, c51 c51Var) {
        o41 i7 = o41.i(6, hd.N0(2131745050, null));
        int i10 = 1;
        i7.L(np.g1().getBoolean("asr_live_text", true));
        arrayList.add(i7);
        arrayList.add(o41.C(hd.N0(2131745049, null)));
        if (DictationAsr.w(this.currentAccount) && m1.h()) {
            o41 i11 = o41.i(2, hd.N0(2131745047, null));
            i11.L(DictationAsr.B(this.currentAccount));
            arrayList.add(i11);
            String N0 = hd.N0(2131745046, null);
            w2 w2Var = new w2(this, i10);
            String N02 = hd.N0(2131745055, null);
            int i12 = m6.q6;
            SpannableStringBuilder R2 = org.telegram.messenger.g0.R2(N02, i12, 0, w2Var, null);
            SpannableString spannableString = new SpannableString(">");
            nq nqVar = new nq(R.drawable.msg_arrowright, 0);
            nqVar.a(i12);
            nqVar.c(org.telegram.messenger.g0.L(18.0f));
            nqVar.F = org.telegram.messenger.g0.L(11.0f);
            nqVar.r = -org.telegram.messenger.g0.L(5.0f);
            spannableString.setSpan(nqVar, 0, spannableString.length(), 33);
            SpannableStringBuilder K2 = org.telegram.messenger.g0.K2(R2, spannableString, ">");
            for (ClickableSpan clickableSpan : (ClickableSpan[]) K2.getSpans(0, K2.length(), ClickableSpan.class)) {
                int spanStart = K2.getSpanStart(clickableSpan);
                int spanFlags = K2.getSpanFlags(clickableSpan);
                K2.removeSpan(clickableSpan);
                K2.setSpan(clickableSpan, spanStart, K2.length(), spanFlags);
            }
            arrayList.add(o41.C(TextUtils.concat(N0, " ", K2)));
        }
        i5.c.s(2131745056, null, arrayList);
        z2 z2Var = this.e;
        if (z2Var != null) {
            arrayList.add(o41.j(1, z2Var));
        }
        int i13 = 0;
        while (true) {
            z2[] z2VarArr = this.f;
            if (i13 >= z2VarArr.length) {
                arrayList.add(o41.C(null));
                o41 i14 = o41.i(3, hd.N0(2131745058, null));
                i14.L(np.g1().getBoolean("asr_google", false));
                arrayList.add(i14);
                arrayList.add(o41.C(hd.N0(2131745057, null)));
                boolean z10 = org.telegram.messenger.s2.a;
                o41 e10 = o41.e(4, hd.N0(2131745067, null));
                e10.s = true;
                arrayList.add(e10);
                o41 e11 = o41.e(5, hd.N0(2131745066, null));
                e11.s = true;
                arrayList.add(e11);
                arrayList.add(o41.C(null));
                e0();
                return;
            }
            z2 z2Var2 = z2VarArr[i13];
            if (z2Var2 != null) {
                arrayList.add(o41.j(i13 + 100, z2Var2));
            }
            i13++;
        }
    }

    @Override // org.telegram.ui.Components.e51
    public final CharSequence a0() {
        return hd.N0(2131745033, null);
    }

    @Override // org.telegram.ui.Components.e51
    public final void b0(o41 o41Var, View view) {
        int i7 = o41Var.d;
        int i10 = 0;
        if (i7 == 2) {
            np.g1().edit().putBoolean(k10.i(this.currentAccount).q() ? "asr_local_premium" : "asr_local_free", !DictationAsr.B(r7)).apply();
            for (int i11 = 0; i11 < 4; i11++) {
                if (k10.i(i11).p()) {
                    ls.f(i11).k(ls.E1, new Object[0]);
                }
            }
        } else if (i7 == 3) {
            t[] tVarArr = DictationAsr.a;
            np.g1().edit().putBoolean("asr_google", !np.g1().getBoolean("asr_google", false)).apply();
        } else {
            if (i7 == 4) {
                DictationAsr.r();
                e0();
                return;
            }
            if (i7 == 5) {
                int i12 = 0;
                while (i12 < 4) {
                    if (k10.i(i12).p()) {
                        boolean z10 = i12 == this.currentAccount;
                        ur a02 = ur.a0(i12);
                        a02.a.c(new sq(i10, a02, new x2(i10, this, z10)));
                    }
                    i12++;
                }
                return;
            }
            if (i7 != 6) {
                return;
            } else {
                np.g1().edit().putBoolean("asr_live_text", !np.g1().getBoolean("asr_live_text", true)).apply();
            }
        }
        this.a.g3.O(true);
    }

    @Override // org.telegram.ui.Components.e51
    public final boolean c0(o41 o41Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.e51, org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        z2 z2Var = new z2(context, null, hd.N0(2131745068, null), null, true);
        this.e = z2Var;
        z2Var.setOnClickListener(new ah.d(this, 1));
        d0(context);
        this.fragmentView = super.createView(context);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        DictationAsr.g.add(this.n);
        m1.j();
        return this.fragmentView;
    }

    public final void d0(Context context) {
        String[] E = DictationAsr.E();
        this.h = E;
        this.f = new z2[E.length];
        int i7 = 0;
        while (i7 < E.length) {
            t J = DictationAsr.J(E[i7]);
            boolean z10 = i7 == 0 || DictationAsr.J(E[i7 + (-1)]) != J;
            boolean z11 = i7 < E.length - 1 && DictationAsr.J(E[i7 + 1]) != J;
            String q10 = p0.q(E[i7]);
            z2[] z2VarArr = this.f;
            String str = E[i7];
            z2 z2Var = new z2(context, str, q10 != null ? q10 : str, (!z10 || J.e <= 0) ? null : org.telegram.messenger.g0.i0(J.e, false, false), z11);
            z2VarArr[i7] = z2Var;
            z2Var.a0 = new a1.e(19, this, z2Var);
            z2Var.setOnClickListener(new y2(0, this, z2Var));
            i7++;
        }
    }

    public final void e0() {
        z2 z2Var = this.e;
        if (z2Var != null) {
            z2Var.c();
        }
        for (z2 z2Var2 : this.f) {
            if (z2Var2 != null) {
                z2Var2.c();
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
        DictationAsr.R(this.n);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
