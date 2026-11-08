package org.telegram.ui.Wallet;

import android.view.View;
import c8.va;
import org.telegram.ui.Components.q41;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    private final void a() {
        c0 c0Var = (c0) this.b;
        synchronized (c0Var) {
            if (c0Var.a) {
                return;
            }
            c0Var.a = true;
            Runnable runnable = c0Var.b;
            if (runnable != null) {
                runnable.run();
                c0Var.b = null;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        View d;
        switch (this.a) {
            case 0:
                a0 a0Var = (a0) this.b;
                synchronized (a0Var) {
                    if (a0Var.a) {
                        return;
                    }
                    a0Var.a = true;
                    Runnable runnable = a0Var.b;
                    if (runnable != null) {
                        runnable.run();
                        a0Var.b = null;
                    }
                    return;
                }
            case 1:
                a();
                return;
            case 2:
                ((j0) this.b).close();
                return;
            case 3:
                ((boolean[]) this.b)[0] = true;
                return;
            case 4:
                v0 v0Var = (v0) this.b;
                v0Var.c("AUTH_CANCELED");
                v0Var.e();
                if (va.b == v0Var) {
                    va.b = null;
                    return;
                }
                return;
            case 5:
                ((y2) this.b).dismiss();
                return;
            case 6:
                ((org.telegram.ui.Cells.t0) this.b).invalidate();
                return;
            case 7:
                org.telegram.messenger.g0.E2((fi.m3) this.b);
                return;
            case 8:
                t5 t5Var = (t5) this.b;
                fi.w3 w3Var = t5Var.c;
                if (w3Var == null || w3Var.getScrollState() != 0) {
                    return;
                }
                q41 y02 = t5Var.j.y0();
                if ((y02 == null || y02.getScrollState() == 0) && (d = t5Var.d(t5Var.c.e3)) != null) {
                    v4.b0 b0Var = t5Var.c.e3;
                    b0Var.getClass();
                    int i7 = new int[]{0, v4.n0.z(d) - b0Var.F()}[1];
                    if (i7 != 0) {
                        t5Var.c.w0(0, i7, null);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                di.b3 b3Var = (di.b3) this.b;
                ai.h hVar = (ai.h) b3Var.b;
                ai.g gVar = (ai.g) b3Var.c;
                if (gVar == null) {
                    return;
                }
                hVar.a(gVar);
                hVar.D = 0.0f;
                b3Var.c = null;
                b3Var.invalidate();
                return;
            case 10:
                ((WalletEngine2) this.b).lambda$close$53();
                return;
            case 11:
                o8 o8Var = (o8) this.b;
                boolean z9 = o8Var.h != -1;
                if (!z9 && !o8Var.s) {
                    o8Var.c = o8Var.c();
                    o8Var.d = 0.0f;
                }
                boolean z10 = z9 || o8Var.s || o8Var.e > 1.001f;
                b4 b4Var = o8Var.b;
                float f10 = o8Var.c;
                float f11 = o8Var.d;
                b4Var.r = f10;
                b4Var.s = f11;
                b4Var.w = z10;
                b4Var.x = z10;
                return;
            case 12:
                u8 u8Var = (u8) this.b;
                u8Var.removeSelfFromStack();
                Runnable runnable2 = u8Var.f;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 13:
                ((org.telegram.ui.Cells.w3) this.b).requestLayout();
                return;
            default:
                ((ea) this.b).Z();
                return;
        }
    }
}
