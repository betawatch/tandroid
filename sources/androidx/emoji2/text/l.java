package androidx.emoji2.text;

import ag.h1;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import h7.m6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class l {
    public static final Object i = new Object();
    public static volatile l j;
    public final ReentrantReadWriteLock a;
    public final a0.g b;
    public volatile int c;
    public final Handler d;
    public final f e;
    public final k f;
    public final int g;
    public final d h;

    public l(q qVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = 3;
        k kVar = (k) qVar.b;
        this.f = kVar;
        int i10 = qVar.a;
        this.g = i10;
        this.h = (d) qVar.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new a0.g(0);
        f fVar = new f(this);
        this.e = fVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i10 == 0) {
            try {
                this.c = 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                kVar.a(new e(fVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static l a() {
        l lVar;
        synchronized (i) {
            try {
                lVar = j;
                if (!(lVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return lVar;
    }

    public final int b() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.g == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                return;
            }
            this.c = 0;
            this.a.writeLock().unlock();
            f fVar = this.e;
            l lVar = (l) fVar.c;
            try {
                lVar.f.a(new e(fVar));
            } catch (Throwable th) {
                lVar.d(th);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new j(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0173, code lost:
    
        if (r4 != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0175, code lost:
    
        ((androidx.emoji2.text.t) r14).b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x017b, code lost:
    
        return r14;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0154 A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:119:0x0053, B:122:0x0058, B:124:0x005c, B:126:0x0069, B:32:0x007c, B:34:0x0086, B:36:0x0089, B:38:0x008d, B:40:0x009d, B:42:0x00a0, B:46:0x00ad, B:49:0x00b5, B:54:0x00db, B:78:0x00e7, B:82:0x00f5, B:83:0x00ff, B:66:0x0110, B:69:0x0117, B:57:0x011c, B:59:0x0127, B:88:0x012e, B:90:0x0132, B:92:0x013a, B:94:0x013e, B:97:0x0146, B:100:0x0154, B:101:0x0159, B:103:0x0169, B:30:0x0072), top: B:118:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0169 A[Catch: all -> 0x006f, TRY_LEAVE, TryCatch #0 {all -> 0x006f, blocks: (B:119:0x0053, B:122:0x0058, B:124:0x005c, B:126:0x0069, B:32:0x007c, B:34:0x0086, B:36:0x0089, B:38:0x008d, B:40:0x009d, B:42:0x00a0, B:46:0x00ad, B:49:0x00b5, B:54:0x00db, B:78:0x00e7, B:82:0x00f5, B:83:0x00ff, B:66:0x0110, B:69:0x0117, B:57:0x011c, B:59:0x0127, B:88:0x012e, B:90:0x0132, B:92:0x013a, B:94:0x013e, B:97:0x0146, B:100:0x0154, B:101:0x0159, B:103:0x0169, B:30:0x0072), top: B:118:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008d A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:119:0x0053, B:122:0x0058, B:124:0x005c, B:126:0x0069, B:32:0x007c, B:34:0x0086, B:36:0x0089, B:38:0x008d, B:40:0x009d, B:42:0x00a0, B:46:0x00ad, B:49:0x00b5, B:54:0x00db, B:78:0x00e7, B:82:0x00f5, B:83:0x00ff, B:66:0x0110, B:69:0x0117, B:57:0x011c, B:59:0x0127, B:88:0x012e, B:90:0x0132, B:92:0x013a, B:94:0x013e, B:97:0x0146, B:100:0x0154, B:101:0x0159, B:103:0x0169, B:30:0x0072), top: B:118:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence e(int i10, int i11, CharSequence charSequence) {
        h1 h1Var;
        x xVar;
        int codePointAt;
        int i12;
        int a2;
        u[] uVarArr;
        if (!(b() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        if (!(i10 <= i11)) {
            throw new IllegalArgumentException("start should be <= than end");
        }
        x xVar2 = null;
        if (charSequence == null) {
            return null;
        }
        if (!(i10 <= charSequence.length())) {
            throw new IllegalArgumentException("start should be < than charSequence length");
        }
        if (!(i11 <= charSequence.length())) {
            throw new IllegalArgumentException("end should be < than charSequence length");
        }
        if (charSequence.length() != 0 && i10 != i11) {
            xe.b bVar = (xe.b) this.e.a;
            bVar.getClass();
            boolean z10 = charSequence instanceof t;
            if (z10) {
                ((t) charSequence).a();
            }
            if (!z10) {
                try {
                    if (!(charSequence instanceof Spannable)) {
                        if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i10 - 1, i11 + 1, u.class) <= i11) {
                            xVar2 = new x(charSequence);
                        }
                        if (xVar2 != null && (uVarArr = (u[]) xVar2.b.getSpans(i10, i11, u.class)) != null && uVarArr.length > 0) {
                            for (u uVar : uVarArr) {
                                int spanStart = xVar2.b.getSpanStart(uVar);
                                int spanEnd = xVar2.b.getSpanEnd(uVar);
                                if (spanStart != i11) {
                                    xVar2.removeSpan(uVar);
                                }
                                i10 = Math.min(spanStart, i10);
                                i11 = Math.max(spanEnd, i11);
                            }
                        }
                        if (i10 != i11 && i10 < charSequence.length()) {
                            r rVar = (r) ((com.google.firebase.messaging.t) bVar.b).d;
                            h1Var = new h1();
                            h1Var.a = 1;
                            h1Var.d = rVar;
                            h1Var.e = rVar;
                            xVar = xVar2;
                            codePointAt = Character.codePointAt(charSequence, i10);
                            int i13 = 0;
                            loop1: while (true) {
                                i12 = i10;
                                while (i10 < i11 && i13 < Integer.MAX_VALUE) {
                                    a2 = h1Var.a(codePointAt);
                                    if (a2 != 1) {
                                        i12 += Character.charCount(Character.codePointAt(charSequence, i12));
                                        if (i12 < i11) {
                                            codePointAt = Character.codePointAt(charSequence, i12);
                                        }
                                        i10 = i12;
                                    } else if (a2 == 2) {
                                        i10 += Character.charCount(codePointAt);
                                        if (i10 < i11) {
                                            codePointAt = Character.codePointAt(charSequence, i10);
                                        }
                                    } else if (a2 == 3) {
                                        if (!bVar.F(charSequence, i12, i10, ((r) h1Var.f).b)) {
                                            if (xVar == null) {
                                                xVar = new x((Spannable) new SpannableString(charSequence));
                                            }
                                            xVar.setSpan(new u(((r) h1Var.f).b), i12, i10, 33);
                                            i13++;
                                        }
                                    }
                                }
                            }
                            if (h1Var.a == 2 && ((r) h1Var.e).b != null && ((h1Var.c > 1 || h1Var.e()) && i13 < Integer.MAX_VALUE && !bVar.F(charSequence, i12, i10, ((r) h1Var.e).b))) {
                                if (xVar == null) {
                                    xVar = new x(charSequence);
                                }
                                xVar.setSpan(new u(((r) h1Var.e).b), i12, i10, 33);
                            }
                            if (xVar == null) {
                                Spannable spannable = xVar.b;
                                if (z10) {
                                    ((t) charSequence).b();
                                }
                                return spannable;
                            }
                        }
                    }
                } catch (Throwable th) {
                    if (z10) {
                        ((t) charSequence).b();
                    }
                    throw th;
                }
            }
            xVar2 = new x((Spannable) charSequence);
            if (xVar2 != null) {
                while (r7 < r6) {
                }
            }
            if (i10 != i11) {
                r rVar2 = (r) ((com.google.firebase.messaging.t) bVar.b).d;
                h1Var = new h1();
                h1Var.a = 1;
                h1Var.d = rVar2;
                h1Var.e = rVar2;
                xVar = xVar2;
                codePointAt = Character.codePointAt(charSequence, i10);
                int i132 = 0;
                loop1: while (true) {
                    i12 = i10;
                    while (i10 < i11) {
                        a2 = h1Var.a(codePointAt);
                        if (a2 != 1) {
                        }
                    }
                }
                if (h1Var.a == 2) {
                    if (xVar == null) {
                    }
                    xVar.setSpan(new u(((r) h1Var.e).b), i12, i10, 33);
                }
                if (xVar == null) {
                }
            }
        }
        return charSequence;
    }

    public final void f(i iVar) {
        m6.a(iVar, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            if (this.c != 1 && this.c != 2) {
                this.b.add(iVar);
                this.a.writeLock().unlock();
            }
            this.d.post(new j(Arrays.asList(iVar), this.c, (Throwable) null));
            this.a.writeLock().unlock();
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }
}
