package li;

import a8.n7;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import bi.v1;
import bi.w1;
import c8.na;
import hi.z4;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.f3;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.g51;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class x extends a0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ c0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(c0 c0Var, Context context, int i7) {
        super(c0Var, context);
        this.h = i7;
        int i10 = 3;
        int i11 = 5;
        final int i12 = 0;
        switch (i7) {
            case 1:
                this.n = c0Var;
                super(c0Var, context);
                g51 g51Var = new g51(context, c0Var.a, 0, false, new s(c0Var, i11), new t(c0Var, i11), null, c0Var.J0);
                this.d = g51Var;
                g51Var.r1();
                g51 g51Var2 = this.d;
                g51Var2.g3.r = false;
                g51Var2.setClipToPadding(false);
                this.d.setPadding(0, 0, 0, org.telegram.messenger.g0.L(60.0f) + org.telegram.messenger.g0.n);
                this.d.j(new v1(this, 26));
                this.c.addView(this.d, 0, na.c(-1.0f, -1));
                org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, c0Var.J0);
                this.a = kVar;
                kVar.setOccupyStatusBar(false);
                org.telegram.ui.ActionBar.k kVar2 = this.a;
                int i13 = n6.G6;
                u6.l(kVar2, 5, i13, c0Var.J0);
                u6.l(this.a, 3, n6.z8, c0Var.J0);
                this.a.setBackButtonImage(R.drawable.ic_ab_back);
                u6.l(this.a, 1, n6.y8, c0Var.J0);
                this.a.setTitle(gd.N0(2131751874, null));
                this.a.getTitleTextView().setTranslationX(-org.telegram.messenger.g0.L(18.0f));
                this.a.setActionBarMenuOnItemClick(new w1(this, 22));
                this.c.addView(this.a, na.e(-1, 56, 48));
                LinearLayout g10 = f3.g(context, 0);
                g10.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(12.0f));
                hi.e eVar = new hi.e(context, c0Var.J0, true);
                eVar.e();
                int i14 = n6.d6;
                eVar.setColor(i0.a.f(0.125f, n6.w0(i14, c0Var.J0), n6.w0(i13, c0Var.J0)));
                eVar.setText(gd.N0(2131751888, null));
                eVar.f();
                if (eVar.getBackground() != null) {
                    Drawable background = eVar.getBackground();
                    i6 i6Var = c0Var.J0;
                    eVar.setBackground(background);
                    p6 o4 = u6.o(eVar, true);
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
                eVar.setOnClickListener(new View.OnClickListener(this) { // from class: li.b0
                    public final /* synthetic */ x b;

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
                g10.addView(eVar, na.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
                final int i15 = 1;
                hi.e eVar2 = new hi.e(context, c0Var.J0, true);
                eVar2.setText(gd.N0(2131751890, null));
                eVar2.f();
                eVar2.setOnClickListener(new View.OnClickListener(this) { // from class: li.b0
                    public final /* synthetic */ x b;

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
                g10.addView(eVar2, na.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
                this.c.addView(g10, na.f(-2.0f, -1, 80, 0, 0, 0, org.telegram.messenger.g0.n));
                a();
                break;
            default:
                this.n = c0Var;
                org.telegram.messenger.g0.E2(this.b);
                g51 g51Var3 = new g51(context, c0Var.a, 0, false, new s(c0Var, i10), new t(c0Var, 2), null, c0Var.J0);
                this.d = g51Var3;
                g51Var3.r1();
                g51 g51Var4 = this.d;
                g51Var4.g3.r = false;
                g51Var4.setClipToPadding(false);
                this.d.setPadding(0, 0, 0, org.telegram.messenger.g0.L(60.0f) + org.telegram.messenger.g0.n);
                this.c.addView(c0Var.B1, na.g());
                this.c.addView(this.d, 0, na.c(-1.0f, -1));
                this.c.addView(c0Var.D1, na.g());
                org.telegram.ui.ActionBar.k kVar3 = new org.telegram.ui.ActionBar.k(context, c0Var.J0);
                this.a = kVar3;
                kVar3.setOccupyStatusBar(false);
                u6.l(this.a, 5, n6.G6, c0Var.J0);
                u6.l(this.a, 3, n6.z8, c0Var.J0);
                org.telegram.ui.ActionBar.k kVar4 = this.a;
                boolean z10 = c0Var.I1;
                kVar4.setBackButtonImage(z10 ? R.drawable.ic_ab_close : R.drawable.ic_ab_back);
                u6.l(this.a, 1, n6.y8, c0Var.J0);
                this.a.setTitle(gd.N0(2131751976, null));
                this.a.getTitleTextView().setTranslationX(-org.telegram.messenger.g0.L(18.0f));
                this.a.setActionBarMenuOnItemClick(new w1(this, 20));
                this.c.addView(this.a, na.e(-1, 56, 48));
                this.c.addView(c0Var.z1, na.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
                org.telegram.ui.ActionBar.y s5 = this.a.s();
                s5.setGlassMode(true);
                s5.setTranslationX(-org.telegram.messenger.g0.L(7.0f));
                s5.a(3, R.drawable.outline_header_search);
                hi.e eVar3 = new hi.e(getContext(), c0Var.J0, true);
                c0Var.t1 = eVar3;
                eVar3.f();
                c0Var.t1.setText(gd.N0(2131747637, null));
                c0Var.t1.setOnClickListener(new z4(this, 14));
                if (z10) {
                    c0Var.t1.setVisibility(8);
                }
                this.c.addView(c0Var.t1, na.f(48.0f, -1, 80, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.n));
                a();
                break;
        }
    }

    @Override // li.a0
    public float b() {
        switch (this.h) {
            case 0:
                return n7.a(this.n.n1.e) * super.b();
            default:
                return super.b();
        }
    }

    @Override // li.a0
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
