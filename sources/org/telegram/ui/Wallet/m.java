package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.ui.Components.h51;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    private final void a() {
        i0 i0Var = (i0) this.b;
        synchronized (i0Var) {
            if (i0Var.a) {
                return;
            }
            i0Var.a = true;
            Runnable runnable = i0Var.b;
            if (runnable != null) {
                runnable.run();
                i0Var.b = null;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        View d;
        switch (this.a) {
            case 0:
                g0 g0Var = (g0) this.b;
                synchronized (g0Var) {
                    if (g0Var.a) {
                        return;
                    }
                    g0Var.a = true;
                    Runnable runnable = g0Var.b;
                    if (runnable != null) {
                        runnable.run();
                        g0Var.b = null;
                    }
                    return;
                }
            case 1:
                ((r0) this.b).close();
                return;
            case 2:
                a();
                return;
            case 3:
                e1 e1Var = (e1) this.b;
                e1Var.c("AUTH_CANCELED");
                e1Var.e();
                if (c8.za.b == e1Var) {
                    c8.za.b = null;
                    return;
                }
                return;
            case 4:
                ((d3) this.b).dismiss();
                return;
            case 5:
                ((org.telegram.ui.Cells.v0) this.b).invalidate();
                return;
            case 6:
                ((org.telegram.ui.ActionBar.j5) this.b).a(true);
                return;
            case 7:
                org.telegram.messenger.g0.E2((hi.l3) this.b);
                return;
            case 8:
                j6 j6Var = (j6) this.b;
                bi.f6 f6Var = j6Var.c;
                if (f6Var == null || f6Var.getScrollState() != 0) {
                    return;
                }
                h51 B0 = j6Var.j.B0();
                if ((B0 == null || B0.getScrollState() == 0) && (d = j6Var.d(j6Var.c.f3)) != null) {
                    v4.c0 c0Var = j6Var.c.f3;
                    c0Var.getClass();
                    int i7 = new int[]{0, v4.p0.z(d) - c0Var.F()}[1];
                    if (i7 != 0) {
                        j6Var.c.w0(0, i7, null);
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
                e9 e9Var = (e9) this.b;
                boolean z10 = e9Var.h != -1;
                if (!z10 && !e9Var.s) {
                    e9Var.c = e9Var.c();
                    e9Var.d = 0.0f;
                }
                boolean z11 = z10 || e9Var.s || e9Var.e > 1.001f;
                l4 l4Var = e9Var.b;
                float f10 = e9Var.c;
                float f11 = e9Var.d;
                l4Var.r = f10;
                l4Var.s = f11;
                l4Var.w = z11;
                l4Var.x = z11;
                return;
            case 12:
                l9 l9Var = (l9) this.b;
                l9Var.removeSelfFromStack();
                Runnable runnable2 = l9Var.f;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 13:
                ((org.telegram.ui.Cells.x3) this.b).requestLayout();
                return;
            default:
                ((va) this.b).Z();
                return;
        }
    }
}
