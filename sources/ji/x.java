package ji;

import ai.g5;
import android.content.Context;
import android.text.SpannableStringBuilder;
import b8.mf;
import b8.v9;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.m5;
import org.telegram.messenger.t3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.wp;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class x extends z {
    public final k9 h;
    public final u8 n;
    public final /* synthetic */ b0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(b0 b0Var, Context context) {
        super(b0Var, context);
        this.r = b0Var;
        int i3 = 4;
        l41 l41Var = new l41(context, b0Var.a, 0, false, new r(b0Var, i3), new s(b0Var, 3), new s(b0Var, i3), b0Var.J0);
        this.d = l41Var;
        l41Var.r1();
        l41 l41Var2 = this.d;
        l41Var2.g3.r = false;
        l41Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, org.telegram.messenger.g0.L(60.0f) + org.telegram.messenger.g0.n);
        org.telegram.messenger.g0.E2(this.b);
        this.c.addView(b0Var.x1, mf.g());
        this.c.addView(this.d, mf.g());
        this.c.addView(b0Var.z1, mf.g());
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, b0Var.J0);
        this.a = kVar;
        kVar.setOccupyStatusBar(false);
        int i10 = 5;
        r6.m(this.a, 5, k6.G6, b0Var.J0);
        r6.m(this.a, 3, k6.z8, b0Var.J0);
        this.a.setBackButtonImage(R.drawable.ic_ab_back);
        r6.m(this.a, 1, k6.y8, b0Var.J0);
        this.a.setTitle(m5.m(b0Var.n1));
        this.a.getTitleTextView().setTranslationX(-org.telegram.messenger.g0.L(18.0f));
        this.a.setActionBarMenuOnItemClick(new g5(this, 10));
        u8 u8Var = new u8(b0Var.n1);
        this.n = u8Var;
        k9 k9Var = new k9(getContext());
        this.h = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(9.0f));
        k9Var.e(b0Var.n1, u8Var);
        this.a.addView(k9Var, mf.b(27.33f, 27.33f, 83, 14.33f, 0.0f, 0.0f, 14.33f));
        this.c.addView(this.a, mf.e(-1, 56, 48));
        this.c.addView(b0Var.v1, mf.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        org.telegram.ui.ActionBar.x q10 = this.a.q();
        q10.setGlassMode(true);
        q10.setTranslationX(-org.telegram.messenger.g0.L(7.0f));
        q10.a(3, R.drawable.outline_header_search);
        if (t3.N(b0Var.n1)) {
            q10.a(2, R.drawable.msg_download_settings);
        }
        gi.d dVar = new gi.d(getContext(), b0Var.J0, true);
        dVar.f();
        if (t3.w(27, b0Var.n1)) {
            wp wpVar = new wp(R.drawable.filled_add_album, 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) bd.M0(2131751989, null));
            spannableStringBuilder.setSpan(wpVar, 0, 1, 33);
            dVar.setText(spannableStringBuilder);
        } else {
            dVar.setText(bd.M0(2131747839, null));
        }
        b0Var.p1 = dVar;
        dVar.setOnClickListener(new ii.m(this, i10));
        this.c.addView(dVar, mf.f(48.0f, -1, 80, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.n));
        a();
    }

    @Override // ji.z
    public final float b() {
        return v9.a(this.r.j1.e) * super.b();
    }

    @Override // ji.z
    public final void c() {
        super.c();
        this.r.v1.setTranslationY(Math.max(org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.m, b() + org.telegram.messenger.g0.L(4.0f)));
    }
}
