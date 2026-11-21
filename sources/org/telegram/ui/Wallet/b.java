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
import org.telegram.messenger.fc;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.oq;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class b extends n41 {
    public static final /* synthetic */ int b = 0;

    static {
        n41.h(new b());
    }

    @Override // org.telegram.ui.Components.n41
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        c cVar = (c) view;
        boolean z11 = false;
        cVar.setGrid(o41Var.v == 1);
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) o41Var.H;
        TextView textView = cVar.d;
        TextView textView2 = cVar.c;
        org.telegram.ui.Components.q9 q9Var = cVar.b;
        fc fcVar = null;
        if (TextUtils.isEmpty(nftitem.name)) {
            textView2.setText(gd.N0(2131742932, null));
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
            textView.setText(gd.V(null, null, 2131742930, b10, b11));
        }
        fc c10 = c.c(nftitem, !cVar.f);
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.y6, cVar.a);
        Drawable mutate = cVar.getContext().getResources().getDrawable(R.drawable.wallet_nft_placeholder).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(cVar.f ? 11.0f : 8.0f), org.telegram.ui.ActionBar.m6.r1(0.1f, w02));
        oq oqVar = new oq(d02, mutate);
        cVar.h = mutate;
        cVar.n = d02;
        cVar.r = w02;
        if (c10 != null && cVar.f) {
            if (nftitem.image_small != null && nftitem.image != null) {
                fcVar = c.c(nftitem, true);
            }
            q9Var.a.r0(c10, "160_160", fcVar, "100_100", oqVar, 0L, null, nftitem, 0);
            q9Var.d();
        } else if (c10 != null) {
            q9Var.j(c10, "46_46", oqVar, nftitem);
        } else {
            q9Var.setImageDrawable(oqVar);
        }
        if (z10 && !cVar.f) {
            z11 = true;
        }
        cVar.e = z11;
        cVar.updateColors();
        cVar.invalidate();
    }

    @Override // org.telegram.ui.Components.n41
    public final boolean c(o41 o41Var, o41 o41Var2) {
        if (!e(o41Var, o41Var2)) {
            return false;
        }
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) o41Var.H;
        TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) o41Var2.H;
        if (nftitem != nftitem2) {
            return nftitem != null && nftitem2 != null && Objects.equals(nftitem.name, nftitem2.name) && Objects.equals(nftitem.image, nftitem2.image) && Objects.equals(nftitem.image_small, nftitem2.image_small) && Objects.equals(nftitem.description, nftitem2.description) && Objects.equals(nftitem.attributes, nftitem2.attributes) && Objects.equals(nftitem.extra, nftitem2.extra);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.n41
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new c(context, h6Var);
    }

    @Override // org.telegram.ui.Components.n41
    public final boolean e(o41 o41Var, o41 o41Var2) {
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) o41Var.H;
        TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) o41Var2.H;
        return (nftitem == null || nftitem2 == null) ? nftitem == nftitem2 : TextUtils.equals(nftitem.address, nftitem2.address);
    }

    @Override // org.telegram.ui.Components.n41
    public final boolean f() {
        return true;
    }
}
