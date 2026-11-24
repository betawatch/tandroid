// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ha8 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ ha8(PhotoViewer photoViewer, byte b) {
        this.a = b;
        this.b = photoViewer;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        i22 i22Var;
        byte b = this.a;
        PhotoViewer photoViewer = this.b;
        switch (b) {
            case 0:
                photoViewer.o6 = null;
                x68 x68Var = photoViewer.D1;
                if (x68Var != null) {
                    boolean j = x68Var.b.j();
                    ImageView imageView = photoViewer.b1;
                    if (j) {
                        anb.s(imageView, cmb.pg, photoViewer.w2, PorterDuff.Mode.MULTIPLY);
                    } else {
                        imageView.setColorFilter((ColorFilter) null);
                    }
                    photoViewer.f6 = 0.0f;
                    photoViewer.f0.invalidate();
                    break;
                }
                break;
            case 1:
                photoViewer.t3 = null;
                break;
            case 2:
                Drawable[] drawableArr = PhotoViewer.d9;
                photoViewer.q2();
                break;
            case 3:
                photoViewer.M1.o0(false);
                sa8 sa8Var = photoViewer.M1;
                sa8Var.k1.setTypeface(m58.e(sa8Var.F1).j);
                sa8Var.P0.setVisibility(0);
                sa8Var.M0.setVisibility(0);
                sa8Var.N0.setVisibility(0);
                kw7 kw7Var = photoViewer.x4;
                kw7Var.f = true;
                int childCount = kw7Var.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    kw7Var.getChildAt(i).setVisibility(4);
                }
                photoViewer.o6 = null;
                photoViewer.t4 = (byte) 3;
                photoViewer.d0().M.b(photoViewer.t4 != 0);
                mx5 mx5Var = photoViewer.L1;
                if (mx5Var != null) {
                    mx5Var.b(photoViewer.t4 != 3);
                }
                photoViewer.n6 = -1;
                float z1 = photoViewer.z1(false);
                photoViewer.Z5 = z1;
                photoViewer.d6 = z1;
                photoViewer.b6 = 0.0f;
                photoViewer.c6 = 0.0f;
                photoViewer.I2(z1);
                photoViewer.u2 = true;
                photoViewer.f0.invalidate();
                pb8 pb8Var = photoViewer.d;
                if (pb8Var == null || !pb8Var.Q()) {
                    photoViewer.W0();
                    break;
                }
                break;
            case 4:
                AnimatorSet animatorSet = photoViewer.C1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    photoViewer.p1.setVisibility(8);
                    photoViewer.C1 = null;
                    break;
                }
                break;
            case 5:
                gm.c3(new q78(this, (byte) 8));
                break;
            case 6:
                photoViewer.l6 = 1.0f;
                Runnable runnable = photoViewer.o4;
                if (runnable != null) {
                    yv1 yv1Var = photoViewer.k4;
                    if (yv1Var == null && (i22Var = photoViewer.b2) != null) {
                        d dVar = i22Var.Z1;
                        if (dVar instanceof yv1) {
                            yv1Var = (yv1) dVar;
                        }
                    }
                    if (yv1Var != null) {
                        yv1Var.z6(runnable);
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
                photoViewer.f0.invalidate();
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
