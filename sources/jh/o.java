package jh;

import android.animation.ValueAnimator;
import android.opengl.Matrix;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.wv0;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.fy;
import org.telegram.ui.tn;
import org.telegram.ui.xw;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0393 A[ADDED_TO_REGION, LOOP:1: B:148:0x0393->B:149:0x0395, LOOP_START, PHI: r4
      0x0393: PHI (r4v1 int) = (r4v0 int), (r4v2 int) binds: [B:147:0x0391, B:149:0x0395] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0390  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        char c3;
        boolean z10;
        int i10;
        int i11 = this.a;
        Object obj = this.b;
        switch (i11) {
            case 0:
                p pVar = (p) obj;
                pVar.getClass();
                try {
                    jl0 currentListView = pVar.t0.B.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        break;
                    }
                } catch (Throwable unused) {
                    return;
                }
                break;
            case 1:
                new wv0(((f0) obj).getContext()).show();
                break;
            case 2:
                AndroidUtilities.showKeyboard(((n0) obj).Z);
                break;
            case 3:
                AndroidUtilities.showKeyboard(((s0) obj).h);
                break;
            case 4:
                AndroidUtilities.showKeyboard(((w0) obj).c);
                break;
            case 5:
                g4 g4Var = (g4) obj;
                g4Var.d0 = false;
                g4Var.f0 = false;
                g4Var.a(g4Var.S, g4Var.T, g4Var.U, g4Var.V);
                break;
            case 6:
                ((w3) obj).invalidateSelf();
                break;
            case 7:
                z3 z3Var = (z3) obj;
                y3 y3Var = z3Var.D;
                int i12 = 3;
                if (y3Var == null) {
                    c3 = 2;
                    if (Math.abs(z3Var.d) <= 1.0E-4f && Math.abs(z3Var.e) <= 1.0E-4f) {
                        z10 = false;
                        if (z3Var.C == null ? true : z10) {
                            for (int i13 = 0; i13 < 6; i13++) {
                                Matrix.multiplyMV(z3Var.n, 0, z3Var.c, 0, z3Var.h[i13], 0);
                                z3Var.r[i13] = z3Var.n[c3];
                            }
                            Arrays.sort(z3Var.s, new a4.v(z3Var, i12));
                            z3Var.invalidate();
                        }
                        if (!z3Var.isAttachedToWindow()) {
                            AndroidUtilities.runOnUIThread(z3Var.E, 16L);
                            break;
                        }
                    } else {
                        z3Var.a();
                    }
                } else {
                    z3 z3Var2 = y3Var.a;
                    float[] fArr = y3Var.h;
                    if (!y3Var.e && (i10 = y3Var.c) != 0) {
                        if (y3Var.l) {
                            z3Var2.a();
                        } else {
                            int b10 = m1.j.b(((x3) y3Var.b.get(i10 - 1)).a);
                            if (b10 == 1 || b10 == 2) {
                                c3 = 2;
                                z3Var2.a();
                                int i14 = y3Var.f - 1;
                                y3Var.f = i14;
                                if (i14 <= 0) {
                                    y3Var.b();
                                }
                            } else if (b10 == 3) {
                                float pow = 1.0f - ((float) Math.pow(1.0f - (1.0f - (y3Var.f / y3Var.g)), 3.0d));
                                float f9 = 1.0f - pow;
                                c3 = 2;
                                if (Math.abs(y3Var.j * f9) > 1.0E-4f || Math.abs(y3Var.k * f9) > 1.0E-4f) {
                                    float[] fArr2 = new float[16];
                                    float f10 = y3Var.j * f9 * 0.96f;
                                    z3Var2.getClass();
                                    z3.b(1.0f, 0.0f, f10, fArr2);
                                    z3Var2.getClass();
                                    z3.d(fArr2, fArr, fArr);
                                    float f11 = y3Var.k * f9 * 0.96f;
                                    z3Var2.getClass();
                                    z3.b(0.0f, 1.0f, f11, fArr2);
                                    z3.d(fArr2, fArr, fArr);
                                }
                                float[] fArr3 = y3Var.i;
                                float[] fArr4 = z3Var2.c;
                                for (int i15 = 0; i15 < 16; i15++) {
                                    float f12 = fArr[i15];
                                    fArr4[i15] = com.google.android.recaptcha.internal.a.z(fArr3[i15], f12, pow, f12);
                                }
                                float[] fArr5 = {fArr4[0], fArr4[1], fArr4[2]};
                                float[] fArr6 = {fArr4[4], fArr4[5], fArr4[6]};
                                float[] fArr7 = new float[3];
                                z3.e(fArr5);
                                z3.c(fArr5, fArr6, fArr7);
                                z3.e(fArr7);
                                z3.c(fArr7, fArr5, fArr6);
                                fArr4[0] = fArr5[0];
                                fArr4[1] = fArr5[1];
                                fArr4[2] = fArr5[2];
                                fArr4[4] = fArr6[0];
                                fArr4[5] = fArr6[1];
                                fArr4[6] = fArr6[2];
                                fArr4[8] = fArr7[0];
                                fArr4[9] = fArr7[1];
                                fArr4[10] = fArr7[2];
                                int i16 = y3Var.f - 1;
                                y3Var.f = i16;
                                if (i16 <= 0) {
                                    System.arraycopy(y3Var.i, 0, z3Var2.c, 0, 16);
                                    z3Var2.d = 0.0f;
                                    z3Var2.e = 0.0f;
                                    y3Var.b();
                                }
                            }
                        }
                    }
                    c3 = 2;
                }
                z10 = true;
                if (z3Var.C == null ? true : z10) {
                }
                if (!z3Var.isAttachedToWindow()) {
                }
                break;
            case 8:
                ((b4) obj).invalidate();
                break;
            case 9:
                ((f4) obj).invalidateSelf();
                break;
            case 10:
                d5 d5Var = (d5) obj;
                o oVar = d5Var.e0;
                org.telegram.ui.Components.t9[] t9VarArr = d5Var.d;
                if (!t9VarArr[2 - d5Var.n0].getImageReceiver().hasImageLoaded()) {
                    AndroidUtilities.cancelRunOnUIThread(oVar);
                    AndroidUtilities.runOnUIThread(oVar, 150L);
                    break;
                } else {
                    a5.d dVar = d5Var.Q;
                    if (dVar != null && dVar.b == 1 && d5Var.isAttachedToWindow()) {
                        AndroidUtilities.cancelRunOnUIThread(oVar);
                        ValueAnimator valueAnimator = d5Var.d0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            d5Var.d0 = null;
                        }
                        int i17 = 1 - d5Var.n0;
                        d5Var.n0 = i17;
                        xi0 lottieAnimation = t9VarArr[2 - i17].getImageReceiver().getLottieAnimation();
                        xi0 lottieAnimation2 = t9VarArr[d5Var.n0 + 1].getImageReceiver().getLottieAnimation();
                        if (lottieAnimation2 != null && lottieAnimation != null) {
                            lottieAnimation2.Q(lottieAnimation.r(), false);
                        }
                        d5Var.S.c();
                        int i18 = d5Var.n0 + 1;
                        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = d5Var.R;
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) d5Var.U.c();
                        stargiftattributebackdropArr[i18] = stargiftattributebackdrop;
                        d5Var.e(i18, stargiftattributebackdrop);
                        d5Var.g(1, (TL_stars.starGiftAttributePattern) d5Var.T.c(), true);
                        d5Var.a();
                        float f13 = d5Var.n0;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f13, f13);
                        d5Var.d0 = ofFloat;
                        ofFloat.addUpdateListener(new z4(d5Var, 2));
                        d5Var.d0.addListener(new c5(d5Var));
                        d5Var.d0.setDuration(320L);
                        d5Var.d0.setInterpolator(jr.h);
                        d5Var.d0.start();
                        break;
                    }
                }
                break;
            case 11:
                ((dg.i) obj).setPaused(true);
                break;
            case 12:
                AndroidUtilities.showKeyboard((EditTextBoldCursor) obj);
                break;
            case 13:
                ((w0[]) obj)[0].dismiss();
                break;
            case 14:
                t9 t9Var = (t9) obj;
                t9Var.getClass();
                try {
                    jl0 currentListView2 = ((ia) t9Var.I0).N.getCurrentListView();
                    if (currentListView2 != null && currentListView2.getAdapter() != null) {
                        currentListView2.getAdapter().l();
                        break;
                    }
                } catch (Throwable unused2) {
                    return;
                }
                break;
            case 15:
                ye.d.s(((y9) obj).getContext(), LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 16:
                ye.d.s(((z9) obj).getContext(), LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 17:
                k3.f fVar = (k3.f) obj;
                k3.a d = fVar.d();
                fVar.l(d, 1028, new k3.d(d));
                fVar.f.d();
                break;
            case 18:
                kg.v vVar = (kg.v) ((ha.c) obj).b;
                kg.u uVar = vVar.b;
                if (uVar != null) {
                    uVar.d();
                }
                vVar.a.z7(true);
                break;
            case 19:
                ((ValueAnimator) obj).start();
                break;
            case 20:
                org.telegram.ui.ActionBar.o2 o2Var = ((kg.z) obj).b2.r;
                if (o2Var instanceof tn) {
                    o2Var.showDialog(new cg.p1(o2Var, 11, false));
                    break;
                } else {
                    org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                    if (R != null) {
                        R.showDialog(new cg.p1(o2Var, 11, false));
                        break;
                    }
                }
                break;
            case 21:
                fy fyVar = ((xw) obj).K0;
                if (!fyVar.H || !fyVar.X3().G()) {
                    fyVar.x4(true, true);
                    break;
                } else {
                    fyVar.A0.h();
                    break;
                }
                break;
            case 22:
                ((lh.b1) obj).a.t(false);
                break;
            case 23:
                lh.d1 d1Var = ((lh.c1) obj).a;
                NotificationCenter.getInstance(d1Var.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(d1Var.g()));
                break;
            case 24:
                lh.i1 i1Var = (lh.i1) obj;
                i1Var.D = false;
                i1Var.p(false);
                i1Var.P = false;
                break;
            case 25:
                ((lh.d3) obj).a.Q0();
                break;
            case 26:
                lh.d4 d4Var = ((lh.h3) obj).x;
                lh.x3 x3Var = d4Var.M1;
                if (x3Var != null) {
                    if (!d4Var.P1 && !d4Var.Q1 && !d4Var.R1) {
                        lh.i9 i9Var = ((lh.z8) x3Var).d;
                        if (!i9Var.j0.getCurrentPeerView().d1(true) && !i9Var.j0.E(true)) {
                            i9Var.q(true);
                            break;
                        }
                    } else if (d4Var.K1.e) {
                        d4Var.I2.b.loopBack();
                        break;
                    } else {
                        d4Var.S0 = 0L;
                        break;
                    }
                }
                break;
            case 27:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                    break;
                }
                break;
            case 28:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                int i19 = ProfileStoriesView.o0;
                profileStoriesView.getClass();
                AndroidUtilities.vibrateCursor(profileStoriesView);
                break;
            default:
                lh.c5.a(((lh.y4) obj).d);
                break;
        }
    }
}
