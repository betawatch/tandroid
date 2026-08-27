package ag;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Cells.w6;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.zm;
import org.telegram.ui.gw0;
import org.telegram.ui.ra1;
import org.telegram.ui.rv0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class x2 extends yk0 {
    public final /* synthetic */ y2 c;

    public x2(y2 y2Var) {
        this.c = y2Var;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return o1Var.f == 1;
    }

    @Override // f2.q0
    public final int h() {
        return this.c.b0;
    }

    @Override // f2.q0
    public final int j(int i10) {
        y2 y2Var = this.c;
        if (i10 == y2Var.c0) {
            return 0;
        }
        if (i10 >= y2Var.d0 && i10 < y2Var.e0) {
            return y2Var.X();
        }
        if (i10 >= y2Var.f0 && i10 < y2Var.g0) {
            return 1;
        }
        if (i10 == y2Var.h0) {
            return 2;
        }
        if (i10 == y2Var.i0) {
            return 3;
        }
        if (i10 == 0) {
            return 4;
        }
        return i10 == y2Var.j0 ? 5 : 0;
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        View view = o1Var.a;
        y2 y2Var = this.c;
        int i11 = y2Var.f0;
        if (i10 >= i11 && i10 < y2Var.g0) {
            ((rv0) view).a((gw0) y2Var.T.get(i10 - i11), i10 != y2Var.g0 - 1);
        } else {
            if (i10 < y2Var.d0 || i10 >= y2Var.e0) {
                return;
            }
            y2Var.Y(view);
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        c6 c6Var;
        c6 c6Var2;
        View view;
        c6 c6Var3;
        c6 c6Var4;
        Context context = viewGroup.getContext();
        y2 y2Var = this.c;
        View Z = y2Var.Z(context, i10);
        if (Z != null) {
            return pa.l(Z, Z, -1, -2);
        }
        if (i10 == 0) {
            ra1 ra1Var = new ra1(this, context, 1);
            y2Var.o0 = ra1Var;
            ra1Var.setOrientation(1);
            View view2 = y2Var.x0;
            if (view2 == null) {
                y2Var.n0 = new k(context, 1, 0, 1);
                Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                int i11 = g6.Mj;
                canvas.drawColor(i0.b.d(0.5f, y2Var.getThemedColor(i11), y2Var.getThemedColor(g6.h5)));
                y2Var.n0.setBackgroundBitmap(createBitmap);
                bg.a aVar = y2Var.n0.b;
                aVar.w = i11;
                aVar.x = g6.Lj;
                aVar.b();
                ra1Var.addView(y2Var.n0, z5.q(160, 160, 1));
            } else {
                if (view2.getParent() != null) {
                    ((ViewGroup) y2Var.x0.getParent()).removeView(y2Var.x0);
                }
                y2Var.W(ra1Var);
            }
            if (y2Var.J0 == null) {
                FrameLayout frameLayout = new FrameLayout(context);
                y2Var.J0 = frameLayout;
                frameLayout.setClipChildren(false);
                Integer num = y2Var.q0;
                new PorterDuffColorFilter(num == null ? y2Var.getThemedColor(g6.v6) : num.intValue(), PorterDuff.Mode.SRC_IN);
                y2Var.K0 = new p80[2];
                int i12 = 0;
                while (i12 < 2) {
                    p80[] p80VarArr = y2Var.K0;
                    c6Var2 = ((org.telegram.ui.ActionBar.e3) y2Var).resourcesProvider;
                    p80VarArr[i12] = new v2(context, 0, c6Var2);
                    y2Var.K0[i12].setVisibility(i12 == 0 ? 0 : 8);
                    y2Var.K0[i12].setTextSize(1, 16.0f);
                    y2Var.K0[i12].setTypeface(AndroidUtilities.bold());
                    y2Var.K0[i12].setGravity(1);
                    y2Var.K0[i12].setTextColor(y2Var.getThemedColor(g6.G6));
                    y2Var.K0[i12].setLinkTextColor(y2Var.getThemedColor(g6.J6));
                    y2Var.J0.addView(y2Var.K0[i12], z5.c(-2.0f, -1));
                    i12++;
                }
            }
            if (y2Var.J0.getParent() != null) {
                ((ViewGroup) y2Var.J0.getParent()).removeView(y2Var.J0);
            }
            ra1Var.addView(y2Var.J0, z5.p(-2, -2, 0.0f, 1, 40, 0, 40, 0));
            if (y2Var.L0 == null) {
                Context context2 = y2Var.getContext();
                c6Var = ((org.telegram.ui.ActionBar.e3) y2Var).resourcesProvider;
                p80 p80Var = new p80(context2, c6Var);
                y2Var.L0 = p80Var;
                p80Var.setTextSize(1, 14.0f);
                y2Var.L0.setGravity(1);
                y2Var.L0.setTextColor(y2Var.getThemedColor(g6.G6));
                y2Var.L0.setLinkTextColor(y2Var.getThemedColor(g6.J6));
            }
            if (y2Var.L0.getParent() != null) {
                ((ViewGroup) y2Var.L0.getParent()).removeView(y2Var.L0);
            }
            ra1Var.addView(y2Var.L0, z5.p(-1, -2, 0.0f, 0, 24, 9, 24, 20));
            y2Var.a0(false);
            y2Var.m0 = new j(context, 1);
            p1 p1Var = new p1(this, context, 2);
            p1Var.setClipChildren(false);
            p1Var.addView(y2Var.m0);
            p1Var.addView(ra1Var);
            k kVar = y2Var.n0;
            view = p1Var;
            if (kVar != null) {
                kVar.setStarParticlesView(y2Var.m0);
                view = p1Var;
            }
        } else if (i10 == 2) {
            view = new w6(context, y2Var.getThemedColor(g6.a7), 0);
        } else if (i10 == 3) {
            view = new zm(context, 2);
        } else if (i10 == 4) {
            view = new a(context);
        } else if (i10 != 5) {
            c6Var4 = ((org.telegram.ui.ActionBar.e3) y2Var).resourcesProvider;
            view = new w2(this, context, c6Var4);
        } else {
            c6Var3 = ((org.telegram.ui.ActionBar.e3) y2Var).resourcesProvider;
            eg.g0 g0Var = new eg.g0(context, c6Var3);
            g0Var.setBackground(true);
            String string = LocaleController.getString("GiftPremiumPrivacyPolicyAndTerms", R.string.GiftPremiumPrivacyPolicyAndTerms);
            int i13 = g6.gc;
            final int i14 = 0;
            final int i15 = 1;
            g0Var.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceSingleTag(string, i13, 0, new Runnable(this) { // from class: ag.u2
                public final /* synthetic */ x2 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i14) {
                        case 0:
                            we.e.s(this.b.c.p0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                            break;
                        default:
                            we.e.s(this.b.c.p0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                    }
                }
            }), AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumPrivacyPolicy", R.string.GiftPremiumPrivacyPolicy), i13, 0, new Runnable(this) { // from class: ag.u2
                public final /* synthetic */ x2 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i15) {
                        case 0:
                            we.e.s(this.b.c.p0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                            break;
                        default:
                            we.e.s(this.b.c.p0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                    }
                }
            })));
            view = g0Var;
        }
        view.setLayoutParams(new f2.y0(-1, -2));
        y2Var.V(i10, view);
        return new lk0(view);
    }
}
