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
import org.telegram.ui.dg0;
import org.telegram.ui.tf0;
import org.telegram.ui.zf0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
        tf0 tf0Var;
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
                            l5 l5Var = kVar.n[0];
                            if (l5Var != null) {
                                l5Var.setVisibility(8);
                            }
                            l5 l5Var2 = kVar.n[1];
                            if (l5Var2 != null) {
                                l5Var2.setVisibility(8);
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
                dg0 dg0Var = (dg0) this.e;
                zf0 zf0Var = dg0Var.J;
                boolean z10 = this.b;
                float f10 = z10 ? 1.0f : 0.0f;
                dg0Var.D = f10;
                dg0Var.x = false;
                dg0Var.y = false;
                dg0Var.G.setAlpha(f10);
                if (z10) {
                    dg0Var.w = false;
                    dg0Var.s = false;
                }
                xe xeVar2 = dg0Var.R;
                if (xeVar2 != null) {
                    xeVar2.setAlpha(1.0f);
                }
                org.telegram.ui.Cells.q1 q1Var2 = dg0Var.q0;
                if (q1Var2 != null) {
                    q1Var2.setVisibility(0);
                }
                dg dgVar = dg0Var.V;
                if (dgVar != null && !dg0Var.r) {
                    dgVar.setAlpha(1.0f);
                }
                if (!z10 && (tf0Var = dg0Var.W) != null) {
                    tf0Var.setAlpha(0.0f);
                }
                if (!this.c && (viewGroup = dg0Var.Y) != null) {
                    viewGroup.setAlpha(dg0Var.D);
                }
                zf0Var.invalidate();
                zf0Var.setAlpha(dg0Var.D);
                dg0Var.E.invalidate();
                dg0Var.F.invalidate();
                if (runnable != null) {
                    if (!z10 && (q1Var = dg0Var.q0) != null && q1Var.isAttachedToWindow()) {
                        dg0Var.q0.post(runnable);
                        break;
                    } else if (!z10 && (xeVar = dg0Var.R) != null && xeVar.isAttachedToWindow()) {
                        dg0Var.R.post(runnable);
                        break;
                    } else {
                        org.telegram.messenger.g0.h3(runnable);
                        break;
                    }
                }
                break;
        }
    }

    public f(dg0 dg0Var, boolean z9, boolean z10, Runnable runnable) {
        this.e = dg0Var;
        this.b = z9;
        this.c = z10;
        this.d = runnable;
    }
}
