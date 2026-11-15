package org.telegram.ui;

import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class l1 implements org.telegram.ui.Components.j71 {
    public final /* synthetic */ q1 a;

    public l1(q1 q1Var) {
        this.a = q1Var;
    }

    @Override // org.telegram.ui.Components.j71
    public final TextureView a(View view, boolean z10, float f10, int i7, boolean z11) {
        q1 q1Var = this.a;
        g4 g4Var = q1Var.y;
        if (z10) {
            g4Var.S.addView(g4Var.R, c8.ja.c(-1.0f, -1));
            g4Var.S.setVisibility(0);
            g4Var.S.a(f10, i7);
            g4Var.G0 = q1Var.b;
            g4Var.Q.addView(view, c8.ja.c(-1.0f, -1));
            g4Var.Q.setVisibility(0);
        } else {
            g4Var.S.removeView(g4Var.R);
            g4Var.G0 = null;
            g4Var.S.setVisibility(8);
            g4Var.Q.setVisibility(4);
        }
        return g4Var.R;
    }

    @Override // org.telegram.ui.Components.j71
    public final void c(float f10) {
        this.a.y.S.a(f10, 0);
    }

    @Override // org.telegram.ui.Components.j71
    public final void d() {
        this.a.a.setVisibility(0);
        this.a.b.setVisibility(4);
        this.a.b.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", org.telegram.messenger.t0.b.getPackageName());
        q1 q1Var = this.a;
        q1Var.a.loadUrl(q1Var.w.url, hashMap);
    }

    @Override // org.telegram.ui.Components.j71
    public final void e(org.telegram.ui.Components.m71 m71Var, boolean z10) {
        g4 g4Var = this.a.y;
        if (!z10) {
            if (g4Var.F0 == m71Var) {
                g4Var.F0 = null;
            }
            try {
                g4Var.M.getWindow().clearFlags(128);
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        org.telegram.ui.Components.m71 m71Var2 = g4Var.F0;
        if (m71Var2 != null && m71Var2 != m71Var) {
            m71Var2.a.g0();
            m71Var2.n();
            m71Var2.g0.d(true, true);
        }
        g4Var.F0 = m71Var;
        try {
            g4Var.M.getWindow().addFlags(128);
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override // org.telegram.ui.Components.j71
    public final TextureView f(View view, boolean z10, int i7, int i10, boolean z11) {
        return null;
    }

    @Override // org.telegram.ui.Components.j71
    public final ViewGroup g() {
        return null;
    }

    @Override // org.telegram.ui.Components.j71
    public final boolean h() {
        return false;
    }

    @Override // org.telegram.ui.Components.j71
    public final void b() {
    }

    @Override // org.telegram.ui.Components.j71
    public final void i(boolean z10, org.telegram.ui.Components.e71 e71Var, float f10, boolean z11) {
    }
}
