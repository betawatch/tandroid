package fh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import gh.o8;
import gh.oa;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e2 extends k41 {
    public static final /* synthetic */ int a = 0;

    static {
        k41.setup(new e2());
    }

    public static l41 a(int i9, TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        l41 J = l41.J(e2.class);
        J.u = 1;
        J.z = i9;
        J.G = starGift;
        J.e = z10;
        J.H = Boolean.valueOf(z11);
        J.r = z13;
        J.q = z12;
        J.t = z14;
        return J;
    }

    @Override // org.telegram.ui.Components.k41
    public final void attachedView(wk0 wk0Var, View view, l41 l41Var) {
        ((f2) view).d(l41Var.h, false);
    }

    @Override // org.telegram.ui.Components.k41
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        f2 f2Var = (f2) view;
        Object obj = l41Var.G;
        boolean z11 = false;
        if (obj instanceof zf.k) {
            zf.k kVar = (zf.k) obj;
            d2 d2Var = f2Var.F;
            TextView textView = f2Var.E;
            TextView textView2 = f2Var.D;
            b2 b2Var = f2Var.e;
            o9 o9Var = f2Var.y;
            TextView textView3 = f2Var.H;
            TextView textView4 = f2Var.I;
            int d = kVar.d();
            if (f2Var.d0 != kVar) {
                o8 c12 = oa.c1(o9Var, o9Var.getImageReceiver(), d);
                f2Var.J = c12;
                c12.run();
                f2Var.J = null;
            }
            b2Var.d(null);
            b2Var.e(null);
            b2Var.g(null);
            textView2.setText(LocaleController.formatPluralString("Gift2Months", d, new Object[0]));
            textView.setText(LocaleController.getString(R.string.TelegramPremiumShort));
            textView2.setVisibility(0);
            textView.setVisibility(0);
            o9Var.setTranslationY(-AndroidUtilities.dp(8.0f));
            f2Var.n.setVisibility(8);
            f2Var.B.setVisibility(8);
            if (kVar.c == null && kVar.d == null) {
                textView4.setVisibility(8);
            } else {
                textView4.setTextColor(org.telegram.ui.ActionBar.f6.I.q() ? -1333971 : -2722014);
                textView4.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("" + LocaleController.formatNumber(kVar.g(), ','));
                spannableStringBuilder.setSpan(new i41(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                eq[] eqVarArr = new eq[1];
                textView4.setText(oa.X0(false, LocaleController.formatSpannable(R.string.PremiumOrStarsPrice, spannableStringBuilder), 0.48f, eqVarArr));
                eqVarArr[0].spaceScaleX = 0.8f;
            }
            FrameLayout.LayoutParams layoutParams = f2Var.A;
            layoutParams.gravity = 49;
            o9Var.setLayoutParams(layoutParams);
            textView3.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView3.setTextSize(1, 12.0f);
            textView3.setText(kVar.c());
            f2Var.G.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(13.0f), 422810068));
            textView3.setTextColor(-13397548);
            ((ViewGroup.MarginLayoutParams) d2Var.getLayoutParams()).topMargin = AndroidUtilities.dp(130.0f);
            ((FrameLayout.LayoutParams) d2Var.getLayoutParams()).gravity = 49;
            f2Var.d0 = kVar;
            f2Var.e0 = null;
            f2Var.R = kVar;
            f2Var.S = null;
            f2Var.U = false;
            f2Var.V = null;
            f2Var.W = false;
            f2Var.a0 = false;
            f2Var.b0 = false;
            f2Var.K = null;
            f2Var.L = null;
            f2Var.c(false, false);
            f2Var.j();
        } else if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z12 = l41Var.e;
            Object obj2 = l41Var.H;
            f2Var.g(starGift, z12, obj2 instanceof Boolean ? ((Boolean) obj2).booleanValue() : false, l41Var.q, l41Var.r, l41Var.t);
        } else if (obj instanceof TL_stars.SavedStarGift) {
            z11 = f2Var.h((TL_stars.SavedStarGift) obj, l41Var.q, l41Var.r);
        }
        if (l41Var.f) {
            f2Var.b(l41Var.e, z11);
        }
        f2Var.d(l41Var.h, z11);
        f2Var.d.setAlpha(l41Var.g ? 1.0f : 0.65f);
        f2Var.f.setAlpha(l41Var.g ? 1.0f : 0.5f);
    }

    @Override // org.telegram.ui.Components.k41
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        return new f2(context, i9, b6Var);
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean equals(l41 l41Var, l41 l41Var2) {
        if (l41Var.q != l41Var2.q) {
            return false;
        }
        Object obj = l41Var.G;
        if (obj != null || l41Var2.G != null) {
            if (obj instanceof zf.k) {
                return obj == l41Var2.G;
            }
            if (obj instanceof TL_stars.StarGift) {
                Object obj2 = l41Var2.G;
                if (obj2 instanceof TL_stars.StarGift) {
                    return ((TL_stars.StarGift) obj).id == ((TL_stars.StarGift) obj2).id;
                }
            }
            if (obj instanceof TL_stars.SavedStarGift) {
                Object obj3 = l41Var2.G;
                if (obj3 instanceof TL_stars.SavedStarGift) {
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                    TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj3;
                    return savedStarGift.gift.id == savedStarGift2.gift.id && savedStarGift.date == savedStarGift2.date && savedStarGift.saved_id == savedStarGift2.saved_id;
                }
            }
        }
        return l41Var.z == l41Var2.z && l41Var.e == l41Var2.e && l41Var.B == l41Var2.B && TextUtils.equals(l41Var.l, l41Var2.l);
    }
}
