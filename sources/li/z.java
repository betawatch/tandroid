package li;

import a8.m7;
import android.content.Context;
import android.text.SpannableStringBuilder;
import bi.x4;
import c8.ja;
import hi.p5;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.m5;
import org.telegram.messenger.t3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.t8;
import org.telegram.ui.Components.u41;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class z extends b0 {
    public final i9 h;
    public final t8 n;
    public final /* synthetic */ d0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(d0 d0Var, Context context) {
        super(d0Var, context);
        this.r = d0Var;
        int i7 = 4;
        u41 u41Var = new u41(context, d0Var.a, 0, false, new s(d0Var, i7), new t(d0Var, 3), new t(d0Var, i7), d0Var.J0);
        this.d = u41Var;
        u41Var.r1();
        u41 u41Var2 = this.d;
        u41Var2.g3.r = false;
        u41Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, org.telegram.messenger.g0.L(60.0f) + org.telegram.messenger.g0.n);
        org.telegram.messenger.g0.E2(this.b);
        this.c.addView(d0Var.A1, ja.g());
        this.c.addView(this.d, ja.g());
        this.c.addView(d0Var.C1, ja.g());
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, d0Var.J0);
        this.a = kVar;
        kVar.setOccupyStatusBar(false);
        q6.l(this.a, 5, j6.G6, d0Var.J0);
        q6.l(this.a, 3, j6.z8, d0Var.J0);
        this.a.setBackButtonImage(R.drawable.ic_ab_back);
        q6.l(this.a, 1, j6.y8, d0Var.J0);
        this.a.setTitle(m5.m(d0Var.q1));
        this.a.getTitleTextView().setTranslationX(-org.telegram.messenger.g0.L(18.0f));
        this.a.setActionBarMenuOnItemClick(new x4(this, 19));
        t8 t8Var = new t8(d0Var.q1);
        this.n = t8Var;
        i9 i9Var = new i9(getContext());
        this.h = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(9.0f));
        i9Var.f(d0Var.q1, t8Var);
        this.a.addView(i9Var, ja.b(27.33f, 27.33f, 83, 14.33f, 0.0f, 0.0f, 14.33f));
        this.c.addView(this.a, ja.e(-1, 56, 48));
        this.c.addView(d0Var.y1, ja.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        org.telegram.ui.ActionBar.y s5 = this.a.s();
        s5.setGlassMode(true);
        s5.setTranslationX(-org.telegram.messenger.g0.L(7.0f));
        s5.a(3, R.drawable.outline_header_search);
        if (t3.N(d0Var.q1)) {
            s5.a(2, R.drawable.msg_download_settings);
        }
        hi.d dVar = new hi.d(getContext(), d0Var.J0, true);
        dVar.f();
        if (t3.w(27, d0Var.q1)) {
            eq eqVar = new eq(R.drawable.filled_add_album, 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) hd.M0(2131751989, null));
            spannableStringBuilder.setSpan(eqVar, 0, 1, 33);
            dVar.setText(spannableStringBuilder);
        } else {
            dVar.setText(hd.M0(2131747831, null));
        }
        d0Var.s1 = dVar;
        dVar.setOnClickListener(new p5(this, 14));
        this.c.addView(dVar, ja.f(48.0f, -1, 80, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.n));
        a();
    }

    @Override // li.b0
    public final float b() {
        return m7.a(this.r.m1.e) * super.b();
    }

    @Override // li.b0
    public final void c() {
        super.c();
        this.r.y1.setTranslationY(Math.max(org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.m, b() + org.telegram.messenger.g0.L(4.0f)));
    }
}
