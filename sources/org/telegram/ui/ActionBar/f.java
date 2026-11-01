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
import org.telegram.ui.eh0;
import org.telegram.ui.ih0;
import org.telegram.ui.yg0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
        yg0 yg0Var;
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
                ih0 ih0Var = (ih0) this.e;
                eh0 eh0Var = ih0Var.J;
                boolean z11 = this.b;
                float f7 = z11 ? 1.0f : 0.0f;
                ih0Var.D = f7;
                ih0Var.x = false;
                ih0Var.y = false;
                ih0Var.G.setAlpha(f7);
                if (z11) {
                    ih0Var.w = false;
                    ih0Var.s = false;
                }
                se seVar2 = ih0Var.R;
                if (seVar2 != null) {
                    seVar2.setAlpha(1.0f);
                }
                org.telegram.ui.Cells.q1 q1Var2 = ih0Var.q0;
                if (q1Var2 != null) {
                    q1Var2.setVisibility(0);
                }
                zf zfVar = ih0Var.V;
                if (zfVar != null && !ih0Var.r) {
                    zfVar.setAlpha(1.0f);
                }
                if (!z11 && (yg0Var = ih0Var.W) != null) {
                    yg0Var.setAlpha(0.0f);
                }
                if (!this.c && (viewGroup = ih0Var.Y) != null) {
                    viewGroup.setAlpha(ih0Var.D);
                }
                eh0Var.invalidate();
                eh0Var.setAlpha(ih0Var.D);
                ih0Var.E.invalidate();
                ih0Var.F.invalidate();
                if (runnable != null) {
                    if (!z11 && (q1Var = ih0Var.q0) != null && q1Var.isAttachedToWindow()) {
                        ih0Var.q0.post(runnable);
                        break;
                    } else if (!z11 && (seVar = ih0Var.R) != null && seVar.isAttachedToWindow()) {
                        ih0Var.R.post(runnable);
                        break;
                    } else {
                        org.telegram.messenger.i0.g3(runnable);
                        break;
                    }
                }
                break;
        }
    }

    public f(ih0 ih0Var, boolean z10, boolean z11, Runnable runnable) {
        this.e = ih0Var;
        this.b = z10;
        this.c = z11;
        this.d = runnable;
    }
}
