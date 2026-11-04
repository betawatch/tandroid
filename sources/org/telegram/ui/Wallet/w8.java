package org.telegram.ui.Wallet;

import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.fc;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class w8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m9 b;

    public /* synthetic */ w8(m9 m9Var, int i3) {
        this.a = i3;
        this.b = m9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        int i3 = this.a;
        m9 m9Var = this.b;
        switch (i3) {
            case 0:
                if (m9Var.J && (editTextBoldCursor = m9Var.I) != null && editTextBoldCursor.isAttachedToWindow() && m9Var.I.hasWindowFocus()) {
                    m9Var.I.requestFocus();
                    if (org.telegram.messenger.g0.K3(m9Var.I)) {
                        m9Var.J = false;
                        break;
                    }
                }
                break;
            case 1:
                float f10 = m9Var.c0;
                if (f10 < 1.0f && m9Var.b0 == null) {
                    q1.g gVar = new q1.g(new q1.f(f10));
                    m9Var.b0 = gVar;
                    q1.h hVar = new q1.h(1.0f);
                    hVar.a(0.55f);
                    hVar.b(65.0f);
                    gVar.m = hVar;
                    m9Var.b0.f(0.001f);
                    m9Var.b0.b(new o3(m9Var, 2));
                    m9Var.b0.a(new p6(m9Var, 1));
                    m9Var.b0.h();
                    break;
                }
                break;
            case 2:
                m9Var.e0.setLoading(false);
                break;
            case 3:
                m9Var.e0.setLoading(false);
                break;
            case 4:
                m9Var.w0();
                break;
            case 5:
                m9Var.presentFragment(wm.ra(m9Var.f.id));
                break;
            default:
                org.telegram.messenger.k5.o(null, 2131743211, fc.a0(m9Var), R.raw.copy, 36);
                break;
        }
    }
}
