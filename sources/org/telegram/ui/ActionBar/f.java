package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.q9;
import org.telegram.ui.ag0;
import org.telegram.ui.eg0;
import org.telegram.ui.uf0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class f extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ KeyEvent.Callback e;

    public f(k kVar, ArrayList arrayList, boolean z10, boolean z11) {
        this.e = kVar;
        this.d = arrayList;
        this.b = z10;
        this.c = z11;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        gf gfVar;
        org.telegram.ui.Cells.r1 r1Var;
        ViewGroup viewGroup;
        uf0 uf0Var;
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.d;
                k kVar = (k) this.e;
                int i7 = 0;
                while (true) {
                    int size = arrayList.size();
                    boolean z10 = this.b;
                    if (i7 >= size) {
                        if (z10 && !this.c) {
                            m5 m5Var = kVar.n[0];
                            if (m5Var != null) {
                                m5Var.setVisibility(8);
                            }
                            m5 m5Var2 = kVar.n[1];
                            if (m5Var2 != null) {
                                m5Var2.setVisibility(8);
                            }
                        }
                        q9 q9Var = kVar.f;
                        if (q9Var != null && !z10) {
                            q9Var.setVisibility(8);
                            break;
                        }
                    } else {
                        View view = (View) arrayList.get(i7);
                        if (z10) {
                            view.setVisibility(4);
                            view.setAlpha(0.0f);
                        } else {
                            view.setAlpha(1.0f);
                        }
                        i7++;
                    }
                }
                break;
            default:
                Runnable runnable = (Runnable) this.d;
                eg0 eg0Var = (eg0) this.e;
                ag0 ag0Var = eg0Var.K;
                boolean z11 = this.b;
                float f10 = z11 ? 1.0f : 0.0f;
                eg0Var.E = f10;
                eg0Var.x = false;
                eg0Var.y = false;
                eg0Var.H.setAlpha(f10);
                if (z11) {
                    eg0Var.w = false;
                    eg0Var.s = false;
                }
                gf gfVar2 = eg0Var.S;
                if (gfVar2 != null) {
                    gfVar2.setAlpha(1.0f);
                }
                ab.q qVar = eg0Var.m0;
                if (qVar != null && !z11) {
                    qVar.C(false);
                }
                org.telegram.ui.Cells.r1 r1Var2 = eg0Var.v0;
                if (r1Var2 != null) {
                    r1Var2.setVisibility(0);
                }
                if (!eg0Var.r) {
                    eg0Var.o(false, 1.0f);
                }
                if (!z11 && (uf0Var = eg0Var.X) != null) {
                    uf0Var.setAlpha(0.0f);
                }
                if (!this.c && (viewGroup = eg0Var.Z) != null) {
                    viewGroup.setAlpha(eg0Var.E);
                }
                ag0Var.invalidate();
                ag0Var.setAlpha(eg0Var.E);
                eg0Var.F.invalidate();
                eg0Var.G.invalidate();
                if (runnable != null) {
                    if (!z11 && (r1Var = eg0Var.v0) != null && r1Var.isAttachedToWindow()) {
                        eg0Var.v0.post(runnable);
                        break;
                    } else if (!z11 && (gfVar = eg0Var.S) != null && gfVar.isAttachedToWindow()) {
                        eg0Var.S.post(runnable);
                        break;
                    } else {
                        org.telegram.messenger.g0.g3(runnable);
                        break;
                    }
                }
                break;
        }
    }

    public f(eg0 eg0Var, boolean z10, boolean z11, Runnable runnable) {
        this.e = eg0Var;
        this.b = z10;
        this.c = z11;
        this.d = runnable;
    }
}
