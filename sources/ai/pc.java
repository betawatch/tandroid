package ai;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.s61;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class pc extends e61 {
    public static final /* synthetic */ int a = 0;

    static {
        e61.setup(new pc());
    }

    @Override // org.telegram.ui.Components.e61
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
        qc qcVar = (qc) view;
        org.telegram.ui.Components.q6 q6Var = qcVar.a;
        ImageView imageView = qcVar.b;
        int i10 = qcVar.c;
        int i11 = f61Var.d;
        boolean z11 = i10 == i11;
        qcVar.c = i11;
        q6Var.c(f61Var.l, z11, true);
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, f61Var.q ? org.telegram.ui.ActionBar.h6.o6 : org.telegram.ui.ActionBar.h6.G6, false);
        q6Var.setTextColor(x02);
        imageView.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
        if (z11) {
            imageView.animate().rotation(f61Var.f ? 0.0f : 180.0f).setDuration(340L).setInterpolator(bs.h);
        } else {
            imageView.setRotation(f61Var.f ? 0.0f : 180.0f);
        }
        qcVar.d = z10;
        qcVar.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.e61
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new qc(context);
    }
}
