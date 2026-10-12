package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class pt0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ pt0(PhotoViewer photoViewer, int i10) {
        this.a = i10;
        this.b = photoViewer;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.Components.vi viVar;
        int i10 = this.a;
        PhotoViewer photoViewer = this.b;
        switch (i10) {
            case 0:
                photoViewer.p6 = null;
                org.telegram.ui.Components.tf0 tf0Var = photoViewer.C1;
                if (tf0Var != null) {
                    if (tf0Var.b.j()) {
                        photoViewer.a1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.g6.zf), PorterDuff.Mode.MULTIPLY));
                    } else {
                        photoViewer.a1.setColorFilter((ColorFilter) null);
                    }
                    photoViewer.g6 = 0.0f;
                    photoViewer.e0.invalidate();
                    break;
                }
                break;
            case 1:
                photoViewer.t3 = null;
                break;
            case 2:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.g3();
                break;
            case 3:
                photoViewer.L1.o0(false);
                hu0 hu0Var = photoViewer.L1;
                hu0Var.u1.setTypeface(qg.s0.e(hu0Var.P1).j);
                hu0Var.Z0.setVisibility(0);
                hu0Var.W0.setVisibility(0);
                hu0Var.X0.setVisibility(0);
                org.telegram.ui.Components.fe0 fe0Var = photoViewer.y4;
                int childCount = fe0Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    fe0Var.getChildAt(i11).setVisibility(4);
                }
                photoViewer.p6 = null;
                photoViewer.u4 = 3;
                photoViewer.f1().L.b(photoViewer.u4 != 0);
                di.h4 h4Var = photoViewer.K1;
                if (h4Var != null) {
                    h4Var.b(photoViewer.u4 != 3);
                }
                photoViewer.o6 = -1;
                float r22 = photoViewer.r2(false);
                photoViewer.a6 = r22;
                photoViewer.e6 = r22;
                photoViewer.c6 = 0.0f;
                photoViewer.d6 = 0.0f;
                photoViewer.w3(r22);
                photoViewer.t2 = true;
                photoViewer.e0.invalidate();
                iv0 iv0Var = photoViewer.d;
                if (iv0Var == null || !iv0Var.O()) {
                    photoViewer.S1();
                    break;
                }
                break;
            case 4:
                AnimatorSet animatorSet = photoViewer.B1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    photoViewer.o1.setVisibility(8);
                    photoViewer.B1 = null;
                    break;
                }
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new yk0(this, 21));
                break;
            case 6:
                photoViewer.m6 = 1.0f;
                Runnable runnable = photoViewer.p4;
                if (runnable != null) {
                    fo foVar = photoViewer.l4;
                    if (foVar == null && (viVar = photoViewer.a2) != null) {
                        org.telegram.ui.ActionBar.m2 m2Var = viVar.f0;
                        if (m2Var instanceof fo) {
                            foVar = (fo) m2Var;
                        }
                    }
                    if (foVar != null) {
                        foVar.k8(runnable);
                        break;
                    } else {
                        runnable.run();
                        photoViewer.p4 = null;
                        break;
                    }
                }
                break;
            case 7:
                photoViewer.p6 = null;
                photoViewer.e0.invalidate();
                break;
            case 8:
                photoViewer.y3[0].setTag(null);
                break;
            default:
                photoViewer.y3[0].setTag(null);
                break;
        }
    }
}
