package ai;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import ci.ma;
import ci.wb;
import org.telegram.messenger.bd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.o31;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.wp;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class p2 extends q31 {
    public static final /* synthetic */ int b = 0;

    static {
        q31.h(new p2());
    }

    public static r31 i(int i3, TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        r31 K = r31.K(p2.class);
        K.u = 1;
        K.z = i3;
        K.G = starGift;
        K.e = z10;
        K.H = Boolean.valueOf(z11);
        K.r = z13;
        K.q = z12;
        K.t = z14;
        return K;
    }

    @Override // org.telegram.ui.Components.q31
    public final void a(tj0 tj0Var, View view, r31 r31Var) {
        ((q2) view).e(r31Var.h, false);
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        q2 q2Var = (q2) view;
        Object obj = r31Var.G;
        boolean z11 = false;
        if (obj instanceof vg.j) {
            vg.j jVar = (vg.j) obj;
            o2 o2Var = q2Var.K;
            TextView textView = q2Var.J;
            TextView textView2 = q2Var.I;
            m2 m2Var = q2Var.e;
            k9 k9Var = q2Var.E;
            TextView textView3 = q2Var.M;
            TextView textView4 = q2Var.N;
            int d = jVar.d();
            if (q2Var.k0 != jVar) {
                ma f12 = wb.f1(k9Var, k9Var.getImageReceiver(), d);
                q2Var.O = f12;
                f12.run();
                q2Var.O = null;
            }
            m2Var.d(null);
            m2Var.e(null);
            m2Var.g(null);
            textView2.setText(bd.G(d, "Gift2Months", new Object[0]));
            textView.setText(bd.M0(2131744240, null));
            textView2.setVisibility(0);
            textView.setVisibility(0);
            k9Var.setTranslationY(-org.telegram.messenger.g0.L(8.0f));
            q2Var.n.setVisibility(8);
            q2Var.G.setVisibility(8);
            if (jVar.c == null && jVar.d == null) {
                textView4.setVisibility(8);
            } else {
                textView4.setTextColor(org.telegram.ui.ActionBar.k6.I.q() ? -1333971 : -2722014);
                textView4.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("" + bd.E(jVar.g(), ','));
                spannableStringBuilder.setSpan(new o31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
                wp[] wpVarArr = new wp[1];
                textView4.setText(wb.a1(false, bd.V(null, null, 2131747036, spannableStringBuilder), 0.48f, wpVarArr));
                wpVarArr[0].H = 0.8f;
            }
            FrameLayout.LayoutParams layoutParams = q2Var.F;
            layoutParams.gravity = 49;
            k9Var.setLayoutParams(layoutParams);
            textView3.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
            textView3.setTextSize(1, 12.0f);
            textView3.setText(jVar.c());
            q2Var.t0 = 0;
            q2Var.L.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(13.0f), 422810068));
            textView3.setTextColor(-13397548);
            ((ViewGroup.MarginLayoutParams) o2Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(130.0f);
            ((FrameLayout.LayoutParams) o2Var.getLayoutParams()).gravity = 49;
            q2Var.k0 = jVar;
            q2Var.l0 = null;
            q2Var.b0 = jVar;
            q2Var.c0 = null;
            q2Var.e0 = false;
            q2Var.f0 = null;
            q2Var.g0 = false;
            q2Var.h0 = false;
            q2Var.i0 = false;
            q2Var.R = null;
            q2Var.S = null;
            q2Var.d(false, false);
            q2Var.l();
        } else if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z12 = r31Var.e;
            Object obj2 = r31Var.H;
            q2Var.h(starGift, z12, obj2 instanceof Boolean ? ((Boolean) obj2).booleanValue() : false, r31Var.q, r31Var.r, r31Var.t);
        } else if (obj instanceof TL_stars.SavedStarGift) {
            z11 = q2Var.i((TL_stars.SavedStarGift) obj, r31Var.q, r31Var.r);
        }
        if (r31Var.f) {
            q2Var.c(r31Var.e, z11);
        }
        q2Var.e(r31Var.h, z11);
        q2Var.d.setAlpha(r31Var.g ? 1.0f : 0.65f);
        q2Var.f.setAlpha(r31Var.g ? 1.0f : 0.5f);
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new q2(i3, context, e6Var);
    }

    @Override // org.telegram.ui.Components.q31
    public final boolean e(r31 r31Var, r31 r31Var2) {
        if (r31Var.q != r31Var2.q) {
            return false;
        }
        Object obj = r31Var.G;
        if (obj != null || r31Var2.G != null) {
            if (obj instanceof vg.j) {
                return obj == r31Var2.G;
            }
            if (obj instanceof TL_stars.StarGift) {
                Object obj2 = r31Var2.G;
                if (obj2 instanceof TL_stars.StarGift) {
                    return ((TL_stars.StarGift) obj).id == ((TL_stars.StarGift) obj2).id;
                }
            }
            if (obj instanceof TL_stars.SavedStarGift) {
                Object obj3 = r31Var2.G;
                if (obj3 instanceof TL_stars.SavedStarGift) {
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                    TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj3;
                    return savedStarGift.gift.id == savedStarGift2.gift.id && savedStarGift.date == savedStarGift2.date && savedStarGift.saved_id == savedStarGift2.saved_id;
                }
            }
        }
        return r31Var.z == r31Var2.z && r31Var.e == r31Var2.e && r31Var.B == r31Var2.B && TextUtils.equals(r31Var.l, r31Var2.l);
    }
}
