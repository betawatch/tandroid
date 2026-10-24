package ai;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class rc extends l61 {
    public static final /* synthetic */ int a = 0;

    static {
        l61.setup(new rc());
    }

    @Override // org.telegram.ui.Components.l61
    public final void bindView(View view, m61 m61Var, boolean z10, b71 b71Var, j71 j71Var) {
        sc scVar = (sc) view;
        org.telegram.ui.Components.q6 q6Var = scVar.a;
        ImageView imageView = scVar.b;
        int i10 = scVar.c;
        int i11 = m61Var.d;
        boolean z11 = i10 == i11;
        scVar.c = i11;
        q6Var.c(m61Var.l, z11, true);
        org.telegram.ui.ActionBar.k6.v0(m61Var.q ? org.telegram.ui.ActionBar.k6.o6 : org.telegram.ui.ActionBar.k6.G6);
        org.telegram.ui.ActionBar.r6.a0(q6Var, m61Var.q ? org.telegram.ui.ActionBar.k6.o6 : org.telegram.ui.ActionBar.k6.G6, null);
        org.telegram.ui.ActionBar.r6.t(imageView, m61Var.q ? org.telegram.ui.ActionBar.k6.o6 : org.telegram.ui.ActionBar.k6.G6, null, PorterDuff.Mode.SRC_IN);
        if (z11) {
            imageView.animate().rotation(m61Var.f ? 0.0f : 180.0f).setDuration(340L).setInterpolator(bs.h);
        } else {
            imageView.setRotation(m61Var.f ? 0.0f : 180.0f);
        }
        scVar.d = z10;
        scVar.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.l61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new sc(context);
    }
}
