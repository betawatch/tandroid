package lh;

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
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.ix;
import org.telegram.ui.qy;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x037d A[ADDED_TO_REGION, LOOP:1: B:146:0x037d->B:147:0x037f, LOOP_START, PHI: r4
      0x037d: PHI (r4v1 int) = (r4v0 int), (r4v2 int) binds: [B:145:0x037b, B:147:0x037f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x037a  */
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
                c cVar = (c) obj;
                cVar.getClass();
                new aa(cVar.getContext(), cVar.b).show();
                break;
            case 1:
                p pVar = (p) obj;
                pVar.getClass();
                try {
                    rl0 currentListView = pVar.u0.C.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        break;
                    }
                } catch (Throwable unused) {
                    return;
                }
                break;
            case 2:
                new fw0(((f0) obj).getContext()).show();
                break;
            case 3:
                AndroidUtilities.showKeyboard(((n0) obj).a0);
                break;
            case 4:
                AndroidUtilities.showKeyboard(((s0) obj).h);
                break;
            case 5:
                AndroidUtilities.showKeyboard(((w0) obj).c);
                break;
            case 6:
                f4 f4Var = (f4) obj;
                f4Var.e0 = false;
                f4Var.g0 = false;
                f4Var.a(f4Var.T, f4Var.U, f4Var.V, f4Var.W);
                break;
            case 7:
                ((v3) obj).invalidateSelf();
                break;
            case 8:
                y3 y3Var = (y3) obj;
                x3 x3Var = y3Var.E;
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
                    y3 y3Var2 = x3Var.a;
                    float[] fArr = x3Var.h;
                    if (!x3Var.e && (i10 = x3Var.c) != 0) {
                        if (x3Var.l) {
                            y3Var2.a();
                        } else {
                            int c10 = m1.j.c(((w3) x3Var.b.get(i10 - 1)).a);
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
                                    y3.b(1.0f, 0.0f, f11, fArr2);
                                    y3Var2.getClass();
                                    y3.d(fArr2, fArr, fArr);
                                    float f12 = x3Var.k * f10 * 0.96f;
                                    y3Var2.getClass();
                                    y3.b(0.0f, 1.0f, f12, fArr2);
                                    y3.d(fArr2, fArr, fArr);
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
                                y3.e(fArr5);
                                y3.c(fArr5, fArr6, fArr7);
                                y3.e(fArr7);
                                y3.c(fArr7, fArr5, fArr6);
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
            case 9:
                ((a4) obj).invalidate();
                break;
            case 10:
                ((e4) obj).invalidateSelf();
                break;
            case 11:
                c5 c5Var = (c5) obj;
                b bVar = c5Var.f0;
                org.telegram.ui.Components.p9[] p9VarArr = c5Var.d;
                if (!p9VarArr[2 - c5Var.o0].getImageReceiver().hasImageLoaded()) {
                    AndroidUtilities.cancelRunOnUIThread(bVar);
                    AndroidUtilities.runOnUIThread(bVar, 150L);
                    break;
                } else {
                    c5.d dVar = c5Var.R;
                    if (dVar != null && dVar.b == 1 && c5Var.isAttachedToWindow()) {
                        AndroidUtilities.cancelRunOnUIThread(bVar);
                        ValueAnimator valueAnimator = c5Var.e0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            c5Var.e0 = null;
                        }
                        int i17 = 1 - c5Var.o0;
                        c5Var.o0 = i17;
                        gj0 lottieAnimation = p9VarArr[2 - i17].getImageReceiver().getLottieAnimation();
                        gj0 lottieAnimation2 = p9VarArr[c5Var.o0 + 1].getImageReceiver().getLottieAnimation();
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
                        ofFloat.addUpdateListener(new y4(c5Var, 2));
                        c5Var.e0.addListener(new b5(c5Var));
                        c5Var.e0.setDuration(320L);
                        c5Var.e0.setInterpolator(mr.h);
                        c5Var.e0.start();
                        break;
                    }
                }
                break;
            case 12:
                ((fg.i) obj).setPaused(true);
                break;
            case 13:
                AndroidUtilities.showKeyboard((EditTextBoldCursor) obj);
                break;
            case 14:
                ((w0[]) obj)[0].dismiss();
                break;
            case 15:
                u9 u9Var = (u9) obj;
                u9Var.getClass();
                try {
                    rl0 currentListView2 = ((ja) u9Var.J0).O.getCurrentListView();
                    if (currentListView2 != null && currentListView2.getAdapter() != null) {
                        currentListView2.getAdapter().l();
                        break;
                    }
                } catch (Throwable unused2) {
                    return;
                }
                break;
            case 16:
                ze.d.s(((z9) obj).getContext(), LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 17:
                ze.d.s(((aa) obj).getContext(), LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 18:
                mg.v vVar = (mg.v) ((o5.i) obj).b;
                mg.u uVar = vVar.b;
                if (uVar != null) {
                    uVar.d();
                }
                vVar.a.z7(true);
                break;
            case 19:
                ((ValueAnimator) obj).start();
                break;
            case 20:
                org.telegram.ui.ActionBar.p2 p2Var = ((mg.z) obj).c2.r;
                if (p2Var instanceof zn) {
                    p2Var.showDialog(new eg.o1(p2Var, 11, false));
                    break;
                } else {
                    org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                    if (R != null) {
                        R.showDialog(new eg.o1(p2Var, 11, false));
                        break;
                    }
                }
                break;
            case 21:
                qy qyVar = ((ix) obj).L0;
                if (!qyVar.I || !qyVar.X3().G()) {
                    qyVar.x4(true, true);
                    break;
                } else {
                    qyVar.B0.h();
                    break;
                }
                break;
            case 22:
                ((nh.c1) obj).a.t(false);
                break;
            case 23:
                nh.e1 e1Var = ((nh.d1) obj).a;
                NotificationCenter.getInstance(e1Var.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(e1Var.g()));
                break;
            case 24:
                nh.j1 j1Var = (nh.j1) obj;
                j1Var.E = false;
                j1Var.p(false);
                j1Var.Q = false;
                break;
            case 25:
                ((nh.e3) obj).a.Q0();
                break;
            case 26:
                nh.d4 d4Var = ((nh.i3) obj).x;
                nh.x3 x3Var2 = d4Var.N1;
                if (x3Var2 != null) {
                    if (!d4Var.Q1 && !d4Var.R1 && !d4Var.S1) {
                        nh.i9 i9Var = ((nh.z8) x3Var2).d;
                        if (!i9Var.k0.getCurrentPeerView().d1(true) && !i9Var.k0.E(true)) {
                            i9Var.q(true);
                            break;
                        }
                    } else if (d4Var.L1.e) {
                        d4Var.J2.b.loopBack();
                        break;
                    } else {
                        d4Var.T0 = 0L;
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
                int i19 = ProfileStoriesView.p0;
                profileStoriesView.getClass();
                AndroidUtilities.vibrateCursor(profileStoriesView);
                break;
            default:
                nh.d5.a(((nh.z4) obj).d);
                break;
        }
    }
}
