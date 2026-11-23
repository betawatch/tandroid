package gb;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class c1 extends kd.j implements rd.p {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ e1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(e1 e1Var, id.c cVar, int i7) {
        super(2, cVar);
        this.a = i7;
        this.c = e1Var;
    }

    @Override // kd.a
    public final id.c create(Object obj, id.c cVar) {
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

    @Override // rd.p
    public final Object invoke(Object obj, Object obj2) {
        k0 k0Var = (k0) obj;
        id.c cVar = (id.c) obj2;
        switch (this.a) {
        }
        return ((c1) create(k0Var, cVar)).invokeSuspend(gd.k.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x00a4  */
    @Override // kd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        int i7 = this.a;
        e1 e1Var = this.c;
        switch (i7) {
            case 0:
                jd.a aVar = jd.a.a;
                c8.z.b(obj);
                return k0.a((k0) this.b, null, e1Var.d.a(), null, 5);
            default:
                jd.a aVar2 = jd.a.a;
                c8.z.b(obj);
                k0 k0Var = (k0) this.b;
                e0 e0Var = e1Var.f;
                boolean e10 = e1Var.e(k0Var);
                Map map = k0Var.c;
                if (map != null) {
                    e0Var.getClass();
                    if (!e0Var.f) {
                        ArrayList a10 = g0.a(e0Var.a);
                        ArrayList arrayList = new ArrayList();
                        int size = a10.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj2 = a10.get(i10);
                            i10++;
                            f0 f0Var = (f0) obj2;
                            c0 c0Var = (c0) map.get(f0Var.a);
                            gd.e eVar = c0Var != null ? new gd.e(f0Var, c0Var) : null;
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
                                gd.e eVar2 = (gd.e) obj3;
                                f0 f0Var2 = (f0) eVar2.a;
                                c0 c0Var2 = (c0) eVar2.b;
                                String a11 = e0Var.a();
                                String str = f0Var2.a;
                                int i12 = f0Var2.b;
                                if (kotlin.jvm.internal.j.a(a11, str)) {
                                    if (i12 == c0Var2.a && kotlin.jvm.internal.j.a((String) e0Var.d.getValue(), c0Var2.b)) {
                                    }
                                } else if (i12 != c0Var2.a) {
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
                boolean d = e1Var.d(k0Var);
                if (z10) {
                    map = e0Var.b(hd.o.a);
                } else if (d) {
                    map = e0Var.b(map);
                }
                o0 o0Var = z10 ? null : k0Var.a;
                if (!e10 && !z10) {
                    return d ? k0.a(k0Var, null, null, e0Var.b(map), 3) : k0Var;
                }
                o0 a12 = e1Var.b.a(o0Var);
                u0 u0Var = (u0) e1Var.c;
                zd.b0.q(zd.b0.b(u0Var.e), new s0(u0Var, a12, null));
                e0Var.f = true;
                return new k0(a12, null, map);
        }
    }
}
