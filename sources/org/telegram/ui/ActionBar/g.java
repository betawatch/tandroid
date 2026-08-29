package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jf;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.t9;
import org.telegram.ui.di0;
import org.telegram.ui.ki0;
import org.telegram.ui.xh0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class g extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ KeyEvent.Callback e;

    public g(l lVar, ArrayList arrayList, boolean z10, boolean z11) {
        this.e = lVar;
        this.d = arrayList;
        this.b = z10;
        this.c = z11;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        jf jfVar;
        org.telegram.ui.Cells.s1 s1Var;
        ViewGroup viewGroup;
        xh0 xh0Var;
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.d;
                l lVar = (l) this.e;
                int i10 = 0;
                while (true) {
                    int size = arrayList.size();
                    boolean z10 = this.b;
                    if (i10 >= size) {
                        if (z10 && !this.c) {
                            h5 h5Var = lVar.n[0];
                            if (h5Var != null) {
                                h5Var.setVisibility(8);
                            }
                            h5 h5Var2 = lVar.n[1];
                            if (h5Var2 != null) {
                                h5Var2.setVisibility(8);
                            }
                        }
                        t9 t9Var = lVar.f;
                        if (t9Var != null && !z10) {
                            t9Var.setVisibility(8);
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
                ki0 ki0Var = (ki0) this.e;
                di0 di0Var = ki0Var.G;
                boolean z11 = this.b;
                float f9 = z11 ? 1.0f : 0.0f;
                ki0Var.A = f9;
                ki0Var.x = false;
                ki0Var.y = false;
                ki0Var.D.setAlpha(f9);
                if (z11) {
                    ki0Var.w = false;
                    ki0Var.v = false;
                }
                jf jfVar2 = ki0Var.O;
                if (jfVar2 != null) {
                    jfVar2.setAlpha(1.0f);
                }
                org.telegram.ui.Cells.s1 s1Var2 = ki0Var.n0;
                if (s1Var2 != null) {
                    s1Var2.setVisibility(0);
                }
                og ogVar = ki0Var.S;
                if (ogVar != null && !ki0Var.s) {
                    ogVar.setAlpha(1.0f);
                }
                if (!z11 && (xh0Var = ki0Var.T) != null) {
                    xh0Var.setAlpha(0.0f);
                }
                if (!this.c && (viewGroup = ki0Var.V) != null) {
                    viewGroup.setAlpha(ki0Var.A);
                }
                di0Var.invalidate();
                di0Var.setAlpha(ki0Var.A);
                ki0Var.B.invalidate();
                ki0Var.C.invalidate();
                if (runnable != null) {
                    if (!z11 && (s1Var = ki0Var.n0) != null && s1Var.isAttachedToWindow()) {
                        ki0Var.n0.post(runnable);
                        break;
                    } else if (!z11 && (jfVar = ki0Var.O) != null && jfVar.isAttachedToWindow()) {
                        ki0Var.O.post(runnable);
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(runnable);
                        break;
                    }
                }
                break;
        }
    }

    public g(ki0 ki0Var, boolean z10, boolean z11, Runnable runnable) {
        this.e = ki0Var;
        this.b = z10;
        this.c = z11;
        this.d = runnable;
    }
}
