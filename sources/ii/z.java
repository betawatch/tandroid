package ii;

import a8.j7;
import android.content.Context;
import android.text.SpannableStringBuilder;
import c8.ha;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.messenger.m5;
import org.telegram.messenger.t3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.wp;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final class z extends b0 {
    public final l9 h;
    public final w8 n;
    public final /* synthetic */ d0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(d0 d0Var, Context context) {
        super(d0Var, context);
        this.r = d0Var;
        int i7 = 4;
        q41 q41Var = new q41(context, d0Var.a, 0, false, new t(d0Var, i7), new u(d0Var, 3), new u(d0Var, i7), d0Var.I0);
        this.d = q41Var;
        q41Var.r1();
        q41 q41Var2 = this.d;
        q41Var2.f3.r = false;
        q41Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, org.telegram.messenger.g0.L(60.0f) + org.telegram.messenger.g0.n);
        org.telegram.messenger.g0.E2(this.b);
        this.c.addView(d0Var.w1, ha.g());
        this.c.addView(this.d, ha.g());
        this.c.addView(d0Var.y1, ha.g());
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, d0Var.I0);
        this.a = kVar;
        kVar.setOccupyStatusBar(false);
        r6.m(this.a, 5, k6.G6, d0Var.I0);
        r6.m(this.a, 3, k6.z8, d0Var.I0);
        this.a.setBackButtonImage(R.drawable.ic_ab_back);
        r6.m(this.a, 1, k6.y8, d0Var.I0);
        this.a.setTitle(m5.m(d0Var.m1));
        this.a.getTitleTextView().setTranslationX(-org.telegram.messenger.g0.L(18.0f));
        this.a.setActionBarMenuOnItemClick(new bi.s(this, 9));
        w8 w8Var = new w8(d0Var.m1);
        this.n = w8Var;
        l9 l9Var = new l9(getContext());
        this.h = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(9.0f));
        l9Var.e(d0Var.m1, w8Var);
        this.a.addView(l9Var, ha.b(27.33f, 27.33f, 83, 14.33f, 0.0f, 0.0f, 14.33f));
        this.c.addView(this.a, ha.e(-1, 56, 48));
        this.c.addView(d0Var.u1, ha.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        org.telegram.ui.ActionBar.y q10 = this.a.q();
        q10.setGlassMode(true);
        q10.setTranslationX(-org.telegram.messenger.g0.L(7.0f));
        q10.a(3, R.drawable.outline_header_search);
        int i10 = 2;
        if (t3.N(d0Var.m1)) {
            q10.a(2, R.drawable.msg_download_settings);
        }
        fi.d dVar = new fi.d(getContext(), d0Var.I0, true);
        dVar.f();
        if (t3.w(27, d0Var.m1)) {
            wp wpVar = new wp(R.drawable.filled_add_album, 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) id.M0(2131751989, null));
            spannableStringBuilder.setSpan(wpVar, 0, 1, 33);
            dVar.setText(spannableStringBuilder);
        } else {
            dVar.setText(id.M0(2131747832, null));
        }
        d0Var.o1 = dVar;
        dVar.setOnClickListener(new g(this, i10));
        this.c.addView(dVar, ha.f(48.0f, -1, 80, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.n));
        a();
    }

    @Override // ii.b0
    public final float b() {
        return j7.a(this.r.i1.e) * super.b();
    }

    @Override // ii.b0
    public final void c() {
        super.c();
        this.r.u1.setTranslationY(Math.max(org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.m, b() + org.telegram.messenger.g0.L(4.0f)));
    }
}
