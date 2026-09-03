package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.p9;
import org.telegram.ui.hi0;
import org.telegram.ui.ni0;
import org.telegram.ui.ui0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class f extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ KeyEvent.Callback e;

    public f(k kVar, ArrayList arrayList, boolean z4, boolean z10) {
        this.e = kVar;
        this.d = arrayList;
        this.b = z4;
        this.c = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ff ffVar;
        org.telegram.ui.Cells.s1 s1Var;
        ViewGroup viewGroup;
        hi0 hi0Var;
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.d;
                k kVar = (k) this.e;
                int i10 = 0;
                while (true) {
                    int size = arrayList.size();
                    boolean z4 = this.b;
                    if (i10 >= size) {
                        if (z4 && !this.c) {
                            k5 k5Var = kVar.n[0];
                            if (k5Var != null) {
                                k5Var.setVisibility(8);
                            }
                            k5 k5Var2 = kVar.n[1];
                            if (k5Var2 != null) {
                                k5Var2.setVisibility(8);
                            }
                        }
                        p9 p9Var = kVar.f;
                        if (p9Var != null && !z4) {
                            p9Var.setVisibility(8);
                            break;
                        }
                    } else {
                        View view = (View) arrayList.get(i10);
                        if (z4) {
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
                ui0 ui0Var = (ui0) this.e;
                ni0 ni0Var = ui0Var.H;
                boolean z10 = this.b;
                float f10 = z10 ? 1.0f : 0.0f;
                ui0Var.B = f10;
                ui0Var.x = false;
                ui0Var.y = false;
                ui0Var.E.setAlpha(f10);
                if (z10) {
                    ui0Var.w = false;
                    ui0Var.v = false;
                }
                ff ffVar2 = ui0Var.P;
                if (ffVar2 != null) {
                    ffVar2.setAlpha(1.0f);
                }
                org.telegram.ui.Cells.s1 s1Var2 = ui0Var.o0;
                if (s1Var2 != null) {
                    s1Var2.setVisibility(0);
                }
                lg lgVar = ui0Var.T;
                if (lgVar != null && !ui0Var.s) {
                    lgVar.setAlpha(1.0f);
                }
                if (!z10 && (hi0Var = ui0Var.U) != null) {
                    hi0Var.setAlpha(0.0f);
                }
                if (!this.c && (viewGroup = ui0Var.W) != null) {
                    viewGroup.setAlpha(ui0Var.B);
                }
                ni0Var.invalidate();
                ni0Var.setAlpha(ui0Var.B);
                ui0Var.C.invalidate();
                ui0Var.D.invalidate();
                if (runnable != null) {
                    if (!z10 && (s1Var = ui0Var.o0) != null && s1Var.isAttachedToWindow()) {
                        ui0Var.o0.post(runnable);
                        break;
                    } else if (!z10 && (ffVar = ui0Var.P) != null && ffVar.isAttachedToWindow()) {
                        ui0Var.P.post(runnable);
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(runnable);
                        break;
                    }
                }
                break;
        }
    }

    public f(ui0 ui0Var, boolean z4, boolean z10, Runnable runnable) {
        this.e = ui0Var;
        this.b = z4;
        this.c = z10;
        this.d = runnable;
    }
}
