package bi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.y31;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class jc extends x31 {
    public static final /* synthetic */ int b = 0;

    static {
        x31.h(new jc());
    }

    @Override // org.telegram.ui.Components.x31
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        kc kcVar = (kc) view;
        org.telegram.ui.Components.j6 j6Var = kcVar.a;
        ImageView imageView = kcVar.b;
        int i7 = kcVar.c;
        int i10 = y31Var.d;
        boolean z10 = i7 == i10;
        kcVar.c = i10;
        j6Var.c(y31Var.l, z10, true);
        org.telegram.ui.ActionBar.l6.v0(y31Var.q ? org.telegram.ui.ActionBar.l6.o6 : org.telegram.ui.ActionBar.l6.G6);
        org.telegram.ui.ActionBar.s6.Y(j6Var, y31Var.q ? org.telegram.ui.ActionBar.l6.o6 : org.telegram.ui.ActionBar.l6.G6, null);
        org.telegram.ui.ActionBar.s6.s(imageView, y31Var.q ? org.telegram.ui.ActionBar.l6.o6 : org.telegram.ui.ActionBar.l6.G6, null, PorterDuff.Mode.SRC_IN);
        if (z10) {
            imageView.animate().rotation(y31Var.f ? 0.0f : 180.0f).setDuration(340L).setInterpolator(xq.h);
        } else {
            imageView.setRotation(y31Var.f ? 0.0f : 180.0f);
        }
        kcVar.d = z9;
        kcVar.setWillNotDraw(!z9);
    }

    @Override // org.telegram.ui.Components.x31
    public final View d(Context context, qj0 qj0Var, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        return new kc(context);
    }
}
