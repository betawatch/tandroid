package ki;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.KeyEvent;
import org.telegram.ui.Components.ds0;
import org.telegram.ui.Components.jt0;
import org.telegram.ui.Components.u10;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class h2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ h2(KeyEvent.Callback callback, int i7, int i10, int i11) {
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
                s2 s2Var = (s2) this.d;
                s2Var.T = i0.a.f(1.0f, this.b, this.c);
                s2Var.l();
                break;
            case 1:
                u10 u10Var = (u10) this.d;
                u10Var.M = this.b;
                u10Var.N = this.c;
                u10Var.G.setColorFilter(new PorterDuffColorFilter(u10Var.M, PorterDuff.Mode.MULTIPLY));
                u10Var.F.setColor(u10Var.M);
                u10Var.r.setColor(u10Var.N);
                u10Var.K.d(i0.a.o(u10Var.N, 38));
                break;
            case 2:
                jt0 jt0Var = (jt0) this.d;
                ds0[] ds0VarArr = jt0Var.n0;
                jt0Var.M1.e();
                jt0Var.r1 = false;
                int[] iArr = jt0Var.p1;
                int i10 = this.c;
                int i11 = this.b;
                iArr[i11] = i10;
                for (int i12 = 0; i12 < ds0VarArr.length; i12++) {
                    ds0 ds0Var = ds0VarArr[i12];
                    if (ds0Var != null && ds0Var.h != null && (((i7 = ds0Var.F) == 0 || jt0.z0(i7)) && (adapter = ds0VarArr[i12].h.getAdapter()) != null)) {
                        int b10 = adapter.b();
                        if (i12 == 0) {
                            jt0Var.w1[0].g(false);
                        }
                        ds0VarArr[i12].x.y1(iArr[i11]);
                        ds0VarArr[i12].h.a0();
                        if (adapter.b() == b10) {
                            org.telegram.messenger.g0.Z3(ds0VarArr[i12].h);
                        } else {
                            adapter.f();
                        }
                        ds0VarArr[i12].n.setVisibility(8);
                    }
                }
                jt0Var.j1();
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
