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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class b extends t61 {
    public static final /* synthetic */ int a = 0;

    static {
        t61.setup(new b());
    }

    @Override // org.telegram.ui.Components.t61
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        c cVar = (c) view;
        boolean z11 = false;
        cVar.setGrid(u61Var.u == 1);
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) u61Var.G;
        TextView textView = cVar.d;
        TextView textView2 = cVar.c;
        org.telegram.ui.Components.y9 y9Var = cVar.b;
        if (TextUtils.isEmpty(nftitem.name)) {
            textView2.setText(LocaleController.getString(R.string.WalletCollectible));
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
            textView.setText(LocaleController.formatSpannable(R.string.WalletCollectibleModelBackdrop, b10, b11));
        }
        ImageLocation c10 = c.c(nftitem, !cVar.f);
        int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.y6, cVar.a);
        Drawable mutate = cVar.getContext().getResources().getDrawable(R.drawable.wallet_nft_placeholder).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(cVar.f ? 11.0f : 8.0f), org.telegram.ui.ActionBar.y6.o1(0.1f, w02));
        ar arVar = new ar(c02, mutate);
        cVar.h = mutate;
        cVar.n = c02;
        cVar.r = w02;
        if (c10 != null && cVar.f) {
            y9Var.a.setImage(c10, "160_160", (nftitem.image_small == null || nftitem.image == null) ? null : c.c(nftitem, true), "100_100", arVar, 0L, null, nftitem, 0);
            y9Var.d();
        } else if (c10 != null) {
            y9Var.h(c10, "46_46", arVar, nftitem);
        } else {
            y9Var.setImageDrawable(arVar);
        }
        if (z10 && !cVar.f) {
            z11 = true;
        }
        cVar.e = z11;
        cVar.updateColors();
        cVar.invalidate();
    }

    @Override // org.telegram.ui.Components.t61
    public final boolean contentsEquals(u61 u61Var, u61 u61Var2) {
        if (!equals(u61Var, u61Var2)) {
            return false;
        }
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) u61Var.G;
        TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) u61Var2.G;
        if (nftitem != nftitem2) {
            return nftitem != null && nftitem2 != null && Objects.equals(nftitem.name, nftitem2.name) && Objects.equals(nftitem.image, nftitem2.image) && Objects.equals(nftitem.image_small, nftitem2.image_small) && Objects.equals(nftitem.description, nftitem2.description) && Objects.equals(nftitem.attributes, nftitem2.attributes) && Objects.equals(nftitem.extra, nftitem2.extra);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.t61
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new c(context, u6Var);
    }

    @Override // org.telegram.ui.Components.t61
    public final boolean equals(u61 u61Var, u61 u61Var2) {
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) u61Var.G;
        TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) u61Var2.G;
        return (nftitem == null || nftitem2 == null) ? nftitem == nftitem2 : TextUtils.equals(nftitem.address, nftitem2.address);
    }

    @Override // org.telegram.ui.Components.t61
    public final boolean isClickable() {
        return true;
    }
}
