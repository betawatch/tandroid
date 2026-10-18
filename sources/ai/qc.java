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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class qc extends e61 {
    public static final /* synthetic */ int a = 0;

    static {
        e61.setup(new qc());
    }

    @Override // org.telegram.ui.Components.e61
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
        rc rcVar = (rc) view;
        org.telegram.ui.Components.q6 q6Var = rcVar.a;
        ImageView imageView = rcVar.b;
        int i10 = rcVar.c;
        int i11 = f61Var.d;
        boolean z11 = i10 == i11;
        rcVar.c = i11;
        q6Var.c(f61Var.l, z11, true);
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, f61Var.q ? org.telegram.ui.ActionBar.h6.o6 : org.telegram.ui.ActionBar.h6.G6, false);
        q6Var.setTextColor(x02);
        imageView.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
        if (z11) {
            imageView.animate().rotation(f61Var.f ? 0.0f : 180.0f).setDuration(340L).setInterpolator(bs.h);
        } else {
            imageView.setRotation(f61Var.f ? 0.0f : 180.0f);
        }
        rcVar.d = z10;
        rcVar.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.e61
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new rc(context);
    }
}
