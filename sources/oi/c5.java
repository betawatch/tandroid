package oi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.j6;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class c5 extends k41 {
    public static final /* synthetic */ int b = 0;

    static {
        k41.h(new c5());
    }

    @Override // org.telegram.ui.Components.k41
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        TL_iv.RichText richText;
        d5 d5Var = (d5) view;
        a aVar = (a) l41Var.H;
        b5 b5Var = (b5) l41Var.I;
        e1 e1Var = d5Var.r;
        d5Var.a = aVar;
        d5Var.s = b5Var;
        d5Var.f(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        d5Var.c(aVar);
        if (b5Var != null) {
            richText = (TL_iv.RichText) ((z2) b5Var).a.u3.get(Long.valueOf(aVar.t));
        } else {
            richText = null;
        }
        if (String.valueOf(e1Var.getText()).equals(b6.l(richText))) {
            return;
        }
        e1Var.setTextSilently(j6.m(b6.r(richText, null, true), e1Var.getPaint().getFontMetricsInt(), false, null, 0));
        e1Var.f();
    }

    @Override // org.telegram.ui.Components.k41
    public final View d(Context context, ck0 ck0Var, int i7, i6 i6Var) {
        return new d5(context, i6Var);
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean f() {
        return false;
    }
}
