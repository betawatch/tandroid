package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u71(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c81 c81Var = (c81) this.b;
                i2.i0 i0Var = c81Var.d;
                if (i0Var != null) {
                    TextureView textureView = c81Var.n;
                    i0Var.F1();
                    if (textureView != null && textureView == i0Var.X) {
                        i0Var.F1();
                        i0Var.s1();
                        i0Var.x1(null);
                        i0Var.q1(0, 0);
                    }
                    c81Var.d.z1(c81Var.n);
                    ArrayList arrayList = c81Var.N;
                    if (arrayList != null) {
                        c81Var.F(arrayList, c81Var.O);
                    } else if (c81Var.U) {
                        c81Var.G(c81Var.Q, c81Var.S, c81Var.R, c81Var.T);
                    } else {
                        c81Var.D(c81Var.Q, c81Var.S);
                    }
                    c81Var.C();
                    break;
                }
                break;
            case 1:
                c81 c81Var2 = ((b81) this.b).f;
                c81Var2.a0.removeCallbacksAndMessages(null);
                c81Var2.K.onVisualizerUpdate(false, true, null);
                break;
            case 2:
                ((e81) this.b).g = false;
                break;
            case 3:
                ((w91) ((t50) ((org.telegram.ui.Cells.ca) this.b).b).b).v.b();
                break;
            default:
                ((s91) this.b).d(false, true);
                break;
        }
    }
}
