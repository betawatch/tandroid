package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Components.vg;
import org.telegram.ui.Components.w9;
import org.telegram.ui.fi0;
import org.telegram.ui.mi0;
import org.telegram.ui.zh0;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
        org.telegram.ui.Cells.u1 u1Var;
        ViewGroup viewGroup;
        zh0 zh0Var;
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
                            j5 j5Var = kVar.n[0];
                            if (j5Var != null) {
                                j5Var.setVisibility(8);
                            }
                            j5 j5Var2 = kVar.n[1];
                            if (j5Var2 != null) {
                                j5Var2.setVisibility(8);
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
                mi0 mi0Var = (mi0) this.e;
                fi0 fi0Var = mi0Var.K;
                boolean z11 = this.b;
                float f7 = z11 ? 1.0f : 0.0f;
                mi0Var.E = f7;
                mi0Var.x = false;
                mi0Var.y = false;
                mi0Var.H.setAlpha(f7);
                if (z11) {
                    mi0Var.w = false;
                    mi0Var.v = false;
                }
                pf pfVar2 = mi0Var.S;
                if (pfVar2 != null) {
                    pfVar2.setAlpha(1.0f);
                }
                org.telegram.ui.Cells.u1 u1Var2 = mi0Var.r0;
                if (u1Var2 != null) {
                    u1Var2.setVisibility(0);
                }
                vg vgVar = mi0Var.W;
                if (vgVar != null && !mi0Var.s) {
                    vgVar.setAlpha(1.0f);
                }
                if (!z11 && (zh0Var = mi0Var.X) != null) {
                    zh0Var.setAlpha(0.0f);
                }
                if (!this.c && (viewGroup = mi0Var.Z) != null) {
                    viewGroup.setAlpha(mi0Var.E);
                }
                fi0Var.invalidate();
                fi0Var.setAlpha(mi0Var.E);
                mi0Var.F.invalidate();
                mi0Var.G.invalidate();
                if (runnable != null) {
                    if (!z11 && (u1Var = mi0Var.r0) != null && u1Var.isAttachedToWindow()) {
                        mi0Var.r0.post(runnable);
                        break;
                    } else if (!z11 && (pfVar = mi0Var.S) != null && pfVar.isAttachedToWindow()) {
                        mi0Var.S.post(runnable);
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(runnable);
                        break;
                    }
                }
                break;
        }
    }

    public f(mi0 mi0Var, boolean z10, boolean z11, Runnable runnable) {
        this.e = mi0Var;
        this.b = z10;
        this.c = z11;
        this.d = runnable;
    }
}
