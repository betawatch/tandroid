package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.KeyEvent;
import org.telegram.ui.Components.g10;
import org.telegram.ui.Components.sr0;
import org.telegram.ui.Components.xs0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final class p2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ p2(KeyEvent.Callback callback, int i7, int i10, int i11) {
        this.a = i11;
        this.d = callback;
        this.b = i7;
        this.c = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i7;
        v4.g0 adapter;
        switch (this.a) {
            case 0:
                a3 a3Var = (a3) this.d;
                a3Var.S = i0.a.f(1.0f, this.b, this.c);
                a3Var.l();
                break;
            case 1:
                g10 g10Var = (g10) this.d;
                g10Var.L = this.b;
                g10Var.M = this.c;
                g10Var.F.setColorFilter(new PorterDuffColorFilter(g10Var.L, PorterDuff.Mode.MULTIPLY));
                g10Var.E.setColor(g10Var.L);
                g10Var.r.setColor(g10Var.M);
                g10Var.J.d(i0.a.o(g10Var.M, 38));
                break;
            case 2:
                xs0 xs0Var = (xs0) this.d;
                sr0[] sr0VarArr = xs0Var.m0;
                xs0Var.L1.e();
                xs0Var.q1 = false;
                int[] iArr = xs0Var.o1;
                int i10 = this.c;
                int i11 = this.b;
                iArr[i11] = i10;
                for (int i12 = 0; i12 < sr0VarArr.length; i12++) {
                    sr0 sr0Var = sr0VarArr[i12];
                    if (sr0Var != null && sr0Var.h != null && (((i7 = sr0Var.E) == 0 || xs0.z0(i7)) && (adapter = sr0VarArr[i12].h.getAdapter()) != null)) {
                        int b10 = adapter.b();
                        if (i12 == 0) {
                            xs0Var.v1[0].g(false);
                        }
                        sr0VarArr[i12].x.y1(iArr[i11]);
                        sr0VarArr[i12].h.a0();
                        if (adapter.b() == b10) {
                            org.telegram.messenger.g0.b4(sr0VarArr[i12].h);
                        } else {
                            adapter.f();
                        }
                        sr0VarArr[i12].n.setVisibility(8);
                    }
                }
                xs0Var.h1();
                break;
            default:
                org.telegram.ui.Components.voip.y yVar = (org.telegram.ui.Components.voip.y) this.d;
                int i13 = this.b;
                yVar.D0 = i13;
                yVar.E0 = i13;
                int i14 = this.c;
                yVar.F0 = i14;
                yVar.T.setColor(i14);
                if (yVar.S > 0.0f) {
                    yVar.invalidate();
                    break;
                }
                break;
        }
    }
}
