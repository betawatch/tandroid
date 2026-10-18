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
import org.telegram.ui.bi0;
import org.telegram.ui.hi0;
import org.telegram.ui.oi0;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
        org.telegram.ui.Cells.u1 u1Var;
        ViewGroup viewGroup;
        bi0 bi0Var;
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
                oi0 oi0Var = (oi0) this.e;
                hi0 hi0Var = oi0Var.K;
                boolean z11 = this.b;
                float f7 = z11 ? 1.0f : 0.0f;
                oi0Var.E = f7;
                oi0Var.x = false;
                oi0Var.y = false;
                oi0Var.H.setAlpha(f7);
                if (z11) {
                    oi0Var.w = false;
                    oi0Var.v = false;
                }
                pf pfVar2 = oi0Var.S;
                if (pfVar2 != null) {
                    pfVar2.setAlpha(1.0f);
                }
                org.telegram.ui.Cells.u1 u1Var2 = oi0Var.r0;
                if (u1Var2 != null) {
                    u1Var2.setVisibility(0);
                }
                vg vgVar = oi0Var.W;
                if (vgVar != null && !oi0Var.s) {
                    vgVar.setAlpha(1.0f);
                }
                if (!z11 && (bi0Var = oi0Var.X) != null) {
                    bi0Var.setAlpha(0.0f);
                }
                if (!this.c && (viewGroup = oi0Var.Z) != null) {
                    viewGroup.setAlpha(oi0Var.E);
                }
                hi0Var.invalidate();
                hi0Var.setAlpha(oi0Var.E);
                oi0Var.F.invalidate();
                oi0Var.G.invalidate();
                if (runnable != null) {
                    if (!z11 && (u1Var = oi0Var.r0) != null && u1Var.isAttachedToWindow()) {
                        oi0Var.r0.post(runnable);
                        break;
                    } else if (!z11 && (pfVar = oi0Var.S) != null && pfVar.isAttachedToWindow()) {
                        oi0Var.S.post(runnable);
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(runnable);
                        break;
                    }
                }
                break;
        }
    }

    public f(oi0 oi0Var, boolean z10, boolean z11, Runnable runnable) {
        this.e = oi0Var;
        this.b = z10;
        this.c = z11;
        this.d = runnable;
    }
}
