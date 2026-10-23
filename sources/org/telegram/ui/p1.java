package org.telegram.ui;

import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class p1 implements org.telegram.ui.Components.aa1 {
    public final /* synthetic */ u1 a;

    public p1(u1 u1Var) {
        this.a = u1Var;
    }

    @Override // org.telegram.ui.Components.aa1
    public final TextureView a(View view, boolean z10, float f7, int i10, boolean z11) {
        u1 u1Var = this.a;
        k4 k4Var = u1Var.x;
        if (z10) {
            k4Var.R.addView(k4Var.Q, w7.z5.c(-1.0f, -1));
            k4Var.R.setVisibility(0);
            k4Var.R.a(f7, i10);
            k4Var.F0 = u1Var.b;
            k4Var.P.addView(view, w7.z5.c(-1.0f, -1));
            k4Var.P.setVisibility(0);
        } else {
            k4Var.R.removeView(k4Var.Q);
            k4Var.F0 = null;
            k4Var.R.setVisibility(8);
            k4Var.P.setVisibility(4);
        }
        return k4Var.Q;
    }

    @Override // org.telegram.ui.Components.aa1
    public final void c(float f7) {
        this.a.x.R.a(f7, 0);
    }

    @Override // org.telegram.ui.Components.aa1
    public final void d() {
        this.a.a.setVisibility(0);
        this.a.b.setVisibility(4);
        this.a.b.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", ApplicationLoader.applicationContext.getPackageName());
        u1 u1Var = this.a;
        u1Var.a.loadUrl(u1Var.v.url, hashMap);
    }

    @Override // org.telegram.ui.Components.aa1
    public final void e(org.telegram.ui.Components.da1 da1Var, boolean z10) {
        k4 k4Var = this.a.x;
        if (!z10) {
            if (k4Var.E0 == da1Var) {
                k4Var.E0 = null;
            }
            try {
                k4Var.L.getWindow().clearFlags(128);
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        org.telegram.ui.Components.da1 da1Var2 = k4Var.E0;
        if (da1Var2 != null && da1Var2 != da1Var) {
            da1Var2.a.B();
            da1Var2.n();
            da1Var2.f0.d(true, true);
        }
        k4Var.E0 = da1Var;
        try {
            k4Var.L.getWindow().addFlags(128);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override // org.telegram.ui.Components.aa1
    public final TextureView f(View view, boolean z10, int i10, int i11, boolean z11) {
        return null;
    }

    @Override // org.telegram.ui.Components.aa1
    public final ViewGroup g() {
        return null;
    }

    @Override // org.telegram.ui.Components.aa1
    public final boolean h() {
        return false;
    }

    @Override // org.telegram.ui.Components.aa1
    public final void b() {
    }

    @Override // org.telegram.ui.Components.aa1
    public final void i(boolean z10, org.telegram.ui.Components.v91 v91Var, float f7, boolean z11) {
    }
}
