package nh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.e20;
import org.telegram.ui.Components.hu0;
import org.telegram.ui.Components.zs0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class q2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ q2(KeyEvent.Callback callback, int i10, int i11, int i12) {
        this.a = i12;
        this.d = callback;
        this.b = i10;
        this.c = i11;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10;
        f2.q0 adapter;
        switch (this.a) {
            case 0:
                b3 b3Var = (b3) this.d;
                b3Var.N = i0.b.d(1.0f, this.b, this.c);
                b3Var.h();
                break;
            case 1:
                e20 e20Var = (e20) this.d;
                e20Var.H = this.b;
                e20Var.I = this.c;
                e20Var.B.setColorFilter(new PorterDuffColorFilter(e20Var.H, PorterDuff.Mode.MULTIPLY));
                e20Var.A.setColor(e20Var.H);
                e20Var.r.setColor(e20Var.I);
                e20Var.F.d(i0.b.k(e20Var.I, 38));
                break;
            case 2:
                hu0 hu0Var = (hu0) this.d;
                zs0[] zs0VarArr = hu0Var.g0;
                hu0Var.E1.unlock();
                hu0Var.k1 = false;
                int[] iArr = hu0Var.i1;
                int i11 = this.c;
                int i12 = this.b;
                iArr[i12] = i11;
                for (int i13 = 0; i13 < zs0VarArr.length; i13++) {
                    zs0 zs0Var = zs0VarArr[i13];
                    if (zs0Var != null && zs0Var.h != null && (((i10 = zs0Var.B) == 0 || hu0.p0(i10)) && (adapter = zs0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            hu0Var.p1[0].g(false);
                        }
                        zs0VarArr[i13].x.y1(iArr[i12]);
                        zs0VarArr[i13].h.a0();
                        if (adapter.h() == h) {
                            AndroidUtilities.updateVisibleRows(zs0VarArr[i13].h);
                        } else {
                            adapter.l();
                        }
                        zs0VarArr[i13].r.setVisibility(8);
                    }
                }
                hu0Var.X0();
                break;
            default:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.d;
                int i14 = this.b;
                tVar.z0 = i14;
                tVar.A0 = i14;
                int i15 = this.c;
                tVar.B0 = i15;
                tVar.P.setColor(i15);
                if (tVar.O > 0.0f) {
                    tVar.invalidate();
                    break;
                }
                break;
        }
    }
}
