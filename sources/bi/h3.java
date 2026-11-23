package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import di.fa;
import di.pb;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.p9;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class h3 extends m41 {
    public static final /* synthetic */ int b = 0;

    static {
        m41.h(new h3());
    }

    public static n41 i(int i7, TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        n41 K = n41.K(h3.class);
        K.v = 1;
        K.A = i7;
        K.H = starGift;
        K.e = z10;
        K.I = Boolean.valueOf(z11);
        K.s = z13;
        K.r = z12;
        K.u = z14;
        return K;
    }

    @Override // org.telegram.ui.Components.m41
    public final void a(ek0 ek0Var, View view, n41 n41Var) {
        ((i3) view).e(n41Var.h, false);
    }

    @Override // org.telegram.ui.Components.m41
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        i3 i3Var = (i3) view;
        Object obj = n41Var.H;
        boolean z11 = false;
        if (obj instanceof ug.j) {
            ug.j jVar = (ug.j) obj;
            g3 g3Var = i3Var.K;
            TextView textView = i3Var.J;
            TextView textView2 = i3Var.I;
            e3 e3Var = i3Var.e;
            p9 p9Var = i3Var.E;
            TextView textView3 = i3Var.M;
            TextView textView4 = i3Var.N;
            int d = jVar.d();
            if (i3Var.k0 != jVar) {
                fa g12 = pb.g1(p9Var, p9Var.getImageReceiver(), d);
                i3Var.O = g12;
                g12.run();
                i3Var.O = null;
            }
            e3Var.d(null);
            e3Var.e(null);
            e3Var.g(null);
            textView2.setText(gd.G(d, "Gift2Months", new Object[0]));
            textView.setText(gd.N0(2131743985, null));
            textView2.setVisibility(0);
            textView.setVisibility(0);
            p9Var.setTranslationY(-org.telegram.messenger.g0.L(8.0f));
            i3Var.n.setVisibility(8);
            i3Var.G.setVisibility(8);
            if (jVar.c == null && jVar.d == null) {
                textView4.setVisibility(8);
            } else {
                textView4.setTextColor(org.telegram.ui.ActionBar.n6.I.q() ? -1333971 : -2722014);
                textView4.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("" + gd.E(jVar.g(), ','));
                spannableStringBuilder.setSpan(new k41(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
                kq[] kqVarArr = new kq[1];
                textView4.setText(pb.b1(false, gd.V(null, null, 2131746834, spannableStringBuilder), 0.48f, kqVarArr));
                kqVarArr[0].H = 0.8f;
            }
            FrameLayout.LayoutParams layoutParams = i3Var.F;
            layoutParams.gravity = 49;
            p9Var.setLayoutParams(layoutParams);
            textView3.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
            textView3.setTextSize(1, 12.0f);
            textView3.setText(jVar.c());
            i3Var.t0 = 0;
            i3Var.L.setBackground(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(13.0f), 422810068));
            textView3.setTextColor(-13397548);
            ((ViewGroup.MarginLayoutParams) g3Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(130.0f);
            ((FrameLayout.LayoutParams) g3Var.getLayoutParams()).gravity = 49;
            i3Var.k0 = jVar;
            i3Var.l0 = null;
            i3Var.b0 = jVar;
            i3Var.c0 = null;
            i3Var.e0 = false;
            i3Var.f0 = null;
            i3Var.g0 = false;
            i3Var.h0 = false;
            i3Var.i0 = false;
            i3Var.R = null;
            i3Var.S = null;
            i3Var.d(false, false);
            i3Var.l();
        } else if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z12 = n41Var.e;
            Object obj2 = n41Var.I;
            i3Var.h(starGift, z12, obj2 instanceof Boolean ? ((Boolean) obj2).booleanValue() : false, n41Var.r, n41Var.s, n41Var.u);
        } else if (obj instanceof TL_stars.SavedStarGift) {
            z11 = i3Var.i((TL_stars.SavedStarGift) obj, n41Var.r, n41Var.s);
        }
        if (n41Var.f) {
            i3Var.c(n41Var.e, z11);
        }
        i3Var.e(n41Var.h, z11);
        i3Var.d.setAlpha(n41Var.g ? 1.0f : 0.65f);
        i3Var.f.setAlpha(n41Var.g ? 1.0f : 0.5f);
    }

    @Override // org.telegram.ui.Components.m41
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new i3(i7, context, i6Var);
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean e(n41 n41Var, n41 n41Var2) {
        if (n41Var.r != n41Var2.r) {
            return false;
        }
        Object obj = n41Var.H;
        if (obj != null || n41Var2.H != null) {
            if (obj instanceof ug.j) {
                return obj == n41Var2.H;
            }
            if (obj instanceof TL_stars.StarGift) {
                Object obj2 = n41Var2.H;
                if (obj2 instanceof TL_stars.StarGift) {
                    return ((TL_stars.StarGift) obj).id == ((TL_stars.StarGift) obj2).id;
                }
            }
            if (obj instanceof TL_stars.SavedStarGift) {
                Object obj3 = n41Var2.H;
                if (obj3 instanceof TL_stars.SavedStarGift) {
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                    TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj3;
                    return savedStarGift.gift.id == savedStarGift2.gift.id && savedStarGift.date == savedStarGift2.date && savedStarGift.saved_id == savedStarGift2.saved_id;
                }
            }
        }
        return n41Var.A == n41Var2.A && n41Var.e == n41Var2.e && n41Var.C == n41Var2.C && TextUtils.equals(n41Var.m, n41Var2.m);
    }
}
