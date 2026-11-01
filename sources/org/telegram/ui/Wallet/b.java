package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import j$.util.Objects;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.dd;
import org.telegram.messenger.jc;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class b extends a51 {
    public static final /* synthetic */ int b = 0;

    static {
        a51.h(new b());
    }

    @Override // org.telegram.ui.Components.a51
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        c cVar = (c) view;
        boolean z11 = false;
        cVar.setGrid(b51Var.u == 1);
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) b51Var.G;
        TextView textView = cVar.d;
        TextView textView2 = cVar.c;
        org.telegram.ui.Components.g9 g9Var = cVar.b;
        jc jcVar = null;
        if (TextUtils.isEmpty(nftitem.name)) {
            textView2.setText(dd.L0(2131743202, null));
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(nftitem.name);
            int indexOf = nftitem.name.indexOf(35);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new a(), indexOf, spannableStringBuilder.length(), 33);
            }
            textView2.setText(spannableStringBuilder);
        }
        String b10 = c.b(nftitem, "Model");
        String b11 = c.b(nftitem, "Backdrop");
        if (TextUtils.isEmpty(b10) || TextUtils.isEmpty(b11)) {
            textView.setText(nftitem.description);
        } else {
            textView.setText(dd.V(null, null, 2131743200, b10, b11));
        }
        jc c10 = c.c(nftitem, !cVar.f);
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.y6, cVar.a);
        Drawable mutate = cVar.getContext().getResources().getDrawable(R.drawable.wallet_nft_placeholder).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(cVar.f ? 11.0f : 8.0f), org.telegram.ui.ActionBar.t6.r1(0.1f, w02));
        eq eqVar = new eq(d02, mutate);
        cVar.h = mutate;
        cVar.n = d02;
        cVar.r = w02;
        if (c10 != null && cVar.f) {
            if (nftitem.image_small != null && nftitem.image != null) {
                jcVar = c.c(nftitem, true);
            }
            g9Var.a.r0(c10, "160_160", jcVar, "100_100", eqVar, 0L, null, nftitem, 0);
            g9Var.d();
        } else if (c10 != null) {
            g9Var.j(c10, "46_46", eqVar, nftitem);
        } else {
            g9Var.setImageDrawable(eqVar);
        }
        if (z10 && !cVar.f) {
            z11 = true;
        }
        cVar.e = z11;
        cVar.updateColors();
        cVar.invalidate();
    }

    @Override // org.telegram.ui.Components.a51
    public final boolean c(b51 b51Var, b51 b51Var2) {
        if (!e(b51Var, b51Var2)) {
            return false;
        }
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) b51Var.G;
        TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) b51Var2.G;
        if (nftitem != nftitem2) {
            return nftitem != null && nftitem2 != null && Objects.equals(nftitem.name, nftitem2.name) && Objects.equals(nftitem.image, nftitem2.image) && Objects.equals(nftitem.image_small, nftitem2.image_small) && Objects.equals(nftitem.description, nftitem2.description) && Objects.equals(nftitem.attributes, nftitem2.attributes) && Objects.equals(nftitem.extra, nftitem2.extra);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.a51
    public final View d(Context context, uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new c(context, p6Var);
    }

    @Override // org.telegram.ui.Components.a51
    public final boolean e(b51 b51Var, b51 b51Var2) {
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) b51Var.G;
        TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) b51Var2.G;
        return (nftitem == null || nftitem2 == null) ? nftitem == nftitem2 : TextUtils.equals(nftitem.address, nftitem2.address);
    }

    @Override // org.telegram.ui.Components.a51
    public final boolean f() {
        return true;
    }
}
