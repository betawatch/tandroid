package org.telegram.ui;

import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class q1 implements org.telegram.ui.Components.r91 {
    public final /* synthetic */ v1 a;

    public q1(v1 v1Var) {
        this.a = v1Var;
    }

    @Override // org.telegram.ui.Components.r91
    public final TextureView a(View view, boolean z10, float f7, int i10, boolean z11) {
        v1 v1Var = this.a;
        l4 l4Var = v1Var.x;
        if (z10) {
            l4Var.R.addView(l4Var.Q, w7.z5.d(-1.0f, -1));
            l4Var.R.setVisibility(0);
            l4Var.R.a(f7, i10);
            l4Var.E0 = v1Var.b;
            l4Var.P.addView(view, w7.z5.d(-1.0f, -1));
            l4Var.P.setVisibility(0);
        } else {
            l4Var.R.removeView(l4Var.Q);
            l4Var.E0 = null;
            l4Var.R.setVisibility(8);
            l4Var.P.setVisibility(4);
        }
        return l4Var.Q;
    }

    @Override // org.telegram.ui.Components.r91
    public final void c(float f7) {
        this.a.x.R.a(f7, 0);
    }

    @Override // org.telegram.ui.Components.r91
    public final void d() {
        this.a.a.setVisibility(0);
        this.a.b.setVisibility(4);
        this.a.b.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", ApplicationLoader.applicationContext.getPackageName());
        v1 v1Var = this.a;
        v1Var.a.loadUrl(v1Var.v.url, hashMap);
    }

    @Override // org.telegram.ui.Components.r91
    public final void e(org.telegram.ui.Components.u91 u91Var, boolean z10) {
        l4 l4Var = this.a.x;
        if (!z10) {
            if (l4Var.D0 == u91Var) {
                l4Var.D0 = null;
            }
            try {
                l4Var.L.getWindow().clearFlags(128);
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        org.telegram.ui.Components.u91 u91Var2 = l4Var.D0;
        if (u91Var2 != null && u91Var2 != u91Var) {
            u91Var2.a.B();
            u91Var2.n();
            u91Var2.f0.d(true, true);
        }
        l4Var.D0 = u91Var;
        try {
            l4Var.L.getWindow().addFlags(128);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override // org.telegram.ui.Components.r91
    public final TextureView f(View view, boolean z10, int i10, int i11, boolean z11) {
        return null;
    }

    @Override // org.telegram.ui.Components.r91
    public final ViewGroup g() {
        return null;
    }

    @Override // org.telegram.ui.Components.r91
    public final boolean h() {
        return false;
    }

    @Override // org.telegram.ui.Components.r91
    public final void b() {
    }

    @Override // org.telegram.ui.Components.r91
    public final void i(boolean z10, org.telegram.ui.Components.m91 m91Var, float f7, boolean z11) {
    }
}
