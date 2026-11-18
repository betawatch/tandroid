package hi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class j7 extends k41 {
    public static final /* synthetic */ int b = 0;

    static {
        k41.h(new j7());
    }

    @Override // org.telegram.ui.Components.k41
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        k7 k7Var = (k7) view;
        Object obj = l41Var.H;
        TLRPC.WebPage webPage = obj instanceof TLRPC.WebPage ? (TLRPC.WebPage) obj : null;
        View.OnClickListener onClickListener = l41Var.E;
        org.telegram.ui.Components.n6 n6Var = k7Var.e;
        org.telegram.ui.Components.n6 n6Var2 = k7Var.d;
        ImageView imageView = k7Var.c;
        ImageView imageView2 = k7Var.b;
        boolean z11 = (webPage == null || (webPage instanceof TLRPC.TL_webPagePending)) ? false : true;
        imageView2.setAlpha(z11 ? 1.0f : 0.0f);
        imageView2.setScaleX(z11 ? 1.0f : 0.4f);
        imageView2.setScaleY(z11 ? 1.0f : 0.4f);
        imageView.setAlpha(z11 ? 0.0f : 1.0f);
        imageView.setScaleX(z11 ? 0.4f : 1.0f);
        imageView.setScaleY(z11 ? 0.4f : 1.0f);
        if (z11) {
            n6Var2.c(TextUtils.isEmpty(webPage.site_name) ? webPage.title : webPage.site_name, false, true);
            n6Var.c(webPage.description, false, true);
        } else {
            n6Var2.c(k7Var.h, false, true);
            n6Var.c(k7Var.n, false, true);
        }
        k7Var.f.setOnClickListener(onClickListener);
    }

    @Override // org.telegram.ui.Components.k41
    public final View d(Context context, ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new k7(context);
    }
}
