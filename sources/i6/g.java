package i6;

import android.os.Looper;
import android.util.Log;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class g {
    public static ClassLoader a;
    public static Thread b;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a4, code lost:
    
        if (r1 == null) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized ClassLoader a() {
        ClassLoader classLoader;
        SecurityException e10;
        Thread thread;
        ThreadGroup threadGroup;
        f fVar;
        synchronized (g.class) {
            if (a == null) {
                Thread thread2 = b;
                ClassLoader classLoader2 = null;
                if (thread2 == null) {
                    ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                    if (threadGroup2 == null) {
                        thread2 = null;
                    } else {
                        synchronized (Void.class) {
                            try {
                                try {
                                    int activeGroupCount = threadGroup2.activeGroupCount();
                                    ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                                    threadGroup2.enumerate(threadGroupArr);
                                    int i9 = 0;
                                    int i10 = 0;
                                    while (true) {
                                        if (i10 >= activeGroupCount) {
                                            threadGroup = null;
                                            break;
                                        }
                                        threadGroup = threadGroupArr[i10];
                                        if ("dynamiteLoader".equals(threadGroup.getName())) {
                                            break;
                                        }
                                        i10++;
                                    }
                                    if (threadGroup == null) {
                                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                    }
                                    int activeCount = threadGroup.activeCount();
                                    Thread[] threadArr = new Thread[activeCount];
                                    threadGroup.enumerate(threadArr);
                                    while (true) {
                                        if (i9 >= activeCount) {
                                            thread = null;
                                            break;
                                        }
                                        thread = threadArr[i9];
                                        if ("GmsDynamite".equals(thread.getName())) {
                                            break;
                                        }
                                        i9++;
                                    }
                                    if (thread == null) {
                                        try {
                                            fVar = new f(threadGroup, "GmsDynamite");
                                        } catch (SecurityException e11) {
                                            e10 = e11;
                                        }
                                        try {
                                            fVar.setContextClassLoader(null);
                                            fVar.start();
                                            thread = fVar;
                                        } catch (SecurityException e12) {
                                            e10 = e12;
                                            thread = fVar;
                                            Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e10.getMessage());
                                            thread2 = thread;
                                            b = thread2;
                                        }
                                    }
                                } catch (SecurityException e13) {
                                    e10 = e13;
                                    thread = null;
                                }
                            } finally {
                            }
                        }
                        thread2 = thread;
                    }
                    b = thread2;
                }
                synchronized (thread2) {
                    try {
                        classLoader2 = b.getContextClassLoader();
                    } catch (SecurityException e14) {
                        Log.w("DynamiteLoaderV2CL", "Failed to get thread context classloader " + e14.getMessage());
                    }
                }
                a = classLoader2;
            }
            classLoader = a;
        }
        return classLoader;
    }
}
