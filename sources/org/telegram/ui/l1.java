package org.telegram.ui;

import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class l1 implements org.telegram.ui.Components.i71 {
    public final /* synthetic */ q1 a;

    public l1(q1 q1Var) {
        this.a = q1Var;
    }

    @Override // org.telegram.ui.Components.i71
    public final TextureView a(View view, boolean z9, float f10, int i7, boolean z10) {
        q1 q1Var = this.a;
        g4 g4Var = q1Var.y;
        if (z9) {
            g4Var.R.addView(g4Var.Q, c8.ha.c(-1.0f, -1));
            g4Var.R.setVisibility(0);
            g4Var.R.a(f10, i7);
            g4Var.F0 = q1Var.b;
            g4Var.P.addView(view, c8.ha.c(-1.0f, -1));
            g4Var.P.setVisibility(0);
        } else {
            g4Var.R.removeView(g4Var.Q);
            g4Var.F0 = null;
            g4Var.R.setVisibility(8);
            g4Var.P.setVisibility(4);
        }
        return g4Var.Q;
    }

    @Override // org.telegram.ui.Components.i71
    public final void c(float f10) {
        this.a.y.R.a(f10, 0);
    }

    @Override // org.telegram.ui.Components.i71
    public final void d() {
        this.a.a.setVisibility(0);
        this.a.b.setVisibility(4);
        this.a.b.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", org.telegram.messenger.t0.b.getPackageName());
        q1 q1Var = this.a;
        q1Var.a.loadUrl(q1Var.w.url, hashMap);
    }

    @Override // org.telegram.ui.Components.i71
    public final void e(org.telegram.ui.Components.l71 l71Var, boolean z9) {
        g4 g4Var = this.a.y;
        if (!z9) {
            if (g4Var.E0 == l71Var) {
                g4Var.E0 = null;
            }
            try {
                g4Var.L.getWindow().clearFlags(128);
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        org.telegram.ui.Components.l71 l71Var2 = g4Var.E0;
        if (l71Var2 != null && l71Var2 != l71Var) {
            l71Var2.a.g0();
            l71Var2.n();
            l71Var2.f0.d(true, true);
        }
        g4Var.E0 = l71Var;
        try {
            g4Var.L.getWindow().addFlags(128);
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override // org.telegram.ui.Components.i71
    public final TextureView f(View view, boolean z9, int i7, int i10, boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.Components.i71
    public final ViewGroup g() {
        return null;
    }

    @Override // org.telegram.ui.Components.i71
    public final boolean h() {
        return false;
    }

    @Override // org.telegram.ui.Components.i71
    public final void b() {
    }

    @Override // org.telegram.ui.Components.i71
    public final void i(boolean z9, org.telegram.ui.Components.d71 d71Var, float f10, boolean z10) {
    }
}
