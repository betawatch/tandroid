package org.telegram.ui.Wallet;

import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.kc;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class o9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ea b;

    public /* synthetic */ o9(ea eaVar, int i7) {
        this.a = i7;
        this.b = eaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        int i7 = this.a;
        ea eaVar = this.b;
        switch (i7) {
            case 0:
                if (eaVar.J && (editTextBoldCursor = eaVar.I) != null && editTextBoldCursor.isAttachedToWindow() && eaVar.I.hasWindowFocus()) {
                    eaVar.I.requestFocus();
                    if (org.telegram.messenger.g0.I3(eaVar.I)) {
                        eaVar.J = false;
                        break;
                    }
                }
                break;
            case 1:
                float f10 = eaVar.c0;
                if (f10 < 1.0f && eaVar.b0 == null) {
                    r1.g gVar = new r1.g(new r1.f(f10));
                    eaVar.b0 = gVar;
                    r1.h hVar = new r1.h(1.0f);
                    hVar.a(0.55f);
                    hVar.b(65.0f);
                    gVar.m = hVar;
                    eaVar.b0.f(0.001f);
                    eaVar.b0.b(new z3(eaVar, 2));
                    eaVar.b0.a(new i7(eaVar, 1));
                    eaVar.b0.h();
                    break;
                }
                break;
            case 2:
                eaVar.e0.setLoading(false);
                break;
            case 3:
                eaVar.e0.setLoading(false);
                break;
            case 4:
                eaVar.w0();
                break;
            case 5:
                eaVar.presentFragment(bn.ua(eaVar.f.id));
                break;
            default:
                org.telegram.messenger.f3.n(null, 2131742950, kc.b0(eaVar), R.raw.copy, 36);
                break;
        }
    }
}
