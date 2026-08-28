package b5;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import d5.f0;
import h3.q0;
import h3.t0;
import j4.i1;
import j4.j1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;
import o8.k0;
import o8.l0;
import org.telegram.messenger.TranslateController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class r extends w {
    public static final k0 k = new o8.q(new a5.e(3));
    public static final k0 l = new o8.q(new a5.e(4));
    public final Object d;
    public final Context e;
    public final wa.a f;
    public final boolean g;
    public j h;
    public final m i;
    public j3.e j;

    public r(Context context, wa.a aVar) {
        int i9 = j.b0;
        j jVar = new j(new i(context));
        this.d = new Object();
        this.e = context != null ? context.getApplicationContext() : null;
        this.f = aVar;
        this.h = jVar;
        this.j = j3.e.h;
        boolean z10 = context != null && f0.F(context);
        this.g = z10;
        if (!z10 && context != null && f0.a >= 32) {
            this.i = m.f(context);
        }
        if (this.h.V && context == null) {
            d5.a.K("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static void c(j1 j1Var, j jVar, HashMap hashMap) {
        for (int i9 = 0; i9 < j1Var.a; i9++) {
            x xVar = (x) jVar.K.get(j1Var.a(i9));
            if (xVar != null) {
                i1 i1Var = xVar.a;
                x xVar2 = (x) hashMap.get(Integer.valueOf(i1Var.c));
                if (xVar2 == null || (xVar2.b.isEmpty() && !xVar.b.isEmpty())) {
                    hashMap.put(Integer.valueOf(i1Var.c), xVar);
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
        int i9 = f0.a;
        return h10.split("-", 2)[0].equals(h.split("-", 2)[0]) ? 2 : 0;
    }

    public static boolean f(int i9, boolean z10) {
        int i10 = i9 & 7;
        if (i10 != 4) {
            return z10 && i10 == 3;
        }
        return true;
    }

    public static String h(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, TranslateController.UNKNOWN_LANGUAGE)) {
            return null;
        }
        return str;
    }

    public static Pair i(int i9, v vVar, int[][][] iArr, o oVar, Comparator comparator) {
        int i10;
        RandomAccess randomAccess;
        v vVar2 = vVar;
        ArrayList arrayList = new ArrayList();
        int i11 = vVar2.a;
        int i12 = 0;
        while (i12 < i11) {
            if (i9 == vVar2.b[i12]) {
                j1 j1Var = vVar2.c[i12];
                for (int i13 = 0; i13 < j1Var.a; i13++) {
                    i1 a2 = j1Var.a(i13);
                    l0 e10 = oVar.e(i12, a2, iArr[i12][i13]);
                    int i14 = a2.a;
                    boolean[] zArr = new boolean[i14];
                    int i15 = 0;
                    while (i15 < i14) {
                        p pVar = (p) e10.get(i15);
                        int a3 = pVar.a();
                        if (zArr[i15] || a3 == 0) {
                            i10 = i11;
                        } else {
                            if (a3 == 1) {
                                randomAccess = o8.z.y(pVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(pVar);
                                int i16 = i15 + 1;
                                while (i16 < i14) {
                                    p pVar2 = (p) e10.get(i16);
                                    int i17 = i11;
                                    if (pVar2.a() == 2 && pVar.b(pVar2)) {
                                        arrayList2.add(pVar2);
                                        zArr[i16] = true;
                                    }
                                    i16++;
                                    i11 = i17;
                                }
                                randomAccess = arrayList2;
                            }
                            i10 = i11;
                            arrayList.add(randomAccess);
                        }
                        i15++;
                        i11 = i10;
                    }
                }
            }
            i12++;
            vVar2 = vVar;
            i11 = i11;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i18 = 0; i18 < list.size(); i18++) {
            iArr2[i18] = ((p) list.get(i18)).c;
        }
        p pVar3 = (p) list.get(0);
        return Pair.create(new s(0, pVar3.b, iArr2), Integer.valueOf(pVar3.a));
    }

    @Override // b5.w
    public final void a() {
        m mVar;
        synchronized (this.d) {
            try {
                if (f0.a >= 32 && (mVar = this.i) != null) {
                    mVar.e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a = null;
        this.b = null;
    }

    @Override // b5.w
    public final void b(j3.e eVar) {
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

    public final j e() {
        j jVar;
        synchronized (this.d) {
            jVar = this.h;
        }
        return jVar;
    }

    public final void g() {
        boolean z10;
        q0 q0Var;
        m mVar;
        synchronized (this.d) {
            try {
                z10 = this.h.V && !this.g && f0.a >= 32 && (mVar = this.i) != null && mVar.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z10 || (q0Var = this.a) == null) {
            return;
        }
        q0Var.n.d(10);
    }

    public final void j(z zVar) {
        if (zVar instanceof j) {
            k((j) zVar);
        }
        i iVar = new i(e());
        iVar.a(zVar);
        k(new j(iVar));
    }

    public final void k(j jVar) {
        boolean equals;
        jVar.getClass();
        synchronized (this.d) {
            equals = this.h.equals(jVar);
            this.h = jVar;
        }
        if (equals) {
            return;
        }
        if (jVar.V && this.e == null) {
            d5.a.K("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        q0 q0Var = this.a;
        if (q0Var != null) {
            q0Var.n.d(10);
        }
    }
}
