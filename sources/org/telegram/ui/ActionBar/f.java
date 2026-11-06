package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.dg;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.xe;
import org.telegram.ui.bg0;
import org.telegram.ui.rf0;
import org.telegram.ui.xf0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class f extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ KeyEvent.Callback e;

    public f(k kVar, ArrayList arrayList, boolean z9, boolean z10) {
        this.e = kVar;
        this.d = arrayList;
        this.b = z9;
        this.c = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        xe xeVar;
        org.telegram.ui.Cells.q1 q1Var;
        ViewGroup viewGroup;
        rf0 rf0Var;
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.d;
                k kVar = (k) this.e;
                int i7 = 0;
                while (true) {
                    int size = arrayList.size();
                    boolean z9 = this.b;
                    if (i7 >= size) {
                        if (z9 && !this.c) {
                            k5 k5Var = kVar.n[0];
                            if (k5Var != null) {
                                k5Var.setVisibility(8);
                            }
                            k5 k5Var2 = kVar.n[1];
                            if (k5Var2 != null) {
                                k5Var2.setVisibility(8);
                            }
                        }
                        l9 l9Var = kVar.f;
                        if (l9Var != null && !z9) {
                            l9Var.setVisibility(8);
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
                bg0 bg0Var = (bg0) this.e;
                xf0 xf0Var = bg0Var.J;
                boolean z10 = this.b;
                float f10 = z10 ? 1.0f : 0.0f;
                bg0Var.D = f10;
                bg0Var.x = false;
                bg0Var.y = false;
                bg0Var.G.setAlpha(f10);
                if (z10) {
                    bg0Var.w = false;
                    bg0Var.s = false;
                }
                xe xeVar2 = bg0Var.R;
                if (xeVar2 != null) {
                    xeVar2.setAlpha(1.0f);
                }
                org.telegram.ui.Cells.q1 q1Var2 = bg0Var.q0;
                if (q1Var2 != null) {
                    q1Var2.setVisibility(0);
                }
                dg dgVar = bg0Var.V;
                if (dgVar != null && !bg0Var.r) {
                    dgVar.setAlpha(1.0f);
                }
                if (!z10 && (rf0Var = bg0Var.W) != null) {
                    rf0Var.setAlpha(0.0f);
                }
                if (!this.c && (viewGroup = bg0Var.Y) != null) {
                    viewGroup.setAlpha(bg0Var.D);
                }
                xf0Var.invalidate();
                xf0Var.setAlpha(bg0Var.D);
                bg0Var.E.invalidate();
                bg0Var.F.invalidate();
                if (runnable != null) {
                    if (!z10 && (q1Var = bg0Var.q0) != null && q1Var.isAttachedToWindow()) {
                        bg0Var.q0.post(runnable);
                        break;
                    } else if (!z10 && (xeVar = bg0Var.R) != null && xeVar.isAttachedToWindow()) {
                        bg0Var.R.post(runnable);
                        break;
                    } else {
                        org.telegram.messenger.g0.h3(runnable);
                        break;
                    }
                }
                break;
        }
    }

    public f(bg0 bg0Var, boolean z9, boolean z10, Runnable runnable) {
        this.e = bg0Var;
        this.b = z9;
        this.c = z10;
        this.d = runnable;
    }
}
