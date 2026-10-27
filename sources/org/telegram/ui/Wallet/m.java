package org.telegram.ui.Wallet;

import a8.af;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.s71;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                if (af.b == v0Var) {
                    af.b = null;
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
                AndroidUtilities.removeFromParent((fi.v3) this.b);
                return;
            case 8:
                i5 i5Var = (i5) this.b;
                m71 m71Var = i5Var.c;
                if (m71Var == null || m71Var.getScrollState() != 0) {
                    return;
                }
                s71 u02 = i5Var.j.u0();
                if ((u02 == null || u02.getScrollState() == 0) && (d = i5Var.d(i5Var.c.f3)) != null) {
                    s4.c0 c0Var = i5Var.c.f3;
                    c0Var.getClass();
                    int i10 = new int[]{0, s4.p0.z(d) - c0Var.F()}[1];
                    if (i10 != 0) {
                        i5Var.c.w0(0, i10, null);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                di.h3 h3Var = (di.h3) this.b;
                ai.h hVar = (ai.h) h3Var.b;
                ai.g gVar = (ai.g) h3Var.c;
                if (gVar == null) {
                    return;
                }
                hVar.a(gVar);
                hVar.D = 0.0f;
                h3Var.c = null;
                h3Var.invalidate();
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
                l3 l3Var = i8Var.b;
                float f7 = i8Var.c;
                float f10 = i8Var.d;
                l3Var.r = f7;
                l3Var.s = f10;
                l3Var.v = z11;
                l3Var.w = z11;
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
                ((org.telegram.ui.Cells.y3) this.b).requestLayout();
                return;
            default:
                ((z9) this.b).V();
                return;
        }
    }
}
