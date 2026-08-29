package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class es0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ es0(PhotoViewer photoViewer, int i10) {
        this.a = i10;
        this.b = photoViewer;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.Components.ni niVar;
        int i10 = this.a;
        PhotoViewer photoViewer = this.b;
        switch (i10) {
            case 0:
                photoViewer.l6 = null;
                org.telegram.ui.Components.pe0 pe0Var = photoViewer.y1;
                if (pe0Var != null) {
                    if (pe0Var.b.j()) {
                        photoViewer.W0.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.g6.zf), PorterDuff.Mode.MULTIPLY));
                    } else {
                        photoViewer.W0.setColorFilter((ColorFilter) null);
                    }
                    photoViewer.c6 = 0.0f;
                    photoViewer.a0.invalidate();
                    break;
                }
                break;
            case 1:
                photoViewer.p3 = null;
                break;
            case 2:
                Drawable[] drawableArr = PhotoViewer.P8;
                photoViewer.g3();
                break;
            case 3:
                photoViewer.H1.n0(false);
                ws0 ws0Var = photoViewer.H1;
                ws0Var.q1.setTypeface(ag.h1.e(ws0Var.L1).j);
                ws0Var.V0.setVisibility(0);
                ws0Var.S0.setVisibility(0);
                ws0Var.T0.setVisibility(0);
                org.telegram.ui.Components.bd0 bd0Var = photoViewer.u4;
                int childCount = bd0Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    bd0Var.getChildAt(i11).setVisibility(4);
                }
                photoViewer.l6 = null;
                photoViewer.q4 = 3;
                photoViewer.f1().H.b(photoViewer.q4 != 0);
                nh.w3 w3Var = photoViewer.G1;
                if (w3Var != null) {
                    w3Var.b(photoViewer.q4 != 3);
                }
                photoViewer.k6 = -1;
                float r22 = photoViewer.r2(false);
                photoViewer.W5 = r22;
                photoViewer.a6 = r22;
                photoViewer.Y5 = 0.0f;
                photoViewer.Z5 = 0.0f;
                photoViewer.w3(r22);
                photoViewer.p2 = true;
                photoViewer.a0.invalidate();
                xt0 xt0Var = photoViewer.d;
                if (xt0Var == null || !xt0Var.O()) {
                    photoViewer.R1();
                    break;
                }
                break;
            case 4:
                AnimatorSet animatorSet = photoViewer.x1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    photoViewer.k1.setVisibility(8);
                    photoViewer.x1 = null;
                    break;
                }
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new vk0(this, 21));
                break;
            case 6:
                photoViewer.i6 = 1.0f;
                Runnable runnable = photoViewer.l4;
                if (runnable != null) {
                    tn tnVar = photoViewer.h4;
                    if (tnVar == null && (niVar = photoViewer.W1) != null) {
                        org.telegram.ui.ActionBar.o2 o2Var = niVar.b0;
                        if (o2Var instanceof tn) {
                            tnVar = (tn) o2Var;
                        }
                    }
                    if (tnVar != null) {
                        tnVar.h8(runnable);
                        break;
                    } else {
                        runnable.run();
                        photoViewer.l4 = null;
                        break;
                    }
                }
                break;
            case 7:
                photoViewer.l6 = null;
                photoViewer.a0.invalidate();
                break;
            case 8:
                photoViewer.u3[0].setTag(null);
                break;
            default:
                photoViewer.u3[0].setTag(null);
                break;
        }
    }
}
