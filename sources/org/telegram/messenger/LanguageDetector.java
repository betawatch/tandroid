package org.telegram.messenger;

import android.content.Context;
import com.google.android.gms.tasks.TaskExecutors;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class LanguageDetector {

    /* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
    public interface ExceptionCallback {
        void run(Exception exc);
    }

    /* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                synchronized (za.g.b) {
                    za.g.d(context, TaskExecutors.MAIN_THREAD);
                }
            } catch (IllegalStateException e9) {
                if (!z10) {
                    detectLanguage(str, stringCallback, exceptionCallback, true);
                    return;
                }
                if (exceptionCallback != null) {
                    exceptionCallback.run(e9);
                }
                FileLog.e((Throwable) e9, false);
                return;
            } catch (Exception e10) {
                if (exceptionCallback != null) {
                    exceptionCallback.run(e10);
                }
                FileLog.e(e10);
                return;
            } catch (Throwable th) {
                if (exceptionCallback != null) {
                    exceptionCallback.run(null);
                }
                FileLog.e(th, false);
                return;
            }
        }
        g7.g0.a().g(str).addOnSuccessListener(new d(stringCallback, 6)).addOnFailureListener(new d(exceptionCallback, 7));
    }
}
