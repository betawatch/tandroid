package lh;

import android.animation.ValueAnimator;
import android.opengl.Matrix;
import java.util.Arrays;
import mh.aa;
import mh.ja;
import mh.u9;
import mh.z9;
import oh.i9;
import oh.z8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.hx;
import org.telegram.ui.py;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class c3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x037a A[ADDED_TO_REGION, LOOP:1: B:147:0x037a->B:148:0x037c, LOOP_START, PHI: r5
      0x037a: PHI (r5v2 int) = (r5v0 int), (r5v3 int) binds: [B:146:0x0378, B:148:0x037c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0377  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        char c3;
        boolean z4;
        int i10;
        int i11 = this.a;
        Object obj = this.b;
        switch (i11) {
            case 0:
                ((x3) obj).o();
                break;
            case 1:
                mh.b bVar = (mh.b) obj;
                bVar.getClass();
                new aa(bVar.getContext(), bVar.b).show();
                break;
            case 2:
                mh.o oVar = (mh.o) obj;
                oVar.getClass();
                try {
                    sl0 currentListView = oVar.u0.C.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        break;
                    }
                } catch (Throwable unused) {
                    return;
                }
                break;
            case 3:
                new fw0(((mh.e0) obj).getContext()).show();
                break;
            case 4:
                AndroidUtilities.showKeyboard(((mh.m0) obj).a0);
                break;
            case 5:
                AndroidUtilities.showKeyboard(((mh.r0) obj).h);
                break;
            case 6:
                AndroidUtilities.showKeyboard(((mh.v0) obj).c);
                break;
            case 7:
                mh.f4 f4Var = (mh.f4) obj;
                f4Var.e0 = false;
                f4Var.g0 = false;
                f4Var.a(f4Var.T, f4Var.U, f4Var.V, f4Var.W);
                break;
            case 8:
                ((mh.v3) obj).invalidateSelf();
                break;
            case 9:
                mh.y3 y3Var = (mh.y3) obj;
                mh.x3 x3Var = y3Var.E;
                int i12 = 3;
                if (x3Var == null) {
                    c3 = 2;
                    if (Math.abs(y3Var.d) <= 1.0E-4f && Math.abs(y3Var.e) <= 1.0E-4f) {
                        z4 = false;
                        if (y3Var.D == null ? true : z4) {
                            for (int i13 = 0; i13 < 6; i13++) {
                                Matrix.multiplyMV(y3Var.n, 0, y3Var.c, 0, y3Var.h[i13], 0);
                                y3Var.r[i13] = y3Var.n[c3];
                            }
                            Arrays.sort(y3Var.s, new d4.t(y3Var, i12));
                            y3Var.invalidate();
                        }
                        if (!y3Var.isAttachedToWindow()) {
                            AndroidUtilities.runOnUIThread(y3Var.F, 16L);
                            break;
                        }
                    } else {
                        y3Var.a();
                    }
                } else {
                    mh.y3 y3Var2 = x3Var.a;
                    float[] fArr = x3Var.h;
                    if (!x3Var.e && (i10 = x3Var.c) != 0) {
                        if (x3Var.l) {
                            y3Var2.a();
                        } else {
                            int c10 = m1.j.c(((mh.w3) x3Var.b.get(i10 - 1)).a);
                            if (c10 == 1 || c10 == 2) {
                                c3 = 2;
                                y3Var2.a();
                                int i14 = x3Var.f - 1;
                                x3Var.f = i14;
                                if (i14 <= 0) {
                                    x3Var.b();
                                }
                            } else if (c10 == 3) {
                                float pow = 1.0f - ((float) Math.pow(1.0f - (1.0f - (x3Var.f / x3Var.g)), 3.0d));
                                float f10 = 1.0f - pow;
                                c3 = 2;
                                if (Math.abs(x3Var.j * f10) > 1.0E-4f || Math.abs(x3Var.k * f10) > 1.0E-4f) {
                                    float[] fArr2 = new float[16];
                                    float f11 = x3Var.j * f10 * 0.96f;
                                    y3Var2.getClass();
                                    mh.y3.b(1.0f, 0.0f, f11, fArr2);
                                    y3Var2.getClass();
                                    mh.y3.d(fArr2, fArr, fArr);
                                    float f12 = x3Var.k * f10 * 0.96f;
                                    y3Var2.getClass();
                                    mh.y3.b(0.0f, 1.0f, f12, fArr2);
                                    mh.y3.d(fArr2, fArr, fArr);
                                }
                                float[] fArr3 = x3Var.i;
                                float[] fArr4 = y3Var2.c;
                                for (int i15 = 0; i15 < 16; i15++) {
                                    float f13 = fArr[i15];
                                    fArr4[i15] = e2.c.w(fArr3[i15], f13, pow, f13);
                                }
                                float[] fArr5 = {fArr4[0], fArr4[1], fArr4[2]};
                                float[] fArr6 = {fArr4[4], fArr4[5], fArr4[6]};
                                float[] fArr7 = new float[3];
                                mh.y3.e(fArr5);
                                mh.y3.c(fArr5, fArr6, fArr7);
                                mh.y3.e(fArr7);
                                mh.y3.c(fArr7, fArr5, fArr6);
                                fArr4[0] = fArr5[0];
                                fArr4[1] = fArr5[1];
                                fArr4[2] = fArr5[2];
                                fArr4[4] = fArr6[0];
                                fArr4[5] = fArr6[1];
                                fArr4[6] = fArr6[2];
                                fArr4[8] = fArr7[0];
                                fArr4[9] = fArr7[1];
                                fArr4[10] = fArr7[2];
                                int i16 = x3Var.f - 1;
                                x3Var.f = i16;
                                if (i16 <= 0) {
                                    System.arraycopy(x3Var.i, 0, y3Var2.c, 0, 16);
                                    y3Var2.d = 0.0f;
                                    y3Var2.e = 0.0f;
                                    x3Var.b();
                                }
                            }
                        }
                    }
                    c3 = 2;
                }
                z4 = true;
                if (y3Var.D == null ? true : z4) {
                }
                if (!y3Var.isAttachedToWindow()) {
                }
                break;
            case 10:
                ((mh.a4) obj).invalidate();
                break;
            case 11:
                ((mh.e4) obj).invalidateSelf();
                break;
            case 12:
                mh.c5 c5Var = (mh.c5) obj;
                c3 c3Var = c5Var.f0;
                p9[] p9VarArr = c5Var.d;
                if (!p9VarArr[2 - c5Var.o0].getImageReceiver().hasImageLoaded()) {
                    AndroidUtilities.cancelRunOnUIThread(c3Var);
                    AndroidUtilities.runOnUIThread(c3Var, 150L);
                    break;
                } else {
                    c5.d dVar = c5Var.R;
                    if (dVar != null && dVar.b == 1 && c5Var.isAttachedToWindow()) {
                        AndroidUtilities.cancelRunOnUIThread(c3Var);
                        ValueAnimator valueAnimator = c5Var.e0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            c5Var.e0 = null;
                        }
                        int i17 = 1 - c5Var.o0;
                        c5Var.o0 = i17;
                        hj0 lottieAnimation = p9VarArr[2 - i17].getImageReceiver().getLottieAnimation();
                        hj0 lottieAnimation2 = p9VarArr[c5Var.o0 + 1].getImageReceiver().getLottieAnimation();
                        if (lottieAnimation2 != null && lottieAnimation != null) {
                            lottieAnimation2.Q(lottieAnimation.r(), false);
                        }
                        c5Var.T.c();
                        int i18 = c5Var.o0 + 1;
                        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = c5Var.S;
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) c5Var.V.c();
                        stargiftattributebackdropArr[i18] = stargiftattributebackdrop;
                        c5Var.e(i18, stargiftattributebackdrop);
                        c5Var.g(1, (TL_stars.starGiftAttributePattern) c5Var.U.c(), true);
                        c5Var.a();
                        float f14 = c5Var.o0;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f14, f14);
                        c5Var.e0 = ofFloat;
                        ofFloat.addUpdateListener(new mh.y4(c5Var, 2));
                        c5Var.e0.addListener(new mh.b5(c5Var));
                        c5Var.e0.setDuration(320L);
                        c5Var.e0.setInterpolator(pr.h);
                        c5Var.e0.start();
                        break;
                    }
                }
                break;
            case 13:
                ((gg.i) obj).setPaused(true);
                break;
            case 14:
                AndroidUtilities.showKeyboard((EditTextBoldCursor) obj);
                break;
            case 15:
                ((mh.v0[]) obj)[0].dismiss();
                break;
            case 16:
                u9 u9Var = (u9) obj;
                u9Var.getClass();
                try {
                    sl0 currentListView2 = ((ja) u9Var.J0).O.getCurrentListView();
                    if (currentListView2 != null && currentListView2.getAdapter() != null) {
                        currentListView2.getAdapter().l();
                        break;
                    }
                } catch (Throwable unused2) {
                    return;
                }
                break;
            case 17:
                af.g.s(((z9) obj).getContext(), LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 18:
                af.g.s(((aa) obj).getContext(), LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 19:
                ng.v vVar = (ng.v) ((ja.c) obj).a;
                ng.u uVar = vVar.b;
                if (uVar != null) {
                    uVar.d();
                }
                vVar.a.z7(true);
                break;
            case 20:
                ((ValueAnimator) obj).start();
                break;
            case 21:
                org.telegram.ui.ActionBar.p2 p2Var = ((ng.z) obj).c2.r;
                if (p2Var instanceof xn) {
                    p2Var.showDialog(new fg.n1(p2Var, 11, false));
                    break;
                } else {
                    org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                    if (R != null) {
                        R.showDialog(new fg.n1(p2Var, 11, false));
                        break;
                    }
                }
                break;
            case 22:
                o3.d dVar2 = (o3.d) obj;
                if (!dVar2.c) {
                    o3.i iVar = dVar2.b;
                    if (iVar != null) {
                        iVar.c(dVar2.a);
                    }
                    dVar2.d.x.remove(dVar2);
                    dVar2.c = true;
                    break;
                }
                break;
            case 23:
                ((o3.b) obj).c(null);
                break;
            case 24:
                py pyVar = ((hx) obj).L0;
                if (!pyVar.I || !pyVar.X3().G()) {
                    pyVar.x4(true, true);
                    break;
                } else {
                    pyVar.B0.h();
                    break;
                }
            case 25:
                ((oh.c1) obj).a.t(false);
                break;
            case 26:
                oh.e1 e1Var = ((oh.d1) obj).a;
                NotificationCenter.getInstance(e1Var.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(e1Var.g()));
                break;
            case 27:
                oh.j1 j1Var = (oh.j1) obj;
                j1Var.E = false;
                j1Var.p(false);
                j1Var.Q = false;
                break;
            case 28:
                ((oh.f3) obj).a.Q0();
                break;
            default:
                oh.f4 f4Var2 = ((oh.j3) obj).x;
                oh.z3 z3Var = f4Var2.N1;
                if (z3Var != null) {
                    if (!f4Var2.Q1 && !f4Var2.R1 && !f4Var2.S1) {
                        i9 i9Var = ((z8) z3Var).d;
                        if (!i9Var.k0.getCurrentPeerView().d1(true) && !i9Var.k0.E(true)) {
                            i9Var.q(true);
                            break;
                        }
                    } else if (f4Var2.L1.e) {
                        f4Var2.J2.b.loopBack();
                        break;
                    } else {
                        f4Var2.T0 = 0L;
                        break;
                    }
                }
                break;
        }
    }
}
