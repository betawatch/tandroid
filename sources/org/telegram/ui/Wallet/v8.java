package org.telegram.ui.Wallet;

import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.hc;
import org.telegram.ui.cn;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final /* synthetic */ class v8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l9 b;

    public /* synthetic */ v8(l9 l9Var, int i7) {
        this.a = i7;
        this.b = l9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        int i7 = this.a;
        l9 l9Var = this.b;
        switch (i7) {
            case 0:
                if (l9Var.I && (editTextBoldCursor = l9Var.H) != null && editTextBoldCursor.isAttachedToWindow() && l9Var.H.hasWindowFocus()) {
                    l9Var.H.requestFocus();
                    if (org.telegram.messenger.g0.K3(l9Var.H)) {
                        l9Var.I = false;
                        break;
                    }
                }
                break;
            case 1:
                float f10 = l9Var.b0;
                if (f10 < 1.0f && l9Var.a0 == null) {
                    r1.g gVar = new r1.g(new r1.f(f10));
                    l9Var.a0 = gVar;
                    r1.h hVar = new r1.h(1.0f);
                    hVar.a(0.55f);
                    hVar.b(65.0f);
                    gVar.m = hVar;
                    l9Var.a0.f(0.001f);
                    l9Var.a0.b(new o3(l9Var, 2));
                    l9Var.a0.a(new p6(l9Var, 1));
                    l9Var.a0.h();
                    break;
                }
                break;
            case 2:
                l9Var.d0.setLoading(false);
                break;
            case 3:
                l9Var.d0.setLoading(false);
                break;
            case 4:
                l9Var.w0();
                break;
            case 5:
                l9Var.presentFragment(cn.ta(l9Var.f.id));
                break;
            default:
                org.telegram.messenger.k5.o(null, 2131743201, hc.a0(l9Var), R.raw.copy, 36);
                break;
        }
    }
}
