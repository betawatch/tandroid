package gh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class t9 extends k41 {
    public static final /* synthetic */ int a = 0;

    static {
        k41.setup(new t9());
    }

    @Override // org.telegram.ui.Components.k41
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        u9 u9Var = (u9) view;
        org.telegram.ui.Components.j6 j6Var = u9Var.a;
        ImageView imageView = u9Var.b;
        int i9 = u9Var.c;
        int i10 = l41Var.d;
        boolean z11 = i9 == i10;
        u9Var.c = i10;
        j6Var.c(l41Var.l, z11, true);
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, l41Var.q ? org.telegram.ui.ActionBar.f6.o6 : org.telegram.ui.ActionBar.f6.G6, false);
        j6Var.setTextColor(w02);
        imageView.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        if (z11) {
            imageView.animate().rotation(l41Var.f ? 0.0f : 180.0f).setDuration(340L).setInterpolator(gr.h);
        } else {
            imageView.setRotation(l41Var.f ? 0.0f : 180.0f);
        }
        u9Var.d = z10;
        u9Var.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.k41
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        return new u9(context);
    }
}
