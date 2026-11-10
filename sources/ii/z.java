package ii;

import a8.j7;
import android.content.Context;
import android.text.SpannableStringBuilder;
import c8.ha;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.messenger.m5;
import org.telegram.messenger.t3;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.v8;
import org.telegram.ui.Components.wp;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class z extends b0 {
    public final k9 h;
    public final v8 n;
    public final /* synthetic */ d0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(d0 d0Var, Context context) {
        super(d0Var, context);
        this.r = d0Var;
        int i7 = 4;
        r41 r41Var = new r41(context, d0Var.a, 0, false, new t(d0Var, i7), new u(d0Var, 3), new u(d0Var, i7), d0Var.I0);
        this.d = r41Var;
        r41Var.r1();
        r41 r41Var2 = this.d;
        r41Var2.f3.r = false;
        r41Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, org.telegram.messenger.g0.L(60.0f) + org.telegram.messenger.g0.n);
        org.telegram.messenger.g0.E2(this.b);
        this.c.addView(d0Var.z1, ha.g());
        this.c.addView(this.d, ha.g());
        this.c.addView(d0Var.B1, ha.g());
        org.telegram.ui.ActionBar.l lVar = new org.telegram.ui.ActionBar.l(context, d0Var.I0);
        this.a = lVar;
        lVar.setOccupyStatusBar(false);
        t6.l(this.a, 5, m6.G6, d0Var.I0);
        t6.l(this.a, 3, m6.z8, d0Var.I0);
        this.a.setBackButtonImage(R.drawable.ic_ab_back);
        t6.l(this.a, 1, m6.y8, d0Var.I0);
        this.a.setTitle(m5.m(d0Var.p1));
        this.a.getTitleTextView().setTranslationX(-org.telegram.messenger.g0.L(18.0f));
        this.a.setActionBarMenuOnItemClick(new bi.s(this, 9));
        v8 v8Var = new v8(d0Var.p1);
        this.n = v8Var;
        k9 k9Var = new k9(getContext());
        this.h = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(9.0f));
        k9Var.e(d0Var.p1, v8Var);
        this.a.addView(k9Var, ha.b(27.33f, 27.33f, 83, 14.33f, 0.0f, 0.0f, 14.33f));
        this.c.addView(this.a, ha.e(-1, 56, 48));
        this.c.addView(d0Var.x1, ha.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        org.telegram.ui.ActionBar.y s5 = this.a.s();
        s5.setGlassMode(true);
        s5.setTranslationX(-org.telegram.messenger.g0.L(7.0f));
        s5.a(3, R.drawable.outline_header_search);
        int i10 = 2;
        if (t3.N(d0Var.p1)) {
            s5.a(2, R.drawable.msg_download_settings);
        }
        fi.d dVar = new fi.d(getContext(), d0Var.I0, true);
        dVar.f();
        if (t3.w(27, d0Var.p1)) {
            wp wpVar = new wp(R.drawable.filled_add_album, 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) id.M0(2131751989, null));
            spannableStringBuilder.setSpan(wpVar, 0, 1, 33);
            dVar.setText(spannableStringBuilder);
        } else {
            dVar.setText(id.M0(2131747831, null));
        }
        d0Var.r1 = dVar;
        dVar.setOnClickListener(new g(this, i10));
        this.c.addView(dVar, ha.f(48.0f, -1, 80, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.n));
        a();
    }

    @Override // ii.b0
    public final float b() {
        return j7.a(this.r.l1.e) * super.b();
    }

    @Override // ii.b0
    public final void c() {
        super.c();
        this.r.x1.setTranslationY(Math.max(org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.m, b() + org.telegram.messenger.g0.L(4.0f)));
    }
}
