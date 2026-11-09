package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.KeyEvent;
import org.telegram.ui.Components.h10;
import org.telegram.ui.Components.ur0;
import org.telegram.ui.Components.zs0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                h10 h10Var = (h10) this.d;
                h10Var.L = this.b;
                h10Var.M = this.c;
                h10Var.F.setColorFilter(new PorterDuffColorFilter(h10Var.L, PorterDuff.Mode.MULTIPLY));
                h10Var.E.setColor(h10Var.L);
                h10Var.r.setColor(h10Var.M);
                h10Var.J.d(i0.a.o(h10Var.M, 38));
                break;
            case 2:
                zs0 zs0Var = (zs0) this.d;
                ur0[] ur0VarArr = zs0Var.m0;
                zs0Var.L1.e();
                zs0Var.q1 = false;
                int[] iArr = zs0Var.o1;
                int i10 = this.c;
                int i11 = this.b;
                iArr[i11] = i10;
                for (int i12 = 0; i12 < ur0VarArr.length; i12++) {
                    ur0 ur0Var = ur0VarArr[i12];
                    if (ur0Var != null && ur0Var.h != null && (((i7 = ur0Var.E) == 0 || zs0.z0(i7)) && (adapter = ur0VarArr[i12].h.getAdapter()) != null)) {
                        int b10 = adapter.b();
                        if (i12 == 0) {
                            zs0Var.v1[0].g(false);
                        }
                        ur0VarArr[i12].x.y1(iArr[i11]);
                        ur0VarArr[i12].h.a0();
                        if (adapter.b() == b10) {
                            org.telegram.messenger.g0.b4(ur0VarArr[i12].h);
                        } else {
                            adapter.f();
                        }
                        ur0VarArr[i12].n.setVisibility(8);
                    }
                }
                zs0Var.j1();
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
