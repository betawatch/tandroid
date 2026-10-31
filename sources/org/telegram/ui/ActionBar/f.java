package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.se;
import org.telegram.ui.Components.zf;
import org.telegram.ui.ah0;
import org.telegram.ui.gh0;
import org.telegram.ui.kh0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ KeyEvent.Callback e;

    public f(l lVar, ArrayList arrayList, boolean z10, boolean z11) {
        this.e = lVar;
        this.d = arrayList;
        this.b = z10;
        this.c = z11;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        se seVar;
        org.telegram.ui.Cells.q1 q1Var;
        ViewGroup viewGroup;
        ah0 ah0Var;
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
                            u5 u5Var = lVar.n[0];
                            if (u5Var != null) {
                                u5Var.setVisibility(8);
                            }
                            u5 u5Var2 = lVar.n[1];
                            if (u5Var2 != null) {
                                u5Var2.setVisibility(8);
                            }
                        }
                        g9 g9Var = lVar.f;
                        if (g9Var != null && !z10) {
                            g9Var.setVisibility(8);
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
                kh0 kh0Var = (kh0) this.e;
                gh0 gh0Var = kh0Var.J;
                boolean z11 = this.b;
                float f7 = z11 ? 1.0f : 0.0f;
                kh0Var.D = f7;
                kh0Var.x = false;
                kh0Var.y = false;
                kh0Var.G.setAlpha(f7);
                if (z11) {
                    kh0Var.w = false;
                    kh0Var.s = false;
                }
                se seVar2 = kh0Var.R;
                if (seVar2 != null) {
                    seVar2.setAlpha(1.0f);
                }
                org.telegram.ui.Cells.q1 q1Var2 = kh0Var.q0;
                if (q1Var2 != null) {
                    q1Var2.setVisibility(0);
                }
                zf zfVar = kh0Var.V;
                if (zfVar != null && !kh0Var.r) {
                    zfVar.setAlpha(1.0f);
                }
                if (!z11 && (ah0Var = kh0Var.W) != null) {
                    ah0Var.setAlpha(0.0f);
                }
                if (!this.c && (viewGroup = kh0Var.Y) != null) {
                    viewGroup.setAlpha(kh0Var.D);
                }
                gh0Var.invalidate();
                gh0Var.setAlpha(kh0Var.D);
                kh0Var.E.invalidate();
                kh0Var.F.invalidate();
                if (runnable != null) {
                    if (!z11 && (q1Var = kh0Var.q0) != null && q1Var.isAttachedToWindow()) {
                        kh0Var.q0.post(runnable);
                        break;
                    } else if (!z11 && (seVar = kh0Var.R) != null && seVar.isAttachedToWindow()) {
                        kh0Var.R.post(runnable);
                        break;
                    } else {
                        org.telegram.messenger.i0.g3(runnable);
                        break;
                    }
                }
                break;
        }
    }

    public f(kh0 kh0Var, boolean z10, boolean z11, Runnable runnable) {
        this.e = kh0Var;
        this.b = z10;
        this.c = z11;
        this.d = runnable;
    }
}
