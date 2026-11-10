package org.telegram.ui.Wallet;

import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gc;
import org.telegram.ui.cn;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o9 b;

    public /* synthetic */ y8(o9 o9Var, int i7) {
        this.a = i7;
        this.b = o9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        int i7 = this.a;
        o9 o9Var = this.b;
        switch (i7) {
            case 0:
                if (o9Var.I && (editTextBoldCursor = o9Var.H) != null && editTextBoldCursor.isAttachedToWindow() && o9Var.H.hasWindowFocus()) {
                    o9Var.H.requestFocus();
                    if (org.telegram.messenger.g0.K3(o9Var.H)) {
                        o9Var.I = false;
                        break;
                    }
                }
                break;
            case 1:
                float f10 = o9Var.b0;
                if (f10 < 1.0f && o9Var.a0 == null) {
                    r1.g gVar = new r1.g(new r1.f(f10));
                    o9Var.a0 = gVar;
                    r1.h hVar = new r1.h(1.0f);
                    hVar.a(0.55f);
                    hVar.b(65.0f);
                    gVar.m = hVar;
                    o9Var.a0.f(0.001f);
                    o9Var.a0.b(new q3(o9Var, 2));
                    o9Var.a0.a(new s6(o9Var, 1));
                    o9Var.a0.h();
                    break;
                }
                break;
            case 2:
                o9Var.d0.setLoading(false);
                break;
            case 3:
                o9Var.d0.setLoading(false);
                break;
            case 4:
                o9Var.w0();
                break;
            case 5:
                o9Var.presentFragment(cn.ta(o9Var.f.id));
                break;
            default:
                org.telegram.messenger.k5.o(null, 2131743201, gc.a0(o9Var), R.raw.copy, 36);
                break;
        }
    }
}
