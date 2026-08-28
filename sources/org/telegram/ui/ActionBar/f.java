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
import org.telegram.ui.Components.o9;
import org.telegram.ui.ei0;
import org.telegram.ui.li0;
import org.telegram.ui.yh0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
        ff ffVar;
        org.telegram.ui.Cells.t1 t1Var;
        ViewGroup viewGroup;
        yh0 yh0Var;
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.d;
                k kVar = (k) this.e;
                int i9 = 0;
                while (true) {
                    int size = arrayList.size();
                    boolean z10 = this.b;
                    if (i9 >= size) {
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
                        o9 o9Var = kVar.f;
                        if (o9Var != null && !z10) {
                            o9Var.setVisibility(8);
                            break;
                        }
                    } else {
                        View view = (View) arrayList.get(i9);
                        if (z10) {
                            view.setVisibility(4);
                            view.setAlpha(0.0f);
                        } else {
                            view.setAlpha(1.0f);
                        }
                        i9++;
                    }
                }
                break;
            default:
                Runnable runnable = (Runnable) this.d;
                li0 li0Var = (li0) this.e;
                ei0 ei0Var = li0Var.G;
                boolean z11 = this.b;
                float f10 = z11 ? 1.0f : 0.0f;
                li0Var.A = f10;
                li0Var.x = false;
                li0Var.y = false;
                li0Var.D.setAlpha(f10);
                if (z11) {
                    li0Var.w = false;
                    li0Var.v = false;
                }
                ff ffVar2 = li0Var.O;
                if (ffVar2 != null) {
                    ffVar2.setAlpha(1.0f);
                }
                org.telegram.ui.Cells.t1 t1Var2 = li0Var.n0;
                if (t1Var2 != null) {
                    t1Var2.setVisibility(0);
                }
                lg lgVar = li0Var.S;
                if (lgVar != null && !li0Var.s) {
                    lgVar.setAlpha(1.0f);
                }
                if (!z11 && (yh0Var = li0Var.T) != null) {
                    yh0Var.setAlpha(0.0f);
                }
                if (!this.c && (viewGroup = li0Var.V) != null) {
                    viewGroup.setAlpha(li0Var.A);
                }
                ei0Var.invalidate();
                ei0Var.setAlpha(li0Var.A);
                li0Var.B.invalidate();
                li0Var.C.invalidate();
                if (runnable != null) {
                    if (!z11 && (t1Var = li0Var.n0) != null && t1Var.isAttachedToWindow()) {
                        li0Var.n0.post(runnable);
                        break;
                    } else if (!z11 && (ffVar = li0Var.O) != null && ffVar.isAttachedToWindow()) {
                        li0Var.O.post(runnable);
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(runnable);
                        break;
                    }
                }
                break;
        }
    }

    public f(li0 li0Var, boolean z10, boolean z11, Runnable runnable) {
        this.e = li0Var;
        this.b = z10;
        this.c = z11;
        this.d = runnable;
    }
}
