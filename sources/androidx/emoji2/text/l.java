package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import com.google.android.gms.internal.play_billing.s1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    public l(s sVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = 3;
        k kVar = (k) sVar.b;
        this.f = kVar;
        int i3 = sVar.a;
        this.g = i3;
        this.h = (d) sVar.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new a0.g(0);
        f fVar = new f(this);
        this.e = fVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i3 == 0) {
            try {
                this.c = 0;
            } catch (Throwable th2) {
                this.a.writeLock().unlock();
                throw th2;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                kVar.a(new e(fVar));
            } catch (Throwable th3) {
                d(th3);
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
            l lVar = (l) fVar.b;
            try {
                lVar.f.a(new e(fVar));
            } catch (Throwable th2) {
                lVar.d(th2);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public final void d(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new j(arrayList, this.c, th2));
        } catch (Throwable th3) {
            this.a.writeLock().unlock();
            throw th3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0173, code lost:
    
        if (r4 != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0175, code lost:
    
        ((androidx.emoji2.text.v) r14).b();
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
    public final CharSequence e(int i3, int i10, CharSequence charSequence) {
        q qVar;
        int codePointAt;
        z zVar;
        int i11;
        int a10;
        w[] wVarArr;
        if (!(b() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        if (!(i3 <= i10)) {
            throw new IllegalArgumentException("start should be <= than end");
        }
        z zVar2 = null;
        if (charSequence == null) {
            return null;
        }
        if (!(i3 <= charSequence.length())) {
            throw new IllegalArgumentException("start should be < than charSequence length");
        }
        if (!(i10 <= charSequence.length())) {
            throw new IllegalArgumentException("end should be < than charSequence length");
        }
        if (charSequence.length() != 0 && i3 != i10) {
            p4.q qVar2 = (p4.q) this.e.a;
            qVar2.getClass();
            boolean z10 = charSequence instanceof v;
            if (z10) {
                ((v) charSequence).a();
            }
            if (!z10) {
                try {
                    if (!(charSequence instanceof Spannable)) {
                        if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i3 - 1, i10 + 1, w.class) <= i10) {
                            zVar2 = new z(charSequence);
                        }
                        if (zVar2 != null && (wVarArr = (w[]) zVar2.b.getSpans(i3, i10, w.class)) != null && wVarArr.length > 0) {
                            for (w wVar : wVarArr) {
                                int spanStart = zVar2.b.getSpanStart(wVar);
                                int spanEnd = zVar2.b.getSpanEnd(wVar);
                                if (spanStart != i10) {
                                    zVar2.removeSpan(wVar);
                                }
                                i3 = Math.min(spanStart, i3);
                                i10 = Math.max(spanEnd, i10);
                            }
                        }
                        if (i3 != i10 && i3 < charSequence.length()) {
                            t tVar = (t) ((ui.f) qVar2.a).d;
                            qVar = new q();
                            qVar.a = 1;
                            qVar.d = tVar;
                            qVar.e = tVar;
                            codePointAt = Character.codePointAt(charSequence, i3);
                            int i12 = 0;
                            zVar = zVar2;
                            loop1: while (true) {
                                i11 = i3;
                                while (i3 < i10 && i12 < Integer.MAX_VALUE) {
                                    a10 = qVar.a(codePointAt);
                                    if (a10 != 1) {
                                        i11 += Character.charCount(Character.codePointAt(charSequence, i11));
                                        if (i11 < i10) {
                                            codePointAt = Character.codePointAt(charSequence, i11);
                                        }
                                        i3 = i11;
                                    } else if (a10 == 2) {
                                        i3 += Character.charCount(codePointAt);
                                        if (i3 < i10) {
                                            codePointAt = Character.codePointAt(charSequence, i3);
                                        }
                                    } else if (a10 == 3) {
                                        if (!qVar2.y(charSequence, i11, i3, ((t) qVar.f).b)) {
                                            if (zVar == null) {
                                                zVar = new z((Spannable) new SpannableString(charSequence));
                                            }
                                            zVar.setSpan(new w(((t) qVar.f).b), i11, i3, 33);
                                            i12++;
                                        }
                                    }
                                }
                            }
                            if (qVar.a == 2 && ((t) qVar.e).b != null && ((qVar.c > 1 || qVar.e()) && i12 < Integer.MAX_VALUE && !qVar2.y(charSequence, i11, i3, ((t) qVar.e).b))) {
                                if (zVar == null) {
                                    zVar = new z(charSequence);
                                }
                                zVar.setSpan(new w(((t) qVar.e).b), i11, i3, 33);
                            }
                            if (zVar == null) {
                                Spannable spannable = zVar.b;
                                if (z10) {
                                    ((v) charSequence).b();
                                }
                                return spannable;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    if (z10) {
                        ((v) charSequence).b();
                    }
                    throw th2;
                }
            }
            zVar2 = new z((Spannable) charSequence);
            if (zVar2 != null) {
                while (r7 < r6) {
                }
            }
            if (i3 != i10) {
                t tVar2 = (t) ((ui.f) qVar2.a).d;
                qVar = new q();
                qVar.a = 1;
                qVar.d = tVar2;
                qVar.e = tVar2;
                codePointAt = Character.codePointAt(charSequence, i3);
                int i122 = 0;
                zVar = zVar2;
                loop1: while (true) {
                    i11 = i3;
                    while (i3 < i10) {
                        a10 = qVar.a(codePointAt);
                        if (a10 != 1) {
                        }
                    }
                }
                if (qVar.a == 2) {
                    if (zVar == null) {
                    }
                    zVar.setSpan(new w(((t) qVar.e).b), i11, i3, 33);
                }
                if (zVar == null) {
                }
            }
        }
        return charSequence;
    }

    public final void f(i iVar) {
        s1.a(iVar, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            if (this.c != 1 && this.c != 2) {
                this.b.add(iVar);
                this.a.writeLock().unlock();
            }
            this.d.post(new j(Arrays.asList(iVar), this.c, (Throwable) null));
            this.a.writeLock().unlock();
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }
}
