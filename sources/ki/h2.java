package ki;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.KeyEvent;
import org.telegram.ui.Components.ds0;
import org.telegram.ui.Components.it0;
import org.telegram.ui.Components.s10;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                t2 t2Var = (t2) this.d;
                t2Var.T = i0.a.f(1.0f, this.b, this.c);
                t2Var.l();
                break;
            case 1:
                s10 s10Var = (s10) this.d;
                s10Var.M = this.b;
                s10Var.N = this.c;
                s10Var.G.setColorFilter(new PorterDuffColorFilter(s10Var.M, PorterDuff.Mode.MULTIPLY));
                s10Var.F.setColor(s10Var.M);
                s10Var.r.setColor(s10Var.N);
                s10Var.K.d(i0.a.o(s10Var.N, 38));
                break;
            case 2:
                it0 it0Var = (it0) this.d;
                ds0[] ds0VarArr = it0Var.n0;
                it0Var.M1.e();
                it0Var.r1 = false;
                int[] iArr = it0Var.p1;
                int i10 = this.c;
                int i11 = this.b;
                iArr[i11] = i10;
                for (int i12 = 0; i12 < ds0VarArr.length; i12++) {
                    ds0 ds0Var = ds0VarArr[i12];
                    if (ds0Var != null && ds0Var.h != null && (((i7 = ds0Var.F) == 0 || it0.z0(i7)) && (adapter = ds0VarArr[i12].h.getAdapter()) != null)) {
                        int b10 = adapter.b();
                        if (i12 == 0) {
                            it0Var.w1[0].g(false);
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
                it0Var.j1();
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
