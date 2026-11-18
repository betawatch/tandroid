package li;

import a8.m7;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import bi.q1;
import bi.r1;
import c8.ma;
import hi.o0;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.f3;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.e51;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                e51 e51Var = new e51(context, d0Var.a, 0, false, new t(d0Var, i11), new u(d0Var, i11), null, d0Var.J0);
                this.d = e51Var;
                e51Var.r1();
                e51 e51Var2 = this.d;
                e51Var2.g3.r = false;
                e51Var2.setClipToPadding(false);
                this.d.setPadding(0, 0, 0, org.telegram.messenger.g0.L(60.0f) + org.telegram.messenger.g0.n);
                this.d.j(new q1(this, 26));
                this.c.addView(this.d, 0, ma.c(-1.0f, -1));
                org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, d0Var.J0);
                this.a = kVar;
                kVar.setOccupyStatusBar(false);
                org.telegram.ui.ActionBar.k kVar2 = this.a;
                int i13 = n6.G6;
                u6.l(kVar2, 5, i13, d0Var.J0);
                u6.l(this.a, 3, n6.z8, d0Var.J0);
                this.a.setBackButtonImage(R.drawable.ic_ab_back);
                u6.l(this.a, 1, n6.y8, d0Var.J0);
                this.a.setTitle(gd.M0(2131751875, null));
                this.a.getTitleTextView().setTranslationX(-org.telegram.messenger.g0.L(18.0f));
                this.a.setActionBarMenuOnItemClick(new r1(this, 22));
                this.c.addView(this.a, ma.e(-1, 56, 48));
                LinearLayout g10 = f3.g(context, 0);
                g10.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(12.0f));
                hi.d dVar = new hi.d(context, d0Var.J0, true);
                dVar.e();
                int i14 = n6.d6;
                dVar.setColor(i0.a.f(0.125f, n6.w0(i14, d0Var.J0), n6.w0(i13, d0Var.J0)));
                dVar.setText(gd.M0(2131751889, null));
                dVar.f();
                if (dVar.getBackground() != null) {
                    Drawable background = dVar.getBackground();
                    i6 i6Var = d0Var.J0;
                    dVar.setBackground(background);
                    p6 o4 = u6.o(dVar, true);
                    o4.d = background;
                    o4.e = null;
                    o4.f = null;
                    if (background != null) {
                        o6 o6Var = new o6();
                        o4.e = o6Var;
                        o6Var.c(i14, i13, 3, 0.125f, i6Var);
                        o6Var.g = u6.t(background);
                    }
                }
                dVar.setOnClickListener(new View.OnClickListener(this) { // from class: li.c0
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
                g10.addView(dVar, ma.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
                final int i15 = 1;
                hi.d dVar2 = new hi.d(context, d0Var.J0, true);
                dVar2.setText(gd.M0(2131751891, null));
                dVar2.f();
                dVar2.setOnClickListener(new View.OnClickListener(this) { // from class: li.c0
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
                g10.addView(dVar2, ma.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
                this.c.addView(g10, ma.f(-2.0f, -1, 80, 0, 0, 0, org.telegram.messenger.g0.n));
                a();
                break;
            default:
                this.n = d0Var;
                org.telegram.messenger.g0.E2(this.b);
                e51 e51Var3 = new e51(context, d0Var.a, 0, false, new t(d0Var, i10), new u(d0Var, 2), null, d0Var.J0);
                this.d = e51Var3;
                e51Var3.r1();
                e51 e51Var4 = this.d;
                e51Var4.g3.r = false;
                e51Var4.setClipToPadding(false);
                this.d.setPadding(0, 0, 0, org.telegram.messenger.g0.L(60.0f) + org.telegram.messenger.g0.n);
                this.c.addView(d0Var.B1, ma.g());
                this.c.addView(this.d, 0, ma.c(-1.0f, -1));
                this.c.addView(d0Var.D1, ma.g());
                org.telegram.ui.ActionBar.k kVar3 = new org.telegram.ui.ActionBar.k(context, d0Var.J0);
                this.a = kVar3;
                kVar3.setOccupyStatusBar(false);
                u6.l(this.a, 5, n6.G6, d0Var.J0);
                u6.l(this.a, 3, n6.z8, d0Var.J0);
                org.telegram.ui.ActionBar.k kVar4 = this.a;
                boolean z10 = d0Var.I1;
                kVar4.setBackButtonImage(z10 ? R.drawable.ic_ab_close : R.drawable.ic_ab_back);
                u6.l(this.a, 1, n6.y8, d0Var.J0);
                this.a.setTitle(gd.M0(2131751977, null));
                this.a.getTitleTextView().setTranslationX(-org.telegram.messenger.g0.L(18.0f));
                this.a.setActionBarMenuOnItemClick(new r1(this, 20));
                this.c.addView(this.a, ma.e(-1, 56, 48));
                this.c.addView(d0Var.z1, ma.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
                org.telegram.ui.ActionBar.z t6 = this.a.t();
                t6.setGlassMode(true);
                t6.setTranslationX(-org.telegram.messenger.g0.L(7.0f));
                t6.a(3, R.drawable.outline_header_search);
                hi.d dVar3 = new hi.d(getContext(), d0Var.J0, true);
                d0Var.t1 = dVar3;
                dVar3.f();
                d0Var.t1.setText(gd.M0(2131747638, null));
                d0Var.t1.setOnClickListener(new o0(this, 15));
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
