package f5;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import h5.d0;
import j3.k0;
import j3.n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;
import o4.s0;
import o4.t0;
import org.telegram.messenger.TranslateController;
import s8.h0;
import s8.i0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class p extends t {
    public static final h0 k = new s8.m(new e5.f(3));
    public static final h0 l = new s8.m(new e5.f(4));
    public final Object d;
    public final Context e;
    public final db.a f;
    public final boolean g;
    public h h;
    public final k i;
    public l3.d j;

    public p(Context context, db.a aVar) {
        int i10 = h.d0;
        h hVar = new h(new g(context));
        this.d = new Object();
        this.e = context != null ? context.getApplicationContext() : null;
        this.f = aVar;
        this.h = hVar;
        this.j = l3.d.h;
        boolean z4 = context != null && d0.F(context);
        this.g = z4;
        if (!z4 && context != null && d0.a >= 32) {
            this.i = k.f(context);
        }
        if (this.h.W && context == null) {
            h5.a.K("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static void c(t0 t0Var, h hVar, HashMap hashMap) {
        for (int i10 = 0; i10 < t0Var.a; i10++) {
            v vVar = (v) hVar.L.get(t0Var.a(i10));
            if (vVar != null) {
                s0 s0Var = vVar.a;
                v vVar2 = (v) hashMap.get(Integer.valueOf(s0Var.c));
                if (vVar2 == null || (vVar2.b.isEmpty() && !vVar.b.isEmpty())) {
                    hashMap.put(Integer.valueOf(s0Var.c), vVar);
                }
            }
        }
    }

    public static int d(n0 n0Var, String str, boolean z4) {
        if (!TextUtils.isEmpty(str) && str.equals(n0Var.c)) {
            return 4;
        }
        String h = h(str);
        String h9 = h(n0Var.c);
        if (h9 == null || h == null) {
            return (z4 && h9 == null) ? 1 : 0;
        }
        if (h9.startsWith(h) || h.startsWith(h9)) {
            return 3;
        }
        int i10 = d0.a;
        return h9.split("-", 2)[0].equals(h.split("-", 2)[0]) ? 2 : 0;
    }

    public static boolean f(int i10, boolean z4) {
        int i11 = i10 & 7;
        if (i11 != 4) {
            return z4 && i11 == 3;
        }
        return true;
    }

    public static String h(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, TranslateController.UNKNOWN_LANGUAGE)) {
            return null;
        }
        return str;
    }

    public static Pair j(int i10, s sVar, int[][][] iArr, m mVar, Comparator comparator) {
        int i11;
        RandomAccess randomAccess;
        s sVar2 = sVar;
        ArrayList arrayList = new ArrayList();
        int i12 = sVar2.a;
        int i13 = 0;
        while (i13 < i12) {
            if (i10 == sVar2.b[i13]) {
                t0 t0Var = sVar2.c[i13];
                for (int i14 = 0; i14 < t0Var.a; i14++) {
                    s0 a2 = t0Var.a(i14);
                    i0 e6 = mVar.e(i13, a2, iArr[i13][i14]);
                    int i15 = a2.a;
                    boolean[] zArr = new boolean[i15];
                    int i16 = 0;
                    while (i16 < i15) {
                        n nVar = (n) e6.get(i16);
                        int a10 = nVar.a();
                        if (zArr[i16] || a10 == 0) {
                            i11 = i12;
                        } else {
                            if (a10 == 1) {
                                randomAccess = s8.v.x(nVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(nVar);
                                int i17 = i16 + 1;
                                while (i17 < i15) {
                                    n nVar2 = (n) e6.get(i17);
                                    int i18 = i12;
                                    if (nVar2.a() == 2 && nVar.b(nVar2)) {
                                        arrayList2.add(nVar2);
                                        zArr[i17] = true;
                                    }
                                    i17++;
                                    i12 = i18;
                                }
                                randomAccess = arrayList2;
                            }
                            i11 = i12;
                            arrayList.add(randomAccess);
                        }
                        i16++;
                        i12 = i11;
                    }
                }
            }
            i13++;
            sVar2 = sVar;
            i12 = i12;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i19 = 0; i19 < list.size(); i19++) {
            iArr2[i19] = ((n) list.get(i19)).c;
        }
        n nVar3 = (n) list.get(0);
        return Pair.create(new q(0, nVar3.b, iArr2), Integer.valueOf(nVar3.a));
    }

    @Override // f5.t
    public final void a() {
        k kVar;
        synchronized (this.d) {
            try {
                if (d0.a >= 32 && (kVar = this.i) != null) {
                    kVar.e();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.a = null;
        this.b = null;
    }

    @Override // f5.t
    public final void b(l3.d dVar) {
        boolean equals;
        synchronized (this.d) {
            equals = this.j.equals(dVar);
            this.j = dVar;
        }
        if (equals) {
            return;
        }
        g();
    }

    public final h e() {
        h hVar;
        synchronized (this.d) {
            hVar = this.h;
        }
        return hVar;
    }

    public final void g() {
        boolean z4;
        k0 k0Var;
        k kVar;
        synchronized (this.d) {
            try {
                z4 = this.h.W && !this.g && d0.a >= 32 && (kVar = this.i) != null && kVar.b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z4 || (k0Var = this.a) == null) {
            return;
        }
        k0Var.n.d(10);
    }

    public final void i() {
        boolean z4;
        k0 k0Var;
        synchronized (this.d) {
            z4 = this.h.a0;
        }
        if (!z4 || (k0Var = this.a) == null) {
            return;
        }
        k0Var.n.d(26);
    }

    public final void k(x xVar) {
        if (xVar instanceof h) {
            l((h) xVar);
        }
        g gVar = new g(e());
        gVar.a(xVar);
        l(new h(gVar));
    }

    public final void l(h hVar) {
        boolean equals;
        hVar.getClass();
        synchronized (this.d) {
            equals = this.h.equals(hVar);
            this.h = hVar;
        }
        if (equals) {
            return;
        }
        if (hVar.W && this.e == null) {
            h5.a.K("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        k0 k0Var = this.a;
        if (k0Var != null) {
            k0Var.n.d(10);
        }
    }
}
