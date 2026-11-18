package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.q9;
import org.telegram.ui.bg0;
import org.telegram.ui.fg0;
import org.telegram.ui.vf0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
        gf gfVar;
        org.telegram.ui.Cells.r1 r1Var;
        ViewGroup viewGroup;
        vf0 vf0Var;
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
                        q9 q9Var = kVar.f;
                        if (q9Var != null && !z10) {
                            q9Var.setVisibility(8);
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
                fg0 fg0Var = (fg0) this.e;
                bg0 bg0Var = fg0Var.K;
                boolean z11 = this.b;
                float f10 = z11 ? 1.0f : 0.0f;
                fg0Var.E = f10;
                fg0Var.x = false;
                fg0Var.y = false;
                fg0Var.H.setAlpha(f10);
                if (z11) {
                    fg0Var.w = false;
                    fg0Var.s = false;
                }
                gf gfVar2 = fg0Var.S;
                if (gfVar2 != null) {
                    gfVar2.setAlpha(1.0f);
                }
                ab.q qVar = fg0Var.m0;
                if (qVar != null && !z11) {
                    qVar.C(false);
                }
                org.telegram.ui.Cells.r1 r1Var2 = fg0Var.v0;
                if (r1Var2 != null) {
                    r1Var2.setVisibility(0);
                }
                if (!fg0Var.r) {
                    fg0Var.o(false, 1.0f);
                }
                if (!z11 && (vf0Var = fg0Var.X) != null) {
                    vf0Var.setAlpha(0.0f);
                }
                if (!this.c && (viewGroup = fg0Var.Z) != null) {
                    viewGroup.setAlpha(fg0Var.E);
                }
                bg0Var.invalidate();
                bg0Var.setAlpha(fg0Var.E);
                fg0Var.F.invalidate();
                fg0Var.G.invalidate();
                if (runnable != null) {
                    if (!z11 && (r1Var = fg0Var.v0) != null && r1Var.isAttachedToWindow()) {
                        fg0Var.v0.post(runnable);
                        break;
                    } else if (!z11 && (gfVar = fg0Var.S) != null && gfVar.isAttachedToWindow()) {
                        fg0Var.S.post(runnable);
                        break;
                    } else {
                        org.telegram.messenger.g0.g3(runnable);
                        break;
                    }
                }
                break;
        }
    }

    public f(fg0 fg0Var, boolean z10, boolean z11, Runnable runnable) {
        this.e = fg0Var;
        this.b = z10;
        this.c = z11;
        this.d = runnable;
    }
}
