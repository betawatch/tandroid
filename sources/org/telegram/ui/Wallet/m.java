package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.ui.Components.g51;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    private final void a() {
        j0 j0Var = (j0) this.b;
        synchronized (j0Var) {
            if (j0Var.a) {
                return;
            }
            j0Var.a = true;
            Runnable runnable = j0Var.b;
            if (runnable != null) {
                runnable.run();
                j0Var.b = null;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        View d;
        switch (this.a) {
            case 0:
                h0 h0Var = (h0) this.b;
                synchronized (h0Var) {
                    if (h0Var.a) {
                        return;
                    }
                    h0Var.a = true;
                    Runnable runnable = h0Var.b;
                    if (runnable != null) {
                        runnable.run();
                        h0Var.b = null;
                    }
                    return;
                }
            case 1:
                ((s0) this.b).close();
                return;
            case 2:
                a();
                return;
            case 3:
                f1 f1Var = (f1) this.b;
                f1Var.c("AUTH_CANCELED");
                f1Var.e();
                if (c8.ab.b == f1Var) {
                    c8.ab.b = null;
                    return;
                }
                return;
            case 4:
                ((e3) this.b).dismiss();
                return;
            case 5:
                ((org.telegram.ui.Cells.v0) this.b).invalidate();
                return;
            case 6:
                ((org.telegram.ui.ActionBar.k5) this.b).a(true);
                return;
            case 7:
                org.telegram.messenger.g0.E2((hi.u3) this.b);
                return;
            case 8:
                k6 k6Var = (k6) this.b;
                bi.i6 i6Var = k6Var.c;
                if (i6Var == null || i6Var.getScrollState() != 0) {
                    return;
                }
                g51 B0 = k6Var.j.B0();
                if ((B0 == null || B0.getScrollState() == 0) && (d = k6Var.d(k6Var.c.f3)) != null) {
                    v4.c0 c0Var = k6Var.c.f3;
                    c0Var.getClass();
                    int i7 = new int[]{0, v4.p0.z(d) - c0Var.F()}[1];
                    if (i7 != 0) {
                        k6Var.c.w0(0, i7, null);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                fi.u2 u2Var = (fi.u2) this.b;
                ci.f fVar = (ci.f) u2Var.b;
                ci.e eVar = (ci.e) u2Var.c;
                if (eVar == null) {
                    return;
                }
                fVar.a(eVar);
                fVar.D = 0.0f;
                u2Var.c = null;
                u2Var.invalidate();
                return;
            case 10:
                ((WalletEngine2) this.b).lambda$close$56();
                return;
            case 11:
                f9 f9Var = (f9) this.b;
                boolean z10 = f9Var.h != -1;
                if (!z10 && !f9Var.s) {
                    f9Var.c = f9Var.c();
                    f9Var.d = 0.0f;
                }
                boolean z11 = z10 || f9Var.s || f9Var.e > 1.001f;
                m4 m4Var = f9Var.b;
                float f10 = f9Var.c;
                float f11 = f9Var.d;
                m4Var.r = f10;
                m4Var.s = f11;
                m4Var.w = z11;
                m4Var.x = z11;
                return;
            case 12:
                m9 m9Var = (m9) this.b;
                m9Var.removeSelfFromStack();
                Runnable runnable2 = m9Var.f;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 13:
                ((org.telegram.ui.Cells.x3) this.b).requestLayout();
                return;
            default:
                ((wa) this.b).Z();
                return;
        }
    }
}
