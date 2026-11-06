package org.telegram.ui.Wallet;

import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.hc;
import org.telegram.ui.an;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n9 b;

    public /* synthetic */ x8(n9 n9Var, int i7) {
        this.a = i7;
        this.b = n9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        int i7 = this.a;
        n9 n9Var = this.b;
        switch (i7) {
            case 0:
                if (n9Var.I && (editTextBoldCursor = n9Var.H) != null && editTextBoldCursor.isAttachedToWindow() && n9Var.H.hasWindowFocus()) {
                    n9Var.H.requestFocus();
                    if (org.telegram.messenger.g0.K3(n9Var.H)) {
                        n9Var.I = false;
                        break;
                    }
                }
                break;
            case 1:
                float f10 = n9Var.b0;
                if (f10 < 1.0f && n9Var.a0 == null) {
                    r1.g gVar = new r1.g(new r1.f(f10));
                    n9Var.a0 = gVar;
                    r1.h hVar = new r1.h(1.0f);
                    hVar.a(0.55f);
                    hVar.b(65.0f);
                    gVar.m = hVar;
                    n9Var.a0.f(0.001f);
                    n9Var.a0.b(new q3(n9Var, 2));
                    n9Var.a0.a(new r6(n9Var, 1));
                    n9Var.a0.h();
                    break;
                }
                break;
            case 2:
                n9Var.d0.setLoading(false);
                break;
            case 3:
                n9Var.d0.setLoading(false);
                break;
            case 4:
                n9Var.w0();
                break;
            case 5:
                n9Var.presentFragment(an.ra(n9Var.f.id));
                break;
            default:
                org.telegram.messenger.k5.o(null, 2131743202, hc.a0(n9Var), R.raw.copy, 36);
                break;
        }
    }
}
