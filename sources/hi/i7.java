package hi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class i7 extends n41 {
    public static final /* synthetic */ int b = 0;

    static {
        n41.h(new i7());
    }

    @Override // org.telegram.ui.Components.n41
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        j7 j7Var = (j7) view;
        Object obj = o41Var.H;
        TLRPC.WebPage webPage = obj instanceof TLRPC.WebPage ? (TLRPC.WebPage) obj : null;
        View.OnClickListener onClickListener = o41Var.E;
        org.telegram.ui.Components.o6 o6Var = j7Var.e;
        org.telegram.ui.Components.o6 o6Var2 = j7Var.d;
        ImageView imageView = j7Var.c;
        ImageView imageView2 = j7Var.b;
        boolean z11 = (webPage == null || (webPage instanceof TLRPC.TL_webPagePending)) ? false : true;
        imageView2.setAlpha(z11 ? 1.0f : 0.0f);
        imageView2.setScaleX(z11 ? 1.0f : 0.4f);
        imageView2.setScaleY(z11 ? 1.0f : 0.4f);
        imageView.setAlpha(z11 ? 0.0f : 1.0f);
        imageView.setScaleX(z11 ? 0.4f : 1.0f);
        imageView.setScaleY(z11 ? 0.4f : 1.0f);
        if (z11) {
            o6Var2.c(TextUtils.isEmpty(webPage.site_name) ? webPage.title : webPage.site_name, false, true);
            o6Var.c(webPage.description, false, true);
        } else {
            o6Var2.c(j7Var.h, false, true);
            o6Var.c(j7Var.n, false, true);
        }
        j7Var.f.setOnClickListener(onClickListener);
    }

    @Override // org.telegram.ui.Components.n41
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new j7(context);
    }
}
