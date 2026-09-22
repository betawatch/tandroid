package ci;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class v8 extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new v8());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        w8 w8Var = (w8) view;
        Object obj = i51Var.G;
        TLRPC.WebPage webPage = obj instanceof TLRPC.WebPage ? (TLRPC.WebPage) obj : null;
        View.OnClickListener onClickListener = i51Var.D;
        org.telegram.ui.Components.n6 n6Var = w8Var.e;
        org.telegram.ui.Components.n6 n6Var2 = w8Var.d;
        ImageView imageView = w8Var.c;
        ImageView imageView2 = w8Var.b;
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
            n6Var2.c(w8Var.h, false, true);
            n6Var.c(w8Var.n, false, true);
        }
        w8Var.f.setOnClickListener(onClickListener);
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new w8(context);
    }
}
