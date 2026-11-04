package a7;

import android.os.Looper;
import android.util.Log;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class h {
    public static ClassLoader a;
    public static Thread b;

    public static float a(float f10, float f11, float f12, float f13) {
        double d = f10 - f12;
        double d10 = f11 - f13;
        return (float) Math.sqrt((d10 * d10) + (d * d));
    }

    public static float b(int i3, int i10, int i11, int i12) {
        double d = i3 - i11;
        double d10 = i10 - i12;
        return (float) Math.sqrt((d10 * d10) + (d * d));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00b0, code lost:
    
        if (r2 == null) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized ClassLoader c() {
        ClassLoader classLoader;
        SecurityException e10;
        Thread thread;
        ThreadGroup threadGroup;
        synchronized (h.class) {
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
                                    int i3 = 0;
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
                                        if (i3 >= activeCount) {
                                            thread = null;
                                            break;
                                        }
                                        thread = threadArr[i3];
                                        if ("GmsDynamite".equals(thread.getName())) {
                                            break;
                                        }
                                        i3++;
                                    }
                                    if (thread == null) {
                                        try {
                                            g gVar = new g(threadGroup, "GmsDynamite");
                                            try {
                                                gVar.setContextClassLoader(null);
                                                gVar.start();
                                                thread = gVar;
                                            } catch (SecurityException e11) {
                                                e10 = e11;
                                                thread = gVar;
                                                String message = e10.getMessage();
                                                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 39);
                                                sb2.append("Failed to enumerate thread/threadgroup ");
                                                sb2.append(message);
                                                Log.w("DynamiteLoaderV2CL", sb2.toString());
                                                thread2 = thread;
                                                b = thread2;
                                            }
                                        } catch (SecurityException e12) {
                                            e10 = e12;
                                        }
                                    }
                                } finally {
                                }
                            } catch (SecurityException e13) {
                                e10 = e13;
                                thread = null;
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
                        String message2 = e14.getMessage();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(message2).length() + 41);
                        sb3.append("Failed to get thread context classloader ");
                        sb3.append(message2);
                        Log.w("DynamiteLoaderV2CL", sb3.toString());
                    }
                }
                a = classLoader2;
            }
            classLoader = a;
        }
        return classLoader;
    }
}
