package ki;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.KeyEvent;
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.tr0;
import org.telegram.ui.Components.ys0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class m2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ m2(KeyEvent.Callback callback, int i7, int i10, int i11) {
        this.a = i11;
        this.d = callback;
        this.b = i7;
        this.c = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i7;
        v4.h0 adapter;
        switch (this.a) {
            case 0:
                x2 x2Var = (x2) this.d;
                x2Var.T = i0.a.f(1.0f, this.b, this.c);
                x2Var.l();
                break;
            case 1:
                k10 k10Var = (k10) this.d;
                k10Var.M = this.b;
                k10Var.N = this.c;
                k10Var.G.setColorFilter(new PorterDuffColorFilter(k10Var.M, PorterDuff.Mode.MULTIPLY));
                k10Var.F.setColor(k10Var.M);
                k10Var.r.setColor(k10Var.N);
                k10Var.K.d(i0.a.o(k10Var.N, 38));
                break;
            case 2:
                ys0 ys0Var = (ys0) this.d;
                tr0[] tr0VarArr = ys0Var.n0;
                ys0Var.M1.e();
                ys0Var.r1 = false;
                int[] iArr = ys0Var.p1;
                int i10 = this.c;
                int i11 = this.b;
                iArr[i11] = i10;
                for (int i12 = 0; i12 < tr0VarArr.length; i12++) {
                    tr0 tr0Var = tr0VarArr[i12];
                    if (tr0Var != null && tr0Var.h != null && (((i7 = tr0Var.F) == 0 || ys0.z0(i7)) && (adapter = tr0VarArr[i12].h.getAdapter()) != null)) {
                        int b10 = adapter.b();
                        if (i12 == 0) {
                            ys0Var.w1[0].g(false);
                        }
                        tr0VarArr[i12].x.y1(iArr[i11]);
                        tr0VarArr[i12].h.a0();
                        if (adapter.b() == b10) {
                            org.telegram.messenger.g0.a4(tr0VarArr[i12].h);
                        } else {
                            adapter.f();
                        }
                        tr0VarArr[i12].n.setVisibility(8);
                    }
                }
                ys0Var.j1();
                break;
            default:
                org.telegram.ui.Components.voip.z zVar = (org.telegram.ui.Components.voip.z) this.d;
                int i13 = this.b;
                zVar.E0 = i13;
                zVar.F0 = i13;
                int i14 = this.c;
                zVar.G0 = i14;
                zVar.U.setColor(i14);
                if (zVar.T > 0.0f) {
                    zVar.invalidate();
                    break;
                }
                break;
        }
    }
}
