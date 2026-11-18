package bi;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class x1 extends k41 {
    public static final /* synthetic */ int b = 0;

    static {
        k41.h(new x1());
    }

    @Override // org.telegram.ui.Components.k41
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        ah.r rVar = (ah.r) view;
        Drawable drawable = l41Var.l;
        CharSequence charSequence = l41Var.m;
        CharSequence charSequence2 = l41Var.n;
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
        org.telegram.ui.ActionBar.u6.X(rVar.e, zArr[0] ? org.telegram.ui.ActionBar.n6.n5 : org.telegram.ui.ActionBar.n6.r5, rVar.a);
        mp mpVar = rVar.w;
        if (mpVar != null) {
            mpVar.setAlpha(1.0f);
        }
        u3Var.i(null);
        rVar.setDivider(z10);
    }

    @Override // org.telegram.ui.Components.k41
    public final View d(Context context, ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        ah.r rVar = new ah.r(context, false, false, i6Var, false);
        rVar.setCellBackgroundVisible(false);
        return rVar;
    }
}
