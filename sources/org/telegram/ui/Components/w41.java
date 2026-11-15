package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class w41 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w41(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((x41) this.b).invalidateSelf();
                break;
            case 1:
                wy wyVar = ((k51) this.b).b;
                if (wyVar != null) {
                    wyVar.c(false, true, false);
                    break;
                }
                break;
            case 2:
                u51 u51Var = (u51) this.b;
                l2.f0 f0Var = u51Var.d;
                if (f0Var != null) {
                    TextureView textureView = u51Var.n;
                    f0Var.F1();
                    if (textureView != null && textureView == f0Var.X) {
                        f0Var.F1();
                        f0Var.s1();
                        f0Var.x1(null);
                        f0Var.q1(0, 0);
                    }
                    u51Var.d.z1(u51Var.n);
                    ArrayList arrayList = u51Var.O;
                    if (arrayList != null) {
                        u51Var.k0(arrayList, u51Var.P);
                    } else if (u51Var.V) {
                        u51Var.l0(u51Var.R, u51Var.T, u51Var.S, u51Var.U);
                    } else {
                        u51Var.j0(u51Var.R, u51Var.T);
                    }
                    u51Var.h0();
                    break;
                }
                break;
            case 3:
                u51 u51Var2 = (u51) ((oi.z5) this.b).f;
                u51Var2.b0.removeCallbacksAndMessages(null);
                u51Var2.L.A(false, null);
                break;
            case 4:
                ((w51) this.b).g = false;
                break;
            case 5:
                ((m71) ((z30) ((org.telegram.ui.ActionBar.h1) this.b).b).b).w.b();
                break;
            default:
                ((i71) this.b).d(false, true);
                break;
        }
    }
}
