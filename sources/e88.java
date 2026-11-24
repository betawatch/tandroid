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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class e88 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ e88(PhotoViewer photoViewer, byte b) {
        this.a = b;
        this.b = photoViewer;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        x02 x02Var;
        byte b = this.a;
        PhotoViewer photoViewer = this.b;
        switch (b) {
            case 0:
                photoViewer.o6 = null;
                v48 v48Var = photoViewer.D1;
                if (v48Var != null) {
                    boolean j = v48Var.b.j();
                    ImageView imageView = photoViewer.b1;
                    if (j) {
                        zkb.s(imageView, bkb.pg, photoViewer.w2, PorterDuff.Mode.MULTIPLY);
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
                q88 q88Var = photoViewer.M1;
                q88Var.k1.setTypeface(k38.e(q88Var.F1).j);
                q88Var.P0.setVisibility(0);
                q88Var.M0.setVisibility(0);
                q88Var.N0.setVisibility(0);
                ju7 ju7Var = photoViewer.x4;
                ju7Var.f = true;
                int childCount = ju7Var.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    ju7Var.getChildAt(i).setVisibility(4);
                }
                photoViewer.o6 = null;
                photoViewer.t4 = (byte) 3;
                photoViewer.d0().M.b(photoViewer.t4 != 0);
                mv5 mv5Var = photoViewer.L1;
                if (mv5Var != null) {
                    mv5Var.b(photoViewer.t4 != 3);
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
                o98 o98Var = photoViewer.d;
                if (o98Var == null || !o98Var.P()) {
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
                gl.c3(new w88(this, (byte) 1));
                break;
            case 6:
                photoViewer.l6 = 1.0f;
                Runnable runnable = photoViewer.o4;
                if (runnable != null) {
                    mu1 mu1Var = photoViewer.k4;
                    if (mu1Var == null && (x02Var = photoViewer.b2) != null) {
                        d dVar = x02Var.Z1;
                        if (dVar instanceof mu1) {
                            mu1Var = (mu1) dVar;
                        }
                    }
                    if (mu1Var != null) {
                        mu1Var.s6(runnable);
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
