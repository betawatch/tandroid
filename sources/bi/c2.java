package bi;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.p9;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class c2 extends m41 {
    public static final /* synthetic */ int b = 0;

    static {
        m41.h(new c2());
    }

    @Override // org.telegram.ui.Components.m41
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        ah.r rVar = (ah.r) view;
        Drawable drawable = n41Var.l;
        CharSequence charSequence = n41Var.m;
        CharSequence charSequence2 = n41Var.n;
        rVar.x.setVisibility(8);
        rVar.I = null;
        rVar.J = null;
        p9 p9Var = rVar.c;
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        p9Var.setImageDrawable(drawable);
        fi.u3 u3Var = rVar.d;
        u3Var.k(charSequence);
        boolean[] zArr = rVar.s;
        zArr[0] = false;
        rVar.setSubtitle(charSequence2);
        org.telegram.ui.ActionBar.u6.X(rVar.e, zArr[0] ? org.telegram.ui.ActionBar.n6.n5 : org.telegram.ui.ActionBar.n6.r5, rVar.a);
        lp lpVar = rVar.w;
        if (lpVar != null) {
            lpVar.setAlpha(1.0f);
        }
        u3Var.i(null);
        rVar.setDivider(z10);
    }

    @Override // org.telegram.ui.Components.m41
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        ah.r rVar = new ah.r(context, false, false, i6Var, false);
        rVar.setCellBackgroundVisible(false);
        return rVar;
    }
}
