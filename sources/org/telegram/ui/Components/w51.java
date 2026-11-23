package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w51(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ez ezVar = ((y51) this.b).b;
                if (ezVar != null) {
                    ezVar.c(false, true, false);
                    break;
                }
                break;
            case 1:
                i61 i61Var = (i61) this.b;
                l2.f0 f0Var = i61Var.d;
                if (f0Var != null) {
                    TextureView textureView = i61Var.n;
                    f0Var.F1();
                    if (textureView != null && textureView == f0Var.X) {
                        f0Var.F1();
                        f0Var.s1();
                        f0Var.x1(null);
                        f0Var.q1(0, 0);
                    }
                    i61Var.d.z1(i61Var.n);
                    ArrayList arrayList = i61Var.O;
                    if (arrayList != null) {
                        i61Var.k0(arrayList, i61Var.P);
                    } else if (i61Var.V) {
                        i61Var.l0(i61Var.R, i61Var.T, i61Var.S, i61Var.U);
                    } else {
                        i61Var.j0(i61Var.R, i61Var.T);
                    }
                    i61Var.h0();
                    break;
                }
                break;
            case 2:
                i61 i61Var2 = (i61) ((oi.b6) this.b).f;
                i61Var2.b0.removeCallbacksAndMessages(null);
                i61Var2.L.x(false, null);
                break;
            case 3:
                ((k61) this.b).g = false;
                break;
            case 4:
                ((z71) ((k40) ((org.telegram.ui.ActionBar.h1) this.b).b).b).w.b();
                break;
            default:
                ((v71) this.b).d(false, true);
                break;
        }
    }
}
