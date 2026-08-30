package lh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class p9 extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new p9());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        q9 q9Var = (q9) view;
        org.telegram.ui.Components.k6 k6Var = q9Var.a;
        ImageView imageView = q9Var.b;
        int i10 = q9Var.c;
        int i11 = i51Var.d;
        boolean z10 = i10 == i11;
        q9Var.c = i11;
        k6Var.c(i51Var.l, z10, true);
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i51Var.q ? org.telegram.ui.ActionBar.j6.o6 : org.telegram.ui.ActionBar.j6.G6, false);
        k6Var.setTextColor(w02);
        imageView.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        if (z10) {
            imageView.animate().rotation(i51Var.f ? 0.0f : 180.0f).setDuration(340L).setInterpolator(nr.h);
        } else {
            imageView.setRotation(i51Var.f ? 0.0f : 180.0f);
        }
        q9Var.d = z4;
        q9Var.setWillNotDraw(!z4);
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new q9(context);
    }
}
