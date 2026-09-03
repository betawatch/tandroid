package kh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import lh.ja;
import lh.l8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class w1 extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new w1());
    }

    public static i51 a(int i10, TL_stars.StarGift starGift, boolean z4, boolean z10, boolean z11, boolean z12, boolean z13) {
        i51 J = i51.J(w1.class);
        J.u = 1;
        J.z = i10;
        J.G = starGift;
        J.e = z4;
        J.H = Boolean.valueOf(z10);
        J.r = z12;
        J.q = z11;
        J.t = z13;
        return J;
    }

    @Override // org.telegram.ui.Components.h51
    public final void attachedView(rl0 rl0Var, View view, i51 i51Var) {
        ((x1) view).d(i51Var.h, false);
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        x1 x1Var = (x1) view;
        Object obj = i51Var.G;
        boolean z10 = false;
        if (obj instanceof eg.n) {
            eg.n nVar = (eg.n) obj;
            dg.u2 u2Var = x1Var.G;
            TextView textView = x1Var.F;
            TextView textView2 = x1Var.E;
            u1 u1Var = x1Var.e;
            p9 p9Var = x1Var.y;
            TextView textView3 = x1Var.I;
            TextView textView4 = x1Var.J;
            int d = nVar.d();
            if (x1Var.e0 != nVar) {
                l8 c12 = ja.c1(p9Var, p9Var.getImageReceiver(), d);
                x1Var.K = c12;
                c12.run();
                x1Var.K = null;
            }
            u1Var.d(null);
            u1Var.e(null);
            u1Var.g(null);
            textView2.setText(LocaleController.formatPluralString("Gift2Months", d, new Object[0]));
            textView.setText(LocaleController.getString(R.string.TelegramPremiumShort));
            textView2.setVisibility(0);
            textView.setVisibility(0);
            p9Var.setTranslationY(-AndroidUtilities.dp(8.0f));
            x1Var.n.setVisibility(8);
            x1Var.C.setVisibility(8);
            if (nVar.c == null && nVar.d == null) {
                textView4.setVisibility(8);
            } else {
                textView4.setTextColor(j6.I.q() ? -1333971 : -2722014);
                textView4.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("" + LocaleController.formatNumber(nVar.g(), ','));
                spannableStringBuilder.setSpan(new f51(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                lq[] lqVarArr = new lq[1];
                textView4.setText(ja.X0(false, LocaleController.formatSpannable(R.string.PremiumOrStarsPrice, spannableStringBuilder), 0.48f, lqVarArr));
                lqVarArr[0].spaceScaleX = 0.8f;
            }
            FrameLayout.LayoutParams layoutParams = x1Var.B;
            layoutParams.gravity = 49;
            p9Var.setLayoutParams(layoutParams);
            textView3.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView3.setTextSize(1, 12.0f);
            textView3.setText(nVar.c());
            x1Var.H.setBackground(j6.b0(AndroidUtilities.dp(13.0f), 422810068));
            textView3.setTextColor(-13397548);
            ((ViewGroup.MarginLayoutParams) u2Var.getLayoutParams()).topMargin = AndroidUtilities.dp(130.0f);
            ((FrameLayout.LayoutParams) u2Var.getLayoutParams()).gravity = 49;
            x1Var.e0 = nVar;
            x1Var.f0 = null;
            x1Var.S = nVar;
            x1Var.T = null;
            x1Var.V = false;
            x1Var.W = null;
            x1Var.a0 = false;
            x1Var.b0 = false;
            x1Var.c0 = false;
            x1Var.L = null;
            x1Var.M = null;
            x1Var.c(false, false);
            x1Var.j();
        } else if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z11 = i51Var.e;
            Object obj2 = i51Var.H;
            x1Var.g(starGift, z11, obj2 instanceof Boolean ? ((Boolean) obj2).booleanValue() : false, i51Var.q, i51Var.r, i51Var.t);
        } else if (obj instanceof TL_stars.SavedStarGift) {
            z10 = x1Var.h((TL_stars.SavedStarGift) obj, i51Var.q, i51Var.r);
        }
        if (i51Var.f) {
            x1Var.b(i51Var.e, z10);
        }
        x1Var.d(i51Var.h, z10);
        x1Var.d.setAlpha(i51Var.g ? 1.0f : 0.65f);
        x1Var.f.setAlpha(i51Var.g ? 1.0f : 0.5f);
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, rl0 rl0Var, int i10, int i11, f6 f6Var) {
        return new x1(context, i10, f6Var);
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean equals(i51 i51Var, i51 i51Var2) {
        if (i51Var.q != i51Var2.q) {
            return false;
        }
        Object obj = i51Var.G;
        if (obj != null || i51Var2.G != null) {
            if (obj instanceof eg.n) {
                return obj == i51Var2.G;
            }
            if (obj instanceof TL_stars.StarGift) {
                Object obj2 = i51Var2.G;
                if (obj2 instanceof TL_stars.StarGift) {
                    return ((TL_stars.StarGift) obj).id == ((TL_stars.StarGift) obj2).id;
                }
            }
            if (obj instanceof TL_stars.SavedStarGift) {
                Object obj3 = i51Var2.G;
                if (obj3 instanceof TL_stars.SavedStarGift) {
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                    TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj3;
                    return savedStarGift.gift.id == savedStarGift2.gift.id && savedStarGift.date == savedStarGift2.date && savedStarGift.saved_id == savedStarGift2.saved_id;
                }
            }
        }
        return i51Var.z == i51Var2.z && i51Var.e == i51Var2.e && i51Var.B == i51Var2.B && TextUtils.equals(i51Var.l, i51Var2.l);
    }
}
