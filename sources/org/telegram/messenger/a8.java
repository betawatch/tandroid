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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class a8 {
    public static boolean j = false;
    public static volatile a8 k;
    public static long l;
    public OutputStreamWriter a;
    public FastDateFormat b;
    public FastDateFormat c;
    public p5 d;
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
        File P0 = g0.P0();
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
        if (r2.a) {
            h();
            Log.d("tmessages", str);
            if (j().a != null) {
                j().d.c(new l4(str, 3));
            }
        }
    }

    public static void c(boolean z9) {
        if (z9 || System.currentTimeMillis() - l >= 30000) {
            l = System.currentTimeMillis();
            try {
                Debug.dumpHprofData(new File(g0.P0(), j().b.format(System.currentTimeMillis()) + "_heap.hprof").getAbsolutePath());
            } catch (Exception e10) {
                g(e10, true);
            }
        }
    }

    public static void d(String str) {
        if (r2.a) {
            h();
            Log.e("tmessages", str);
            if (j().a != null) {
                j().d.c(new l4(str, 2));
            }
        }
    }

    public static void e(String str, Throwable th2) {
        if (r2.a) {
            h();
            Log.e("tmessages", str, th2);
            if (j().a != null) {
                j().d.c(new y4(11, str, th2));
            }
        }
    }

    public static void f(Throwable th2) {
        g(th2, true);
    }

    public static void g(Throwable th2, boolean z9) {
        if (r2.a) {
            if (!(th2 instanceof InterruptedException) && !(th2 instanceof MediaCodecVideoConvertor.ConversionCanceledException) && !(th2 instanceof z7) && z9) {
                Typeface typeface = g0.a;
                t0.a(th2);
            }
            int i7 = 0;
            if (th2.getMessage() != null && th2.getMessage().contains("disk image is malformed") && !j) {
                b("copy malformed files");
                j = true;
                File file = new File(t0.h(), "malformed_database/");
                file.mkdirs();
                yr a02 = yr.a0(p10.s0);
                ArrayList arrayList = new ArrayList();
                arrayList.add(a02.c);
                arrayList.add(a02.d);
                arrayList.add(a02.e);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    try {
                        g0.E((File) arrayList.get(i10), new File(file, ((File) arrayList.get(i10)).getName()));
                    } catch (IOException e10) {
                        g(e10, true);
                    }
                }
            }
            h();
            th2.printStackTrace();
            if (j().a != null) {
                j().d.c(new y7(i7, th2));
            } else {
                th2.printStackTrace();
            }
        }
    }

    public static void h() {
        j().k();
    }

    public static void i(Throwable th2, boolean z9) {
        if (r2.a) {
            if (th2 instanceof OutOfMemoryError) {
                j();
                c(false);
            }
            if (z9 && !(th2 instanceof InterruptedException) && !(th2 instanceof MediaCodecVideoConvertor.ConversionCanceledException) && !(th2 instanceof z7)) {
                Typeface typeface = g0.a;
                t0.a(th2);
            }
            h();
            th2.printStackTrace();
            if (j().a != null) {
                j().d.c(new y7(1, th2));
            } else {
                th2.printStackTrace();
            }
        }
    }

    public static a8 j() {
        a8 a8Var;
        a8 a8Var2 = k;
        if (a8Var2 != null) {
            return a8Var2;
        }
        synchronized (a8.class) {
            try {
                a8Var = k;
                if (a8Var == null) {
                    a8Var = new a8();
                    a8Var.a = null;
                    a8Var.b = null;
                    a8Var.c = null;
                    a8Var.d = null;
                    a8Var.e = null;
                    a8Var.f = null;
                    a8Var.h = null;
                    a8Var.i = null;
                    k = a8Var;
                    if (r2.a) {
                        a8Var.k();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a8Var;
    }

    public static void l(String str) {
        if (r2.a) {
            h();
            Log.w("tmessages", str);
            if (j().a != null) {
                j().d.c(new l4(str, 1));
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
            P0 = g0.P0();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (P0 == null) {
            return;
        }
        this.e = new File(P0, format + ".txt");
        this.i = new File(P0, format + "_mtproto.txt");
        try {
            this.d = new p5("logQueue");
            this.e.createNewFile();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(this.e));
            this.a = outputStreamWriter;
            outputStreamWriter.write("-----start log " + format + "-----\n");
            this.a.flush();
            OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(new FileOutputStream(this.i));
            this.h = outputStreamWriter2;
            outputStreamWriter2.write("-----start log " + format + "-----\n");
            this.h.flush();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        this.g = true;
    }
}
