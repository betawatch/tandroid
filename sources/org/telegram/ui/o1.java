package org.telegram.ui;

import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class o1 implements org.telegram.ui.Components.l91 {
    public final /* synthetic */ t1 a;

    public o1(t1 t1Var) {
        this.a = t1Var;
    }

    @Override // org.telegram.ui.Components.l91
    public final TextureView a(View view, boolean z10, float f7, int i10, boolean z11) {
        t1 t1Var = this.a;
        i4 i4Var = t1Var.x;
        if (z10) {
            i4Var.R.addView(i4Var.Q, w7.y5.c(-1.0f, -1));
            i4Var.R.setVisibility(0);
            i4Var.R.a(f7, i10);
            i4Var.E0 = t1Var.b;
            i4Var.P.addView(view, w7.y5.c(-1.0f, -1));
            i4Var.P.setVisibility(0);
        } else {
            i4Var.R.removeView(i4Var.Q);
            i4Var.E0 = null;
            i4Var.R.setVisibility(8);
            i4Var.P.setVisibility(4);
        }
        return i4Var.Q;
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
        t1 t1Var = this.a;
        t1Var.a.loadUrl(t1Var.v.url, hashMap);
    }

    @Override // org.telegram.ui.Components.l91
    public final void e(org.telegram.ui.Components.o91 o91Var, boolean z10) {
        i4 i4Var = this.a.x;
        if (!z10) {
            if (i4Var.D0 == o91Var) {
                i4Var.D0 = null;
            }
            try {
                i4Var.L.getWindow().clearFlags(128);
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        org.telegram.ui.Components.o91 o91Var2 = i4Var.D0;
        if (o91Var2 != null && o91Var2 != o91Var) {
            o91Var2.a.B();
            o91Var2.n();
            o91Var2.f0.d(true, true);
        }
        i4Var.D0 = o91Var;
        try {
            i4Var.L.getWindow().addFlags(128);
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
