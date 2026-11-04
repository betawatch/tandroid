package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f51(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m51 m51Var = (m51) this.b;
                k2.i0 i0Var = m51Var.d;
                if (i0Var != null) {
                    TextureView textureView = m51Var.n;
                    i0Var.F1();
                    if (textureView != null && textureView == i0Var.X) {
                        i0Var.F1();
                        i0Var.s1();
                        i0Var.x1(null);
                        i0Var.q1(0, 0);
                    }
                    m51Var.d.z1(m51Var.n);
                    ArrayList arrayList = m51Var.O;
                    if (arrayList != null) {
                        m51Var.k0(arrayList, m51Var.P);
                    } else if (m51Var.V) {
                        m51Var.l0(m51Var.R, m51Var.T, m51Var.S, m51Var.U);
                    } else {
                        m51Var.j0(m51Var.R, m51Var.T);
                    }
                    m51Var.h0();
                    break;
                }
                break;
            case 1:
                m51 m51Var2 = (m51) ((mi.c6) this.b).f;
                m51Var2.b0.removeCallbacksAndMessages(null);
                m51Var2.L.r(false, null);
                break;
            case 2:
                ((o51) this.b).g = false;
                break;
            case 3:
                ((d71) ((s30) ((org.telegram.ui.ActionBar.g1) this.b).b).b).w.b();
                break;
            default:
                ((z61) this.b).d(false, true);
                break;
        }
    }
}
