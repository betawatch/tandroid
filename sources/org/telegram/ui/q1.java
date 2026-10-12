package org.telegram.ui;

import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class q1 implements org.telegram.ui.Components.z91 {
    public final /* synthetic */ v1 a;

    public q1(v1 v1Var) {
        this.a = v1Var;
    }

    @Override // org.telegram.ui.Components.z91
    public final TextureView a(View view, boolean z10, float f7, int i10, boolean z11) {
        v1 v1Var = this.a;
        k4 k4Var = v1Var.x;
        if (z10) {
            k4Var.R.addView(k4Var.Q, w7.a6.d(-1.0f, -1));
            k4Var.R.setVisibility(0);
            k4Var.R.a(f7, i10);
            k4Var.E0 = v1Var.b;
            k4Var.P.addView(view, w7.a6.d(-1.0f, -1));
            k4Var.P.setVisibility(0);
        } else {
            k4Var.R.removeView(k4Var.Q);
            k4Var.E0 = null;
            k4Var.R.setVisibility(8);
            k4Var.P.setVisibility(4);
        }
        return k4Var.Q;
    }

    @Override // org.telegram.ui.Components.z91
    public final void c(float f7) {
        this.a.x.R.a(f7, 0);
    }

    @Override // org.telegram.ui.Components.z91
    public final void d() {
        this.a.a.setVisibility(0);
        this.a.b.setVisibility(4);
        this.a.b.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", ApplicationLoader.applicationContext.getPackageName());
        v1 v1Var = this.a;
        v1Var.a.loadUrl(v1Var.v.url, hashMap);
    }

    @Override // org.telegram.ui.Components.z91
    public final void e(org.telegram.ui.Components.ca1 ca1Var, boolean z10) {
        k4 k4Var = this.a.x;
        if (!z10) {
            if (k4Var.D0 == ca1Var) {
                k4Var.D0 = null;
            }
            try {
                k4Var.L.getWindow().clearFlags(128);
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        org.telegram.ui.Components.ca1 ca1Var2 = k4Var.D0;
        if (ca1Var2 != null && ca1Var2 != ca1Var) {
            ca1Var2.a.B();
            ca1Var2.n();
            ca1Var2.f0.d(true, true);
        }
        k4Var.D0 = ca1Var;
        try {
            k4Var.L.getWindow().addFlags(128);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override // org.telegram.ui.Components.z91
    public final TextureView f(View view, boolean z10, int i10, int i11, boolean z11) {
        return null;
    }

    @Override // org.telegram.ui.Components.z91
    public final ViewGroup g() {
        return null;
    }

    @Override // org.telegram.ui.Components.z91
    public final boolean h() {
        return false;
    }

    @Override // org.telegram.ui.Components.z91
    public final void b() {
    }

    @Override // org.telegram.ui.Components.z91
    public final void i(boolean z10, org.telegram.ui.Components.u91 u91Var, float f7, boolean z11) {
    }
}
