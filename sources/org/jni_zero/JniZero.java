package org.jni_zero;

import java.util.Collections;
import org.jni_zero.JniPtrImplBase;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
@JNINamespace("jni_zero")
/* loaded from: classes.dex */
public class JniZero {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static boolean sInitialized;
    private static ClassLoader sPendingJniClassLoader;

    /* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
    interface Natives {
        void setJniClassLoader(ClassLoader classLoader);
    }

    /* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
    public interface SafePointersTracker {
        void destroy();
    }

    /* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
    public interface SafePointersTrackerFactory {
        SafePointersTracker create(Object obj, String str);
    }

    private static void crashIfMultiplexingMisaligned(long j, long j2) {
        try {
            long j3 = Class.forName("J.N").getField("WHOLE_HASH").getLong(null);
            long j4 = Class.forName("J.N").getField("PRIORITY_HASH").getLong(null);
            if (j3 == j || j3 == j2 || j4 == j) {
                return;
            }
            throw new RuntimeException("JNI Zero multiplexing hashes do not align. Native: " + j + " or " + j2 + " Java: " + j3 + " or " + j4);
        } catch (ReflectiveOperationException unused) {
        }
    }

    private static long getNativePtr(JniPtrImplBase<?> jniPtrImplBase) {
        return JniZeroInternal.getNativePtr(jniPtrImplBase);
    }

    private static Object[] init(boolean z) {
        sInitialized = true;
        JniPtrImplBase.sRawPtrReleaser = z ? new b() : null;
        ClassLoader classLoader = sPendingJniClassLoader;
        if (classLoader != null) {
            sPendingJniClassLoader = null;
        } else {
            classLoader = JniZero.class.getClassLoader();
        }
        return new Object[]{Collections.EMPTY_LIST, Collections.EMPTY_MAP, classLoader};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$init$1(long j) {
        CommonApisJni.get().releaseRawPtr(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JniPtrImplBase.Tracker lambda$setSafePointersTrackerFactory$0(SafePointersTrackerFactory safePointersTrackerFactory, Object obj, String str) {
        SafePointersTracker create = safePointersTrackerFactory.create(obj, str);
        if (create == null) {
            return null;
        }
        return new a(create);
    }

    public static void setJniClassLoader(ClassLoader classLoader) {
        if (sInitialized) {
            JniZeroJni.get().setJniClassLoader(classLoader);
        } else {
            sPendingJniClassLoader = classLoader;
        }
    }

    public static void setSafePointersTrackerFactory(SafePointersTrackerFactory safePointersTrackerFactory) {
        JniPtrImplBase.sTrackerFactory = safePointersTrackerFactory == null ? null : new a(safePointersTrackerFactory);
    }
}
