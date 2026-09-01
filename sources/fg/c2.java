package fg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.z6;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.bw0;
import org.telegram.ui.ib1;
import org.telegram.ui.rw0;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class c2 extends sl0 {
    public final /* synthetic */ d2 c;

    public c2(d2 d2Var) {
        this.c = d2Var;
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean D(f2.m1 m1Var) {
        return m1Var.f == 1;
    }

    @Override // f2.p0
    public final int h() {
        return this.c.c0;
    }

    @Override // f2.p0
    public final int j(int i10) {
        d2 d2Var = this.c;
        if (i10 == d2Var.d0) {
            return 0;
        }
        if (i10 >= d2Var.e0 && i10 < d2Var.f0) {
            return d2Var.X();
        }
        if (i10 >= d2Var.g0 && i10 < d2Var.h0) {
            return 1;
        }
        if (i10 == d2Var.i0) {
            return 2;
        }
        if (i10 == d2Var.j0) {
            return 3;
        }
        if (i10 == 0) {
            return 4;
        }
        return i10 == d2Var.k0 ? 5 : 0;
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        View view = m1Var.a;
        d2 d2Var = this.c;
        int i11 = d2Var.g0;
        if (i10 >= i11 && i10 < d2Var.h0) {
            ((bw0) view).a((rw0) d2Var.U.get(i10 - i11), i10 != d2Var.h0 - 1);
        } else {
            if (i10 < d2Var.e0 || i10 >= d2Var.f0) {
                return;
            }
            d2Var.Y(view);
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        g6 g6Var;
        g6 g6Var2;
        View view;
        g6 g6Var3;
        g6 g6Var4;
        Context context = viewGroup.getContext();
        d2 d2Var = this.c;
        View Z = d2Var.Z(context, i10);
        if (Z != null) {
            return yh.o(Z, Z, -1, -2);
        }
        if (i10 == 0) {
            ib1 ib1Var = new ib1(this, context, 1);
            d2Var.p0 = ib1Var;
            ib1Var.setOrientation(1);
            View view2 = d2Var.y0;
            if (view2 == null) {
                d2Var.o0 = new i(context, 1, 0, 1);
                Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                int i11 = k6.Mj;
                canvas.drawColor(i0.a.d(0.5f, d2Var.getThemedColor(i11), d2Var.getThemedColor(k6.h5)));
                d2Var.o0.setBackgroundBitmap(createBitmap);
                gg.a aVar = d2Var.o0.b;
                aVar.w = i11;
                aVar.x = k6.Lj;
                aVar.b();
                ib1Var.addView(d2Var.o0, c6.q(160, 160, 1));
            } else {
                if (view2.getParent() != null) {
                    ((ViewGroup) d2Var.y0.getParent()).removeView(d2Var.y0);
                }
                d2Var.W(ib1Var);
            }
            if (d2Var.K0 == null) {
                FrameLayout frameLayout = new FrameLayout(context);
                d2Var.K0 = frameLayout;
                frameLayout.setClipChildren(false);
                Integer num = d2Var.r0;
                new PorterDuffColorFilter(num == null ? d2Var.getThemedColor(k6.v6) : num.intValue(), PorterDuff.Mode.SRC_IN);
                d2Var.L0 = new g90[2];
                int i12 = 0;
                while (i12 < 2) {
                    g90[] g90VarArr = d2Var.L0;
                    g6Var2 = ((h3) d2Var).resourcesProvider;
                    g90VarArr[i12] = new a2(context, 0, g6Var2);
                    d2Var.L0[i12].setVisibility(i12 == 0 ? 0 : 8);
                    d2Var.L0[i12].setTextSize(1, 16.0f);
                    d2Var.L0[i12].setTypeface(AndroidUtilities.bold());
                    d2Var.L0[i12].setGravity(1);
                    d2Var.L0[i12].setTextColor(d2Var.getThemedColor(k6.G6));
                    d2Var.L0[i12].setLinkTextColor(d2Var.getThemedColor(k6.J6));
                    d2Var.K0.addView(d2Var.L0[i12], c6.c(-2.0f, -1));
                    i12++;
                }
            }
            if (d2Var.K0.getParent() != null) {
                ((ViewGroup) d2Var.K0.getParent()).removeView(d2Var.K0);
            }
            ib1Var.addView(d2Var.K0, c6.p(-2, -2, 0.0f, 1, 40, 0, 40, 0));
            if (d2Var.M0 == null) {
                Context context2 = d2Var.getContext();
                g6Var = ((h3) d2Var).resourcesProvider;
                g90 g90Var = new g90(context2, g6Var);
                d2Var.M0 = g90Var;
                g90Var.setTextSize(1, 14.0f);
                d2Var.M0.setGravity(1);
                d2Var.M0.setTextColor(d2Var.getThemedColor(k6.G6));
                d2Var.M0.setLinkTextColor(d2Var.getThemedColor(k6.J6));
            }
            if (d2Var.M0.getParent() != null) {
                ((ViewGroup) d2Var.M0.getParent()).removeView(d2Var.M0);
            }
            ib1Var.addView(d2Var.M0, c6.p(-1, -2, 0.0f, 0, 24, 9, 24, 20));
            d2Var.a0(false);
            d2Var.n0 = new h(context, 1);
            eg.s2 s2Var = new eg.s2(this, context, 5);
            s2Var.setClipChildren(false);
            s2Var.addView(d2Var.n0);
            s2Var.addView(ib1Var);
            i iVar = d2Var.o0;
            view = s2Var;
            if (iVar != null) {
                iVar.setStarParticlesView(d2Var.n0);
                view = s2Var;
            }
        } else if (i10 == 2) {
            view = new z6(context, d2Var.getThemedColor(k6.a7), 0);
        } else if (i10 == 3) {
            view = new jn(context, 2);
        } else if (i10 == 4) {
            view = new a(context);
        } else if (i10 != 5) {
            g6Var4 = ((h3) d2Var).resourcesProvider;
            view = new b2(this, context, g6Var4);
        } else {
            g6Var3 = ((h3) d2Var).resourcesProvider;
            jg.f0 f0Var = new jg.f0(context, g6Var3);
            f0Var.setBackground(true);
            String string = LocaleController.getString("GiftPremiumPrivacyPolicyAndTerms", R.string.GiftPremiumPrivacyPolicyAndTerms);
            int i13 = k6.gc;
            final int i14 = 0;
            final int i15 = 1;
            f0Var.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceSingleTag(string, i13, 0, new Runnable(this) { // from class: fg.z1
                public final /* synthetic */ c2 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i14) {
                        case 0:
                            af.g.s(this.b.c.q0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                            break;
                        default:
                            af.g.s(this.b.c.q0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                    }
                }
            }), AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumPrivacyPolicy", R.string.GiftPremiumPrivacyPolicy), i13, 0, new Runnable(this) { // from class: fg.z1
                public final /* synthetic */ c2 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i15) {
                        case 0:
                            af.g.s(this.b.c.q0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                            break;
                        default:
                            af.g.s(this.b.c.q0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                    }
                }
            })));
            view = f0Var;
        }
        view.setLayoutParams(new f2.x0(-1, -2));
        d2Var.V(i10, view);
        return new fl0(view);
    }
}
