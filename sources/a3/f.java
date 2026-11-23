package a3;

import a8.r7;
import a8.v6;
import a8.w6;
import ab.c0;
import ai.h2;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.os.Trace;
import android.support.v4.media.session.a0;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.j0;
import androidx.fragment.app.u0;
import androidx.lifecycle.e0;
import bi.a8;
import bi.b1;
import bi.c5;
import bi.e3;
import bi.g5;
import bi.l3;
import bi.n3;
import bi.p3;
import bi.t0;
import c8.le;
import c8.n0;
import c8.o0;
import com.google.android.gms.internal.vision.e2;
import di.ec;
import java.nio.MappedByteBuffer;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicMarkableReference;
import m.o3;
import org.json.JSONArray;
import org.telegram.messenger.bz;
import org.telegram.messenger.g0;
import org.telegram.messenger.ks;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f(androidx.fragment.app.l lVar, u0 u0Var) {
        this.a = 12;
        this.b = lVar;
    }

    private final void a() {
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
    private final void b() {
        boolean z10;
        long nativeSessionNew;
        String nativeSessionPush;
        long nativeFileNew;
        String nativeFileNext;
        ai.t tVar = (ai.t) this.b;
        long k10 = DictationAsr.k(tVar.b);
        long j3 = 0;
        if (k10 == 0) {
            tVar.b(tVar.o);
            return;
        }
        DictationAsr.P();
        ai.v vVar = tVar.a;
        synchronized (vVar.a) {
            z10 = vVar.d;
        }
        int i7 = 0;
        if (!z10) {
            String a10 = tVar.b.a(tVar.c);
            String str = a10.split(",")[0];
            nativeSessionNew = DictationAsr.nativeSessionNew(k10, a10, str, bz.o() == 0 ? 2 : 4);
            StringBuilder sb2 = new StringBuilder("tinyasr: session ");
            e2.r(sb2, tVar.b.a, " in ", a10, " (from ");
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
                    if (tVar.l) {
                        break;
                    }
                    boolean z11 = tVar.k;
                    int c10 = tVar.a.c() - i10;
                    if (c10 >= 2) {
                        int min = Math.min(10240, c10 & (-2)) + i10;
                        byte[] b10 = tVar.a.b(i10, min);
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        nativeSessionPush = DictationAsr.nativeSessionPush(nativeSessionNew, b10, 0, b10.length);
                        tVar.a(nativeSessionPush);
                        j10 += SystemClock.elapsedRealtime() - elapsedRealtime2;
                        tVar.m = min;
                        i10 = min;
                    } else if (z11) {
                        break;
                    } else {
                        Thread.sleep(40L);
                    }
                } catch (InterruptedException unused) {
                } catch (Throwable th2) {
                    DictationAsr.nativeSessionFree(nativeSessionNew);
                    DictationAsr.T(tVar.b);
                    throw th2;
                }
            }
            DictationAsr.nativeSessionFree(nativeSessionNew);
            DictationAsr.T(tVar.b);
            tVar.b(tVar.o);
            return;
        }
        long elapsedRealtime3 = SystemClock.elapsedRealtime();
        ai.v vVar2 = tVar.a;
        byte[] b11 = vVar2.b(0, vVar2.c());
        tVar.m = b11.length;
        int length = b11.length / 2;
        float[] fArr = new float[length];
        while (i7 < length) {
            int i11 = i7 * 2;
            fArr[i7] = ((short) ((b11[i11] & 255) | (b11[i11 + 1] << 8))) / 32768.0f;
            i7++;
            j3 = j3;
        }
        long j11 = j3;
        nativeFileNew = DictationAsr.nativeFileNew(k10, fArr, tVar.b.a(tVar.c), bz.o() == 0 ? 2 : 4);
        try {
            if (nativeFileNew == j11) {
                if (nativeFileNew != j11) {
                    DictationAsr.nativeFileFree(nativeFileNew);
                }
                DictationAsr.T(tVar.b);
                while (!tVar.k && !tVar.l) {
                    Thread.sleep(10L);
                }
            } else {
                while (!tVar.l && nativeFileNext != null) {
                    try {
                        try {
                            DictationAsr.o(tVar.e, new JSONArray(nativeFileNext), null);
                        } catch (Exception e10) {
                            Log.e("Dictation", "tinyasr: words " + nativeFileNext, e10);
                        }
                        tVar.b(null);
                    } catch (Throwable th3) {
                        if (nativeFileNew != j11) {
                            DictationAsr.nativeFileFree(nativeFileNew);
                        }
                        DictationAsr.T(tVar.b);
                        while (!tVar.k && !tVar.l) {
                            try {
                                Thread.sleep(10L);
                            } catch (InterruptedException unused2) {
                            }
                        }
                        tVar.b(tVar.o);
                        throw th3;
                    }
                }
                Log.d("Dictation", "tinyasr: file pass in " + tVar.c + ", " + (length / 16) + " ms of audio in " + (SystemClock.elapsedRealtime() - elapsedRealtime3) + " ms");
                if (nativeFileNew != j11) {
                    DictationAsr.nativeFileFree(nativeFileNew);
                }
                DictationAsr.T(tVar.b);
                while (!tVar.k && !tVar.l) {
                    Thread.sleep(10L);
                }
            }
        } catch (InterruptedException unused3) {
        }
        tVar.b(tVar.o);
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
                        n0 n0Var = i0.e.a;
                        le.a("TypefaceCompat.createFromFontInfo");
                        try {
                            Typeface b10 = i0.e.a.b(context, hVarArr, 0);
                            Trace.endSection();
                            MappedByteBuffer e10 = o0.e(rVar.a, d.a);
                            if (e10 == null || b10 == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            try {
                                Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                c0 c0Var = new c0(b10, w6.a(e10));
                                Trace.endSection();
                                synchronized (rVar.d) {
                                    try {
                                        v6 v6Var = rVar.n;
                                        if (v6Var != null) {
                                            v6Var.b(c0Var);
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
                            v6 v6Var2 = rVar.n;
                            if (v6Var2 != null) {
                                v6Var2.a(th3);
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
        boolean z10;
        String str;
        switch (this.a) {
            case 0:
                ((s) this.b).k();
                return;
            case 1:
                a();
                return;
            case 2:
                ab.o0 o0Var = (ab.o0) this.b;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + o0Var.a.getAction() + " finishing.");
                o0Var.b.trySetResult(null);
                return;
            case 3:
                ((ah.c) this.b).f();
                return;
            case 4:
                ((ai.b) this.b).b(null, null);
                return;
            case 5:
                b();
                return;
            case 6:
                g0.I3((EditText) this.b);
                return;
            case 7:
                DictationAsr.i0((ai.q) ((a0) this.b).b, false, new h2());
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
                Iterator it = ((j0) this.b).n.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
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
                bg.r rVar = (bg.r) this.b;
                long j3 = rVar.b;
                if (j3 > 0) {
                    long j10 = j3 - 1;
                    rVar.b = j10;
                    rVar.a.g(j10);
                }
                if (rVar.b <= 0) {
                    rVar.c = false;
                }
                if (rVar.c) {
                    g0.h3(rVar.d, 1000L);
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
            case 20:
                b51 b51Var = ((p3) this.b).U1;
                if (b51Var != null) {
                    b51Var.O(false);
                    return;
                }
                return;
            case 21:
                ((e3) this.b).c();
                return;
            case 22:
                ((l3) this.b).invalidateSelf();
                return;
            case 23:
                n3 n3Var = (n3) this.b;
                ec ecVar = n3Var.e;
                if (ecVar != null) {
                    ecVar.d();
                    n3Var.invalidateSelf();
                    return;
                }
                return;
            case 24:
                ((c5) this.b).run();
                return;
            case 25:
                EditTextBoldCursor editTextBoldCursor = ((g5) this.b).o1;
                editTextBoldCursor.requestFocus();
                g0.I3(editTextBoldCursor);
                return;
            case 26:
                ((bi.v6) this.b).p();
                return;
            case 27:
                ((a8) this.b).c.a(Boolean.TRUE);
                return;
            case 28:
                ((c1.f) this.b).f().T(new w0.h(2, "Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                return;
            default:
                o3 o3Var = (o3) this.b;
                synchronized (((AtomicMarkableReference) o3Var.h)) {
                    try {
                        z10 = false;
                        if (((AtomicMarkableReference) o3Var.h).isMarked()) {
                            str = (String) ((AtomicMarkableReference) o3Var.h).getReference();
                            ((AtomicMarkableReference) o3Var.h).set(str, false);
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
                    return;
                }
                return;
        }
    }

    public /* synthetic */ f(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }
}
