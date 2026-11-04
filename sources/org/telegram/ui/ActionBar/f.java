package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.bg;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.ve;
import org.telegram.ui.lf0;
import org.telegram.ui.rf0;
import org.telegram.ui.vf0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
        ve veVar;
        org.telegram.ui.Cells.q1 q1Var;
        ViewGroup viewGroup;
        lf0 lf0Var;
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.d;
                k kVar = (k) this.e;
                int i3 = 0;
                while (true) {
                    int size = arrayList.size();
                    boolean z10 = this.b;
                    if (i3 >= size) {
                        if (z10 && !this.c) {
                            k5 k5Var = kVar.n[0];
                            if (k5Var != null) {
                                k5Var.setVisibility(8);
                            }
                            k5 k5Var2 = kVar.n[1];
                            if (k5Var2 != null) {
                                k5Var2.setVisibility(8);
                            }
                        }
                        k9 k9Var = kVar.f;
                        if (k9Var != null && !z10) {
                            k9Var.setVisibility(8);
                            break;
                        }
                    } else {
                        View view = (View) arrayList.get(i3);
                        if (z10) {
                            view.setVisibility(4);
                            view.setAlpha(0.0f);
                        } else {
                            view.setAlpha(1.0f);
                        }
                        i3++;
                    }
                }
                break;
            default:
                Runnable runnable = (Runnable) this.d;
                vf0 vf0Var = (vf0) this.e;
                rf0 rf0Var = vf0Var.K;
                boolean z11 = this.b;
                float f10 = z11 ? 1.0f : 0.0f;
                vf0Var.E = f10;
                vf0Var.x = false;
                vf0Var.y = false;
                vf0Var.H.setAlpha(f10);
                if (z11) {
                    vf0Var.w = false;
                    vf0Var.s = false;
                }
                ve veVar2 = vf0Var.S;
                if (veVar2 != null) {
                    veVar2.setAlpha(1.0f);
                }
                org.telegram.ui.Cells.q1 q1Var2 = vf0Var.r0;
                if (q1Var2 != null) {
                    q1Var2.setVisibility(0);
                }
                bg bgVar = vf0Var.W;
                if (bgVar != null && !vf0Var.r) {
                    bgVar.setAlpha(1.0f);
                }
                if (!z11 && (lf0Var = vf0Var.X) != null) {
                    lf0Var.setAlpha(0.0f);
                }
                if (!this.c && (viewGroup = vf0Var.Z) != null) {
                    viewGroup.setAlpha(vf0Var.E);
                }
                rf0Var.invalidate();
                rf0Var.setAlpha(vf0Var.E);
                vf0Var.F.invalidate();
                vf0Var.G.invalidate();
                if (runnable != null) {
                    if (!z11 && (q1Var = vf0Var.r0) != null && q1Var.isAttachedToWindow()) {
                        vf0Var.r0.post(runnable);
                        break;
                    } else if (!z11 && (veVar = vf0Var.S) != null && veVar.isAttachedToWindow()) {
                        vf0Var.S.post(runnable);
                        break;
                    } else {
                        org.telegram.messenger.g0.h3(runnable);
                        break;
                    }
                }
                break;
        }
    }

    public f(vf0 vf0Var, boolean z10, boolean z11, Runnable runnable) {
        this.e = vf0Var;
        this.b = z10;
        this.c = z11;
        this.d = runnable;
    }
}
