package bi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class ic extends s61 {
    public static final /* synthetic */ int a = 0;

    static {
        s61.setup(new ic());
    }

    @Override // org.telegram.ui.Components.s61
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        jc jcVar = (jc) view;
        org.telegram.ui.Components.s6 s6Var = jcVar.a;
        ImageView imageView = jcVar.b;
        int i10 = jcVar.c;
        int i11 = t61Var.d;
        boolean z11 = i10 == i11;
        jcVar.c = i11;
        s6Var.c(t61Var.l, z11, true);
        org.telegram.ui.ActionBar.y6.v0(t61Var.q ? org.telegram.ui.ActionBar.y6.o6 : org.telegram.ui.ActionBar.y6.G6);
        org.telegram.ui.ActionBar.f7.Z(s6Var, t61Var.q ? org.telegram.ui.ActionBar.y6.o6 : org.telegram.ui.ActionBar.y6.G6, null);
        org.telegram.ui.ActionBar.f7.t(imageView, t61Var.q ? org.telegram.ui.ActionBar.y6.o6 : org.telegram.ui.ActionBar.y6.G6, null, PorterDuff.Mode.SRC_IN);
        if (z11) {
            imageView.animate().rotation(t61Var.f ? 0.0f : 180.0f).setDuration(340L).setInterpolator(ds.h);
        } else {
            imageView.setRotation(t61Var.f ? 0.0f : 180.0f);
        }
        jcVar.d = z10;
        jcVar.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.s61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new jc(context);
    }
}
