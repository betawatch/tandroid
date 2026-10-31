package org.telegram.ui.Wallet;

import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.cc;
import org.telegram.ui.un;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class c9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r9 b;

    public /* synthetic */ c9(r9 r9Var, int i10) {
        this.a = i10;
        this.b = r9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        int i10 = this.a;
        r9 r9Var = this.b;
        switch (i10) {
            case 0:
                if (r9Var.I && (editTextBoldCursor = r9Var.H) != null && editTextBoldCursor.isAttachedToWindow() && r9Var.H.hasWindowFocus()) {
                    r9Var.H.requestFocus();
                    if (org.telegram.messenger.i0.J3(r9Var.H)) {
                        r9Var.I = false;
                        break;
                    }
                }
                break;
            case 1:
                float f7 = r9Var.b0;
                if (f7 < 1.0f && r9Var.a0 == null) {
                    o1.j jVar = new o1.j(new o1.i(f7));
                    r9Var.a0 = jVar;
                    o1.k kVar = new o1.k(1.0f);
                    kVar.a(0.55f);
                    kVar.b(65.0f);
                    jVar.m = kVar;
                    r9Var.a0.f(0.001f);
                    r9Var.a0.b(new q3(r9Var, 2));
                    r9Var.a0.a(new v6(r9Var, 1));
                    r9Var.a0.h();
                    break;
                }
                break;
            case 2:
                r9Var.d0.setLoading(false);
                break;
            case 3:
                r9Var.d0.setLoading(false);
                break;
            case 4:
                r9Var.v0();
                break;
            case 5:
                r9Var.presentFragment(un.ha(r9Var.f.id));
                break;
            default:
                org.telegram.messenger.m5.n(null, 2131743227, cc.a0(r9Var), R.raw.copy, 36);
                break;
        }
    }
}
