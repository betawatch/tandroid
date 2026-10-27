package a3;

import a8.i1;
import a8.j1;
import a8.sc;
import a8.tc;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.opengl.Matrix;
import android.os.Trace;
import androidx.fragment.app.t0;
import bi.b1;
import bi.f7;
import bi.g1;
import bi.g7;
import bi.k1;
import bi.o5;
import bi.p5;
import bi.q0;
import bi.q5;
import bi.r5;
import bi.s5;
import bi.u5;
import bi.uc;
import bi.x1;
import bi.y5;
import bi.z5;
import java.nio.MappedByteBuffer;
import java.util.Arrays;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Components.lx0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.s4;
import org.telegram.ui.Wallet.t4;
import org.telegram.ui.Wallet.t7;
import org.telegram.ui.wn;
import tg.y0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(androidx.fragment.app.k kVar, t0 t0Var) {
        this.a = 10;
        this.b = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x017e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        char c10;
        char c11;
        char c12;
        int i10;
        int i11 = 0;
        switch (this.a) {
            case 0:
                ((f) this.b).h.A();
                return;
            case 1:
                ((w) this.b).m--;
                return;
            case 2:
                r0.a.postVsyncCallback((e0) this.b);
                return;
            case 3:
                try {
                    ((Bitmap) this.b).recycle();
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 4:
                ag.t tVar = (ag.t) this.b;
                long j10 = tVar.b;
                if (j10 > 0) {
                    long j11 = j10 - 1;
                    tVar.b = j11;
                    tVar.a.f(j11);
                }
                if (tVar.b <= 0) {
                    tVar.c = false;
                }
                if (tVar.c) {
                    AndroidUtilities.runOnUIThread(tVar.d, 1000L);
                    return;
                }
                return;
            case 5:
                ((ai.y) this.b).e();
                return;
            case 6:
                ((androidx.activity.l) this.b).invalidateOptionsMenu();
                return;
            case 7:
                androidx.activity.k kVar = (androidx.activity.k) this.b;
                Runnable runnable = kVar.b;
                if (runnable != null) {
                    runnable.run();
                    kVar.b = null;
                    return;
                }
                return;
            case 8:
                androidx.activity.m.a((androidx.activity.m) this.b);
                return;
            case 9:
                androidx.emoji2.text.q qVar = (androidx.emoji2.text.q) this.b;
                synchronized (qVar.d) {
                    try {
                        if (qVar.h == null) {
                            return;
                        }
                        try {
                            o0.h d = qVar.d();
                            int i12 = d.e;
                            if (i12 == 2) {
                                synchronized (qVar.d) {
                                }
                            }
                            if (i12 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i12 + ")");
                            }
                            try {
                                int i13 = n0.g.a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                qb.a aVar = qVar.c;
                                Context context = qVar.a;
                                aVar.getClass();
                                o0.h[] hVarArr = {d};
                                sc scVar = i0.e.a;
                                w7.b0.a("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface b10 = i0.e.a.b(context, hVarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer e = tc.e(qVar.a, d.a);
                                    if (e == null || b10 == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        com.google.firebase.messaging.q qVar2 = new com.google.firebase.messaging.q(b10, j1.a(e));
                                        Trace.endSection();
                                        synchronized (qVar.d) {
                                            try {
                                                i1 i1Var = qVar.h;
                                                if (i1Var != null) {
                                                    i1Var.b(qVar2);
                                                }
                                            } finally {
                                            }
                                        }
                                        qVar.b();
                                        return;
                                    } finally {
                                        int i14 = n0.g.a;
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
                                    i1 i1Var2 = qVar.h;
                                    if (i1Var2 != null) {
                                        i1Var2.a(th3);
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
            case 10:
                androidx.fragment.app.k this$0 = (androidx.fragment.app.k) this.b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                kotlin.jvm.internal.i.e(null, "$operation");
                this$0.a(null);
                return;
            case 11:
                Iterator it = ((androidx.fragment.app.i0) this.b).n.iterator();
                if (it.hasNext()) {
                    throw a1.g.j(it);
                }
                return;
            case 12:
                androidx.lifecycle.e0 e0Var = (androidx.lifecycle.e0) this.b;
                androidx.lifecycle.v vVar = e0Var.f;
                if (e0Var.b == 0) {
                    e0Var.c = true;
                    vVar.e(androidx.lifecycle.m.ON_PAUSE);
                }
                if (e0Var.a == 0 && e0Var.c) {
                    vVar.e(androidx.lifecycle.m.ON_STOP);
                    e0Var.d = true;
                    return;
                }
                return;
            case 13:
                bh.x xVar = (bh.x) ((rb.c) this.b).b;
                bh.w wVar = xVar.b;
                if (wVar != null) {
                    wVar.d(true);
                }
                xVar.a.I7(true);
                return;
            case 14:
                ((ValueAnimator) this.b).start();
                return;
            case 15:
                r2 r2Var = ((bh.d0) this.b).g2.r;
                if (r2Var instanceof wn) {
                    r2Var.showDialog(new y0(r2Var, 11, false));
                    return;
                }
                r2 R = LaunchActivity.R();
                if (R != null) {
                    R.showDialog(new y0(r2Var, 11, false));
                    return;
                }
                return;
            case 16:
                bi.c cVar = (bi.c) this.b;
                cVar.getClass();
                new uc(cVar.getContext(), cVar.b).show();
                return;
            case 17:
                bi.x xVar2 = (bi.x) this.b;
                if (!xVar2.isAttachedToWindow() || xVar2.c.canScrollVertically(1)) {
                    return;
                }
                xVar2.a();
                return;
            case 18:
                new lx0(((q0) this.b).getContext()).show();
                return;
            case 19:
                AndroidUtilities.showKeyboard(((b1) this.b).e0);
                return;
            case 20:
                AndroidUtilities.showKeyboard(((g1) this.b).h);
                return;
            case 21:
                AndroidUtilities.showKeyboard(((k1) this.b).c);
                return;
            case 22:
                ((x1) this.b).onBackPressed();
                return;
            case 23:
                s4 s4Var = (s4) ((g7) this.b);
                t7 t7Var = s4Var.c.j0;
                if (t7Var != null) {
                    TL_wallet.nftItem nftitem = s4Var.b;
                    if (t7Var.A()) {
                        t7Var.c0(t7Var.v(nftitem));
                        return;
                    }
                    return;
                }
                return;
            case 24:
                t4 t4Var = (t4) ((f7) this.b);
                t7 t7Var2 = t4Var.b.j0;
                if (t7Var2 != null) {
                    t7Var2.b0(t4Var.a);
                    return;
                }
                return;
            case 25:
                z5 z5Var = (z5) this.b;
                z5Var.h0 = false;
                z5Var.j0 = false;
                z5Var.a(z5Var.W, z5Var.a0, z5Var.b0, z5Var.c0);
                return;
            case 26:
                ((o5) this.b).invalidateSelf();
                return;
            case 27:
                s5 s5Var = (s5) this.b;
                r5 r5Var = s5Var.H;
                if (r5Var != null) {
                    s5 s5Var2 = r5Var.a;
                    float[] fArr = r5Var.h;
                    if (!r5Var.e && (i10 = r5Var.c) != 0) {
                        if (r5Var.l) {
                            s5Var2.a();
                        } else {
                            int c13 = m1.j.c(((q5) r5Var.b.get(i10 - 1)).a);
                            if (c13 == 1 || c13 == 2) {
                                c10 = 2;
                                c11 = 1;
                                s5Var2.a();
                                int i15 = r5Var.f - 1;
                                r5Var.f = i15;
                                if (i15 <= 0) {
                                    r5Var.b();
                                }
                            } else if (c13 == 3) {
                                char c14 = 1;
                                float pow = 1.0f - ((float) Math.pow(1.0f - (1.0f - (r5Var.f / r5Var.g)), 3.0d));
                                float f7 = 1.0f - pow;
                                if (Math.abs(r5Var.j * f7) > 1.0E-4f || Math.abs(r5Var.k * f7) > 1.0E-4f) {
                                    float[] fArr2 = new float[16];
                                    c10 = 2;
                                    float f10 = r5Var.j * f7 * 0.96f;
                                    s5Var2.getClass();
                                    s5.b(1.0f, 0.0f, f10, fArr2);
                                    s5Var2.getClass();
                                    s5.d(fArr2, fArr, fArr);
                                    float f11 = r5Var.k * f7 * 0.96f;
                                    s5Var2.getClass();
                                    s5.b(0.0f, 1.0f, f11, fArr2);
                                    s5.d(fArr2, fArr, fArr);
                                } else {
                                    c10 = 2;
                                }
                                float[] fArr3 = r5Var.i;
                                float[] fArr4 = s5Var2.c;
                                int i16 = 0;
                                while (i16 < 16) {
                                    float f12 = fArr[i16];
                                    fArr4[i16] = c3.h0.z(fArr3[i16], f12, pow, f12);
                                    i16++;
                                    c14 = c14;
                                }
                                c11 = c14;
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
                                s5.e(fArr5);
                                s5.c(fArr5, fArr6, fArr7);
                                s5.e(fArr7);
                                s5.c(fArr7, fArr5, fArr6);
                                fArr4[0] = fArr5[0];
                                fArr4[c11] = fArr5[c11];
                                fArr4[c10] = fArr5[c10];
                                fArr4[4] = fArr6[0];
                                fArr4[5] = fArr6[c11];
                                fArr4[6] = fArr6[c10];
                                fArr4[8] = fArr7[0];
                                fArr4[9] = fArr7[c11];
                                fArr4[10] = fArr7[c10];
                                int i17 = r5Var.f - 1;
                                r5Var.f = i17;
                                if (i17 <= 0) {
                                    System.arraycopy(r5Var.i, 0, s5Var2.c, 0, 16);
                                    s5Var2.d = 0.0f;
                                    s5Var2.e = 0.0f;
                                    r5Var.b();
                                }
                            }
                        }
                    }
                    c10 = 2;
                    c11 = 1;
                } else {
                    c10 = 2;
                    c11 = 1;
                    if (Math.abs(s5Var.d) <= 1.0E-4f && Math.abs(s5Var.e) <= 1.0E-4f) {
                        c12 = 0;
                        if ((s5Var.G == null ? c11 : c12) != 0) {
                            for (int i18 = 0; i18 < 6; i18++) {
                                Matrix.multiplyMV(s5Var.n, 0, s5Var.c, 0, s5Var.h[i18], 0);
                                s5Var.r[i18] = s5Var.n[c10];
                            }
                            Arrays.sort(s5Var.s, new p5(s5Var, i11));
                            s5Var.invalidate();
                        }
                        if (s5Var.isAttachedToWindow()) {
                            return;
                        }
                        AndroidUtilities.runOnUIThread(s5Var.I, 16L);
                        return;
                    }
                    s5Var.a();
                }
                c12 = c11;
                if ((s5Var.G == null ? c11 : c12) != 0) {
                }
                if (s5Var.isAttachedToWindow()) {
                }
                break;
            case 28:
                ((u5) this.b).invalidate();
                return;
            default:
                ((y5) this.b).invalidateSelf();
                return;
        }
    }

    public /* synthetic */ d(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
