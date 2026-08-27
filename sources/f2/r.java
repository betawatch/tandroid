package f2;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.Matrix;
import androidx.recyclerview.widget.RecyclerView;
import gh.d4;
import gh.g2;
import gh.k2;
import gh.y1;
import h3.e2;
import h3.m2;
import hh.a5;
import hh.b4;
import hh.bb;
import hh.d5;
import hh.e5;
import hh.f4;
import hh.fa;
import hh.g4;
import hh.j4;
import hh.w3;
import hh.x3;
import hh.y3;
import hh.z3;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r(h3.h0 h0Var, SurfaceTexture surfaceTexture) {
        this.a = 12;
        this.b = h0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x025d A[ADDED_TO_REGION, LOOP:1: B:67:0x025d->B:68:0x025f, LOOP_START, PHI: r6
      0x025d: PHI (r6v1 int) = (r6v0 int), (r6v2 int) binds: [B:66:0x025b, B:68:0x025f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x025a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        char c10;
        boolean z10;
        int i10;
        char c11;
        switch (this.a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.b;
                if (recyclerView.getAdapter() != null) {
                    recyclerView.getAdapter().l();
                    return;
                }
                return;
            case 1:
                fh.u uVar = (fh.u) this.b;
                uVar.f();
                uVar.e(true);
                return;
            case 2:
                try {
                    ((Bitmap) this.b).recycle();
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 3:
                gf.q qVar = (gf.q) this.b;
                long j10 = qVar.b;
                if (j10 > 0) {
                    long j11 = j10 - 1;
                    qVar.b = j11;
                    qVar.a.g(j11);
                }
                if (qVar.b <= 0) {
                    qVar.c = false;
                }
                if (qVar.c) {
                    AndroidUtilities.runOnUIThread(qVar.d, 1000L);
                    return;
                }
                return;
            case 4:
                ((gg.c) this.b).f();
                return;
            case 5:
                gh.v vVar = (gh.v) this.b;
                vVar.d0.setTranslationX(vVar.c0.getAnimatedWidth() + AndroidUtilities.dp(28.0f));
                return;
            case 6:
                ((gh.p0) this.b).onBackPressed();
                return;
            case 7:
                b51 b51Var = ((k2) this.b).U;
                if (b51Var != null) {
                    b51Var.N(false);
                    return;
                }
                return;
            case 8:
                ((y1) this.b).c();
                return;
            case 9:
                g2 g2Var = (g2) this.b;
                bb bbVar = g2Var.e;
                if (bbVar != null) {
                    bbVar.d();
                    g2Var.invalidateSelf();
                    return;
                }
                return;
            case 10:
                ((d4) this.b).o();
                return;
            case 11:
                ((d5.e0) this.b).getClass();
                return;
            case 12:
                h3.k0 k0Var = ((h3.h0) this.b).a;
                k0Var.g0(null);
                k0Var.a0(0, 0);
                return;
            case 13:
                e2 e2Var = (e2) this.b;
                try {
                    synchronized (e2Var) {
                    }
                    try {
                        e2Var.a.handleMessage(e2Var.d, e2Var.e);
                        e2Var.b(true);
                        return;
                    } catch (Throwable th) {
                        e2Var.b(true);
                        throw th;
                    }
                } catch (h3.n e9) {
                    d5.a.p("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e9);
                    throw new RuntimeException(e9);
                }
            case 14:
                ((m2) this.b).d();
                return;
            case 15:
                hh.b bVar = (hh.b) this.b;
                bVar.getClass();
                new fa(bVar.getContext(), bVar.b).show();
                return;
            case 16:
                hh.q qVar2 = (hh.q) this.b;
                qVar2.getClass();
                try {
                    zk0 currentListView = qVar2.t0.B.getCurrentListView();
                    if (currentListView == null || currentListView.getAdapter() == null) {
                        return;
                    }
                    currentListView.getAdapter().l();
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            case 17:
                new ov0(((hh.g0) this.b).getContext()).show();
                return;
            case 18:
                AndroidUtilities.showKeyboard(((hh.o0) this.b).Z);
                return;
            case 19:
                AndroidUtilities.showKeyboard(((hh.t0) this.b).h);
                return;
            case 20:
                AndroidUtilities.showKeyboard(((hh.x0) this.b).c);
                return;
            case 21:
                g4 g4Var = (g4) this.b;
                g4Var.d0 = false;
                g4Var.f0 = false;
                g4Var.a(g4Var.S, g4Var.T, g4Var.U, g4Var.V);
                return;
            case 22:
                ((w3) this.b).invalidateSelf();
                return;
            case 23:
                z3 z3Var = (z3) this.b;
                y3 y3Var = z3Var.D;
                if (y3Var != null) {
                    z3 z3Var2 = y3Var.a;
                    float[] fArr = y3Var.h;
                    if (!y3Var.e && (i10 = y3Var.c) != 0) {
                        if (y3Var.l) {
                            z3Var2.a();
                        } else {
                            int b10 = m1.j.b(((x3) y3Var.b.get(i10 - 1)).a);
                            if (b10 == 1 || b10 == 2) {
                                c10 = 2;
                                z3Var2.a();
                                int i11 = y3Var.f - 1;
                                y3Var.f = i11;
                                if (i11 <= 0) {
                                    y3Var.b();
                                }
                            } else if (b10 == 3) {
                                float pow = 1.0f - ((float) Math.pow(1.0f - (1.0f - (y3Var.f / y3Var.g)), 3.0d));
                                float f10 = 1.0f - pow;
                                if (Math.abs(y3Var.j * f10) > 1.0E-4f || Math.abs(y3Var.k * f10) > 1.0E-4f) {
                                    float[] fArr2 = new float[16];
                                    c11 = 1;
                                    float f11 = y3Var.j * f10 * 0.96f;
                                    z3Var2.getClass();
                                    z3.b(1.0f, 0.0f, f11, fArr2);
                                    z3Var2.getClass();
                                    z3.d(fArr2, fArr, fArr);
                                    float f12 = y3Var.k * f10 * 0.96f;
                                    z3Var2.getClass();
                                    z3.b(0.0f, 1.0f, f12, fArr2);
                                    z3.d(fArr2, fArr, fArr);
                                } else {
                                    c11 = 1;
                                }
                                float[] fArr3 = y3Var.i;
                                float[] fArr4 = z3Var2.c;
                                for (int i12 = 0; i12 < 16; i12++) {
                                    float f13 = fArr[i12];
                                    fArr4[i12] = com.google.android.recaptcha.internal.a.z(fArr3[i12], f13, pow, f13);
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
                                z3.e(fArr5);
                                z3.c(fArr5, fArr6, fArr7);
                                z3.e(fArr7);
                                z3.c(fArr7, fArr5, fArr6);
                                fArr4[0] = fArr5[0];
                                fArr4[c11] = fArr5[c11];
                                fArr4[2] = fArr5[2];
                                fArr4[4] = fArr6[0];
                                fArr4[5] = fArr6[c11];
                                fArr4[6] = fArr6[2];
                                fArr4[8] = fArr7[0];
                                fArr4[9] = fArr7[c11];
                                fArr4[10] = fArr7[2];
                                int i13 = y3Var.f - 1;
                                y3Var.f = i13;
                                if (i13 <= 0) {
                                    System.arraycopy(y3Var.i, 0, z3Var2.c, 0, 16);
                                    z3Var2.d = 0.0f;
                                    z3Var2.e = 0.0f;
                                    y3Var.b();
                                }
                            }
                        }
                    }
                    c10 = 2;
                } else {
                    c10 = 2;
                    if (Math.abs(z3Var.d) <= 1.0E-4f && Math.abs(z3Var.e) <= 1.0E-4f) {
                        z10 = false;
                        if (z3Var.C == null ? true : z10) {
                            for (int i14 = 0; i14 < 6; i14++) {
                                Matrix.multiplyMV(z3Var.n, 0, z3Var.c, 0, z3Var.h[i14], 0);
                                z3Var.r[i14] = z3Var.n[c10];
                            }
                            Arrays.sort(z3Var.s, new ag.h(z3Var, 2));
                            z3Var.invalidate();
                        }
                        if (z3Var.isAttachedToWindow()) {
                            return;
                        }
                        AndroidUtilities.runOnUIThread(z3Var.E, 16L);
                        return;
                    }
                    z3Var.a();
                }
                z10 = true;
                if (z3Var.C == null ? true : z10) {
                }
                if (z3Var.isAttachedToWindow()) {
                }
                break;
            case 24:
                ((b4) this.b).invalidate();
                return;
            case 25:
                ((f4) this.b).invalidateSelf();
                return;
            case 26:
                e5 e5Var = (e5) this.b;
                r rVar = e5Var.e0;
                n9[] n9VarArr = e5Var.d;
                if (!n9VarArr[2 - e5Var.n0].getImageReceiver().hasImageLoaded()) {
                    AndroidUtilities.cancelRunOnUIThread(rVar);
                    AndroidUtilities.runOnUIThread(rVar, 150L);
                    return;
                }
                j4 j4Var = e5Var.Q;
                if (j4Var != null && j4Var.c == 1 && e5Var.isAttachedToWindow()) {
                    AndroidUtilities.cancelRunOnUIThread(rVar);
                    ValueAnimator valueAnimator = e5Var.d0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        e5Var.d0 = null;
                    }
                    int i15 = 1 - e5Var.n0;
                    e5Var.n0 = i15;
                    oi0 lottieAnimation = n9VarArr[2 - i15].getImageReceiver().getLottieAnimation();
                    oi0 lottieAnimation2 = n9VarArr[e5Var.n0 + 1].getImageReceiver().getLottieAnimation();
                    if (lottieAnimation2 != null && lottieAnimation != null) {
                        lottieAnimation2.Q(lottieAnimation.r(), false);
                    }
                    e5Var.S.c();
                    int i16 = e5Var.n0 + 1;
                    TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = e5Var.R;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) e5Var.U.c();
                    stargiftattributebackdropArr[i16] = stargiftattributebackdrop;
                    e5Var.e(i16, stargiftattributebackdrop);
                    e5Var.g(1, (TL_stars.starGiftAttributePattern) e5Var.T.c(), true);
                    e5Var.a();
                    float f20 = e5Var.n0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f20, f20);
                    e5Var.d0 = ofFloat;
                    ofFloat.addUpdateListener(new a5(e5Var, 2));
                    e5Var.d0.addListener(new d5(e5Var));
                    e5Var.d0.setDuration(320L);
                    e5Var.d0.setInterpolator(er.h);
                    e5Var.d0.start();
                    return;
                }
                return;
            case 27:
                ((bg.i) this.b).setPaused(true);
                return;
            case 28:
                AndroidUtilities.showKeyboard((EditTextBoldCursor) this.b);
                return;
            default:
                ((hh.x0[]) this.b)[0].dismiss();
                return;
        }
    }

    public /* synthetic */ r(h3.q0 q0Var, e2 e2Var) {
        this.a = 13;
        this.b = e2Var;
    }

    public /* synthetic */ r(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
