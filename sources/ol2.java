// default package

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
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class ol2 extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new ol2());
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        pl2 pl2Var = (pl2) view;
        boolean z2 = false;
        pl2Var.setGrid(b8cVar.v == 1);
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) b8cVar.H;
        TextView textView = pl2Var.d;
        TextView textView2 = pl2Var.c;
        de0 de0Var = pl2Var.b;
        jn5 jn5Var = null;
        if (TextUtils.isEmpty(nftitem.name)) {
            textView2.setText(ob6.M0(2131742827, null));
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(nftitem.name);
            int indexOf = nftitem.name.indexOf(35);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new nl2(), indexOf, spannableStringBuilder.length(), 33);
            }
            textView2.setText(spannableStringBuilder);
        }
        String b2 = pl2.b(nftitem, "Model");
        String b3 = pl2.b(nftitem, "Backdrop");
        if (TextUtils.isEmpty(b2) || TextUtils.isEmpty(b3)) {
            textView.setText(nftitem.description);
        } else {
            textView.setText(ob6.V(null, null, 2131742825, b2, b3));
        }
        jn5 c = pl2.c(nftitem, !pl2Var.f);
        int v0 = aob.v0(aob.y6, pl2Var.a);
        Drawable mutate = pl2Var.getContext().getResources().getDrawable(R.drawable.wallet_nft_placeholder).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
        ShapeDrawable b0 = aob.b0(hl.L(pl2Var.f ? 11.0f : 8.0f), aob.p1(0.1f, v0));
        zm2 zm2Var = new zm2(b0, mutate);
        pl2Var.h = mutate;
        pl2Var.n = b0;
        pl2Var.r = v0;
        if (c == null) {
            de0Var.setImageDrawable(zm2Var);
        } else if (pl2Var.f) {
            if (nftitem.image_small != null && nftitem.image != null) {
                jn5Var = pl2.c(nftitem, true);
            }
            de0Var.a.Z(c, "160_160", jn5Var, "100_100", zm2Var, 0L, null, nftitem, 0);
            de0Var.e();
        } else {
            de0Var.m(c, "46_46", zm2Var, nftitem);
        }
        if (z && !pl2Var.f) {
            z2 = true;
        }
        pl2Var.e = z2;
        pl2Var.updateColors();
        pl2Var.invalidate();
    }

    @Override // a8c
    public final boolean c(b8c b8cVar, b8c b8cVar2) {
        if (!e(b8cVar, b8cVar2)) {
            return false;
        }
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) b8cVar.H;
        TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) b8cVar2.H;
        if (nftitem != nftitem2) {
            return nftitem != null && nftitem2 != null && Objects.equals(nftitem.name, nftitem2.name) && Objects.equals(nftitem.image, nftitem2.image) && Objects.equals(nftitem.image_small, nftitem2.image_small) && Objects.equals(nftitem.description, nftitem2.description) && Objects.equals(nftitem.attributes, nftitem2.attributes) && Objects.equals(nftitem.extra, nftitem2.extra);
        }
        return true;
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new pl2(context, vnbVar);
    }

    @Override // a8c
    public final boolean e(b8c b8cVar, b8c b8cVar2) {
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) b8cVar.H;
        TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) b8cVar2.H;
        return (nftitem == null || nftitem2 == null) ? nftitem == nftitem2 : TextUtils.equals(nftitem.address, nftitem2.address);
    }

    @Override // a8c
    public final boolean f() {
        return true;
    }
}
