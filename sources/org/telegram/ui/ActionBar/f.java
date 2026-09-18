package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.of;
import org.telegram.ui.Components.tg;
import org.telegram.ui.Components.u9;
import org.telegram.ui.dj0;
import org.telegram.ui.qi0;
import org.telegram.ui.wi0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
        of ofVar;
        org.telegram.ui.Cells.t1 t1Var;
        ViewGroup viewGroup;
        qi0 qi0Var;
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
                            k5 k5Var = kVar.n[0];
                            if (k5Var != null) {
                                k5Var.setVisibility(8);
                            }
                            k5 k5Var2 = kVar.n[1];
                            if (k5Var2 != null) {
                                k5Var2.setVisibility(8);
                            }
                        }
                        u9 u9Var = kVar.f;
                        if (u9Var != null && !z10) {
                            u9Var.setVisibility(8);
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
                dj0 dj0Var = (dj0) this.e;
                wi0 wi0Var = dj0Var.K;
                boolean z11 = this.b;
                float f7 = z11 ? 1.0f : 0.0f;
                dj0Var.E = f7;
                dj0Var.x = false;
                dj0Var.y = false;
                dj0Var.H.setAlpha(f7);
                if (z11) {
                    dj0Var.w = false;
                    dj0Var.v = false;
                }
                of ofVar2 = dj0Var.S;
                if (ofVar2 != null) {
                    ofVar2.setAlpha(1.0f);
                }
                org.telegram.ui.Cells.t1 t1Var2 = dj0Var.r0;
                if (t1Var2 != null) {
                    t1Var2.setVisibility(0);
                }
                tg tgVar = dj0Var.W;
                if (tgVar != null && !dj0Var.s) {
                    tgVar.setAlpha(1.0f);
                }
                if (!z11 && (qi0Var = dj0Var.X) != null) {
                    qi0Var.setAlpha(0.0f);
                }
                if (!this.c && (viewGroup = dj0Var.Z) != null) {
                    viewGroup.setAlpha(dj0Var.E);
                }
                wi0Var.invalidate();
                wi0Var.setAlpha(dj0Var.E);
                dj0Var.F.invalidate();
                dj0Var.G.invalidate();
                if (runnable != null) {
                    if (!z11 && (t1Var = dj0Var.r0) != null && t1Var.isAttachedToWindow()) {
                        dj0Var.r0.post(runnable);
                        break;
                    } else if (!z11 && (ofVar = dj0Var.S) != null && ofVar.isAttachedToWindow()) {
                        dj0Var.S.post(runnable);
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(runnable);
                        break;
                    }
                }
                break;
        }
    }

    public f(dj0 dj0Var, boolean z10, boolean z11, Runnable runnable) {
        this.e = dj0Var;
        this.b = z10;
        this.c = z11;
        this.d = runnable;
    }
}
