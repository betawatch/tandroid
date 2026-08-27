package hh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class s9 extends m41 {
    public static final /* synthetic */ int a = 0;

    static {
        m41.setup(new s9());
    }

    @Override // org.telegram.ui.Components.m41
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        t9 t9Var = (t9) view;
        org.telegram.ui.Components.j6 j6Var = t9Var.a;
        ImageView imageView = t9Var.b;
        int i10 = t9Var.c;
        int i11 = n41Var.d;
        boolean z11 = i10 == i11;
        t9Var.c = i11;
        j6Var.c(n41Var.l, z11, true);
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, n41Var.q ? org.telegram.ui.ActionBar.g6.o6 : org.telegram.ui.ActionBar.g6.G6, false);
        j6Var.setTextColor(w02);
        imageView.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        if (z11) {
            imageView.animate().rotation(n41Var.f ? 0.0f : 180.0f).setDuration(340L).setInterpolator(er.h);
        } else {
            imageView.setRotation(n41Var.f ? 0.0f : 180.0f);
        }
        t9Var.d = z10;
        t9Var.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.m41
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new t9(context);
    }
}
