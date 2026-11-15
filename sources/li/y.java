package li;

import a8.m7;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import bi.x4;
import bi.z4;
import c8.ja;
import hi.p5;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.k5;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.u41;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                u41 u41Var = new u41(context, d0Var.a, 0, false, new s(d0Var, i11), new t(d0Var, i11), null, d0Var.J0);
                this.d = u41Var;
                u41Var.r1();
                u41 u41Var2 = this.d;
                u41Var2.g3.r = false;
                u41Var2.setClipToPadding(false);
                this.d.setPadding(0, 0, 0, org.telegram.messenger.g0.L(60.0f) + org.telegram.messenger.g0.n);
                this.d.j(new z4(this, 25));
                this.c.addView(this.d, 0, ja.c(-1.0f, -1));
                org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, d0Var.J0);
                this.a = kVar;
                kVar.setOccupyStatusBar(false);
                org.telegram.ui.ActionBar.k kVar2 = this.a;
                int i13 = j6.G6;
                q6.l(kVar2, 5, i13, d0Var.J0);
                q6.l(this.a, 3, j6.z8, d0Var.J0);
                this.a.setBackButtonImage(R.drawable.ic_ab_back);
                q6.l(this.a, 1, j6.y8, d0Var.J0);
                this.a.setTitle(hd.M0(2131751886, null));
                this.a.getTitleTextView().setTranslationX(-org.telegram.messenger.g0.L(18.0f));
                this.a.setActionBarMenuOnItemClick(new x4(this, 20));
                this.c.addView(this.a, ja.e(-1, 56, 48));
                LinearLayout f10 = k5.f(context, 0);
                f10.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(12.0f));
                hi.d dVar = new hi.d(context, d0Var.J0, true);
                dVar.e();
                int i14 = j6.d6;
                dVar.setColor(i0.a.f(0.125f, j6.w0(i14, d0Var.J0), j6.w0(i13, d0Var.J0)));
                dVar.setText(hd.M0(2131751900, null));
                dVar.f();
                if (dVar.getBackground() != null) {
                    Drawable background = dVar.getBackground();
                    e6 e6Var = d0Var.J0;
                    dVar.setBackground(background);
                    l6 o4 = q6.o(dVar, true);
                    o4.d = background;
                    o4.e = null;
                    o4.f = null;
                    if (background != null) {
                        k6 k6Var = new k6();
                        o4.e = k6Var;
                        k6Var.c(i14, i13, 3, 0.125f, e6Var);
                        k6Var.g = q6.t(background);
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
                f10.addView(dVar, ja.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
                final int i15 = 1;
                hi.d dVar2 = new hi.d(context, d0Var.J0, true);
                dVar2.setText(hd.M0(2131751902, null));
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
                f10.addView(dVar2, ja.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
                this.c.addView(f10, ja.f(-2.0f, -1, 80, 0, 0, 0, org.telegram.messenger.g0.n));
                a();
                break;
            default:
                this.n = d0Var;
                org.telegram.messenger.g0.E2(this.b);
                u41 u41Var3 = new u41(context, d0Var.a, 0, false, new s(d0Var, i10), new t(d0Var, 2), null, d0Var.J0);
                this.d = u41Var3;
                u41Var3.r1();
                u41 u41Var4 = this.d;
                u41Var4.g3.r = false;
                u41Var4.setClipToPadding(false);
                this.d.setPadding(0, 0, 0, org.telegram.messenger.g0.L(60.0f) + org.telegram.messenger.g0.n);
                this.c.addView(d0Var.B1, ja.g());
                this.c.addView(this.d, 0, ja.c(-1.0f, -1));
                this.c.addView(d0Var.D1, ja.g());
                org.telegram.ui.ActionBar.k kVar3 = new org.telegram.ui.ActionBar.k(context, d0Var.J0);
                this.a = kVar3;
                kVar3.setOccupyStatusBar(false);
                q6.l(this.a, 5, j6.G6, d0Var.J0);
                q6.l(this.a, 3, j6.z8, d0Var.J0);
                org.telegram.ui.ActionBar.k kVar4 = this.a;
                boolean z10 = d0Var.I1;
                kVar4.setBackButtonImage(z10 ? R.drawable.ic_ab_close : R.drawable.ic_ab_back);
                q6.l(this.a, 1, j6.y8, d0Var.J0);
                this.a.setTitle(hd.M0(2131751988, null));
                this.a.getTitleTextView().setTranslationX(-org.telegram.messenger.g0.L(18.0f));
                this.a.setActionBarMenuOnItemClick(new x4(this, 18));
                this.c.addView(this.a, ja.e(-1, 56, 48));
                this.c.addView(d0Var.z1, ja.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
                org.telegram.ui.ActionBar.y s5 = this.a.s();
                s5.setGlassMode(true);
                s5.setTranslationX(-org.telegram.messenger.g0.L(7.0f));
                s5.a(3, R.drawable.outline_header_search);
                hi.d dVar3 = new hi.d(getContext(), d0Var.J0, true);
                d0Var.t1 = dVar3;
                dVar3.f();
                d0Var.t1.setText(hd.M0(2131747831, null));
                d0Var.t1.setOnClickListener(new p5(this, 13));
                if (z10) {
                    d0Var.t1.setVisibility(8);
                }
                this.c.addView(d0Var.t1, ja.f(48.0f, -1, 80, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.n));
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
