package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.r20;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.zu0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
        s4.h0 adapter;
        switch (this.a) {
            case 0:
                k3 k3Var = (k3) this.d;
                k3Var.R = i0.a.d(1.0f, this.b, this.c);
                k3Var.h();
                break;
            case 1:
                r20 r20Var = (r20) this.d;
                r20Var.L = this.b;
                r20Var.M = this.c;
                r20Var.F.setColorFilter(new PorterDuffColorFilter(r20Var.L, PorterDuff.Mode.MULTIPLY));
                r20Var.E.setColor(r20Var.L);
                r20Var.r.setColor(r20Var.M);
                r20Var.J.d(i0.a.k(r20Var.M, 38));
                break;
            case 2:
                zu0 zu0Var = (zu0) this.d;
                st0[] st0VarArr = zu0Var.k0;
                zu0Var.I1.unlock();
                zu0Var.o1 = false;
                int[] iArr = zu0Var.m1;
                int i11 = this.c;
                int i12 = this.b;
                iArr[i12] = i11;
                for (int i13 = 0; i13 < st0VarArr.length; i13++) {
                    st0 st0Var = st0VarArr[i13];
                    if (st0Var != null && st0Var.h != null && (((i10 = st0Var.F) == 0 || zu0.p0(i10)) && (adapter = st0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            zu0Var.t1[0].g(false);
                        }
                        st0VarArr[i13].x.y1(iArr[i12]);
                        st0VarArr[i13].h.b0();
                        if (adapter.h() == h) {
                            AndroidUtilities.updateVisibleRows(st0VarArr[i13].h);
                        } else {
                            adapter.l();
                        }
                        st0VarArr[i13].r.setVisibility(8);
                    }
                }
                zu0Var.X0();
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
