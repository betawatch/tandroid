// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.TextureView;
import android.view.WindowManager;
import org.telegram.ui.Components.UndoView;
import org.webrtc.OrientationHelper;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class iab extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ iab(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((jab) this.b).e = false;
                break;
            case 1:
                ((tib) this.b).setVisibility(4);
                break;
            case 2:
                qmb qmbVar = ((fmb) this.b).a;
                if (!qmbVar.r1.a()) {
                    qmbVar.T1.setVisibility(8);
                    break;
                }
                break;
            case 3:
                super.onAnimationEnd(animator);
                gl3 gl3Var = (gl3) ((fb) this.b).b;
                ((smb) gl3Var.b).getTransitionParams().e();
                ((smb) gl3Var.b).getTransitionParams().h = false;
                ((smb) gl3Var.b).getTransitionParams().L1 = 1.0f;
                break;
            case 4:
                ((jtb) this.b).setVisibility(8);
                break;
            case 5:
                super.onAnimationEnd(animator);
                ((ttb) this.b).d = null;
                break;
            case 6:
                super.onAnimationEnd(animator);
                ((ovb) this.b).setScrollEnabled(true);
                break;
            case 7:
                rj4 rj4Var = ((fxb) this.b).f;
                rj4Var.setScaleX(1.0f);
                rj4Var.setScaleY(1.0f);
                rj4Var.invalidate();
                break;
            case 8:
                jxb jxbVar = (jxb) this.b;
                jxbVar.M = 1.0f;
                jxbVar.h.invalidate();
                break;
            case 9:
                ((lyb) this.b).L = null;
                break;
            case 10:
                ((d2c) this.b).M = null;
                break;
            case 11:
                p3c p3cVar = ((o3c) this.b).d;
                if (animator.equals(p3cVar.L)) {
                    p3cVar.L = null;
                    break;
                }
                break;
            case 12:
                UndoView undoView = (UndoView) this.b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                break;
            case 13:
                k6c k6cVar = (k6c) this.b;
                if (k6cVar.a.getTag() == null) {
                    k6cVar.a.setVisibility(4);
                    break;
                }
                break;
            case 14:
                super.onAnimationEnd(animator);
                v7c v7cVar = (v7c) this.b;
                v7cVar.b = 0.0f;
                v7cVar.setTranslationY(0.0f);
                v7cVar.a = null;
                break;
            case 15:
                c8c c8cVar = (c8c) this.b;
                c8cVar.d = null;
                c8cVar.a = null;
                c8cVar.b = false;
                c8cVar.f.c.setAllowDrawCursor(true);
                break;
            case 16:
                acc accVar = (acc) ((ok2) this.b).b;
                accVar.G = true;
                accVar.invalidate();
                break;
            case 17:
                vec vecVar = (vec) this.b;
                vecVar.K = false;
                vecVar.setEnabled(true);
                uec uecVar = vecVar.E;
                if (uecVar != null) {
                    uecVar.g(1.0f);
                }
                vecVar.invalidate();
                break;
            case 18:
                lfc lfcVar = (lfc) this.b;
                lfcVar.i = false;
                lfcVar.l.setAlpha(35);
                lfcVar.k.setAlpha(kk7.m1);
                lfcVar.j.setAlpha(35);
                lfcVar.c();
                break;
            case 19:
                pfc pfcVar = ((nfc) this.b).c;
                pfcVar.P = false;
                pfcVar.requestLayout();
                break;
            case 20:
                aic aicVar = (aic) this.b;
                aicVar.O = 0.0f;
                aicVar.P = 0.0f;
                zhc zhcVar = aicVar.d;
                zhcVar.setScaleX(aicVar.U);
                zhcVar.setScaleY(aicVar.U);
                TextureView textureView = aicVar.e;
                if (textureView != null) {
                    textureView.setScaleX(aicVar.V);
                    textureView.setScaleY(aicVar.V);
                }
                aicVar.setTranslationY(0.0f);
                aicVar.setTranslationX(0.0f);
                aicVar.a0 = aicVar.W;
                aicVar.c0 = null;
                break;
            case 21:
                dic dicVar = (dic) this.b;
                dicVar.R = dicVar.Q ? 1.0f : 0.0f;
                dicVar.a(dicVar.S, dicVar.T);
                break;
            case 22:
                ((eic) this.b).c.e();
                gl.K3(((eic) this.b).a);
                if (((eic) this.b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((eic) this.b).a.getSystemService("window");
                    ((eic) this.b).setVisibility(8);
                    try {
                        windowManager.removeView((eic) this.b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    break;
                }
                break;
            case 23:
                kic kicVar = (kic) this.b;
                AnimatorSet animatorSet = kicVar.R;
                kicVar.K = false;
                kicVar.U.e = false;
                if (kicVar.V && animatorSet != null) {
                    animatorSet.cancel();
                    animatorSet.start();
                }
                kicVar.c();
                break;
            case 24:
                ((ric) this.b).e.setVisibility(8);
                break;
            case 25:
                ((nkc) this.b).f();
                break;
            case 26:
                hmc hmcVar = (hmc) this.b;
                if (hmcVar.N0 == animator) {
                    hmcVar.N0 = null;
                    break;
                }
                break;
            case 27:
                fmc fmcVar = (fmc) this.b;
                fmcVar.n = false;
                fmcVar.r = null;
                fmcVar.c.setLayerType(0, null);
                break;
            case 28:
                mmc mmcVar = (mmc) this.b;
                mmcVar.O = 0.0f;
                mmcVar.P = 0.0f;
                mmcVar.c0 = null;
                break;
            default:
                lnc lncVar = (lnc) this.b;
                lncVar.J = null;
                lncVar.j0 = 1.0f;
                lncVar.i0 = 0.0f;
                lncVar.h0 = 0.0f;
                lncVar.b();
                break;
        }
    }
}
