package bi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class jc extends w31 {
    public static final /* synthetic */ int b = 0;

    static {
        w31.h(new jc());
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, x31 x31Var, boolean z9, m41 m41Var, r41 r41Var) {
        kc kcVar = (kc) view;
        org.telegram.ui.Components.i6 i6Var = kcVar.a;
        ImageView imageView = kcVar.b;
        int i7 = kcVar.c;
        int i10 = x31Var.d;
        boolean z10 = i7 == i10;
        kcVar.c = i10;
        i6Var.c(x31Var.l, z10, true);
        org.telegram.ui.ActionBar.m6.v0(x31Var.q ? org.telegram.ui.ActionBar.m6.o6 : org.telegram.ui.ActionBar.m6.G6);
        org.telegram.ui.ActionBar.t6.Y(i6Var, x31Var.q ? org.telegram.ui.ActionBar.m6.o6 : org.telegram.ui.ActionBar.m6.G6, null);
        org.telegram.ui.ActionBar.t6.s(imageView, x31Var.q ? org.telegram.ui.ActionBar.m6.o6 : org.telegram.ui.ActionBar.m6.G6, null, PorterDuff.Mode.SRC_IN);
        if (z10) {
            imageView.animate().rotation(x31Var.f ? 0.0f : 180.0f).setDuration(340L).setInterpolator(wq.h);
        } else {
            imageView.setRotation(x31Var.f ? 0.0f : 180.0f);
        }
        kcVar.d = z9;
        kcVar.setWillNotDraw(!z9);
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new kc(context);
    }
}
