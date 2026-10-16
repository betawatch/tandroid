package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w71(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h00 h00Var = ((y71) this.b).b;
                if (h00Var != null) {
                    h00Var.d(false, true, false);
                    break;
                }
                break;
            case 1:
                i81 i81Var = (i81) this.b;
                i2.h0 h0Var = i81Var.d;
                if (h0Var != null) {
                    TextureView textureView = i81Var.n;
                    h0Var.F1();
                    if (textureView != null && textureView == h0Var.X) {
                        h0Var.F1();
                        h0Var.s1();
                        h0Var.x1(null);
                        h0Var.q1(0, 0);
                    }
                    i81Var.d.z1(i81Var.n);
                    ArrayList arrayList = i81Var.N;
                    if (arrayList != null) {
                        i81Var.F(arrayList, i81Var.O);
                    } else if (i81Var.U) {
                        i81Var.G(i81Var.Q, i81Var.S, i81Var.R, i81Var.T);
                    } else {
                        i81Var.D(i81Var.Q, i81Var.S);
                    }
                    i81Var.C();
                    break;
                }
                break;
            case 2:
                i81 i81Var2 = ((h81) this.b).f;
                i81Var2.a0.removeCallbacksAndMessages(null);
                i81Var2.K.onVisualizerUpdate(false, true, null);
                break;
            case 3:
                ((k81) this.b).g = false;
                break;
            case 4:
                ((da1) ((x50) ((org.telegram.ui.Cells.da) this.b).b).b).v.b();
                break;
            default:
                ((z91) this.b).d(false, true);
                break;
        }
    }
}
