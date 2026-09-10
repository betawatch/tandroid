package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.hi0;
import org.telegram.ui.a11;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class h extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 15:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.M = null;
                actionBarOverlayLayout.v = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                o oVar = ((i) this.b).c0;
                if (oVar.g0 == animator) {
                    oVar.g0 = null;
                    oVar.f.getEditText().setScrollY(oVar.b0);
                    break;
                }
                break;
            case 1:
                i0 i0Var = (i0) this.b;
                i0Var.l = 1.0f;
                j0 j0Var = i0Var.p;
                if (j0Var.n.contains(i0Var)) {
                    i0Var.c.onDetachedFromWindow();
                    h0 h0Var = i0Var.d;
                    if (h0Var != null) {
                        h0Var.pause();
                        i0Var.d.release(null);
                        i0Var.d = null;
                    }
                    TextureView textureView = i0Var.e;
                    if (textureView != null) {
                        AndroidUtilities.removeFromParent(textureView);
                        i0Var.e = null;
                    }
                    i0Var.f = false;
                    j0Var.n.remove(i0Var);
                }
                j0Var.invalidate();
                break;
            case 2:
                p4 p4Var = ((v3) this.b).h;
                p4Var.F.setVisibility(8);
                p4Var.d.setVisibility(8);
                break;
            case 3:
                x4 x4Var = (x4) this.b;
                x4Var.o0 = 1.0f;
                x4Var.invalidate();
                break;
            case 4:
                super.onAnimationEnd(animator);
                o7 o7Var = (o7) this.b;
                ImageView imageView = o7Var.c;
                o7Var.c = o7Var.d;
                o7Var.d = imageView;
                imageView.bringToFront();
                o7Var.d.setVisibility(8);
                o7Var.h = null;
                break;
            case 5:
                super.onAnimationEnd(animator);
                ((u7) this.b).w = null;
                break;
            case 6:
                r8 r8Var = (r8) this.b;
                if (r8Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) r8Var.getParent()).removeView(r8Var);
                    break;
                }
                break;
            case 7:
                ((kb) this.b).N = false;
                break;
            case 8:
                ib ibVar = (ib) this.b;
                ibVar.setTranslationY(0.0f);
                ibVar.d = null;
                break;
            case 9:
                di.b0 b0Var = (di.b0) this.b;
                b0Var.setVisibility(8);
                b0Var.a = null;
                break;
            case 10:
                ((di.n3) this.b).y.setVisibility(8);
                break;
            case 11:
                ((di.u4) this.b).I.setVisibility(8);
                break;
            case 12:
                super.onAnimationEnd(animator);
                hg.g gVar = (hg.g) this.b;
                if (!gVar.i1) {
                    gVar.u0 = false;
                    gVar.t0.setVisibility(8);
                    gVar.invalidate();
                }
                gVar.f0 = false;
                break;
            case 13:
                ((jg.e) this.b).h.setVisibility(8);
                break;
            case 14:
                ((CropAreaView) this.b).c0 = null;
                break;
            case 15:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.M = null;
                actionBarOverlayLayout.v = false;
                break;
            case 16:
                og.g0 g0Var = (og.g0) this.b;
                g0Var.a.getPainting().c(null, g0Var.a.getCurrentColor(), true, null);
                g0Var.r = null;
                break;
            case 17:
                org.telegram.ui.j4 j4Var = (org.telegram.ui.j4) this.b;
                Runnable runnable = j4Var.a0;
                if (runnable != null) {
                    runnable.run();
                    j4Var.a0 = null;
                    break;
                }
                break;
            case 18:
                org.telegram.ui.w3 w3Var = (org.telegram.ui.w3) this.b;
                w3Var.w = 1.0f;
                w3Var.n();
                w3Var.i();
                w3Var.h();
                w3Var.a.unlock();
                break;
            case 19:
                org.telegram.ui.r4 r4Var = (org.telegram.ui.r4) this.b;
                r4Var.getClass();
                r4Var.setVisibility(8);
                break;
            case 20:
                org.telegram.ui.u4 u4Var = (org.telegram.ui.u4) this.b;
                u4Var.c = false;
                u4Var.invalidate();
                break;
            case 21:
                ((org.telegram.ui.w5) this.b).f0.setVisibility(8);
                break;
            case 22:
            default:
                super.onAnimationEnd(animator);
                break;
            case 23:
                ((org.telegram.ui.u9) this.b).s = null;
                break;
            case 24:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.b;
                ((a11) jVar).c0.e.c.r = false;
                FrameLayout frameLayout = jVar.J;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.K);
                    break;
                }
                break;
            case 25:
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) this.b;
                Button button = wVar.n;
                hi0 hi0Var = wVar.f;
                if (button != hi0Var) {
                    hi0Var.setVisibility(4);
                    break;
                } else {
                    wVar.e.setVisibility(4);
                    break;
                }
            case 26:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Cells.e0) this.b).x = null;
                break;
            case 27:
                ((org.telegram.ui.Cells.g4) this.b).G = null;
                break;
            case 28:
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) this.b;
                if (animator.equals(t5Var.n)) {
                    t5Var.n = null;
                    break;
                }
                break;
            case 29:
                androidx.activity.i iVar = (androidx.activity.i) this.b;
                if (animator.equals(((org.telegram.ui.Cells.w5) iVar.b).d)) {
                    ((org.telegram.ui.Cells.w5) iVar.b).d = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 19:
                ((org.telegram.ui.r4) this.b).setVisibility(0);
                break;
            case 22:
                org.telegram.ui.h8 h8Var = (org.telegram.ui.h8) this.b;
                for (int i10 = 0; i10 < h8Var.b.getChildCount(); i10++) {
                    org.telegram.ui.e8.a((org.telegram.ui.e8) h8Var.b.getChildAt(i10), h8Var.P, h8Var.Q);
                }
                break;
            case 24:
                ((a11) ((org.telegram.ui.Cells.j) this.b)).c0.e.c.r = true;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
