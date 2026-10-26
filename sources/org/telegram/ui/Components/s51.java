package org.telegram.ui.Components;

import android.os.Process;
import android.view.TextureView;
import java.util.ArrayList;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s51(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((org.telegram.ui.tk) obj).c.presentFragment(new org.telegram.ui.y21());
                break;
            case 1:
                ((a61) obj).requestLayout();
                break;
            case 2:
                ((r61) obj).f();
                break;
            case 3:
                UndoView undoView = (UndoView) obj;
                int i11 = UndoView.i0;
                undoView.getClass();
                try {
                    undoView.f.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 4:
                ((u71) obj).invalidateSelf();
                break;
            case 5:
                e00 e00Var = ((h81) obj).b;
                if (e00Var != null) {
                    e00Var.d(false, true, false);
                    break;
                }
                break;
            case 6:
                s81 s81Var = (s81) obj;
                i2.j0 j0Var = s81Var.d;
                if (j0Var != null) {
                    TextureView textureView = s81Var.n;
                    j0Var.F1();
                    if (textureView != null && textureView == j0Var.X) {
                        j0Var.F1();
                        j0Var.s1();
                        j0Var.x1(null);
                        j0Var.q1(0, 0);
                    }
                    s81Var.d.z1(s81Var.n);
                    ArrayList arrayList = s81Var.N;
                    if (arrayList != null) {
                        s81Var.F(arrayList, s81Var.O);
                    } else if (s81Var.U) {
                        s81Var.G(s81Var.Q, s81Var.S, s81Var.R, s81Var.T);
                    } else {
                        s81Var.D(s81Var.Q, s81Var.S);
                    }
                    s81Var.C();
                    break;
                }
                break;
            case 7:
                s81 s81Var2 = ((r81) obj).f;
                s81Var2.a0.removeCallbacksAndMessages(null);
                s81Var2.K.onVisualizerUpdate(false, true, null);
                break;
            case 8:
                ((u81) obj).g = false;
                break;
            case 9:
                ((ma1) ((v50) ((org.telegram.ui.Cells.ha) obj).b).b).v.b();
                break;
            case 10:
                ((ia1) obj).d(false, true);
                break;
            case 11:
                db1 db1Var = (db1) obj;
                db1Var.getClass();
                fb1.a(db1Var);
                break;
            default:
                Process.setThreadPriority(10);
                ((Runnable) obj).run();
                break;
        }
    }
}
