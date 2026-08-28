package mh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.b20;
import org.telegram.ui.Components.eu0;
import org.telegram.ui.Components.xs0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class r2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ r2(KeyEvent.Callback callback, int i9, int i10, int i11) {
        this.a = i11;
        this.d = callback;
        this.b = i9;
        this.c = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i9;
        f2.r0 adapter;
        switch (this.a) {
            case 0:
                c3 c3Var = (c3) this.d;
                c3Var.N = i0.a.d(1.0f, this.b, this.c);
                c3Var.h();
                break;
            case 1:
                b20 b20Var = (b20) this.d;
                b20Var.H = this.b;
                b20Var.I = this.c;
                b20Var.B.setColorFilter(new PorterDuffColorFilter(b20Var.H, PorterDuff.Mode.MULTIPLY));
                b20Var.A.setColor(b20Var.H);
                b20Var.r.setColor(b20Var.I);
                b20Var.F.d(i0.a.k(b20Var.I, 38));
                break;
            case 2:
                eu0 eu0Var = (eu0) this.d;
                xs0[] xs0VarArr = eu0Var.g0;
                eu0Var.E1.unlock();
                eu0Var.k1 = false;
                int[] iArr = eu0Var.i1;
                int i10 = this.c;
                int i11 = this.b;
                iArr[i11] = i10;
                for (int i12 = 0; i12 < xs0VarArr.length; i12++) {
                    xs0 xs0Var = xs0VarArr[i12];
                    if (xs0Var != null && xs0Var.h != null && (((i9 = xs0Var.B) == 0 || eu0.p0(i9)) && (adapter = xs0VarArr[i12].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i12 == 0) {
                            eu0Var.p1[0].g(false);
                        }
                        xs0VarArr[i12].x.y1(iArr[i11]);
                        xs0VarArr[i12].h.a0();
                        if (adapter.h() == h) {
                            AndroidUtilities.updateVisibleRows(xs0VarArr[i12].h);
                        } else {
                            adapter.l();
                        }
                        xs0VarArr[i12].r.setVisibility(8);
                    }
                }
                eu0Var.X0();
                break;
            default:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.d;
                int i13 = this.b;
                tVar.z0 = i13;
                tVar.A0 = i13;
                int i14 = this.c;
                tVar.B0 = i14;
                tVar.P.setColor(i14);
                if (tVar.O > 0.0f) {
                    tVar.invalidate();
                    break;
                }
                break;
        }
    }
}
