package li;

import a8.n7;
import android.content.Context;
import android.text.SpannableStringBuilder;
import bi.w1;
import c8.na;
import hi.z4;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.n5;
import org.telegram.messenger.v3;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.p9;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class y extends a0 {
    public final p9 h;
    public final a9 n;
    public final /* synthetic */ c0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(c0 c0Var, Context context) {
        super(c0Var, context);
        this.r = c0Var;
        int i7 = 4;
        g51 g51Var = new g51(context, c0Var.a, 0, false, new s(c0Var, i7), new t(c0Var, 3), new t(c0Var, i7), c0Var.J0);
        this.d = g51Var;
        g51Var.r1();
        g51 g51Var2 = this.d;
        g51Var2.g3.r = false;
        g51Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, org.telegram.messenger.g0.L(60.0f) + org.telegram.messenger.g0.n);
        org.telegram.messenger.g0.E2(this.b);
        this.c.addView(c0Var.A1, na.g());
        this.c.addView(this.d, na.g());
        this.c.addView(c0Var.C1, na.g());
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, c0Var.J0);
        this.a = kVar;
        kVar.setOccupyStatusBar(false);
        u6.l(this.a, 5, n6.G6, c0Var.J0);
        u6.l(this.a, 3, n6.z8, c0Var.J0);
        this.a.setBackButtonImage(R.drawable.ic_ab_back);
        u6.l(this.a, 1, n6.y8, c0Var.J0);
        this.a.setTitle(n5.m(c0Var.q1));
        this.a.getTitleTextView().setTranslationX(-org.telegram.messenger.g0.L(18.0f));
        this.a.setActionBarMenuOnItemClick(new w1(this, 21));
        a9 a9Var = new a9(c0Var.q1);
        this.n = a9Var;
        p9 p9Var = new p9(getContext());
        this.h = p9Var;
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(9.0f));
        p9Var.f(c0Var.q1, a9Var);
        this.a.addView(p9Var, na.b(27.33f, 27.33f, 83, 14.33f, 0.0f, 0.0f, 14.33f));
        this.c.addView(this.a, na.e(-1, 56, 48));
        this.c.addView(c0Var.y1, na.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        org.telegram.ui.ActionBar.y s5 = this.a.s();
        s5.setGlassMode(true);
        s5.setTranslationX(-org.telegram.messenger.g0.L(7.0f));
        s5.a(3, R.drawable.outline_header_search);
        if (v3.N(c0Var.q1)) {
            s5.a(2, R.drawable.msg_download_settings);
        }
        hi.e eVar = new hi.e(getContext(), c0Var.J0, true);
        eVar.f();
        if (v3.w(27, c0Var.q1)) {
            kq kqVar = new kq(R.drawable.filled_add_album, 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) gd.N0(2131751977, null));
            spannableStringBuilder.setSpan(kqVar, 0, 1, 33);
            eVar.setText(spannableStringBuilder);
        } else {
            eVar.setText(gd.N0(2131747637, null));
        }
        c0Var.s1 = eVar;
        eVar.setOnClickListener(new z4(this, 15));
        this.c.addView(eVar, na.f(48.0f, -1, 80, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.n));
        a();
    }

    @Override // li.a0
    public final float b() {
        return n7.a(this.r.m1.e) * super.b();
    }

    @Override // li.a0
    public final void c() {
        super.c();
        this.r.y1.setTranslationY(Math.max(org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.m, b() + org.telegram.messenger.g0.L(4.0f)));
    }
}
