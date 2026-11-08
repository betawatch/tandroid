package ii;

import a8.j7;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import c8.ha;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.messenger.k5;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.q41;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
                q41 q41Var = new q41(context, d0Var.a, 0, false, new t(d0Var, i11), new u(d0Var, i11), null, d0Var.I0);
                this.d = q41Var;
                q41Var.r1();
                q41 q41Var2 = this.d;
                q41Var2.f3.r = false;
                q41Var2.setClipToPadding(false);
                this.d.setPadding(0, 0, 0, org.telegram.messenger.g0.L(60.0f) + org.telegram.messenger.g0.n);
                this.d.j(new ai.b(this, 19));
                this.c.addView(this.d, 0, ha.c(-1.0f, -1));
                org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, d0Var.I0);
                this.a = kVar;
                kVar.setOccupyStatusBar(false);
                org.telegram.ui.ActionBar.k kVar2 = this.a;
                int i13 = k6.G6;
                r6.m(kVar2, 5, i13, d0Var.I0);
                r6.m(this.a, 3, k6.z8, d0Var.I0);
                this.a.setBackButtonImage(R.drawable.ic_ab_back);
                final int i14 = 1;
                r6.m(this.a, 1, k6.y8, d0Var.I0);
                this.a.setTitle(id.M0(2131751886, null));
                this.a.getTitleTextView().setTranslationX(-org.telegram.messenger.g0.L(18.0f));
                this.a.setActionBarMenuOnItemClick(new bi.s(this, 10));
                this.c.addView(this.a, ha.e(-1, 56, 48));
                LinearLayout f10 = k5.f(context, 0);
                f10.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(12.0f));
                fi.d dVar = new fi.d(context, d0Var.I0, true);
                dVar.e();
                int i15 = k6.d6;
                dVar.setColor(i0.a.f(0.125f, k6.w0(i15, d0Var.I0), k6.w0(i13, d0Var.I0)));
                dVar.setText(id.M0(2131751900, null));
                dVar.f();
                if (dVar.getBackground() != null) {
                    Drawable background = dVar.getBackground();
                    f6 f6Var = d0Var.I0;
                    dVar.setBackground(background);
                    m6 p10 = r6.p(dVar, true);
                    p10.d = background;
                    p10.e = null;
                    p10.f = null;
                    if (background != null) {
                        l6 l6Var = new l6();
                        p10.e = l6Var;
                        l6Var.c(i15, i13, 3, 0.125f, f6Var);
                        l6Var.g = r6.u(background);
                    }
                }
                dVar.setOnClickListener(new View.OnClickListener(this) { // from class: ii.c0
                    public final /* synthetic */ y b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i12) {
                            case 0:
                                this.b.n.D1.f(false, true);
                                break;
                            default:
                                this.b.n.D1.f(true, true);
                                break;
                        }
                    }
                });
                f10.addView(dVar, ha.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
                fi.d dVar2 = new fi.d(context, d0Var.I0, true);
                dVar2.setText(id.M0(2131751902, null));
                dVar2.f();
                dVar2.setOnClickListener(new View.OnClickListener(this) { // from class: ii.c0
                    public final /* synthetic */ y b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i14) {
                            case 0:
                                this.b.n.D1.f(false, true);
                                break;
                            default:
                                this.b.n.D1.f(true, true);
                                break;
                        }
                    }
                });
                f10.addView(dVar2, ha.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
                this.c.addView(f10, ha.f(-2.0f, -1, 80, 0, 0, 0, org.telegram.messenger.g0.n));
                a();
                break;
            default:
                this.n = d0Var;
                org.telegram.messenger.g0.E2(this.b);
                q41 q41Var3 = new q41(context, d0Var.a, 0, false, new t(d0Var, i10), new u(d0Var, 2), null, d0Var.I0);
                this.d = q41Var3;
                q41Var3.r1();
                q41 q41Var4 = this.d;
                q41Var4.f3.r = false;
                q41Var4.setClipToPadding(false);
                this.d.setPadding(0, 0, 0, org.telegram.messenger.g0.L(60.0f) + org.telegram.messenger.g0.n);
                this.c.addView(d0Var.x1, ha.g());
                this.c.addView(this.d, 0, ha.c(-1.0f, -1));
                this.c.addView(d0Var.z1, ha.g());
                org.telegram.ui.ActionBar.k kVar3 = new org.telegram.ui.ActionBar.k(context, d0Var.I0);
                this.a = kVar3;
                kVar3.setOccupyStatusBar(false);
                r6.m(this.a, 5, k6.G6, d0Var.I0);
                r6.m(this.a, 3, k6.z8, d0Var.I0);
                org.telegram.ui.ActionBar.k kVar4 = this.a;
                boolean z9 = d0Var.E1;
                kVar4.setBackButtonImage(z9 ? R.drawable.ic_ab_close : R.drawable.ic_ab_back);
                r6.m(this.a, 1, k6.y8, d0Var.I0);
                this.a.setTitle(id.M0(2131751988, null));
                this.a.getTitleTextView().setTranslationX(-org.telegram.messenger.g0.L(18.0f));
                this.a.setActionBarMenuOnItemClick(new bi.s(this, 8));
                this.c.addView(this.a, ha.e(-1, 56, 48));
                this.c.addView(d0Var.v1, ha.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
                org.telegram.ui.ActionBar.y q10 = this.a.q();
                q10.setGlassMode(true);
                q10.setTranslationX(-org.telegram.messenger.g0.L(7.0f));
                q10.a(3, R.drawable.outline_header_search);
                fi.d dVar3 = new fi.d(getContext(), d0Var.I0, true);
                d0Var.p1 = dVar3;
                dVar3.f();
                d0Var.p1.setText(id.M0(2131747832, null));
                d0Var.p1.setOnClickListener(new g(this, 1));
                if (z9) {
                    d0Var.p1.setVisibility(8);
                }
                this.c.addView(d0Var.p1, ha.f(48.0f, -1, 80, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.n));
                a();
                break;
        }
    }

    @Override // ii.b0
    public float b() {
        switch (this.h) {
            case 0:
                return j7.a(this.n.j1.e) * super.b();
            default:
                return super.b();
        }
    }

    @Override // ii.b0
    public void c() {
        switch (this.h) {
            case 0:
                super.c();
                this.n.v1.setTranslationY(Math.max(org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.m, b() + org.telegram.messenger.g0.L(4.0f)));
                break;
            default:
                super.c();
                break;
        }
    }
}
