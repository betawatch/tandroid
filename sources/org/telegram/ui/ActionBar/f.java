package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qf;
import org.telegram.ui.Components.vg;
import org.telegram.ui.Components.x9;
import org.telegram.ui.cj0;
import org.telegram.ui.pi0;
import org.telegram.ui.vi0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
        qf qfVar;
        org.telegram.ui.Cells.t1 t1Var;
        ViewGroup viewGroup;
        pi0 pi0Var;
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
                        x9 x9Var = kVar.f;
                        if (x9Var != null && !z10) {
                            x9Var.setVisibility(8);
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
                cj0 cj0Var = (cj0) this.e;
                vi0 vi0Var = cj0Var.K;
                boolean z11 = this.b;
                float f7 = z11 ? 1.0f : 0.0f;
                cj0Var.E = f7;
                cj0Var.x = false;
                cj0Var.y = false;
                cj0Var.H.setAlpha(f7);
                if (z11) {
                    cj0Var.w = false;
                    cj0Var.v = false;
                }
                qf qfVar2 = cj0Var.S;
                if (qfVar2 != null) {
                    qfVar2.setAlpha(1.0f);
                }
                org.telegram.ui.Cells.t1 t1Var2 = cj0Var.r0;
                if (t1Var2 != null) {
                    t1Var2.setVisibility(0);
                }
                vg vgVar = cj0Var.W;
                if (vgVar != null && !cj0Var.s) {
                    vgVar.setAlpha(1.0f);
                }
                if (!z11 && (pi0Var = cj0Var.X) != null) {
                    pi0Var.setAlpha(0.0f);
                }
                if (!this.c && (viewGroup = cj0Var.Z) != null) {
                    viewGroup.setAlpha(cj0Var.E);
                }
                vi0Var.invalidate();
                vi0Var.setAlpha(cj0Var.E);
                cj0Var.F.invalidate();
                cj0Var.G.invalidate();
                if (runnable != null) {
                    if (!z11 && (t1Var = cj0Var.r0) != null && t1Var.isAttachedToWindow()) {
                        cj0Var.r0.post(runnable);
                        break;
                    } else if (!z11 && (qfVar = cj0Var.S) != null && qfVar.isAttachedToWindow()) {
                        cj0Var.S.post(runnable);
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(runnable);
                        break;
                    }
                }
                break;
        }
    }

    public f(cj0 cj0Var, boolean z10, boolean z11, Runnable runnable) {
        this.e = cj0Var;
        this.b = z10;
        this.c = z11;
        this.d = runnable;
    }
}
