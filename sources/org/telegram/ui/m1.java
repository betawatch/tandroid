package org.telegram.ui;

import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class m1 implements org.telegram.ui.Components.a71 {
    public final /* synthetic */ r1 a;

    public m1(r1 r1Var) {
        this.a = r1Var;
    }

    @Override // org.telegram.ui.Components.a71
    public final TextureView a(View view, boolean z10, float f10, int i3, boolean z11) {
        r1 r1Var = this.a;
        i4 i4Var = r1Var.y;
        if (z10) {
            i4Var.S.addView(i4Var.R, b8.mf.c(-1.0f, -1));
            i4Var.S.setVisibility(0);
            i4Var.S.a(f10, i3);
            i4Var.G0 = r1Var.b;
            i4Var.Q.addView(view, b8.mf.c(-1.0f, -1));
            i4Var.Q.setVisibility(0);
        } else {
            i4Var.S.removeView(i4Var.R);
            i4Var.G0 = null;
            i4Var.S.setVisibility(8);
            i4Var.Q.setVisibility(4);
        }
        return i4Var.R;
    }

    @Override // org.telegram.ui.Components.a71
    public final void c(float f10) {
        this.a.y.S.a(f10, 0);
    }

    @Override // org.telegram.ui.Components.a71
    public final void d() {
        this.a.a.setVisibility(0);
        this.a.b.setVisibility(4);
        this.a.b.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", org.telegram.messenger.t0.b.getPackageName());
        r1 r1Var = this.a;
        r1Var.a.loadUrl(r1Var.w.url, hashMap);
    }

    @Override // org.telegram.ui.Components.a71
    public final void e(org.telegram.ui.Components.d71 d71Var, boolean z10) {
        i4 i4Var = this.a.y;
        if (!z10) {
            if (i4Var.F0 == d71Var) {
                i4Var.F0 = null;
            }
            try {
                i4Var.M.getWindow().clearFlags(128);
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        org.telegram.ui.Components.d71 d71Var2 = i4Var.F0;
        if (d71Var2 != null && d71Var2 != d71Var) {
            d71Var2.a.g0();
            d71Var2.n();
            d71Var2.g0.d(true, true);
        }
        i4Var.F0 = d71Var;
        try {
            i4Var.M.getWindow().addFlags(128);
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override // org.telegram.ui.Components.a71
    public final TextureView f(View view, boolean z10, int i3, int i10, boolean z11) {
        return null;
    }

    @Override // org.telegram.ui.Components.a71
    public final ViewGroup g() {
        return null;
    }

    @Override // org.telegram.ui.Components.a71
    public final boolean h() {
        return false;
    }

    @Override // org.telegram.ui.Components.a71
    public final void b() {
    }

    @Override // org.telegram.ui.Components.a71
    public final void i(boolean z10, org.telegram.ui.Components.v61 v61Var, float f10, boolean z11) {
    }
}
