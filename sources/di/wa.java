package di;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class wa extends k41 {
    public static final /* synthetic */ int b = 0;

    static {
        k41.h(new wa());
    }

    @Override // org.telegram.ui.Components.k41
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        xa xaVar = (xa) view;
        org.telegram.ui.Components.n6 n6Var = xaVar.a;
        ImageView imageView = xaVar.b;
        int i7 = xaVar.c;
        int i10 = l41Var.d;
        boolean z11 = i7 == i10;
        xaVar.c = i10;
        n6Var.c(l41Var.m, z11, true);
        org.telegram.ui.ActionBar.n6.v0(l41Var.r ? org.telegram.ui.ActionBar.n6.o6 : org.telegram.ui.ActionBar.n6.G6);
        org.telegram.ui.ActionBar.u6.Y(n6Var, l41Var.r ? org.telegram.ui.ActionBar.n6.o6 : org.telegram.ui.ActionBar.n6.G6, null);
        org.telegram.ui.ActionBar.u6.s(imageView, l41Var.r ? org.telegram.ui.ActionBar.n6.o6 : org.telegram.ui.ActionBar.n6.G6, null, PorterDuff.Mode.SRC_IN);
        if (z11) {
            imageView.animate().rotation(l41Var.f ? 0.0f : 180.0f).setDuration(340L).setInterpolator(lr.h);
        } else {
            imageView.setRotation(l41Var.f ? 0.0f : 180.0f);
        }
        xaVar.d = z10;
        xaVar.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.k41
    public final View d(Context context, ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new xa(context);
    }
}
