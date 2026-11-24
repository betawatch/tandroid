// default package

import android.graphics.Color;
import android.os.Looper;
import android.util.Log;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public abstract class ddd {
    public static ClassLoader a;
    public static Thread b;
    public static final double[] c = {0.819022437996703d, 0.3619062600528904d, -0.1288737815209879d, 0.0329836539323885d, 0.9292868615863434d, 0.0361446663506424d, 0.0481771893596242d, 0.2642395317527308d, 0.6335478284694309d};
    public static final double[] d = {1.2268798758459243d, -0.5578149944602171d, 0.2813910456659647d, -0.0405757452148008d, 1.112286803280317d, -0.0717110580655164d, -0.0763729366746601d, -0.4214933324022432d, 1.5869240198367816d};
    public static final double[] e = {0.210454268309314d, 0.7936177747023054d, -0.0040720430116193d, 1.9779985324311684d, -2.42859224204858d, 0.450593709617411d, 0.0259040424655478d, 0.7827717124575296d, -0.8086757549230774d};
    public static final double[] f = {1.0d, 0.3963377773761749d, 0.2158037573099136d, 1.0d, -0.1055613458156586d, -0.0638541728258133d, 1.0d, -0.0894841775298119d, -1.2914855480194092d};
    public static final double[] g = {0.41239079926595934d, 0.357584339383878d, 0.1804807884018343d, 0.21263900587151027d, 0.715168678767756d, 0.07219231536073371d, 0.01933081871559182d, 0.11919477979462598d, 0.9505321522496607d};
    public static final double[] h = {3.2409699419045226d, -1.537383177570094d, -0.4986107602930034d, -0.9692436362808796d, 1.8759675015077202d, 0.04155505740717559d, 0.05563007969699366d, -0.20397695888897652d, 1.0569715142428786d};

    public static double[] a(double[] dArr, double[] dArr2) {
        double d2 = dArr[0];
        double d3 = dArr2[0];
        double d4 = dArr[1];
        double d5 = dArr2[1];
        double d6 = dArr[2];
        double d7 = dArr2[2];
        return new double[]{(d6 * d7) + (d4 * d5) + (d2 * d3), (dArr[5] * d7) + (dArr[4] * d5) + (dArr[3] * d3), (dArr[8] * d7) + (dArr[7] * d5) + (dArr[6] * d3)};
    }

    public static double[] b(int i) {
        return new double[]{Color.red(i) / 255.0d, Color.green(i) / 255.0d, Color.blue(i) / 255.0d};
    }

    public static double[] c(double[] dArr) {
        double[] a2 = a(c, a(g, dArr));
        for (int i = 0; i < 3; i++) {
            a2[i] = Math.cbrt(a2[i]);
        }
        double[] a3 = a(e, a2);
        double d2 = a3[0];
        double d3 = a3[1];
        double d4 = a3[2];
        return new double[]{d2, Math.sqrt(Math.pow(d4, 2.0d) + Math.pow(d3, 2.0d)), (Math.abs(d3) >= 2.0E-4d || Math.abs(d4) >= 2.0E-4d) ? ((((Math.atan2(d4, d3) * 180.0d) / 3.141592653589793d) % 360.0d) + 360.0d) % 360.0d : Double.NaN};
    }

    public static double[] d(double[] dArr) {
        double pow;
        double[] dArr2 = new double[3];
        for (int i = 0; i < dArr.length; i++) {
            if (Math.abs(dArr[i]) <= 0.04045d) {
                pow = dArr[i] / 12.92d;
            } else {
                double d2 = dArr[i];
                pow = Math.pow((Math.abs(d2) + 0.055d) / 1.055d, 2.4d) * (d2 < 0.0d ? -1 : 1);
            }
            dArr2[i] = pow;
        }
        return dArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00aa, code lost:
    
        if (r2 == null) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized ClassLoader e() {
        ClassLoader classLoader;
        SecurityException e2;
        Thread thread;
        ThreadGroup threadGroup;
        synchronized (ddd.class) {
            classLoader = a;
            if (classLoader == null) {
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
                                            q6d q6dVar = new q6d(threadGroup, "GmsDynamite");
                                            try {
                                                q6dVar.setContextClassLoader(null);
                                                q6dVar.start();
                                                thread = q6dVar;
                                            } catch (SecurityException e3) {
                                                e2 = e3;
                                                thread = q6dVar;
                                                String message = e2.getMessage();
                                                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 39);
                                                sb.append("Failed to enumerate thread/threadgroup ");
                                                sb.append(message);
                                                Log.w("DynamiteLoaderV2CL", sb.toString());
                                                thread2 = thread;
                                                b = thread2;
                                            }
                                        } catch (SecurityException e4) {
                                            e2 = e4;
                                        }
                                    }
                                } catch (SecurityException e5) {
                                    e2 = e5;
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
                    } catch (SecurityException e6) {
                        String message2 = e6.getMessage();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(message2).length() + 41);
                        sb2.append("Failed to get thread context classloader ");
                        sb2.append(message2);
                        Log.w("DynamiteLoaderV2CL", sb2.toString());
                    }
                }
                classLoader = classLoader2;
                a = classLoader;
            }
        }
        return classLoader;
    }
}
