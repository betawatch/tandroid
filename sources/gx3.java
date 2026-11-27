// default package

import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class gx3 {
    public static final Object i = new Object();
    public static volatile gx3 j;
    public final ReentrantReadWriteLock a;
    public final ss b;
    public volatile byte c;
    public final Handler d;
    public final tj e;
    public final fx3 f;
    public final boolean g;
    public final eb3 h;

    public gx3(wn4 wn4Var) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = (byte) 3;
        fx3 fx3Var = wn4Var.a;
        this.f = fx3Var;
        boolean z = wn4Var.b;
        this.g = z;
        this.h = wn4Var.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new ss(0);
        tj tjVar = new tj(this);
        this.e = tjVar;
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
                fx3Var.b(new cx3(tjVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static gx3 a() {
        gx3 gx3Var;
        synchronized (i) {
            gx3Var = j;
            if (!(gx3Var != null)) {
                throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
            }
        }
        return gx3Var;
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
            grb.i("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
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
            tj tjVar = this.e;
            gx3 gx3Var = (gx3) tjVar.b;
            try {
                gx3Var.f.b(new cx3(tjVar));
            } catch (Throwable th) {
                gx3Var.d(th);
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
            this.d.post(new ex3(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0163, code lost:
    
        if (r0 != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0168, code lost:
    
        ((joa) r13).b();
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
        x7c[] x7cVarArr;
        x9c x9cVar = null;
        if (!(b() == 1)) {
            grb.i("Not initialized yet");
            return null;
        }
        if (i2 < 0) {
            lq5.j("start cannot be negative");
            return null;
        }
        if (i3 < 0) {
            lq5.j("end cannot be negative");
            return null;
        }
        if (!(i2 <= i3)) {
            lq5.j("start should be <= than end");
            return null;
        }
        if (charSequence == null) {
            return null;
        }
        if (!(i2 <= charSequence.length())) {
            lq5.j("start should be < than charSequence length");
            return null;
        }
        if (!(i3 <= charSequence.length())) {
            lq5.j("end should be < than charSequence length");
            return null;
        }
        if (charSequence.length() != 0 && i2 != i3) {
            qx6 qx6Var = (qx6) this.e.a;
            qx6Var.getClass();
            boolean z = charSequence instanceof joa;
            if (z) {
                ((joa) charSequence).a();
            } else {
                try {
                    if (!(charSequence instanceof Spannable)) {
                        if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i2 - 1, i3 + 1, x7c.class) <= i3) {
                            x9cVar = new x9c(charSequence);
                        }
                        if (x9cVar != null && (x7cVarArr = (x7c[]) x9cVar.b.getSpans(i2, i3, x7c.class)) != null && x7cVarArr.length > 0) {
                            for (x7c x7cVar : x7cVarArr) {
                                int spanStart = x9cVar.b.getSpanStart(x7cVar);
                                int spanEnd = x9cVar.b.getSpanEnd(x7cVar);
                                if (spanStart != i3) {
                                    x9cVar.removeSpan(x7cVar);
                                }
                                i2 = Math.min(spanStart, i2);
                                i3 = Math.max(spanEnd, i3);
                            }
                        }
                        if (i2 == i3 && i2 < charSequence.length()) {
                            oy3 oy3Var = new oy3((ag7) ((u8a) qx6Var.b).c);
                            int codePointAt = Character.codePointAt(charSequence, i2);
                            x9c x9cVar2 = x9cVar;
                            int i5 = 0;
                            loop1: while (true) {
                                i4 = i2;
                                while (i2 < i3 && i5 < Integer.MAX_VALUE) {
                                    int a = oy3Var.a(codePointAt);
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
                                        if (!qx6Var.w(charSequence, i4, i2, ((ag7) oy3Var.f).b)) {
                                            if (x9cVar2 == null) {
                                                x9cVar2 = new x9c((Spannable) new SpannableString(charSequence));
                                            }
                                            x9cVar2.setSpan(new x7c(((ag7) oy3Var.f).b), i4, i2, 33);
                                            i5++;
                                        }
                                    }
                                }
                            }
                            if (oy3Var.a == 2 && ((ag7) oy3Var.e).b != null && ((oy3Var.c > 1 || oy3Var.d()) && i5 < Integer.MAX_VALUE && !qx6Var.w(charSequence, i4, i2, ((ag7) oy3Var.e).b))) {
                                if (x9cVar2 == null) {
                                    x9cVar2 = new x9c(charSequence);
                                }
                                x9cVar2.setSpan(new x7c(((ag7) oy3Var.e).b), i4, i2, 33);
                            }
                            if (x9cVar2 != null) {
                                return x9cVar2.b;
                            }
                        }
                    }
                } finally {
                    if (z) {
                        ((joa) charSequence).b();
                    }
                }
            }
            x9cVar = new x9c((Spannable) charSequence);
            if (x9cVar != null) {
                while (r6 < r5) {
                }
            }
            if (i2 == i3) {
            }
        }
        return charSequence;
    }

    public final void f(dx3 dx3Var) {
        ewe.a(dx3Var, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            if (this.c == 1 || this.c == 2) {
                this.d.post(new ex3(Arrays.asList(dx3Var), this.c, null));
            } else {
                this.b.add(dx3Var);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }
}
