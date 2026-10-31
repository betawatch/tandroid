package org.telegram.messenger;

import android.graphics.Typeface;
import android.os.Debug;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.time.FastDateFormat;
import org.telegram.messenger.video.MediaCodecVideoConvertor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class f8 {
    public static boolean j = false;
    public static volatile f8 k;
    public static long l;
    public OutputStreamWriter a;
    public FastDateFormat b;
    public FastDateFormat c;
    public r5 d;
    public File e;
    public File f;
    public boolean g;
    public OutputStreamWriter h;
    public File i;

    static {
        new AtomicInteger();
    }

    public static void a() {
        File[] listFiles;
        h();
        File P0 = i0.P0();
        if (P0 == null || (listFiles = P0.listFiles()) == null) {
            return;
        }
        for (File file : listFiles) {
            if ((j().e == null || !file.getAbsolutePath().equals(j().e.getAbsolutePath())) && (j().f == null || !file.getAbsolutePath().equals(j().f.getAbsolutePath()))) {
                j();
                file.delete();
            }
        }
    }

    public static void b(String str) {
        if (v2.a) {
            h();
            Log.d("tmessages", str);
            if (j().a != null) {
                j().d.c(new o4(str, 3));
            }
        }
    }

    public static void c(boolean z10) {
        if (z10 || System.currentTimeMillis() - l >= 30000) {
            l = System.currentTimeMillis();
            try {
                Debug.dumpHprofData(new File(i0.P0(), j().b.format(System.currentTimeMillis()) + "_heap.hprof").getAbsolutePath());
            } catch (Exception e) {
                g(e, true);
            }
        }
    }

    public static void d(String str) {
        if (v2.a) {
            h();
            Log.e("tmessages", str);
            if (j().a != null) {
                j().d.c(new o4(str, 2));
            }
        }
    }

    public static void e(String str, Throwable th2) {
        if (v2.a) {
            h();
            Log.e("tmessages", str, th2);
            if (j().a != null) {
                j().d.c(new t6(9, str, th2));
            }
        }
    }

    public static void f(Throwable th2) {
        g(th2, true);
    }

    public static void g(Throwable th2, boolean z10) {
        if (v2.a) {
            if (!(th2 instanceof InterruptedException) && !(th2 instanceof MediaCodecVideoConvertor.ConversionCanceledException) && !(th2 instanceof e8) && z10) {
                Typeface typeface = i0.a;
                w0.a(th2);
            }
            int i10 = 0;
            if (th2.getMessage() != null && th2.getMessage().contains("disk image is malformed") && !j) {
                b("copy malformed files");
                j = true;
                File file = new File(w0.h(), "malformed_database/");
                file.mkdirs();
                hs a02 = hs.a0(d20.s0);
                ArrayList arrayList = new ArrayList();
                arrayList.add(a02.c);
                arrayList.add(a02.d);
                arrayList.add(a02.e);
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    try {
                        i0.E((File) arrayList.get(i11), new File(file, ((File) arrayList.get(i11)).getName()));
                    } catch (IOException e) {
                        g(e, true);
                    }
                }
            }
            h();
            th2.printStackTrace();
            if (j().a != null) {
                j().d.c(new d8(i10, th2));
            } else {
                th2.printStackTrace();
            }
        }
    }

    public static void h() {
        j().k();
    }

    public static void i(Throwable th2, boolean z10) {
        if (v2.a) {
            if (th2 instanceof OutOfMemoryError) {
                j();
                c(false);
            }
            if (z10 && !(th2 instanceof InterruptedException) && !(th2 instanceof MediaCodecVideoConvertor.ConversionCanceledException) && !(th2 instanceof e8)) {
                Typeface typeface = i0.a;
                w0.a(th2);
            }
            h();
            th2.printStackTrace();
            if (j().a != null) {
                j().d.c(new d8(1, th2));
            } else {
                th2.printStackTrace();
            }
        }
    }

    public static f8 j() {
        f8 f8Var;
        f8 f8Var2 = k;
        if (f8Var2 != null) {
            return f8Var2;
        }
        synchronized (f8.class) {
            try {
                f8Var = k;
                if (f8Var == null) {
                    f8Var = new f8();
                    f8Var.a = null;
                    f8Var.b = null;
                    f8Var.c = null;
                    f8Var.d = null;
                    f8Var.e = null;
                    f8Var.f = null;
                    f8Var.h = null;
                    f8Var.i = null;
                    k = f8Var;
                    if (v2.a) {
                        f8Var.k();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f8Var;
    }

    public static void l(String str) {
        if (v2.a) {
            h();
            Log.w("tmessages", str);
            if (j().a != null) {
                j().d.c(new o4(str, 1));
            }
        }
    }

    public final void k() {
        File P0;
        if (this.g) {
            return;
        }
        Locale locale = Locale.US;
        this.b = FastDateFormat.getInstance("dd_MM_yyyy_HH_mm_ss.SSS", locale);
        FastDateFormat fastDateFormat = FastDateFormat.getInstance("dd_MM_yyyy_HH_mm_ss", locale);
        this.c = fastDateFormat;
        String format = fastDateFormat.format(System.currentTimeMillis());
        try {
            P0 = i0.P0();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (P0 == null) {
            return;
        }
        this.e = new File(P0, format + ".txt");
        this.i = new File(P0, format + "_mtproto.txt");
        try {
            this.d = new r5("logQueue");
            this.e.createNewFile();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(this.e));
            this.a = outputStreamWriter;
            outputStreamWriter.write("-----start log " + format + "-----\n");
            this.a.flush();
            OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(new FileOutputStream(this.i));
            this.h = outputStreamWriter2;
            outputStreamWriter2.write("-----start log " + format + "-----\n");
            this.h.flush();
        } catch (Exception e7) {
            e7.printStackTrace();
        }
        this.g = true;
    }
}
