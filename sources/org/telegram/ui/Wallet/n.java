package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.w61;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n(Object obj, int i10) {
        this.a = i10;
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
                w0 w0Var = (w0) this.b;
                w0Var.c("AUTH_CANCELED");
                w0Var.e();
                if (w7.h6.b == w0Var) {
                    w7.h6.b = null;
                    return;
                }
                return;
            case 5:
                ((j2) this.b).dismiss();
                return;
            case 6:
                ((org.telegram.ui.Cells.w0) this.b).invalidate();
                return;
            case 7:
                AndroidUtilities.removeFromParent((ei.x3) this.b);
                return;
            case 8:
                k5 k5Var = (k5) this.b;
                w61 w61Var = k5Var.c;
                if (w61Var == null || w61Var.getScrollState() != 0) {
                    return;
                }
                c71 t02 = k5Var.j.t0();
                if ((t02 == null || t02.getScrollState() == 0) && (d = k5Var.d(k5Var.c.V2)) != null) {
                    s4.b0 b0Var = k5Var.c.V2;
                    b0Var.getClass();
                    int i10 = new int[]{0, s4.n0.z(d) - b0Var.F()}[1];
                    if (i10 != 0) {
                        k5Var.c.v0(0, i10, null);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ci.i3 i3Var = (ci.i3) this.b;
                zh.f fVar = (zh.f) i3Var.b;
                zh.e eVar = (zh.e) i3Var.c;
                if (eVar == null) {
                    return;
                }
                fVar.a(eVar);
                fVar.D = 0.0f;
                i3Var.c = null;
                i3Var.invalidate();
                return;
            case 10:
                ((WalletEngine2) this.b).lambda$close$53();
                return;
            case 11:
                i8 i8Var = (i8) this.b;
                boolean z10 = i8Var.h != -1;
                if (!z10 && !i8Var.s) {
                    i8Var.c = i8Var.c();
                    i8Var.d = 0.0f;
                }
                boolean z11 = z10 || i8Var.s || i8Var.e > 1.001f;
                m3 m3Var = i8Var.b;
                float f7 = i8Var.c;
                float f10 = i8Var.d;
                m3Var.r = f7;
                m3Var.s = f10;
                m3Var.v = z11;
                m3Var.w = z11;
                return;
            case 12:
                p8 p8Var = (p8) this.b;
                p8Var.removeSelfFromStack();
                Runnable runnable2 = p8Var.f;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 13:
                ((org.telegram.ui.Cells.t3) this.b).requestLayout();
                return;
            default:
                ((z9) this.b).U();
                return;
        }
    }
}
