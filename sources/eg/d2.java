package eg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.y6;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.gn;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.ai;
import org.telegram.ui.gw0;
import org.telegram.ui.pb1;
import org.telegram.ui.ww0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class d2 extends ql0 {
    public final /* synthetic */ e2 c;

    public d2(e2 e2Var) {
        this.c = e2Var;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        return l1Var.f == 1;
    }

    @Override // f2.o0
    public final int h() {
        return this.c.c0;
    }

    @Override // f2.o0
    public final int j(int i10) {
        e2 e2Var = this.c;
        if (i10 == e2Var.d0) {
            return 0;
        }
        if (i10 >= e2Var.e0 && i10 < e2Var.f0) {
            return e2Var.X();
        }
        if (i10 >= e2Var.g0 && i10 < e2Var.h0) {
            return 1;
        }
        if (i10 == e2Var.i0) {
            return 2;
        }
        if (i10 == e2Var.j0) {
            return 3;
        }
        if (i10 == 0) {
            return 4;
        }
        return i10 == e2Var.k0 ? 5 : 0;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        View view = l1Var.a;
        e2 e2Var = this.c;
        int i11 = e2Var.g0;
        if (i10 >= i11 && i10 < e2Var.h0) {
            ((gw0) view).a((ww0) e2Var.U.get(i10 - i11), i10 != e2Var.h0 - 1);
        } else {
            if (i10 < e2Var.e0 || i10 >= e2Var.f0) {
                return;
            }
            e2Var.Y(view);
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        f6 f6Var;
        f6 f6Var2;
        View view;
        f6 f6Var3;
        f6 f6Var4;
        Context context = viewGroup.getContext();
        e2 e2Var = this.c;
        View Z = e2Var.Z(context, i10);
        if (Z != null) {
            return ai.n(Z, Z, -1, -2);
        }
        if (i10 == 0) {
            pb1 pb1Var = new pb1(this, context, 1);
            e2Var.p0 = pb1Var;
            pb1Var.setOrientation(1);
            View view2 = e2Var.y0;
            if (view2 == null) {
                e2Var.o0 = new i(context, 1, 0, 1);
                Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                int i11 = j6.Mj;
                canvas.drawColor(i0.a.d(0.5f, e2Var.getThemedColor(i11), e2Var.getThemedColor(j6.h5)));
                e2Var.o0.setBackgroundBitmap(createBitmap);
                fg.a aVar = e2Var.o0.b;
                aVar.w = i11;
                aVar.x = j6.Lj;
                aVar.b();
                pb1Var.addView(e2Var.o0, b6.q(160, 160, 1));
            } else {
                if (view2.getParent() != null) {
                    ((ViewGroup) e2Var.y0.getParent()).removeView(e2Var.y0);
                }
                e2Var.W(pb1Var);
            }
            if (e2Var.K0 == null) {
                FrameLayout frameLayout = new FrameLayout(context);
                e2Var.K0 = frameLayout;
                frameLayout.setClipChildren(false);
                Integer num = e2Var.r0;
                new PorterDuffColorFilter(num == null ? e2Var.getThemedColor(j6.v6) : num.intValue(), PorterDuff.Mode.SRC_IN);
                e2Var.L0 = new f90[2];
                int i12 = 0;
                while (i12 < 2) {
                    f90[] f90VarArr = e2Var.L0;
                    f6Var2 = ((g3) e2Var).resourcesProvider;
                    f90VarArr[i12] = new b2(context, 0, f6Var2);
                    e2Var.L0[i12].setVisibility(i12 == 0 ? 0 : 8);
                    e2Var.L0[i12].setTextSize(1, 16.0f);
                    e2Var.L0[i12].setTypeface(AndroidUtilities.bold());
                    e2Var.L0[i12].setGravity(1);
                    e2Var.L0[i12].setTextColor(e2Var.getThemedColor(j6.G6));
                    e2Var.L0[i12].setLinkTextColor(e2Var.getThemedColor(j6.J6));
                    e2Var.K0.addView(e2Var.L0[i12], b6.c(-2.0f, -1));
                    i12++;
                }
            }
            if (e2Var.K0.getParent() != null) {
                ((ViewGroup) e2Var.K0.getParent()).removeView(e2Var.K0);
            }
            pb1Var.addView(e2Var.K0, b6.p(-2, -2, 0.0f, 1, 40, 0, 40, 0));
            if (e2Var.M0 == null) {
                Context context2 = e2Var.getContext();
                f6Var = ((g3) e2Var).resourcesProvider;
                f90 f90Var = new f90(context2, f6Var);
                e2Var.M0 = f90Var;
                f90Var.setTextSize(1, 14.0f);
                e2Var.M0.setGravity(1);
                e2Var.M0.setTextColor(e2Var.getThemedColor(j6.G6));
                e2Var.M0.setLinkTextColor(e2Var.getThemedColor(j6.J6));
            }
            if (e2Var.M0.getParent() != null) {
                ((ViewGroup) e2Var.M0.getParent()).removeView(e2Var.M0);
            }
            pb1Var.addView(e2Var.M0, b6.p(-1, -2, 0.0f, 0, 24, 9, 24, 20));
            e2Var.a0(false);
            e2Var.n0 = new h(context, 1);
            dg.u2 u2Var = new dg.u2(this, context, 5);
            u2Var.setClipChildren(false);
            u2Var.addView(e2Var.n0);
            u2Var.addView(pb1Var);
            i iVar = e2Var.o0;
            view = u2Var;
            if (iVar != null) {
                iVar.setStarParticlesView(e2Var.n0);
                view = u2Var;
            }
        } else if (i10 == 2) {
            view = new y6(context, e2Var.getThemedColor(j6.a7), 0);
        } else if (i10 == 3) {
            view = new gn(context, 2);
        } else if (i10 == 4) {
            view = new a(context);
        } else if (i10 != 5) {
            f6Var4 = ((g3) e2Var).resourcesProvider;
            view = new c2(this, context, f6Var4);
        } else {
            f6Var3 = ((g3) e2Var).resourcesProvider;
            ig.f0 f0Var = new ig.f0(context, f6Var3);
            f0Var.setBackground(true);
            String string = LocaleController.getString("GiftPremiumPrivacyPolicyAndTerms", R.string.GiftPremiumPrivacyPolicyAndTerms);
            int i13 = j6.gc;
            final int i14 = 0;
            final int i15 = 1;
            f0Var.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceSingleTag(string, i13, 0, new Runnable(this) { // from class: eg.a2
                public final /* synthetic */ d2 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i14) {
                        case 0:
                            ze.d.s(this.b.c.q0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                            break;
                        default:
                            ze.d.s(this.b.c.q0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                    }
                }
            }), AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumPrivacyPolicy", R.string.GiftPremiumPrivacyPolicy), i13, 0, new Runnable(this) { // from class: eg.a2
                public final /* synthetic */ d2 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i15) {
                        case 0:
                            ze.d.s(this.b.c.q0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                            break;
                        default:
                            ze.d.s(this.b.c.q0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                    }
                }
            })));
            view = f0Var;
        }
        view.setLayoutParams(new f2.w0(-1, -2));
        e2Var.V(i10, view);
        return new dl0(view);
    }
}
