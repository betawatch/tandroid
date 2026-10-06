package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class q61 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q61(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                UndoView undoView = (UndoView) obj;
                int i11 = UndoView.e0;
                undoView.getClass();
                try {
                    undoView.f.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                ((h71) obj).invalidateSelf();
                break;
            case 2:
                yz yzVar = ((u71) obj).b;
                if (yzVar != null) {
                    yzVar.e(false, true, false);
                    break;
                }
                break;
            case 3:
                e81 e81Var = (e81) obj;
                i2.f0 f0Var = e81Var.d;
                if (f0Var != null) {
                    TextureView textureView = e81Var.n;
                    f0Var.B1();
                    if (textureView != null && textureView == f0Var.V) {
                        f0Var.B1();
                        f0Var.o1();
                        f0Var.t1(null);
                        f0Var.m1(0, 0);
                    }
                    e81Var.d.v1(e81Var.n);
                    ArrayList arrayList = e81Var.N;
                    if (arrayList != null) {
                        e81Var.F(arrayList, e81Var.O);
                    } else if (e81Var.U) {
                        e81Var.G(e81Var.Q, e81Var.S, e81Var.R, e81Var.T);
                    } else {
                        e81Var.D(e81Var.Q, e81Var.S);
                    }
                    e81Var.C();
                    break;
                }
                break;
            case 4:
                e81 e81Var2 = ((d81) obj).f;
                e81Var2.a0.removeCallbacksAndMessages(null);
                e81Var2.K.onVisualizerUpdate(false, true, null);
                break;
            case 5:
                ((g81) obj).g = false;
                break;
            case 6:
                ((aa1) ((ki.d) ((org.telegram.ui.Cells.fa) obj).b).b).v.b();
                break;
            default:
                ((w91) obj).d(false, true);
                break;
        }
    }
}
