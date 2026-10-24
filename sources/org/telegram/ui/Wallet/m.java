package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.j71;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    private final void a() {
        b0 b0Var = (b0) this.b;
        synchronized (b0Var) {
            if (b0Var.a) {
                return;
            }
            b0Var.a = true;
            Runnable runnable = b0Var.b;
            if (runnable != null) {
                runnable.run();
                b0Var.b = null;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        View d;
        switch (this.a) {
            case 0:
                z zVar = (z) this.b;
                synchronized (zVar) {
                    if (zVar.a) {
                        return;
                    }
                    zVar.a = true;
                    Runnable runnable = zVar.b;
                    if (runnable != null) {
                        runnable.run();
                        zVar.b = null;
                    }
                    return;
                }
            case 1:
                a();
                return;
            case 2:
                ((i0) this.b).close();
                return;
            case 3:
                ((boolean[]) this.b)[0] = true;
                return;
            case 4:
                v0 v0Var = (v0) this.b;
                v0Var.c("AUTH_CANCELED");
                v0Var.e();
                if (w7.h6.b == v0Var) {
                    w7.h6.b = null;
                    return;
                }
                return;
            case 5:
                ((i2) this.b).dismiss();
                return;
            case 6:
                ((org.telegram.ui.Cells.v0) this.b).invalidate();
                return;
            case 7:
                AndroidUtilities.removeFromParent((ei.x3) this.b);
                return;
            case 8:
                k5 k5Var = (k5) this.b;
                d71 d71Var = k5Var.c;
                if (d71Var == null || d71Var.getScrollState() != 0) {
                    return;
                }
                j71 t02 = k5Var.j.t0();
                if ((t02 == null || t02.getScrollState() == 0) && (d = k5Var.d(k5Var.c.Y2)) != null) {
                    s4.b0 b0Var = k5Var.c.Y2;
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
                ci.h3 h3Var = (ci.h3) this.b;
                zh.f fVar = (zh.f) h3Var.b;
                zh.e eVar = (zh.e) h3Var.c;
                if (eVar == null) {
                    return;
                }
                fVar.a(eVar);
                fVar.D = 0.0f;
                h3Var.c = null;
                h3Var.invalidate();
                return;
            case 10:
                ((WalletEngine2) this.b).lambda$close$53();
                return;
            case 11:
                j8 j8Var = (j8) this.b;
                boolean z10 = j8Var.h != -1;
                if (!z10 && !j8Var.s) {
                    j8Var.c = j8Var.c();
                    j8Var.d = 0.0f;
                }
                boolean z11 = z10 || j8Var.s || j8Var.e > 1.001f;
                l3 l3Var = j8Var.b;
                float f7 = j8Var.c;
                float f10 = j8Var.d;
                l3Var.r = f7;
                l3Var.s = f10;
                l3Var.v = z11;
                l3Var.w = z11;
                return;
            case 12:
                q8 q8Var = (q8) this.b;
                q8Var.removeSelfFromStack();
                Runnable runnable2 = q8Var.f;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 13:
                ((org.telegram.ui.Cells.t3) this.b).requestLayout();
                return;
            default:
                ((aa) this.b).U();
                return;
        }
    }
}
