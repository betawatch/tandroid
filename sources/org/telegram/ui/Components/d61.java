package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d61 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d61(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m61 m61Var = (m61) this.b;
                h3.k0 k0Var = m61Var.d;
                if (k0Var != null) {
                    TextureView textureView = m61Var.n;
                    k0Var.q0();
                    if (textureView != null && textureView == k0Var.V) {
                        k0Var.q0();
                        k0Var.b0();
                        k0Var.g0(null);
                        k0Var.a0(0, 0);
                    }
                    m61Var.d.j0(m61Var.n);
                    ArrayList arrayList = m61Var.J;
                    if (arrayList != null) {
                        m61Var.G(arrayList, m61Var.K);
                    } else if (m61Var.Q) {
                        m61Var.H(m61Var.M, m61Var.O, m61Var.N, m61Var.P);
                    } else {
                        m61Var.E(m61Var.M, m61Var.O);
                    }
                    m61Var.D();
                    break;
                }
                break;
            case 1:
                m61 m61Var2 = ((l61) this.b).f;
                m61Var2.W.removeCallbacksAndMessages(null);
                m61Var2.G.onVisualizerUpdate(false, true, null);
                break;
            case 2:
                ((o61) this.b).g = false;
                break;
            case 3:
                ((i81) ((eh.h) ((org.telegram.ui.Cells.y9) this.b).b).b).v.b();
                break;
            default:
                ((e81) this.b).d(false, true);
                break;
        }
    }
}
