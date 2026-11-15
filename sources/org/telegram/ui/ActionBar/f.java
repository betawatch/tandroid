package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.xe;
import org.telegram.ui.bg0;
import org.telegram.ui.rf0;
import org.telegram.ui.xf0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                    boolean z10 = this.b;
                    if (i7 >= size) {
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
                        i9 i9Var = kVar.f;
                        if (i9Var != null && !z10) {
                            i9Var.setVisibility(8);
                            break;
                        }
                    } else {
                        View view = (View) arrayList.get(i7);
                        if (z10) {
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
                xf0 xf0Var = bg0Var.K;
                boolean z11 = this.b;
                float f10 = z11 ? 1.0f : 0.0f;
                bg0Var.E = f10;
                bg0Var.x = false;
                bg0Var.y = false;
                bg0Var.H.setAlpha(f10);
                if (z11) {
                    bg0Var.w = false;
                    bg0Var.s = false;
                }
                xe xeVar2 = bg0Var.S;
                if (xeVar2 != null) {
                    xeVar2.setAlpha(1.0f);
                }
                ab.q qVar = bg0Var.m0;
                if (qVar != null && !z11) {
                    qVar.C(false);
                }
                org.telegram.ui.Cells.q1 q1Var2 = bg0Var.v0;
                if (q1Var2 != null) {
                    q1Var2.setVisibility(0);
                }
                if (!bg0Var.r) {
                    bg0Var.o(false, 1.0f);
                }
                if (!z11 && (rf0Var = bg0Var.X) != null) {
                    rf0Var.setAlpha(0.0f);
                }
                if (!this.c && (viewGroup = bg0Var.Z) != null) {
                    viewGroup.setAlpha(bg0Var.E);
                }
                xf0Var.invalidate();
                xf0Var.setAlpha(bg0Var.E);
                bg0Var.F.invalidate();
                bg0Var.G.invalidate();
                if (runnable != null) {
                    if (!z11 && (q1Var = bg0Var.v0) != null && q1Var.isAttachedToWindow()) {
                        bg0Var.v0.post(runnable);
                        break;
                    } else if (!z11 && (xeVar = bg0Var.S) != null && xeVar.isAttachedToWindow()) {
                        bg0Var.S.post(runnable);
                        break;
                    } else {
                        org.telegram.messenger.g0.h3(runnable);
                        break;
                    }
                }
                break;
        }
    }

    public f(bg0 bg0Var, boolean z10, boolean z11, Runnable runnable) {
        this.e = bg0Var;
        this.b = z10;
        this.c = z11;
        this.d = runnable;
    }
}
