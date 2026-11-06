package bi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class jc extends q31 {
    public static final /* synthetic */ int b = 0;

    static {
        q31.h(new jc());
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
        kc kcVar = (kc) view;
        org.telegram.ui.Components.j6 j6Var = kcVar.a;
        ImageView imageView = kcVar.b;
        int i7 = kcVar.c;
        int i10 = r31Var.d;
        boolean z10 = i7 == i10;
        kcVar.c = i10;
        j6Var.c(r31Var.l, z10, true);
        org.telegram.ui.ActionBar.k6.v0(r31Var.q ? org.telegram.ui.ActionBar.k6.o6 : org.telegram.ui.ActionBar.k6.G6);
        org.telegram.ui.ActionBar.r6.Z(j6Var, r31Var.q ? org.telegram.ui.ActionBar.k6.o6 : org.telegram.ui.ActionBar.k6.G6, null);
        org.telegram.ui.ActionBar.r6.t(imageView, r31Var.q ? org.telegram.ui.ActionBar.k6.o6 : org.telegram.ui.ActionBar.k6.G6, null, PorterDuff.Mode.SRC_IN);
        if (z10) {
            imageView.animate().rotation(r31Var.f ? 0.0f : 180.0f).setDuration(340L).setInterpolator(xq.h);
        } else {
            imageView.setRotation(r31Var.f ? 0.0f : 180.0f);
        }
        kcVar.d = z9;
        kcVar.setWillNotDraw(!z9);
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new kc(context);
    }
}
