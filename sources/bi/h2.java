package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import di.ca;
import di.mb;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.y31;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class h2 extends a41 {
    public static final /* synthetic */ int b = 0;

    static {
        a41.h(new h2());
    }

    public static b41 i(int i7, TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        b41 K = b41.K(h2.class);
        K.u = 1;
        K.z = i7;
        K.G = starGift;
        K.e = z10;
        K.H = Boolean.valueOf(z11);
        K.r = z13;
        K.q = z12;
        K.t = z14;
        return K;
    }

    @Override // org.telegram.ui.Components.a41
    public final void a(uj0 uj0Var, View view, b41 b41Var) {
        ((i2) view).e(b41Var.h, false);
    }

    @Override // org.telegram.ui.Components.a41
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        i2 i2Var = (i2) view;
        Object obj = b41Var.G;
        boolean z11 = false;
        if (obj instanceof ug.j) {
            ug.j jVar = (ug.j) obj;
            g2 g2Var = i2Var.K;
            TextView textView = i2Var.J;
            TextView textView2 = i2Var.I;
            e2 e2Var = i2Var.e;
            i9 i9Var = i2Var.E;
            TextView textView3 = i2Var.M;
            TextView textView4 = i2Var.N;
            int d = jVar.d();
            if (i2Var.k0 != jVar) {
                ca f12 = mb.f1(i9Var, i9Var.getImageReceiver(), d);
                i2Var.O = f12;
                f12.run();
                i2Var.O = null;
            }
            e2Var.d(null);
            e2Var.e(null);
            e2Var.g(null);
            textView2.setText(hd.G(d, "Gift2Months", new Object[0]));
            textView.setText(hd.M0(2131744230, null));
            textView2.setVisibility(0);
            textView.setVisibility(0);
            i9Var.setTranslationY(-org.telegram.messenger.g0.L(8.0f));
            i2Var.n.setVisibility(8);
            i2Var.G.setVisibility(8);
            if (jVar.c == null && jVar.d == null) {
                textView4.setVisibility(8);
            } else {
                textView4.setTextColor(org.telegram.ui.ActionBar.j6.I.q() ? -1333971 : -2722014);
                textView4.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("" + hd.E(jVar.g(), ','));
                spannableStringBuilder.setSpan(new y31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
                eq[] eqVarArr = new eq[1];
                textView4.setText(mb.a1(false, hd.V(null, null, 2131747028, spannableStringBuilder), 0.48f, eqVarArr));
                eqVarArr[0].H = 0.8f;
            }
            FrameLayout.LayoutParams layoutParams = i2Var.F;
            layoutParams.gravity = 49;
            i9Var.setLayoutParams(layoutParams);
            textView3.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
            textView3.setTextSize(1, 12.0f);
            textView3.setText(jVar.c());
            i2Var.t0 = 0;
            i2Var.L.setBackground(org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(13.0f), 422810068));
            textView3.setTextColor(-13397548);
            ((ViewGroup.MarginLayoutParams) g2Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(130.0f);
            ((FrameLayout.LayoutParams) g2Var.getLayoutParams()).gravity = 49;
            i2Var.k0 = jVar;
            i2Var.l0 = null;
            i2Var.b0 = jVar;
            i2Var.c0 = null;
            i2Var.e0 = false;
            i2Var.f0 = null;
            i2Var.g0 = false;
            i2Var.h0 = false;
            i2Var.i0 = false;
            i2Var.R = null;
            i2Var.S = null;
            i2Var.d(false, false);
            i2Var.l();
        } else if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z12 = b41Var.e;
            Object obj2 = b41Var.H;
            i2Var.h(starGift, z12, obj2 instanceof Boolean ? ((Boolean) obj2).booleanValue() : false, b41Var.q, b41Var.r, b41Var.t);
        } else if (obj instanceof TL_stars.SavedStarGift) {
            z11 = i2Var.i((TL_stars.SavedStarGift) obj, b41Var.q, b41Var.r);
        }
        if (b41Var.f) {
            i2Var.c(b41Var.e, z11);
        }
        i2Var.e(b41Var.h, z11);
        i2Var.d.setAlpha(b41Var.g ? 1.0f : 0.65f);
        i2Var.f.setAlpha(b41Var.g ? 1.0f : 0.5f);
    }

    @Override // org.telegram.ui.Components.a41
    public final View d(Context context, uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new i2(i7, context, e6Var);
    }

    @Override // org.telegram.ui.Components.a41
    public final boolean e(b41 b41Var, b41 b41Var2) {
        if (b41Var.q != b41Var2.q) {
            return false;
        }
        Object obj = b41Var.G;
        if (obj != null || b41Var2.G != null) {
            if (obj instanceof ug.j) {
                return obj == b41Var2.G;
            }
            if (obj instanceof TL_stars.StarGift) {
                Object obj2 = b41Var2.G;
                if (obj2 instanceof TL_stars.StarGift) {
                    return ((TL_stars.StarGift) obj).id == ((TL_stars.StarGift) obj2).id;
                }
            }
            if (obj instanceof TL_stars.SavedStarGift) {
                Object obj3 = b41Var2.G;
                if (obj3 instanceof TL_stars.SavedStarGift) {
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                    TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj3;
                    return savedStarGift.gift.id == savedStarGift2.gift.id && savedStarGift.date == savedStarGift2.date && savedStarGift.saved_id == savedStarGift2.saved_id;
                }
            }
        }
        return b41Var.z == b41Var2.z && b41Var.e == b41Var2.e && b41Var.B == b41Var2.B && TextUtils.equals(b41Var.l, b41Var2.l);
    }
}
