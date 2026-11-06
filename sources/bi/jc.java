package bi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class jc extends w31 {
    public static final /* synthetic */ int b = 0;

    static {
        w31.h(new jc());
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        kc kcVar = (kc) view;
        org.telegram.ui.Components.j6 j6Var = kcVar.a;
        ImageView imageView = kcVar.b;
        int i7 = kcVar.c;
        int i10 = x31Var.d;
        boolean z10 = i7 == i10;
        kcVar.c = i10;
        j6Var.c(x31Var.l, z10, true);
        org.telegram.ui.ActionBar.k6.v0(x31Var.q ? org.telegram.ui.ActionBar.k6.o6 : org.telegram.ui.ActionBar.k6.G6);
        org.telegram.ui.ActionBar.r6.Z(j6Var, x31Var.q ? org.telegram.ui.ActionBar.k6.o6 : org.telegram.ui.ActionBar.k6.G6, null);
        org.telegram.ui.ActionBar.r6.t(imageView, x31Var.q ? org.telegram.ui.ActionBar.k6.o6 : org.telegram.ui.ActionBar.k6.G6, null, PorterDuff.Mode.SRC_IN);
        if (z10) {
            imageView.animate().rotation(x31Var.f ? 0.0f : 180.0f).setDuration(340L).setInterpolator(xq.h);
        } else {
            imageView.setRotation(x31Var.f ? 0.0f : 180.0f);
        }
        kcVar.d = z9;
        kcVar.setWillNotDraw(!z9);
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new kc(context);
    }
}
