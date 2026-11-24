// default package

import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class lw3 {
    public static final Object i = new Object();
    public static volatile lw3 j;
    public final ReentrantReadWriteLock a;
    public final rs b;
    public volatile byte c;
    public final Handler d;
    public final sj e;
    public final kw3 f;
    public final boolean g;
    public final la3 h;

    public lw3(rl4 rl4Var) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = (byte) 3;
        kw3 kw3Var = rl4Var.a;
        this.f = kw3Var;
        boolean z = rl4Var.b;
        this.g = z;
        this.h = rl4Var.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new rs(0);
        sj sjVar = new sj(this);
        this.e = sjVar;
        reentrantReadWriteLock.writeLock().lock();
        if (!z) {
            try {
                this.c = (byte) 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                kw3Var.b(new hw3(sjVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static lw3 a() {
        lw3 lw3Var;
        synchronized (i) {
            lw3Var = j;
            if (!(lw3Var != null)) {
                throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
            }
        }
        return lw3Var;
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
        if (!(this.g)) {
            sc8.j("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
            return;
        }
        if (b() == 1) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                return;
            }
            this.c = (byte) 0;
            this.a.writeLock().unlock();
            sj sjVar = this.e;
            lw3 lw3Var = (lw3) sjVar.b;
            try {
                lw3Var.f.b(new hw3(sjVar));
            } catch (Throwable th) {
                lw3Var.d(th);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = (byte) 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new jw3(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0163, code lost:
    
        if (r0 != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0168, code lost:
    
        ((pka) r13).b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x016e, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0166, code lost:
    
        if (r0 == false) goto L104;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0086 A[Catch: all -> 0x016f, TryCatch #0 {all -> 0x016f, blocks: (B:28:0x0054, B:30:0x0075, B:32:0x007f, B:34:0x0082, B:36:0x0086, B:38:0x0096, B:40:0x0099, B:44:0x00a6, B:46:0x00ac, B:51:0x00cb, B:73:0x00d6, B:77:0x00e4, B:78:0x00ee, B:63:0x00ff, B:66:0x0106, B:54:0x010b, B:56:0x0116, B:84:0x011d, B:86:0x0121, B:88:0x0129, B:90:0x012d, B:93:0x0135, B:96:0x0143, B:97:0x0149, B:99:0x0159, B:114:0x0050, B:116:0x005d, B:118:0x0061, B:120:0x006e), top: B:113:0x0050 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence e(int i2, int i3, CharSequence charSequence) {
        int i4;
        y3c[] y3cVarArr;
        x5c x5cVar = null;
        if (!(b() == 1)) {
            sc8.j("Not initialized yet");
            return null;
        }
        if (i2 < 0) {
            w26.j("start cannot be negative");
            return null;
        }
        if (i3 < 0) {
            w26.j("end cannot be negative");
            return null;
        }
        if (!(i2 <= i3)) {
            w26.j("start should be <= than end");
            return null;
        }
        if (charSequence == null) {
            return null;
        }
        if (!(i2 <= charSequence.length())) {
            w26.j("start should be < than charSequence length");
            return null;
        }
        if (!(i3 <= charSequence.length())) {
            w26.j("end should be < than charSequence length");
            return null;
        }
        if (charSequence.length() != 0 && i2 != i3) {
            lv6 lv6Var = (lv6) this.e.a;
            lv6Var.getClass();
            boolean z = charSequence instanceof pka;
            if (z) {
                ((pka) charSequence).a();
            } else {
                try {
                    if (!(charSequence instanceof Spannable)) {
                        if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i2 - 1, i3 + 1, y3c.class) <= i3) {
                            x5cVar = new x5c(charSequence);
                        }
                        if (x5cVar != null && (y3cVarArr = (y3c[]) x5cVar.b.getSpans(i2, i3, y3c.class)) != null && y3cVarArr.length > 0) {
                            for (y3c y3cVar : y3cVarArr) {
                                int spanStart = x5cVar.b.getSpanStart(y3cVar);
                                int spanEnd = x5cVar.b.getSpanEnd(y3cVar);
                                if (spanStart != i3) {
                                    x5cVar.removeSpan(y3cVar);
                                }
                                i2 = Math.min(spanStart, i2);
                                i3 = Math.max(spanEnd, i3);
                            }
                        }
                        if (i2 == i3 && i2 < charSequence.length()) {
                            tx3 tx3Var = new tx3((rd7) ((wtc) lv6Var.b).c);
                            int codePointAt = Character.codePointAt(charSequence, i2);
                            x5c x5cVar2 = x5cVar;
                            int i5 = 0;
                            loop1: while (true) {
                                i4 = i2;
                                while (i2 < i3 && i5 < Integer.MAX_VALUE) {
                                    int a = tx3Var.a(codePointAt);
                                    if (a == 1) {
                                        i4 += Character.charCount(Character.codePointAt(charSequence, i4));
                                        if (i4 < i3) {
                                            codePointAt = Character.codePointAt(charSequence, i4);
                                        }
                                        i2 = i4;
                                    } else if (a == 2) {
                                        i2 += Character.charCount(codePointAt);
                                        if (i2 < i3) {
                                            codePointAt = Character.codePointAt(charSequence, i2);
                                        }
                                    } else if (a == 3) {
                                        if (!lv6Var.u(charSequence, i4, i2, ((rd7) tx3Var.f).b)) {
                                            if (x5cVar2 == null) {
                                                x5cVar2 = new x5c((Spannable) new SpannableString(charSequence));
                                            }
                                            x5cVar2.setSpan(new y3c(((rd7) tx3Var.f).b), i4, i2, 33);
                                            i5++;
                                        }
                                    }
                                }
                            }
                            if (tx3Var.a == 2 && ((rd7) tx3Var.e).b != null && ((tx3Var.c > 1 || tx3Var.d()) && i5 < Integer.MAX_VALUE && !lv6Var.u(charSequence, i4, i2, ((rd7) tx3Var.e).b))) {
                                if (x5cVar2 == null) {
                                    x5cVar2 = new x5c(charSequence);
                                }
                                x5cVar2.setSpan(new y3c(((rd7) tx3Var.e).b), i4, i2, 33);
                            }
                            if (x5cVar2 != null) {
                                return x5cVar2.b;
                            }
                        }
                    }
                } finally {
                    if (z) {
                        ((pka) charSequence).b();
                    }
                }
            }
            x5cVar = new x5c((Spannable) charSequence);
            if (x5cVar != null) {
                while (r6 < r5) {
                }
            }
            if (i2 == i3) {
            }
        }
        return charSequence;
    }

    public final void f(iw3 iw3Var) {
        kre.a(iw3Var, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            if (this.c == 1 || this.c == 2) {
                this.d.post(new jw3(Arrays.asList(iw3Var), this.c, null));
            } else {
                this.b.add(iw3Var);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }
}
