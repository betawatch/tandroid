package di;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class sa extends a41 {
    public static final /* synthetic */ int b = 0;

    static {
        a41.h(new sa());
    }

    @Override // org.telegram.ui.Components.a41
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        ta taVar = (ta) view;
        org.telegram.ui.Components.h6 h6Var = taVar.a;
        ImageView imageView = taVar.b;
        int i7 = taVar.c;
        int i10 = b41Var.d;
        boolean z11 = i7 == i10;
        taVar.c = i10;
        h6Var.c(b41Var.l, z11, true);
        org.telegram.ui.ActionBar.j6.v0(b41Var.q ? org.telegram.ui.ActionBar.j6.o6 : org.telegram.ui.ActionBar.j6.G6);
        org.telegram.ui.ActionBar.q6.Y(h6Var, b41Var.q ? org.telegram.ui.ActionBar.j6.o6 : org.telegram.ui.ActionBar.j6.G6, null);
        org.telegram.ui.ActionBar.q6.s(imageView, b41Var.q ? org.telegram.ui.ActionBar.j6.o6 : org.telegram.ui.ActionBar.j6.G6, null, PorterDuff.Mode.SRC_IN);
        if (z11) {
            imageView.animate().rotation(b41Var.f ? 0.0f : 180.0f).setDuration(340L).setInterpolator(er.h);
        } else {
            imageView.setRotation(b41Var.f ? 0.0f : 180.0f);
        }
        taVar.d = z10;
        taVar.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.a41
    public final View d(Context context, uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new ta(context);
    }
}
