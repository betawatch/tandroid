package ag;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import android.util.Log;
import i7.z5;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.bv0;
import org.telegram.ui.Components.jr;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class n0 {
    public static final jr B = new jr(0.0d, 0.5d, 0.0d, 1.0d);
    public m A;
    public final t1 a;
    public boolean b;
    public boolean c;
    public long d;
    public boolean e;
    public boolean f;
    public j1 g;
    public j1 h;
    public double i;
    public boolean j;
    public float k;
    public boolean l;
    public int n;
    public int o;
    public double p;
    public double q;
    public ValueAnimator r;
    public final d2 s;
    public Matrix t;
    public long v;
    public float w;
    public ValueAnimator x;
    public boolean z;
    public final j1[] m = new j1[3];
    public final float[] u = new float[2];
    public final h0 y = new h0(this, 1);

    /* JADX WARN: Type inference failed for: r2v6, types: [ag.x1] */
    public n0(t1 t1Var) {
        this.a = t1Var;
        Context context = t1Var.getContext();
        i0 i0Var = new i0(this, 0);
        final d2 d2Var = new d2();
        d2Var.b = new ArrayList();
        d2Var.c = new ArrayList();
        d2Var.i = null;
        d2Var.j = new AtomicBoolean(false);
        d2Var.k = new AtomicBoolean(false);
        final int i10 = 0;
        d2Var.l = new Runnable() { // from class: ag.x1
            /* JADX WARN: Removed duplicated region for block: B:136:0x0465  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                w1 w1Var;
                int e10;
                double d;
                long j10;
                int i11;
                double d10;
                char c3;
                String string;
                int i12;
                switch (i10) {
                    case 0:
                        d2 d2Var2 = d2Var;
                        if (d2Var2.j.get()) {
                            return;
                        }
                        d2Var2.k.set(false);
                        d2Var2.j.set(true);
                        long currentTimeMillis = System.currentTimeMillis();
                        synchronized (d2Var2) {
                            try {
                                if (d2Var2.b.size() < 8) {
                                    d2Var2.j.set(false);
                                } else {
                                    ArrayList f9 = d2.f(d2Var2.b);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add((a2) f9.get(0));
                                    int i13 = 1;
                                    double d11 = 0.0d;
                                    while (i13 < f9.size()) {
                                        a2 a2Var = (a2) f9.get(i13 - 1);
                                        a2 a2Var2 = (a2) f9.get(i13);
                                        a2Var.getClass();
                                        d11 += a2Var.a(a2Var2.a, a2Var2.b);
                                        i13++;
                                        d2Var2 = d2Var2;
                                    }
                                    d2 d2Var3 = d2Var2;
                                    double d12 = d11 / 47;
                                    int i14 = 1;
                                    double d13 = 0.0d;
                                    while (i14 < f9.size()) {
                                        int i15 = i14 - 1;
                                        a2 a2Var3 = (a2) f9.get(i15);
                                        a2 a2Var4 = (a2) f9.get(i14);
                                        a2Var3.getClass();
                                        double d14 = d13;
                                        int i16 = i14;
                                        double a2 = a2Var3.a(a2Var4.a, a2Var4.b);
                                        double d15 = d14 + a2;
                                        if (d15 >= d12) {
                                            double d16 = (d12 - d14) / a2;
                                            i11 = i16;
                                            d10 = d12;
                                            j10 = currentTimeMillis;
                                            a2 a2Var5 = new a2(((((a2) f9.get(i11)).a - ((a2) f9.get(i15)).a) * d16) + ((a2) f9.get(i15)).a, ((((a2) f9.get(i11)).b - ((a2) f9.get(i15)).b) * d16) + ((a2) f9.get(i15)).b);
                                            arrayList.add(a2Var5);
                                            f9.add(i11, a2Var5);
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
                                        arrayList.add((a2) j7.l1.i(1, f9));
                                    }
                                    ArrayList f10 = d2.f(arrayList);
                                    a2 b10 = d2.b(f10);
                                    double atan2 = Math.atan2(b10.b - ((a2) f10.get(0)).b, b10.a - ((a2) f10.get(0)).a);
                                    a2 b11 = d2.b(f10);
                                    double cos = Math.cos(atan2);
                                    double sin = Math.sin(atan2);
                                    int i17 = 0;
                                    while (i17 < f10.size()) {
                                        a2 a2Var6 = (a2) f10.get(i17);
                                        double d17 = a2Var6.a;
                                        double d18 = b11.a;
                                        double d19 = d17 - d18;
                                        double d20 = sin;
                                        double d21 = a2Var6.b;
                                        double d22 = b11.b;
                                        double d23 = d21 - d22;
                                        a2Var6.b = (d23 * cos) + (d19 * d20) + d22;
                                        a2Var6.a = ((d19 * cos) - (d23 * d20)) + d18;
                                        i17++;
                                        sin = d20;
                                    }
                                    a2 b12 = d2.b(f10);
                                    double d24 = -b12.a;
                                    double d25 = -b12.b;
                                    for (int i18 = 0; i18 < f10.size(); i18++) {
                                        a2 a2Var7 = (a2) f10.get(i18);
                                        a2Var7.a += d24;
                                        a2Var7.b += d25;
                                    }
                                    b2 a10 = d2.a(f10);
                                    double d26 = a10.c - a10.a;
                                    double d27 = a10.d - a10.b;
                                    for (int i19 = 0; i19 < f10.size(); i19++) {
                                        a2 a2Var8 = (a2) f10.get(i19);
                                        a2Var8.a = (250.0d / d26) * a2Var8.a;
                                        a2Var8.b = (250.0d / d27) * a2Var8.b;
                                    }
                                    a2 b13 = d2.b(f10);
                                    double d28 = Double.MAX_VALUE;
                                    int i20 = -1;
                                    int i21 = -1;
                                    for (int i22 = 0; i22 < d2Var3.c.size(); i22++) {
                                        ArrayList arrayList2 = ((c2) d2Var3.c.get(i22)).b;
                                        double sqrt = (Math.sqrt(5.0d) - 1.0d) * 0.5d;
                                        double d29 = -1.5707963267948966d;
                                        double d30 = 1.0d - sqrt;
                                        double d31 = 1.5707963267948966d;
                                        double d32 = d28;
                                        double d33 = (d30 * 1.5707963267948966d) + (sqrt * (-1.5707963267948966d));
                                        double d34 = d2.d(f10, b13, arrayList2, d33);
                                        double d35 = d33;
                                        double d36 = (sqrt * 1.5707963267948966d) + (d30 * (-1.5707963267948966d));
                                        double d37 = d2.d(f10, b13, arrayList2, d36);
                                        double d38 = d36;
                                        double d39 = d34;
                                        double d40 = d37;
                                        while (Math.abs(d31 - d29) > 0.06981317007977318d) {
                                            if (d39 < d40) {
                                                double d41 = (d30 * d38) + (sqrt * d29);
                                                double d42 = d2.d(f10, b13, arrayList2, d41);
                                                d = d41;
                                                d40 = d39;
                                                d39 = d42;
                                                d31 = d38;
                                                d38 = d35;
                                            } else {
                                                double d43 = (d30 * d35) + (sqrt * d31);
                                                double d44 = d2.d(f10, b13, arrayList2, d43);
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
                                            i20 = ((c2) d2Var3.c.get(i22)).a;
                                            d28 = min;
                                            i21 = i22;
                                        } else {
                                            d28 = d32;
                                        }
                                    }
                                    int i23 = 1.0d - (d28 / d2.n) < 0.8d ? -1 : i20;
                                    if (i23 >= 0 && i23 < l.b.size() && arrayList.size() >= 1) {
                                        w1 w1Var2 = new w1(l.p(i23));
                                        if (i23 == 4) {
                                            int e11 = d2.e(0, arrayList);
                                            if (e11 > 0) {
                                                if (e11 > 10) {
                                                    e11 -= 2;
                                                }
                                                a2 a2Var9 = (a2) arrayList.get(e11);
                                                a2 a2Var10 = (a2) arrayList.get(e11 / 2);
                                                a2 a2Var11 = (a2) arrayList.get(0);
                                                w1Var2.b = (float) a2Var9.a;
                                                w1Var2.c = (float) a2Var9.b;
                                                w1Var2.i = (float) a2Var10.a;
                                                w1Var2.j = (float) a2Var10.b;
                                                w1Var2.d = (float) a2Var11.a;
                                                w1Var2.e = (float) a2Var11.b;
                                                w1Var2.k = 16.0f;
                                            }
                                        } else {
                                            a2 b14 = d2.b(arrayList);
                                            w1Var2.b = (float) b14.a;
                                            w1Var2.c = (float) b14.b;
                                            b2 a11 = d2.a(arrayList);
                                            w1Var2.d = ((float) (a11.c - a11.a)) / 2.0f;
                                            w1Var2.e = ((float) (a11.d - a11.b)) / 2.0f;
                                            if (i23 == 2 && (e10 = d2.e(1, arrayList)) > 0) {
                                                a2 a2Var12 = (a2) arrayList.get(e10);
                                                w1Var2.h = (float) Math.atan2(a2Var12.b - w1Var2.c, a2Var12.a - w1Var2.b);
                                            }
                                        }
                                        w1Var = w1Var2;
                                        if (BuildVars.LOGS_ENABLED) {
                                            StringBuilder sb2 = new StringBuilder("took ");
                                            sb2.append(System.currentTimeMillis() - j11);
                                            sb2.append("ms to ");
                                            sb2.append(w1Var != null ? "" : "not ");
                                            sb2.append("detect a shape");
                                            sb2.append(w1Var != null ? " (template#" + i21 + " shape#" + i23 + ")" : "");
                                            Log.i("shapedetector", sb2.toString());
                                        }
                                        AndroidUtilities.runOnUIThread(new z1(d2Var3, w1Var, i21, f10, 0));
                                        d2Var3.j.set(false);
                                    }
                                    w1Var = null;
                                    if (BuildVars.LOGS_ENABLED) {
                                    }
                                    AndroidUtilities.runOnUIThread(new z1(d2Var3, w1Var, i21, f10, 0));
                                    d2Var3.j.set(false);
                                }
                            } finally {
                            }
                        }
                        return;
                    default:
                        d2 d2Var4 = d2Var;
                        try {
                            InputStream open = ApplicationLoader.applicationContext.getAssets().open("shapes.dat");
                            while (true) {
                                c3 = 0;
                                if (open.available() > 5) {
                                    c2 c2Var = new c2();
                                    c2Var.a = open.read();
                                    int read = open.read();
                                    int read2 = open.read() - 64;
                                    int read3 = open.read() - 64;
                                    if (open.available() >= read * 2) {
                                        for (int i24 = 0; i24 < read; i24++) {
                                            c2Var.b.add(new a2((open.read() - read2) - 127, (open.read() - read3) - 127));
                                        }
                                        c2Var.c = d2Var4.g.getInt("score" + d2Var4.c.size(), 0);
                                        d2Var4.c.add(c2Var);
                                    }
                                }
                            }
                            if (d2Var4.h && (string = d2Var4.g.getString("moretemplates", null)) != null) {
                                String[] split = string.split("\\|");
                                int size = d2Var4.c.size();
                                int i25 = 0;
                                while (i25 < split.length) {
                                    c2 c2Var2 = new c2();
                                    String[] split2 = split[i25].split(",");
                                    int i26 = 1;
                                    if (split2.length <= 1) {
                                        i12 = i25;
                                    } else {
                                        c2Var2.a = Integer.parseInt(split2[c3]);
                                        while (i26 < split2.length) {
                                            c2Var2.b.add(new a2(Double.parseDouble(split2[i26]), Double.parseDouble(split2[i26 + 1])));
                                            i26 += 2;
                                            i25 = i25;
                                        }
                                        i12 = i25;
                                        c2Var2.c = d2Var4.g.getInt("score" + (size + i12), 0);
                                        d2Var4.c.add(c2Var2);
                                    }
                                    i25 = i12 + 1;
                                    c3 = 0;
                                }
                            }
                            open.close();
                            return;
                        } catch (Exception e12) {
                            FileLog.e(e12);
                            return;
                        }
                }
            }
        };
        d2Var.f = context;
        d2Var.e = i0Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        d2Var.g = sharedPreferences;
        d2Var.h = sharedPreferences.getBoolean("learning", false);
        d2Var.a = sharedPreferences.getInt("scoreall", 0);
        final int i11 = 1;
        d2.m.postRunnable(new Runnable() { // from class: ag.x1
            /* JADX WARN: Removed duplicated region for block: B:136:0x0465  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                w1 w1Var;
                int e10;
                double d;
                long j10;
                int i112;
                double d10;
                char c3;
                String string;
                int i12;
                switch (i11) {
                    case 0:
                        d2 d2Var2 = d2Var;
                        if (d2Var2.j.get()) {
                            return;
                        }
                        d2Var2.k.set(false);
                        d2Var2.j.set(true);
                        long currentTimeMillis = System.currentTimeMillis();
                        synchronized (d2Var2) {
                            try {
                                if (d2Var2.b.size() < 8) {
                                    d2Var2.j.set(false);
                                } else {
                                    ArrayList f9 = d2.f(d2Var2.b);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add((a2) f9.get(0));
                                    int i13 = 1;
                                    double d11 = 0.0d;
                                    while (i13 < f9.size()) {
                                        a2 a2Var = (a2) f9.get(i13 - 1);
                                        a2 a2Var2 = (a2) f9.get(i13);
                                        a2Var.getClass();
                                        d11 += a2Var.a(a2Var2.a, a2Var2.b);
                                        i13++;
                                        d2Var2 = d2Var2;
                                    }
                                    d2 d2Var3 = d2Var2;
                                    double d12 = d11 / 47;
                                    int i14 = 1;
                                    double d13 = 0.0d;
                                    while (i14 < f9.size()) {
                                        int i15 = i14 - 1;
                                        a2 a2Var3 = (a2) f9.get(i15);
                                        a2 a2Var4 = (a2) f9.get(i14);
                                        a2Var3.getClass();
                                        double d14 = d13;
                                        int i16 = i14;
                                        double a2 = a2Var3.a(a2Var4.a, a2Var4.b);
                                        double d15 = d14 + a2;
                                        if (d15 >= d12) {
                                            double d16 = (d12 - d14) / a2;
                                            i112 = i16;
                                            d10 = d12;
                                            j10 = currentTimeMillis;
                                            a2 a2Var5 = new a2(((((a2) f9.get(i112)).a - ((a2) f9.get(i15)).a) * d16) + ((a2) f9.get(i15)).a, ((((a2) f9.get(i112)).b - ((a2) f9.get(i15)).b) * d16) + ((a2) f9.get(i15)).b);
                                            arrayList.add(a2Var5);
                                            f9.add(i112, a2Var5);
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
                                        arrayList.add((a2) j7.l1.i(1, f9));
                                    }
                                    ArrayList f10 = d2.f(arrayList);
                                    a2 b10 = d2.b(f10);
                                    double atan2 = Math.atan2(b10.b - ((a2) f10.get(0)).b, b10.a - ((a2) f10.get(0)).a);
                                    a2 b11 = d2.b(f10);
                                    double cos = Math.cos(atan2);
                                    double sin = Math.sin(atan2);
                                    int i17 = 0;
                                    while (i17 < f10.size()) {
                                        a2 a2Var6 = (a2) f10.get(i17);
                                        double d17 = a2Var6.a;
                                        double d18 = b11.a;
                                        double d19 = d17 - d18;
                                        double d20 = sin;
                                        double d21 = a2Var6.b;
                                        double d22 = b11.b;
                                        double d23 = d21 - d22;
                                        a2Var6.b = (d23 * cos) + (d19 * d20) + d22;
                                        a2Var6.a = ((d19 * cos) - (d23 * d20)) + d18;
                                        i17++;
                                        sin = d20;
                                    }
                                    a2 b12 = d2.b(f10);
                                    double d24 = -b12.a;
                                    double d25 = -b12.b;
                                    for (int i18 = 0; i18 < f10.size(); i18++) {
                                        a2 a2Var7 = (a2) f10.get(i18);
                                        a2Var7.a += d24;
                                        a2Var7.b += d25;
                                    }
                                    b2 a10 = d2.a(f10);
                                    double d26 = a10.c - a10.a;
                                    double d27 = a10.d - a10.b;
                                    for (int i19 = 0; i19 < f10.size(); i19++) {
                                        a2 a2Var8 = (a2) f10.get(i19);
                                        a2Var8.a = (250.0d / d26) * a2Var8.a;
                                        a2Var8.b = (250.0d / d27) * a2Var8.b;
                                    }
                                    a2 b13 = d2.b(f10);
                                    double d28 = Double.MAX_VALUE;
                                    int i20 = -1;
                                    int i21 = -1;
                                    for (int i22 = 0; i22 < d2Var3.c.size(); i22++) {
                                        ArrayList arrayList2 = ((c2) d2Var3.c.get(i22)).b;
                                        double sqrt = (Math.sqrt(5.0d) - 1.0d) * 0.5d;
                                        double d29 = -1.5707963267948966d;
                                        double d30 = 1.0d - sqrt;
                                        double d31 = 1.5707963267948966d;
                                        double d32 = d28;
                                        double d33 = (d30 * 1.5707963267948966d) + (sqrt * (-1.5707963267948966d));
                                        double d34 = d2.d(f10, b13, arrayList2, d33);
                                        double d35 = d33;
                                        double d36 = (sqrt * 1.5707963267948966d) + (d30 * (-1.5707963267948966d));
                                        double d37 = d2.d(f10, b13, arrayList2, d36);
                                        double d38 = d36;
                                        double d39 = d34;
                                        double d40 = d37;
                                        while (Math.abs(d31 - d29) > 0.06981317007977318d) {
                                            if (d39 < d40) {
                                                double d41 = (d30 * d38) + (sqrt * d29);
                                                double d42 = d2.d(f10, b13, arrayList2, d41);
                                                d = d41;
                                                d40 = d39;
                                                d39 = d42;
                                                d31 = d38;
                                                d38 = d35;
                                            } else {
                                                double d43 = (d30 * d35) + (sqrt * d31);
                                                double d44 = d2.d(f10, b13, arrayList2, d43);
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
                                            i20 = ((c2) d2Var3.c.get(i22)).a;
                                            d28 = min;
                                            i21 = i22;
                                        } else {
                                            d28 = d32;
                                        }
                                    }
                                    int i23 = 1.0d - (d28 / d2.n) < 0.8d ? -1 : i20;
                                    if (i23 >= 0 && i23 < l.b.size() && arrayList.size() >= 1) {
                                        w1 w1Var2 = new w1(l.p(i23));
                                        if (i23 == 4) {
                                            int e11 = d2.e(0, arrayList);
                                            if (e11 > 0) {
                                                if (e11 > 10) {
                                                    e11 -= 2;
                                                }
                                                a2 a2Var9 = (a2) arrayList.get(e11);
                                                a2 a2Var10 = (a2) arrayList.get(e11 / 2);
                                                a2 a2Var11 = (a2) arrayList.get(0);
                                                w1Var2.b = (float) a2Var9.a;
                                                w1Var2.c = (float) a2Var9.b;
                                                w1Var2.i = (float) a2Var10.a;
                                                w1Var2.j = (float) a2Var10.b;
                                                w1Var2.d = (float) a2Var11.a;
                                                w1Var2.e = (float) a2Var11.b;
                                                w1Var2.k = 16.0f;
                                            }
                                        } else {
                                            a2 b14 = d2.b(arrayList);
                                            w1Var2.b = (float) b14.a;
                                            w1Var2.c = (float) b14.b;
                                            b2 a11 = d2.a(arrayList);
                                            w1Var2.d = ((float) (a11.c - a11.a)) / 2.0f;
                                            w1Var2.e = ((float) (a11.d - a11.b)) / 2.0f;
                                            if (i23 == 2 && (e10 = d2.e(1, arrayList)) > 0) {
                                                a2 a2Var12 = (a2) arrayList.get(e10);
                                                w1Var2.h = (float) Math.atan2(a2Var12.b - w1Var2.c, a2Var12.a - w1Var2.b);
                                            }
                                        }
                                        w1Var = w1Var2;
                                        if (BuildVars.LOGS_ENABLED) {
                                            StringBuilder sb2 = new StringBuilder("took ");
                                            sb2.append(System.currentTimeMillis() - j11);
                                            sb2.append("ms to ");
                                            sb2.append(w1Var != null ? "" : "not ");
                                            sb2.append("detect a shape");
                                            sb2.append(w1Var != null ? " (template#" + i21 + " shape#" + i23 + ")" : "");
                                            Log.i("shapedetector", sb2.toString());
                                        }
                                        AndroidUtilities.runOnUIThread(new z1(d2Var3, w1Var, i21, f10, 0));
                                        d2Var3.j.set(false);
                                    }
                                    w1Var = null;
                                    if (BuildVars.LOGS_ENABLED) {
                                    }
                                    AndroidUtilities.runOnUIThread(new z1(d2Var3, w1Var, i21, f10, 0));
                                    d2Var3.j.set(false);
                                }
                            } finally {
                            }
                        }
                        return;
                    default:
                        d2 d2Var4 = d2Var;
                        try {
                            InputStream open = ApplicationLoader.applicationContext.getAssets().open("shapes.dat");
                            while (true) {
                                c3 = 0;
                                if (open.available() > 5) {
                                    c2 c2Var = new c2();
                                    c2Var.a = open.read();
                                    int read = open.read();
                                    int read2 = open.read() - 64;
                                    int read3 = open.read() - 64;
                                    if (open.available() >= read * 2) {
                                        for (int i24 = 0; i24 < read; i24++) {
                                            c2Var.b.add(new a2((open.read() - read2) - 127, (open.read() - read3) - 127));
                                        }
                                        c2Var.c = d2Var4.g.getInt("score" + d2Var4.c.size(), 0);
                                        d2Var4.c.add(c2Var);
                                    }
                                }
                            }
                            if (d2Var4.h && (string = d2Var4.g.getString("moretemplates", null)) != null) {
                                String[] split = string.split("\\|");
                                int size = d2Var4.c.size();
                                int i25 = 0;
                                while (i25 < split.length) {
                                    c2 c2Var2 = new c2();
                                    String[] split2 = split[i25].split(",");
                                    int i26 = 1;
                                    if (split2.length <= 1) {
                                        i12 = i25;
                                    } else {
                                        c2Var2.a = Integer.parseInt(split2[c3]);
                                        while (i26 < split2.length) {
                                            c2Var2.b.add(new a2(Double.parseDouble(split2[i26]), Double.parseDouble(split2[i26 + 1])));
                                            i26 += 2;
                                            i25 = i25;
                                        }
                                        i12 = i25;
                                        c2Var2.c = d2Var4.g.getInt("score" + (size + i12), 0);
                                        d2Var4.c.add(c2Var2);
                                    }
                                    i25 = i12 + 1;
                                    c3 = 0;
                                }
                            }
                            open.close();
                            return;
                        } catch (Exception e12) {
                            FileLog.e(e12);
                            return;
                        }
                }
            }
        });
        this.s = d2Var;
    }

    public final void a(d dVar, boolean z10, l1 l1Var) {
        s1 s1Var;
        if (this.l) {
            t1 t1Var = this.a;
            if (t1Var.getPainting().G || this.g == null) {
                return;
            }
            m currentBrush = dVar == null ? t1Var.getCurrentBrush() : dVar;
            if ((currentBrush instanceof c) || (currentBrush instanceof e)) {
                currentBrush = new f();
            }
            final m mVar = currentBrush;
            this.l = false;
            if (mVar instanceof d) {
                t1Var.getPainting().E = false;
            }
            f1 painting = t1Var.getPainting();
            painting.f.f(new b1(painting, 1));
            this.n = 0;
            this.o = 0;
            this.j = false;
            this.b = false;
            if (z10 && (s1Var = t1Var.a) != null) {
                s1Var.f();
            }
            bv0 bv0Var = t1Var.getPainting().g;
            j1 j1Var = this.g;
            float a2 = z5.a((float) j1Var.a, (float) j1Var.b, 0.0f, 0.0f);
            j1 j1Var2 = this.g;
            float max = Math.max(a2, z5.a((float) j1Var2.a, (float) j1Var2.b, bv0Var.a, 0.0f));
            j1 j1Var3 = this.g;
            float a10 = z5.a((float) j1Var3.a, (float) j1Var3.b, 0.0f, bv0Var.b);
            j1 j1Var4 = this.g;
            final float max2 = Math.max(max, Math.max(a10, z5.a((float) j1Var4.a, (float) j1Var4.b, bv0Var.a, bv0Var.b))) / 0.84f;
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
            j1 j1Var5 = this.g;
            final j1 j1Var6 = new j1(j1Var5.a, j1Var5.b, 1.0d);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.x = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ag.j0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    t1 t1Var2 = n0.this.a;
                    float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                    g1 g1Var = new g1(new j1[]{j1Var6});
                    m mVar2 = mVar;
                    mVar2.getClass();
                    int currentColor = mVar2 instanceof d ? -1 : t1Var2.getCurrentColor();
                    float f9 = floatValue * max2;
                    g1Var.c = currentColor;
                    g1Var.d = f9;
                    g1Var.e = mVar2;
                    f1 painting2 = t1Var2.getPainting();
                    if (painting2.L != null) {
                        return;
                    }
                    boolean z11 = true;
                    painting2.f.f(new z0(painting2, g1Var, z11, z11, null, 0));
                }
            });
            this.x.addListener(new l0(this, j1Var6, max2, mVar, z10, l1Var));
            this.x.setDuration(450L);
            this.x.setInterpolator(jr.h);
            this.x.start();
            if (z10) {
                BotWebViewVibrationEffect.IMPACT_HEAVY.vibrate();
            }
        }
    }

    public final void b(g1 g1Var) {
        t1 t1Var = this.a;
        int currentColor = t1Var.getCurrentColor();
        float currentWeight = t1Var.getCurrentWeight();
        m currentBrush = t1Var.getCurrentBrush();
        g1Var.c = currentColor;
        g1Var.d = currentWeight;
        g1Var.e = currentBrush;
        if (this.f) {
            this.i = 0.0d;
        }
        g1Var.a = this.i;
        f1 painting = t1Var.getPainting();
        boolean z10 = this.f;
        k0 k0Var = new k0(this, g1Var, 0);
        boolean z11 = false;
        if (painting.L == null) {
            painting.f.f(new z0(painting, g1Var, z10, z11, k0Var, 0));
        }
        this.f = false;
    }

    public final void c(float f9, boolean z10) {
        int i10 = this.n;
        j1[] j1VarArr = this.m;
        if (i10 <= 2) {
            j1[] j1VarArr2 = new j1[i10];
            System.arraycopy(j1VarArr, 0, j1VarArr2, 0, i10);
            b(new g1(j1VarArr2));
            return;
        }
        Vector vector = new Vector();
        j1 j1Var = j1VarArr[0];
        j1 j1Var2 = j1VarArr[1];
        j1 j1Var3 = j1VarArr[2];
        if (j1Var3 == null || j1Var2 == null || j1Var == null) {
            return;
        }
        j1 b10 = j1Var2.b(j1Var);
        j1 b11 = j1Var3.b(j1Var2);
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
            double d13 = (b11.a * d10) + (j1Var2.a * 2.0d * d12 * d) + (b10.a * d11);
            double d14 = (b11.b * d10) + (j1Var2.b * 2.0d * d12 * d) + (b10.b * d11);
            double lerp = ((((b11.c * d10) + ((j1Var2.c * ((2.0f * f13) * f12)) + (b10.c * pow))) - 1.0d) * AndroidUtilities.lerp(f9, 1.0f, i7.w.a(this.o / 16.0f, 0.0f, 1.0f))) + 1.0d;
            j1 j1Var4 = new j1(d13, d14, lerp);
            if (this.c) {
                j1Var4.d = true;
                this.c = false;
            }
            vector.add(j1Var4);
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
        j1[] j1VarArr3 = new j1[vector.size()];
        vector.toArray(j1VarArr3);
        b(new g1(j1VarArr3));
        System.arraycopy(j1VarArr, 1, j1VarArr, 0, 2);
        if (z10) {
            this.n = 0;
        } else {
            this.n = 2;
        }
    }
}
