package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class s20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ s20(KeyEvent.Callback callback, int i10, int i11, int i12) {
        this.a = i12;
        this.d = callback;
        this.b = i10;
        this.c = i11;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10;
        f2.o0 adapter;
        switch (this.a) {
            case 0:
                t20 t20Var = (t20) this.d;
                t20Var.I = this.b;
                t20Var.J = this.c;
                t20Var.C.setColorFilter(new PorterDuffColorFilter(t20Var.I, PorterDuff.Mode.MULTIPLY));
                t20Var.B.setColor(t20Var.I);
                t20Var.r.setColor(t20Var.J);
                t20Var.G.d(i0.a.k(t20Var.J, 38));
                break;
            case 1:
                yu0 yu0Var = (yu0) this.d;
                qt0[] qt0VarArr = yu0Var.h0;
                yu0Var.F1.unlock();
                yu0Var.l1 = false;
                int[] iArr = yu0Var.j1;
                int i11 = this.c;
                int i12 = this.b;
                iArr[i12] = i11;
                for (int i13 = 0; i13 < qt0VarArr.length; i13++) {
                    qt0 qt0Var = qt0VarArr[i13];
                    if (qt0Var != null && qt0Var.h != null && (((i10 = qt0Var.C) == 0 || yu0.p0(i10)) && (adapter = qt0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            yu0Var.q1[0].g(false);
                        }
                        qt0VarArr[i13].x.y1(iArr[i12]);
                        qt0VarArr[i13].h.a0();
                        if (adapter.h() == h) {
                            AndroidUtilities.updateVisibleRows(qt0VarArr[i13].h);
                        } else {
                            adapter.l();
                        }
                        qt0VarArr[i13].r.setVisibility(8);
                    }
                }
                yu0Var.X0();
                break;
            case 2:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.d;
                int i14 = this.b;
                tVar.A0 = i14;
                tVar.B0 = i14;
                int i15 = this.c;
                tVar.C0 = i15;
                tVar.Q.setColor(i15);
                if (tVar.P > 0.0f) {
                    tVar.invalidate();
                    break;
                }
                break;
            default:
                rh.p2 p2Var = (rh.p2) this.d;
                p2Var.O = i0.a.d(1.0f, this.b, this.c);
                p2Var.h();
                break;
        }
    }
}
