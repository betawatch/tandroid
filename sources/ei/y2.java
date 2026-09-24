package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.s20;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
                s20 s20Var = (s20) this.d;
                s20Var.L = this.b;
                s20Var.M = this.c;
                s20Var.F.setColorFilter(new PorterDuffColorFilter(s20Var.L, PorterDuff.Mode.MULTIPLY));
                s20Var.E.setColor(s20Var.L);
                s20Var.r.setColor(s20Var.M);
                s20Var.J.d(i0.a.k(s20Var.M, 38));
                break;
            case 2:
                jv0 jv0Var = (jv0) this.d;
                cu0[] cu0VarArr = jv0Var.k0;
                jv0Var.I1.unlock();
                jv0Var.o1 = false;
                int[] iArr = jv0Var.m1;
                int i11 = this.c;
                int i12 = this.b;
                iArr[i12] = i11;
                for (int i13 = 0; i13 < cu0VarArr.length; i13++) {
                    cu0 cu0Var = cu0VarArr[i13];
                    if (cu0Var != null && cu0Var.h != null && (((i10 = cu0Var.F) == 0 || jv0.p0(i10)) && (adapter = cu0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            jv0Var.t1[0].g(false);
                        }
                        cu0VarArr[i13].x.y1(iArr[i12]);
                        cu0VarArr[i13].h.a0();
                        if (adapter.h() == h) {
                            AndroidUtilities.updateVisibleRows(cu0VarArr[i13].h);
                        } else {
                            adapter.l();
                        }
                        cu0VarArr[i13].r.setVisibility(8);
                    }
                }
                jv0Var.X0();
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
