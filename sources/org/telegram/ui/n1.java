package org.telegram.ui;

import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n1 implements org.telegram.ui.Components.j81 {
    public final /* synthetic */ r1 a;

    public n1(r1 r1Var) {
        this.a = r1Var;
    }

    @Override // org.telegram.ui.Components.j81
    public final TextureView a(View view, boolean z10, float f7, int i10, boolean z11) {
        r1 r1Var = this.a;
        h4 h4Var = r1Var.y;
        if (z10) {
            h4Var.R.addView(h4Var.Q, w7.b6.c(-1.0f, -1));
            h4Var.R.setVisibility(0);
            h4Var.R.a(f7, i10);
            h4Var.F0 = r1Var.b;
            h4Var.P.addView(view, w7.b6.c(-1.0f, -1));
            h4Var.P.setVisibility(0);
        } else {
            h4Var.R.removeView(h4Var.Q);
            h4Var.F0 = null;
            h4Var.R.setVisibility(8);
            h4Var.P.setVisibility(4);
        }
        return h4Var.Q;
    }

    @Override // org.telegram.ui.Components.j81
    public final void c(float f7) {
        this.a.y.R.a(f7, 0);
    }

    @Override // org.telegram.ui.Components.j81
    public final void d() {
        this.a.a.setVisibility(0);
        this.a.b.setVisibility(4);
        this.a.b.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", org.telegram.messenger.w0.b.getPackageName());
        r1 r1Var = this.a;
        r1Var.a.loadUrl(r1Var.w.url, hashMap);
    }

    @Override // org.telegram.ui.Components.j81
    public final void e(org.telegram.ui.Components.m81 m81Var, boolean z10) {
        h4 h4Var = this.a.y;
        if (!z10) {
            if (h4Var.E0 == m81Var) {
                h4Var.E0 = null;
            }
            try {
                h4Var.L.getWindow().clearFlags(128);
                return;
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                return;
            }
        }
        org.telegram.ui.Components.m81 m81Var2 = h4Var.E0;
        if (m81Var2 != null && m81Var2 != m81Var) {
            m81Var2.a.g0();
            m81Var2.n();
            m81Var2.f0.d(true, true);
        }
        h4Var.E0 = m81Var;
        try {
            h4Var.L.getWindow().addFlags(128);
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
    }

    @Override // org.telegram.ui.Components.j81
    public final TextureView f(View view, boolean z10, int i10, int i11, boolean z11) {
        return null;
    }

    @Override // org.telegram.ui.Components.j81
    public final ViewGroup g() {
        return null;
    }

    @Override // org.telegram.ui.Components.j81
    public final boolean h() {
        return false;
    }

    @Override // org.telegram.ui.Components.j81
    public final void b() {
    }

    @Override // org.telegram.ui.Components.j81
    public final void i(boolean z10, org.telegram.ui.Components.e81 e81Var, float f7, boolean z11) {
    }
}
