package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Components.vg;
import org.telegram.ui.Components.w9;
import org.telegram.ui.di0;
import org.telegram.ui.ji0;
import org.telegram.ui.qi0;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
        pf pfVar;
        org.telegram.ui.Cells.t1 t1Var;
        ViewGroup viewGroup;
        di0 di0Var;
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
                            n5 n5Var = kVar.n[0];
                            if (n5Var != null) {
                                n5Var.setVisibility(8);
                            }
                            n5 n5Var2 = kVar.n[1];
                            if (n5Var2 != null) {
                                n5Var2.setVisibility(8);
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
                qi0 qi0Var = (qi0) this.e;
                ji0 ji0Var = qi0Var.J;
                boolean z11 = this.b;
                float f7 = z11 ? 1.0f : 0.0f;
                qi0Var.y = f7;
                qi0Var.w = false;
                qi0Var.x = false;
                qi0Var.G.setAlpha(f7);
                if (z11) {
                    qi0Var.v = false;
                    qi0Var.s = false;
                }
                pf pfVar2 = qi0Var.R;
                if (pfVar2 != null) {
                    pfVar2.setAlpha(1.0f);
                }
                org.telegram.ui.Cells.t1 t1Var2 = qi0Var.q0;
                if (t1Var2 != null) {
                    t1Var2.setVisibility(0);
                }
                vg vgVar = qi0Var.V;
                if (vgVar != null && !qi0Var.r) {
                    vgVar.setAlpha(1.0f);
                }
                if (!z11 && (di0Var = qi0Var.W) != null) {
                    di0Var.setAlpha(0.0f);
                }
                if (!this.c && (viewGroup = qi0Var.Y) != null) {
                    viewGroup.setAlpha(qi0Var.y);
                }
                ji0Var.invalidate();
                ji0Var.setAlpha(qi0Var.y);
                qi0Var.E.invalidate();
                qi0Var.F.invalidate();
                if (runnable != null) {
                    if (!z11 && (t1Var = qi0Var.q0) != null && t1Var.isAttachedToWindow()) {
                        qi0Var.q0.post(runnable);
                        break;
                    } else if (!z11 && (pfVar = qi0Var.R) != null && pfVar.isAttachedToWindow()) {
                        qi0Var.R.post(runnable);
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(runnable);
                        break;
                    }
                }
                break;
        }
    }

    public f(qi0 qi0Var, boolean z10, boolean z11, Runnable runnable) {
        this.e = qi0Var;
        this.b = z10;
        this.c = z11;
        this.d = runnable;
    }
}
