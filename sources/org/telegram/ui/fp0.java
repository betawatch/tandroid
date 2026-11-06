package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class fp0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ fp0(PhotoViewer photoViewer, int i7) {
        this.a = i7;
        this.b = photoViewer;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.Components.di diVar;
        int i7 = this.a;
        PhotoViewer photoViewer = this.b;
        switch (i7) {
            case 0:
                photoViewer.o6 = null;
                org.telegram.ui.Components.fd0 fd0Var = photoViewer.C1;
                if (fd0Var != null) {
                    if (fd0Var.b.j()) {
                        org.telegram.ui.ActionBar.r6.t(photoViewer.a1, org.telegram.ui.ActionBar.k6.ng, photoViewer.v2, PorterDuff.Mode.MULTIPLY);
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
                tp0 tp0Var = photoViewer.L1;
                tp0Var.d1.setTypeface(sg.l0.e(tp0Var.y1).j);
                tp0Var.I0.setVisibility(0);
                tp0Var.F0.setVisibility(0);
                tp0Var.G0.setVisibility(0);
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
                tq0 tq0Var = photoViewer.d;
                if (tq0Var == null || !tq0Var.P()) {
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
                org.telegram.messenger.g0.h3(new ef0(this, 24));
                break;
            case 6:
                photoViewer.l6 = 1.0f;
                Runnable runnable = photoViewer.o4;
                if (runnable != null) {
                    an anVar = photoViewer.k4;
                    if (anVar == null && (diVar = photoViewer.a2) != null) {
                        org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
                        if (f2Var instanceof an) {
                            anVar = (an) f2Var;
                        }
                    }
                    if (anVar != null) {
                        anVar.w8(runnable);
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
