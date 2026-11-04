package db;

import android.util.Log;
import b8.ib;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c1 extends hd.j implements od.p {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ e1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(e1 e1Var, fd.c cVar, int i3) {
        super(2, cVar);
        this.a = i3;
        this.c = e1Var;
    }

    @Override // hd.a
    public final fd.c create(Object obj, fd.c cVar) {
        switch (this.a) {
            case 0:
                c1 c1Var = new c1(this.c, cVar, 0);
                c1Var.b = obj;
                return c1Var;
            default:
                c1 c1Var2 = new c1(this.c, cVar, 1);
                c1Var2.b = obj;
                return c1Var2;
        }
    }

    @Override // od.p
    public final Object invoke(Object obj, Object obj2) {
        j0 j0Var = (j0) obj;
        fd.c cVar = (fd.c) obj2;
        switch (this.a) {
        }
        return ((c1) create(j0Var, cVar)).invokeSuspend(dd.k.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x00a4  */
    @Override // hd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        int i3 = this.a;
        e1 e1Var = this.c;
        switch (i3) {
            case 0:
                gd.a aVar = gd.a.a;
                ib.b(obj);
                return j0.a((j0) this.b, null, e1Var.d.a(), null, 5);
            default:
                gd.a aVar2 = gd.a.a;
                ib.b(obj);
                j0 j0Var = (j0) this.b;
                c0 c0Var = e1Var.f;
                boolean e10 = e1Var.e(j0Var);
                Map map = j0Var.c;
                if (map != null) {
                    c0Var.getClass();
                    if (!c0Var.f) {
                        ArrayList a10 = f0.a(c0Var.a);
                        ArrayList arrayList = new ArrayList();
                        int size = a10.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj2 = a10.get(i10);
                            i10++;
                            e0 e0Var = (e0) obj2;
                            a0 a0Var = (a0) map.get(e0Var.a);
                            dd.e eVar = a0Var != null ? new dd.e(e0Var, a0Var) : null;
                            if (eVar != null) {
                                arrayList.add(eVar);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            int size2 = arrayList.size();
                            int i11 = 0;
                            while (i11 < size2) {
                                Object obj3 = arrayList.get(i11);
                                i11++;
                                dd.e eVar2 = (dd.e) obj3;
                                e0 e0Var2 = (e0) eVar2.a;
                                a0 a0Var2 = (a0) eVar2.b;
                                String a11 = c0Var.a();
                                String str = e0Var2.a;
                                int i12 = e0Var2.b;
                                if (kotlin.jvm.internal.j.a(a11, str)) {
                                    if (i12 == a0Var2.a && kotlin.jvm.internal.j.a((String) c0Var.d.getValue(), a0Var2.b)) {
                                    }
                                } else if (i12 != a0Var2.a) {
                                }
                                if (z10) {
                                    Log.d("FirebaseSessions", "Cold app start detected");
                                }
                            }
                        }
                        z10 = true;
                        if (z10) {
                        }
                    }
                    z10 = false;
                    if (z10) {
                    }
                } else {
                    Log.d("FirebaseSessions", "No process data map");
                    z10 = true;
                }
                boolean d = e1Var.d(j0Var);
                if (z10) {
                    map = c0Var.b(ed.p.a);
                } else if (d) {
                    map = c0Var.b(map);
                }
                n0 n0Var = z10 ? null : j0Var.a;
                if (!e10 && !z10) {
                    return d ? j0.a(j0Var, null, null, c0Var.b(map), 3) : j0Var;
                }
                n0 a12 = e1Var.b.a(n0Var);
                t0 t0Var = (t0) e1Var.c;
                wd.b0.q(wd.b0.b(t0Var.e), new r0(t0Var, a12, null));
                c0Var.f = true;
                return new j0(a12, null, map);
        }
    }
}
