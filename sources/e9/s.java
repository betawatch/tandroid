package e9;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class s implements Thread.UncaughtExceptionHandler {
    public final fa.c a;
    public final c3.h b;
    public final Thread.UncaughtExceptionHandler c;
    public final b9.b d;
    public final AtomicBoolean e = new AtomicBoolean(false);

    public s(fa.c cVar, c3.h hVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, b9.b bVar) {
        this.a = cVar;
        this.b = hVar;
        this.c = uncaughtExceptionHandler;
        this.d = bVar;
    }

    public final boolean a(Thread thread, Throwable th) {
        if (thread == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null thread", null);
            return false;
        }
        if (th == null) {
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
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.c;
        AtomicBoolean atomicBoolean = this.e;
        atomicBoolean.set(true);
        try {
            try {
                if (a(thread, th)) {
                    this.a.K(this.b, thread, th);
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Uncaught exception will not be recorded by Crashlytics.", null);
                }
            } catch (Exception e10) {
                Log.e("FirebaseCrashlytics", "An error occurred in the uncaught exception handler", e10);
            }
        } catch (Throwable th2) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", null);
            }
            uncaughtExceptionHandler.uncaughtException(thread, th);
            atomicBoolean.set(false);
            throw th2;
        }
    }
}
