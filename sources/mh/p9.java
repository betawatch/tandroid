package mh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class p9 extends g51 {
    public static final /* synthetic */ int a = 0;

    static {
        g51.setup(new p9());
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        q9 q9Var = (q9) view;
        org.telegram.ui.Components.k6 k6Var = q9Var.a;
        ImageView imageView = q9Var.b;
        int i10 = q9Var.c;
        int i11 = h51Var.d;
        boolean z10 = i10 == i11;
        q9Var.c = i11;
        k6Var.c(h51Var.l, z10, true);
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, h51Var.q ? org.telegram.ui.ActionBar.k6.o6 : org.telegram.ui.ActionBar.k6.G6, false);
        k6Var.setTextColor(w02);
        imageView.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        if (z10) {
            imageView.animate().rotation(h51Var.f ? 0.0f : 180.0f).setDuration(340L).setInterpolator(pr.h);
        } else {
            imageView.setRotation(h51Var.f ? 0.0f : 180.0f);
        }
        q9Var.d = z4;
        q9Var.setWillNotDraw(!z4);
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new q9(context);
    }
}
