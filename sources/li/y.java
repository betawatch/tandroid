package li;

import a8.m7;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import bi.u1;
import bi.v1;
import c8.ma;
import hi.o4;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.f3;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.h51;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class y extends b0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ d0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(d0 d0Var, Context context, int i7) {
        super(d0Var, context);
        this.h = i7;
        int i10 = 3;
        int i11 = 5;
        final int i12 = 0;
        switch (i7) {
            case 1:
                this.n = d0Var;
                super(d0Var, context);
                h51 h51Var = new h51(context, d0Var.a, 0, false, new t(d0Var, i11), new u(d0Var, i11), null, d0Var.J0);
                this.d = h51Var;
                h51Var.r1();
                h51 h51Var2 = this.d;
                h51Var2.g3.r = false;
                h51Var2.setClipToPadding(false);
                this.d.setPadding(0, 0, 0, org.telegram.messenger.g0.L(60.0f) + org.telegram.messenger.g0.n);
                this.d.j(new u1(this, 26));
                this.c.addView(this.d, 0, ma.c(-1.0f, -1));
                org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, d0Var.J0);
                this.a = kVar;
                kVar.setOccupyStatusBar(false);
                org.telegram.ui.ActionBar.k kVar2 = this.a;
                int i13 = m6.G6;
                t6.l(kVar2, 5, i13, d0Var.J0);
                t6.l(this.a, 3, m6.z8, d0Var.J0);
                this.a.setBackButtonImage(R.drawable.ic_ab_back);
                t6.l(this.a, 1, m6.y8, d0Var.J0);
                this.a.setTitle(hd.N0(2131751874, null));
                this.a.getTitleTextView().setTranslationX(-org.telegram.messenger.g0.L(18.0f));
                this.a.setActionBarMenuOnItemClick(new v1(this, 22));
                this.c.addView(this.a, ma.e(-1, 56, 48));
                LinearLayout g10 = f3.g(context, 0);
                g10.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(12.0f));
                hi.e eVar = new hi.e(context, d0Var.J0, true);
                eVar.e();
                int i14 = m6.d6;
                eVar.setColor(i0.a.f(0.125f, m6.w0(i14, d0Var.J0), m6.w0(i13, d0Var.J0)));
                eVar.setText(hd.N0(2131751888, null));
                eVar.f();
                if (eVar.getBackground() != null) {
                    Drawable background = eVar.getBackground();
                    h6 h6Var = d0Var.J0;
                    eVar.setBackground(background);
                    o6 o4 = t6.o(eVar, true);
                    o4.d = background;
                    o4.e = null;
                    o4.f = null;
                    if (background != null) {
                        n6 n6Var = new n6();
                        o4.e = n6Var;
                        n6Var.c(i14, i13, 3, 0.125f, h6Var);
                        n6Var.g = t6.t(background);
                    }
                }
                eVar.setOnClickListener(new View.OnClickListener(this) { // from class: li.c0
                    public final /* synthetic */ y b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i12) {
                            case 0:
                                this.b.n.H1.f(false, true);
                                break;
                            default:
                                this.b.n.H1.f(true, true);
                                break;
                        }
                    }
                });
                g10.addView(eVar, ma.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
                final int i15 = 1;
                hi.e eVar2 = new hi.e(context, d0Var.J0, true);
                eVar2.setText(hd.N0(2131751890, null));
                eVar2.f();
                eVar2.setOnClickListener(new View.OnClickListener(this) { // from class: li.c0
                    public final /* synthetic */ y b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i15) {
                            case 0:
                                this.b.n.H1.f(false, true);
                                break;
                            default:
                                this.b.n.H1.f(true, true);
                                break;
                        }
                    }
                });
                g10.addView(eVar2, ma.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
                this.c.addView(g10, ma.f(-2.0f, -1, 80, 0, 0, 0, org.telegram.messenger.g0.n));
                a();
                break;
            default:
                this.n = d0Var;
                org.telegram.messenger.g0.E2(this.b);
                h51 h51Var3 = new h51(context, d0Var.a, 0, false, new t(d0Var, i10), new u(d0Var, 2), null, d0Var.J0);
                this.d = h51Var3;
                h51Var3.r1();
                h51 h51Var4 = this.d;
                h51Var4.g3.r = false;
                h51Var4.setClipToPadding(false);
                this.d.setPadding(0, 0, 0, org.telegram.messenger.g0.L(60.0f) + org.telegram.messenger.g0.n);
                this.c.addView(d0Var.B1, ma.g());
                this.c.addView(this.d, 0, ma.c(-1.0f, -1));
                this.c.addView(d0Var.D1, ma.g());
                org.telegram.ui.ActionBar.k kVar3 = new org.telegram.ui.ActionBar.k(context, d0Var.J0);
                this.a = kVar3;
                kVar3.setOccupyStatusBar(false);
                t6.l(this.a, 5, m6.G6, d0Var.J0);
                t6.l(this.a, 3, m6.z8, d0Var.J0);
                org.telegram.ui.ActionBar.k kVar4 = this.a;
                boolean z10 = d0Var.I1;
                kVar4.setBackButtonImage(z10 ? R.drawable.ic_ab_close : R.drawable.ic_ab_back);
                t6.l(this.a, 1, m6.y8, d0Var.J0);
                this.a.setTitle(hd.N0(2131751976, null));
                this.a.getTitleTextView().setTranslationX(-org.telegram.messenger.g0.L(18.0f));
                this.a.setActionBarMenuOnItemClick(new v1(this, 20));
                this.c.addView(this.a, ma.e(-1, 56, 48));
                this.c.addView(d0Var.z1, ma.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
                org.telegram.ui.ActionBar.y s5 = this.a.s();
                s5.setGlassMode(true);
                s5.setTranslationX(-org.telegram.messenger.g0.L(7.0f));
                s5.a(3, R.drawable.outline_header_search);
                hi.e eVar3 = new hi.e(getContext(), d0Var.J0, true);
                d0Var.t1 = eVar3;
                eVar3.f();
                d0Var.t1.setText(hd.N0(2131747637, null));
                d0Var.t1.setOnClickListener(new o4(this, 14));
                if (z10) {
                    d0Var.t1.setVisibility(8);
                }
                this.c.addView(d0Var.t1, ma.f(48.0f, -1, 80, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.n));
                a();
                break;
        }
    }

    @Override // li.b0
    public float b() {
        switch (this.h) {
            case 0:
                return m7.a(this.n.n1.e) * super.b();
            default:
                return super.b();
        }
    }

    @Override // li.b0
    public void c() {
        switch (this.h) {
            case 0:
                super.c();
                this.n.z1.setTranslationY(Math.max(org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.m, b() + org.telegram.messenger.g0.L(4.0f)));
                break;
            default:
                super.c();
                break;
        }
    }
}
