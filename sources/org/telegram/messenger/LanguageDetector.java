package org.telegram.messenger;

import android.content.Context;
import com.google.android.gms.tasks.TaskExecutors;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class LanguageDetector {

    /* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
    public interface ExceptionCallback {
        void run(Exception exc);
    }

    /* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
    public interface StringCallback {
        void run(String str);
    }

    public static void detectLanguage(String str, StringCallback stringCallback, ExceptionCallback exceptionCallback) {
        detectLanguage(str, stringCallback, exceptionCallback, false);
    }

    public static boolean hasSupport() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$detectLanguage$0(StringCallback stringCallback, String str) {
        if (stringCallback != null) {
            stringCallback.run(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$detectLanguage$1(ExceptionCallback exceptionCallback, Exception exc) {
        if (exceptionCallback != null) {
            exceptionCallback.run(exc);
        }
    }

    public static void detectLanguage(String str, StringCallback stringCallback, ExceptionCallback exceptionCallback, boolean z10) {
        if (z10) {
            try {
                Context context = ApplicationLoader.applicationContext;
                synchronized (qb.g.b) {
                    qb.g.d(context, TaskExecutors.MAIN_THREAD);
                }
            } catch (IllegalStateException e7) {
                if (!z10) {
                    detectLanguage(str, stringCallback, exceptionCallback, true);
                    return;
                }
                if (exceptionCallback != null) {
                    exceptionCallback.run(e7);
                }
                FileLog.e((Throwable) e7, false);
                return;
            } catch (Exception e10) {
                if (exceptionCallback != null) {
                    exceptionCallback.run(e10);
                }
                FileLog.e(e10);
                return;
            } catch (Throwable th2) {
                if (exceptionCallback != null) {
                    exceptionCallback.run(null);
                }
                FileLog.e(th2, false);
                return;
            }
        }
        w7.g7.a().g(str).addOnSuccessListener(new c0(stringCallback, 5)).addOnFailureListener(new c0(exceptionCallback, 6));
    }
}
