package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class t51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t51(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                cz czVar = ((v51) this.b).b;
                if (czVar != null) {
                    czVar.c(false, true, false);
                    break;
                }
                break;
            case 1:
                f61 f61Var = (f61) this.b;
                l2.f0 f0Var = f61Var.d;
                if (f0Var != null) {
                    TextureView textureView = f61Var.n;
                    f0Var.F1();
                    if (textureView != null && textureView == f0Var.X) {
                        f0Var.F1();
                        f0Var.s1();
                        f0Var.x1(null);
                        f0Var.q1(0, 0);
                    }
                    f61Var.d.z1(f61Var.n);
                    ArrayList arrayList = f61Var.O;
                    if (arrayList != null) {
                        f61Var.k0(arrayList, f61Var.P);
                    } else if (f61Var.V) {
                        f61Var.l0(f61Var.R, f61Var.T, f61Var.S, f61Var.U);
                    } else {
                        f61Var.j0(f61Var.R, f61Var.T);
                    }
                    f61Var.h0();
                    break;
                }
                break;
            case 2:
                f61 f61Var2 = (f61) ((oi.a6) this.b).f;
                f61Var2.b0.removeCallbacksAndMessages(null);
                f61Var2.L.x(false, null);
                break;
            case 3:
                ((h61) this.b).g = false;
                break;
            case 4:
                ((w71) ((h40) ((org.telegram.ui.ActionBar.i1) this.b).b).b).w.b();
                break;
            default:
                ((s71) this.b).d(false, true);
                break;
        }
    }
}
