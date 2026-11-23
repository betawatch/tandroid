package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class v51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v51(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bz bzVar = ((x51) this.b).b;
                if (bzVar != null) {
                    bzVar.c(false, true, false);
                    break;
                }
                break;
            case 1:
                h61 h61Var = (h61) this.b;
                l2.g0 g0Var = h61Var.d;
                if (g0Var != null) {
                    TextureView textureView = h61Var.n;
                    g0Var.F1();
                    if (textureView != null && textureView == g0Var.X) {
                        g0Var.F1();
                        g0Var.s1();
                        g0Var.x1(null);
                        g0Var.q1(0, 0);
                    }
                    h61Var.d.z1(h61Var.n);
                    ArrayList arrayList = h61Var.O;
                    if (arrayList != null) {
                        h61Var.k0(arrayList, h61Var.P);
                    } else if (h61Var.V) {
                        h61Var.l0(h61Var.R, h61Var.T, h61Var.S, h61Var.U);
                    } else {
                        h61Var.j0(h61Var.R, h61Var.T);
                    }
                    h61Var.h0();
                    break;
                }
                break;
            case 2:
                h61 h61Var2 = (h61) ((oi.b6) this.b).f;
                h61Var2.b0.removeCallbacksAndMessages(null);
                h61Var2.L.w(false, null);
                break;
            case 3:
                ((l61) this.b).g = false;
                break;
            case 4:
                ((a81) ((h40) ((org.telegram.ui.ActionBar.h1) this.b).b).b).w.b();
                break;
            default:
                ((w71) this.b).d(false, true);
                break;
        }
    }
}
