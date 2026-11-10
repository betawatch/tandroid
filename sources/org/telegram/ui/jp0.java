package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class jp0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ jp0(PhotoViewer photoViewer, int i7) {
        this.a = i7;
        this.b = photoViewer;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.Components.ci ciVar;
        int i7 = this.a;
        PhotoViewer photoViewer = this.b;
        switch (i7) {
            case 0:
                photoViewer.o6 = null;
                org.telegram.ui.Components.fd0 fd0Var = photoViewer.C1;
                if (fd0Var != null) {
                    if (fd0Var.b.j()) {
                        org.telegram.ui.ActionBar.t6.s(photoViewer.a1, org.telegram.ui.ActionBar.m6.ng, photoViewer.v2, PorterDuff.Mode.MULTIPLY);
                    } else {
                        photoViewer.a1.setColorFilter((ColorFilter) null);
                    }
                    photoViewer.f6 = 0.0f;
                    photoViewer.e0.invalidate();
                    break;
                }
                break;
            case 1:
                photoViewer.s3 = null;
                break;
            case 2:
                Drawable[] drawableArr = PhotoViewer.Y8;
                photoViewer.d3();
                break;
            case 3:
                photoViewer.L1.m0(false);
                xp0 xp0Var = photoViewer.L1;
                xp0Var.d1.setTypeface(sg.l0.e(xp0Var.y1).j);
                xp0Var.I0.setVisibility(0);
                xp0Var.F0.setVisibility(0);
                xp0Var.G0.setVisibility(0);
                org.telegram.ui.Components.sb0 sb0Var = photoViewer.x4;
                int childCount = sb0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    sb0Var.getChildAt(i10).setVisibility(4);
                }
                photoViewer.o6 = null;
                photoViewer.t4 = 3;
                photoViewer.a1().L.b(photoViewer.t4 != 0);
                fi.q3 q3Var = photoViewer.K1;
                if (q3Var != null) {
                    q3Var.b(photoViewer.t4 != 3);
                }
                photoViewer.n6 = -1;
                float o22 = photoViewer.o2(false);
                photoViewer.Z5 = o22;
                photoViewer.d6 = o22;
                photoViewer.b6 = 0.0f;
                photoViewer.c6 = 0.0f;
                photoViewer.t3(o22);
                photoViewer.t2 = true;
                photoViewer.e0.invalidate();
                xq0 xq0Var = photoViewer.d;
                if (xq0Var == null || !xq0Var.P()) {
                    photoViewer.Q1();
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
                org.telegram.messenger.g0.h3(new hf0(this, 24));
                break;
            case 6:
                photoViewer.l6 = 1.0f;
                Runnable runnable = photoViewer.o4;
                if (runnable != null) {
                    cn cnVar = photoViewer.k4;
                    if (cnVar == null && (ciVar = photoViewer.a2) != null) {
                        org.telegram.ui.ActionBar.f2 f2Var = ciVar.Z1;
                        if (f2Var instanceof cn) {
                            cnVar = (cn) f2Var;
                        }
                    }
                    if (cnVar != null) {
                        cnVar.x8(runnable);
                        break;
                    } else {
                        runnable.run();
                        photoViewer.o4 = null;
                        break;
                    }
                }
                break;
            case 7:
                photoViewer.o6 = null;
                photoViewer.e0.invalidate();
                break;
            case 8:
                photoViewer.x3[0].setTag(null);
                break;
            default:
                photoViewer.x3[0].setTag(null);
                break;
        }
    }
}
