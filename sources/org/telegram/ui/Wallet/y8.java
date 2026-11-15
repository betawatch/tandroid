package org.telegram.ui.Wallet;

import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.cc;
import org.telegram.ui.an;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class y8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p9 b;

    public /* synthetic */ y8(p9 p9Var, int i7) {
        this.a = i7;
        this.b = p9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        int i7 = this.a;
        p9 p9Var = this.b;
        switch (i7) {
            case 0:
                if (p9Var.J && (editTextBoldCursor = p9Var.I) != null && editTextBoldCursor.isAttachedToWindow() && p9Var.I.hasWindowFocus()) {
                    p9Var.I.requestFocus();
                    if (org.telegram.messenger.g0.J3(p9Var.I)) {
                        p9Var.J = false;
                        break;
                    }
                }
                break;
            case 1:
                float f10 = p9Var.c0;
                if (f10 < 1.0f && p9Var.b0 == null) {
                    r1.g gVar = new r1.g(new r1.f(f10));
                    p9Var.b0 = gVar;
                    r1.h hVar = new r1.h(1.0f);
                    hVar.a(0.55f);
                    hVar.b(65.0f);
                    gVar.m = hVar;
                    p9Var.b0.f(0.001f);
                    p9Var.b0.b(new p3(p9Var, 2));
                    p9Var.b0.a(new r6(p9Var, 1));
                    p9Var.b0.h();
                    break;
                }
                break;
            case 2:
                p9Var.e0.setLoading(false);
                break;
            case 3:
                p9Var.e0.setLoading(false);
                break;
            case 4:
                p9Var.w0();
                break;
            case 5:
                p9Var.presentFragment(an.ua(p9Var.f.id));
                break;
            default:
                org.telegram.messenger.k5.n(null, 2131743201, cc.a0(p9Var), R.raw.copy, 36);
                break;
        }
    }
}
