package fh;

import android.animation.ValueAnimator;
import android.graphics.SurfaceTexture;
import android.opengl.Matrix;
import gh.bb;
import gh.ea;
import gh.fa;
import gh.oa;
import gh.z9;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.mv0;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class o1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o1(h3.h0 h0Var, SurfaceTexture surfaceTexture) {
        this.a = 23;
        this.b = h0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x030c A[ADDED_TO_REGION, LOOP:1: B:116:0x030c->B:117:0x030e, LOOP_START, PHI: r6
      0x030c: PHI (r6v1 int) = (r6v0 int), (r6v2 int) binds: [B:115:0x030a, B:117:0x030e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        char c10;
        boolean z10;
        int i9;
        char c11;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                z41 z41Var = ((p2) obj).U;
                if (z41Var != null) {
                    z41Var.N(false);
                    return;
                }
                return;
            case 1:
                ((b2) obj).c();
                return;
            case 2:
                k2 k2Var = (k2) obj;
                bb bbVar = k2Var.e;
                if (bbVar != null) {
                    bbVar.d();
                    k2Var.invalidateSelf();
                    return;
                }
                return;
            case 3:
                ((j4) obj).o();
                return;
            case 4:
                gh.b bVar = (gh.b) obj;
                bVar.getClass();
                new fa(bVar.getContext(), bVar.b).show();
                return;
            case 5:
                gh.q qVar = (gh.q) obj;
                qVar.getClass();
                try {
                    wk0 currentListView = qVar.t0.B.getCurrentListView();
                    if (currentListView == null || currentListView.getAdapter() == null) {
                        return;
                    }
                    currentListView.getAdapter().l();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 6:
                new mv0(((gh.g0) obj).getContext()).show();
                return;
            case 7:
                AndroidUtilities.showKeyboard(((gh.o0) obj).Z);
                return;
            case 8:
                AndroidUtilities.showKeyboard(((gh.t0) obj).h);
                return;
            case 9:
                AndroidUtilities.showKeyboard(((gh.x0) obj).c);
                return;
            case 10:
                gh.i4 i4Var = (gh.i4) obj;
                i4Var.d0 = false;
                i4Var.f0 = false;
                i4Var.a(i4Var.S, i4Var.T, i4Var.U, i4Var.V);
                return;
            case 11:
                ((gh.y3) obj).invalidateSelf();
                return;
            case 12:
                gh.b4 b4Var = (gh.b4) obj;
                gh.a4 a4Var = b4Var.D;
                if (a4Var != null) {
                    gh.b4 b4Var2 = a4Var.a;
                    float[] fArr = a4Var.h;
                    if (!a4Var.e && (i9 = a4Var.c) != 0) {
                        if (a4Var.l) {
                            b4Var2.a();
                        } else {
                            int b10 = m1.j.b(((gh.z3) a4Var.b.get(i9 - 1)).a);
                            if (b10 == 1 || b10 == 2) {
                                c10 = 2;
                                b4Var2.a();
                                int i11 = a4Var.f - 1;
                                a4Var.f = i11;
                                if (i11 <= 0) {
                                    a4Var.b();
                                }
                            } else if (b10 == 3) {
                                float pow = 1.0f - ((float) Math.pow(1.0f - (1.0f - (a4Var.f / a4Var.g)), 3.0d));
                                float f10 = 1.0f - pow;
                                if (Math.abs(a4Var.j * f10) > 1.0E-4f || Math.abs(a4Var.k * f10) > 1.0E-4f) {
                                    float[] fArr2 = new float[16];
                                    c11 = 1;
                                    float f11 = a4Var.j * f10 * 0.96f;
                                    b4Var2.getClass();
                                    gh.b4.b(1.0f, 0.0f, f11, fArr2);
                                    b4Var2.getClass();
                                    gh.b4.d(fArr2, fArr, fArr);
                                    float f12 = a4Var.k * f10 * 0.96f;
                                    b4Var2.getClass();
                                    gh.b4.b(0.0f, 1.0f, f12, fArr2);
                                    gh.b4.d(fArr2, fArr, fArr);
                                } else {
                                    c11 = 1;
                                }
                                float[] fArr3 = a4Var.i;
                                float[] fArr4 = b4Var2.c;
                                for (int i12 = 0; i12 < 16; i12++) {
                                    float f13 = fArr[i12];
                                    fArr4[i12] = e2.c.z(fArr3[i12], f13, pow, f13);
                                }
                                c10 = 2;
                                float f14 = fArr4[0];
                                float f15 = fArr4[c11];
                                float f16 = fArr4[2];
                                float[] fArr5 = new float[3];
                                fArr5[0] = f14;
                                fArr5[c11] = f15;
                                fArr5[2] = f16;
                                float f17 = fArr4[4];
                                float f18 = fArr4[5];
                                float f19 = fArr4[6];
                                float[] fArr6 = new float[3];
                                fArr6[0] = f17;
                                fArr6[c11] = f18;
                                fArr6[2] = f19;
                                float[] fArr7 = new float[3];
                                gh.b4.e(fArr5);
                                gh.b4.c(fArr5, fArr6, fArr7);
                                gh.b4.e(fArr7);
                                gh.b4.c(fArr7, fArr5, fArr6);
                                fArr4[0] = fArr5[0];
                                fArr4[c11] = fArr5[c11];
                                fArr4[2] = fArr5[2];
                                fArr4[4] = fArr6[0];
                                fArr4[5] = fArr6[c11];
                                fArr4[6] = fArr6[2];
                                fArr4[8] = fArr7[0];
                                fArr4[9] = fArr7[c11];
                                fArr4[10] = fArr7[2];
                                int i13 = a4Var.f - 1;
                                a4Var.f = i13;
                                if (i13 <= 0) {
                                    System.arraycopy(a4Var.i, 0, b4Var2.c, 0, 16);
                                    b4Var2.d = 0.0f;
                                    b4Var2.e = 0.0f;
                                    a4Var.b();
                                }
                            }
                        }
                    }
                    c10 = 2;
                } else {
                    c10 = 2;
                    if (Math.abs(b4Var.d) <= 1.0E-4f && Math.abs(b4Var.e) <= 1.0E-4f) {
                        z10 = false;
                        if (b4Var.C != null) {
                            z10 = true;
                        }
                        if (z10) {
                            for (int i14 = 0; i14 < 6; i14++) {
                                Matrix.multiplyMV(b4Var.n, 0, b4Var.c, 0, b4Var.h[i14], 0);
                                b4Var.r[i14] = b4Var.n[c10];
                            }
                            Arrays.sort(b4Var.s, new bg.l0(b4Var, 1));
                            b4Var.invalidate();
                        }
                        if (b4Var.isAttachedToWindow()) {
                            return;
                        }
                        AndroidUtilities.runOnUIThread(b4Var.E, 16L);
                        return;
                    }
                    b4Var.a();
                }
                z10 = true;
                if (b4Var.C != null) {
                }
                if (z10) {
                }
                if (b4Var.isAttachedToWindow()) {
                }
                break;
            case 13:
                ((gh.d4) obj).invalidate();
                return;
            case 14:
                ((gh.h4) obj).invalidateSelf();
                return;
            case 15:
                gh.g5 g5Var = (gh.g5) obj;
                o1 o1Var = g5Var.e0;
                o9[] o9VarArr = g5Var.d;
                if (!o9VarArr[2 - g5Var.n0].getImageReceiver().hasImageLoaded()) {
                    AndroidUtilities.cancelRunOnUIThread(o1Var);
                    AndroidUtilities.runOnUIThread(o1Var, 150L);
                    return;
                }
                gh.l4 l4Var = g5Var.Q;
                if (l4Var != null && l4Var.c == 1 && g5Var.isAttachedToWindow()) {
                    AndroidUtilities.cancelRunOnUIThread(o1Var);
                    ValueAnimator valueAnimator = g5Var.d0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        g5Var.d0 = null;
                    }
                    int i15 = 1 - g5Var.n0;
                    g5Var.n0 = i15;
                    mi0 lottieAnimation = o9VarArr[2 - i15].getImageReceiver().getLottieAnimation();
                    mi0 lottieAnimation2 = o9VarArr[g5Var.n0 + 1].getImageReceiver().getLottieAnimation();
                    if (lottieAnimation2 != null && lottieAnimation != null) {
                        lottieAnimation2.Q(lottieAnimation.r(), false);
                    }
                    g5Var.S.c();
                    int i16 = g5Var.n0 + 1;
                    TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = g5Var.R;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) g5Var.U.c();
                    stargiftattributebackdropArr[i16] = stargiftattributebackdrop;
                    g5Var.e(i16, stargiftattributebackdrop);
                    g5Var.g(1, (TL_stars.starGiftAttributePattern) g5Var.T.c(), true);
                    g5Var.a();
                    float f20 = g5Var.n0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f20, f20);
                    g5Var.d0 = ofFloat;
                    ofFloat.addUpdateListener(new gh.c5(g5Var, 2));
                    g5Var.d0.addListener(new gh.f5(g5Var));
                    g5Var.d0.setDuration(320L);
                    g5Var.d0.setInterpolator(gr.h);
                    g5Var.d0.start();
                    return;
                }
                return;
            case 16:
                ((ag.j) obj).setPaused(true);
                return;
            case 17:
                AndroidUtilities.showKeyboard((EditTextBoldCursor) obj);
                return;
            case 18:
                ((gh.x0[]) obj)[0].dismiss();
                return;
            case 19:
                z9 z9Var = (z9) obj;
                z9Var.getClass();
                try {
                    wk0 currentListView2 = ((oa) z9Var.I0).N.getCurrentListView();
                    if (currentListView2 == null || currentListView2.getAdapter() == null) {
                        return;
                    }
                    currentListView2.getAdapter().l();
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            case 20:
                ve.e.s(((ea) obj).getContext(), LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 21:
                ve.e.s(((fa) obj).getContext(), LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 22:
                ((d5.d0) obj).getClass();
                return;
            case 23:
                h3.k0 k0Var = ((h3.h0) obj).a;
                k0Var.g0(null);
                k0Var.a0(0, 0);
                return;
            case 24:
                try {
                    h3.q0.b((h3.e2) obj);
                    return;
                } catch (h3.n e10) {
                    d5.a.p("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
                    throw new RuntimeException(e10);
                }
            case 25:
                ((h3.m2) obj).d();
                return;
            case 26:
                hg.v vVar = (hg.v) ((xa.c) obj).b;
                hg.u uVar = vVar.b;
                if (uVar != null) {
                    uVar.d();
                }
                vVar.a.z7(true);
                return;
            case 27:
                ((ValueAnimator) obj).start();
                return;
            case 28:
                org.telegram.ui.ActionBar.o2 o2Var = ((hg.z) obj).b2.r;
                if (o2Var instanceof qn) {
                    o2Var.showDialog(new zf.x0(o2Var, 11, false));
                    return;
                }
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != null) {
                    R.showDialog(new zf.x0(o2Var, 11, false));
                    return;
                }
                return;
            default:
                i3.f fVar = (i3.f) obj;
                i3.a a2 = fVar.a();
                fVar.l(a2, 1028, new i3.d(a2));
                fVar.f.d();
                return;
        }
    }

    public /* synthetic */ o1(h3.q0 q0Var, h3.e2 e2Var) {
        this.a = 24;
        this.b = e2Var;
    }

    public /* synthetic */ o1(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }
}
