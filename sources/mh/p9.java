package mh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.x51;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class p9 extends i51 {
    public static final /* synthetic */ int a = 0;

    static {
        i51.setup(new p9());
    }

    @Override // org.telegram.ui.Components.i51
    public final void bindView(View view, j51 j51Var, boolean z4, x51 x51Var, i61 i61Var) {
        q9 q9Var = (q9) view;
        org.telegram.ui.Components.k6 k6Var = q9Var.a;
        ImageView imageView = q9Var.b;
        int i10 = q9Var.c;
        int i11 = j51Var.d;
        boolean z10 = i10 == i11;
        q9Var.c = i11;
        k6Var.c(j51Var.l, z10, true);
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, j51Var.q ? org.telegram.ui.ActionBar.k6.o6 : org.telegram.ui.ActionBar.k6.G6, false);
        k6Var.setTextColor(w02);
        imageView.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        if (z10) {
            imageView.animate().rotation(j51Var.f ? 0.0f : 180.0f).setDuration(340L).setInterpolator(pr.h);
        } else {
            imageView.setRotation(j51Var.f ? 0.0f : 180.0f);
        }
        q9Var.d = z4;
        q9Var.setWillNotDraw(!z4);
    }

    @Override // org.telegram.ui.Components.i51
    public final View createView(Context context, tl0 tl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new q9(context);
    }
}
