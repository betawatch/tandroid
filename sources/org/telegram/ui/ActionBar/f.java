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
import org.telegram.ui.Components.w9;
import org.telegram.ui.ii0;
import org.telegram.ui.oi0;
import org.telegram.ui.vi0;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
        org.telegram.ui.Cells.u1 u1Var;
        ViewGroup viewGroup;
        ii0 ii0Var;
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
                            h5 h5Var = kVar.n[0];
                            if (h5Var != null) {
                                h5Var.setVisibility(8);
                            }
                            h5 h5Var2 = kVar.n[1];
                            if (h5Var2 != null) {
                                h5Var2.setVisibility(8);
                            }
                        }
                        w9 w9Var = kVar.f;
                        if (w9Var != null && !z10) {
                            w9Var.setVisibility(8);
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
                vi0 vi0Var = (vi0) this.e;
                oi0 oi0Var = vi0Var.K;
                boolean z11 = this.b;
                float f7 = z11 ? 1.0f : 0.0f;
                vi0Var.E = f7;
                vi0Var.x = false;
                vi0Var.y = false;
                vi0Var.H.setAlpha(f7);
                if (z11) {
                    vi0Var.w = false;
                    vi0Var.v = false;
                }
                qf qfVar2 = vi0Var.S;
                if (qfVar2 != null) {
                    qfVar2.setAlpha(1.0f);
                }
                org.telegram.ui.Cells.u1 u1Var2 = vi0Var.r0;
                if (u1Var2 != null) {
                    u1Var2.setVisibility(0);
                }
                vg vgVar = vi0Var.W;
                if (vgVar != null && !vi0Var.s) {
                    vgVar.setAlpha(1.0f);
                }
                if (!z11 && (ii0Var = vi0Var.X) != null) {
                    ii0Var.setAlpha(0.0f);
                }
                if (!this.c && (viewGroup = vi0Var.Z) != null) {
                    viewGroup.setAlpha(vi0Var.E);
                }
                oi0Var.invalidate();
                oi0Var.setAlpha(vi0Var.E);
                vi0Var.F.invalidate();
                vi0Var.G.invalidate();
                if (runnable != null) {
                    if (!z11 && (u1Var = vi0Var.r0) != null && u1Var.isAttachedToWindow()) {
                        vi0Var.r0.post(runnable);
                        break;
                    } else if (!z11 && (qfVar = vi0Var.S) != null && qfVar.isAttachedToWindow()) {
                        vi0Var.S.post(runnable);
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(runnable);
                        break;
                    }
                }
                break;
        }
    }

    public f(vi0 vi0Var, boolean z10, boolean z11, Runnable runnable) {
        this.e = vi0Var;
        this.b = z10;
        this.c = z11;
        this.d = runnable;
    }
}
