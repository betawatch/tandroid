package org.telegram.messenger;

import android.content.Context;
import com.google.android.gms.tasks.TaskExecutors;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public class LanguageDetector {

    /* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
    public interface ExceptionCallback {
        void run(Exception exc);
    }

    /* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                synchronized (sb.g.b) {
                    sb.g.d(context, TaskExecutors.MAIN_THREAD);
                }
            } catch (IllegalStateException e) {
                if (!z10) {
                    detectLanguage(str, stringCallback, exceptionCallback, true);
                    return;
                }
                if (exceptionCallback != null) {
                    exceptionCallback.run(e);
                }
                FileLog.e((Throwable) e, false);
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
        w7.p.a().g(str).addOnSuccessListener(new g0(stringCallback, 5)).addOnFailureListener(new g0(exceptionCallback, 6));
    }
}
