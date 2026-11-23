package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.hf;
import org.telegram.ui.Components.p9;
import org.telegram.ui.dg0;
import org.telegram.ui.tf0;
import org.telegram.ui.zf0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        hf hfVar;
        org.telegram.ui.Cells.r1 r1Var;
        ViewGroup viewGroup;
        tf0 tf0Var;
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
                            n5 n5Var = kVar.n[0];
                            if (n5Var != null) {
                                n5Var.setVisibility(8);
                            }
                            n5 n5Var2 = kVar.n[1];
                            if (n5Var2 != null) {
                                n5Var2.setVisibility(8);
                            }
                        }
                        p9 p9Var = kVar.f;
                        if (p9Var != null && !z10) {
                            p9Var.setVisibility(8);
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
                dg0 dg0Var = (dg0) this.e;
                zf0 zf0Var = dg0Var.K;
                boolean z11 = this.b;
                float f10 = z11 ? 1.0f : 0.0f;
                dg0Var.E = f10;
                dg0Var.x = false;
                dg0Var.y = false;
                dg0Var.H.setAlpha(f10);
                if (z11) {
                    dg0Var.w = false;
                    dg0Var.s = false;
                }
                hf hfVar2 = dg0Var.S;
                if (hfVar2 != null) {
                    hfVar2.setAlpha(1.0f);
                }
                ab.q qVar = dg0Var.m0;
                if (qVar != null && !z11) {
                    qVar.C(false);
                }
                org.telegram.ui.Cells.r1 r1Var2 = dg0Var.v0;
                if (r1Var2 != null) {
                    r1Var2.setVisibility(0);
                }
                if (!dg0Var.r) {
                    dg0Var.o(false, 1.0f);
                }
                if (!z11 && (tf0Var = dg0Var.X) != null) {
                    tf0Var.setAlpha(0.0f);
                }
                if (!this.c && (viewGroup = dg0Var.Z) != null) {
                    viewGroup.setAlpha(dg0Var.E);
                }
                zf0Var.invalidate();
                zf0Var.setAlpha(dg0Var.E);
                dg0Var.F.invalidate();
                dg0Var.G.invalidate();
                if (runnable != null) {
                    if (!z11 && (r1Var = dg0Var.v0) != null && r1Var.isAttachedToWindow()) {
                        dg0Var.v0.post(runnable);
                        break;
                    } else if (!z11 && (hfVar = dg0Var.S) != null && hfVar.isAttachedToWindow()) {
                        dg0Var.S.post(runnable);
                        break;
                    } else {
                        org.telegram.messenger.g0.g3(runnable);
                        break;
                    }
                }
                break;
        }
    }

    public f(dg0 dg0Var, boolean z10, boolean z11, Runnable runnable) {
        this.e = dg0Var;
        this.b = z10;
        this.c = z11;
        this.d = runnable;
    }
}
