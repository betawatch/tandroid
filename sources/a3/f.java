package a3;

import a8.r7;
import a8.u6;
import a8.v6;
import ab.c0;
import ab.o0;
import ai.p2;
import ai.z;
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
import bi.a5;
import bi.b1;
import bi.c3;
import bi.e5;
import bi.j3;
import bi.l3;
import bi.n3;
import bi.t0;
import bi.t6;
import bi.y7;
import c8.ke;
import c8.m0;
import c8.n0;
import com.google.android.gms.internal.vision.e2;
import di.ec;
import java.nio.MappedByteBuffer;
import java.util.ArrayDeque;
import java.util.Iterator;
import org.json.JSONArray;
import org.telegram.messenger.bz;
import org.telegram.messenger.g0;
import org.telegram.messenger.ks;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f(androidx.fragment.app.l lVar, u0 u0Var) {
        this.a = 13;
        this.b = lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0099, code lost:
    
        r8 = org.telegram.ui.Dictation.DictationAsr.nativeFileNext(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01b1, code lost:
    
        r7 = org.telegram.ui.Dictation.DictationAsr.nativeSessionFinish(r3);
        r2.a(r7);
        android.util.Log.d("Dictation", "tinyasr: finished, " + (r0 / 32) + " ms of audio, " + r10 + " ms busy, " + (android.os.SystemClock.elapsedRealtime() - r5) + " ms in all");
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
        ai.w wVar = (ai.w) this.b;
        long k10 = DictationAsr.k(wVar.b);
        long j3 = 0;
        if (k10 == 0) {
            wVar.b(wVar.o);
            return;
        }
        DictationAsr.M();
        z zVar = wVar.a;
        synchronized (zVar.a) {
            z10 = zVar.d;
        }
        int i7 = 0;
        if (!z10) {
            String a10 = wVar.b.a(wVar.c);
            String str = a10.split(",")[0];
            nativeSessionNew = DictationAsr.nativeSessionNew(k10, a10, str, bz.o() == 0 ? 2 : 4);
            StringBuilder sb2 = new StringBuilder("tinyasr: session ");
            e2.r(sb2, wVar.b.a, " in ", a10, " (from ");
            sb2.append(str);
            sb2.append("), audio from ");
            sb2.append(0);
            sb2.append(" ms");
            Log.d("Dictation", sb2.toString());
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i10 = 0;
            long j10 = 0;
            while (true) {
                try {
                    if (wVar.l) {
                        break;
                    }
                    boolean z11 = wVar.k;
                    int c10 = wVar.a.c() - i10;
                    if (c10 >= 2) {
                        int min = Math.min(10240, c10 & (-2)) + i10;
                        byte[] b10 = wVar.a.b(i10, min);
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        nativeSessionPush = DictationAsr.nativeSessionPush(nativeSessionNew, b10, 0, b10.length);
                        wVar.a(nativeSessionPush);
                        j10 += SystemClock.elapsedRealtime() - elapsedRealtime2;
                        wVar.m = min;
                        i10 = min;
                    } else if (z11) {
                        break;
                    } else {
                        Thread.sleep(40L);
                    }
                } catch (InterruptedException unused) {
                } catch (Throwable th2) {
                    DictationAsr.nativeSessionFree(nativeSessionNew);
                    DictationAsr.Q(wVar.b);
                    throw th2;
                }
            }
            DictationAsr.nativeSessionFree(nativeSessionNew);
            DictationAsr.Q(wVar.b);
            wVar.b(wVar.o);
            return;
        }
        long elapsedRealtime3 = SystemClock.elapsedRealtime();
        z zVar2 = wVar.a;
        byte[] b11 = zVar2.b(0, zVar2.c());
        wVar.m = b11.length;
        int length = b11.length / 2;
        float[] fArr = new float[length];
        while (i7 < length) {
            int i11 = i7 * 2;
            fArr[i7] = ((short) ((b11[i11] & 255) | (b11[i11 + 1] << 8))) / 32768.0f;
            i7++;
            j3 = j3;
        }
        long j11 = j3;
        nativeFileNew = DictationAsr.nativeFileNew(k10, fArr, wVar.b.a(wVar.c), bz.o() == 0 ? 2 : 4);
        try {
            if (nativeFileNew == j11) {
                if (nativeFileNew != j11) {
                    DictationAsr.nativeFileFree(nativeFileNew);
                }
                DictationAsr.Q(wVar.b);
                while (!wVar.k && !wVar.l) {
                    Thread.sleep(10L);
                }
            } else {
                while (!wVar.l && nativeFileNext != null) {
                    try {
                        try {
                            DictationAsr.n(wVar.e, new JSONArray(nativeFileNext), null);
                        } catch (Exception e10) {
                            Log.e("Dictation", "tinyasr: words " + nativeFileNext, e10);
                        }
                        wVar.b(null);
                    } catch (Throwable th3) {
                        if (nativeFileNew != j11) {
                            DictationAsr.nativeFileFree(nativeFileNew);
                        }
                        DictationAsr.Q(wVar.b);
                        while (!wVar.k && !wVar.l) {
                            try {
                                Thread.sleep(10L);
                            } catch (InterruptedException unused2) {
                            }
                        }
                        wVar.b(wVar.o);
                        throw th3;
                    }
                }
                Log.d("Dictation", "tinyasr: file pass in " + wVar.c + ", " + (length / 16) + " ms of audio in " + (SystemClock.elapsedRealtime() - elapsedRealtime3) + " ms");
                if (nativeFileNew != j11) {
                    DictationAsr.nativeFileFree(nativeFileNew);
                }
                DictationAsr.Q(wVar.b);
                while (!wVar.k && !wVar.l) {
                    Thread.sleep(10L);
                }
            }
        } catch (InterruptedException unused3) {
        }
        wVar.b(wVar.o);
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
        ai.y yVar = (ai.y) this.b;
        byte[] bArr = new byte[3200];
        yVar.i = SystemClock.elapsedRealtime();
        try {
            ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(yVar.b);
            while (!yVar.e) {
                try {
                    long elapsedRealtime = (yVar.d - yVar.f) - (((SystemClock.elapsedRealtime() - yVar.i) * yVar.h) + yVar.g);
                    if (elapsedRealtime <= 0) {
                        synchronized (yVar.j.a) {
                            while (!yVar.e) {
                                try {
                                    z zVar = yVar.j;
                                    if (zVar.d || zVar.c > yVar.d) {
                                        break;
                                    } else {
                                        yVar.j.a.wait();
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            if (!yVar.e && yVar.j.c > yVar.d) {
                                int min = Math.min(3200, yVar.j.c - yVar.d);
                                System.arraycopy(yVar.j.b, yVar.d, bArr, 0, min);
                            }
                        }
                        break;
                    }
                    Thread.sleep(Math.max(1L, elapsedRealtime / yVar.h));
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
            if (yVar.e) {
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
                        m0 m0Var = i0.e.a;
                        ke.a("TypefaceCompat.createFromFontInfo");
                        try {
                            Typeface b10 = i0.e.a.b(context, hVarArr, 0);
                            Trace.endSection();
                            MappedByteBuffer e10 = n0.e(rVar.a, d.a);
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
                ((ai.f) this.b).c(null, null);
                return;
            case 5:
                a();
                return;
            case 6:
                b();
                return;
            case 7:
                g0.I3((EditText) this.b);
                return;
            case 8:
                DictationAsr.f0((ai.t) ((a0) this.b).b, new p2());
                return;
            case 9:
                ((androidx.activity.l) this.b).invalidateOptionsMenu();
                return;
            case 10:
                androidx.activity.k kVar = (androidx.activity.k) this.b;
                Runnable runnable = kVar.b;
                if (runnable != null) {
                    runnable.run();
                    kVar.b = null;
                    return;
                }
                return;
            case 11:
                androidx.activity.m.a((androidx.activity.m) this.b);
                return;
            case 12:
                c();
                return;
            case 13:
                androidx.fragment.app.l this$0 = (androidx.fragment.app.l) this.b;
                kotlin.jvm.internal.j.e(this$0, "this$0");
                kotlin.jvm.internal.j.e(null, "$operation");
                this$0.a(null);
                return;
            case 14:
                Iterator it2 = ((j0) this.b).n.iterator();
                if (it2.hasNext()) {
                    it2.next().getClass();
                    throw new ClassCastException();
                }
                return;
            case 15:
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
            case 16:
                try {
                    ((Bitmap) this.b).recycle();
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 17:
                bg.r rVar = (bg.r) this.b;
                long j3 = rVar.b;
                if (j3 > 0) {
                    long j10 = j3 - 1;
                    rVar.b = j10;
                    rVar.a.i(j10);
                }
                if (rVar.b <= 0) {
                    rVar.c = false;
                }
                if (rVar.c) {
                    g0.h3(rVar.d, 1000L);
                    return;
                }
                return;
            case 18:
                bi.y yVar = (bi.y) this.b;
                yVar.d2.setTranslationX(yVar.c2.getAnimatedWidth() + g0.L(28.0f));
                return;
            case 19:
                ((t0) this.b).onBackPressed();
                return;
            case 20:
                b1 b1Var = (b1) this.b;
                Drawable drawable = b1Var.Q;
                if (drawable != null && !b1Var.S) {
                    drawable.setAlpha(ks.e4);
                }
                b1Var.a.setAlpha(1.0f);
                if (b1Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) b1Var.getParent()).removeView(b1Var);
                }
                Runnable runnable2 = b1Var.R;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 21:
                c51 c51Var = ((n3) this.b).U1;
                if (c51Var != null) {
                    c51Var.O(false);
                    return;
                }
                return;
            case 22:
                ((c3) this.b).c();
                return;
            case 23:
                ((j3) this.b).invalidateSelf();
                return;
            case 24:
                l3 l3Var = (l3) this.b;
                ec ecVar = l3Var.e;
                if (ecVar != null) {
                    ecVar.d();
                    l3Var.invalidateSelf();
                    return;
                }
                return;
            case 25:
                ((a5) this.b).run();
                return;
            case 26:
                EditTextBoldCursor editTextBoldCursor = ((e5) this.b).o1;
                editTextBoldCursor.requestFocus();
                g0.I3(editTextBoldCursor);
                return;
            case 27:
                ((t6) this.b).p();
                return;
            case 28:
                ((y7) this.b).c.a(Boolean.TRUE);
                return;
            default:
                ((c1.f) this.b).f().a(new w0.h(2, "Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                return;
        }
    }

    public /* synthetic */ f(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }
}
