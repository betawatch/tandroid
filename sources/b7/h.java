package b7;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.cast.framework.media.internal.ResourceProvider;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class h {
    public static ClassLoader a;
    public static Thread b;

    public static int a(String str) {
        Integer num;
        try {
            Map map = ResourceProvider.a;
            num = (Integer) ResourceProvider.class.getMethod("findResourceByName", String.class).invoke(null, str);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00b0, code lost:
    
        if (r2 == null) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized ClassLoader b() {
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
                                    int i7 = 0;
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
                                        if (i7 >= activeCount) {
                                            thread = null;
                                            break;
                                        }
                                        thread = threadArr[i7];
                                        if ("GmsDynamite".equals(thread.getName())) {
                                            break;
                                        }
                                        i7++;
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
