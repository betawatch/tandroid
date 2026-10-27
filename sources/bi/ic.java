package bi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class ic extends t61 {
    public static final /* synthetic */ int a = 0;

    static {
        t61.setup(new ic());
    }

    @Override // org.telegram.ui.Components.t61
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        jc jcVar = (jc) view;
        org.telegram.ui.Components.s6 s6Var = jcVar.a;
        ImageView imageView = jcVar.b;
        int i10 = jcVar.c;
        int i11 = u61Var.d;
        boolean z11 = i10 == i11;
        jcVar.c = i11;
        s6Var.c(u61Var.l, z11, true);
        org.telegram.ui.ActionBar.y6.v0(u61Var.q ? org.telegram.ui.ActionBar.y6.o6 : org.telegram.ui.ActionBar.y6.G6);
        org.telegram.ui.ActionBar.f7.Z(s6Var, u61Var.q ? org.telegram.ui.ActionBar.y6.o6 : org.telegram.ui.ActionBar.y6.G6, null);
        org.telegram.ui.ActionBar.f7.t(imageView, u61Var.q ? org.telegram.ui.ActionBar.y6.o6 : org.telegram.ui.ActionBar.y6.G6, null, PorterDuff.Mode.SRC_IN);
        if (z11) {
            imageView.animate().rotation(u61Var.f ? 0.0f : 180.0f).setDuration(340L).setInterpolator(ds.h);
        } else {
            imageView.setRotation(u61Var.f ? 0.0f : 180.0f);
        }
        jcVar.d = z10;
        jcVar.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.t61
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new jc(context);
    }
}
