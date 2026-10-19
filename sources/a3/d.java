package a3;

import ai.b1;
import ai.b7;
import ai.cd;
import ai.d6;
import ai.dd;
import ai.e6;
import ai.e7;
import ai.f7;
import ai.h1;
import ai.h6;
import ai.j7;
import ai.k7;
import ai.l1;
import ai.md;
import ai.t5;
import ai.u5;
import ai.v5;
import ai.w5;
import ai.wc;
import ai.x5;
import ai.z5;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.opengl.Matrix;
import android.os.Trace;
import com.google.android.gms.internal.play_billing.k3;
import java.nio.MappedByteBuffer;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.zw0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.t7;
import org.telegram.ui.Wallet.v4;
import org.telegram.ui.Wallet.w4;
import org.telegram.ui.qn;
import sg.y0;
import v7.y7;
import v7.z7;
import w7.d8;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:172:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0386  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        char c10;
        char c11;
        char c12;
        int i10;
        int i11 = 2;
        int i12 = 0;
        switch (this.a) {
            case 0:
                ((f) this.b).h.U();
                return;
            case 1:
                ((w) this.b).m--;
                return;
            case 2:
                r0.a.postVsyncCallback((e0) this.b);
                return;
            case 3:
                ah.f0 f0Var = (ah.f0) ((qb.c) this.b).b;
                ah.e0 e0Var = f0Var.b;
                if (e0Var != null) {
                    e0Var.d();
                }
                f0Var.a.C7(true);
                return;
            case 4:
                ((ValueAnimator) this.b).start();
                return;
            case 5:
                n2 n2Var = ((ah.n0) this.b).f2.r;
                if (n2Var instanceof qn) {
                    n2Var.showDialog(new y0(n2Var, 11, false));
                    return;
                }
                n2 R = LaunchActivity.R();
                if (R != null) {
                    R.showDialog(new y0(n2Var, 11, false));
                    return;
                }
                return;
            case 6:
                ai.c cVar = (ai.c) this.b;
                cVar.getClass();
                new dd(cVar.getContext(), cVar.b).show();
                return;
            case 7:
                ai.w wVar = (ai.w) this.b;
                wVar.getClass();
                try {
                    im0 currentListView = wVar.x0.F.getCurrentListView();
                    if (currentListView == null || currentListView.getAdapter() == null) {
                        return;
                    }
                    currentListView.getAdapter().l();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 8:
                new zw0(((ai.o0) this.b).getContext()).show();
                return;
            case 9:
                AndroidUtilities.showKeyboard(((b1) this.b).d0);
                return;
            case 10:
                AndroidUtilities.showKeyboard(((h1) this.b).h);
                return;
            case 11:
                AndroidUtilities.showKeyboard(((l1) this.b).c);
                return;
            case 12:
                v4 v4Var = (v4) ((k7) this.b);
                t7 t7Var = v4Var.c.i0;
                if (t7Var != null) {
                    TL_wallet.nftItem nftitem = v4Var.b;
                    if (t7Var.A()) {
                        t7Var.c0(t7Var.v(nftitem));
                        return;
                    }
                    return;
                }
                return;
            case 13:
                w4 w4Var = (w4) ((j7) this.b);
                t7 t7Var2 = w4Var.b.i0;
                if (t7Var2 != null) {
                    t7Var2.b0(w4Var.a);
                    return;
                }
                return;
            case 14:
                e6 e6Var = (e6) this.b;
                e6Var.h0 = false;
                e6Var.j0 = false;
                e6Var.a(e6Var.W, e6Var.a0, e6Var.b0, e6Var.c0);
                return;
            case 15:
                ((t5) this.b).invalidateSelf();
                return;
            case 16:
                x5 x5Var = (x5) this.b;
                w5 w5Var = x5Var.H;
                if (w5Var != null) {
                    x5 x5Var2 = w5Var.a;
                    float[] fArr = w5Var.h;
                    if (!w5Var.e && (i10 = w5Var.c) != 0) {
                        if (w5Var.l) {
                            x5Var2.a();
                        } else {
                            int c13 = m1.j.c(((v5) w5Var.b.get(i10 - 1)).a);
                            if (c13 == 1 || c13 == 2) {
                                c10 = 2;
                                c11 = 1;
                                x5Var2.a();
                                int i13 = w5Var.f - 1;
                                w5Var.f = i13;
                                if (i13 <= 0) {
                                    w5Var.b();
                                }
                            } else if (c13 == 3) {
                                char c14 = 2;
                                float pow = 1.0f - ((float) Math.pow(1.0f - (1.0f - (w5Var.f / w5Var.g)), 3.0d));
                                float f7 = 1.0f - pow;
                                if (Math.abs(w5Var.j * f7) > 1.0E-4f || Math.abs(w5Var.k * f7) > 1.0E-4f) {
                                    float[] fArr2 = new float[16];
                                    c11 = 1;
                                    float f10 = w5Var.j * f7 * 0.96f;
                                    x5Var2.getClass();
                                    x5.b(1.0f, 0.0f, f10, fArr2);
                                    x5Var2.getClass();
                                    x5.d(fArr2, fArr, fArr);
                                    float f11 = w5Var.k * f7 * 0.96f;
                                    x5Var2.getClass();
                                    x5.b(0.0f, 1.0f, f11, fArr2);
                                    x5.d(fArr2, fArr, fArr);
                                } else {
                                    c11 = 1;
                                }
                                float[] fArr3 = w5Var.i;
                                float[] fArr4 = x5Var2.c;
                                int i14 = 0;
                                while (i14 < 16) {
                                    float f12 = fArr[i14];
                                    fArr4[i14] = k3.y(fArr3[i14], f12, pow, f12);
                                    i14++;
                                    c14 = c14;
                                }
                                c10 = c14;
                                float f13 = fArr4[0];
                                float f14 = fArr4[c11];
                                float f15 = fArr4[c10];
                                float[] fArr5 = new float[3];
                                fArr5[0] = f13;
                                fArr5[c11] = f14;
                                fArr5[c10] = f15;
                                float f16 = fArr4[4];
                                float f17 = fArr4[5];
                                float f18 = fArr4[6];
                                float[] fArr6 = new float[3];
                                fArr6[0] = f16;
                                fArr6[c11] = f17;
                                fArr6[c10] = f18;
                                float[] fArr7 = new float[3];
                                x5.e(fArr5);
                                x5.c(fArr5, fArr6, fArr7);
                                x5.e(fArr7);
                                x5.c(fArr7, fArr5, fArr6);
                                fArr4[0] = fArr5[0];
                                fArr4[c11] = fArr5[c11];
                                fArr4[c10] = fArr5[c10];
                                fArr4[4] = fArr6[0];
                                fArr4[5] = fArr6[c11];
                                fArr4[6] = fArr6[c10];
                                fArr4[8] = fArr7[0];
                                fArr4[9] = fArr7[c11];
                                fArr4[10] = fArr7[c10];
                                int i15 = w5Var.f - 1;
                                w5Var.f = i15;
                                if (i15 <= 0) {
                                    System.arraycopy(w5Var.i, 0, x5Var2.c, 0, 16);
                                    x5Var2.d = 0.0f;
                                    x5Var2.e = 0.0f;
                                    w5Var.b();
                                }
                            }
                        }
                    }
                    c10 = 2;
                    c11 = 1;
                } else {
                    c10 = 2;
                    c11 = 1;
                    if (Math.abs(x5Var.d) <= 1.0E-4f && Math.abs(x5Var.e) <= 1.0E-4f) {
                        c12 = 0;
                        if ((x5Var.G == null ? c11 : c12) != 0) {
                            for (int i16 = 0; i16 < 6; i16++) {
                                Matrix.multiplyMV(x5Var.n, 0, x5Var.c, 0, x5Var.h[i16], 0);
                                x5Var.r[i16] = x5Var.n[c10];
                            }
                            Arrays.sort(x5Var.s, new u5(x5Var, i12));
                            x5Var.invalidate();
                        }
                        if (x5Var.isAttachedToWindow()) {
                            return;
                        }
                        AndroidUtilities.runOnUIThread(x5Var.I, 16L);
                        return;
                    }
                    x5Var.a();
                }
                c12 = c11;
                if ((x5Var.G == null ? c11 : c12) != 0) {
                }
                if (x5Var.isAttachedToWindow()) {
                }
                break;
            case 17:
                ((z5) this.b).invalidate();
                return;
            case 18:
                ((d6) this.b).invalidateSelf();
                return;
            case 19:
                f7 f7Var = (f7) this.b;
                d dVar = f7Var.l0;
                w9[] w9VarArr = f7Var.d;
                if (!w9VarArr[2 - f7Var.u0].getImageReceiver().hasImageLoaded()) {
                    AndroidUtilities.cancelRunOnUIThread(dVar);
                    AndroidUtilities.runOnUIThread(dVar, 150L);
                    return;
                }
                h6 h6Var = f7Var.a0;
                if (h6Var != null && h6Var.c == 1 && f7Var.isAttachedToWindow()) {
                    AndroidUtilities.cancelRunOnUIThread(dVar);
                    ValueAnimator valueAnimator = f7Var.k0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        f7Var.k0 = null;
                    }
                    int i17 = 1 - f7Var.u0;
                    f7Var.u0 = i17;
                    uj0 lottieAnimation = w9VarArr[2 - i17].getImageReceiver().getLottieAnimation();
                    uj0 lottieAnimation2 = w9VarArr[f7Var.u0 + 1].getImageReceiver().getLottieAnimation();
                    if (lottieAnimation2 != null && lottieAnimation != null) {
                        lottieAnimation2.T(lottieAnimation.t(), false);
                    }
                    f7Var.c0.c();
                    int i18 = f7Var.u0 + 1;
                    TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = f7Var.b0;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) f7Var.e0.c();
                    stargiftattributebackdropArr[i18] = stargiftattributebackdrop;
                    f7Var.e(i18, stargiftattributebackdrop);
                    f7Var.g(1, (TL_stars.starGiftAttributePattern) f7Var.d0.c(), true);
                    f7Var.a();
                    float f19 = f7Var.u0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f19, f19);
                    f7Var.k0 = ofFloat;
                    ofFloat.addUpdateListener(new b7(f7Var, i11));
                    f7Var.k0.addListener(new e7(f7Var));
                    f7Var.k0.setDuration(320L);
                    f7Var.k0.setInterpolator(bs.h);
                    f7Var.k0.start();
                    return;
                }
                return;
            case 20:
                ((tg.n) this.b).setPaused(true);
                return;
            case 21:
                AndroidUtilities.showKeyboard((EditTextBoldCursor) this.b);
                return;
            case 22:
                ((l1[]) this.b)[0].dismiss();
                return;
            case 23:
                wc wcVar = (wc) this.b;
                wcVar.getClass();
                try {
                    im0 currentListView2 = ((md) wcVar.M0).R.getCurrentListView();
                    if (currentListView2 == null || currentListView2.getAdapter() == null) {
                        return;
                    }
                    currentListView2.getAdapter().l();
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            case 24:
                pf.d.r(((cd) this.b).getContext(), LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 25:
                pf.d.r(((dd) this.b).getContext(), LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 26:
                ((androidx.activity.m) this.b).invalidateOptionsMenu();
                return;
            case 27:
                androidx.activity.l lVar = (androidx.activity.l) this.b;
                Runnable runnable = lVar.b;
                if (runnable != null) {
                    runnable.run();
                    lVar.b = null;
                    return;
                }
                return;
            case 28:
                androidx.activity.n.a((androidx.activity.n) this.b);
                return;
            default:
                androidx.emoji2.text.q qVar = (androidx.emoji2.text.q) this.b;
                synchronized (qVar.d) {
                    try {
                        if (qVar.h == null) {
                            return;
                        }
                        try {
                            o0.h d = qVar.d();
                            int i19 = d.e;
                            if (i19 == 2) {
                                synchronized (qVar.d) {
                                }
                            }
                            if (i19 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i19 + ")");
                            }
                            try {
                                int i20 = n0.g.a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                sb.a aVar = qVar.c;
                                Context context = qVar.a;
                                aVar.getClass();
                                o0.h[] hVarArr = {d};
                                y7 y7Var = i0.e.a;
                                d8.a("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface b10 = i0.e.a.b(context, hVarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer e = z7.e(qVar.a, d.a);
                                    if (e == null || b10 == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        qi.e eVar = new qi.e(b10, v7.u.a(e));
                                        Trace.endSection();
                                        synchronized (qVar.d) {
                                            try {
                                                v7.t tVar = qVar.h;
                                                if (tVar != null) {
                                                    tVar.b(eVar);
                                                }
                                            } finally {
                                            }
                                        }
                                        qVar.b();
                                        return;
                                    } finally {
                                        int i21 = n0.g.a;
                                    }
                                } finally {
                                    Trace.endSection();
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        } catch (Throwable th3) {
                            synchronized (qVar.d) {
                                try {
                                    v7.t tVar2 = qVar.h;
                                    if (tVar2 != null) {
                                        tVar2.a(th3);
                                    }
                                    qVar.b();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
        }
    }
}
