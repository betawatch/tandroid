package kh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class i8 extends k41 {
    public static final /* synthetic */ int a = 0;

    static {
        k41.setup(new i8());
    }

    @Override // org.telegram.ui.Components.k41
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        j8 j8Var = (j8) view;
        Object obj = l41Var.G;
        TLRPC.WebPage webPage = obj instanceof TLRPC.WebPage ? (TLRPC.WebPage) obj : null;
        View.OnClickListener onClickListener = l41Var.D;
        org.telegram.ui.Components.j6 j6Var = j8Var.e;
        org.telegram.ui.Components.j6 j6Var2 = j8Var.d;
        ImageView imageView = j8Var.c;
        ImageView imageView2 = j8Var.b;
        boolean z11 = (webPage == null || (webPage instanceof TLRPC.TL_webPagePending)) ? false : true;
        imageView2.setAlpha(z11 ? 1.0f : 0.0f);
        imageView2.setScaleX(z11 ? 1.0f : 0.4f);
        imageView2.setScaleY(z11 ? 1.0f : 0.4f);
        imageView.setAlpha(z11 ? 0.0f : 1.0f);
        imageView.setScaleX(z11 ? 0.4f : 1.0f);
        imageView.setScaleY(z11 ? 0.4f : 1.0f);
        if (z11) {
            j6Var2.c(TextUtils.isEmpty(webPage.site_name) ? webPage.title : webPage.site_name, false, true);
            j6Var.c(webPage.description, false, true);
        } else {
            j6Var2.c(j8Var.h, false, true);
            j6Var.c(j8Var.n, false, true);
        }
        j8Var.f.setOnClickListener(onClickListener);
    }

    @Override // org.telegram.ui.Components.k41
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        return new j8(context);
    }
}
