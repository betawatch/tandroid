package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rf;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wg;
import org.telegram.ui.mi0;
import org.telegram.ui.si0;
import org.telegram.ui.zi0;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
        rf rfVar;
        org.telegram.ui.Cells.u1 u1Var;
        ViewGroup viewGroup;
        mi0 mi0Var;
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
                zi0 zi0Var = (zi0) this.e;
                si0 si0Var = zi0Var.K;
                boolean z11 = this.b;
                float f7 = z11 ? 1.0f : 0.0f;
                zi0Var.E = f7;
                zi0Var.x = false;
                zi0Var.y = false;
                zi0Var.H.setAlpha(f7);
                if (z11) {
                    zi0Var.w = false;
                    zi0Var.v = false;
                }
                rf rfVar2 = zi0Var.S;
                if (rfVar2 != null) {
                    rfVar2.setAlpha(1.0f);
                }
                org.telegram.ui.Cells.u1 u1Var2 = zi0Var.r0;
                if (u1Var2 != null) {
                    u1Var2.setVisibility(0);
                }
                wg wgVar = zi0Var.W;
                if (wgVar != null && !zi0Var.s) {
                    wgVar.setAlpha(1.0f);
                }
                if (!z11 && (mi0Var = zi0Var.X) != null) {
                    mi0Var.setAlpha(0.0f);
                }
                if (!this.c && (viewGroup = zi0Var.Z) != null) {
                    viewGroup.setAlpha(zi0Var.E);
                }
                si0Var.invalidate();
                si0Var.setAlpha(zi0Var.E);
                zi0Var.F.invalidate();
                zi0Var.G.invalidate();
                if (runnable != null) {
                    if (!z11 && (u1Var = zi0Var.r0) != null && u1Var.isAttachedToWindow()) {
                        zi0Var.r0.post(runnable);
                        break;
                    } else if (!z11 && (rfVar = zi0Var.S) != null && rfVar.isAttachedToWindow()) {
                        zi0Var.S.post(runnable);
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(runnable);
                        break;
                    }
                }
                break;
        }
    }

    public f(zi0 zi0Var, boolean z10, boolean z11, Runnable runnable) {
        this.e = zi0Var;
        this.b = z10;
        this.c = z11;
        this.d = runnable;
    }
}
