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
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class z2 extends e51 {
    public y2 e;
    public y2[] f = new y2[0];
    public String[] h = new String[0];
    public final v2 n = new v2(this, 0);

    @Override // org.telegram.ui.Components.e51
    public final void Z(ArrayList arrayList, c51 c51Var) {
        int i7 = 0;
        int i10 = 1;
        if (DictationAsr.w(this.currentAccount) && l1.h()) {
            o41 i11 = o41.i(2, gd.N0(2131745049, null));
            i11.L(DictationAsr.B(this.currentAccount));
            arrayList.add(i11);
            String N0 = gd.N0(2131745048, null);
            v2 v2Var = new v2(this, i10);
            String N02 = gd.N0(2131745055, null);
            int i12 = m6.q6;
            SpannableStringBuilder R2 = org.telegram.messenger.g0.R2(N02, i12, 0, v2Var, null);
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
        y2 y2Var = this.e;
        if (y2Var != null) {
            arrayList.add(o41.j(1, y2Var));
        }
        while (true) {
            y2[] y2VarArr = this.f;
            if (i7 >= y2VarArr.length) {
                arrayList.add(o41.C(null));
                o41 i13 = o41.i(3, gd.N0(2131745058, null));
                i13.L(DictationAsr.z());
                arrayList.add(i13);
                arrayList.add(o41.C(gd.N0(2131745057, null)));
                boolean z10 = org.telegram.messenger.s2.a;
                o41 e10 = o41.e(4, gd.N0(2131745067, null));
                e10.s = true;
                arrayList.add(e10);
                o41 e11 = o41.e(5, gd.N0(2131745066, null));
                e11.s = true;
                arrayList.add(e11);
                arrayList.add(o41.C(null));
                e0();
                return;
            }
            y2 y2Var2 = y2VarArr[i7];
            if (y2Var2 != null) {
                arrayList.add(o41.j(i7 + 100, y2Var2));
            }
            i7++;
        }
    }

    @Override // org.telegram.ui.Components.e51
    public final CharSequence a0() {
        return gd.N0(2131745035, null);
    }

    @Override // org.telegram.ui.Components.e51
    public final void b0(o41 o41Var, View view) {
        int i7 = o41Var.d;
        if (i7 == 2) {
            mp.g1().edit().putBoolean(j10.i(this.currentAccount).q() ? "asr_local_premium" : "asr_local_free", !DictationAsr.B(r8)).apply();
            for (int i10 = 0; i10 < 4; i10++) {
                if (j10.i(i10).p()) {
                    ks.f(i10).k(ks.E1, new Object[0]);
                }
            }
        } else {
            if (i7 != 3) {
                if (i7 == 4) {
                    DictationAsr.r();
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
                            a02.a.c(new rq(0, a02, new w2(0, this, z10)));
                        }
                        i11++;
                    }
                    return;
                }
            }
            mp.g1().edit().putBoolean("asr_google", !DictationAsr.z()).apply();
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
        y2 y2Var = new y2(context, null, gd.N0(2131745068, null), null, true);
        this.e = y2Var;
        y2Var.setOnClickListener(new ah.d(this, 1));
        d0(context);
        this.fragmentView = super.createView(context);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        DictationAsr.g.add(this.n);
        l1.j();
        return this.fragmentView;
    }

    public final void d0(Context context) {
        String[] E = DictationAsr.E();
        this.h = E;
        this.f = new y2[E.length];
        int i7 = 0;
        while (i7 < E.length) {
            t J = DictationAsr.J(E[i7]);
            boolean z10 = i7 == 0 || DictationAsr.J(E[i7 + (-1)]) != J;
            boolean z11 = i7 < E.length - 1 && DictationAsr.J(E[i7 + 1]) != J;
            String q10 = p0.q(E[i7]);
            y2[] y2VarArr = this.f;
            String str = E[i7];
            y2 y2Var = new y2(context, str, q10 != null ? q10 : str, (!z10 || J.e <= 0) ? null : org.telegram.messenger.g0.i0(J.e, false, false), z11);
            y2VarArr[i7] = y2Var;
            y2Var.a0 = new a1.e(19, this, y2Var);
            y2Var.setOnClickListener(new x2(0, this, y2Var));
            i7++;
        }
    }

    public final void e0() {
        y2 y2Var = this.e;
        if (y2Var != null) {
            y2Var.c();
        }
        for (y2 y2Var2 : this.f) {
            if (y2Var2 != null) {
                y2Var2.c();
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
