package ji;

import ai.g5;
import ai.j5;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import b8.mf;
import b8.v9;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.k5;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.l41;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w extends z {
    public final /* synthetic */ int h;
    public final /* synthetic */ b0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(b0 b0Var, Context context, int i3) {
        super(b0Var, context);
        this.h = i3;
        int i10 = 3;
        int i11 = 5;
        final int i12 = 0;
        switch (i3) {
            case 1:
                this.n = b0Var;
                super(b0Var, context);
                l41 l41Var = new l41(context, b0Var.a, 0, false, new r(b0Var, i11), new s(b0Var, i11), null, b0Var.J0);
                this.d = l41Var;
                l41Var.r1();
                l41 l41Var2 = this.d;
                l41Var2.g3.r = false;
                l41Var2.setClipToPadding(false);
                this.d.setPadding(0, 0, 0, org.telegram.messenger.g0.L(60.0f) + org.telegram.messenger.g0.n);
                this.d.j(new j5(this, 22));
                this.c.addView(this.d, 0, mf.c(-1.0f, -1));
                org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, b0Var.J0);
                this.a = kVar;
                kVar.setOccupyStatusBar(false);
                org.telegram.ui.ActionBar.k kVar2 = this.a;
                int i13 = k6.G6;
                r6.m(kVar2, 5, i13, b0Var.J0);
                r6.m(this.a, 3, k6.z8, b0Var.J0);
                this.a.setBackButtonImage(R.drawable.ic_ab_back);
                r6.m(this.a, 1, k6.y8, b0Var.J0);
                this.a.setTitle(bd.M0(2131751886, null));
                this.a.getTitleTextView().setTranslationX(-org.telegram.messenger.g0.L(18.0f));
                this.a.setActionBarMenuOnItemClick(new g5(this, 11));
                this.c.addView(this.a, mf.e(-1, 56, 48));
                LinearLayout f10 = k5.f(context, 0);
                f10.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(12.0f));
                gi.d dVar = new gi.d(context, b0Var.J0, true);
                dVar.e();
                int i14 = k6.d6;
                dVar.setColor(i0.a.f(0.125f, k6.w0(i14, b0Var.J0), k6.w0(i13, b0Var.J0)));
                dVar.setText(bd.M0(2131751900, null));
                dVar.f();
                if (dVar.getBackground() != null) {
                    Drawable background = dVar.getBackground();
                    e6 e6Var = b0Var.J0;
                    dVar.setBackground(background);
                    m6 p10 = r6.p(dVar, true);
                    p10.d = background;
                    p10.e = null;
                    p10.f = null;
                    if (background != null) {
                        l6 l6Var = new l6();
                        p10.e = l6Var;
                        l6Var.c(i14, i13, 3, 0.125f, e6Var);
                        l6Var.g = r6.u(background);
                    }
                }
                dVar.setOnClickListener(new View.OnClickListener(this) { // from class: ji.a0
                    public final /* synthetic */ w b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i12) {
                            case 0:
                                this.b.n.E1.f(false, true);
                                break;
                            default:
                                this.b.n.E1.f(true, true);
                                break;
                        }
                    }
                });
                f10.addView(dVar, mf.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
                final int i15 = 1;
                gi.d dVar2 = new gi.d(context, b0Var.J0, true);
                dVar2.setText(bd.M0(2131751902, null));
                dVar2.f();
                dVar2.setOnClickListener(new View.OnClickListener(this) { // from class: ji.a0
                    public final /* synthetic */ w b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i15) {
                            case 0:
                                this.b.n.E1.f(false, true);
                                break;
                            default:
                                this.b.n.E1.f(true, true);
                                break;
                        }
                    }
                });
                f10.addView(dVar2, mf.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
                this.c.addView(f10, mf.f(-2.0f, -1, 80, 0, 0, 0, org.telegram.messenger.g0.n));
                a();
                break;
            default:
                this.n = b0Var;
                org.telegram.messenger.g0.E2(this.b);
                l41 l41Var3 = new l41(context, b0Var.a, 0, false, new r(b0Var, i10), new s(b0Var, 2), null, b0Var.J0);
                this.d = l41Var3;
                l41Var3.r1();
                l41 l41Var4 = this.d;
                l41Var4.g3.r = false;
                l41Var4.setClipToPadding(false);
                this.d.setPadding(0, 0, 0, org.telegram.messenger.g0.L(60.0f) + org.telegram.messenger.g0.n);
                this.c.addView(b0Var.y1, mf.g());
                this.c.addView(this.d, 0, mf.c(-1.0f, -1));
                this.c.addView(b0Var.A1, mf.g());
                org.telegram.ui.ActionBar.k kVar3 = new org.telegram.ui.ActionBar.k(context, b0Var.J0);
                this.a = kVar3;
                kVar3.setOccupyStatusBar(false);
                r6.m(this.a, 5, k6.G6, b0Var.J0);
                r6.m(this.a, 3, k6.z8, b0Var.J0);
                org.telegram.ui.ActionBar.k kVar4 = this.a;
                boolean z10 = b0Var.F1;
                kVar4.setBackButtonImage(z10 ? R.drawable.ic_ab_close : R.drawable.ic_ab_back);
                r6.m(this.a, 1, k6.y8, b0Var.J0);
                this.a.setTitle(bd.M0(2131751988, null));
                this.a.getTitleTextView().setTranslationX(-org.telegram.messenger.g0.L(18.0f));
                this.a.setActionBarMenuOnItemClick(new g5(this, 9));
                this.c.addView(this.a, mf.e(-1, 56, 48));
                this.c.addView(b0Var.w1, mf.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
                org.telegram.ui.ActionBar.x q10 = this.a.q();
                q10.setGlassMode(true);
                q10.setTranslationX(-org.telegram.messenger.g0.L(7.0f));
                q10.a(3, R.drawable.outline_header_search);
                gi.d dVar3 = new gi.d(getContext(), b0Var.J0, true);
                b0Var.q1 = dVar3;
                dVar3.f();
                b0Var.q1.setText(bd.M0(2131747839, null));
                b0Var.q1.setOnClickListener(new ii.m(this, 4));
                if (z10) {
                    b0Var.q1.setVisibility(8);
                }
                this.c.addView(b0Var.q1, mf.f(48.0f, -1, 80, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.n));
                a();
                break;
        }
    }

    @Override // ji.z
    public float b() {
        switch (this.h) {
            case 0:
                return v9.a(this.n.k1.e) * super.b();
            default:
                return super.b();
        }
    }

    @Override // ji.z
    public void c() {
        switch (this.h) {
            case 0:
                super.c();
                this.n.w1.setTranslationY(Math.max(org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.m, b() + org.telegram.messenger.g0.L(4.0f)));
                break;
            default:
                super.c();
                break;
        }
    }
}
