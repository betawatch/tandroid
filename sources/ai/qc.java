package ai;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.u61;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final class qc extends g61 {
    public static final /* synthetic */ int a = 0;

    static {
        g61.setup(new qc());
    }

    @Override // org.telegram.ui.Components.g61
    public final void bindView(View view, h61 h61Var, boolean z10, u61 u61Var, c71 c71Var) {
        rc rcVar = (rc) view;
        org.telegram.ui.Components.q6 q6Var = rcVar.a;
        ImageView imageView = rcVar.b;
        int i10 = rcVar.c;
        int i11 = h61Var.d;
        boolean z11 = i10 == i11;
        rcVar.c = i11;
        q6Var.c(h61Var.l, z11, true);
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, h61Var.q ? org.telegram.ui.ActionBar.h6.o6 : org.telegram.ui.ActionBar.h6.G6, false);
        q6Var.setTextColor(x02);
        imageView.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
        if (z11) {
            imageView.animate().rotation(h61Var.f ? 0.0f : 180.0f).setDuration(340L).setInterpolator(bs.h);
        } else {
            imageView.setRotation(h61Var.f ? 0.0f : 180.0f);
        }
        rcVar.d = z10;
        rcVar.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.g61
    public final View createView(Context context, jm0 jm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new rc(context);
    }
}
