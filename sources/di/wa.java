package di;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o41;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class wa extends n41 {
    public static final /* synthetic */ int b = 0;

    static {
        n41.h(new wa());
    }

    @Override // org.telegram.ui.Components.n41
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        xa xaVar = (xa) view;
        org.telegram.ui.Components.o6 o6Var = xaVar.a;
        ImageView imageView = xaVar.b;
        int i7 = xaVar.c;
        int i10 = o41Var.d;
        boolean z11 = i7 == i10;
        xaVar.c = i10;
        o6Var.c(o41Var.m, z11, true);
        org.telegram.ui.ActionBar.m6.v0(o41Var.r ? org.telegram.ui.ActionBar.m6.o6 : org.telegram.ui.ActionBar.m6.G6);
        org.telegram.ui.ActionBar.t6.Y(o6Var, o41Var.r ? org.telegram.ui.ActionBar.m6.o6 : org.telegram.ui.ActionBar.m6.G6, null);
        org.telegram.ui.ActionBar.t6.s(imageView, o41Var.r ? org.telegram.ui.ActionBar.m6.o6 : org.telegram.ui.ActionBar.m6.G6, null, PorterDuff.Mode.SRC_IN);
        if (z11) {
            imageView.animate().rotation(o41Var.f ? 0.0f : 180.0f).setDuration(340L).setInterpolator(nr.h);
        } else {
            imageView.setRotation(o41Var.f ? 0.0f : 180.0f);
        }
        xaVar.d = z10;
        xaVar.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.n41
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new xa(context);
    }
}
