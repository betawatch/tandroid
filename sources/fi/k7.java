package fi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class k7 extends q31 {
    public static final /* synthetic */ int b = 0;

    static {
        q31.h(new k7());
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
        l7 l7Var = (l7) view;
        Object obj = r31Var.G;
        TLRPC.WebPage webPage = obj instanceof TLRPC.WebPage ? (TLRPC.WebPage) obj : null;
        View.OnClickListener onClickListener = r31Var.D;
        org.telegram.ui.Components.j6 j6Var = l7Var.e;
        org.telegram.ui.Components.j6 j6Var2 = l7Var.d;
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
            j6Var2.c(TextUtils.isEmpty(webPage.site_name) ? webPage.title : webPage.site_name, false, true);
            j6Var.c(webPage.description, false, true);
        } else {
            j6Var2.c(l7Var.h, false, true);
            j6Var.c(l7Var.n, false, true);
        }
        l7Var.f.setOnClickListener(onClickListener);
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new l7(context);
    }
}
