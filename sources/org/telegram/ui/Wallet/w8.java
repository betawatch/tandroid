package org.telegram.ui.Wallet;

import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.hc;
import org.telegram.ui.an;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m9 b;

    public /* synthetic */ w8(m9 m9Var, int i7) {
        this.a = i7;
        this.b = m9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        int i7 = this.a;
        m9 m9Var = this.b;
        switch (i7) {
            case 0:
                if (m9Var.I && (editTextBoldCursor = m9Var.H) != null && editTextBoldCursor.isAttachedToWindow() && m9Var.H.hasWindowFocus()) {
                    m9Var.H.requestFocus();
                    if (org.telegram.messenger.g0.K3(m9Var.H)) {
                        m9Var.I = false;
                        break;
                    }
                }
                break;
            case 1:
                float f10 = m9Var.b0;
                if (f10 < 1.0f && m9Var.a0 == null) {
                    r1.g gVar = new r1.g(new r1.f(f10));
                    m9Var.a0 = gVar;
                    r1.h hVar = new r1.h(1.0f);
                    hVar.a(0.55f);
                    hVar.b(65.0f);
                    gVar.m = hVar;
                    m9Var.a0.f(0.001f);
                    m9Var.a0.b(new p3(m9Var, 2));
                    m9Var.a0.a(new q6(m9Var, 1));
                    m9Var.a0.h();
                    break;
                }
                break;
            case 2:
                m9Var.d0.setLoading(false);
                break;
            case 3:
                m9Var.d0.setLoading(false);
                break;
            case 4:
                m9Var.w0();
                break;
            case 5:
                m9Var.presentFragment(an.ra(m9Var.f.id));
                break;
            default:
                org.telegram.messenger.k5.o(null, 2131743204, hc.a0(m9Var), R.raw.copy, 36);
                break;
        }
    }
}
