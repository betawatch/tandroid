package a3;

import ai.a7;
import ai.b1;
import ai.c6;
import ai.cd;
import ai.d6;
import ai.d7;
import ai.dd;
import ai.e7;
import ai.g6;
import ai.h1;
import ai.i7;
import ai.j7;
import ai.l1;
import ai.md;
import ai.s5;
import ai.t5;
import ai.u5;
import ai.v5;
import ai.w5;
import ai.wc;
import ai.y5;
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
import org.telegram.ui.Components.yw0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.t4;
import org.telegram.ui.Wallet.u4;
import org.telegram.ui.Wallet.z7;
import org.telegram.ui.sn;
import sg.x0;
import v7.y7;
import w7.e8;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
                ah.f0 f0Var = (ah.f0) ((a6.m) this.b).b;
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
                if (n2Var instanceof sn) {
                    n2Var.showDialog(new x0(n2Var, 11, false));
                    return;
                }
                n2 R = LaunchActivity.R();
                if (R != null) {
                    R.showDialog(new x0(n2Var, 11, false));
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
                new yw0(((ai.o0) this.b).getContext()).show();
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
                t4 t4Var = (t4) ((j7) this.b);
                z7 z7Var = t4Var.c.k0;
                if (z7Var != null) {
                    TL_wallet.nftItem nftitem = t4Var.b;
                    if (z7Var.C()) {
                        z7Var.e0(z7Var.v(nftitem));
                        return;
                    }
                    return;
                }
                return;
            case 13:
                u4 u4Var = (u4) ((i7) this.b);
                z7 z7Var2 = u4Var.b.k0;
                if (z7Var2 != null) {
                    z7Var2.d0(u4Var.a);
                    return;
                }
                return;
            case 14:
                d6 d6Var = (d6) this.b;
                d6Var.h0 = false;
                d6Var.j0 = false;
                d6Var.a(d6Var.W, d6Var.a0, d6Var.b0, d6Var.c0);
                return;
            case 15:
                ((s5) this.b).invalidateSelf();
                return;
            case 16:
                w5 w5Var = (w5) this.b;
                v5 v5Var = w5Var.H;
                if (v5Var != null) {
                    w5 w5Var2 = v5Var.a;
                    float[] fArr = v5Var.h;
                    if (!v5Var.e && (i10 = v5Var.c) != 0) {
                        if (v5Var.l) {
                            w5Var2.a();
                        } else {
                            int c13 = m1.j.c(((u5) v5Var.b.get(i10 - 1)).a);
                            if (c13 == 1 || c13 == 2) {
                                c10 = 2;
                                c11 = 1;
                                w5Var2.a();
                                int i13 = v5Var.f - 1;
                                v5Var.f = i13;
                                if (i13 <= 0) {
                                    v5Var.b();
                                }
                            } else if (c13 == 3) {
                                char c14 = 2;
                                float pow = 1.0f - ((float) Math.pow(1.0f - (1.0f - (v5Var.f / v5Var.g)), 3.0d));
                                float f7 = 1.0f - pow;
                                if (Math.abs(v5Var.j * f7) > 1.0E-4f || Math.abs(v5Var.k * f7) > 1.0E-4f) {
                                    float[] fArr2 = new float[16];
                                    c11 = 1;
                                    float f10 = v5Var.j * f7 * 0.96f;
                                    w5Var2.getClass();
                                    w5.b(1.0f, 0.0f, f10, fArr2);
                                    w5Var2.getClass();
                                    w5.d(fArr2, fArr, fArr);
                                    float f11 = v5Var.k * f7 * 0.96f;
                                    w5Var2.getClass();
                                    w5.b(0.0f, 1.0f, f11, fArr2);
                                    w5.d(fArr2, fArr, fArr);
                                } else {
                                    c11 = 1;
                                }
                                float[] fArr3 = v5Var.i;
                                float[] fArr4 = w5Var2.c;
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
                                w5.e(fArr5);
                                w5.c(fArr5, fArr6, fArr7);
                                w5.e(fArr7);
                                w5.c(fArr7, fArr5, fArr6);
                                fArr4[0] = fArr5[0];
                                fArr4[c11] = fArr5[c11];
                                fArr4[c10] = fArr5[c10];
                                fArr4[4] = fArr6[0];
                                fArr4[5] = fArr6[c11];
                                fArr4[6] = fArr6[c10];
                                fArr4[8] = fArr7[0];
                                fArr4[9] = fArr7[c11];
                                fArr4[10] = fArr7[c10];
                                int i15 = v5Var.f - 1;
                                v5Var.f = i15;
                                if (i15 <= 0) {
                                    System.arraycopy(v5Var.i, 0, w5Var2.c, 0, 16);
                                    w5Var2.d = 0.0f;
                                    w5Var2.e = 0.0f;
                                    v5Var.b();
                                }
                            }
                        }
                    }
                    c10 = 2;
                    c11 = 1;
                } else {
                    c10 = 2;
                    c11 = 1;
                    if (Math.abs(w5Var.d) <= 1.0E-4f && Math.abs(w5Var.e) <= 1.0E-4f) {
                        c12 = 0;
                        if ((w5Var.G == null ? c11 : c12) != 0) {
                            for (int i16 = 0; i16 < 6; i16++) {
                                Matrix.multiplyMV(w5Var.n, 0, w5Var.c, 0, w5Var.h[i16], 0);
                                w5Var.r[i16] = w5Var.n[c10];
                            }
                            Arrays.sort(w5Var.s, new t5(w5Var, i12));
                            w5Var.invalidate();
                        }
                        if (w5Var.isAttachedToWindow()) {
                            return;
                        }
                        AndroidUtilities.runOnUIThread(w5Var.I, 16L);
                        return;
                    }
                    w5Var.a();
                }
                c12 = c11;
                if ((w5Var.G == null ? c11 : c12) != 0) {
                }
                if (w5Var.isAttachedToWindow()) {
                }
                break;
            case 17:
                ((y5) this.b).invalidate();
                return;
            case 18:
                ((c6) this.b).invalidateSelf();
                return;
            case 19:
                e7 e7Var = (e7) this.b;
                d dVar = e7Var.j0;
                w9[] w9VarArr = e7Var.d;
                if (!w9VarArr[2 - e7Var.s0].getImageReceiver().hasImageLoaded()) {
                    AndroidUtilities.cancelRunOnUIThread(dVar);
                    AndroidUtilities.runOnUIThread(dVar, 150L);
                    return;
                }
                g6 g6Var = e7Var.V;
                if (g6Var != null && g6Var.c == 1 && e7Var.isAttachedToWindow()) {
                    AndroidUtilities.cancelRunOnUIThread(dVar);
                    ValueAnimator valueAnimator = e7Var.i0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        e7Var.i0 = null;
                    }
                    int i17 = 1 - e7Var.s0;
                    e7Var.s0 = i17;
                    uj0 lottieAnimation = w9VarArr[2 - i17].getImageReceiver().getLottieAnimation();
                    uj0 lottieAnimation2 = w9VarArr[e7Var.s0 + 1].getImageReceiver().getLottieAnimation();
                    if (lottieAnimation2 != null && lottieAnimation != null) {
                        lottieAnimation2.T(lottieAnimation.t(), false);
                    }
                    e7Var.a0.c();
                    int i18 = e7Var.s0 + 1;
                    TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = e7Var.W;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) e7Var.c0.c();
                    stargiftattributebackdropArr[i18] = stargiftattributebackdrop;
                    e7Var.e(i18, stargiftattributebackdrop);
                    e7Var.g(1, (TL_stars.starGiftAttributePattern) e7Var.b0.c(), true);
                    e7Var.a();
                    float f19 = e7Var.s0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f19, f19);
                    e7Var.i0 = ofFloat;
                    ofFloat.addUpdateListener(new a7(e7Var, i11));
                    e7Var.i0.addListener(new d7(e7Var));
                    e7Var.i0.setDuration(320L);
                    e7Var.i0.setInterpolator(bs.h);
                    e7Var.i0.start();
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
                                e8.a("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface b10 = i0.e.a.b(context, hVarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer e = v7.z7.e(qVar.a, d.a);
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
