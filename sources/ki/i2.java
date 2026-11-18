package ki;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.KeyEvent;
import org.telegram.ui.Components.bs0;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.r10;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class i2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ i2(KeyEvent.Callback callback, int i7, int i10, int i11) {
        this.a = i11;
        this.d = callback;
        this.b = i7;
        this.c = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i7;
        v4.i0 adapter;
        switch (this.a) {
            case 0:
                t2 t2Var = (t2) this.d;
                t2Var.T = i0.a.f(1.0f, this.b, this.c);
                t2Var.l();
                break;
            case 1:
                r10 r10Var = (r10) this.d;
                r10Var.M = this.b;
                r10Var.N = this.c;
                r10Var.G.setColorFilter(new PorterDuffColorFilter(r10Var.M, PorterDuff.Mode.MULTIPLY));
                r10Var.F.setColor(r10Var.M);
                r10Var.r.setColor(r10Var.N);
                r10Var.K.d(i0.a.o(r10Var.N, 38));
                break;
            case 2:
                gt0 gt0Var = (gt0) this.d;
                bs0[] bs0VarArr = gt0Var.n0;
                gt0Var.M1.e();
                gt0Var.r1 = false;
                int[] iArr = gt0Var.p1;
                int i10 = this.c;
                int i11 = this.b;
                iArr[i11] = i10;
                for (int i12 = 0; i12 < bs0VarArr.length; i12++) {
                    bs0 bs0Var = bs0VarArr[i12];
                    if (bs0Var != null && bs0Var.h != null && (((i7 = bs0Var.F) == 0 || gt0.z0(i7)) && (adapter = bs0VarArr[i12].h.getAdapter()) != null)) {
                        int b10 = adapter.b();
                        if (i12 == 0) {
                            gt0Var.w1[0].g(false);
                        }
                        bs0VarArr[i12].x.y1(iArr[i11]);
                        bs0VarArr[i12].h.a0();
                        if (adapter.b() == b10) {
                            org.telegram.messenger.g0.Z3(bs0VarArr[i12].h);
                        } else {
                            adapter.f();
                        }
                        bs0VarArr[i12].n.setVisibility(8);
                    }
                }
                gt0Var.j1();
                break;
            default:
                org.telegram.ui.Components.voip.y yVar = (org.telegram.ui.Components.voip.y) this.d;
                int i13 = this.b;
                yVar.E0 = i13;
                yVar.F0 = i13;
                int i14 = this.c;
                yVar.G0 = i14;
                yVar.U.setColor(i14);
                if (yVar.T > 0.0f) {
                    yVar.invalidate();
                    break;
                }
                break;
        }
    }
}
