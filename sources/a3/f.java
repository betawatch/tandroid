package a3;

import a8.r7;
import a8.u6;
import a8.v6;
import ab.c0;
import ab.o0;
import ai.m2;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.os.Trace;
import android.support.v4.media.session.a0;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.j0;
import androidx.fragment.app.u0;
import androidx.lifecycle.e0;
import bi.i4;
import bi.l2;
import bi.n2;
import bi.s2;
import bi.t0;
import bi.x0;
import c8.he;
import c8.k0;
import c8.l0;
import com.google.android.gms.internal.vision.e2;
import di.bc;
import java.nio.MappedByteBuffer;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import m.o3;
import org.json.JSONArray;
import org.telegram.messenger.g0;
import org.telegram.messenger.ns;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f(androidx.fragment.app.l lVar, u0 u0Var) {
        this.a = 12;
        this.b = lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        r4 = org.telegram.ui.Dictation.DictationAsr.nativeFileNext(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x018d, code lost:
    
        r6 = org.telegram.ui.Dictation.DictationAsr.nativeSessionFinish(r1);
        r0.a(r6);
        android.util.Log.d("Dictation", "tinyasr: finished, " + (r5 / 32) + " ms of audio, " + r3 + " ms busy, " + (android.os.SystemClock.elapsedRealtime() - r8) + " ms in all");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        boolean z10;
        long nativeSessionNew;
        String nativeSessionPush;
        long nativeFileNew;
        String nativeFileNext;
        ai.v vVar = (ai.v) this.b;
        long k10 = DictationAsr.k(vVar.b);
        long j3 = 0;
        if (k10 == 0) {
            vVar.b(vVar.o);
            return;
        }
        DictationAsr.J();
        ai.y yVar = vVar.a;
        synchronized (yVar.a) {
            z10 = yVar.d;
        }
        if (!z10) {
            String str = vVar.c.split(",")[0];
            nativeSessionNew = DictationAsr.nativeSessionNew(k10, vVar.c, str);
            StringBuilder sb2 = new StringBuilder("tinyasr: session ");
            sb2.append(vVar.b.a);
            sb2.append(" in ");
            e2.r(sb2, vVar.c, " (from ", str, "), audio from ");
            sb2.append(0);
            sb2.append(" ms");
            Log.d("Dictation", sb2.toString());
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i7 = 0;
            while (true) {
                try {
                    if (vVar.l) {
                        break;
                    }
                    boolean z11 = vVar.k;
                    int c10 = vVar.a.c() - i7;
                    if (c10 >= 2) {
                        int min = Math.min(10240, c10 & (-2)) + i7;
                        byte[] b10 = vVar.a.b(i7, min);
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        nativeSessionPush = DictationAsr.nativeSessionPush(nativeSessionNew, b10, 0, b10.length);
                        vVar.a(nativeSessionPush);
                        j3 += SystemClock.elapsedRealtime() - elapsedRealtime2;
                        vVar.m = min;
                        i7 = min;
                    } else if (z11) {
                        break;
                    } else {
                        Thread.sleep(40L);
                    }
                } catch (InterruptedException unused) {
                } catch (Throwable th2) {
                    DictationAsr.nativeSessionFree(nativeSessionNew);
                    DictationAsr.M(vVar.b);
                    throw th2;
                }
            }
            DictationAsr.nativeSessionFree(nativeSessionNew);
            DictationAsr.M(vVar.b);
            vVar.b(vVar.o);
            return;
        }
        long elapsedRealtime3 = SystemClock.elapsedRealtime();
        ai.y yVar2 = vVar.a;
        byte[] b11 = yVar2.b(0, yVar2.c());
        vVar.m = b11.length;
        int length = b11.length / 2;
        float[] fArr = new float[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            fArr[i10] = ((short) ((b11[i11 + 1] << 8) | (b11[i11] & 255))) / 32768.0f;
        }
        nativeFileNew = DictationAsr.nativeFileNew(k10, fArr, vVar.c);
        try {
            if (nativeFileNew == 0) {
                if (nativeFileNew != 0) {
                    DictationAsr.nativeFileFree(nativeFileNew);
                }
                DictationAsr.M(vVar.b);
                while (!vVar.k && !vVar.l) {
                    Thread.sleep(10L);
                }
            } else {
                while (!vVar.l && nativeFileNext != null) {
                    try {
                        try {
                            DictationAsr.n(vVar.e, new JSONArray(nativeFileNext), null);
                        } catch (Exception e10) {
                            Log.e("Dictation", "tinyasr: words " + nativeFileNext, e10);
                        }
                        vVar.b(null);
                    } catch (Throwable th3) {
                        if (nativeFileNew != 0) {
                            DictationAsr.nativeFileFree(nativeFileNew);
                        }
                        DictationAsr.M(vVar.b);
                        while (!vVar.k && !vVar.l) {
                            try {
                                Thread.sleep(10L);
                            } catch (InterruptedException unused2) {
                            }
                        }
                        vVar.b(vVar.o);
                        throw th3;
                    }
                }
                Log.d("Dictation", "tinyasr: file pass in " + vVar.c + ", " + (length / 16) + " ms of audio in " + (SystemClock.elapsedRealtime() - elapsedRealtime3) + " ms");
                if (nativeFileNew != 0) {
                    DictationAsr.nativeFileFree(nativeFileNew);
                }
                DictationAsr.M(vVar.b);
                while (!vVar.k && !vVar.l) {
                    Thread.sleep(10L);
                }
            }
        } catch (InterruptedException unused3) {
        }
        vVar.b(vVar.o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0087, code lost:
    
        r3.write(r2, 0, r5);
        r0.d += r5;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void b() {
        ai.x xVar = (ai.x) this.b;
        byte[] bArr = new byte[3200];
        xVar.i = SystemClock.elapsedRealtime();
        try {
            ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(xVar.b);
            while (!xVar.e) {
                try {
                    long elapsedRealtime = (xVar.d - xVar.f) - (((SystemClock.elapsedRealtime() - xVar.i) * xVar.h) + xVar.g);
                    if (elapsedRealtime <= 0) {
                        synchronized (xVar.j.a) {
                            while (!xVar.e) {
                                try {
                                    ai.y yVar = xVar.j;
                                    if (yVar.d || yVar.c > xVar.d) {
                                        break;
                                    } else {
                                        xVar.j.a.wait();
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            if (!xVar.e && xVar.j.c > xVar.d) {
                                int min = Math.min(3200, xVar.j.c - xVar.d);
                                System.arraycopy(xVar.j.b, xVar.d, bArr, 0, min);
                            }
                        }
                        break;
                    }
                    Thread.sleep(Math.max(1L, elapsedRealtime / xVar.h));
                } catch (Throwable th3) {
                    try {
                        autoCloseOutputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
            autoCloseOutputStream.close();
        } catch (Exception e10) {
            if (xVar.e) {
                return;
            }
            Log.d("Dictation", "feed closed: " + e10);
        }
    }

    private final void c() {
        androidx.emoji2.text.r rVar = (androidx.emoji2.text.r) this.b;
        synchronized (rVar.d) {
            try {
                if (rVar.n == null) {
                    return;
                }
                try {
                    o0.h d = rVar.d();
                    int i7 = d.e;
                    if (i7 == 2) {
                        synchronized (rVar.d) {
                        }
                    }
                    if (i7 != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + i7 + ")");
                    }
                    try {
                        int i10 = n0.g.a;
                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        qb.a aVar = rVar.c;
                        Context context = rVar.a;
                        aVar.getClass();
                        o0.h[] hVarArr = {d};
                        k0 k0Var = i0.f.a;
                        he.a("TypefaceCompat.createFromFontInfo");
                        try {
                            Typeface b10 = i0.f.a.b(context, hVarArr, 0);
                            Trace.endSection();
                            MappedByteBuffer e10 = l0.e(rVar.a, d.a);
                            if (e10 == null || b10 == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            try {
                                Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                c0 c0Var = new c0(b10, v6.a(e10));
                                Trace.endSection();
                                synchronized (rVar.d) {
                                    try {
                                        u6 u6Var = rVar.n;
                                        if (u6Var != null) {
                                            u6Var.b(c0Var);
                                        }
                                    } finally {
                                    }
                                }
                                rVar.b();
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
                    synchronized (rVar.d) {
                        try {
                            u6 u6Var2 = rVar.n;
                            if (u6Var2 != null) {
                                u6Var2.a(th3);
                            }
                            rVar.b();
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    private final void d() {
        boolean z10;
        String str;
        o3 o3Var = (o3) this.b;
        synchronized (((AtomicMarkableReference) o3Var.g)) {
            try {
                z10 = false;
                if (((AtomicMarkableReference) o3Var.g).isMarked()) {
                    str = (String) ((AtomicMarkableReference) o3Var.g).getReference();
                    ((AtomicMarkableReference) o3Var.g).set(str, false);
                    z10 = true;
                } else {
                    str = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            ((ca.h) o3Var.a).i((String) o3Var.c, str);
        }
    }

    private final void f() {
        ab.q qVar = (ab.q) this.b;
        Map map = null;
        ((AtomicReference) qVar.c).set(null);
        synchronized (qVar) {
            try {
                if (((AtomicMarkableReference) qVar.b).isMarked()) {
                    map = ((ca.e) ((AtomicMarkableReference) qVar.b).getReference()).a();
                    AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) qVar.b;
                    atomicMarkableReference.set((ca.e) atomicMarkableReference.getReference(), false);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (map != null) {
            o3 o3Var = (o3) qVar.d;
            ((ca.h) o3Var.a).h((String) o3Var.c, map, qVar.a);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
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
                a();
                return;
            case 5:
                b();
                return;
            case 6:
                g0.J3((EditText) this.b);
                return;
            case 7:
                DictationAsr.V((ai.s) ((a0) this.b).b, new m2());
                return;
            case 8:
                ((androidx.activity.l) this.b).invalidateOptionsMenu();
                return;
            case 9:
                androidx.activity.k kVar = (androidx.activity.k) this.b;
                Runnable runnable = kVar.b;
                if (runnable != null) {
                    runnable.run();
                    kVar.b = null;
                    return;
                }
                return;
            case 10:
                androidx.activity.m.a((androidx.activity.m) this.b);
                return;
            case 11:
                c();
                return;
            case 12:
                androidx.fragment.app.l this$0 = (androidx.fragment.app.l) this.b;
                kotlin.jvm.internal.j.e(this$0, "this$0");
                kotlin.jvm.internal.j.e(null, "$operation");
                this$0.a(null);
                return;
            case 13:
                Iterator it2 = ((j0) this.b).n.iterator();
                if (it2.hasNext()) {
                    it2.next().getClass();
                    throw new ClassCastException();
                }
                return;
            case 14:
                e0 e0Var = (e0) this.b;
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
            case 15:
                try {
                    ((Bitmap) this.b).recycle();
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 16:
                bg.q qVar = (bg.q) this.b;
                long j3 = qVar.b;
                if (j3 > 0) {
                    long j10 = j3 - 1;
                    qVar.b = j10;
                    qVar.a.g(j10);
                }
                if (qVar.b <= 0) {
                    qVar.c = false;
                }
                if (qVar.c) {
                    g0.i3(qVar.d, 1000L);
                    return;
                }
                return;
            case 17:
                bi.y yVar = (bi.y) this.b;
                yVar.d2.setTranslationX(yVar.c2.getAnimatedWidth() + g0.L(28.0f));
                return;
            case 18:
                ((t0) this.b).onBackPressed();
                return;
            case 19:
                x0 x0Var = (x0) this.b;
                Drawable drawable = x0Var.O;
                if (drawable != null && !x0Var.Q) {
                    drawable.setAlpha(ns.e4);
                }
                x0Var.a.setAlpha(1.0f);
                if (x0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) x0Var.getParent()).removeView(x0Var);
                }
                Runnable runnable2 = x0Var.P;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 20:
                p41 p41Var = ((s2) this.b).U1;
                if (p41Var != null) {
                    p41Var.O(false);
                    return;
                }
                return;
            case 21:
                ((bi.e2) this.b).c();
                return;
            case 22:
                ((l2) this.b).invalidateSelf();
                return;
            case 23:
                n2 n2Var = (n2) this.b;
                bc bcVar = n2Var.e;
                if (bcVar != null) {
                    bcVar.d();
                    n2Var.invalidateSelf();
                    return;
                }
                return;
            case 24:
                ((i4) this.b).p();
                return;
            case 25:
                ((c1.f) this.b).f().a(new w0.h(2, "Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                return;
            case 26:
                d();
                return;
            case 27:
                f();
                return;
            case 28:
                ch.r rVar = (ch.r) ((d6.i) this.b).b;
                ch.q qVar2 = rVar.b;
                if (qVar2 != null) {
                    qVar2.d(true);
                }
                rVar.a.O7(true);
                return;
            default:
                ((ValueAnimator) this.b).start();
                return;
        }
    }

    public /* synthetic */ f(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }
}
