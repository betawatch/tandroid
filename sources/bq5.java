// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import android.util.Log;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class bq5 {
    public static final k43 B = new k43(0.0d, 0.5d, 0.0d, 1.0d);
    public v01 A;
    public final pa9 a;
    public boolean b;
    public boolean c;
    public long d;
    public boolean e;
    public boolean f;
    public vg8 g;
    public vg8 h;
    public double i;
    public boolean j;
    public float k;
    public boolean l;
    public int n;
    public int o;
    public double p;
    public double q;
    public ValueAnimator r;
    public final xca s;
    public Matrix t;
    public long v;
    public float w;
    public ValueAnimator x;
    public boolean z;
    public final vg8[] m = new vg8[3];
    public final float[] u = new float[2];
    public final yp5 y = new yp5(this, (byte) 1);

    /* JADX WARN: Type inference failed for: r3v6, types: [uca] */
    public bq5(pa9 pa9Var) {
        final byte b = 1;
        this.a = pa9Var;
        Context context = pa9Var.getContext();
        zj3 zj3Var = new zj3(this, (byte) 19);
        final xca xcaVar = new xca();
        xcaVar.b = new ArrayList();
        xcaVar.c = new ArrayList();
        xcaVar.i = null;
        final byte b2 = 0;
        xcaVar.j = new AtomicBoolean(false);
        xcaVar.k = new AtomicBoolean(false);
        xcaVar.l = new Runnable() { // from class: uca
            /* JADX WARN: Removed duplicated region for block: B:133:0x042c  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x00a4 A[Catch: Exception -> 0x0101, TryCatch #1 {Exception -> 0x0101, blocks: (B:5:0x000c, B:6:0x0018, B:8:0x001f, B:12:0x0045, B:14:0x0062, B:16:0x0085, B:18:0x0089, B:20:0x0094, B:21:0x00a1, B:23:0x00a4, B:25:0x00b5, B:26:0x00be, B:28:0x00c1, B:30:0x00dc, B:32:0x00fa, B:35:0x00fd), top: B:4:0x000c }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                tca tcaVar;
                int e;
                double d;
                long j;
                ArrayList arrayList;
                String string;
                String[] split;
                int i;
                switch (b2) {
                    case 0:
                        xca xcaVar2 = xcaVar;
                        if (xcaVar2.j.get()) {
                            return;
                        }
                        xcaVar2.k.set(false);
                        xcaVar2.j.set(true);
                        long currentTimeMillis = System.currentTimeMillis();
                        synchronized (xcaVar2) {
                            if (xcaVar2.b.size() < 8) {
                                xcaVar2.j.set(false);
                            } else {
                                ArrayList f = xca.f(xcaVar2.b);
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add((vca) f.get(0));
                                double d2 = 0.0d;
                                for (int i2 = 1; i2 < f.size(); i2++) {
                                    vca vcaVar = (vca) f.get(i2 - 1);
                                    vca vcaVar2 = (vca) f.get(i2);
                                    vcaVar.getClass();
                                    d2 += vcaVar.a(vcaVar2.a, vcaVar2.b);
                                }
                                double d3 = d2 / 47.0d;
                                int i3 = 1;
                                double d4 = 0.0d;
                                while (i3 < f.size()) {
                                    int i4 = i3 - 1;
                                    vca vcaVar3 = (vca) f.get(i4);
                                    vca vcaVar4 = (vca) f.get(i3);
                                    vcaVar3.getClass();
                                    ArrayList arrayList3 = arrayList2;
                                    double a = vcaVar3.a(vcaVar4.a, vcaVar4.b);
                                    double d5 = d4 + a;
                                    if (d5 >= d3) {
                                        double d6 = (d3 - d4) / a;
                                        j = currentTimeMillis;
                                        vca vcaVar5 = new vca(((((vca) f.get(i3)).a - ((vca) f.get(i4)).a) * d6) + ((vca) f.get(i4)).a, ((((vca) f.get(i3)).b - ((vca) f.get(i4)).b) * d6) + ((vca) f.get(i4)).b);
                                        arrayList = arrayList3;
                                        arrayList.add(vcaVar5);
                                        f.add(i3, vcaVar5);
                                        d4 = 0.0d;
                                    } else {
                                        j = currentTimeMillis;
                                        arrayList = arrayList3;
                                        d4 = d5;
                                    }
                                    i3++;
                                    arrayList2 = arrayList;
                                    currentTimeMillis = j;
                                }
                                long j2 = currentTimeMillis;
                                ArrayList arrayList4 = arrayList2;
                                if (arrayList4.size() == 47) {
                                    arrayList4.add((vca) c00.g(1, f));
                                }
                                ArrayList f2 = xca.f(arrayList4);
                                vca b3 = xca.b(f2);
                                double atan2 = Math.atan2(b3.b - ((vca) f2.get(0)).b, b3.a - ((vca) f2.get(0)).a);
                                vca b4 = xca.b(f2);
                                double cos = Math.cos(atan2);
                                double sin = Math.sin(atan2);
                                int i5 = 0;
                                while (i5 < f2.size()) {
                                    vca vcaVar6 = (vca) f2.get(i5);
                                    double d7 = vcaVar6.a;
                                    double d8 = b4.a;
                                    double d9 = d7 - d8;
                                    double d10 = sin;
                                    double d11 = vcaVar6.b;
                                    double d12 = b4.b;
                                    double d13 = d11 - d12;
                                    vcaVar6.b = (d13 * cos) + (d9 * d10) + d12;
                                    vcaVar6.a = ((d9 * cos) - (d13 * d10)) + d8;
                                    i5++;
                                    sin = d10;
                                }
                                vca b5 = xca.b(f2);
                                double d14 = -b5.a;
                                double d15 = -b5.b;
                                for (int i6 = 0; i6 < f2.size(); i6++) {
                                    vca vcaVar7 = (vca) f2.get(i6);
                                    vcaVar7.a += d14;
                                    vcaVar7.b += d15;
                                }
                                pz5 a2 = xca.a(f2);
                                double d16 = a2.d - a2.b;
                                double d17 = a2.e - a2.c;
                                for (int i7 = 0; i7 < f2.size(); i7++) {
                                    vca vcaVar8 = (vca) f2.get(i7);
                                    vcaVar8.a = (250.0d / d16) * vcaVar8.a;
                                    vcaVar8.b = (250.0d / d17) * vcaVar8.b;
                                }
                                vca b6 = xca.b(f2);
                                double d18 = Double.MAX_VALUE;
                                int i8 = -1;
                                int i9 = -1;
                                for (int i10 = 0; i10 < xcaVar2.c.size(); i10++) {
                                    ArrayList arrayList5 = ((wca) xcaVar2.c.get(i10)).b;
                                    double d19 = -0.37081471193057003d;
                                    double d20 = xca.d(f2, b6, arrayList5, -0.37081471193057003d);
                                    double d21 = d18;
                                    double d22 = -1.5707963267948966d;
                                    double d23 = 1.5707963267948966d;
                                    double d24 = 0.37081471193057003d;
                                    double d25 = xca.d(f2, b6, arrayList5, 0.37081471193057003d);
                                    while (Math.abs(d23 - d22) > 0.06981317007977318d) {
                                        if (d20 < d25) {
                                            double d26 = (0.3819660112501051d * d24) + (0.6180339887498949d * d22);
                                            double d27 = xca.d(f2, b6, arrayList5, d26);
                                            d = d19;
                                            d19 = d26;
                                            d25 = d20;
                                            d20 = d27;
                                            d23 = d24;
                                        } else {
                                            double d28 = (0.6180339887498949d * d23) + (0.3819660112501051d * d19);
                                            double d29 = xca.d(f2, b6, arrayList5, d28);
                                            d = d28;
                                            d20 = d25;
                                            d25 = d29;
                                            d22 = d19;
                                            d19 = d24;
                                        }
                                        d24 = d;
                                    }
                                    double min = Math.min(d20, d25);
                                    if (min < d21) {
                                        i8 = ((wca) xcaVar2.c.get(i10)).a;
                                        d18 = min;
                                        i9 = i10;
                                    } else {
                                        d18 = d21;
                                    }
                                }
                                int i11 = 1.0d - (d18 / xca.n) < 0.8d ? -1 : i8;
                                if (i11 >= 0 && i11 < u01.c.size() && arrayList4.size() >= 1) {
                                    tca tcaVar2 = new tca(u01.o(i11));
                                    if (i11 == 4) {
                                        int e2 = xca.e(0, arrayList4);
                                        if (e2 > 0) {
                                            if (e2 > 10) {
                                                e2 -= 2;
                                            }
                                            vca vcaVar9 = (vca) arrayList4.get(e2);
                                            vca vcaVar10 = (vca) arrayList4.get(e2 / 2);
                                            vca vcaVar11 = (vca) arrayList4.get(0);
                                            tcaVar2.b = (float) vcaVar9.a;
                                            tcaVar2.c = (float) vcaVar9.b;
                                            tcaVar2.i = (float) vcaVar10.a;
                                            tcaVar2.j = (float) vcaVar10.b;
                                            tcaVar2.d = (float) vcaVar11.a;
                                            tcaVar2.e = (float) vcaVar11.b;
                                            tcaVar2.k = 16.0f;
                                        }
                                    } else {
                                        vca b7 = xca.b(arrayList4);
                                        tcaVar2.b = (float) b7.a;
                                        tcaVar2.c = (float) b7.b;
                                        pz5 a3 = xca.a(arrayList4);
                                        tcaVar2.d = ((float) (a3.d - a3.b)) / 2.0f;
                                        tcaVar2.e = ((float) (a3.e - a3.c)) / 2.0f;
                                        if (i11 == 2 && (e = xca.e(1, arrayList4)) > 0) {
                                            vca vcaVar12 = (vca) arrayList4.get(e);
                                            tcaVar2.h = (float) Math.atan2(vcaVar12.b - tcaVar2.c, vcaVar12.a - tcaVar2.b);
                                        }
                                    }
                                    tcaVar = tcaVar2;
                                    if (f11.a) {
                                        StringBuilder sb = new StringBuilder("took ");
                                        sb.append(System.currentTimeMillis() - j2);
                                        sb.append("ms to ");
                                        sb.append(tcaVar != null ? "" : "not ");
                                        sb.append("detect a shape");
                                        sb.append(tcaVar != null ? " (template#" + i9 + " shape#" + i11 + ")" : "");
                                        Log.i("shapedetector", sb.toString());
                                    }
                                    hl.c3(new y36(xcaVar2, tcaVar, i9, f2));
                                    xcaVar2.j.set(false);
                                }
                                tcaVar = null;
                                if (f11.a) {
                                }
                                hl.c3(new y36(xcaVar2, tcaVar, i9, f2));
                                xcaVar2.j.set(false);
                            }
                        }
                        return;
                    default:
                        xca xcaVar3 = xcaVar;
                        try {
                            InputStream open = a.b.getAssets().open("shapes.dat");
                            while (open.available() > 5) {
                                wca wcaVar = new wca();
                                wcaVar.a = open.read();
                                int read = open.read();
                                int read2 = open.read() - 64;
                                int read3 = open.read() - 64;
                                if (open.available() < (read << 1)) {
                                    if (xcaVar3.h && (string = xcaVar3.g.getString("moretemplates", null)) != null) {
                                        split = string.split("\\|");
                                        int size = xcaVar3.c.size();
                                        for (i = 0; i < split.length; i++) {
                                            wca wcaVar2 = new wca();
                                            String[] split2 = split[i].split(",");
                                            if (split2.length > 1) {
                                                wcaVar2.a = Integer.parseInt(split2[0]);
                                                for (int i12 = 1; i12 < split2.length; i12 += 2) {
                                                    wcaVar2.b.add(new vca(Double.parseDouble(split2[i12]), Double.parseDouble(split2[i12 + 1])));
                                                }
                                                wcaVar2.c = xcaVar3.g.getInt("score" + (size + i), 0);
                                                xcaVar3.c.add(wcaVar2);
                                            }
                                        }
                                    }
                                    open.close();
                                    return;
                                }
                                for (int i13 = 0; i13 < read; i13++) {
                                    wcaVar.b.add(new vca((open.read() - read2) - 127, (open.read() - read3) - 127));
                                }
                                wcaVar.c = xcaVar3.g.getInt("score" + xcaVar3.c.size(), 0);
                                xcaVar3.c.add(wcaVar);
                            }
                            if (xcaVar3.h) {
                                split = string.split("\\|");
                                int size2 = xcaVar3.c.size();
                                while (i < split.length) {
                                }
                            }
                            open.close();
                            return;
                        } catch (Exception e3) {
                            cc4.g(e3, true);
                            return;
                        }
                }
            }
        };
        xcaVar.f = context;
        xcaVar.e = zj3Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        xcaVar.g = sharedPreferences;
        xcaVar.h = sharedPreferences.getBoolean("learning", false);
        xcaVar.a = sharedPreferences.getInt("scoreall", 0);
        xca.m.postRunnable(new Runnable() { // from class: uca
            /* JADX WARN: Removed duplicated region for block: B:133:0x042c  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x00a4 A[Catch: Exception -> 0x0101, TryCatch #1 {Exception -> 0x0101, blocks: (B:5:0x000c, B:6:0x0018, B:8:0x001f, B:12:0x0045, B:14:0x0062, B:16:0x0085, B:18:0x0089, B:20:0x0094, B:21:0x00a1, B:23:0x00a4, B:25:0x00b5, B:26:0x00be, B:28:0x00c1, B:30:0x00dc, B:32:0x00fa, B:35:0x00fd), top: B:4:0x000c }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                tca tcaVar;
                int e;
                double d;
                long j;
                ArrayList arrayList;
                String string;
                String[] split;
                int i;
                switch (b) {
                    case 0:
                        xca xcaVar2 = xcaVar;
                        if (xcaVar2.j.get()) {
                            return;
                        }
                        xcaVar2.k.set(false);
                        xcaVar2.j.set(true);
                        long currentTimeMillis = System.currentTimeMillis();
                        synchronized (xcaVar2) {
                            if (xcaVar2.b.size() < 8) {
                                xcaVar2.j.set(false);
                            } else {
                                ArrayList f = xca.f(xcaVar2.b);
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add((vca) f.get(0));
                                double d2 = 0.0d;
                                for (int i2 = 1; i2 < f.size(); i2++) {
                                    vca vcaVar = (vca) f.get(i2 - 1);
                                    vca vcaVar2 = (vca) f.get(i2);
                                    vcaVar.getClass();
                                    d2 += vcaVar.a(vcaVar2.a, vcaVar2.b);
                                }
                                double d3 = d2 / 47.0d;
                                int i3 = 1;
                                double d4 = 0.0d;
                                while (i3 < f.size()) {
                                    int i4 = i3 - 1;
                                    vca vcaVar3 = (vca) f.get(i4);
                                    vca vcaVar4 = (vca) f.get(i3);
                                    vcaVar3.getClass();
                                    ArrayList arrayList3 = arrayList2;
                                    double a = vcaVar3.a(vcaVar4.a, vcaVar4.b);
                                    double d5 = d4 + a;
                                    if (d5 >= d3) {
                                        double d6 = (d3 - d4) / a;
                                        j = currentTimeMillis;
                                        vca vcaVar5 = new vca(((((vca) f.get(i3)).a - ((vca) f.get(i4)).a) * d6) + ((vca) f.get(i4)).a, ((((vca) f.get(i3)).b - ((vca) f.get(i4)).b) * d6) + ((vca) f.get(i4)).b);
                                        arrayList = arrayList3;
                                        arrayList.add(vcaVar5);
                                        f.add(i3, vcaVar5);
                                        d4 = 0.0d;
                                    } else {
                                        j = currentTimeMillis;
                                        arrayList = arrayList3;
                                        d4 = d5;
                                    }
                                    i3++;
                                    arrayList2 = arrayList;
                                    currentTimeMillis = j;
                                }
                                long j2 = currentTimeMillis;
                                ArrayList arrayList4 = arrayList2;
                                if (arrayList4.size() == 47) {
                                    arrayList4.add((vca) c00.g(1, f));
                                }
                                ArrayList f2 = xca.f(arrayList4);
                                vca b3 = xca.b(f2);
                                double atan2 = Math.atan2(b3.b - ((vca) f2.get(0)).b, b3.a - ((vca) f2.get(0)).a);
                                vca b4 = xca.b(f2);
                                double cos = Math.cos(atan2);
                                double sin = Math.sin(atan2);
                                int i5 = 0;
                                while (i5 < f2.size()) {
                                    vca vcaVar6 = (vca) f2.get(i5);
                                    double d7 = vcaVar6.a;
                                    double d8 = b4.a;
                                    double d9 = d7 - d8;
                                    double d10 = sin;
                                    double d11 = vcaVar6.b;
                                    double d12 = b4.b;
                                    double d13 = d11 - d12;
                                    vcaVar6.b = (d13 * cos) + (d9 * d10) + d12;
                                    vcaVar6.a = ((d9 * cos) - (d13 * d10)) + d8;
                                    i5++;
                                    sin = d10;
                                }
                                vca b5 = xca.b(f2);
                                double d14 = -b5.a;
                                double d15 = -b5.b;
                                for (int i6 = 0; i6 < f2.size(); i6++) {
                                    vca vcaVar7 = (vca) f2.get(i6);
                                    vcaVar7.a += d14;
                                    vcaVar7.b += d15;
                                }
                                pz5 a2 = xca.a(f2);
                                double d16 = a2.d - a2.b;
                                double d17 = a2.e - a2.c;
                                for (int i7 = 0; i7 < f2.size(); i7++) {
                                    vca vcaVar8 = (vca) f2.get(i7);
                                    vcaVar8.a = (250.0d / d16) * vcaVar8.a;
                                    vcaVar8.b = (250.0d / d17) * vcaVar8.b;
                                }
                                vca b6 = xca.b(f2);
                                double d18 = Double.MAX_VALUE;
                                int i8 = -1;
                                int i9 = -1;
                                for (int i10 = 0; i10 < xcaVar2.c.size(); i10++) {
                                    ArrayList arrayList5 = ((wca) xcaVar2.c.get(i10)).b;
                                    double d19 = -0.37081471193057003d;
                                    double d20 = xca.d(f2, b6, arrayList5, -0.37081471193057003d);
                                    double d21 = d18;
                                    double d22 = -1.5707963267948966d;
                                    double d23 = 1.5707963267948966d;
                                    double d24 = 0.37081471193057003d;
                                    double d25 = xca.d(f2, b6, arrayList5, 0.37081471193057003d);
                                    while (Math.abs(d23 - d22) > 0.06981317007977318d) {
                                        if (d20 < d25) {
                                            double d26 = (0.3819660112501051d * d24) + (0.6180339887498949d * d22);
                                            double d27 = xca.d(f2, b6, arrayList5, d26);
                                            d = d19;
                                            d19 = d26;
                                            d25 = d20;
                                            d20 = d27;
                                            d23 = d24;
                                        } else {
                                            double d28 = (0.6180339887498949d * d23) + (0.3819660112501051d * d19);
                                            double d29 = xca.d(f2, b6, arrayList5, d28);
                                            d = d28;
                                            d20 = d25;
                                            d25 = d29;
                                            d22 = d19;
                                            d19 = d24;
                                        }
                                        d24 = d;
                                    }
                                    double min = Math.min(d20, d25);
                                    if (min < d21) {
                                        i8 = ((wca) xcaVar2.c.get(i10)).a;
                                        d18 = min;
                                        i9 = i10;
                                    } else {
                                        d18 = d21;
                                    }
                                }
                                int i11 = 1.0d - (d18 / xca.n) < 0.8d ? -1 : i8;
                                if (i11 >= 0 && i11 < u01.c.size() && arrayList4.size() >= 1) {
                                    tca tcaVar2 = new tca(u01.o(i11));
                                    if (i11 == 4) {
                                        int e2 = xca.e(0, arrayList4);
                                        if (e2 > 0) {
                                            if (e2 > 10) {
                                                e2 -= 2;
                                            }
                                            vca vcaVar9 = (vca) arrayList4.get(e2);
                                            vca vcaVar10 = (vca) arrayList4.get(e2 / 2);
                                            vca vcaVar11 = (vca) arrayList4.get(0);
                                            tcaVar2.b = (float) vcaVar9.a;
                                            tcaVar2.c = (float) vcaVar9.b;
                                            tcaVar2.i = (float) vcaVar10.a;
                                            tcaVar2.j = (float) vcaVar10.b;
                                            tcaVar2.d = (float) vcaVar11.a;
                                            tcaVar2.e = (float) vcaVar11.b;
                                            tcaVar2.k = 16.0f;
                                        }
                                    } else {
                                        vca b7 = xca.b(arrayList4);
                                        tcaVar2.b = (float) b7.a;
                                        tcaVar2.c = (float) b7.b;
                                        pz5 a3 = xca.a(arrayList4);
                                        tcaVar2.d = ((float) (a3.d - a3.b)) / 2.0f;
                                        tcaVar2.e = ((float) (a3.e - a3.c)) / 2.0f;
                                        if (i11 == 2 && (e = xca.e(1, arrayList4)) > 0) {
                                            vca vcaVar12 = (vca) arrayList4.get(e);
                                            tcaVar2.h = (float) Math.atan2(vcaVar12.b - tcaVar2.c, vcaVar12.a - tcaVar2.b);
                                        }
                                    }
                                    tcaVar = tcaVar2;
                                    if (f11.a) {
                                        StringBuilder sb = new StringBuilder("took ");
                                        sb.append(System.currentTimeMillis() - j2);
                                        sb.append("ms to ");
                                        sb.append(tcaVar != null ? "" : "not ");
                                        sb.append("detect a shape");
                                        sb.append(tcaVar != null ? " (template#" + i9 + " shape#" + i11 + ")" : "");
                                        Log.i("shapedetector", sb.toString());
                                    }
                                    hl.c3(new y36(xcaVar2, tcaVar, i9, f2));
                                    xcaVar2.j.set(false);
                                }
                                tcaVar = null;
                                if (f11.a) {
                                }
                                hl.c3(new y36(xcaVar2, tcaVar, i9, f2));
                                xcaVar2.j.set(false);
                            }
                        }
                        return;
                    default:
                        xca xcaVar3 = xcaVar;
                        try {
                            InputStream open = a.b.getAssets().open("shapes.dat");
                            while (open.available() > 5) {
                                wca wcaVar = new wca();
                                wcaVar.a = open.read();
                                int read = open.read();
                                int read2 = open.read() - 64;
                                int read3 = open.read() - 64;
                                if (open.available() < (read << 1)) {
                                    if (xcaVar3.h && (string = xcaVar3.g.getString("moretemplates", null)) != null) {
                                        split = string.split("\\|");
                                        int size2 = xcaVar3.c.size();
                                        for (i = 0; i < split.length; i++) {
                                            wca wcaVar2 = new wca();
                                            String[] split2 = split[i].split(",");
                                            if (split2.length > 1) {
                                                wcaVar2.a = Integer.parseInt(split2[0]);
                                                for (int i12 = 1; i12 < split2.length; i12 += 2) {
                                                    wcaVar2.b.add(new vca(Double.parseDouble(split2[i12]), Double.parseDouble(split2[i12 + 1])));
                                                }
                                                wcaVar2.c = xcaVar3.g.getInt("score" + (size2 + i), 0);
                                                xcaVar3.c.add(wcaVar2);
                                            }
                                        }
                                    }
                                    open.close();
                                    return;
                                }
                                for (int i13 = 0; i13 < read; i13++) {
                                    wcaVar.b.add(new vca((open.read() - read2) - 127, (open.read() - read3) - 127));
                                }
                                wcaVar.c = xcaVar3.g.getInt("score" + xcaVar3.c.size(), 0);
                                xcaVar3.c.add(wcaVar);
                            }
                            if (xcaVar3.h) {
                                split = string.split("\\|");
                                int size22 = xcaVar3.c.size();
                                while (i < split.length) {
                                }
                            }
                            open.close();
                            return;
                        } catch (Exception e3) {
                            cc4.g(e3, true);
                            return;
                        }
                }
            }
        });
        this.s = xcaVar;
    }

    public final void a(r01 r01Var, boolean z, ja9 ja9Var) {
        oa9 oa9Var;
        if (this.l) {
            pa9 pa9Var = this.a;
            if (pa9Var.getPainting().G || this.g == null) {
                return;
            }
            v01 currentBrush = r01Var == null ? pa9Var.getCurrentBrush() : r01Var;
            if ((currentBrush instanceof q01) || (currentBrush instanceof s01)) {
                currentBrush = new t01();
            }
            v01 v01Var = currentBrush;
            this.l = false;
            if (v01Var instanceof r01) {
                pa9Var.getPainting().E = false;
            }
            nx7 painting = pa9Var.getPainting();
            painting.f.f(new kx7(painting, (byte) 1));
            this.n = 0;
            this.o = 0;
            this.j = false;
            this.b = false;
            if (z && (oa9Var = pa9Var.a) != null) {
                oa9Var.R();
            }
            qma qmaVar = pa9Var.getPainting().g;
            vg8 vg8Var = this.g;
            float a = dte.a((float) vg8Var.a, (float) vg8Var.b, 0.0f, 0.0f);
            vg8 vg8Var2 = this.g;
            float max = Math.max(a, dte.a((float) vg8Var2.a, (float) vg8Var2.b, qmaVar.a, 0.0f));
            vg8 vg8Var3 = this.g;
            float a2 = dte.a((float) vg8Var3.a, (float) vg8Var3.b, 0.0f, qmaVar.b);
            vg8 vg8Var4 = this.g;
            float max2 = Math.max(max, Math.max(a2, dte.a((float) vg8Var4.a, (float) vg8Var4.b, qmaVar.a, qmaVar.b))) / 0.84f;
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
            vg8 vg8Var5 = this.g;
            vg8 vg8Var6 = new vg8(vg8Var5.a, vg8Var5.b, 1.0d);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.x = ofFloat;
            ofFloat.addUpdateListener(new rv1(this, vg8Var6, v01Var, max2));
            this.x.addListener(new aq5(this, vg8Var6, max2, v01Var, z, ja9Var));
            this.x.setDuration(450L);
            this.x.setInterpolator(k43.h);
            this.x.start();
            if (z) {
                yw0.h.a();
            }
        }
    }

    public final void b(j18 j18Var) {
        pa9 pa9Var = this.a;
        int currentColor = pa9Var.getCurrentColor();
        float currentWeight = pa9Var.getCurrentWeight();
        v01 currentBrush = pa9Var.getCurrentBrush();
        j18Var.c = currentColor;
        j18Var.d = currentWeight;
        j18Var.e = currentBrush;
        if (this.f) {
            this.i = 0.0d;
        }
        j18Var.a = this.i;
        nx7 painting = pa9Var.getPainting();
        boolean z = this.f;
        zp5 zp5Var = new zp5(this, j18Var, (byte) 0);
        boolean z2 = false;
        if (painting.L == null) {
            painting.f.f(new my6(painting, j18Var, z, z2, zp5Var, (byte) 1));
        }
        this.f = false;
    }

    public final void c(boolean z, float f) {
        int i = this.n;
        vg8[] vg8VarArr = this.m;
        if (i <= 2) {
            vg8[] vg8VarArr2 = new vg8[i];
            System.arraycopy(vg8VarArr, 0, vg8VarArr2, 0, i);
            b(new j18(vg8VarArr2));
            return;
        }
        Vector vector = new Vector();
        vg8 vg8Var = vg8VarArr[0];
        vg8 vg8Var2 = vg8VarArr[1];
        vg8 vg8Var3 = vg8VarArr[2];
        if (vg8Var3 == null || vg8Var2 == null || vg8Var == null) {
            return;
        }
        vg8 b = vg8Var2.b(vg8Var);
        vg8 b2 = vg8Var3.b(vg8Var2);
        float f2 = 1.0f;
        int min = (int) Math.min(48.0d, Math.max(Math.floor(b.a(b2) / 1.0f), 24.0d));
        float f3 = 1.0f / min;
        int i2 = 0;
        float f4 = 0.0f;
        while (i2 < min) {
            float f5 = f2 - f4;
            double d = f5;
            float f6 = f3;
            double pow = Math.pow(d, 2.0d);
            int i3 = i2;
            double d2 = f4 * f4;
            double d3 = f5 * f5;
            double d4 = f4;
            double d5 = (b2.a * d2) + (vg8Var2.a * 2.0d * d4 * d) + (b.a * d3);
            double d6 = (b2.b * d2) + (vg8Var2.b * 2.0d * d4 * d) + (b.b * d3);
            double R1 = ((((b2.c * d2) + ((vg8Var2.c * ((2.0f * f5) * f4)) + (b.c * pow))) - 1.0d) * hl.R1(f, 1.0f, ete.a(this.o / 16.0f, 0.0f, 1.0f))) + 1.0d;
            vg8 vg8Var4 = new vg8(d5, d6, R1);
            if (this.c) {
                vg8Var4.d = true;
                this.c = false;
            }
            vector.add(vg8Var4);
            this.p += R1;
            this.q += 1.0d;
            f4 += f6;
            f2 = 1.0f;
            f3 = f6;
            i2 = i3 + 1;
        }
        if (z) {
            b2.d = true;
        }
        vector.add(b2);
        vg8[] vg8VarArr3 = new vg8[vector.size()];
        vector.toArray(vg8VarArr3);
        b(new j18(vg8VarArr3));
        System.arraycopy(vg8VarArr, 1, vg8VarArr, 0, 2);
        if (z) {
            this.n = 0;
        } else {
            this.n = 2;
        }
    }
}
