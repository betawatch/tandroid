package ih;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import jh.ia;
import jh.k8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class x1 extends v41 {
    public static final /* synthetic */ int a = 0;

    static {
        v41.setup(new x1());
    }

    public static w41 a(int i10, TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        w41 J = w41.J(x1.class);
        J.u = 1;
        J.z = i10;
        J.G = starGift;
        J.e = z10;
        J.H = Boolean.valueOf(z11);
        J.r = z13;
        J.q = z12;
        J.t = z14;
        return J;
    }

    @Override // org.telegram.ui.Components.v41
    public final void attachedView(jl0 jl0Var, View view, w41 w41Var) {
        ((y1) view).d(w41Var.h, false);
    }

    @Override // org.telegram.ui.Components.v41
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        y1 y1Var = (y1) view;
        Object obj = w41Var.G;
        boolean z11 = false;
        if (obj instanceof cg.n) {
            cg.n nVar = (cg.n) obj;
            bg.x2 x2Var = y1Var.F;
            TextView textView = y1Var.E;
            TextView textView2 = y1Var.D;
            v1 v1Var = y1Var.e;
            t9 t9Var = y1Var.y;
            TextView textView3 = y1Var.H;
            TextView textView4 = y1Var.I;
            int d = nVar.d();
            if (y1Var.d0 != nVar) {
                k8 c12 = ia.c1(t9Var, t9Var.getImageReceiver(), d);
                y1Var.J = c12;
                c12.run();
                y1Var.J = null;
            }
            v1Var.d(null);
            v1Var.e(null);
            v1Var.g(null);
            textView2.setText(LocaleController.formatPluralString("Gift2Months", d, new Object[0]));
            textView.setText(LocaleController.getString(R.string.TelegramPremiumShort));
            textView2.setVisibility(0);
            textView.setVisibility(0);
            t9Var.setTranslationY(-AndroidUtilities.dp(8.0f));
            y1Var.n.setVisibility(8);
            y1Var.B.setVisibility(8);
            if (nVar.c == null && nVar.d == null) {
                textView4.setVisibility(8);
            } else {
                textView4.setTextColor(g6.I.q() ? -1333971 : -2722014);
                textView4.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("" + LocaleController.formatNumber(nVar.g(), ','));
                spannableStringBuilder.setSpan(new t41(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                iq[] iqVarArr = new iq[1];
                textView4.setText(ia.X0(false, LocaleController.formatSpannable(R.string.PremiumOrStarsPrice, spannableStringBuilder), 0.48f, iqVarArr));
                iqVarArr[0].spaceScaleX = 0.8f;
            }
            FrameLayout.LayoutParams layoutParams = y1Var.A;
            layoutParams.gravity = 49;
            t9Var.setLayoutParams(layoutParams);
            textView3.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView3.setTextSize(1, 12.0f);
            textView3.setText(nVar.c());
            y1Var.G.setBackground(g6.b0(AndroidUtilities.dp(13.0f), 422810068));
            textView3.setTextColor(-13397548);
            ((ViewGroup.MarginLayoutParams) x2Var.getLayoutParams()).topMargin = AndroidUtilities.dp(130.0f);
            ((FrameLayout.LayoutParams) x2Var.getLayoutParams()).gravity = 49;
            y1Var.d0 = nVar;
            y1Var.e0 = null;
            y1Var.R = nVar;
            y1Var.S = null;
            y1Var.U = false;
            y1Var.V = null;
            y1Var.W = false;
            y1Var.a0 = false;
            y1Var.b0 = false;
            y1Var.K = null;
            y1Var.L = null;
            y1Var.c(false, false);
            y1Var.j();
        } else if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z12 = w41Var.e;
            Object obj2 = w41Var.H;
            y1Var.g(starGift, z12, obj2 instanceof Boolean ? ((Boolean) obj2).booleanValue() : false, w41Var.q, w41Var.r, w41Var.t);
        } else if (obj instanceof TL_stars.SavedStarGift) {
            z11 = y1Var.h((TL_stars.SavedStarGift) obj, w41Var.q, w41Var.r);
        }
        if (w41Var.f) {
            y1Var.b(w41Var.e, z11);
        }
        y1Var.d(w41Var.h, z11);
        y1Var.d.setAlpha(w41Var.g ? 1.0f : 0.65f);
        y1Var.f.setAlpha(w41Var.g ? 1.0f : 0.5f);
    }

    @Override // org.telegram.ui.Components.v41
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new y1(context, i10, c6Var);
    }

    @Override // org.telegram.ui.Components.v41
    public final boolean equals(w41 w41Var, w41 w41Var2) {
        if (w41Var.q != w41Var2.q) {
            return false;
        }
        Object obj = w41Var.G;
        if (obj != null || w41Var2.G != null) {
            if (obj instanceof cg.n) {
                return obj == w41Var2.G;
            }
            if (obj instanceof TL_stars.StarGift) {
                Object obj2 = w41Var2.G;
                if (obj2 instanceof TL_stars.StarGift) {
                    return ((TL_stars.StarGift) obj).id == ((TL_stars.StarGift) obj2).id;
                }
            }
            if (obj instanceof TL_stars.SavedStarGift) {
                Object obj3 = w41Var2.G;
                if (obj3 instanceof TL_stars.SavedStarGift) {
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                    TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj3;
                    return savedStarGift.gift.id == savedStarGift2.gift.id && savedStarGift.date == savedStarGift2.date && savedStarGift.saved_id == savedStarGift2.saved_id;
                }
            }
        }
        return w41Var.z == w41Var2.z && w41Var.e == w41Var2.e && w41Var.B == w41Var2.B && TextUtils.equals(w41Var.l, w41Var2.l);
    }
}
