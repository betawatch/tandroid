package org.telegram.ui.Wallet;

import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.lc;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ da b;

    public /* synthetic */ n9(da daVar, int i7) {
        this.a = i7;
        this.b = daVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        int i7 = this.a;
        da daVar = this.b;
        switch (i7) {
            case 0:
                if (daVar.J && (editTextBoldCursor = daVar.I) != null && editTextBoldCursor.isAttachedToWindow() && daVar.I.hasWindowFocus()) {
                    daVar.I.requestFocus();
                    if (org.telegram.messenger.g0.I3(daVar.I)) {
                        daVar.J = false;
                        break;
                    }
                }
                break;
            case 1:
                float f10 = daVar.c0;
                if (f10 < 1.0f && daVar.b0 == null) {
                    r1.g gVar = new r1.g(new r1.f(f10));
                    daVar.b0 = gVar;
                    r1.h hVar = new r1.h(1.0f);
                    hVar.a(0.55f);
                    hVar.b(65.0f);
                    gVar.m = hVar;
                    daVar.b0.f(0.001f);
                    daVar.b0.b(new y3(daVar, 2));
                    daVar.b0.a(new h7(daVar, 1));
                    daVar.b0.h();
                    break;
                }
                break;
            case 2:
                daVar.e0.setLoading(false);
                break;
            case 3:
                daVar.e0.setLoading(false);
                break;
            case 4:
                daVar.w0();
                break;
            case 5:
                daVar.presentFragment(bn.ua(daVar.f.id));
                break;
            default:
                org.telegram.messenger.f3.n(null, 2131742955, lc.b0(daVar), R.raw.copy, 36);
                break;
        }
    }
}
