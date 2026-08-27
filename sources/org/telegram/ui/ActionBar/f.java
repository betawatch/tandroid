package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bf;
import org.telegram.ui.Components.hg;
import org.telegram.ui.Components.n9;
import org.telegram.ui.ai0;
import org.telegram.ui.gi0;
import org.telegram.ui.ni0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
        bf bfVar;
        org.telegram.ui.Cells.s1 s1Var;
        ViewGroup viewGroup;
        ai0 ai0Var;
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
                            h5 h5Var = kVar.n[0];
                            if (h5Var != null) {
                                h5Var.setVisibility(8);
                            }
                            h5 h5Var2 = kVar.n[1];
                            if (h5Var2 != null) {
                                h5Var2.setVisibility(8);
                            }
                        }
                        n9 n9Var = kVar.f;
                        if (n9Var != null && !z10) {
                            n9Var.setVisibility(8);
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
                ni0 ni0Var = (ni0) this.e;
                gi0 gi0Var = ni0Var.G;
                boolean z11 = this.b;
                float f10 = z11 ? 1.0f : 0.0f;
                ni0Var.A = f10;
                ni0Var.x = false;
                ni0Var.y = false;
                ni0Var.D.setAlpha(f10);
                if (z11) {
                    ni0Var.w = false;
                    ni0Var.v = false;
                }
                bf bfVar2 = ni0Var.O;
                if (bfVar2 != null) {
                    bfVar2.setAlpha(1.0f);
                }
                org.telegram.ui.Cells.s1 s1Var2 = ni0Var.n0;
                if (s1Var2 != null) {
                    s1Var2.setVisibility(0);
                }
                hg hgVar = ni0Var.S;
                if (hgVar != null && !ni0Var.s) {
                    hgVar.setAlpha(1.0f);
                }
                if (!z11 && (ai0Var = ni0Var.T) != null) {
                    ai0Var.setAlpha(0.0f);
                }
                if (!this.c && (viewGroup = ni0Var.V) != null) {
                    viewGroup.setAlpha(ni0Var.A);
                }
                gi0Var.invalidate();
                gi0Var.setAlpha(ni0Var.A);
                ni0Var.B.invalidate();
                ni0Var.C.invalidate();
                if (runnable != null) {
                    if (!z11 && (s1Var = ni0Var.n0) != null && s1Var.isAttachedToWindow()) {
                        ni0Var.n0.post(runnable);
                        break;
                    } else if (!z11 && (bfVar = ni0Var.O) != null && bfVar.isAttachedToWindow()) {
                        ni0Var.O.post(runnable);
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(runnable);
                        break;
                    }
                }
                break;
        }
    }

    public f(ni0 ni0Var, boolean z10, boolean z11, Runnable runnable) {
        this.e = ni0Var;
        this.b = z10;
        this.c = z11;
        this.d = runnable;
    }
}
