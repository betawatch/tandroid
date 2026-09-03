package dg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import android.util.Log;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
import k7.o6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class m0 {
    public static final pr B = new pr(0.0d, 0.5d, 0.0d, 1.0d);
    public m A;
    public final o1 a;
    public boolean b;
    public boolean c;
    public long d;
    public boolean e;
    public boolean f;
    public g1 g;
    public g1 h;
    public double i;
    public boolean j;
    public float k;
    public boolean l;
    public int n;
    public int o;
    public double p;
    public double q;
    public ValueAnimator r;
    public final y1 s;
    public Matrix t;
    public long v;
    public float w;
    public ValueAnimator x;
    public boolean z;
    public final g1[] m = new g1[3];
    public final float[] u = new float[2];
    public final g0 y = new g0(this, 1);

    /* JADX WARN: Type inference failed for: r2v6, types: [dg.s1] */
    public m0(o1 o1Var) {
        this.a = o1Var;
        Context context = o1Var.getContext();
        h0 h0Var = new h0(this, 0);
        final y1 y1Var = new y1();
        y1Var.b = new ArrayList();
        y1Var.c = new ArrayList();
        y1Var.i = null;
        y1Var.j = new AtomicBoolean(false);
        y1Var.k = new AtomicBoolean(false);
        final int i10 = 0;
        y1Var.l = new Runnable() { // from class: dg.s1
            /* JADX WARN: Removed duplicated region for block: B:136:0x0465  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                r1 r1Var;
                int e6;
                double d;
                long j10;
                int i11;
                double d10;
                char c3;
                String string;
                int i12;
                switch (i10) {
                    case 0:
                        y1 y1Var2 = y1Var;
                        if (y1Var2.j.get()) {
                            return;
                        }
                        y1Var2.k.set(false);
                        y1Var2.j.set(true);
                        long currentTimeMillis = System.currentTimeMillis();
                        synchronized (y1Var2) {
                            try {
                                if (y1Var2.b.size() < 8) {
                                    y1Var2.j.set(false);
                                } else {
                                    ArrayList f10 = y1.f(y1Var2.b);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add((v1) f10.get(0));
                                    int i13 = 1;
                                    double d11 = 0.0d;
                                    while (i13 < f10.size()) {
                                        v1 v1Var = (v1) f10.get(i13 - 1);
                                        v1 v1Var2 = (v1) f10.get(i13);
                                        v1Var.getClass();
                                        d11 += v1Var.a(v1Var2.a, v1Var2.b);
                                        i13++;
                                        y1Var2 = y1Var2;
                                    }
                                    y1 y1Var3 = y1Var2;
                                    double d12 = d11 / 47;
                                    int i14 = 1;
                                    double d13 = 0.0d;
                                    while (i14 < f10.size()) {
                                        int i15 = i14 - 1;
                                        v1 v1Var3 = (v1) f10.get(i15);
                                        v1 v1Var4 = (v1) f10.get(i14);
                                        v1Var3.getClass();
                                        double d14 = d13;
                                        int i16 = i14;
                                        double a2 = v1Var3.a(v1Var4.a, v1Var4.b);
                                        double d15 = d14 + a2;
                                        if (d15 >= d12) {
                                            double d16 = (d12 - d14) / a2;
                                            i11 = i16;
                                            d10 = d12;
                                            j10 = currentTimeMillis;
                                            v1 v1Var5 = new v1(((((v1) f10.get(i11)).a - ((v1) f10.get(i15)).a) * d16) + ((v1) f10.get(i15)).a, ((((v1) f10.get(i11)).b - ((v1) f10.get(i15)).b) * d16) + ((v1) f10.get(i15)).b);
                                            arrayList.add(v1Var5);
                                            f10.add(i11, v1Var5);
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
                                        arrayList.add((v1) l.d.i(1, f10));
                                    }
                                    ArrayList f11 = y1.f(arrayList);
                                    v1 b10 = y1.b(f11);
                                    double atan2 = Math.atan2(b10.b - ((v1) f11.get(0)).b, b10.a - ((v1) f11.get(0)).a);
                                    v1 b11 = y1.b(f11);
                                    double cos = Math.cos(atan2);
                                    double sin = Math.sin(atan2);
                                    int i17 = 0;
                                    while (i17 < f11.size()) {
                                        v1 v1Var6 = (v1) f11.get(i17);
                                        double d17 = v1Var6.a;
                                        double d18 = b11.a;
                                        double d19 = d17 - d18;
                                        double d20 = sin;
                                        double d21 = v1Var6.b;
                                        double d22 = b11.b;
                                        double d23 = d21 - d22;
                                        v1Var6.b = (d23 * cos) + (d19 * d20) + d22;
                                        v1Var6.a = ((d19 * cos) - (d23 * d20)) + d18;
                                        i17++;
                                        sin = d20;
                                    }
                                    v1 b12 = y1.b(f11);
                                    double d24 = -b12.a;
                                    double d25 = -b12.b;
                                    for (int i18 = 0; i18 < f11.size(); i18++) {
                                        v1 v1Var7 = (v1) f11.get(i18);
                                        v1Var7.a += d24;
                                        v1Var7.b += d25;
                                    }
                                    w1 a10 = y1.a(f11);
                                    double d26 = a10.c - a10.a;
                                    double d27 = a10.d - a10.b;
                                    for (int i19 = 0; i19 < f11.size(); i19++) {
                                        v1 v1Var8 = (v1) f11.get(i19);
                                        v1Var8.a = (250.0d / d26) * v1Var8.a;
                                        v1Var8.b = (250.0d / d27) * v1Var8.b;
                                    }
                                    v1 b13 = y1.b(f11);
                                    double d28 = Double.MAX_VALUE;
                                    int i20 = -1;
                                    int i21 = -1;
                                    for (int i22 = 0; i22 < y1Var3.c.size(); i22++) {
                                        ArrayList arrayList2 = ((x1) y1Var3.c.get(i22)).b;
                                        double sqrt = (Math.sqrt(5.0d) - 1.0d) * 0.5d;
                                        double d29 = -1.5707963267948966d;
                                        double d30 = 1.0d - sqrt;
                                        double d31 = 1.5707963267948966d;
                                        double d32 = d28;
                                        double d33 = (d30 * 1.5707963267948966d) + (sqrt * (-1.5707963267948966d));
                                        double d34 = y1.d(f11, b13, arrayList2, d33);
                                        double d35 = d33;
                                        double d36 = (sqrt * 1.5707963267948966d) + (d30 * (-1.5707963267948966d));
                                        double d37 = y1.d(f11, b13, arrayList2, d36);
                                        double d38 = d36;
                                        double d39 = d34;
                                        double d40 = d37;
                                        while (Math.abs(d31 - d29) > 0.06981317007977318d) {
                                            if (d39 < d40) {
                                                double d41 = (d30 * d38) + (sqrt * d29);
                                                double d42 = y1.d(f11, b13, arrayList2, d41);
                                                d = d41;
                                                d40 = d39;
                                                d39 = d42;
                                                d31 = d38;
                                                d38 = d35;
                                            } else {
                                                double d43 = (d30 * d35) + (sqrt * d31);
                                                double d44 = y1.d(f11, b13, arrayList2, d43);
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
                                            i20 = ((x1) y1Var3.c.get(i22)).a;
                                            d28 = min;
                                            i21 = i22;
                                        } else {
                                            d28 = d32;
                                        }
                                    }
                                    int i23 = 1.0d - (d28 / y1.n) < 0.8d ? -1 : i20;
                                    if (i23 >= 0 && i23 < l.b.size() && arrayList.size() >= 1) {
                                        r1 r1Var2 = new r1(l.p(i23));
                                        if (i23 == 4) {
                                            int e10 = y1.e(0, arrayList);
                                            if (e10 > 0) {
                                                if (e10 > 10) {
                                                    e10 -= 2;
                                                }
                                                v1 v1Var9 = (v1) arrayList.get(e10);
                                                v1 v1Var10 = (v1) arrayList.get(e10 / 2);
                                                v1 v1Var11 = (v1) arrayList.get(0);
                                                r1Var2.b = (float) v1Var9.a;
                                                r1Var2.c = (float) v1Var9.b;
                                                r1Var2.i = (float) v1Var10.a;
                                                r1Var2.j = (float) v1Var10.b;
                                                r1Var2.d = (float) v1Var11.a;
                                                r1Var2.e = (float) v1Var11.b;
                                                r1Var2.k = 16.0f;
                                            }
                                        } else {
                                            v1 b14 = y1.b(arrayList);
                                            r1Var2.b = (float) b14.a;
                                            r1Var2.c = (float) b14.b;
                                            w1 a11 = y1.a(arrayList);
                                            r1Var2.d = ((float) (a11.c - a11.a)) / 2.0f;
                                            r1Var2.e = ((float) (a11.d - a11.b)) / 2.0f;
                                            if (i23 == 2 && (e6 = y1.e(1, arrayList)) > 0) {
                                                v1 v1Var12 = (v1) arrayList.get(e6);
                                                r1Var2.h = (float) Math.atan2(v1Var12.b - r1Var2.c, v1Var12.a - r1Var2.b);
                                            }
                                        }
                                        r1Var = r1Var2;
                                        if (BuildVars.LOGS_ENABLED) {
                                            StringBuilder sb = new StringBuilder("took ");
                                            sb.append(System.currentTimeMillis() - j11);
                                            sb.append("ms to ");
                                            sb.append(r1Var != null ? "" : "not ");
                                            sb.append("detect a shape");
                                            sb.append(r1Var != null ? " (template#" + i21 + " shape#" + i23 + ")" : "");
                                            Log.i("shapedetector", sb.toString());
                                        }
                                        AndroidUtilities.runOnUIThread(new u1(y1Var3, r1Var, i21, f11, 0));
                                        y1Var3.j.set(false);
                                    }
                                    r1Var = null;
                                    if (BuildVars.LOGS_ENABLED) {
                                    }
                                    AndroidUtilities.runOnUIThread(new u1(y1Var3, r1Var, i21, f11, 0));
                                    y1Var3.j.set(false);
                                }
                            } finally {
                            }
                        }
                        return;
                    default:
                        y1 y1Var4 = y1Var;
                        try {
                            InputStream open = ApplicationLoader.applicationContext.getAssets().open("shapes.dat");
                            while (true) {
                                c3 = 0;
                                if (open.available() > 5) {
                                    x1 x1Var = new x1();
                                    x1Var.a = open.read();
                                    int read = open.read();
                                    int read2 = open.read() - 64;
                                    int read3 = open.read() - 64;
                                    if (open.available() >= read * 2) {
                                        for (int i24 = 0; i24 < read; i24++) {
                                            x1Var.b.add(new v1((open.read() - read2) - 127, (open.read() - read3) - 127));
                                        }
                                        x1Var.c = y1Var4.g.getInt("score" + y1Var4.c.size(), 0);
                                        y1Var4.c.add(x1Var);
                                    }
                                }
                            }
                            if (y1Var4.h && (string = y1Var4.g.getString("moretemplates", null)) != null) {
                                String[] split = string.split("\\|");
                                int size = y1Var4.c.size();
                                int i25 = 0;
                                while (i25 < split.length) {
                                    x1 x1Var2 = new x1();
                                    String[] split2 = split[i25].split(",");
                                    int i26 = 1;
                                    if (split2.length <= 1) {
                                        i12 = i25;
                                    } else {
                                        x1Var2.a = Integer.parseInt(split2[c3]);
                                        while (i26 < split2.length) {
                                            x1Var2.b.add(new v1(Double.parseDouble(split2[i26]), Double.parseDouble(split2[i26 + 1])));
                                            i26 += 2;
                                            i25 = i25;
                                        }
                                        i12 = i25;
                                        x1Var2.c = y1Var4.g.getInt("score" + (size + i12), 0);
                                        y1Var4.c.add(x1Var2);
                                    }
                                    i25 = i12 + 1;
                                    c3 = 0;
                                }
                            }
                            open.close();
                            return;
                        } catch (Exception e11) {
                            FileLog.e(e11);
                            return;
                        }
                }
            }
        };
        y1Var.f = context;
        y1Var.e = h0Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        y1Var.g = sharedPreferences;
        y1Var.h = sharedPreferences.getBoolean("learning", false);
        y1Var.a = sharedPreferences.getInt("scoreall", 0);
        final int i11 = 1;
        y1.m.postRunnable(new Runnable() { // from class: dg.s1
            /* JADX WARN: Removed duplicated region for block: B:136:0x0465  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                r1 r1Var;
                int e6;
                double d;
                long j10;
                int i112;
                double d10;
                char c3;
                String string;
                int i12;
                switch (i11) {
                    case 0:
                        y1 y1Var2 = y1Var;
                        if (y1Var2.j.get()) {
                            return;
                        }
                        y1Var2.k.set(false);
                        y1Var2.j.set(true);
                        long currentTimeMillis = System.currentTimeMillis();
                        synchronized (y1Var2) {
                            try {
                                if (y1Var2.b.size() < 8) {
                                    y1Var2.j.set(false);
                                } else {
                                    ArrayList f10 = y1.f(y1Var2.b);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add((v1) f10.get(0));
                                    int i13 = 1;
                                    double d11 = 0.0d;
                                    while (i13 < f10.size()) {
                                        v1 v1Var = (v1) f10.get(i13 - 1);
                                        v1 v1Var2 = (v1) f10.get(i13);
                                        v1Var.getClass();
                                        d11 += v1Var.a(v1Var2.a, v1Var2.b);
                                        i13++;
                                        y1Var2 = y1Var2;
                                    }
                                    y1 y1Var3 = y1Var2;
                                    double d12 = d11 / 47;
                                    int i14 = 1;
                                    double d13 = 0.0d;
                                    while (i14 < f10.size()) {
                                        int i15 = i14 - 1;
                                        v1 v1Var3 = (v1) f10.get(i15);
                                        v1 v1Var4 = (v1) f10.get(i14);
                                        v1Var3.getClass();
                                        double d14 = d13;
                                        int i16 = i14;
                                        double a2 = v1Var3.a(v1Var4.a, v1Var4.b);
                                        double d15 = d14 + a2;
                                        if (d15 >= d12) {
                                            double d16 = (d12 - d14) / a2;
                                            i112 = i16;
                                            d10 = d12;
                                            j10 = currentTimeMillis;
                                            v1 v1Var5 = new v1(((((v1) f10.get(i112)).a - ((v1) f10.get(i15)).a) * d16) + ((v1) f10.get(i15)).a, ((((v1) f10.get(i112)).b - ((v1) f10.get(i15)).b) * d16) + ((v1) f10.get(i15)).b);
                                            arrayList.add(v1Var5);
                                            f10.add(i112, v1Var5);
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
                                        arrayList.add((v1) l.d.i(1, f10));
                                    }
                                    ArrayList f11 = y1.f(arrayList);
                                    v1 b10 = y1.b(f11);
                                    double atan2 = Math.atan2(b10.b - ((v1) f11.get(0)).b, b10.a - ((v1) f11.get(0)).a);
                                    v1 b11 = y1.b(f11);
                                    double cos = Math.cos(atan2);
                                    double sin = Math.sin(atan2);
                                    int i17 = 0;
                                    while (i17 < f11.size()) {
                                        v1 v1Var6 = (v1) f11.get(i17);
                                        double d17 = v1Var6.a;
                                        double d18 = b11.a;
                                        double d19 = d17 - d18;
                                        double d20 = sin;
                                        double d21 = v1Var6.b;
                                        double d22 = b11.b;
                                        double d23 = d21 - d22;
                                        v1Var6.b = (d23 * cos) + (d19 * d20) + d22;
                                        v1Var6.a = ((d19 * cos) - (d23 * d20)) + d18;
                                        i17++;
                                        sin = d20;
                                    }
                                    v1 b12 = y1.b(f11);
                                    double d24 = -b12.a;
                                    double d25 = -b12.b;
                                    for (int i18 = 0; i18 < f11.size(); i18++) {
                                        v1 v1Var7 = (v1) f11.get(i18);
                                        v1Var7.a += d24;
                                        v1Var7.b += d25;
                                    }
                                    w1 a10 = y1.a(f11);
                                    double d26 = a10.c - a10.a;
                                    double d27 = a10.d - a10.b;
                                    for (int i19 = 0; i19 < f11.size(); i19++) {
                                        v1 v1Var8 = (v1) f11.get(i19);
                                        v1Var8.a = (250.0d / d26) * v1Var8.a;
                                        v1Var8.b = (250.0d / d27) * v1Var8.b;
                                    }
                                    v1 b13 = y1.b(f11);
                                    double d28 = Double.MAX_VALUE;
                                    int i20 = -1;
                                    int i21 = -1;
                                    for (int i22 = 0; i22 < y1Var3.c.size(); i22++) {
                                        ArrayList arrayList2 = ((x1) y1Var3.c.get(i22)).b;
                                        double sqrt = (Math.sqrt(5.0d) - 1.0d) * 0.5d;
                                        double d29 = -1.5707963267948966d;
                                        double d30 = 1.0d - sqrt;
                                        double d31 = 1.5707963267948966d;
                                        double d32 = d28;
                                        double d33 = (d30 * 1.5707963267948966d) + (sqrt * (-1.5707963267948966d));
                                        double d34 = y1.d(f11, b13, arrayList2, d33);
                                        double d35 = d33;
                                        double d36 = (sqrt * 1.5707963267948966d) + (d30 * (-1.5707963267948966d));
                                        double d37 = y1.d(f11, b13, arrayList2, d36);
                                        double d38 = d36;
                                        double d39 = d34;
                                        double d40 = d37;
                                        while (Math.abs(d31 - d29) > 0.06981317007977318d) {
                                            if (d39 < d40) {
                                                double d41 = (d30 * d38) + (sqrt * d29);
                                                double d42 = y1.d(f11, b13, arrayList2, d41);
                                                d = d41;
                                                d40 = d39;
                                                d39 = d42;
                                                d31 = d38;
                                                d38 = d35;
                                            } else {
                                                double d43 = (d30 * d35) + (sqrt * d31);
                                                double d44 = y1.d(f11, b13, arrayList2, d43);
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
                                            i20 = ((x1) y1Var3.c.get(i22)).a;
                                            d28 = min;
                                            i21 = i22;
                                        } else {
                                            d28 = d32;
                                        }
                                    }
                                    int i23 = 1.0d - (d28 / y1.n) < 0.8d ? -1 : i20;
                                    if (i23 >= 0 && i23 < l.b.size() && arrayList.size() >= 1) {
                                        r1 r1Var2 = new r1(l.p(i23));
                                        if (i23 == 4) {
                                            int e10 = y1.e(0, arrayList);
                                            if (e10 > 0) {
                                                if (e10 > 10) {
                                                    e10 -= 2;
                                                }
                                                v1 v1Var9 = (v1) arrayList.get(e10);
                                                v1 v1Var10 = (v1) arrayList.get(e10 / 2);
                                                v1 v1Var11 = (v1) arrayList.get(0);
                                                r1Var2.b = (float) v1Var9.a;
                                                r1Var2.c = (float) v1Var9.b;
                                                r1Var2.i = (float) v1Var10.a;
                                                r1Var2.j = (float) v1Var10.b;
                                                r1Var2.d = (float) v1Var11.a;
                                                r1Var2.e = (float) v1Var11.b;
                                                r1Var2.k = 16.0f;
                                            }
                                        } else {
                                            v1 b14 = y1.b(arrayList);
                                            r1Var2.b = (float) b14.a;
                                            r1Var2.c = (float) b14.b;
                                            w1 a11 = y1.a(arrayList);
                                            r1Var2.d = ((float) (a11.c - a11.a)) / 2.0f;
                                            r1Var2.e = ((float) (a11.d - a11.b)) / 2.0f;
                                            if (i23 == 2 && (e6 = y1.e(1, arrayList)) > 0) {
                                                v1 v1Var12 = (v1) arrayList.get(e6);
                                                r1Var2.h = (float) Math.atan2(v1Var12.b - r1Var2.c, v1Var12.a - r1Var2.b);
                                            }
                                        }
                                        r1Var = r1Var2;
                                        if (BuildVars.LOGS_ENABLED) {
                                            StringBuilder sb = new StringBuilder("took ");
                                            sb.append(System.currentTimeMillis() - j11);
                                            sb.append("ms to ");
                                            sb.append(r1Var != null ? "" : "not ");
                                            sb.append("detect a shape");
                                            sb.append(r1Var != null ? " (template#" + i21 + " shape#" + i23 + ")" : "");
                                            Log.i("shapedetector", sb.toString());
                                        }
                                        AndroidUtilities.runOnUIThread(new u1(y1Var3, r1Var, i21, f11, 0));
                                        y1Var3.j.set(false);
                                    }
                                    r1Var = null;
                                    if (BuildVars.LOGS_ENABLED) {
                                    }
                                    AndroidUtilities.runOnUIThread(new u1(y1Var3, r1Var, i21, f11, 0));
                                    y1Var3.j.set(false);
                                }
                            } finally {
                            }
                        }
                        return;
                    default:
                        y1 y1Var4 = y1Var;
                        try {
                            InputStream open = ApplicationLoader.applicationContext.getAssets().open("shapes.dat");
                            while (true) {
                                c3 = 0;
                                if (open.available() > 5) {
                                    x1 x1Var = new x1();
                                    x1Var.a = open.read();
                                    int read = open.read();
                                    int read2 = open.read() - 64;
                                    int read3 = open.read() - 64;
                                    if (open.available() >= read * 2) {
                                        for (int i24 = 0; i24 < read; i24++) {
                                            x1Var.b.add(new v1((open.read() - read2) - 127, (open.read() - read3) - 127));
                                        }
                                        x1Var.c = y1Var4.g.getInt("score" + y1Var4.c.size(), 0);
                                        y1Var4.c.add(x1Var);
                                    }
                                }
                            }
                            if (y1Var4.h && (string = y1Var4.g.getString("moretemplates", null)) != null) {
                                String[] split = string.split("\\|");
                                int size = y1Var4.c.size();
                                int i25 = 0;
                                while (i25 < split.length) {
                                    x1 x1Var2 = new x1();
                                    String[] split2 = split[i25].split(",");
                                    int i26 = 1;
                                    if (split2.length <= 1) {
                                        i12 = i25;
                                    } else {
                                        x1Var2.a = Integer.parseInt(split2[c3]);
                                        while (i26 < split2.length) {
                                            x1Var2.b.add(new v1(Double.parseDouble(split2[i26]), Double.parseDouble(split2[i26 + 1])));
                                            i26 += 2;
                                            i25 = i25;
                                        }
                                        i12 = i25;
                                        x1Var2.c = y1Var4.g.getInt("score" + (size + i12), 0);
                                        y1Var4.c.add(x1Var2);
                                    }
                                    i25 = i12 + 1;
                                    c3 = 0;
                                }
                            }
                            open.close();
                            return;
                        } catch (Exception e11) {
                            FileLog.e(e11);
                            return;
                        }
                }
            }
        });
        this.s = y1Var;
    }

    public final void a(d dVar, boolean z4, i1 i1Var) {
        n1 n1Var;
        if (this.l) {
            o1 o1Var = this.a;
            if (o1Var.getPainting().G || this.g == null) {
                return;
            }
            m currentBrush = dVar == null ? o1Var.getCurrentBrush() : dVar;
            if ((currentBrush instanceof c) || (currentBrush instanceof e)) {
                currentBrush = new f();
            }
            final m mVar = currentBrush;
            this.l = false;
            if (mVar instanceof d) {
                o1Var.getPainting().E = false;
            }
            c1 painting = o1Var.getPainting();
            painting.f.f(new y0(painting, 1));
            this.n = 0;
            this.o = 0;
            this.j = false;
            this.b = false;
            if (z4 && (n1Var = o1Var.a) != null) {
                n1Var.f();
            }
            jv0 jv0Var = o1Var.getPainting().g;
            g1 g1Var = this.g;
            float a2 = o6.a((float) g1Var.a, (float) g1Var.b, 0.0f, 0.0f);
            g1 g1Var2 = this.g;
            float max = Math.max(a2, o6.a((float) g1Var2.a, (float) g1Var2.b, jv0Var.a, 0.0f));
            g1 g1Var3 = this.g;
            float a10 = o6.a((float) g1Var3.a, (float) g1Var3.b, 0.0f, jv0Var.b);
            g1 g1Var4 = this.g;
            final float max2 = Math.max(max, Math.max(a10, o6.a((float) g1Var4.a, (float) g1Var4.b, jv0Var.a, jv0Var.b))) / 0.84f;
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
            g1 g1Var5 = this.g;
            final g1 g1Var6 = new g1(g1Var5.a, g1Var5.b, 1.0d);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.x = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: dg.i0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    o1 o1Var2 = m0.this.a;
                    float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                    d1 d1Var = new d1(new g1[]{g1Var6});
                    m mVar2 = mVar;
                    mVar2.getClass();
                    int currentColor = mVar2 instanceof d ? -1 : o1Var2.getCurrentColor();
                    float f10 = floatValue * max2;
                    d1Var.c = currentColor;
                    d1Var.d = f10;
                    d1Var.e = mVar2;
                    c1 painting2 = o1Var2.getPainting();
                    if (painting2.L != null) {
                        return;
                    }
                    boolean z10 = true;
                    painting2.f.f(new w0(painting2, d1Var, z10, z10, null, 0));
                }
            });
            this.x.addListener(new k0(this, g1Var6, max2, mVar, z4, i1Var));
            this.x.setDuration(450L);
            this.x.setInterpolator(pr.h);
            this.x.start();
            if (z4) {
                BotWebViewVibrationEffect.IMPACT_HEAVY.vibrate();
            }
        }
    }

    public final void b(d1 d1Var) {
        o1 o1Var = this.a;
        int currentColor = o1Var.getCurrentColor();
        float currentWeight = o1Var.getCurrentWeight();
        m currentBrush = o1Var.getCurrentBrush();
        d1Var.c = currentColor;
        d1Var.d = currentWeight;
        d1Var.e = currentBrush;
        if (this.f) {
            this.i = 0.0d;
        }
        d1Var.a = this.i;
        c1 painting = o1Var.getPainting();
        boolean z4 = this.f;
        j0 j0Var = new j0(this, d1Var, 0);
        boolean z10 = false;
        if (painting.L == null) {
            painting.f.f(new w0(painting, d1Var, z4, z10, j0Var, 0));
        }
        this.f = false;
    }

    public final void c(float f10, boolean z4) {
        int i10 = this.n;
        g1[] g1VarArr = this.m;
        if (i10 <= 2) {
            g1[] g1VarArr2 = new g1[i10];
            System.arraycopy(g1VarArr, 0, g1VarArr2, 0, i10);
            b(new d1(g1VarArr2));
            return;
        }
        Vector vector = new Vector();
        g1 g1Var = g1VarArr[0];
        g1 g1Var2 = g1VarArr[1];
        g1 g1Var3 = g1VarArr[2];
        if (g1Var3 == null || g1Var2 == null || g1Var == null) {
            return;
        }
        g1 b10 = g1Var2.b(g1Var);
        g1 b11 = g1Var3.b(g1Var2);
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
            double d13 = (b11.a * d10) + (g1Var2.a * 2.0d * d12 * d) + (b10.a * d11);
            double d14 = (b11.b * d10) + (g1Var2.b * 2.0d * d12 * d) + (b10.b * d11);
            double lerp = ((((b11.c * d10) + ((g1Var2.c * ((2.0f * f14) * f13)) + (b10.c * pow))) - 1.0d) * AndroidUtilities.lerp(f10, 1.0f, k7.o.a(this.o / 16.0f, 0.0f, 1.0f))) + 1.0d;
            g1 g1Var4 = new g1(d13, d14, lerp);
            if (this.c) {
                g1Var4.d = true;
                this.c = false;
            }
            vector.add(g1Var4);
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
        g1[] g1VarArr3 = new g1[vector.size()];
        vector.toArray(g1VarArr3);
        b(new d1(g1VarArr3));
        System.arraycopy(g1VarArr, 1, g1VarArr, 0, 2);
        if (z4) {
            this.n = 0;
        } else {
            this.n = 2;
        }
    }
}
