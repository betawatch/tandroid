package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rf;
import org.telegram.ui.Components.wg;
import org.telegram.ui.Components.z9;
import org.telegram.ui.aj0;
import org.telegram.ui.hj0;
import org.telegram.ui.ui0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
        rf rfVar;
        org.telegram.ui.Cells.u1 u1Var;
        ViewGroup viewGroup;
        ui0 ui0Var;
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
                        z9 z9Var = kVar.f;
                        if (z9Var != null && !z10) {
                            z9Var.setVisibility(8);
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
                hj0 hj0Var = (hj0) this.e;
                aj0 aj0Var = hj0Var.K;
                boolean z11 = this.b;
                float f7 = z11 ? 1.0f : 0.0f;
                hj0Var.E = f7;
                hj0Var.x = false;
                hj0Var.y = false;
                hj0Var.H.setAlpha(f7);
                if (z11) {
                    hj0Var.w = false;
                    hj0Var.v = false;
                }
                rf rfVar2 = hj0Var.S;
                if (rfVar2 != null) {
                    rfVar2.setAlpha(1.0f);
                }
                org.telegram.ui.Cells.u1 u1Var2 = hj0Var.r0;
                if (u1Var2 != null) {
                    u1Var2.setVisibility(0);
                }
                wg wgVar = hj0Var.W;
                if (wgVar != null && !hj0Var.s) {
                    wgVar.setAlpha(1.0f);
                }
                if (!z11 && (ui0Var = hj0Var.X) != null) {
                    ui0Var.setAlpha(0.0f);
                }
                if (!this.c && (viewGroup = hj0Var.Z) != null) {
                    viewGroup.setAlpha(hj0Var.E);
                }
                aj0Var.invalidate();
                aj0Var.setAlpha(hj0Var.E);
                hj0Var.F.invalidate();
                hj0Var.G.invalidate();
                if (runnable != null) {
                    if (!z11 && (u1Var = hj0Var.r0) != null && u1Var.isAttachedToWindow()) {
                        hj0Var.r0.post(runnable);
                        break;
                    } else if (!z11 && (rfVar = hj0Var.S) != null && rfVar.isAttachedToWindow()) {
                        hj0Var.S.post(runnable);
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(runnable);
                        break;
                    }
                }
                break;
        }
    }

    public f(hj0 hj0Var, boolean z10, boolean z11, Runnable runnable) {
        this.e = hj0Var;
        this.b = z10;
        this.c = z11;
        this.d = runnable;
    }
}
