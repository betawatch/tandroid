package e2;

import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class a {
    public static ExecutorService a;
    public static final Object b = new Object();

    public static String a(String str, Throwable th2) {
        String replace;
        if (th2 != null) {
            synchronized (b) {
                Throwable th3 = th2;
                while (true) {
                    if (th3 == null) {
                        replace = Log.getStackTraceString(th2).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (th3 instanceof UnknownHostException) {
                            replace = "UnknownHostException (no network)";
                        } else {
                            th3 = th3.getCause();
                        }
                    } finally {
                    }
                }
            }
        } else {
            replace = null;
        }
        if (TextUtils.isEmpty(replace)) {
            return str;
        }
        StringBuilder g10 = w.f.g(str, "\n  ");
        g10.append(replace.replace("\n", "\n  "));
        g10.append('\n');
        return g10.toString();
    }

    public static void b() {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z10) {
                sb2.append('\n');
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = "error code: 0x" + Integer.toHexString(glGetError);
            }
            sb2.append("glError: ");
            sb2.append(gluErrorString);
            z10 = true;
        }
        if (z10) {
            throw new k(sb2.toString());
        }
    }

    public static void c(String str, boolean z10) {
        if (!z10) {
            throw new k(str);
        }
    }

    public static void d(String str, String str2) {
        synchronized (b) {
            Log.d(str, a(str2, null));
        }
    }

    public static void e(String str, String str2) {
        synchronized (b) {
            Log.e(str, a(str2, null));
        }
    }

    public static void f(String str, String str2, Throwable th2) {
        synchronized (b) {
            Log.e(str, a(str2, th2));
        }
    }

    public static synchronized Executor g() {
        ExecutorService executorService;
        synchronized (a.class) {
            try {
                if (a == null) {
                    String str = d0.a;
                    a = Executors.newSingleThreadExecutor(new androidx.emoji2.text.a("ExoPlayer:BackgroundExecutor", 1));
                }
                executorService = a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return executorService;
    }

    public static int[] h(String str) {
        int i10;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i11 = indexOf4 + 2;
        if (i11 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i11) == '/') {
            i10 = str.indexOf(47, indexOf4 + 3);
            if (i10 == -1 || i10 > indexOf2) {
                i10 = indexOf2;
            }
        } else {
            i10 = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i10;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    public static void i(String str, String str2) {
        synchronized (b) {
            Log.i(str, a(str2, null));
        }
    }

    public static boolean j(String str) {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        c("No EGL display.", !eglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
        c("Error in eglInitialize.", EGL14.eglInitialize(eglGetDisplay, new int[1], 0, new int[1], 0));
        b();
        String eglQueryString = EGL14.eglQueryString(eglGetDisplay, 12373);
        return eglQueryString != null && eglQueryString.contains(str);
    }

    public static String k(StringBuilder sb2, int i10, int i11) {
        int i12;
        int i13;
        if (i10 >= i11) {
            return sb2.toString();
        }
        if (sb2.charAt(i10) == '/') {
            i10++;
        }
        int i14 = i10;
        int i15 = i14;
        while (i14 <= i11) {
            if (i14 == i11) {
                i12 = i14;
            } else if (sb2.charAt(i14) == '/') {
                i12 = i14 + 1;
            } else {
                i14++;
            }
            int i16 = i15 + 1;
            if (i14 == i16 && sb2.charAt(i15) == '.') {
                sb2.delete(i15, i12);
                i11 -= i12 - i15;
            } else {
                if (i14 == i15 + 2 && sb2.charAt(i15) == '.' && sb2.charAt(i16) == '.') {
                    i13 = sb2.lastIndexOf("/", i15 - 2) + 1;
                    int i17 = i13 > i10 ? i13 : i10;
                    sb2.delete(i17, i12);
                    i11 -= i12 - i17;
                } else {
                    i13 = i14 + 1;
                }
                i15 = i13;
            }
            i14 = i15;
        }
        return sb2.toString();
    }

    public static String l(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] h = h(str2);
        if (h[0] != -1) {
            sb2.append(str2);
            k(sb2, h[1], h[2]);
            return sb2.toString();
        }
        int[] h10 = h(str);
        if (h[3] == 0) {
            sb2.append((CharSequence) str, 0, h10[3]);
            sb2.append(str2);
            return sb2.toString();
        }
        if (h[2] == 0) {
            sb2.append((CharSequence) str, 0, h10[2]);
            sb2.append(str2);
            return sb2.toString();
        }
        int i10 = h[1];
        if (i10 != 0) {
            int i11 = h10[0] + 1;
            sb2.append((CharSequence) str, 0, i11);
            sb2.append(str2);
            return k(sb2, h[1] + i11, i11 + h[2]);
        }
        if (str2.charAt(i10) == '/') {
            sb2.append((CharSequence) str, 0, h10[1]);
            sb2.append(str2);
            int i12 = h10[1];
            return k(sb2, i12, h[2] + i12);
        }
        int i13 = h10[0] + 2;
        int i14 = h10[1];
        if (i13 >= i14 || i14 != h10[2]) {
            int lastIndexOf = str.lastIndexOf(47, h10[2] - 1);
            int i15 = lastIndexOf == -1 ? h10[1] : lastIndexOf + 1;
            sb2.append((CharSequence) str, 0, i15);
            sb2.append(str2);
            return k(sb2, h10[1], i15 + h[2]);
        }
        sb2.append((CharSequence) str, 0, i14);
        sb2.append('/');
        sb2.append(str2);
        int i16 = h10[1];
        return k(sb2, i16, h[2] + i16 + 1);
    }

    public static Uri m(String str, String str2) {
        return Uri.parse(l(str, str2));
    }

    public static void n(String str, String str2) {
        synchronized (b) {
            Log.w(str, a(str2, null));
        }
    }

    public static void o(String str, String str2, Throwable th2) {
        synchronized (b) {
            Log.w(str, a(str2, th2));
        }
    }
}
