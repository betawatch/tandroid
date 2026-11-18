package li;

import a8.m7;
import android.content.Context;
import android.text.SpannableStringBuilder;
import bi.r1;
import c8.ma;
import hi.o0;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.n5;
import org.telegram.messenger.v3;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.q9;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class z extends b0 {
    public final q9 h;
    public final b9 n;
    public final /* synthetic */ d0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(d0 d0Var, Context context) {
        super(d0Var, context);
        this.r = d0Var;
        int i7 = 4;
        e51 e51Var = new e51(context, d0Var.a, 0, false, new t(d0Var, i7), new u(d0Var, 3), new u(d0Var, i7), d0Var.J0);
        this.d = e51Var;
        e51Var.r1();
        e51 e51Var2 = this.d;
        e51Var2.g3.r = false;
        e51Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, org.telegram.messenger.g0.L(60.0f) + org.telegram.messenger.g0.n);
        org.telegram.messenger.g0.E2(this.b);
        this.c.addView(d0Var.A1, ma.g());
        this.c.addView(this.d, ma.g());
        this.c.addView(d0Var.C1, ma.g());
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, d0Var.J0);
        this.a = kVar;
        kVar.setOccupyStatusBar(false);
        u6.l(this.a, 5, n6.G6, d0Var.J0);
        u6.l(this.a, 3, n6.z8, d0Var.J0);
        this.a.setBackButtonImage(R.drawable.ic_ab_back);
        u6.l(this.a, 1, n6.y8, d0Var.J0);
        this.a.setTitle(n5.m(d0Var.q1));
        this.a.getTitleTextView().setTranslationX(-org.telegram.messenger.g0.L(18.0f));
        this.a.setActionBarMenuOnItemClick(new r1(this, 21));
        b9 b9Var = new b9(d0Var.q1);
        this.n = b9Var;
        q9 q9Var = new q9(getContext());
        this.h = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(9.0f));
        q9Var.f(d0Var.q1, b9Var);
        this.a.addView(q9Var, ma.b(27.33f, 27.33f, 83, 14.33f, 0.0f, 0.0f, 14.33f));
        this.c.addView(this.a, ma.e(-1, 56, 48));
        this.c.addView(d0Var.y1, ma.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        org.telegram.ui.ActionBar.z t6 = this.a.t();
        t6.setGlassMode(true);
        t6.setTranslationX(-org.telegram.messenger.g0.L(7.0f));
        t6.a(3, R.drawable.outline_header_search);
        if (v3.N(d0Var.q1)) {
            t6.a(2, R.drawable.msg_download_settings);
        }
        hi.d dVar = new hi.d(getContext(), d0Var.J0, true);
        dVar.f();
        if (v3.w(27, d0Var.q1)) {
            lq lqVar = new lq(R.drawable.filled_add_album, 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) gd.M0(2131751978, null));
            spannableStringBuilder.setSpan(lqVar, 0, 1, 33);
            dVar.setText(spannableStringBuilder);
        } else {
            dVar.setText(gd.M0(2131747638, null));
        }
        d0Var.s1 = dVar;
        dVar.setOnClickListener(new o0(this, 16));
        this.c.addView(dVar, ma.f(48.0f, -1, 80, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.n));
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
