package ig;

import ag.g3;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import android.util.Log;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.f8;
import org.telegram.messenger.t2;
import org.telegram.messenger.v2;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.pu0;
import w7.z8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a0 {
    public static final gr B = new gr(0.0d, 0.5d, 0.0d, 1.0d);
    public h A;
    public final c1 a;
    public boolean b;
    public boolean c;
    public long d;
    public boolean e;
    public boolean f;
    public u0 g;
    public u0 h;
    public double i;
    public boolean j;
    public float k;
    public boolean l;
    public int n;
    public int o;
    public double p;
    public double q;
    public ValueAnimator r;
    public final k1 s;
    public Matrix t;
    public long v;
    public float w;
    public ValueAnimator x;
    public boolean z;
    public final u0[] m = new u0[3];
    public final float[] u = new float[2];
    public final w y = new w(this, 1);

    /* JADX WARN: Type inference failed for: r2v6, types: [ig.g1] */
    public a0(c1 c1Var) {
        this.a = c1Var;
        Context context = c1Var.getContext();
        ag.l lVar = new ag.l(this, 11);
        final k1 k1Var = new k1();
        k1Var.b = new ArrayList();
        k1Var.c = new ArrayList();
        k1Var.i = null;
        k1Var.j = new AtomicBoolean(false);
        k1Var.k = new AtomicBoolean(false);
        final int i10 = 0;
        k1Var.l = new Runnable() { // from class: ig.g1
            /* JADX WARN: Removed duplicated region for block: B:136:0x0462  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x00b2 A[Catch: Exception -> 0x0066, TryCatch #1 {Exception -> 0x0066, blocks: (B:5:0x000b, B:6:0x0017, B:8:0x001f, B:12:0x0045, B:14:0x006a, B:16:0x0091, B:18:0x0097, B:20:0x00a2, B:21:0x00af, B:23:0x00b2, B:27:0x0109, B:28:0x00c4, B:29:0x00cd, B:31:0x00d0, B:33:0x00eb, B:36:0x010c), top: B:4:0x000b }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                f1 f1Var;
                int e;
                double d;
                long j10;
                int i11;
                double d10;
                String string;
                String[] split;
                int i12;
                switch (i10) {
                    case 0:
                        k1 k1Var2 = k1Var;
                        if (k1Var2.j.get()) {
                            return;
                        }
                        k1Var2.k.set(false);
                        k1Var2.j.set(true);
                        long currentTimeMillis = System.currentTimeMillis();
                        synchronized (k1Var2) {
                            try {
                                if (k1Var2.b.size() < 8) {
                                    k1Var2.j.set(false);
                                } else {
                                    ArrayList f7 = k1.f(k1Var2.b);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add((h1) f7.get(0));
                                    int i13 = 1;
                                    double d11 = 0.0d;
                                    while (i13 < f7.size()) {
                                        h1 h1Var = (h1) f7.get(i13 - 1);
                                        h1 h1Var2 = (h1) f7.get(i13);
                                        h1Var.getClass();
                                        d11 += h1Var.a(h1Var2.a, h1Var2.b);
                                        i13++;
                                        k1Var2 = k1Var2;
                                    }
                                    k1 k1Var3 = k1Var2;
                                    double d12 = d11 / 47;
                                    int i14 = 1;
                                    double d13 = 0.0d;
                                    while (i14 < f7.size()) {
                                        int i15 = i14 - 1;
                                        h1 h1Var3 = (h1) f7.get(i15);
                                        h1 h1Var4 = (h1) f7.get(i14);
                                        h1Var3.getClass();
                                        double d14 = d13;
                                        int i16 = i14;
                                        double a2 = h1Var3.a(h1Var4.a, h1Var4.b);
                                        double d15 = d14 + a2;
                                        if (d15 >= d12) {
                                            double d16 = (d12 - d14) / a2;
                                            i11 = i16;
                                            d10 = d12;
                                            j10 = currentTimeMillis;
                                            h1 h1Var5 = new h1(((((h1) f7.get(i11)).a - ((h1) f7.get(i15)).a) * d16) + ((h1) f7.get(i15)).a, ((((h1) f7.get(i11)).b - ((h1) f7.get(i15)).b) * d16) + ((h1) f7.get(i15)).b);
                                            arrayList.add(h1Var5);
                                            f7.add(i11, h1Var5);
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
                                        arrayList.add((h1) i0.a.g(1, f7));
                                    }
                                    ArrayList f10 = k1.f(arrayList);
                                    h1 b10 = k1.b(f10);
                                    double atan2 = Math.atan2(b10.b - ((h1) f10.get(0)).b, b10.a - ((h1) f10.get(0)).a);
                                    h1 b11 = k1.b(f10);
                                    double cos = Math.cos(atan2);
                                    double sin = Math.sin(atan2);
                                    int i17 = 0;
                                    while (i17 < f10.size()) {
                                        h1 h1Var6 = (h1) f10.get(i17);
                                        double d17 = h1Var6.a;
                                        double d18 = b11.a;
                                        double d19 = d17 - d18;
                                        double d20 = sin;
                                        double d21 = h1Var6.b;
                                        double d22 = b11.b;
                                        double d23 = d21 - d22;
                                        h1Var6.b = (d23 * cos) + (d19 * d20) + d22;
                                        h1Var6.a = ((d19 * cos) - (d23 * d20)) + d18;
                                        i17++;
                                        sin = d20;
                                    }
                                    h1 b12 = k1.b(f10);
                                    double d24 = -b12.a;
                                    double d25 = -b12.b;
                                    for (int i18 = 0; i18 < f10.size(); i18++) {
                                        h1 h1Var7 = (h1) f10.get(i18);
                                        h1Var7.a += d24;
                                        h1Var7.b += d25;
                                    }
                                    i1 a10 = k1.a(f10);
                                    double d26 = a10.d - a10.b;
                                    double d27 = a10.e - a10.c;
                                    for (int i19 = 0; i19 < f10.size(); i19++) {
                                        h1 h1Var8 = (h1) f10.get(i19);
                                        h1Var8.a = (250.0d / d26) * h1Var8.a;
                                        h1Var8.b = (250.0d / d27) * h1Var8.b;
                                    }
                                    h1 b13 = k1.b(f10);
                                    double d28 = Double.MAX_VALUE;
                                    int i20 = -1;
                                    int i21 = -1;
                                    for (int i22 = 0; i22 < k1Var3.c.size(); i22++) {
                                        ArrayList arrayList2 = ((j1) k1Var3.c.get(i22)).b;
                                        double sqrt = (Math.sqrt(5.0d) - 1.0d) * 0.5d;
                                        double d29 = -1.5707963267948966d;
                                        double d30 = 1.0d - sqrt;
                                        double d31 = 1.5707963267948966d;
                                        double d32 = d28;
                                        double d33 = (d30 * 1.5707963267948966d) + (sqrt * (-1.5707963267948966d));
                                        double d34 = k1.d(f10, b13, arrayList2, d33);
                                        double d35 = d33;
                                        double d36 = (sqrt * 1.5707963267948966d) + (d30 * (-1.5707963267948966d));
                                        double d37 = k1.d(f10, b13, arrayList2, d36);
                                        double d38 = d36;
                                        double d39 = d34;
                                        double d40 = d37;
                                        while (Math.abs(d31 - d29) > 0.06981317007977318d) {
                                            if (d39 < d40) {
                                                double d41 = (d30 * d38) + (sqrt * d29);
                                                double d42 = k1.d(f10, b13, arrayList2, d41);
                                                d = d41;
                                                d40 = d39;
                                                d39 = d42;
                                                d31 = d38;
                                                d38 = d35;
                                            } else {
                                                double d43 = (d30 * d35) + (sqrt * d31);
                                                double d44 = k1.d(f10, b13, arrayList2, d43);
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
                                            i20 = ((j1) k1Var3.c.get(i22)).a;
                                            d28 = min;
                                            i21 = i22;
                                        } else {
                                            d28 = d32;
                                        }
                                    }
                                    int i23 = 1.0d - (d28 / k1.n) < 0.8d ? -1 : i20;
                                    if (i23 >= 0 && i23 < g.c.size() && arrayList.size() >= 1) {
                                        f1 f1Var2 = new f1(g.p(i23));
                                        if (i23 == 4) {
                                            int e7 = k1.e(0, arrayList);
                                            if (e7 > 0) {
                                                if (e7 > 10) {
                                                    e7 -= 2;
                                                }
                                                h1 h1Var9 = (h1) arrayList.get(e7);
                                                h1 h1Var10 = (h1) arrayList.get(e7 / 2);
                                                h1 h1Var11 = (h1) arrayList.get(0);
                                                f1Var2.b = (float) h1Var9.a;
                                                f1Var2.c = (float) h1Var9.b;
                                                f1Var2.i = (float) h1Var10.a;
                                                f1Var2.j = (float) h1Var10.b;
                                                f1Var2.d = (float) h1Var11.a;
                                                f1Var2.e = (float) h1Var11.b;
                                                f1Var2.k = 16.0f;
                                            }
                                        } else {
                                            h1 b14 = k1.b(arrayList);
                                            f1Var2.b = (float) b14.a;
                                            f1Var2.c = (float) b14.b;
                                            i1 a11 = k1.a(arrayList);
                                            f1Var2.d = ((float) (a11.d - a11.b)) / 2.0f;
                                            f1Var2.e = ((float) (a11.e - a11.c)) / 2.0f;
                                            if (i23 == 2 && (e = k1.e(1, arrayList)) > 0) {
                                                h1 h1Var12 = (h1) arrayList.get(e);
                                                f1Var2.h = (float) Math.atan2(h1Var12.b - f1Var2.c, h1Var12.a - f1Var2.b);
                                            }
                                        }
                                        f1Var = f1Var2;
                                        if (v2.a) {
                                            StringBuilder sb2 = new StringBuilder("took ");
                                            sb2.append(System.currentTimeMillis() - j11);
                                            sb2.append("ms to ");
                                            sb2.append(f1Var != null ? "" : "not ");
                                            sb2.append("detect a shape");
                                            sb2.append(f1Var != null ? " (template#" + i21 + " shape#" + i23 + ")" : "");
                                            Log.i("shapedetector", sb2.toString());
                                        }
                                        org.telegram.messenger.i0.g3(new g3(k1Var3, f1Var, i21, f10, 1));
                                        k1Var3.j.set(false);
                                    }
                                    f1Var = null;
                                    if (v2.a) {
                                    }
                                    org.telegram.messenger.i0.g3(new g3(k1Var3, f1Var, i21, f10, 1));
                                    k1Var3.j.set(false);
                                }
                            } finally {
                            }
                        }
                        return;
                    default:
                        k1 k1Var4 = k1Var;
                        try {
                            InputStream open = org.telegram.messenger.w0.b.getAssets().open("shapes.dat");
                            while (open.available() > 5) {
                                j1 j1Var = new j1();
                                j1Var.a = open.read();
                                int read = open.read();
                                int read2 = open.read() - 64;
                                int read3 = open.read() - 64;
                                if (open.available() < read * 2) {
                                    InputStream inputStream = open;
                                    if (k1Var4.h && (string = k1Var4.g.getString("moretemplates", null)) != null) {
                                        split = string.split("\\|");
                                        int size = k1Var4.c.size();
                                        for (i12 = 0; i12 < split.length; i12++) {
                                            j1 j1Var2 = new j1();
                                            String[] split2 = split[i12].split(",");
                                            if (split2.length > 1) {
                                                j1Var2.a = Integer.parseInt(split2[0]);
                                                for (int i24 = 1; i24 < split2.length; i24 += 2) {
                                                    j1Var2.b.add(new h1(Double.parseDouble(split2[i24]), Double.parseDouble(split2[i24 + 1])));
                                                }
                                                j1Var2.c = k1Var4.g.getInt("score" + (size + i12), 0);
                                                k1Var4.c.add(j1Var2);
                                            }
                                        }
                                    }
                                    inputStream.close();
                                    return;
                                }
                                int i25 = 0;
                                while (i25 < read) {
                                    j1Var.b.add(new h1((open.read() - read2) - 127, (open.read() - read3) - 127));
                                    i25++;
                                    open = open;
                                }
                                j1Var.c = k1Var4.g.getInt("score" + k1Var4.c.size(), 0);
                                k1Var4.c.add(j1Var);
                                open = open;
                            }
                            InputStream inputStream2 = open;
                            if (k1Var4.h) {
                                split = string.split("\\|");
                                int size2 = k1Var4.c.size();
                                while (i12 < split.length) {
                                }
                            }
                            inputStream2.close();
                            return;
                        } catch (Exception e10) {
                            f8.g(e10, true);
                            return;
                        }
                }
            }
        };
        k1Var.f = context;
        k1Var.e = lVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        k1Var.g = sharedPreferences;
        k1Var.h = sharedPreferences.getBoolean("learning", false);
        k1Var.a = sharedPreferences.getInt("scoreall", 0);
        final int i11 = 1;
        k1.m.postRunnable(new Runnable() { // from class: ig.g1
            /* JADX WARN: Removed duplicated region for block: B:136:0x0462  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x00b2 A[Catch: Exception -> 0x0066, TryCatch #1 {Exception -> 0x0066, blocks: (B:5:0x000b, B:6:0x0017, B:8:0x001f, B:12:0x0045, B:14:0x006a, B:16:0x0091, B:18:0x0097, B:20:0x00a2, B:21:0x00af, B:23:0x00b2, B:27:0x0109, B:28:0x00c4, B:29:0x00cd, B:31:0x00d0, B:33:0x00eb, B:36:0x010c), top: B:4:0x000b }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                f1 f1Var;
                int e;
                double d;
                long j10;
                int i112;
                double d10;
                String string;
                String[] split;
                int i12;
                switch (i11) {
                    case 0:
                        k1 k1Var2 = k1Var;
                        if (k1Var2.j.get()) {
                            return;
                        }
                        k1Var2.k.set(false);
                        k1Var2.j.set(true);
                        long currentTimeMillis = System.currentTimeMillis();
                        synchronized (k1Var2) {
                            try {
                                if (k1Var2.b.size() < 8) {
                                    k1Var2.j.set(false);
                                } else {
                                    ArrayList f7 = k1.f(k1Var2.b);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add((h1) f7.get(0));
                                    int i13 = 1;
                                    double d11 = 0.0d;
                                    while (i13 < f7.size()) {
                                        h1 h1Var = (h1) f7.get(i13 - 1);
                                        h1 h1Var2 = (h1) f7.get(i13);
                                        h1Var.getClass();
                                        d11 += h1Var.a(h1Var2.a, h1Var2.b);
                                        i13++;
                                        k1Var2 = k1Var2;
                                    }
                                    k1 k1Var3 = k1Var2;
                                    double d12 = d11 / 47;
                                    int i14 = 1;
                                    double d13 = 0.0d;
                                    while (i14 < f7.size()) {
                                        int i15 = i14 - 1;
                                        h1 h1Var3 = (h1) f7.get(i15);
                                        h1 h1Var4 = (h1) f7.get(i14);
                                        h1Var3.getClass();
                                        double d14 = d13;
                                        int i16 = i14;
                                        double a2 = h1Var3.a(h1Var4.a, h1Var4.b);
                                        double d15 = d14 + a2;
                                        if (d15 >= d12) {
                                            double d16 = (d12 - d14) / a2;
                                            i112 = i16;
                                            d10 = d12;
                                            j10 = currentTimeMillis;
                                            h1 h1Var5 = new h1(((((h1) f7.get(i112)).a - ((h1) f7.get(i15)).a) * d16) + ((h1) f7.get(i15)).a, ((((h1) f7.get(i112)).b - ((h1) f7.get(i15)).b) * d16) + ((h1) f7.get(i15)).b);
                                            arrayList.add(h1Var5);
                                            f7.add(i112, h1Var5);
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
                                        arrayList.add((h1) i0.a.g(1, f7));
                                    }
                                    ArrayList f10 = k1.f(arrayList);
                                    h1 b10 = k1.b(f10);
                                    double atan2 = Math.atan2(b10.b - ((h1) f10.get(0)).b, b10.a - ((h1) f10.get(0)).a);
                                    h1 b11 = k1.b(f10);
                                    double cos = Math.cos(atan2);
                                    double sin = Math.sin(atan2);
                                    int i17 = 0;
                                    while (i17 < f10.size()) {
                                        h1 h1Var6 = (h1) f10.get(i17);
                                        double d17 = h1Var6.a;
                                        double d18 = b11.a;
                                        double d19 = d17 - d18;
                                        double d20 = sin;
                                        double d21 = h1Var6.b;
                                        double d22 = b11.b;
                                        double d23 = d21 - d22;
                                        h1Var6.b = (d23 * cos) + (d19 * d20) + d22;
                                        h1Var6.a = ((d19 * cos) - (d23 * d20)) + d18;
                                        i17++;
                                        sin = d20;
                                    }
                                    h1 b12 = k1.b(f10);
                                    double d24 = -b12.a;
                                    double d25 = -b12.b;
                                    for (int i18 = 0; i18 < f10.size(); i18++) {
                                        h1 h1Var7 = (h1) f10.get(i18);
                                        h1Var7.a += d24;
                                        h1Var7.b += d25;
                                    }
                                    i1 a10 = k1.a(f10);
                                    double d26 = a10.d - a10.b;
                                    double d27 = a10.e - a10.c;
                                    for (int i19 = 0; i19 < f10.size(); i19++) {
                                        h1 h1Var8 = (h1) f10.get(i19);
                                        h1Var8.a = (250.0d / d26) * h1Var8.a;
                                        h1Var8.b = (250.0d / d27) * h1Var8.b;
                                    }
                                    h1 b13 = k1.b(f10);
                                    double d28 = Double.MAX_VALUE;
                                    int i20 = -1;
                                    int i21 = -1;
                                    for (int i22 = 0; i22 < k1Var3.c.size(); i22++) {
                                        ArrayList arrayList2 = ((j1) k1Var3.c.get(i22)).b;
                                        double sqrt = (Math.sqrt(5.0d) - 1.0d) * 0.5d;
                                        double d29 = -1.5707963267948966d;
                                        double d30 = 1.0d - sqrt;
                                        double d31 = 1.5707963267948966d;
                                        double d32 = d28;
                                        double d33 = (d30 * 1.5707963267948966d) + (sqrt * (-1.5707963267948966d));
                                        double d34 = k1.d(f10, b13, arrayList2, d33);
                                        double d35 = d33;
                                        double d36 = (sqrt * 1.5707963267948966d) + (d30 * (-1.5707963267948966d));
                                        double d37 = k1.d(f10, b13, arrayList2, d36);
                                        double d38 = d36;
                                        double d39 = d34;
                                        double d40 = d37;
                                        while (Math.abs(d31 - d29) > 0.06981317007977318d) {
                                            if (d39 < d40) {
                                                double d41 = (d30 * d38) + (sqrt * d29);
                                                double d42 = k1.d(f10, b13, arrayList2, d41);
                                                d = d41;
                                                d40 = d39;
                                                d39 = d42;
                                                d31 = d38;
                                                d38 = d35;
                                            } else {
                                                double d43 = (d30 * d35) + (sqrt * d31);
                                                double d44 = k1.d(f10, b13, arrayList2, d43);
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
                                            i20 = ((j1) k1Var3.c.get(i22)).a;
                                            d28 = min;
                                            i21 = i22;
                                        } else {
                                            d28 = d32;
                                        }
                                    }
                                    int i23 = 1.0d - (d28 / k1.n) < 0.8d ? -1 : i20;
                                    if (i23 >= 0 && i23 < g.c.size() && arrayList.size() >= 1) {
                                        f1 f1Var2 = new f1(g.p(i23));
                                        if (i23 == 4) {
                                            int e7 = k1.e(0, arrayList);
                                            if (e7 > 0) {
                                                if (e7 > 10) {
                                                    e7 -= 2;
                                                }
                                                h1 h1Var9 = (h1) arrayList.get(e7);
                                                h1 h1Var10 = (h1) arrayList.get(e7 / 2);
                                                h1 h1Var11 = (h1) arrayList.get(0);
                                                f1Var2.b = (float) h1Var9.a;
                                                f1Var2.c = (float) h1Var9.b;
                                                f1Var2.i = (float) h1Var10.a;
                                                f1Var2.j = (float) h1Var10.b;
                                                f1Var2.d = (float) h1Var11.a;
                                                f1Var2.e = (float) h1Var11.b;
                                                f1Var2.k = 16.0f;
                                            }
                                        } else {
                                            h1 b14 = k1.b(arrayList);
                                            f1Var2.b = (float) b14.a;
                                            f1Var2.c = (float) b14.b;
                                            i1 a11 = k1.a(arrayList);
                                            f1Var2.d = ((float) (a11.d - a11.b)) / 2.0f;
                                            f1Var2.e = ((float) (a11.e - a11.c)) / 2.0f;
                                            if (i23 == 2 && (e = k1.e(1, arrayList)) > 0) {
                                                h1 h1Var12 = (h1) arrayList.get(e);
                                                f1Var2.h = (float) Math.atan2(h1Var12.b - f1Var2.c, h1Var12.a - f1Var2.b);
                                            }
                                        }
                                        f1Var = f1Var2;
                                        if (v2.a) {
                                            StringBuilder sb2 = new StringBuilder("took ");
                                            sb2.append(System.currentTimeMillis() - j11);
                                            sb2.append("ms to ");
                                            sb2.append(f1Var != null ? "" : "not ");
                                            sb2.append("detect a shape");
                                            sb2.append(f1Var != null ? " (template#" + i21 + " shape#" + i23 + ")" : "");
                                            Log.i("shapedetector", sb2.toString());
                                        }
                                        org.telegram.messenger.i0.g3(new g3(k1Var3, f1Var, i21, f10, 1));
                                        k1Var3.j.set(false);
                                    }
                                    f1Var = null;
                                    if (v2.a) {
                                    }
                                    org.telegram.messenger.i0.g3(new g3(k1Var3, f1Var, i21, f10, 1));
                                    k1Var3.j.set(false);
                                }
                            } finally {
                            }
                        }
                        return;
                    default:
                        k1 k1Var4 = k1Var;
                        try {
                            InputStream open = org.telegram.messenger.w0.b.getAssets().open("shapes.dat");
                            while (open.available() > 5) {
                                j1 j1Var = new j1();
                                j1Var.a = open.read();
                                int read = open.read();
                                int read2 = open.read() - 64;
                                int read3 = open.read() - 64;
                                if (open.available() < read * 2) {
                                    InputStream inputStream2 = open;
                                    if (k1Var4.h && (string = k1Var4.g.getString("moretemplates", null)) != null) {
                                        split = string.split("\\|");
                                        int size2 = k1Var4.c.size();
                                        for (i12 = 0; i12 < split.length; i12++) {
                                            j1 j1Var2 = new j1();
                                            String[] split2 = split[i12].split(",");
                                            if (split2.length > 1) {
                                                j1Var2.a = Integer.parseInt(split2[0]);
                                                for (int i24 = 1; i24 < split2.length; i24 += 2) {
                                                    j1Var2.b.add(new h1(Double.parseDouble(split2[i24]), Double.parseDouble(split2[i24 + 1])));
                                                }
                                                j1Var2.c = k1Var4.g.getInt("score" + (size2 + i12), 0);
                                                k1Var4.c.add(j1Var2);
                                            }
                                        }
                                    }
                                    inputStream2.close();
                                    return;
                                }
                                int i25 = 0;
                                while (i25 < read) {
                                    j1Var.b.add(new h1((open.read() - read2) - 127, (open.read() - read3) - 127));
                                    i25++;
                                    open = open;
                                }
                                j1Var.c = k1Var4.g.getInt("score" + k1Var4.c.size(), 0);
                                k1Var4.c.add(j1Var);
                                open = open;
                            }
                            InputStream inputStream22 = open;
                            if (k1Var4.h) {
                                split = string.split("\\|");
                                int size22 = k1Var4.c.size();
                                while (i12 < split.length) {
                                }
                            }
                            inputStream22.close();
                            return;
                        } catch (Exception e10) {
                            f8.g(e10, true);
                            return;
                        }
                }
            }
        });
        this.s = k1Var;
    }

    public final void a(d dVar, boolean z10, w0 w0Var) {
        b1 b1Var;
        if (this.l) {
            c1 c1Var = this.a;
            if (c1Var.getPainting().G || this.g == null) {
                return;
            }
            h currentBrush = dVar == null ? c1Var.getCurrentBrush() : dVar;
            if ((currentBrush instanceof c) || (currentBrush instanceof e)) {
                currentBrush = new f();
            }
            final h hVar = currentBrush;
            this.l = false;
            if (hVar instanceof d) {
                c1Var.getPainting().E = false;
            }
            q0 painting = c1Var.getPainting();
            painting.f.f(new m0(painting, 1));
            this.n = 0;
            this.o = 0;
            this.j = false;
            this.b = false;
            if (z10 && (b1Var = c1Var.a) != null) {
                b1Var.t();
            }
            pu0 pu0Var = c1Var.getPainting().g;
            u0 u0Var = this.g;
            float a2 = z8.a((float) u0Var.a, (float) u0Var.b, 0.0f, 0.0f);
            u0 u0Var2 = this.g;
            float max = Math.max(a2, z8.a((float) u0Var2.a, (float) u0Var2.b, pu0Var.a, 0.0f));
            u0 u0Var3 = this.g;
            float a10 = z8.a((float) u0Var3.a, (float) u0Var3.b, 0.0f, pu0Var.b);
            u0 u0Var4 = this.g;
            final float max2 = Math.max(max, Math.max(a10, z8.a((float) u0Var4.a, (float) u0Var4.b, pu0Var.a, pu0Var.b))) / 0.84f;
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
            u0 u0Var5 = this.g;
            final u0 u0Var6 = new u0(u0Var5.a, u0Var5.b, 1.0d);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.x = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ig.x
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    c1 c1Var2 = a0.this.a;
                    float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                    r0 r0Var = new r0(new u0[]{u0Var6});
                    h hVar2 = hVar;
                    hVar2.getClass();
                    int currentColor = hVar2 instanceof d ? -1 : c1Var2.getCurrentColor();
                    float f7 = floatValue * max2;
                    r0Var.c = currentColor;
                    r0Var.d = f7;
                    r0Var.e = hVar2;
                    q0 painting2 = c1Var2.getPainting();
                    if (painting2.L != null) {
                        return;
                    }
                    boolean z11 = true;
                    painting2.f.f(new k0(painting2, r0Var, z11, z11, null, 0));
                }
            });
            this.x.addListener(new z(this, u0Var6, max2, hVar, z10, w0Var));
            this.x.setDuration(450L);
            this.x.setInterpolator(gr.h);
            this.x.start();
            if (z10) {
                t2.h.a();
            }
        }
    }

    public final void b(r0 r0Var) {
        c1 c1Var = this.a;
        int currentColor = c1Var.getCurrentColor();
        float currentWeight = c1Var.getCurrentWeight();
        h currentBrush = c1Var.getCurrentBrush();
        r0Var.c = currentColor;
        r0Var.d = currentWeight;
        r0Var.e = currentBrush;
        if (this.f) {
            this.i = 0.0d;
        }
        r0Var.a = this.i;
        q0 painting = c1Var.getPainting();
        boolean z10 = this.f;
        y yVar = new y(this, r0Var, 0);
        boolean z11 = false;
        if (painting.L == null) {
            painting.f.f(new k0(painting, r0Var, z10, z11, yVar, 0));
        }
        this.f = false;
    }

    public final void c(boolean z10, float f7) {
        int i10 = this.n;
        u0[] u0VarArr = this.m;
        if (i10 <= 2) {
            u0[] u0VarArr2 = new u0[i10];
            System.arraycopy(u0VarArr, 0, u0VarArr2, 0, i10);
            b(new r0(u0VarArr2));
            return;
        }
        Vector vector = new Vector();
        u0 u0Var = u0VarArr[0];
        u0 u0Var2 = u0VarArr[1];
        u0 u0Var3 = u0VarArr[2];
        if (u0Var3 == null || u0Var2 == null || u0Var == null) {
            return;
        }
        u0 b10 = u0Var2.b(u0Var);
        u0 b11 = u0Var3.b(u0Var2);
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
            double d13 = (b11.a * d10) + (u0Var2.a * 2.0d * d12 * d) + (b10.a * d11);
            double d14 = (b11.b * d10) + (u0Var2.b * 2.0d * d12 * d) + (b10.b * d11);
            double T1 = ((((b11.c * d10) + ((u0Var2.c * ((2.0f * f13) * f12)) + (b10.c * pow))) - 1.0d) * org.telegram.messenger.i0.T1(f7, 1.0f, w7.u.a(this.o / 16.0f, 0.0f, 1.0f))) + 1.0d;
            u0 u0Var4 = new u0(d13, d14, T1);
            if (this.c) {
                u0Var4.d = true;
                this.c = false;
            }
            vector.add(u0Var4);
            this.p += T1;
            this.q += 1.0d;
            f12 += f11;
            i11++;
            f10 = 1.0f;
        }
        if (z10) {
            b11.d = true;
        }
        vector.add(b11);
        u0[] u0VarArr3 = new u0[vector.size()];
        vector.toArray(u0VarArr3);
        b(new r0(u0VarArr3));
        System.arraycopy(u0VarArr, 1, u0VarArr, 0, 2);
        if (z10) {
            this.n = 0;
        } else {
            this.n = 2;
        }
    }
}
