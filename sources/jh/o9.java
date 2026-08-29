package jh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class o9 extends v41 {
    public static final /* synthetic */ int a = 0;

    static {
        v41.setup(new o9());
    }

    @Override // org.telegram.ui.Components.v41
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        p9 p9Var = (p9) view;
        org.telegram.ui.Components.o6 o6Var = p9Var.a;
        ImageView imageView = p9Var.b;
        int i10 = p9Var.c;
        int i11 = w41Var.d;
        boolean z11 = i10 == i11;
        p9Var.c = i11;
        o6Var.c(w41Var.l, z11, true);
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, w41Var.q ? org.telegram.ui.ActionBar.g6.o6 : org.telegram.ui.ActionBar.g6.G6, false);
        o6Var.setTextColor(w02);
        imageView.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        if (z11) {
            imageView.animate().rotation(w41Var.f ? 0.0f : 180.0f).setDuration(340L).setInterpolator(jr.h);
        } else {
            imageView.setRotation(w41Var.f ? 0.0f : 180.0f);
        }
        p9Var.d = z10;
        p9Var.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.v41
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new p9(context);
    }
}
