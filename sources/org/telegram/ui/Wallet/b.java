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
import org.telegram.messenger.hc;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.xp;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class b extends w31 {
    public static final /* synthetic */ int b = 0;

    static {
        w31.h(new b());
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        c cVar = (c) view;
        boolean z10 = false;
        cVar.setGrid(x31Var.u == 1);
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) x31Var.G;
        TextView textView = cVar.d;
        TextView textView2 = cVar.c;
        org.telegram.ui.Components.l9 l9Var = cVar.b;
        hc hcVar = null;
        if (TextUtils.isEmpty(nftitem.name)) {
            textView2.setText(hd.M0(2131743177, null));
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
            textView.setText(hd.V(null, null, 2131743175, b10, b11));
        }
        hc c10 = c.c(nftitem, !cVar.f);
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.y6, cVar.a);
        Drawable mutate = cVar.getContext().getResources().getDrawable(R.drawable.wallet_nft_placeholder).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(cVar.f ? 11.0f : 8.0f), org.telegram.ui.ActionBar.k6.r1(0.1f, w02));
        xp xpVar = new xp(d02, mutate);
        cVar.h = mutate;
        cVar.n = d02;
        cVar.r = w02;
        if (c10 != null && cVar.f) {
            if (nftitem.image_small != null && nftitem.image != null) {
                hcVar = c.c(nftitem, true);
            }
            l9Var.a.r0(c10, "160_160", hcVar, "100_100", xpVar, 0L, null, nftitem, 0);
            l9Var.d();
        } else if (c10 != null) {
            l9Var.j(c10, "46_46", xpVar, nftitem);
        } else {
            l9Var.setImageDrawable(xpVar);
        }
        if (z9 && !cVar.f) {
            z10 = true;
        }
        cVar.e = z10;
        cVar.updateColors();
        cVar.invalidate();
    }

    @Override // org.telegram.ui.Components.w31
    public final boolean c(x31 x31Var, x31 x31Var2) {
        if (!e(x31Var, x31Var2)) {
            return false;
        }
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) x31Var.G;
        TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) x31Var2.G;
        if (nftitem != nftitem2) {
            return nftitem != null && nftitem2 != null && Objects.equals(nftitem.name, nftitem2.name) && Objects.equals(nftitem.image, nftitem2.image) && Objects.equals(nftitem.image_small, nftitem2.image_small) && Objects.equals(nftitem.description, nftitem2.description) && Objects.equals(nftitem.attributes, nftitem2.attributes) && Objects.equals(nftitem.extra, nftitem2.extra);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new c(context, f6Var);
    }

    @Override // org.telegram.ui.Components.w31
    public final boolean e(x31 x31Var, x31 x31Var2) {
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) x31Var.G;
        TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) x31Var2.G;
        return (nftitem == null || nftitem2 == null) ? nftitem == nftitem2 : TextUtils.equals(nftitem.address, nftitem2.address);
    }

    @Override // org.telegram.ui.Components.w31
    public final boolean f() {
        return true;
    }
}
