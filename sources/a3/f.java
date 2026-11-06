package a3;

import a8.r7;
import a8.t6;
import a8.u6;
import ab.b0;
import ab.o0;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.opengl.Matrix;
import android.os.Trace;
import android.util.Log;
import androidx.fragment.app.i0;
import androidx.fragment.app.t0;
import androidx.lifecycle.e0;
import bi.a1;
import bi.a7;
import bi.c6;
import bi.d6;
import bi.d7;
import bi.dd;
import bi.e1;
import bi.e7;
import bi.g6;
import bi.h1;
import bi.i7;
import bi.j7;
import bi.r5;
import bi.s5;
import bi.u5;
import bi.uc;
import bi.v5;
import bi.w1;
import bi.w5;
import bi.y5;
import c8.ge;
import c8.j0;
import c8.k0;
import java.nio.MappedByteBuffer;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import org.telegram.messenger.g0;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.hu0;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.m20;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.Wallet.c8;
import org.telegram.ui.Wallet.g5;
import org.telegram.ui.Wallet.h5;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f(androidx.fragment.app.k kVar, t0 t0Var) {
        this.a = 9;
        this.b = kVar;
    }

    private final void a() {
        androidx.emoji2.text.q qVar = (androidx.emoji2.text.q) this.b;
        synchronized (qVar.d) {
            try {
                if (qVar.n == null) {
                    return;
                }
                try {
                    o0.h d = qVar.d();
                    int i7 = d.e;
                    if (i7 == 2) {
                        synchronized (qVar.d) {
                        }
                    }
                    if (i7 != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + i7 + ")");
                    }
                    try {
                        int i10 = n0.g.a;
                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        pb.b bVar = qVar.c;
                        Context context = qVar.a;
                        bVar.getClass();
                        o0.h[] hVarArr = {d};
                        j0 j0Var = i0.e.a;
                        ge.a("TypefaceCompat.createFromFontInfo");
                        try {
                            Typeface b10 = i0.e.a.b(context, hVarArr, 0);
                            Trace.endSection();
                            MappedByteBuffer e10 = k0.e(qVar.a, d.a);
                            if (e10 == null || b10 == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            try {
                                Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                b0 b0Var = new b0(b10, u6.a(e10));
                                Trace.endSection();
                                synchronized (qVar.d) {
                                    try {
                                        t6 t6Var = qVar.n;
                                        if (t6Var != null) {
                                            t6Var.b(b0Var);
                                        }
                                    } finally {
                                    }
                                }
                                qVar.a();
                            } finally {
                                int i11 = n0.g.a;
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
                            t6 t6Var2 = qVar.n;
                            if (t6Var2 != null) {
                                t6Var2.a(th3);
                            }
                            qVar.a();
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0258  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z9;
        char c10;
        char c11;
        char c12;
        int i7;
        switch (this.a) {
            case 0:
                ((s) this.b).k();
                return;
            case 1:
                r7 r7Var = (r7) this.b;
                synchronized (((ArrayDeque) r7Var.e)) {
                    SharedPreferences.Editor edit = ((SharedPreferences) r7Var.b).edit();
                    String str = (String) r7Var.c;
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it = ((ArrayDeque) r7Var.e).iterator();
                    while (it.hasNext()) {
                        sb2.append((String) it.next());
                        sb2.append((String) r7Var.d);
                    }
                    edit.putString(str, sb2.toString()).apply();
                }
                return;
            case 2:
                o0 o0Var = (o0) this.b;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + o0Var.a.getAction() + " finishing.");
                o0Var.b.trySetResult(null);
                return;
            case 3:
                ((ah.c) this.b).f();
                return;
            case 4:
                ((ai.x) this.b).e();
                return;
            case 5:
                ((androidx.activity.l) this.b).invalidateOptionsMenu();
                return;
            case 6:
                androidx.activity.k kVar = (androidx.activity.k) this.b;
                Runnable runnable = kVar.b;
                if (runnable != null) {
                    runnable.run();
                    kVar.b = null;
                    return;
                }
                return;
            case 7:
                androidx.activity.m.a((androidx.activity.m) this.b);
                return;
            case 8:
                a();
                return;
            case 9:
                androidx.fragment.app.k this$0 = (androidx.fragment.app.k) this.b;
                kotlin.jvm.internal.j.e(this$0, "this$0");
                kotlin.jvm.internal.j.e(null, "$operation");
                this$0.a(null);
                return;
            case 10:
                Iterator it2 = ((i0) this.b).n.iterator();
                if (it2.hasNext()) {
                    it2.next().getClass();
                    throw new ClassCastException();
                }
                return;
            case 11:
                e0 e0Var = (e0) this.b;
                androidx.lifecycle.v vVar = e0Var.f;
                if (e0Var.b == 0) {
                    z9 = true;
                    e0Var.c = true;
                    vVar.e(androidx.lifecycle.m.ON_PAUSE);
                } else {
                    z9 = true;
                }
                if (e0Var.a == 0 && e0Var.c) {
                    vVar.e(androidx.lifecycle.m.ON_STOP);
                    e0Var.d = z9;
                    return;
                }
                return;
            case 12:
                try {
                    ((Bitmap) this.b).recycle();
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 13:
                bg.q qVar = (bg.q) this.b;
                long j3 = qVar.b;
                if (j3 > 0) {
                    long j10 = j3 - 1;
                    qVar.b = j10;
                    qVar.a.j(j10);
                }
                if (qVar.b <= 0) {
                    qVar.c = false;
                }
                if (qVar.c) {
                    g0.i3(qVar.d, 1000L);
                    return;
                }
                return;
            case 14:
                bi.c cVar = (bi.c) this.b;
                cVar.getClass();
                new uc(cVar.getContext(), cVar.b).show();
                return;
            case 15:
                bi.y yVar = (bi.y) this.b;
                if (!yVar.isAttachedToWindow() || yVar.c.canScrollVertically(1)) {
                    return;
                }
                yVar.a();
                return;
            case 16:
                new hu0(((m20) this.b).getContext()).show();
                return;
            case 17:
                g0.K3(((a1) this.b).W1);
                return;
            case 18:
                g0.K3(((e1) this.b).n1);
                return;
            case 19:
                g0.K3(((h1) this.b).j1);
                return;
            case 20:
                ((w1) this.b).onBackPressed();
                return;
            case 21:
                g5 g5Var = (g5) ((j7) this.b);
                c8 c8Var = g5Var.c.j0;
                if (c8Var != null) {
                    TL_wallet.nftItem nftitem = g5Var.b;
                    if (c8Var.A()) {
                        c8Var.c0(c8Var.v(nftitem));
                        return;
                    }
                    return;
                }
                return;
            case 22:
                h5 h5Var = (h5) ((i7) this.b);
                c8 c8Var2 = h5Var.b.j0;
                if (c8Var2 != null) {
                    c8Var2.b0(h5Var.a);
                    return;
                }
                return;
            case 23:
                d6 d6Var = (d6) this.b;
                d6Var.h0 = false;
                d6Var.j0 = false;
                d6Var.a(d6Var.W, d6Var.a0, d6Var.b0, d6Var.c0);
                return;
            case 24:
                ((r5) this.b).invalidateSelf();
                return;
            case 25:
                w5 w5Var = (w5) this.b;
                v5 v5Var = w5Var.H;
                if (v5Var != null) {
                    w5 w5Var2 = v5Var.a;
                    float[] fArr = v5Var.h;
                    if (!v5Var.e && (i7 = v5Var.c) != 0) {
                        if (v5Var.l) {
                            w5Var2.a();
                        } else {
                            int c13 = p1.g.c(((u5) v5Var.b.get(i7 - 1)).a);
                            if (c13 == 1 || c13 == 2) {
                                c10 = 2;
                                c11 = 1;
                                w5Var2.a();
                                int i10 = v5Var.f - 1;
                                v5Var.f = i10;
                                if (i10 <= 0) {
                                    v5Var.b();
                                }
                            } else if (c13 == 3) {
                                char c14 = 2;
                                float pow = 1.0f - ((float) Math.pow(1.0f - (1.0f - (v5Var.f / v5Var.g)), 3.0d));
                                float f10 = 1.0f - pow;
                                if (Math.abs(v5Var.j * f10) > 1.0E-4f || Math.abs(v5Var.k * f10) > 1.0E-4f) {
                                    float[] fArr2 = new float[16];
                                    c11 = 1;
                                    float f11 = v5Var.j * f10 * 0.96f;
                                    w5Var2.getClass();
                                    w5.b(1.0f, 0.0f, f11, fArr2);
                                    w5Var2.getClass();
                                    w5.d(fArr2, fArr, fArr);
                                    float f12 = v5Var.k * f10 * 0.96f;
                                    w5Var2.getClass();
                                    w5.b(0.0f, 1.0f, f12, fArr2);
                                    w5.d(fArr2, fArr, fArr);
                                } else {
                                    c11 = 1;
                                }
                                float[] fArr3 = v5Var.i;
                                float[] fArr4 = w5Var2.c;
                                int i11 = 0;
                                while (i11 < 16) {
                                    float f13 = fArr[i11];
                                    fArr4[i11] = com.google.android.recaptcha.internal.a.z(fArr3[i11], f13, pow, f13);
                                    i11++;
                                    c14 = c14;
                                }
                                c10 = c14;
                                float f14 = fArr4[0];
                                float f15 = fArr4[c11];
                                float f16 = fArr4[c10];
                                float[] fArr5 = new float[3];
                                fArr5[0] = f14;
                                fArr5[c11] = f15;
                                fArr5[c10] = f16;
                                float f17 = fArr4[4];
                                float f18 = fArr4[5];
                                float f19 = fArr4[6];
                                float[] fArr6 = new float[3];
                                fArr6[0] = f17;
                                fArr6[c11] = f18;
                                fArr6[c10] = f19;
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
                                int i12 = v5Var.f - 1;
                                v5Var.f = i12;
                                if (i12 <= 0) {
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
                            for (int i13 = 0; i13 < 6; i13++) {
                                Matrix.multiplyMV(w5Var.n, 0, w5Var.c, 0, w5Var.h[i13], 0);
                                w5Var.r[i13] = w5Var.n[c10];
                            }
                            Arrays.sort(w5Var.s, new s5(w5Var, 0));
                            w5Var.invalidate();
                        }
                        if (w5Var.isAttachedToWindow()) {
                            return;
                        }
                        g0.i3(w5Var.I, 16L);
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
            case 26:
                ((y5) this.b).invalidate();
                return;
            case 27:
                ((c6) this.b).invalidateSelf();
                return;
            case 28:
                e7 e7Var = (e7) this.b;
                f fVar = e7Var.l0;
                l9[] l9VarArr = e7Var.d;
                if (!l9VarArr[2 - e7Var.u0].getImageReceiver().J()) {
                    g0.r(fVar);
                    g0.i3(fVar, 150L);
                    return;
                }
                g6 g6Var = e7Var.a0;
                if (g6Var != null && g6Var.c == 1 && e7Var.isAttachedToWindow()) {
                    g0.r(fVar);
                    ValueAnimator valueAnimator = e7Var.k0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        e7Var.k0 = null;
                    }
                    int i14 = 1 - e7Var.u0;
                    e7Var.u0 = i14;
                    zg0 B = l9VarArr[2 - i14].getImageReceiver().B();
                    zg0 B2 = l9VarArr[e7Var.u0 + 1].getImageReceiver().B();
                    if (B2 != null && B != null) {
                        B2.T(false, B.t());
                    }
                    e7Var.c0.c();
                    int i15 = e7Var.u0 + 1;
                    TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = e7Var.b0;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) e7Var.e0.c();
                    stargiftattributebackdropArr[i15] = stargiftattributebackdrop;
                    e7Var.e(i15, stargiftattributebackdrop);
                    e7Var.g(1, (TL_stars.starGiftAttributePattern) e7Var.d0.c(), true);
                    e7Var.a();
                    float f20 = e7Var.u0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f20, f20);
                    e7Var.k0 = ofFloat;
                    ofFloat.addUpdateListener(new a7(e7Var, 2));
                    e7Var.k0.addListener(new d7(e7Var));
                    e7Var.k0.setDuration(320L);
                    e7Var.k0.setInterpolator(xq.h);
                    e7Var.k0.start();
                    return;
                }
                return;
            default:
                dd ddVar = (dd) this.b;
                if (ddVar.U == null || ddVar.a0 == -1) {
                    return;
                }
                ddVar.n1("POSTED_ALIGN");
                ddVar.U.a();
                return;
        }
    }

    public /* synthetic */ f(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }
}
