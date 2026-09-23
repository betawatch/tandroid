package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Components.ug;
import org.telegram.ui.Components.w9;
import org.telegram.ui.ji0;
import org.telegram.ui.pi0;
import org.telegram.ui.wi0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
        ji0 ji0Var;
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
                            i5 i5Var = kVar.n[0];
                            if (i5Var != null) {
                                i5Var.setVisibility(8);
                            }
                            i5 i5Var2 = kVar.n[1];
                            if (i5Var2 != null) {
                                i5Var2.setVisibility(8);
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
                wi0 wi0Var = (wi0) this.e;
                pi0 pi0Var = wi0Var.K;
                boolean z11 = this.b;
                float f7 = z11 ? 1.0f : 0.0f;
                wi0Var.E = f7;
                wi0Var.x = false;
                wi0Var.y = false;
                wi0Var.H.setAlpha(f7);
                if (z11) {
                    wi0Var.w = false;
                    wi0Var.v = false;
                }
                pf pfVar2 = wi0Var.S;
                if (pfVar2 != null) {
                    pfVar2.setAlpha(1.0f);
                }
                org.telegram.ui.Cells.t1 t1Var2 = wi0Var.r0;
                if (t1Var2 != null) {
                    t1Var2.setVisibility(0);
                }
                ug ugVar = wi0Var.W;
                if (ugVar != null && !wi0Var.s) {
                    ugVar.setAlpha(1.0f);
                }
                if (!z11 && (ji0Var = wi0Var.X) != null) {
                    ji0Var.setAlpha(0.0f);
                }
                if (!this.c && (viewGroup = wi0Var.Z) != null) {
                    viewGroup.setAlpha(wi0Var.E);
                }
                pi0Var.invalidate();
                pi0Var.setAlpha(wi0Var.E);
                wi0Var.F.invalidate();
                wi0Var.G.invalidate();
                if (runnable != null) {
                    if (!z11 && (t1Var = wi0Var.r0) != null && t1Var.isAttachedToWindow()) {
                        wi0Var.r0.post(runnable);
                        break;
                    } else if (!z11 && (pfVar = wi0Var.S) != null && pfVar.isAttachedToWindow()) {
                        wi0Var.S.post(runnable);
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(runnable);
                        break;
                    }
                }
                break;
        }
    }

    public f(wi0 wi0Var, boolean z10, boolean z11, Runnable runnable) {
        this.e = wi0Var;
        this.b = z10;
        this.c = z11;
        this.d = runnable;
    }
}
