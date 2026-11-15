package ai;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.p21;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class v2 extends r41 {
    public u2 e;
    public u2[] f = new u2[0];
    public String[] h = new String[0];
    public final s2 n = new s2(this, 0);

    @Override // org.telegram.ui.Components.r41
    public final void Z(ArrayList arrayList, p41 p41Var) {
        int i7 = 0;
        int i10 = 1;
        if (DictationAsr.A()) {
            b41 i11 = b41.i(2, "On-device transcription");
            i11.L(DictationAsr.z(this.currentAccount));
            arrayList.add(i11);
            s2 s2Var = new s2(this, i10);
            int i12 = j6.q6;
            SpannableStringBuilder S2 = org.telegram.messenger.g0.S2("**Learn more** >", i12, 0, s2Var, null);
            SpannableString spannableString = new SpannableString(">");
            eq eqVar = new eq(R.drawable.msg_arrowright, 0);
            eqVar.a(i12);
            eqVar.c(org.telegram.messenger.g0.L(18.0f));
            eqVar.F = org.telegram.messenger.g0.L(11.0f);
            eqVar.r = -org.telegram.messenger.g0.L(5.0f);
            spannableString.setSpan(eqVar, 0, spannableString.length(), 33);
            arrayList.add(b41.C(TextUtils.concat("Voice messages are transcribed on this phone. Private: nothing leaves it. ", org.telegram.messenger.g0.K2(S2, spannableString, ">"))));
        }
        arrayList.add(b41.u("Languages"));
        u2 u2Var = this.e;
        if (u2Var != null) {
            arrayList.add(b41.j(1, u2Var));
        }
        while (true) {
            u2[] u2VarArr = this.f;
            if (i7 >= u2VarArr.length) {
                arrayList.add(b41.C(null));
                b41 i13 = b41.i(3, "Fallback to Google");
                i13.L(DictationAsr.x());
                arrayList.add(i13);
                arrayList.add(b41.C("For other languages, app can use system speech recognition. This might send your voice data to Google or other vendor servers."));
                boolean z10 = org.telegram.messenger.r2.a;
                b41 e10 = b41.e(4, "Delete all models");
                e10.r = true;
                arrayList.add(e10);
                arrayList.add(b41.C(null));
                e0();
                return;
            }
            u2 u2Var2 = u2VarArr[i7];
            if (u2Var2 != null) {
                arrayList.add(b41.j(i7 + 100, u2Var2));
            }
            i7++;
        }
    }

    @Override // org.telegram.ui.Components.r41
    public final CharSequence a0() {
        return "Speech to Text";
    }

    @Override // org.telegram.ui.Components.r41
    public final void b0(b41 b41Var, View view) {
        int i7 = b41Var.d;
        if (i7 == 2) {
            np.e1().edit().putBoolean(m10.i(this.currentAccount).q() ? "asr_local_premium" : "asr_local_free", !DictationAsr.z(r6)).apply();
            for (int i10 = 0; i10 < 4; i10++) {
                if (m10.i(i10).p()) {
                    ns.f(i10).k(ns.E1, new Object[0]);
                }
            }
        } else {
            if (i7 != 3) {
                if (i7 != 4) {
                    return;
                }
                DictationAsr.q();
                e0();
                return;
            }
            np.e1().edit().putBoolean("asr_google", !DictationAsr.x()).apply();
        }
        this.a.g3.O(true);
    }

    @Override // org.telegram.ui.Components.r41
    public final boolean c0(b41 b41Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.r41, org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        u2 u2Var = new u2(context, null, "Auto-Detect", null, true);
        this.e = u2Var;
        u2Var.setOnClickListener(new ah.d(this, 1));
        d0(context);
        this.fragmentView = super.createView(context);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        DictationAsr.g.add(this.n);
        CountDownLatch e10 = i1.e();
        if (e10 != null) {
            new Thread(new e1(e10, 0), "DictationModels").start();
        }
        return this.fragmentView;
    }

    public final void d0(Context context) {
        String[] C = DictationAsr.C();
        this.h = C;
        this.f = new u2[C.length];
        int i7 = 0;
        while (i7 < C.length) {
            s H = DictationAsr.H(C[i7]);
            boolean z10 = i7 == 0 || DictationAsr.H(C[i7 + (-1)]) != H;
            boolean z11 = i7 < C.length - 1 && DictationAsr.H(C[i7 + 1]) != H;
            String P0 = p21.P0(C[i7]);
            u2[] u2VarArr = this.f;
            String str = C[i7];
            u2 u2Var = new u2(context, str, P0 != null ? P0 : str, (!z10 || H.c <= 0) ? null : org.telegram.messenger.g0.i0(H.c, false, false), z11);
            u2VarArr[i7] = u2Var;
            u2Var.setOnClickListener(new t2(0, this, u2Var));
            i7++;
        }
    }

    public final void e0() {
        u2 u2Var = this.e;
        if (u2Var != null) {
            u2Var.b();
        }
        for (u2 u2Var2 : this.f) {
            if (u2Var2 != null) {
                u2Var2.b();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final uj0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        DictationAsr.N(this.n);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
