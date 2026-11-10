package fi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class k7 extends w31 {
    public static final /* synthetic */ int b = 0;

    static {
        w31.h(new k7());
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, x31 x31Var, boolean z9, m41 m41Var, r41 r41Var) {
        l7 l7Var = (l7) view;
        Object obj = x31Var.G;
        TLRPC.WebPage webPage = obj instanceof TLRPC.WebPage ? (TLRPC.WebPage) obj : null;
        View.OnClickListener onClickListener = x31Var.D;
        org.telegram.ui.Components.i6 i6Var = l7Var.e;
        org.telegram.ui.Components.i6 i6Var2 = l7Var.d;
        ImageView imageView = l7Var.c;
        ImageView imageView2 = l7Var.b;
        boolean z10 = (webPage == null || (webPage instanceof TLRPC.TL_webPagePending)) ? false : true;
        imageView2.setAlpha(z10 ? 1.0f : 0.0f);
        imageView2.setScaleX(z10 ? 1.0f : 0.4f);
        imageView2.setScaleY(z10 ? 1.0f : 0.4f);
        imageView.setAlpha(z10 ? 0.0f : 1.0f);
        imageView.setScaleX(z10 ? 0.4f : 1.0f);
        imageView.setScaleY(z10 ? 0.4f : 1.0f);
        if (z10) {
            i6Var2.c(TextUtils.isEmpty(webPage.site_name) ? webPage.title : webPage.site_name, false, true);
            i6Var.c(webPage.description, false, true);
        } else {
            i6Var2.c(l7Var.h, false, true);
            i6Var.c(l7Var.n, false, true);
        }
        l7Var.f.setOnClickListener(onClickListener);
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new l7(context);
    }
}
