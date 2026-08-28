package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class fs0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ fs0(PhotoViewer photoViewer, int i9) {
        this.a = i9;
        this.b = photoViewer;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.Components.ki kiVar;
        int i9 = this.a;
        PhotoViewer photoViewer = this.b;
        switch (i9) {
            case 0:
                photoViewer.l6 = null;
                org.telegram.ui.Components.be0 be0Var = photoViewer.y1;
                if (be0Var != null) {
                    if (be0Var.b.j()) {
                        photoViewer.W0.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.f6.zf), PorterDuff.Mode.MULTIPLY));
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
                xs0 xs0Var = photoViewer.H1;
                xs0Var.q1.setTypeface(xf.s0.e(xs0Var.L1).j);
                xs0Var.V0.setVisibility(0);
                xs0Var.S0.setVisibility(0);
                xs0Var.T0.setVisibility(0);
                org.telegram.ui.Components.mc0 mc0Var = photoViewer.u4;
                int childCount = mc0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    mc0Var.getChildAt(i10).setVisibility(4);
                }
                photoViewer.l6 = null;
                photoViewer.q4 = 3;
                photoViewer.f1().H.b(photoViewer.q4 != 0);
                kh.b4 b4Var = photoViewer.G1;
                if (b4Var != null) {
                    b4Var.b(photoViewer.q4 != 3);
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
                zt0 zt0Var = photoViewer.d;
                if (zt0Var == null || !zt0Var.O()) {
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
                AndroidUtilities.runOnUIThread(new zk0(this, 21));
                break;
            case 6:
                photoViewer.i6 = 1.0f;
                Runnable runnable = photoViewer.l4;
                if (runnable != null) {
                    qn qnVar = photoViewer.h4;
                    if (qnVar == null && (kiVar = photoViewer.W1) != null) {
                        org.telegram.ui.ActionBar.o2 o2Var = kiVar.b0;
                        if (o2Var instanceof qn) {
                            qnVar = (qn) o2Var;
                        }
                    }
                    if (qnVar != null) {
                        qnVar.h8(runnable);
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
