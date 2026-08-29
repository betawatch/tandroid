package d5;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import f5.d0;
import j3.q0;
import j3.t0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;
import l4.j1;
import l4.k1;
import org.telegram.messenger.TranslateController;
import q8.k0;
import q8.l0;
import q8.z;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class p extends u {
    public static final k0 k = new q8.q(new c5.e(6));
    public static final k0 l = new q8.q(new c5.e(7));
    public final Object d;
    public final Context e;
    public final ab.b f;
    public final boolean g;
    public h h;
    public final k i;
    public l3.e j;

    public p(Context context, ab.b bVar) {
        int i10 = h.b0;
        h hVar = new h(new g(context));
        this.d = new Object();
        this.e = context != null ? context.getApplicationContext() : null;
        this.f = bVar;
        this.h = hVar;
        this.j = l3.e.h;
        boolean z10 = context != null && d0.F(context);
        this.g = z10;
        if (!z10 && context != null && d0.a >= 32) {
            this.i = k.f(context);
        }
        if (this.h.V && context == null) {
            f5.a.K("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static void c(k1 k1Var, h hVar, HashMap hashMap) {
        for (int i10 = 0; i10 < k1Var.a; i10++) {
            v vVar = (v) hVar.K.get(k1Var.a(i10));
            if (vVar != null) {
                j1 j1Var = vVar.a;
                v vVar2 = (v) hashMap.get(Integer.valueOf(j1Var.c));
                if (vVar2 == null || (vVar2.b.isEmpty() && !vVar.b.isEmpty())) {
                    hashMap.put(Integer.valueOf(j1Var.c), vVar);
                }
            }
        }
    }

    public static int d(t0 t0Var, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(t0Var.c)) {
            return 4;
        }
        String h = h(str);
        String h10 = h(t0Var.c);
        if (h10 == null || h == null) {
            return (z10 && h10 == null) ? 1 : 0;
        }
        if (h10.startsWith(h) || h.startsWith(h10)) {
            return 3;
        }
        int i10 = d0.a;
        return h10.split("-", 2)[0].equals(h.split("-", 2)[0]) ? 2 : 0;
    }

    public static boolean f(int i10, boolean z10) {
        int i11 = i10 & 7;
        if (i11 != 4) {
            return z10 && i11 == 3;
        }
        return true;
    }

    public static String h(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, TranslateController.UNKNOWN_LANGUAGE)) {
            return null;
        }
        return str;
    }

    public static Pair i(int i10, t tVar, int[][][] iArr, m mVar, Comparator comparator) {
        int i11;
        RandomAccess randomAccess;
        t tVar2 = tVar;
        ArrayList arrayList = new ArrayList();
        int i12 = tVar2.a;
        int i13 = 0;
        while (i13 < i12) {
            if (i10 == tVar2.b[i13]) {
                k1 k1Var = tVar2.c[i13];
                for (int i14 = 0; i14 < k1Var.a; i14++) {
                    j1 a2 = k1Var.a(i14);
                    l0 c3 = mVar.c(i13, a2, iArr[i13][i14]);
                    int i15 = a2.a;
                    boolean[] zArr = new boolean[i15];
                    int i16 = 0;
                    while (i16 < i15) {
                        n nVar = (n) c3.get(i16);
                        int a10 = nVar.a();
                        if (zArr[i16] || a10 == 0) {
                            i11 = i12;
                        } else {
                            if (a10 == 1) {
                                randomAccess = z.y(nVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(nVar);
                                int i17 = i16 + 1;
                                while (i17 < i15) {
                                    n nVar2 = (n) c3.get(i17);
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
            tVar2 = tVar;
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

    @Override // d5.u
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

    @Override // d5.u
    public final void b(l3.e eVar) {
        boolean equals;
        synchronized (this.d) {
            equals = this.j.equals(eVar);
            this.j = eVar;
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
        boolean z10;
        q0 q0Var;
        k kVar;
        synchronized (this.d) {
            try {
                z10 = this.h.V && !this.g && d0.a >= 32 && (kVar = this.i) != null && kVar.b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z10 || (q0Var = this.a) == null) {
            return;
        }
        q0Var.n.d(10);
    }

    public final void j(x xVar) {
        if (xVar instanceof h) {
            k((h) xVar);
        }
        g gVar = new g(e());
        gVar.a(xVar);
        k(new h(gVar));
    }

    public final void k(h hVar) {
        boolean equals;
        hVar.getClass();
        synchronized (this.d) {
            equals = this.h.equals(hVar);
            this.h = hVar;
        }
        if (equals) {
            return;
        }
        if (hVar.V && this.e == null) {
            f5.a.K("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        q0 q0Var = this.a;
        if (q0Var != null) {
            q0Var.n.d(10);
        }
    }
}
