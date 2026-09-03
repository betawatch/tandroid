package i9;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class r implements Thread.UncaughtExceptionHandler {
    public final y5.h a;
    public final e3.g b;
    public final Thread.UncaughtExceptionHandler c;
    public final f9.a d;
    public final AtomicBoolean e = new AtomicBoolean(false);

    public r(y5.h hVar, e3.g gVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, f9.a aVar) {
        this.a = hVar;
        this.b = gVar;
        this.c = uncaughtExceptionHandler;
        this.d = aVar;
    }

    public final boolean a(Thread thread, Throwable th2) {
        if (thread == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null thread", null);
            return false;
        }
        if (th2 == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null throwable", null);
            return false;
        }
        if (!this.d.b()) {
            return true;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; native crash exists for session.", null);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        r0.uncaughtException(r10, r11);
        r4.set(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        if (android.util.Log.isLoggable("FirebaseCrashlytics", 3) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
    
        if (android.util.Log.isLoggable("FirebaseCrashlytics", 3) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        android.util.Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", null);
     */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void uncaughtException(Thread thread, Throwable th2) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.c;
        AtomicBoolean atomicBoolean = this.e;
        atomicBoolean.set(true);
        try {
            try {
                if (a(thread, th2)) {
                    this.a.t(this.b, thread, th2);
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Uncaught exception will not be recorded by Crashlytics.", null);
                }
            } catch (Exception e6) {
                Log.e("FirebaseCrashlytics", "An error occurred in the uncaught exception handler", e6);
            }
        } catch (Throwable th3) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", null);
            }
            uncaughtExceptionHandler.uncaughtException(thread, th2);
            atomicBoolean.set(false);
            throw th3;
        }
    }
}
