package org.telegram.ui;

import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class p1 implements org.telegram.ui.Components.l91 {
    public final /* synthetic */ u1 a;

    public p1(u1 u1Var) {
        this.a = u1Var;
    }

    @Override // org.telegram.ui.Components.l91
    public final TextureView a(View view, boolean z10, float f7, int i10, boolean z11) {
        u1 u1Var = this.a;
        j4 j4Var = u1Var.x;
        if (z10) {
            j4Var.R.addView(j4Var.Q, w7.a6.c(-1.0f, -1));
            j4Var.R.setVisibility(0);
            j4Var.R.a(f7, i10);
            j4Var.E0 = u1Var.b;
            j4Var.P.addView(view, w7.a6.c(-1.0f, -1));
            j4Var.P.setVisibility(0);
        } else {
            j4Var.R.removeView(j4Var.Q);
            j4Var.E0 = null;
            j4Var.R.setVisibility(8);
            j4Var.P.setVisibility(4);
        }
        return j4Var.Q;
    }

    @Override // org.telegram.ui.Components.l91
    public final void c(float f7) {
        this.a.x.R.a(f7, 0);
    }

    @Override // org.telegram.ui.Components.l91
    public final void d() {
        this.a.a.setVisibility(0);
        this.a.b.setVisibility(4);
        this.a.b.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", ApplicationLoader.applicationContext.getPackageName());
        u1 u1Var = this.a;
        u1Var.a.loadUrl(u1Var.v.url, hashMap);
    }

    @Override // org.telegram.ui.Components.l91
    public final void e(org.telegram.ui.Components.o91 o91Var, boolean z10) {
        j4 j4Var = this.a.x;
        if (!z10) {
            if (j4Var.D0 == o91Var) {
                j4Var.D0 = null;
            }
            try {
                j4Var.L.getWindow().clearFlags(128);
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        org.telegram.ui.Components.o91 o91Var2 = j4Var.D0;
        if (o91Var2 != null && o91Var2 != o91Var) {
            o91Var2.a.B();
            o91Var2.n();
            o91Var2.f0.d(true, true);
        }
        j4Var.D0 = o91Var;
        try {
            j4Var.L.getWindow().addFlags(128);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override // org.telegram.ui.Components.l91
    public final TextureView f(View view, boolean z10, int i10, int i11, boolean z11) {
        return null;
    }

    @Override // org.telegram.ui.Components.l91
    public final ViewGroup g() {
        return null;
    }

    @Override // org.telegram.ui.Components.l91
    public final boolean h() {
        return false;
    }

    @Override // org.telegram.ui.Components.l91
    public final void b() {
    }

    @Override // org.telegram.ui.Components.l91
    public final void i(boolean z10, org.telegram.ui.Components.g91 g91Var, float f7, boolean z11) {
    }
}
