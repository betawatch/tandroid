package bi;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.q9;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class b2 extends n41 {
    public static final /* synthetic */ int b = 0;

    static {
        n41.h(new b2());
    }

    @Override // org.telegram.ui.Components.n41
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        ah.r rVar = (ah.r) view;
        Drawable drawable = o41Var.l;
        CharSequence charSequence = o41Var.m;
        CharSequence charSequence2 = o41Var.n;
        rVar.x.setVisibility(8);
        rVar.I = null;
        rVar.J = null;
        q9 q9Var = rVar.c;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        q9Var.setImageDrawable(drawable);
        fi.u3 u3Var = rVar.d;
        u3Var.k(charSequence);
        boolean[] zArr = rVar.s;
        zArr[0] = false;
        rVar.setSubtitle(charSequence2);
        org.telegram.ui.ActionBar.t6.X(rVar.e, zArr[0] ? org.telegram.ui.ActionBar.m6.n5 : org.telegram.ui.ActionBar.m6.r5, rVar.a);
        op opVar = rVar.w;
        if (opVar != null) {
            opVar.setAlpha(1.0f);
        }
        u3Var.i(null);
        rVar.setDivider(z10);
    }

    @Override // org.telegram.ui.Components.n41
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        ah.r rVar = new ah.r(context, false, false, h6Var, false);
        rVar.setCellBackgroundVisible(false);
        return rVar;
    }
}
