package ci;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class db extends q31 {
    public static final /* synthetic */ int b = 0;

    static {
        q31.h(new db());
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        eb ebVar = (eb) view;
        org.telegram.ui.Components.h6 h6Var = ebVar.a;
        ImageView imageView = ebVar.b;
        int i3 = ebVar.c;
        int i10 = r31Var.d;
        boolean z11 = i3 == i10;
        ebVar.c = i10;
        h6Var.c(r31Var.l, z11, true);
        org.telegram.ui.ActionBar.k6.v0(r31Var.q ? org.telegram.ui.ActionBar.k6.o6 : org.telegram.ui.ActionBar.k6.G6);
        org.telegram.ui.ActionBar.r6.Z(h6Var, r31Var.q ? org.telegram.ui.ActionBar.k6.o6 : org.telegram.ui.ActionBar.k6.G6, null);
        org.telegram.ui.ActionBar.r6.t(imageView, r31Var.q ? org.telegram.ui.ActionBar.k6.o6 : org.telegram.ui.ActionBar.k6.G6, null, PorterDuff.Mode.SRC_IN);
        if (z11) {
            imageView.animate().rotation(r31Var.f ? 0.0f : 180.0f).setDuration(340L).setInterpolator(xq.h);
        } else {
            imageView.setRotation(r31Var.f ? 0.0f : 180.0f);
        }
        ebVar.d = z10;
        ebVar.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new eb(context);
    }
}
