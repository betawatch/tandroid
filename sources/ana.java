// default package

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ana extends n7c {
    public zma e;
    public zma[] f = new zma[0];
    public String[] h = new String[0];
    public final yma n = new yma(this, 0);

    @Override // n7c
    public final void Z(ArrayList arrayList, l7c l7cVar) {
        c6c i = c6c.i(6, jb6.M0(2131744982, null));
        byte b = 1;
        i.L(oc7.d1().getBoolean("asr_live_text", true));
        arrayList.add(i);
        arrayList.add(c6c.C(jb6.M0(2131744981, null)));
        int i2 = 0;
        if (DictationAsr.C(this.currentAccount)) {
            c6c i3 = c6c.i(2, jb6.M0(2131744979, null));
            i3.L(DictationAsr.B(this.currentAccount));
            arrayList.add(i3);
            String M0 = jb6.M0(2131744978, null);
            yma ymaVar = new yma(this, b);
            String M02 = jb6.M0(2131744987, null);
            int i4 = cmb.p6;
            SpannableStringBuilder N2 = gm.N2(M02, i4, 0, ymaVar, null);
            SpannableString spannableString = new SpannableString(">");
            pn2 pn2Var = new pn2(R.drawable.msg_arrowright, 0);
            pn2Var.a(i4);
            pn2Var.c(gm.L(18.0f));
            pn2Var.F = gm.L(11.0f);
            pn2Var.r = -gm.L(5.0f);
            spannableString.setSpan(pn2Var, 0, spannableString.length(), 33);
            SpannableStringBuilder G2 = gm.G2(N2, spannableString, ">");
            for (ClickableSpan clickableSpan : (ClickableSpan[]) G2.getSpans(0, G2.length(), ClickableSpan.class)) {
                int spanStart = G2.getSpanStart(clickableSpan);
                int spanFlags = G2.getSpanFlags(clickableSpan);
                G2.removeSpan(clickableSpan);
                G2.setSpan(clickableSpan, spanStart, G2.length(), spanFlags);
            }
            arrayList.add(c6c.C(TextUtils.concat(M0, " ", G2)));
        }
        aq1.o(2131744988, null, arrayList);
        zma zmaVar = this.e;
        if (zmaVar != null) {
            arrayList.add(c6c.j(1, zmaVar));
        }
        while (true) {
            zma[] zmaVarArr = this.f;
            if (i2 >= zmaVarArr.length) {
                arrayList.add(c6c.C(null));
                boolean z = e21.a;
                c6c e = c6c.e(4, jb6.M0(2131744997, null));
                e.s = true;
                arrayList.add(e);
                c6c e2 = c6c.e(5, jb6.M0(2131744996, null));
                e2.s = true;
                arrayList.add(e2);
                arrayList.add(c6c.C(null));
                e0();
                return;
            }
            zma zmaVar2 = zmaVarArr[i2];
            if (zmaVar2 != null) {
                arrayList.add(c6c.j(i2 + 100, zmaVar2));
            }
            i2++;
        }
    }

    @Override // n7c
    public final CharSequence a0() {
        return jb6.M0(2131744965, null);
    }

    @Override // n7c
    public final void b0(c6c c6cVar, View view) {
        int i = c6cVar.d;
        if (i == 2) {
            oc7.d1().edit().putBoolean(z8c.h(this.currentAccount).p() ? "asr_local_premium" : "asr_local_free", !DictationAsr.B(r9)).apply();
            for (int i2 = 0; i2 < 4; i2++) {
                if (z8c.h(i2).o()) {
                    nm7.f(i2).k(nm7.E1, new Object[0]);
                }
            }
        } else {
            if (i == 4) {
                DictationAsr.p();
                e0();
                return;
            }
            byte b = 6;
            if (i == 5) {
                int i3 = 0;
                while (i3 < 4) {
                    if (z8c.h(i3).o()) {
                        boolean z = i3 == this.currentAccount;
                        cf7 Y = cf7.Y(i3);
                        Y.a.c(new q87(Y, new ra(b, this, z), (byte) 19));
                    }
                    i3++;
                }
                return;
            }
            if (i != 6) {
                return;
            } else {
                oc7.d1().edit().putBoolean("asr_live_text", !oc7.d1().getBoolean("asr_live_text", true)).apply();
            }
        }
        this.a.g3.O(true);
    }

    @Override // n7c
    public final boolean c0(c6c c6cVar, View view) {
        return false;
    }

    @Override // n7c, org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        setHasOwnBackground(true);
        zma zmaVar = new zma(context, null, jb6.M0(2131744998, null), null, true);
        this.e = zmaVar;
        zmaVar.setOnClickListener(new oha(this, (byte) 2));
        d0(context);
        this.fragmentView = super.createView(context);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        DictationAsr.i(this.n);
        jo3.j();
        return this.fragmentView;
    }

    public final void d0(Context context) {
        String[] G = DictationAsr.G();
        this.h = G;
        this.f = new zma[G.length];
        int i = 0;
        while (i < G.length) {
            gn3 L = DictationAsr.L(G[i]);
            boolean z = i == 0 || DictationAsr.L(G[i + (-1)]) != L;
            boolean z2 = i < G.length - 1 && DictationAsr.L(G[i + 1]) != L;
            String r = un3.r(G[i]);
            zma[] zmaVarArr = this.f;
            String str = G[i];
            zma zmaVar = new zma(context, str, r != null ? r : str, (!z || L.e <= 0) ? null : gm.i0(L.e, false, false), z2);
            zmaVarArr[i] = zmaVar;
            byte b = 10;
            zmaVar.a0 = new e6a(this, zmaVar, b);
            zmaVar.setOnClickListener(new r39(this, zmaVar, b));
            i++;
        }
    }

    public final void e0() {
        zma zmaVar = this.e;
        if (zmaVar != null) {
            zmaVar.c();
        }
        for (zma zmaVar2 : this.f) {
            if (zmaVar2 != null) {
                zmaVar2.c();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final r59 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        DictationAsr.T(this.n);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
