package org.telegram.ui;

import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class n1 implements org.telegram.ui.Components.z81 {
    public final /* synthetic */ s1 a;

    public n1(s1 s1Var) {
        this.a = s1Var;
    }

    @Override // org.telegram.ui.Components.z81
    public final TextureView a(View view, boolean z10, float f7, int i10, boolean z11) {
        s1 s1Var = this.a;
        h4 h4Var = s1Var.x;
        if (z10) {
            h4Var.R.addView(h4Var.Q, w7.x5.c(-1.0f, -1));
            h4Var.R.setVisibility(0);
            h4Var.R.a(f7, i10);
            h4Var.E0 = s1Var.b;
            h4Var.P.addView(view, w7.x5.c(-1.0f, -1));
            h4Var.P.setVisibility(0);
        } else {
            h4Var.R.removeView(h4Var.Q);
            h4Var.E0 = null;
            h4Var.R.setVisibility(8);
            h4Var.P.setVisibility(4);
        }
        return h4Var.Q;
    }

    @Override // org.telegram.ui.Components.z81
    public final void c(float f7) {
        this.a.x.R.a(f7, 0);
    }

    @Override // org.telegram.ui.Components.z81
    public final void d() {
        this.a.a.setVisibility(0);
        this.a.b.setVisibility(4);
        this.a.b.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", ApplicationLoader.applicationContext.getPackageName());
        s1 s1Var = this.a;
        s1Var.a.loadUrl(s1Var.v.url, hashMap);
    }

    @Override // org.telegram.ui.Components.z81
    public final void e(org.telegram.ui.Components.c91 c91Var, boolean z10) {
        h4 h4Var = this.a.x;
        if (!z10) {
            if (h4Var.D0 == c91Var) {
                h4Var.D0 = null;
            }
            try {
                h4Var.L.getWindow().clearFlags(128);
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        org.telegram.ui.Components.c91 c91Var2 = h4Var.D0;
        if (c91Var2 != null && c91Var2 != c91Var) {
            c91Var2.a.B();
            c91Var2.n();
            c91Var2.f0.d(true, true);
        }
        h4Var.D0 = c91Var;
        try {
            h4Var.L.getWindow().addFlags(128);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override // org.telegram.ui.Components.z81
    public final TextureView f(View view, boolean z10, int i10, int i11, boolean z11) {
        return null;
    }

    @Override // org.telegram.ui.Components.z81
    public final ViewGroup g() {
        return null;
    }

    @Override // org.telegram.ui.Components.z81
    public final boolean h() {
        return false;
    }

    @Override // org.telegram.ui.Components.z81
    public final void b() {
    }

    @Override // org.telegram.ui.Components.z81
    public final void i(boolean z10, org.telegram.ui.Components.t81 t81Var, float f7, boolean z11) {
    }
}
