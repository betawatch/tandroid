package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.cg;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.we;
import org.telegram.ui.ag0;
import org.telegram.ui.eg0;
import org.telegram.ui.uf0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class g extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ KeyEvent.Callback e;

    public g(l lVar, ArrayList arrayList, boolean z9, boolean z10) {
        this.e = lVar;
        this.d = arrayList;
        this.b = z9;
        this.c = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        we weVar;
        org.telegram.ui.Cells.q1 q1Var;
        ViewGroup viewGroup;
        uf0 uf0Var;
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.d;
                l lVar = (l) this.e;
                int i7 = 0;
                while (true) {
                    int size = arrayList.size();
                    boolean z9 = this.b;
                    if (i7 >= size) {
                        if (z9 && !this.c) {
                            m5 m5Var = lVar.n[0];
                            if (m5Var != null) {
                                m5Var.setVisibility(8);
                            }
                            m5 m5Var2 = lVar.n[1];
                            if (m5Var2 != null) {
                                m5Var2.setVisibility(8);
                            }
                        }
                        k9 k9Var = lVar.f;
                        if (k9Var != null && !z9) {
                            k9Var.setVisibility(8);
                            break;
                        }
                    } else {
                        View view = (View) arrayList.get(i7);
                        if (z9) {
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
                ag0 ag0Var = eg0Var.J;
                boolean z10 = this.b;
                float f10 = z10 ? 1.0f : 0.0f;
                eg0Var.D = f10;
                eg0Var.x = false;
                eg0Var.y = false;
                eg0Var.G.setAlpha(f10);
                if (z10) {
                    eg0Var.w = false;
                    eg0Var.s = false;
                }
                we weVar2 = eg0Var.R;
                if (weVar2 != null) {
                    weVar2.setAlpha(1.0f);
                }
                org.telegram.ui.Cells.q1 q1Var2 = eg0Var.q0;
                if (q1Var2 != null) {
                    q1Var2.setVisibility(0);
                }
                cg cgVar = eg0Var.V;
                if (cgVar != null && !eg0Var.r) {
                    cgVar.setAlpha(1.0f);
                }
                if (!z10 && (uf0Var = eg0Var.W) != null) {
                    uf0Var.setAlpha(0.0f);
                }
                if (!this.c && (viewGroup = eg0Var.Y) != null) {
                    viewGroup.setAlpha(eg0Var.D);
                }
                ag0Var.invalidate();
                ag0Var.setAlpha(eg0Var.D);
                eg0Var.E.invalidate();
                eg0Var.F.invalidate();
                if (runnable != null) {
                    if (!z10 && (q1Var = eg0Var.q0) != null && q1Var.isAttachedToWindow()) {
                        eg0Var.q0.post(runnable);
                        break;
                    } else if (!z10 && (weVar = eg0Var.R) != null && weVar.isAttachedToWindow()) {
                        eg0Var.R.post(runnable);
                        break;
                    } else {
                        org.telegram.messenger.g0.h3(runnable);
                        break;
                    }
                }
                break;
        }
    }

    public g(eg0 eg0Var, boolean z9, boolean z10, Runnable runnable) {
        this.e = eg0Var;
        this.b = z9;
        this.c = z10;
        this.d = runnable;
    }
}
