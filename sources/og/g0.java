package og;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import android.util.Log;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.Components.wr;
import v7.a7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class g0 {
    public static final wr B = new wr(0.0d, 0.5d, 0.0d, 1.0d);
    public m A;
    public final h1 a;
    public boolean b;
    public boolean c;
    public long d;
    public boolean e;
    public boolean f;
    public z0 g;
    public z0 h;
    public double i;
    public boolean j;
    public float k;
    public boolean l;
    public int n;
    public int o;
    public double p;
    public double q;
    public ValueAnimator r;
    public final p1 s;
    public Matrix t;
    public long v;
    public float w;
    public ValueAnimator x;
    public boolean z;
    public final z0[] m = new z0[3];
    public final float[] u = new float[2];
    public final c0 y = new c0(this, 1);

    /* JADX WARN: Type inference failed for: r2v6, types: [og.l1] */
    public g0(h1 h1Var) {
        this.a = h1Var;
        Context context = h1Var.getContext();
        ai.b bVar = new ai.b(this, 25);
        final p1 p1Var = new p1();
        p1Var.b = new ArrayList();
        p1Var.c = new ArrayList();
        p1Var.i = null;
        p1Var.j = new AtomicBoolean(false);
        p1Var.k = new AtomicBoolean(false);
        final int i10 = 0;
        p1Var.l = new Runnable() { // from class: og.l1
            /* JADX WARN: Removed duplicated region for block: B:136:0x0465  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                k1 k1Var;
                int e;
                double d;
                long j3;
                int i11;
                double d10;
                char c10;
                String string;
                int i12;
                switch (i10) {
                    case 0:
                        p1 p1Var2 = p1Var;
                        if (p1Var2.j.get()) {
                            return;
                        }
                        p1Var2.k.set(false);
                        p1Var2.j.set(true);
                        long currentTimeMillis = System.currentTimeMillis();
                        synchronized (p1Var2) {
                            try {
                                if (p1Var2.b.size() < 8) {
                                    p1Var2.j.set(false);
                                } else {
                                    ArrayList f7 = p1.f(p1Var2.b);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add((m1) f7.get(0));
                                    int i13 = 1;
                                    double d11 = 0.0d;
                                    while (i13 < f7.size()) {
                                        m1 m1Var = (m1) f7.get(i13 - 1);
                                        m1 m1Var2 = (m1) f7.get(i13);
                                        m1Var.getClass();
                                        d11 += m1Var.a(m1Var2.a, m1Var2.b);
                                        i13++;
                                        p1Var2 = p1Var2;
                                    }
                                    p1 p1Var3 = p1Var2;
                                    double d12 = d11 / 47;
                                    int i14 = 1;
                                    double d13 = 0.0d;
                                    while (i14 < f7.size()) {
                                        int i15 = i14 - 1;
                                        m1 m1Var3 = (m1) f7.get(i15);
                                        m1 m1Var4 = (m1) f7.get(i14);
                                        m1Var3.getClass();
                                        double d14 = d13;
                                        int i16 = i14;
                                        double a2 = m1Var3.a(m1Var4.a, m1Var4.b);
                                        double d15 = d14 + a2;
                                        if (d15 >= d12) {
                                            double d16 = (d12 - d14) / a2;
                                            i11 = i16;
                                            d10 = d12;
                                            j3 = currentTimeMillis;
                                            m1 m1Var5 = new m1(((((m1) f7.get(i11)).a - ((m1) f7.get(i15)).a) * d16) + ((m1) f7.get(i15)).a, ((((m1) f7.get(i11)).b - ((m1) f7.get(i15)).b) * d16) + ((m1) f7.get(i15)).b);
                                            arrayList.add(m1Var5);
                                            f7.add(i11, m1Var5);
                                            d13 = 0.0d;
                                        } else {
                                            j3 = currentTimeMillis;
                                            i11 = i16;
                                            d10 = d12;
                                            d13 = d15;
                                        }
                                        i14 = i11 + 1;
                                        d12 = d10;
                                        currentTimeMillis = j3;
                                    }
                                    long j10 = currentTimeMillis;
                                    if (arrayList.size() == 47) {
                                        arrayList.add((m1) hc.b.i(1, f7));
                                    }
                                    ArrayList f10 = p1.f(arrayList);
                                    m1 b10 = p1.b(f10);
                                    double atan2 = Math.atan2(b10.b - ((m1) f10.get(0)).b, b10.a - ((m1) f10.get(0)).a);
                                    m1 b11 = p1.b(f10);
                                    double cos = Math.cos(atan2);
                                    double sin = Math.sin(atan2);
                                    int i17 = 0;
                                    while (i17 < f10.size()) {
                                        m1 m1Var6 = (m1) f10.get(i17);
                                        double d17 = m1Var6.a;
                                        double d18 = b11.a;
                                        double d19 = d17 - d18;
                                        double d20 = sin;
                                        double d21 = m1Var6.b;
                                        double d22 = b11.b;
                                        double d23 = d21 - d22;
                                        m1Var6.b = (d23 * cos) + (d19 * d20) + d22;
                                        m1Var6.a = ((d19 * cos) - (d23 * d20)) + d18;
                                        i17++;
                                        sin = d20;
                                    }
                                    m1 b12 = p1.b(f10);
                                    double d24 = -b12.a;
                                    double d25 = -b12.b;
                                    for (int i18 = 0; i18 < f10.size(); i18++) {
                                        m1 m1Var7 = (m1) f10.get(i18);
                                        m1Var7.a += d24;
                                        m1Var7.b += d25;
                                    }
                                    n1 a10 = p1.a(f10);
                                    double d26 = a10.c - a10.a;
                                    double d27 = a10.d - a10.b;
                                    for (int i19 = 0; i19 < f10.size(); i19++) {
                                        m1 m1Var8 = (m1) f10.get(i19);
                                        m1Var8.a = (250.0d / d26) * m1Var8.a;
                                        m1Var8.b = (250.0d / d27) * m1Var8.b;
                                    }
                                    m1 b13 = p1.b(f10);
                                    double d28 = Double.MAX_VALUE;
                                    int i20 = -1;
                                    int i21 = -1;
                                    for (int i22 = 0; i22 < p1Var3.c.size(); i22++) {
                                        ArrayList arrayList2 = ((o1) p1Var3.c.get(i22)).b;
                                        double sqrt = (Math.sqrt(5.0d) - 1.0d) * 0.5d;
                                        double d29 = -1.5707963267948966d;
                                        double d30 = 1.0d - sqrt;
                                        double d31 = 1.5707963267948966d;
                                        double d32 = d28;
                                        double d33 = (d30 * 1.5707963267948966d) + (sqrt * (-1.5707963267948966d));
                                        double d34 = p1.d(f10, b13, arrayList2, d33);
                                        double d35 = d33;
                                        double d36 = (sqrt * 1.5707963267948966d) + (d30 * (-1.5707963267948966d));
                                        double d37 = p1.d(f10, b13, arrayList2, d36);
                                        double d38 = d36;
                                        double d39 = d34;
                                        double d40 = d37;
                                        while (Math.abs(d31 - d29) > 0.06981317007977318d) {
                                            if (d39 < d40) {
                                                double d41 = (d30 * d38) + (sqrt * d29);
                                                double d42 = p1.d(f10, b13, arrayList2, d41);
                                                d = d41;
                                                d40 = d39;
                                                d39 = d42;
                                                d31 = d38;
                                                d38 = d35;
                                            } else {
                                                double d43 = (d30 * d35) + (sqrt * d31);
                                                double d44 = p1.d(f10, b13, arrayList2, d43);
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
                                            i20 = ((o1) p1Var3.c.get(i22)).a;
                                            d28 = min;
                                            i21 = i22;
                                        } else {
                                            d28 = d32;
                                        }
                                    }
                                    int i23 = 1.0d - (d28 / p1.n) < 0.8d ? -1 : i20;
                                    if (i23 >= 0 && i23 < l.b.size() && arrayList.size() >= 1) {
                                        k1 k1Var2 = new k1(l.p(i23));
                                        if (i23 == 4) {
                                            int e7 = p1.e(0, arrayList);
                                            if (e7 > 0) {
                                                if (e7 > 10) {
                                                    e7 -= 2;
                                                }
                                                m1 m1Var9 = (m1) arrayList.get(e7);
                                                m1 m1Var10 = (m1) arrayList.get(e7 / 2);
                                                m1 m1Var11 = (m1) arrayList.get(0);
                                                k1Var2.b = (float) m1Var9.a;
                                                k1Var2.c = (float) m1Var9.b;
                                                k1Var2.i = (float) m1Var10.a;
                                                k1Var2.j = (float) m1Var10.b;
                                                k1Var2.d = (float) m1Var11.a;
                                                k1Var2.e = (float) m1Var11.b;
                                                k1Var2.k = 16.0f;
                                            }
                                        } else {
                                            m1 b14 = p1.b(arrayList);
                                            k1Var2.b = (float) b14.a;
                                            k1Var2.c = (float) b14.b;
                                            n1 a11 = p1.a(arrayList);
                                            k1Var2.d = ((float) (a11.c - a11.a)) / 2.0f;
                                            k1Var2.e = ((float) (a11.d - a11.b)) / 2.0f;
                                            if (i23 == 2 && (e = p1.e(1, arrayList)) > 0) {
                                                m1 m1Var12 = (m1) arrayList.get(e);
                                                k1Var2.h = (float) Math.atan2(m1Var12.b - k1Var2.c, m1Var12.a - k1Var2.b);
                                            }
                                        }
                                        k1Var = k1Var2;
                                        if (BuildVars.LOGS_ENABLED) {
                                            StringBuilder sb2 = new StringBuilder("took ");
                                            sb2.append(System.currentTimeMillis() - j10);
                                            sb2.append("ms to ");
                                            sb2.append(k1Var != null ? "" : "not ");
                                            sb2.append("detect a shape");
                                            sb2.append(k1Var != null ? " (template#" + i21 + " shape#" + i23 + ")" : "");
                                            Log.i("shapedetector", sb2.toString());
                                        }
                                        AndroidUtilities.runOnUIThread(new di.q((Object) p1Var3, (Object) k1Var, i21, f10, 6));
                                        p1Var3.j.set(false);
                                    }
                                    k1Var = null;
                                    if (BuildVars.LOGS_ENABLED) {
                                    }
                                    AndroidUtilities.runOnUIThread(new di.q((Object) p1Var3, (Object) k1Var, i21, f10, 6));
                                    p1Var3.j.set(false);
                                }
                            } finally {
                            }
                        }
                        return;
                    default:
                        p1 p1Var4 = p1Var;
                        try {
                            InputStream open = ApplicationLoader.applicationContext.getAssets().open("shapes.dat");
                            while (true) {
                                c10 = 0;
                                if (open.available() > 5) {
                                    o1 o1Var = new o1();
                                    o1Var.a = open.read();
                                    int read = open.read();
                                    int read2 = open.read() - 64;
                                    int read3 = open.read() - 64;
                                    if (open.available() >= read * 2) {
                                        for (int i24 = 0; i24 < read; i24++) {
                                            o1Var.b.add(new m1((open.read() - read2) - 127, (open.read() - read3) - 127));
                                        }
                                        o1Var.c = p1Var4.g.getInt("score" + p1Var4.c.size(), 0);
                                        p1Var4.c.add(o1Var);
                                    }
                                }
                            }
                            if (p1Var4.h && (string = p1Var4.g.getString("moretemplates", null)) != null) {
                                String[] split = string.split("\\|");
                                int size = p1Var4.c.size();
                                int i25 = 0;
                                while (i25 < split.length) {
                                    o1 o1Var2 = new o1();
                                    String[] split2 = split[i25].split(",");
                                    int i26 = 1;
                                    if (split2.length <= 1) {
                                        i12 = i25;
                                    } else {
                                        o1Var2.a = Integer.parseInt(split2[c10]);
                                        while (i26 < split2.length) {
                                            o1Var2.b.add(new m1(Double.parseDouble(split2[i26]), Double.parseDouble(split2[i26 + 1])));
                                            i26 += 2;
                                            i25 = i25;
                                        }
                                        i12 = i25;
                                        o1Var2.c = p1Var4.g.getInt("score" + (size + i12), 0);
                                        p1Var4.c.add(o1Var2);
                                    }
                                    i25 = i12 + 1;
                                    c10 = 0;
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
        p1Var.f = context;
        p1Var.e = bVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        p1Var.g = sharedPreferences;
        p1Var.h = sharedPreferences.getBoolean("learning", false);
        p1Var.a = sharedPreferences.getInt("scoreall", 0);
        final int i11 = 1;
        p1.m.postRunnable(new Runnable() { // from class: og.l1
            /* JADX WARN: Removed duplicated region for block: B:136:0x0465  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                k1 k1Var;
                int e;
                double d;
                long j3;
                int i112;
                double d10;
                char c10;
                String string;
                int i12;
                switch (i11) {
                    case 0:
                        p1 p1Var2 = p1Var;
                        if (p1Var2.j.get()) {
                            return;
                        }
                        p1Var2.k.set(false);
                        p1Var2.j.set(true);
                        long currentTimeMillis = System.currentTimeMillis();
                        synchronized (p1Var2) {
                            try {
                                if (p1Var2.b.size() < 8) {
                                    p1Var2.j.set(false);
                                } else {
                                    ArrayList f7 = p1.f(p1Var2.b);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add((m1) f7.get(0));
                                    int i13 = 1;
                                    double d11 = 0.0d;
                                    while (i13 < f7.size()) {
                                        m1 m1Var = (m1) f7.get(i13 - 1);
                                        m1 m1Var2 = (m1) f7.get(i13);
                                        m1Var.getClass();
                                        d11 += m1Var.a(m1Var2.a, m1Var2.b);
                                        i13++;
                                        p1Var2 = p1Var2;
                                    }
                                    p1 p1Var3 = p1Var2;
                                    double d12 = d11 / 47;
                                    int i14 = 1;
                                    double d13 = 0.0d;
                                    while (i14 < f7.size()) {
                                        int i15 = i14 - 1;
                                        m1 m1Var3 = (m1) f7.get(i15);
                                        m1 m1Var4 = (m1) f7.get(i14);
                                        m1Var3.getClass();
                                        double d14 = d13;
                                        int i16 = i14;
                                        double a2 = m1Var3.a(m1Var4.a, m1Var4.b);
                                        double d15 = d14 + a2;
                                        if (d15 >= d12) {
                                            double d16 = (d12 - d14) / a2;
                                            i112 = i16;
                                            d10 = d12;
                                            j3 = currentTimeMillis;
                                            m1 m1Var5 = new m1(((((m1) f7.get(i112)).a - ((m1) f7.get(i15)).a) * d16) + ((m1) f7.get(i15)).a, ((((m1) f7.get(i112)).b - ((m1) f7.get(i15)).b) * d16) + ((m1) f7.get(i15)).b);
                                            arrayList.add(m1Var5);
                                            f7.add(i112, m1Var5);
                                            d13 = 0.0d;
                                        } else {
                                            j3 = currentTimeMillis;
                                            i112 = i16;
                                            d10 = d12;
                                            d13 = d15;
                                        }
                                        i14 = i112 + 1;
                                        d12 = d10;
                                        currentTimeMillis = j3;
                                    }
                                    long j10 = currentTimeMillis;
                                    if (arrayList.size() == 47) {
                                        arrayList.add((m1) hc.b.i(1, f7));
                                    }
                                    ArrayList f10 = p1.f(arrayList);
                                    m1 b10 = p1.b(f10);
                                    double atan2 = Math.atan2(b10.b - ((m1) f10.get(0)).b, b10.a - ((m1) f10.get(0)).a);
                                    m1 b11 = p1.b(f10);
                                    double cos = Math.cos(atan2);
                                    double sin = Math.sin(atan2);
                                    int i17 = 0;
                                    while (i17 < f10.size()) {
                                        m1 m1Var6 = (m1) f10.get(i17);
                                        double d17 = m1Var6.a;
                                        double d18 = b11.a;
                                        double d19 = d17 - d18;
                                        double d20 = sin;
                                        double d21 = m1Var6.b;
                                        double d22 = b11.b;
                                        double d23 = d21 - d22;
                                        m1Var6.b = (d23 * cos) + (d19 * d20) + d22;
                                        m1Var6.a = ((d19 * cos) - (d23 * d20)) + d18;
                                        i17++;
                                        sin = d20;
                                    }
                                    m1 b12 = p1.b(f10);
                                    double d24 = -b12.a;
                                    double d25 = -b12.b;
                                    for (int i18 = 0; i18 < f10.size(); i18++) {
                                        m1 m1Var7 = (m1) f10.get(i18);
                                        m1Var7.a += d24;
                                        m1Var7.b += d25;
                                    }
                                    n1 a10 = p1.a(f10);
                                    double d26 = a10.c - a10.a;
                                    double d27 = a10.d - a10.b;
                                    for (int i19 = 0; i19 < f10.size(); i19++) {
                                        m1 m1Var8 = (m1) f10.get(i19);
                                        m1Var8.a = (250.0d / d26) * m1Var8.a;
                                        m1Var8.b = (250.0d / d27) * m1Var8.b;
                                    }
                                    m1 b13 = p1.b(f10);
                                    double d28 = Double.MAX_VALUE;
                                    int i20 = -1;
                                    int i21 = -1;
                                    for (int i22 = 0; i22 < p1Var3.c.size(); i22++) {
                                        ArrayList arrayList2 = ((o1) p1Var3.c.get(i22)).b;
                                        double sqrt = (Math.sqrt(5.0d) - 1.0d) * 0.5d;
                                        double d29 = -1.5707963267948966d;
                                        double d30 = 1.0d - sqrt;
                                        double d31 = 1.5707963267948966d;
                                        double d32 = d28;
                                        double d33 = (d30 * 1.5707963267948966d) + (sqrt * (-1.5707963267948966d));
                                        double d34 = p1.d(f10, b13, arrayList2, d33);
                                        double d35 = d33;
                                        double d36 = (sqrt * 1.5707963267948966d) + (d30 * (-1.5707963267948966d));
                                        double d37 = p1.d(f10, b13, arrayList2, d36);
                                        double d38 = d36;
                                        double d39 = d34;
                                        double d40 = d37;
                                        while (Math.abs(d31 - d29) > 0.06981317007977318d) {
                                            if (d39 < d40) {
                                                double d41 = (d30 * d38) + (sqrt * d29);
                                                double d42 = p1.d(f10, b13, arrayList2, d41);
                                                d = d41;
                                                d40 = d39;
                                                d39 = d42;
                                                d31 = d38;
                                                d38 = d35;
                                            } else {
                                                double d43 = (d30 * d35) + (sqrt * d31);
                                                double d44 = p1.d(f10, b13, arrayList2, d43);
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
                                            i20 = ((o1) p1Var3.c.get(i22)).a;
                                            d28 = min;
                                            i21 = i22;
                                        } else {
                                            d28 = d32;
                                        }
                                    }
                                    int i23 = 1.0d - (d28 / p1.n) < 0.8d ? -1 : i20;
                                    if (i23 >= 0 && i23 < l.b.size() && arrayList.size() >= 1) {
                                        k1 k1Var2 = new k1(l.p(i23));
                                        if (i23 == 4) {
                                            int e7 = p1.e(0, arrayList);
                                            if (e7 > 0) {
                                                if (e7 > 10) {
                                                    e7 -= 2;
                                                }
                                                m1 m1Var9 = (m1) arrayList.get(e7);
                                                m1 m1Var10 = (m1) arrayList.get(e7 / 2);
                                                m1 m1Var11 = (m1) arrayList.get(0);
                                                k1Var2.b = (float) m1Var9.a;
                                                k1Var2.c = (float) m1Var9.b;
                                                k1Var2.i = (float) m1Var10.a;
                                                k1Var2.j = (float) m1Var10.b;
                                                k1Var2.d = (float) m1Var11.a;
                                                k1Var2.e = (float) m1Var11.b;
                                                k1Var2.k = 16.0f;
                                            }
                                        } else {
                                            m1 b14 = p1.b(arrayList);
                                            k1Var2.b = (float) b14.a;
                                            k1Var2.c = (float) b14.b;
                                            n1 a11 = p1.a(arrayList);
                                            k1Var2.d = ((float) (a11.c - a11.a)) / 2.0f;
                                            k1Var2.e = ((float) (a11.d - a11.b)) / 2.0f;
                                            if (i23 == 2 && (e = p1.e(1, arrayList)) > 0) {
                                                m1 m1Var12 = (m1) arrayList.get(e);
                                                k1Var2.h = (float) Math.atan2(m1Var12.b - k1Var2.c, m1Var12.a - k1Var2.b);
                                            }
                                        }
                                        k1Var = k1Var2;
                                        if (BuildVars.LOGS_ENABLED) {
                                            StringBuilder sb2 = new StringBuilder("took ");
                                            sb2.append(System.currentTimeMillis() - j10);
                                            sb2.append("ms to ");
                                            sb2.append(k1Var != null ? "" : "not ");
                                            sb2.append("detect a shape");
                                            sb2.append(k1Var != null ? " (template#" + i21 + " shape#" + i23 + ")" : "");
                                            Log.i("shapedetector", sb2.toString());
                                        }
                                        AndroidUtilities.runOnUIThread(new di.q((Object) p1Var3, (Object) k1Var, i21, f10, 6));
                                        p1Var3.j.set(false);
                                    }
                                    k1Var = null;
                                    if (BuildVars.LOGS_ENABLED) {
                                    }
                                    AndroidUtilities.runOnUIThread(new di.q((Object) p1Var3, (Object) k1Var, i21, f10, 6));
                                    p1Var3.j.set(false);
                                }
                            } finally {
                            }
                        }
                        return;
                    default:
                        p1 p1Var4 = p1Var;
                        try {
                            InputStream open = ApplicationLoader.applicationContext.getAssets().open("shapes.dat");
                            while (true) {
                                c10 = 0;
                                if (open.available() > 5) {
                                    o1 o1Var = new o1();
                                    o1Var.a = open.read();
                                    int read = open.read();
                                    int read2 = open.read() - 64;
                                    int read3 = open.read() - 64;
                                    if (open.available() >= read * 2) {
                                        for (int i24 = 0; i24 < read; i24++) {
                                            o1Var.b.add(new m1((open.read() - read2) - 127, (open.read() - read3) - 127));
                                        }
                                        o1Var.c = p1Var4.g.getInt("score" + p1Var4.c.size(), 0);
                                        p1Var4.c.add(o1Var);
                                    }
                                }
                            }
                            if (p1Var4.h && (string = p1Var4.g.getString("moretemplates", null)) != null) {
                                String[] split = string.split("\\|");
                                int size = p1Var4.c.size();
                                int i25 = 0;
                                while (i25 < split.length) {
                                    o1 o1Var2 = new o1();
                                    String[] split2 = split[i25].split(",");
                                    int i26 = 1;
                                    if (split2.length <= 1) {
                                        i12 = i25;
                                    } else {
                                        o1Var2.a = Integer.parseInt(split2[c10]);
                                        while (i26 < split2.length) {
                                            o1Var2.b.add(new m1(Double.parseDouble(split2[i26]), Double.parseDouble(split2[i26 + 1])));
                                            i26 += 2;
                                            i25 = i25;
                                        }
                                        i12 = i25;
                                        o1Var2.c = p1Var4.g.getInt("score" + (size + i12), 0);
                                        p1Var4.c.add(o1Var2);
                                    }
                                    i25 = i12 + 1;
                                    c10 = 0;
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
        this.s = p1Var;
    }

    public final void a(d dVar, boolean z10, b1 b1Var) {
        g1 g1Var;
        if (this.l) {
            h1 h1Var = this.a;
            if (h1Var.getPainting().G || this.g == null) {
                return;
            }
            m currentBrush = dVar == null ? h1Var.getCurrentBrush() : dVar;
            if ((currentBrush instanceof c) || (currentBrush instanceof e)) {
                currentBrush = new f();
            }
            final m mVar = currentBrush;
            this.l = false;
            if (mVar instanceof d) {
                h1Var.getPainting().E = false;
            }
            v0 painting = h1Var.getPainting();
            painting.f.f(new r0(painting, 1));
            this.n = 0;
            this.o = 0;
            this.j = false;
            this.b = false;
            if (z10 && (g1Var = h1Var.a) != null) {
                g1Var.f();
            }
            tv0 tv0Var = h1Var.getPainting().g;
            z0 z0Var = this.g;
            float a2 = a7.a((float) z0Var.a, (float) z0Var.b, 0.0f, 0.0f);
            z0 z0Var2 = this.g;
            float max = Math.max(a2, a7.a((float) z0Var2.a, (float) z0Var2.b, tv0Var.a, 0.0f));
            z0 z0Var3 = this.g;
            float a10 = a7.a((float) z0Var3.a, (float) z0Var3.b, 0.0f, tv0Var.b);
            z0 z0Var4 = this.g;
            final float max2 = Math.max(max, Math.max(a10, a7.a((float) z0Var4.a, (float) z0Var4.b, tv0Var.a, tv0Var.b))) / 0.84f;
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
            z0 z0Var5 = this.g;
            final z0 z0Var6 = new z0(z0Var5.a, z0Var5.b, 1.0d);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.x = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: og.d0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    h1 h1Var2 = g0.this.a;
                    float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                    w0 w0Var = new w0(new z0[]{z0Var6});
                    m mVar2 = mVar;
                    mVar2.getClass();
                    int currentColor = mVar2 instanceof d ? -1 : h1Var2.getCurrentColor();
                    float f7 = floatValue * max2;
                    w0Var.c = currentColor;
                    w0Var.d = f7;
                    w0Var.e = mVar2;
                    v0 painting2 = h1Var2.getPainting();
                    if (painting2.L != null) {
                        return;
                    }
                    boolean z11 = true;
                    painting2.f.f(new p0(0, painting2, w0Var, null, z11, z11));
                }
            });
            this.x.addListener(new f0(this, z0Var6, max2, mVar, z10, b1Var));
            this.x.setDuration(450L);
            this.x.setInterpolator(wr.h);
            this.x.start();
            if (z10) {
                BotWebViewVibrationEffect.IMPACT_HEAVY.vibrate();
            }
        }
    }

    public final void b(w0 w0Var) {
        h1 h1Var = this.a;
        int currentColor = h1Var.getCurrentColor();
        float currentWeight = h1Var.getCurrentWeight();
        m currentBrush = h1Var.getCurrentBrush();
        w0Var.c = currentColor;
        w0Var.d = currentWeight;
        w0Var.e = currentBrush;
        if (this.f) {
            this.i = 0.0d;
        }
        w0Var.a = this.i;
        v0 painting = h1Var.getPainting();
        boolean z10 = this.f;
        e0 e0Var = new e0(this, w0Var, 0);
        boolean z11 = false;
        if (painting.L == null) {
            painting.f.f(new p0(0, painting, w0Var, e0Var, z10, z11));
        }
        this.f = false;
    }

    public final void c(float f7, boolean z10) {
        int i10 = this.n;
        z0[] z0VarArr = this.m;
        if (i10 <= 2) {
            z0[] z0VarArr2 = new z0[i10];
            System.arraycopy(z0VarArr, 0, z0VarArr2, 0, i10);
            b(new w0(z0VarArr2));
            return;
        }
        Vector vector = new Vector();
        z0 z0Var = z0VarArr[0];
        z0 z0Var2 = z0VarArr[1];
        z0 z0Var3 = z0VarArr[2];
        if (z0Var3 == null || z0Var2 == null || z0Var == null) {
            return;
        }
        z0 b10 = z0Var2.b(z0Var);
        z0 b11 = z0Var3.b(z0Var2);
        int min = (int) Math.min(48.0d, Math.max(Math.floor(b10.a(b11) / 1), 24.0d));
        float f10 = 1.0f;
        float f11 = 1.0f / min;
        int i11 = 0;
        float f12 = 0.0f;
        while (i11 < min) {
            float f13 = f10 - f12;
            double d = f13;
            double pow = Math.pow(d, 2.0d);
            double d10 = f12 * f12;
            double d11 = f13 * f13;
            double d12 = f12;
            double d13 = (b11.a * d10) + (z0Var2.a * 2.0d * d12 * d) + (b10.a * d11);
            double d14 = (b11.b * d10) + (z0Var2.b * 2.0d * d12 * d) + (b10.b * d11);
            double lerp = ((((b11.c * d10) + ((z0Var2.c * ((2.0f * f13) * f12)) + (b10.c * pow))) - 1.0d) * AndroidUtilities.lerp(f7, 1.0f, w7.q.a(this.o / 16.0f, 0.0f, 1.0f))) + 1.0d;
            z0 z0Var4 = new z0(d13, d14, lerp);
            if (this.c) {
                z0Var4.d = true;
                this.c = false;
            }
            vector.add(z0Var4);
            this.p += lerp;
            this.q += 1.0d;
            f12 += f11;
            i11++;
            f10 = 1.0f;
        }
        if (z10) {
            b11.d = true;
        }
        vector.add(b11);
        z0[] z0VarArr3 = new z0[vector.size()];
        vector.toArray(z0VarArr3);
        b(new w0(z0VarArr3));
        System.arraycopy(z0VarArr, 1, z0VarArr, 0, 2);
        if (z10) {
            this.n = 0;
        } else {
            this.n = 2;
        }
    }
}
