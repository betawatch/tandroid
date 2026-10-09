package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.i30;
import org.telegram.ui.Components.uu0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class y2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ y2(KeyEvent.Callback callback, int i10, int i11, int i12) {
        this.a = i12;
        this.d = callback;
        this.b = i10;
        this.c = i11;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10;
        s4.i0 adapter;
        switch (this.a) {
            case 0:
                k3 k3Var = (k3) this.d;
                k3Var.R = i0.a.d(1.0f, this.b, this.c);
                k3Var.h();
                break;
            case 1:
                i30 i30Var = (i30) this.d;
                i30Var.L = this.b;
                i30Var.M = this.c;
                i30Var.F.setColorFilter(new PorterDuffColorFilter(i30Var.L, PorterDuff.Mode.MULTIPLY));
                i30Var.E.setColor(i30Var.L);
                i30Var.r.setColor(i30Var.M);
                i30Var.J.d(i0.a.k(i30Var.M, 38));
                break;
            case 2:
                bw0 bw0Var = (bw0) this.d;
                uu0[] uu0VarArr = bw0Var.k0;
                bw0Var.I1.unlock();
                bw0Var.o1 = false;
                int[] iArr = bw0Var.m1;
                int i11 = this.c;
                int i12 = this.b;
                iArr[i12] = i11;
                for (int i13 = 0; i13 < uu0VarArr.length; i13++) {
                    uu0 uu0Var = uu0VarArr[i13];
                    if (uu0Var != null && uu0Var.h != null && (((i10 = uu0Var.F) == 0 || bw0.p0(i10)) && (adapter = uu0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            bw0Var.t1[0].g(false);
                        }
                        uu0VarArr[i13].x.y1(iArr[i12]);
                        uu0VarArr[i13].h.a0();
                        if (adapter.h() == h) {
                            AndroidUtilities.updateVisibleRows(uu0VarArr[i13].h);
                        } else {
                            adapter.l();
                        }
                        uu0VarArr[i13].r.setVisibility(8);
                    }
                }
                bw0Var.X0();
                break;
            default:
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) this.d;
                int i14 = this.b;
                uVar.D0 = i14;
                uVar.E0 = i14;
                int i15 = this.c;
                uVar.F0 = i15;
                uVar.T.setColor(i15);
                if (uVar.S > 0.0f) {
                    uVar.invalidate();
                    break;
                }
                break;
        }
    }
}
