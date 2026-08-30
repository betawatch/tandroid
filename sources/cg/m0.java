package cg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import android.util.Log;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
import k7.n6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class m0 {
    public static final nr B = new nr(0.0d, 0.5d, 0.0d, 1.0d);
    public m A;
    public final p1 a;
    public boolean b;
    public boolean c;
    public long d;
    public boolean e;
    public boolean f;
    public h1 g;
    public h1 h;
    public double i;
    public boolean j;
    public float k;
    public boolean l;
    public int n;
    public int o;
    public double p;
    public double q;
    public ValueAnimator r;
    public final z1 s;
    public Matrix t;
    public long v;
    public float w;
    public ValueAnimator x;
    public boolean z;
    public final h1[] m = new h1[3];
    public final float[] u = new float[2];
    public final g0 y = new g0(this, 1);

    /* JADX WARN: Type inference failed for: r2v6, types: [cg.t1] */
    public m0(p1 p1Var) {
        this.a = p1Var;
        Context context = p1Var.getContext();
        h0 h0Var = new h0(this, 0);
        final z1 z1Var = new z1();
        z1Var.b = new ArrayList();
        z1Var.c = new ArrayList();
        z1Var.i = null;
        z1Var.j = new AtomicBoolean(false);
        z1Var.k = new AtomicBoolean(false);
        final int i10 = 0;
        z1Var.l = new Runnable() { // from class: cg.t1
            /* JADX WARN: Removed duplicated region for block: B:136:0x0465  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                s1 s1Var;
                int e;
                double d;
                long j10;
                int i11;
                double d10;
                char c3;
                String string;
                int i12;
                switch (i10) {
                    case 0:
                        z1 z1Var2 = z1Var;
                        if (z1Var2.j.get()) {
                            return;
                        }
                        z1Var2.k.set(false);
                        z1Var2.j.set(true);
                        long currentTimeMillis = System.currentTimeMillis();
                        synchronized (z1Var2) {
                            try {
                                if (z1Var2.b.size() < 8) {
                                    z1Var2.j.set(false);
                                } else {
                                    ArrayList f10 = z1.f(z1Var2.b);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add((w1) f10.get(0));
                                    int i13 = 1;
                                    double d11 = 0.0d;
                                    while (i13 < f10.size()) {
                                        w1 w1Var = (w1) f10.get(i13 - 1);
                                        w1 w1Var2 = (w1) f10.get(i13);
                                        w1Var.getClass();
                                        d11 += w1Var.a(w1Var2.a, w1Var2.b);
                                        i13++;
                                        z1Var2 = z1Var2;
                                    }
                                    z1 z1Var3 = z1Var2;
                                    double d12 = d11 / 47;
                                    int i14 = 1;
                                    double d13 = 0.0d;
                                    while (i14 < f10.size()) {
                                        int i15 = i14 - 1;
                                        w1 w1Var3 = (w1) f10.get(i15);
                                        w1 w1Var4 = (w1) f10.get(i14);
                                        w1Var3.getClass();
                                        double d14 = d13;
                                        int i16 = i14;
                                        double a2 = w1Var3.a(w1Var4.a, w1Var4.b);
                                        double d15 = d14 + a2;
                                        if (d15 >= d12) {
                                            double d16 = (d12 - d14) / a2;
                                            i11 = i16;
                                            d10 = d12;
                                            j10 = currentTimeMillis;
                                            w1 w1Var5 = new w1(((((w1) f10.get(i11)).a - ((w1) f10.get(i15)).a) * d16) + ((w1) f10.get(i15)).a, ((((w1) f10.get(i11)).b - ((w1) f10.get(i15)).b) * d16) + ((w1) f10.get(i15)).b);
                                            arrayList.add(w1Var5);
                                            f10.add(i11, w1Var5);
                                            d13 = 0.0d;
                                        } else {
                                            j10 = currentTimeMillis;
                                            i11 = i16;
                                            d10 = d12;
                                            d13 = d15;
                                        }
                                        i14 = i11 + 1;
                                        d12 = d10;
                                        currentTimeMillis = j10;
                                    }
                                    long j11 = currentTimeMillis;
                                    if (arrayList.size() == 47) {
                                        arrayList.add((w1) kh.a2.i(1, f10));
                                    }
                                    ArrayList f11 = z1.f(arrayList);
                                    w1 b10 = z1.b(f11);
                                    double atan2 = Math.atan2(b10.b - ((w1) f11.get(0)).b, b10.a - ((w1) f11.get(0)).a);
                                    w1 b11 = z1.b(f11);
                                    double cos = Math.cos(atan2);
                                    double sin = Math.sin(atan2);
                                    int i17 = 0;
                                    while (i17 < f11.size()) {
                                        w1 w1Var6 = (w1) f11.get(i17);
                                        double d17 = w1Var6.a;
                                        double d18 = b11.a;
                                        double d19 = d17 - d18;
                                        double d20 = sin;
                                        double d21 = w1Var6.b;
                                        double d22 = b11.b;
                                        double d23 = d21 - d22;
                                        w1Var6.b = (d23 * cos) + (d19 * d20) + d22;
                                        w1Var6.a = ((d19 * cos) - (d23 * d20)) + d18;
                                        i17++;
                                        sin = d20;
                                    }
                                    w1 b12 = z1.b(f11);
                                    double d24 = -b12.a;
                                    double d25 = -b12.b;
                                    for (int i18 = 0; i18 < f11.size(); i18++) {
                                        w1 w1Var7 = (w1) f11.get(i18);
                                        w1Var7.a += d24;
                                        w1Var7.b += d25;
                                    }
                                    x1 a10 = z1.a(f11);
                                    double d26 = a10.c - a10.a;
                                    double d27 = a10.d - a10.b;
                                    for (int i19 = 0; i19 < f11.size(); i19++) {
                                        w1 w1Var8 = (w1) f11.get(i19);
                                        w1Var8.a = (250.0d / d26) * w1Var8.a;
                                        w1Var8.b = (250.0d / d27) * w1Var8.b;
                                    }
                                    w1 b13 = z1.b(f11);
                                    double d28 = Double.MAX_VALUE;
                                    int i20 = -1;
                                    int i21 = -1;
                                    for (int i22 = 0; i22 < z1Var3.c.size(); i22++) {
                                        ArrayList arrayList2 = ((y1) z1Var3.c.get(i22)).b;
                                        double sqrt = (Math.sqrt(5.0d) - 1.0d) * 0.5d;
                                        double d29 = -1.5707963267948966d;
                                        double d30 = 1.0d - sqrt;
                                        double d31 = 1.5707963267948966d;
                                        double d32 = d28;
                                        double d33 = (d30 * 1.5707963267948966d) + (sqrt * (-1.5707963267948966d));
                                        double d34 = z1.d(f11, b13, arrayList2, d33);
                                        double d35 = d33;
                                        double d36 = (sqrt * 1.5707963267948966d) + (d30 * (-1.5707963267948966d));
                                        double d37 = z1.d(f11, b13, arrayList2, d36);
                                        double d38 = d36;
                                        double d39 = d34;
                                        double d40 = d37;
                                        while (Math.abs(d31 - d29) > 0.06981317007977318d) {
                                            if (d39 < d40) {
                                                double d41 = (d30 * d38) + (sqrt * d29);
                                                double d42 = z1.d(f11, b13, arrayList2, d41);
                                                d = d41;
                                                d40 = d39;
                                                d39 = d42;
                                                d31 = d38;
                                                d38 = d35;
                                            } else {
                                                double d43 = (d30 * d35) + (sqrt * d31);
                                                double d44 = z1.d(f11, b13, arrayList2, d43);
                                                d = d38;
                                                d38 = d43;
                                                d39 = d40;
                                                d40 = d44;
                                                d29 = d35;
                                            }
                                            d35 = d;
                                        }
                                        double min = Math.min(d39, d40);
                                        if (min < d32) {
                                            i20 = ((y1) z1Var3.c.get(i22)).a;
                                            d28 = min;
                                            i21 = i22;
                                        } else {
                                            d28 = d32;
                                        }
                                    }
                                    int i23 = 1.0d - (d28 / z1.n) < 0.8d ? -1 : i20;
                                    if (i23 >= 0 && i23 < l.b.size() && arrayList.size() >= 1) {
                                        s1 s1Var2 = new s1(l.p(i23));
                                        if (i23 == 4) {
                                            int e6 = z1.e(0, arrayList);
                                            if (e6 > 0) {
                                                if (e6 > 10) {
                                                    e6 -= 2;
                                                }
                                                w1 w1Var9 = (w1) arrayList.get(e6);
                                                w1 w1Var10 = (w1) arrayList.get(e6 / 2);
                                                w1 w1Var11 = (w1) arrayList.get(0);
                                                s1Var2.b = (float) w1Var9.a;
                                                s1Var2.c = (float) w1Var9.b;
                                                s1Var2.i = (float) w1Var10.a;
                                                s1Var2.j = (float) w1Var10.b;
                                                s1Var2.d = (float) w1Var11.a;
                                                s1Var2.e = (float) w1Var11.b;
                                                s1Var2.k = 16.0f;
                                            }
                                        } else {
                                            w1 b14 = z1.b(arrayList);
                                            s1Var2.b = (float) b14.a;
                                            s1Var2.c = (float) b14.b;
                                            x1 a11 = z1.a(arrayList);
                                            s1Var2.d = ((float) (a11.c - a11.a)) / 2.0f;
                                            s1Var2.e = ((float) (a11.d - a11.b)) / 2.0f;
                                            if (i23 == 2 && (e = z1.e(1, arrayList)) > 0) {
                                                w1 w1Var12 = (w1) arrayList.get(e);
                                                s1Var2.h = (float) Math.atan2(w1Var12.b - s1Var2.c, w1Var12.a - s1Var2.b);
                                            }
                                        }
                                        s1Var = s1Var2;
                                        if (BuildVars.LOGS_ENABLED) {
                                            StringBuilder sb = new StringBuilder("took ");
                                            sb.append(System.currentTimeMillis() - j11);
                                            sb.append("ms to ");
                                            sb.append(s1Var != null ? "" : "not ");
                                            sb.append("detect a shape");
                                            sb.append(s1Var != null ? " (template#" + i21 + " shape#" + i23 + ")" : "");
                                            Log.i("shapedetector", sb.toString());
                                        }
                                        AndroidUtilities.runOnUIThread(new v1(z1Var3, s1Var, i21, f11, 0));
                                        z1Var3.j.set(false);
                                    }
                                    s1Var = null;
                                    if (BuildVars.LOGS_ENABLED) {
                                    }
                                    AndroidUtilities.runOnUIThread(new v1(z1Var3, s1Var, i21, f11, 0));
                                    z1Var3.j.set(false);
                                }
                            } finally {
                            }
                        }
                        return;
                    default:
                        z1 z1Var4 = z1Var;
                        try {
                            InputStream open = ApplicationLoader.applicationContext.getAssets().open("shapes.dat");
                            while (true) {
                                c3 = 0;
                                if (open.available() > 5) {
                                    y1 y1Var = new y1();
                                    y1Var.a = open.read();
                                    int read = open.read();
                                    int read2 = open.read() - 64;
                                    int read3 = open.read() - 64;
                                    if (open.available() >= read * 2) {
                                        for (int i24 = 0; i24 < read; i24++) {
                                            y1Var.b.add(new w1((open.read() - read2) - 127, (open.read() - read3) - 127));
                                        }
                                        y1Var.c = z1Var4.g.getInt("score" + z1Var4.c.size(), 0);
                                        z1Var4.c.add(y1Var);
                                    }
                                }
                            }
                            if (z1Var4.h && (string = z1Var4.g.getString("moretemplates", null)) != null) {
                                String[] split = string.split("\\|");
                                int size = z1Var4.c.size();
                                int i25 = 0;
                                while (i25 < split.length) {
                                    y1 y1Var2 = new y1();
                                    String[] split2 = split[i25].split(",");
                                    int i26 = 1;
                                    if (split2.length <= 1) {
                                        i12 = i25;
                                    } else {
                                        y1Var2.a = Integer.parseInt(split2[c3]);
                                        while (i26 < split2.length) {
                                            y1Var2.b.add(new w1(Double.parseDouble(split2[i26]), Double.parseDouble(split2[i26 + 1])));
                                            i26 += 2;
                                            i25 = i25;
                                        }
                                        i12 = i25;
                                        y1Var2.c = z1Var4.g.getInt("score" + (size + i12), 0);
                                        z1Var4.c.add(y1Var2);
                                    }
                                    i25 = i12 + 1;
                                    c3 = 0;
                                }
                            }
                            open.close();
                            return;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            return;
                        }
                }
            }
        };
        z1Var.f = context;
        z1Var.e = h0Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        z1Var.g = sharedPreferences;
        z1Var.h = sharedPreferences.getBoolean("learning", false);
        z1Var.a = sharedPreferences.getInt("scoreall", 0);
        final int i11 = 1;
        z1.m.postRunnable(new Runnable() { // from class: cg.t1
            /* JADX WARN: Removed duplicated region for block: B:136:0x0465  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                s1 s1Var;
                int e;
                double d;
                long j10;
                int i112;
                double d10;
                char c3;
                String string;
                int i12;
                switch (i11) {
                    case 0:
                        z1 z1Var2 = z1Var;
                        if (z1Var2.j.get()) {
                            return;
                        }
                        z1Var2.k.set(false);
                        z1Var2.j.set(true);
                        long currentTimeMillis = System.currentTimeMillis();
                        synchronized (z1Var2) {
                            try {
                                if (z1Var2.b.size() < 8) {
                                    z1Var2.j.set(false);
                                } else {
                                    ArrayList f10 = z1.f(z1Var2.b);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add((w1) f10.get(0));
                                    int i13 = 1;
                                    double d11 = 0.0d;
                                    while (i13 < f10.size()) {
                                        w1 w1Var = (w1) f10.get(i13 - 1);
                                        w1 w1Var2 = (w1) f10.get(i13);
                                        w1Var.getClass();
                                        d11 += w1Var.a(w1Var2.a, w1Var2.b);
                                        i13++;
                                        z1Var2 = z1Var2;
                                    }
                                    z1 z1Var3 = z1Var2;
                                    double d12 = d11 / 47;
                                    int i14 = 1;
                                    double d13 = 0.0d;
                                    while (i14 < f10.size()) {
                                        int i15 = i14 - 1;
                                        w1 w1Var3 = (w1) f10.get(i15);
                                        w1 w1Var4 = (w1) f10.get(i14);
                                        w1Var3.getClass();
                                        double d14 = d13;
                                        int i16 = i14;
                                        double a2 = w1Var3.a(w1Var4.a, w1Var4.b);
                                        double d15 = d14 + a2;
                                        if (d15 >= d12) {
                                            double d16 = (d12 - d14) / a2;
                                            i112 = i16;
                                            d10 = d12;
                                            j10 = currentTimeMillis;
                                            w1 w1Var5 = new w1(((((w1) f10.get(i112)).a - ((w1) f10.get(i15)).a) * d16) + ((w1) f10.get(i15)).a, ((((w1) f10.get(i112)).b - ((w1) f10.get(i15)).b) * d16) + ((w1) f10.get(i15)).b);
                                            arrayList.add(w1Var5);
                                            f10.add(i112, w1Var5);
                                            d13 = 0.0d;
                                        } else {
                                            j10 = currentTimeMillis;
                                            i112 = i16;
                                            d10 = d12;
                                            d13 = d15;
                                        }
                                        i14 = i112 + 1;
                                        d12 = d10;
                                        currentTimeMillis = j10;
                                    }
                                    long j11 = currentTimeMillis;
                                    if (arrayList.size() == 47) {
                                        arrayList.add((w1) kh.a2.i(1, f10));
                                    }
                                    ArrayList f11 = z1.f(arrayList);
                                    w1 b10 = z1.b(f11);
                                    double atan2 = Math.atan2(b10.b - ((w1) f11.get(0)).b, b10.a - ((w1) f11.get(0)).a);
                                    w1 b11 = z1.b(f11);
                                    double cos = Math.cos(atan2);
                                    double sin = Math.sin(atan2);
                                    int i17 = 0;
                                    while (i17 < f11.size()) {
                                        w1 w1Var6 = (w1) f11.get(i17);
                                        double d17 = w1Var6.a;
                                        double d18 = b11.a;
                                        double d19 = d17 - d18;
                                        double d20 = sin;
                                        double d21 = w1Var6.b;
                                        double d22 = b11.b;
                                        double d23 = d21 - d22;
                                        w1Var6.b = (d23 * cos) + (d19 * d20) + d22;
                                        w1Var6.a = ((d19 * cos) - (d23 * d20)) + d18;
                                        i17++;
                                        sin = d20;
                                    }
                                    w1 b12 = z1.b(f11);
                                    double d24 = -b12.a;
                                    double d25 = -b12.b;
                                    for (int i18 = 0; i18 < f11.size(); i18++) {
                                        w1 w1Var7 = (w1) f11.get(i18);
                                        w1Var7.a += d24;
                                        w1Var7.b += d25;
                                    }
                                    x1 a10 = z1.a(f11);
                                    double d26 = a10.c - a10.a;
                                    double d27 = a10.d - a10.b;
                                    for (int i19 = 0; i19 < f11.size(); i19++) {
                                        w1 w1Var8 = (w1) f11.get(i19);
                                        w1Var8.a = (250.0d / d26) * w1Var8.a;
                                        w1Var8.b = (250.0d / d27) * w1Var8.b;
                                    }
                                    w1 b13 = z1.b(f11);
                                    double d28 = Double.MAX_VALUE;
                                    int i20 = -1;
                                    int i21 = -1;
                                    for (int i22 = 0; i22 < z1Var3.c.size(); i22++) {
                                        ArrayList arrayList2 = ((y1) z1Var3.c.get(i22)).b;
                                        double sqrt = (Math.sqrt(5.0d) - 1.0d) * 0.5d;
                                        double d29 = -1.5707963267948966d;
                                        double d30 = 1.0d - sqrt;
                                        double d31 = 1.5707963267948966d;
                                        double d32 = d28;
                                        double d33 = (d30 * 1.5707963267948966d) + (sqrt * (-1.5707963267948966d));
                                        double d34 = z1.d(f11, b13, arrayList2, d33);
                                        double d35 = d33;
                                        double d36 = (sqrt * 1.5707963267948966d) + (d30 * (-1.5707963267948966d));
                                        double d37 = z1.d(f11, b13, arrayList2, d36);
                                        double d38 = d36;
                                        double d39 = d34;
                                        double d40 = d37;
                                        while (Math.abs(d31 - d29) > 0.06981317007977318d) {
                                            if (d39 < d40) {
                                                double d41 = (d30 * d38) + (sqrt * d29);
                                                double d42 = z1.d(f11, b13, arrayList2, d41);
                                                d = d41;
                                                d40 = d39;
                                                d39 = d42;
                                                d31 = d38;
                                                d38 = d35;
                                            } else {
                                                double d43 = (d30 * d35) + (sqrt * d31);
                                                double d44 = z1.d(f11, b13, arrayList2, d43);
                                                d = d38;
                                                d38 = d43;
                                                d39 = d40;
                                                d40 = d44;
                                                d29 = d35;
                                            }
                                            d35 = d;
                                        }
                                        double min = Math.min(d39, d40);
                                        if (min < d32) {
                                            i20 = ((y1) z1Var3.c.get(i22)).a;
                                            d28 = min;
                                            i21 = i22;
                                        } else {
                                            d28 = d32;
                                        }
                                    }
                                    int i23 = 1.0d - (d28 / z1.n) < 0.8d ? -1 : i20;
                                    if (i23 >= 0 && i23 < l.b.size() && arrayList.size() >= 1) {
                                        s1 s1Var2 = new s1(l.p(i23));
                                        if (i23 == 4) {
                                            int e6 = z1.e(0, arrayList);
                                            if (e6 > 0) {
                                                if (e6 > 10) {
                                                    e6 -= 2;
                                                }
                                                w1 w1Var9 = (w1) arrayList.get(e6);
                                                w1 w1Var10 = (w1) arrayList.get(e6 / 2);
                                                w1 w1Var11 = (w1) arrayList.get(0);
                                                s1Var2.b = (float) w1Var9.a;
                                                s1Var2.c = (float) w1Var9.b;
                                                s1Var2.i = (float) w1Var10.a;
                                                s1Var2.j = (float) w1Var10.b;
                                                s1Var2.d = (float) w1Var11.a;
                                                s1Var2.e = (float) w1Var11.b;
                                                s1Var2.k = 16.0f;
                                            }
                                        } else {
                                            w1 b14 = z1.b(arrayList);
                                            s1Var2.b = (float) b14.a;
                                            s1Var2.c = (float) b14.b;
                                            x1 a11 = z1.a(arrayList);
                                            s1Var2.d = ((float) (a11.c - a11.a)) / 2.0f;
                                            s1Var2.e = ((float) (a11.d - a11.b)) / 2.0f;
                                            if (i23 == 2 && (e = z1.e(1, arrayList)) > 0) {
                                                w1 w1Var12 = (w1) arrayList.get(e);
                                                s1Var2.h = (float) Math.atan2(w1Var12.b - s1Var2.c, w1Var12.a - s1Var2.b);
                                            }
                                        }
                                        s1Var = s1Var2;
                                        if (BuildVars.LOGS_ENABLED) {
                                            StringBuilder sb = new StringBuilder("took ");
                                            sb.append(System.currentTimeMillis() - j11);
                                            sb.append("ms to ");
                                            sb.append(s1Var != null ? "" : "not ");
                                            sb.append("detect a shape");
                                            sb.append(s1Var != null ? " (template#" + i21 + " shape#" + i23 + ")" : "");
                                            Log.i("shapedetector", sb.toString());
                                        }
                                        AndroidUtilities.runOnUIThread(new v1(z1Var3, s1Var, i21, f11, 0));
                                        z1Var3.j.set(false);
                                    }
                                    s1Var = null;
                                    if (BuildVars.LOGS_ENABLED) {
                                    }
                                    AndroidUtilities.runOnUIThread(new v1(z1Var3, s1Var, i21, f11, 0));
                                    z1Var3.j.set(false);
                                }
                            } finally {
                            }
                        }
                        return;
                    default:
                        z1 z1Var4 = z1Var;
                        try {
                            InputStream open = ApplicationLoader.applicationContext.getAssets().open("shapes.dat");
                            while (true) {
                                c3 = 0;
                                if (open.available() > 5) {
                                    y1 y1Var = new y1();
                                    y1Var.a = open.read();
                                    int read = open.read();
                                    int read2 = open.read() - 64;
                                    int read3 = open.read() - 64;
                                    if (open.available() >= read * 2) {
                                        for (int i24 = 0; i24 < read; i24++) {
                                            y1Var.b.add(new w1((open.read() - read2) - 127, (open.read() - read3) - 127));
                                        }
                                        y1Var.c = z1Var4.g.getInt("score" + z1Var4.c.size(), 0);
                                        z1Var4.c.add(y1Var);
                                    }
                                }
                            }
                            if (z1Var4.h && (string = z1Var4.g.getString("moretemplates", null)) != null) {
                                String[] split = string.split("\\|");
                                int size = z1Var4.c.size();
                                int i25 = 0;
                                while (i25 < split.length) {
                                    y1 y1Var2 = new y1();
                                    String[] split2 = split[i25].split(",");
                                    int i26 = 1;
                                    if (split2.length <= 1) {
                                        i12 = i25;
                                    } else {
                                        y1Var2.a = Integer.parseInt(split2[c3]);
                                        while (i26 < split2.length) {
                                            y1Var2.b.add(new w1(Double.parseDouble(split2[i26]), Double.parseDouble(split2[i26 + 1])));
                                            i26 += 2;
                                            i25 = i25;
                                        }
                                        i12 = i25;
                                        y1Var2.c = z1Var4.g.getInt("score" + (size + i12), 0);
                                        z1Var4.c.add(y1Var2);
                                    }
                                    i25 = i12 + 1;
                                    c3 = 0;
                                }
                            }
                            open.close();
                            return;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            return;
                        }
                }
            }
        });
        this.s = z1Var;
    }

    public final void a(d dVar, boolean z4, j1 j1Var) {
        o1 o1Var;
        if (this.l) {
            p1 p1Var = this.a;
            if (p1Var.getPainting().G || this.g == null) {
                return;
            }
            m currentBrush = dVar == null ? p1Var.getCurrentBrush() : dVar;
            if ((currentBrush instanceof c) || (currentBrush instanceof e)) {
                currentBrush = new f();
            }
            final m mVar = currentBrush;
            this.l = false;
            if (mVar instanceof d) {
                p1Var.getPainting().E = false;
            }
            d1 painting = p1Var.getPainting();
            painting.f.f(new z0(painting, 1));
            this.n = 0;
            this.o = 0;
            this.j = false;
            this.b = false;
            if (z4 && (o1Var = p1Var.a) != null) {
                o1Var.f();
            }
            jv0 jv0Var = p1Var.getPainting().g;
            h1 h1Var = this.g;
            float a2 = n6.a((float) h1Var.a, (float) h1Var.b, 0.0f, 0.0f);
            h1 h1Var2 = this.g;
            float max = Math.max(a2, n6.a((float) h1Var2.a, (float) h1Var2.b, jv0Var.a, 0.0f));
            h1 h1Var3 = this.g;
            float a10 = n6.a((float) h1Var3.a, (float) h1Var3.b, 0.0f, jv0Var.b);
            h1 h1Var4 = this.g;
            final float max2 = Math.max(max, Math.max(a10, n6.a((float) h1Var4.a, (float) h1Var4.b, jv0Var.a, jv0Var.b))) / 0.84f;
            ValueAnimator valueAnimator = this.r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.r = null;
            }
            ValueAnimator valueAnimator2 = this.x;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.x = null;
            }
            h1 h1Var5 = this.g;
            final h1 h1Var6 = new h1(h1Var5.a, h1Var5.b, 1.0d);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.x = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: cg.i0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    p1 p1Var2 = m0.this.a;
                    float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                    e1 e1Var = new e1(new h1[]{h1Var6});
                    m mVar2 = mVar;
                    mVar2.getClass();
                    int currentColor = mVar2 instanceof d ? -1 : p1Var2.getCurrentColor();
                    float f10 = floatValue * max2;
                    e1Var.c = currentColor;
                    e1Var.d = f10;
                    e1Var.e = mVar2;
                    d1 painting2 = p1Var2.getPainting();
                    if (painting2.L != null) {
                        return;
                    }
                    boolean z10 = true;
                    painting2.f.f(new x0(painting2, e1Var, z10, z10, null, 0));
                }
            });
            this.x.addListener(new k0(this, h1Var6, max2, mVar, z4, j1Var));
            this.x.setDuration(450L);
            this.x.setInterpolator(nr.h);
            this.x.start();
            if (z4) {
                BotWebViewVibrationEffect.IMPACT_HEAVY.vibrate();
            }
        }
    }

    public final void b(e1 e1Var) {
        p1 p1Var = this.a;
        int currentColor = p1Var.getCurrentColor();
        float currentWeight = p1Var.getCurrentWeight();
        m currentBrush = p1Var.getCurrentBrush();
        e1Var.c = currentColor;
        e1Var.d = currentWeight;
        e1Var.e = currentBrush;
        if (this.f) {
            this.i = 0.0d;
        }
        e1Var.a = this.i;
        d1 painting = p1Var.getPainting();
        boolean z4 = this.f;
        j0 j0Var = new j0(this, e1Var, 0);
        boolean z10 = false;
        if (painting.L == null) {
            painting.f.f(new x0(painting, e1Var, z4, z10, j0Var, 0));
        }
        this.f = false;
    }

    public final void c(float f10, boolean z4) {
        int i10 = this.n;
        h1[] h1VarArr = this.m;
        if (i10 <= 2) {
            h1[] h1VarArr2 = new h1[i10];
            System.arraycopy(h1VarArr, 0, h1VarArr2, 0, i10);
            b(new e1(h1VarArr2));
            return;
        }
        Vector vector = new Vector();
        h1 h1Var = h1VarArr[0];
        h1 h1Var2 = h1VarArr[1];
        h1 h1Var3 = h1VarArr[2];
        if (h1Var3 == null || h1Var2 == null || h1Var == null) {
            return;
        }
        h1 b10 = h1Var2.b(h1Var);
        h1 b11 = h1Var3.b(h1Var2);
        int min = (int) Math.min(48.0d, Math.max(Math.floor(b10.a(b11) / 1), 24.0d));
        float f11 = 1.0f;
        float f12 = 1.0f / min;
        int i11 = 0;
        float f13 = 0.0f;
        while (i11 < min) {
            float f14 = f11 - f13;
            double d = f14;
            double pow = Math.pow(d, 2.0d);
            double d10 = f13 * f13;
            double d11 = f14 * f14;
            double d12 = f13;
            double d13 = (b11.a * d10) + (h1Var2.a * 2.0d * d12 * d) + (b10.a * d11);
            double d14 = (b11.b * d10) + (h1Var2.b * 2.0d * d12 * d) + (b10.b * d11);
            double lerp = ((((b11.c * d10) + ((h1Var2.c * ((2.0f * f14) * f13)) + (b10.c * pow))) - 1.0d) * AndroidUtilities.lerp(f10, 1.0f, k7.n.a(this.o / 16.0f, 0.0f, 1.0f))) + 1.0d;
            h1 h1Var4 = new h1(d13, d14, lerp);
            if (this.c) {
                h1Var4.d = true;
                this.c = false;
            }
            vector.add(h1Var4);
            this.p += lerp;
            this.q += 1.0d;
            f13 += f12;
            i11++;
            f11 = 1.0f;
        }
        if (z4) {
            b11.d = true;
        }
        vector.add(b11);
        h1[] h1VarArr3 = new h1[vector.size()];
        vector.toArray(h1VarArr3);
        b(new e1(h1VarArr3));
        System.arraycopy(h1VarArr, 1, h1VarArr, 0, 2);
        if (z4) {
            this.n = 0;
        } else {
            this.n = 2;
        }
    }
}
