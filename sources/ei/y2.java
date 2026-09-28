package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.eu0;
import org.telegram.ui.Components.lv0;
import org.telegram.ui.Components.u20;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
                u20 u20Var = (u20) this.d;
                u20Var.L = this.b;
                u20Var.M = this.c;
                u20Var.F.setColorFilter(new PorterDuffColorFilter(u20Var.L, PorterDuff.Mode.MULTIPLY));
                u20Var.E.setColor(u20Var.L);
                u20Var.r.setColor(u20Var.M);
                u20Var.J.d(i0.a.k(u20Var.M, 38));
                break;
            case 2:
                lv0 lv0Var = (lv0) this.d;
                eu0[] eu0VarArr = lv0Var.k0;
                lv0Var.I1.unlock();
                lv0Var.o1 = false;
                int[] iArr = lv0Var.m1;
                int i11 = this.c;
                int i12 = this.b;
                iArr[i12] = i11;
                for (int i13 = 0; i13 < eu0VarArr.length; i13++) {
                    eu0 eu0Var = eu0VarArr[i13];
                    if (eu0Var != null && eu0Var.h != null && (((i10 = eu0Var.F) == 0 || lv0.p0(i10)) && (adapter = eu0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            lv0Var.t1[0].g(false);
                        }
                        eu0VarArr[i13].x.y1(iArr[i12]);
                        eu0VarArr[i13].h.a0();
                        if (adapter.h() == h) {
                            AndroidUtilities.updateVisibleRows(eu0VarArr[i13].h);
                        } else {
                            adapter.l();
                        }
                        eu0VarArr[i13].r.setVisibility(8);
                    }
                }
                lv0Var.X0();
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
