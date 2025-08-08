package com.google.android.gms.dynamite;

import android.os.Looper;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class zzb {
    private static ClassLoader zza;
    private static Thread zzb;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a3, code lost:
    
        if (r1 == null) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized ClassLoader zza() {
        ClassLoader classLoader;
        SecurityException e;
        Thread thread;
        ThreadGroup threadGroup;
        synchronized (zzb.class) {
            if (zza == null) {
                Thread thread2 = zzb;
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
                                    int i = 0;
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 >= activeGroupCount) {
                                            threadGroup = null;
                                            break;
                                        }
                                        threadGroup = threadGroupArr[i2];
                                        if ("dynamiteLoader".equals(threadGroup.getName())) {
                                            break;
                                        }
                                        i2++;
                                    }
                                    if (threadGroup == null) {
                                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                    }
                                    int activeCount = threadGroup.activeCount();
                                    Thread[] threadArr = new Thread[activeCount];
                                    threadGroup.enumerate(threadArr);
                                    while (true) {
                                        if (i >= activeCount) {
                                            thread = null;
                                            break;
                                        }
                                        thread = threadArr[i];
                                        if ("GmsDynamite".equals(thread.getName())) {
                                            break;
                                        }
                                        i++;
                                    }
                                    if (thread == null) {
                                        try {
                                            zza zzaVar = new zza(threadGroup, "GmsDynamite");
                                            try {
                                                zzaVar.setContextClassLoader(null);
                                                zzaVar.start();
                                                thread = zzaVar;
                                            } catch (SecurityException e2) {
                                                e = e2;
                                                thread = zzaVar;
                                                Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e.getMessage());
                                                thread2 = thread;
                                                zzb = thread2;
                                            }
                                        } catch (SecurityException e3) {
                                            e = e3;
                                        }
                                    }
                                } catch (SecurityException e4) {
                                    e = e4;
                                    thread = null;
                                }
                            } finally {
                            }
                        }
                        thread2 = thread;
                    }
                    zzb = thread2;
                }
                synchronized (thread2) {
                    try {
                        classLoader2 = zzb.getContextClassLoader();
                    } catch (SecurityException e5) {
                        Log.w("DynamiteLoaderV2CL", "Failed to get thread context classloader " + e5.getMessage());
                    }
                }
                zza = classLoader2;
            }
            classLoader = zza;
        }
        return classLoader;
    }
}
