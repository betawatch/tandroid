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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ta extends a41 {
    public static final /* synthetic */ int b = 0;

    static {
        a41.h(new ta());
    }

    @Override // org.telegram.ui.Components.a41
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        ua uaVar = (ua) view;
        org.telegram.ui.Components.h6 h6Var = uaVar.a;
        ImageView imageView = uaVar.b;
        int i7 = uaVar.c;
        int i10 = b41Var.d;
        boolean z11 = i7 == i10;
        uaVar.c = i10;
        h6Var.c(b41Var.l, z11, true);
        org.telegram.ui.ActionBar.j6.v0(b41Var.q ? org.telegram.ui.ActionBar.j6.o6 : org.telegram.ui.ActionBar.j6.G6);
        org.telegram.ui.ActionBar.q6.Y(h6Var, b41Var.q ? org.telegram.ui.ActionBar.j6.o6 : org.telegram.ui.ActionBar.j6.G6, null);
        org.telegram.ui.ActionBar.q6.s(imageView, b41Var.q ? org.telegram.ui.ActionBar.j6.o6 : org.telegram.ui.ActionBar.j6.G6, null, PorterDuff.Mode.SRC_IN);
        if (z11) {
            imageView.animate().rotation(b41Var.f ? 0.0f : 180.0f).setDuration(340L).setInterpolator(er.h);
        } else {
            imageView.setRotation(b41Var.f ? 0.0f : 180.0f);
        }
        uaVar.d = z10;
        uaVar.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.a41
    public final View d(Context context, uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new ua(context);
    }
}
