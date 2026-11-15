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
import org.telegram.messenger.gc;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class b extends a41 {
    public static final /* synthetic */ int b = 0;

    static {
        a41.h(new b());
    }

    @Override // org.telegram.ui.Components.a41
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        c cVar = (c) view;
        boolean z11 = false;
        cVar.setGrid(b41Var.u == 1);
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) b41Var.G;
        TextView textView = cVar.d;
        TextView textView2 = cVar.c;
        org.telegram.ui.Components.i9 i9Var = cVar.b;
        gc gcVar = null;
        if (TextUtils.isEmpty(nftitem.name)) {
            textView2.setText(hd.M0(2131743176, null));
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
            textView.setText(hd.V(null, null, 2131743174, b10, b11));
        }
        gc c10 = c.c(nftitem, !cVar.f);
        int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.y6, cVar.a);
        Drawable mutate = cVar.getContext().getResources().getDrawable(R.drawable.wallet_nft_placeholder).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(cVar.f ? 11.0f : 8.0f), org.telegram.ui.ActionBar.j6.r1(0.1f, w02));
        fq fqVar = new fq(d02, mutate);
        cVar.h = mutate;
        cVar.n = d02;
        cVar.r = w02;
        if (c10 != null && cVar.f) {
            if (nftitem.image_small != null && nftitem.image != null) {
                gcVar = c.c(nftitem, true);
            }
            i9Var.a.r0(c10, "160_160", gcVar, "100_100", fqVar, 0L, null, nftitem, 0);
            i9Var.e();
        } else if (c10 != null) {
            i9Var.j(c10, "46_46", fqVar, nftitem);
        } else {
            i9Var.setImageDrawable(fqVar);
        }
        if (z10 && !cVar.f) {
            z11 = true;
        }
        cVar.e = z11;
        cVar.updateColors();
        cVar.invalidate();
    }

    @Override // org.telegram.ui.Components.a41
    public final boolean c(b41 b41Var, b41 b41Var2) {
        if (!e(b41Var, b41Var2)) {
            return false;
        }
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) b41Var.G;
        TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) b41Var2.G;
        if (nftitem != nftitem2) {
            return nftitem != null && nftitem2 != null && Objects.equals(nftitem.name, nftitem2.name) && Objects.equals(nftitem.image, nftitem2.image) && Objects.equals(nftitem.image_small, nftitem2.image_small) && Objects.equals(nftitem.description, nftitem2.description) && Objects.equals(nftitem.attributes, nftitem2.attributes) && Objects.equals(nftitem.extra, nftitem2.extra);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.a41
    public final View d(Context context, uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new c(context, e6Var);
    }

    @Override // org.telegram.ui.Components.a41
    public final boolean e(b41 b41Var, b41 b41Var2) {
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) b41Var.G;
        TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) b41Var2.G;
        return (nftitem == null || nftitem2 == null) ? nftitem == nftitem2 : TextUtils.equals(nftitem.address, nftitem2.address);
    }

    @Override // org.telegram.ui.Components.a41
    public final boolean f() {
        return true;
    }
}
