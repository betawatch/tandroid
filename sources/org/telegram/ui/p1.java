package org.telegram.ui;

import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class p1 implements org.telegram.ui.Components.b91 {
    public final /* synthetic */ u1 a;

    public p1(u1 u1Var) {
        this.a = u1Var;
    }

    @Override // org.telegram.ui.Components.b91
    public final TextureView a(View view, boolean z4, float f10, int i10, boolean z10) {
        u1 u1Var = this.a;
        l4 l4Var = u1Var.x;
        if (z4) {
            l4Var.O.addView(l4Var.N, k7.c6.c(-1.0f, -1));
            l4Var.O.setVisibility(0);
            l4Var.O.a(f10, i10);
            l4Var.B0 = u1Var.b;
            l4Var.M.addView(view, k7.c6.c(-1.0f, -1));
            l4Var.M.setVisibility(0);
        } else {
            l4Var.O.removeView(l4Var.N);
            l4Var.B0 = null;
            l4Var.O.setVisibility(8);
            l4Var.M.setVisibility(4);
        }
        return l4Var.N;
    }

    @Override // org.telegram.ui.Components.b91
    public final void c(float f10, int i10) {
        this.a.x.O.a(f10, i10);
    }

    @Override // org.telegram.ui.Components.b91
    public final void d() {
        this.a.a.setVisibility(0);
        this.a.b.setVisibility(4);
        this.a.b.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", ApplicationLoader.applicationContext.getPackageName());
        u1 u1Var = this.a;
        u1Var.a.loadUrl(u1Var.v.url, hashMap);
    }

    @Override // org.telegram.ui.Components.b91
    public final void e(org.telegram.ui.Components.e91 e91Var, boolean z4) {
        l4 l4Var = this.a.x;
        if (!z4) {
            if (l4Var.A0 == e91Var) {
                l4Var.A0 = null;
            }
            try {
                l4Var.I.getWindow().clearFlags(128);
                return;
            } catch (Exception e6) {
                FileLog.e(e6);
                return;
            }
        }
        org.telegram.ui.Components.e91 e91Var2 = l4Var.A0;
        if (e91Var2 != null && e91Var2 != e91Var) {
            e91Var2.a.B();
            e91Var2.n();
            e91Var2.c0.d(true, true);
        }
        l4Var.A0 = e91Var;
        try {
            l4Var.I.getWindow().addFlags(128);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // org.telegram.ui.Components.b91
    public final TextureView f(View view, boolean z4, int i10, int i11, boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.Components.b91
    public final ViewGroup g() {
        return null;
    }

    @Override // org.telegram.ui.Components.b91
    public final boolean h() {
        return false;
    }

    @Override // org.telegram.ui.Components.b91
    public final void b() {
    }

    @Override // org.telegram.ui.Components.b91
    public final void i(boolean z4, org.telegram.ui.Components.w81 w81Var, float f10, boolean z10) {
    }
}
