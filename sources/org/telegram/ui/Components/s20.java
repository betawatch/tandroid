package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
        f2.p0 adapter;
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
                zu0 zu0Var = (zu0) this.d;
                rt0[] rt0VarArr = zu0Var.h0;
                zu0Var.F1.unlock();
                zu0Var.l1 = false;
                int[] iArr = zu0Var.j1;
                int i11 = this.c;
                int i12 = this.b;
                iArr[i12] = i11;
                for (int i13 = 0; i13 < rt0VarArr.length; i13++) {
                    rt0 rt0Var = rt0VarArr[i13];
                    if (rt0Var != null && rt0Var.h != null && (((i10 = rt0Var.C) == 0 || zu0.p0(i10)) && (adapter = rt0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            zu0Var.q1[0].g(false);
                        }
                        rt0VarArr[i13].x.y1(iArr[i12]);
                        rt0VarArr[i13].h.a0();
                        if (adapter.h() == h) {
                            AndroidUtilities.updateVisibleRows(rt0VarArr[i13].h);
                        } else {
                            adapter.l();
                        }
                        rt0VarArr[i13].r.setVisibility(8);
                    }
                }
                zu0Var.X0();
                break;
            case 2:
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) this.d;
                int i14 = this.b;
                uVar.A0 = i14;
                uVar.B0 = i14;
                int i15 = this.c;
                uVar.C0 = i15;
                uVar.Q.setColor(i15);
                if (uVar.P > 0.0f) {
                    uVar.invalidate();
                    break;
                }
                break;
            default:
                sh.p2 p2Var = (sh.p2) this.d;
                p2Var.O = i0.a.d(1.0f, this.b, this.c);
                p2Var.h();
                break;
        }
    }
}
