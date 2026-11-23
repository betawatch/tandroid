package di;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class wa extends m41 {
    public static final /* synthetic */ int b = 0;

    static {
        m41.h(new wa());
    }

    @Override // org.telegram.ui.Components.m41
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        xa xaVar = (xa) view;
        org.telegram.ui.Components.n6 n6Var = xaVar.a;
        ImageView imageView = xaVar.b;
        int i7 = xaVar.c;
        int i10 = n41Var.d;
        boolean z11 = i7 == i10;
        xaVar.c = i10;
        n6Var.c(n41Var.m, z11, true);
        org.telegram.ui.ActionBar.n6.v0(n41Var.r ? org.telegram.ui.ActionBar.n6.o6 : org.telegram.ui.ActionBar.n6.G6);
        org.telegram.ui.ActionBar.u6.Y(n6Var, n41Var.r ? org.telegram.ui.ActionBar.n6.o6 : org.telegram.ui.ActionBar.n6.G6, null);
        org.telegram.ui.ActionBar.u6.s(imageView, n41Var.r ? org.telegram.ui.ActionBar.n6.o6 : org.telegram.ui.ActionBar.n6.G6, null, PorterDuff.Mode.SRC_IN);
        if (z11) {
            imageView.animate().rotation(n41Var.f ? 0.0f : 180.0f).setDuration(340L).setInterpolator(kr.h);
        } else {
            imageView.setRotation(n41Var.f ? 0.0f : 180.0f);
        }
        xaVar.d = z10;
        xaVar.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.m41
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new xa(context);
    }
}
