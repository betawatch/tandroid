package cg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import bg.x2;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.x6;
import org.telegram.ui.Components.fn;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.y80;
import org.telegram.ui.fw0;
import org.telegram.ui.qv0;
import org.telegram.ui.th;
import org.telegram.ui.ua1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class e2 extends il0 {
    public final /* synthetic */ f2 c;

    public e2(f2 f2Var) {
        this.c = f2Var;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return n1Var.f == 1;
    }

    @Override // f2.p0
    public final int h() {
        return this.c.b0;
    }

    @Override // f2.p0
    public final int j(int i10) {
        f2 f2Var = this.c;
        if (i10 == f2Var.c0) {
            return 0;
        }
        if (i10 >= f2Var.d0 && i10 < f2Var.e0) {
            return f2Var.X();
        }
        if (i10 >= f2Var.f0 && i10 < f2Var.g0) {
            return 1;
        }
        if (i10 == f2Var.h0) {
            return 2;
        }
        if (i10 == f2Var.i0) {
            return 3;
        }
        if (i10 == 0) {
            return 4;
        }
        return i10 == f2Var.j0 ? 5 : 0;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        View view = n1Var.a;
        f2 f2Var = this.c;
        int i11 = f2Var.f0;
        if (i10 >= i11 && i10 < f2Var.g0) {
            ((qv0) view).a((fw0) f2Var.T.get(i10 - i11), i10 != f2Var.g0 - 1);
        } else {
            if (i10 < f2Var.d0 || i10 >= f2Var.e0) {
                return;
            }
            f2Var.Y(view);
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        c6 c6Var;
        c6 c6Var2;
        View view;
        c6 c6Var3;
        c6 c6Var4;
        Context context = viewGroup.getContext();
        f2 f2Var = this.c;
        View Z = f2Var.Z(context, i10);
        if (Z != null) {
            return th.m(Z, Z, -1, -2);
        }
        if (i10 == 0) {
            ua1 ua1Var = new ua1(this, context, 1);
            f2Var.o0 = ua1Var;
            ua1Var.setOrientation(1);
            View view2 = f2Var.x0;
            if (view2 == null) {
                f2Var.n0 = new i(context, 1, 0, 1);
                Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                int i11 = g6.Mj;
                canvas.drawColor(i0.a.d(0.5f, f2Var.getThemedColor(i11), f2Var.getThemedColor(g6.h5)));
                f2Var.n0.setBackgroundBitmap(createBitmap);
                dg.a aVar = f2Var.n0.b;
                aVar.w = i11;
                aVar.x = g6.Lj;
                aVar.b();
                ua1Var.addView(f2Var.n0, f6.q(160, 160, 1));
            } else {
                if (view2.getParent() != null) {
                    ((ViewGroup) f2Var.x0.getParent()).removeView(f2Var.x0);
                }
                f2Var.W(ua1Var);
            }
            if (f2Var.J0 == null) {
                FrameLayout frameLayout = new FrameLayout(context);
                f2Var.J0 = frameLayout;
                frameLayout.setClipChildren(false);
                Integer num = f2Var.q0;
                new PorterDuffColorFilter(num == null ? f2Var.getThemedColor(g6.v6) : num.intValue(), PorterDuff.Mode.SRC_IN);
                f2Var.K0 = new y80[2];
                int i12 = 0;
                while (i12 < 2) {
                    y80[] y80VarArr = f2Var.K0;
                    c6Var2 = ((f3) f2Var).resourcesProvider;
                    y80VarArr[i12] = new c2(context, 0, c6Var2);
                    f2Var.K0[i12].setVisibility(i12 == 0 ? 0 : 8);
                    f2Var.K0[i12].setTextSize(1, 16.0f);
                    f2Var.K0[i12].setTypeface(AndroidUtilities.bold());
                    f2Var.K0[i12].setGravity(1);
                    f2Var.K0[i12].setTextColor(f2Var.getThemedColor(g6.G6));
                    f2Var.K0[i12].setLinkTextColor(f2Var.getThemedColor(g6.J6));
                    f2Var.J0.addView(f2Var.K0[i12], f6.c(-2.0f, -1));
                    i12++;
                }
            }
            if (f2Var.J0.getParent() != null) {
                ((ViewGroup) f2Var.J0.getParent()).removeView(f2Var.J0);
            }
            ua1Var.addView(f2Var.J0, f6.p(-2, -2, 0.0f, 1, 40, 0, 40, 0));
            if (f2Var.L0 == null) {
                Context context2 = f2Var.getContext();
                c6Var = ((f3) f2Var).resourcesProvider;
                y80 y80Var = new y80(context2, c6Var);
                f2Var.L0 = y80Var;
                y80Var.setTextSize(1, 14.0f);
                f2Var.L0.setGravity(1);
                f2Var.L0.setTextColor(f2Var.getThemedColor(g6.G6));
                f2Var.L0.setLinkTextColor(f2Var.getThemedColor(g6.J6));
            }
            if (f2Var.L0.getParent() != null) {
                ((ViewGroup) f2Var.L0.getParent()).removeView(f2Var.L0);
            }
            ua1Var.addView(f2Var.L0, f6.p(-1, -2, 0.0f, 0, 24, 9, 24, 20));
            f2Var.a0(false);
            f2Var.m0 = new h(context, 1);
            x2 x2Var = new x2(this, context, 5);
            x2Var.setClipChildren(false);
            x2Var.addView(f2Var.m0);
            x2Var.addView(ua1Var);
            i iVar = f2Var.n0;
            view = x2Var;
            if (iVar != null) {
                iVar.setStarParticlesView(f2Var.m0);
                view = x2Var;
            }
        } else if (i10 == 2) {
            view = new x6(context, f2Var.getThemedColor(g6.a7), 0);
        } else if (i10 == 3) {
            view = new fn(context, 2);
        } else if (i10 == 4) {
            view = new a(context);
        } else if (i10 != 5) {
            c6Var4 = ((f3) f2Var).resourcesProvider;
            view = new d2(this, context, c6Var4);
        } else {
            c6Var3 = ((f3) f2Var).resourcesProvider;
            gg.f0 f0Var = new gg.f0(context, c6Var3);
            f0Var.setBackground(true);
            String string = LocaleController.getString("GiftPremiumPrivacyPolicyAndTerms", R.string.GiftPremiumPrivacyPolicyAndTerms);
            int i13 = g6.gc;
            final int i14 = 0;
            final int i15 = 1;
            f0Var.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceSingleTag(string, i13, 0, new Runnable(this) { // from class: cg.b2
                public final /* synthetic */ e2 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i14) {
                        case 0:
                            ye.d.s(this.b.c.p0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                            break;
                        default:
                            ye.d.s(this.b.c.p0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                    }
                }
            }), AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumPrivacyPolicy", R.string.GiftPremiumPrivacyPolicy), i13, 0, new Runnable(this) { // from class: cg.b2
                public final /* synthetic */ e2 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i15) {
                        case 0:
                            ye.d.s(this.b.c.p0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                            break;
                        default:
                            ye.d.s(this.b.c.p0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                    }
                }
            })));
            view = f0Var;
        }
        view.setLayoutParams(new f2.x0(-1, -2));
        f2Var.V(i10, view);
        return new vk0(view);
    }
}
