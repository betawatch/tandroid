package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.of;
import org.telegram.ui.Components.tg;
import org.telegram.ui.Components.u9;
import org.telegram.ui.bj0;
import org.telegram.ui.oi0;
import org.telegram.ui.ui0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
        of ofVar;
        org.telegram.ui.Cells.t1 t1Var;
        ViewGroup viewGroup;
        oi0 oi0Var;
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.d;
                k kVar = (k) this.e;
                int i10 = 0;
                while (true) {
                    int size = arrayList.size();
                    boolean z10 = this.b;
                    if (i10 >= size) {
                        if (z10 && !this.c) {
                            j5 j5Var = kVar.n[0];
                            if (j5Var != null) {
                                j5Var.setVisibility(8);
                            }
                            j5 j5Var2 = kVar.n[1];
                            if (j5Var2 != null) {
                                j5Var2.setVisibility(8);
                            }
                        }
                        u9 u9Var = kVar.f;
                        if (u9Var != null && !z10) {
                            u9Var.setVisibility(8);
                            break;
                        }
                    } else {
                        View view = (View) arrayList.get(i10);
                        if (z10) {
                            view.setVisibility(4);
                            view.setAlpha(0.0f);
                        } else {
                            view.setAlpha(1.0f);
                        }
                        i10++;
                    }
                }
                break;
            default:
                Runnable runnable = (Runnable) this.d;
                bj0 bj0Var = (bj0) this.e;
                ui0 ui0Var = bj0Var.K;
                boolean z11 = this.b;
                float f7 = z11 ? 1.0f : 0.0f;
                bj0Var.E = f7;
                bj0Var.x = false;
                bj0Var.y = false;
                bj0Var.H.setAlpha(f7);
                if (z11) {
                    bj0Var.w = false;
                    bj0Var.v = false;
                }
                of ofVar2 = bj0Var.S;
                if (ofVar2 != null) {
                    ofVar2.setAlpha(1.0f);
                }
                org.telegram.ui.Cells.t1 t1Var2 = bj0Var.r0;
                if (t1Var2 != null) {
                    t1Var2.setVisibility(0);
                }
                tg tgVar = bj0Var.W;
                if (tgVar != null && !bj0Var.s) {
                    tgVar.setAlpha(1.0f);
                }
                if (!z11 && (oi0Var = bj0Var.X) != null) {
                    oi0Var.setAlpha(0.0f);
                }
                if (!this.c && (viewGroup = bj0Var.Z) != null) {
                    viewGroup.setAlpha(bj0Var.E);
                }
                ui0Var.invalidate();
                ui0Var.setAlpha(bj0Var.E);
                bj0Var.F.invalidate();
                bj0Var.G.invalidate();
                if (runnable != null) {
                    if (!z11 && (t1Var = bj0Var.r0) != null && t1Var.isAttachedToWindow()) {
                        bj0Var.r0.post(runnable);
                        break;
                    } else if (!z11 && (ofVar = bj0Var.S) != null && ofVar.isAttachedToWindow()) {
                        bj0Var.S.post(runnable);
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(runnable);
                        break;
                    }
                }
                break;
        }
    }

    public f(bj0 bj0Var, boolean z10, boolean z11, Runnable runnable) {
        this.e = bj0Var;
        this.b = z10;
        this.c = z11;
        this.d = runnable;
    }
}
