package b5;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import d5.g0;
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
import org.telegram.messenger.TranslateController;
import p8.k0;
import p8.l0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class q extends v {
    public static final k0 k = new p8.q(new a5.f(4));
    public static final k0 l = new p8.q(new a5.f(5));
    public final Object d;
    public final Context e;
    public final ab.a f;
    public final boolean g;
    public i h;
    public final l i;
    public j3.e j;

    public q(Context context, ab.a aVar) {
        int i10 = i.b0;
        i iVar = new i(new h(context));
        this.d = new Object();
        this.e = context != null ? context.getApplicationContext() : null;
        this.f = aVar;
        this.h = iVar;
        this.j = j3.e.h;
        boolean z10 = context != null && g0.F(context);
        this.g = z10;
        if (!z10 && context != null && g0.a >= 32) {
            this.i = l.f(context);
        }
        if (this.h.V && context == null) {
            d5.a.K("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static void c(j1 j1Var, i iVar, HashMap hashMap) {
        for (int i10 = 0; i10 < j1Var.a; i10++) {
            w wVar = (w) iVar.K.get(j1Var.a(i10));
            if (wVar != null) {
                i1 i1Var = wVar.a;
                w wVar2 = (w) hashMap.get(Integer.valueOf(i1Var.c));
                if (wVar2 == null || (wVar2.b.isEmpty() && !wVar.b.isEmpty())) {
                    hashMap.put(Integer.valueOf(i1Var.c), wVar);
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
        int i10 = g0.a;
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

    public static Pair i(int i10, u uVar, int[][][] iArr, n nVar, Comparator comparator) {
        int i11;
        RandomAccess randomAccess;
        u uVar2 = uVar;
        ArrayList arrayList = new ArrayList();
        int i12 = uVar2.a;
        int i13 = 0;
        while (i13 < i12) {
            if (i10 == uVar2.b[i13]) {
                j1 j1Var = uVar2.c[i13];
                for (int i14 = 0; i14 < j1Var.a; i14++) {
                    i1 a2 = j1Var.a(i14);
                    l0 d = nVar.d(i13, a2, iArr[i13][i14]);
                    int i15 = a2.a;
                    boolean[] zArr = new boolean[i15];
                    int i16 = 0;
                    while (i16 < i15) {
                        o oVar = (o) d.get(i16);
                        int a3 = oVar.a();
                        if (zArr[i16] || a3 == 0) {
                            i11 = i12;
                        } else {
                            if (a3 == 1) {
                                randomAccess = p8.z.y(oVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(oVar);
                                int i17 = i16 + 1;
                                while (i17 < i15) {
                                    o oVar2 = (o) d.get(i17);
                                    int i18 = i12;
                                    if (oVar2.a() == 2 && oVar.b(oVar2)) {
                                        arrayList2.add(oVar2);
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
            uVar2 = uVar;
            i12 = i12;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i19 = 0; i19 < list.size(); i19++) {
            iArr2[i19] = ((o) list.get(i19)).c;
        }
        o oVar3 = (o) list.get(0);
        return Pair.create(new r(0, oVar3.b, iArr2), Integer.valueOf(oVar3.a));
    }

    @Override // b5.v
    public final void a() {
        l lVar;
        synchronized (this.d) {
            try {
                if (g0.a >= 32 && (lVar = this.i) != null) {
                    lVar.e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a = null;
        this.b = null;
    }

    @Override // b5.v
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

    public final i e() {
        i iVar;
        synchronized (this.d) {
            iVar = this.h;
        }
        return iVar;
    }

    public final void g() {
        boolean z10;
        q0 q0Var;
        l lVar;
        synchronized (this.d) {
            try {
                z10 = this.h.V && !this.g && g0.a >= 32 && (lVar = this.i) != null && lVar.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z10 || (q0Var = this.a) == null) {
            return;
        }
        q0Var.n.d(10);
    }

    public final void j(y yVar) {
        if (yVar instanceof i) {
            k((i) yVar);
        }
        h hVar = new h(e());
        hVar.a(yVar);
        k(new i(hVar));
    }

    public final void k(i iVar) {
        boolean equals;
        iVar.getClass();
        synchronized (this.d) {
            equals = this.h.equals(iVar);
            this.h = iVar;
        }
        if (equals) {
            return;
        }
        if (iVar.V && this.e == null) {
            d5.a.K("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        q0 q0Var = this.a;
        if (q0Var != null) {
            q0Var.n.d(10);
        }
    }
}
