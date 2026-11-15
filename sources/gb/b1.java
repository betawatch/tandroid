package gb;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class b1 extends kd.j implements rd.p {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ d1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1(d1 d1Var, id.c cVar, int i7) {
        super(2, cVar);
        this.a = i7;
        this.c = d1Var;
    }

    @Override // kd.a
    public final id.c create(Object obj, id.c cVar) {
        switch (this.a) {
            case 0:
                b1 b1Var = new b1(this.c, cVar, 0);
                b1Var.b = obj;
                return b1Var;
            default:
                b1 b1Var2 = new b1(this.c, cVar, 1);
                b1Var2.b = obj;
                return b1Var2;
        }
    }

    @Override // rd.p
    public final Object invoke(Object obj, Object obj2) {
        j0 j0Var = (j0) obj;
        id.c cVar = (id.c) obj2;
        switch (this.a) {
        }
        return ((b1) create(j0Var, cVar)).invokeSuspend(gd.k.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x00a4  */
    @Override // kd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        int i7 = this.a;
        d1 d1Var = this.c;
        switch (i7) {
            case 0:
                jd.a aVar = jd.a.a;
                af.b.c(obj);
                return j0.a((j0) this.b, null, d1Var.d.a(), null, 5);
            default:
                jd.a aVar2 = jd.a.a;
                af.b.c(obj);
                j0 j0Var = (j0) this.b;
                d0 d0Var = d1Var.f;
                boolean e10 = d1Var.e(j0Var);
                Map map = j0Var.c;
                if (map != null) {
                    d0Var.getClass();
                    if (!d0Var.f) {
                        ArrayList a10 = f0.a(d0Var.a);
                        ArrayList arrayList = new ArrayList();
                        int size = a10.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj2 = a10.get(i10);
                            i10++;
                            e0 e0Var = (e0) obj2;
                            b0 b0Var = (b0) map.get(e0Var.a);
                            gd.e eVar = b0Var != null ? new gd.e(e0Var, b0Var) : null;
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
                                e0 e0Var2 = (e0) eVar2.a;
                                b0 b0Var2 = (b0) eVar2.b;
                                String a11 = d0Var.a();
                                String str = e0Var2.a;
                                int i12 = e0Var2.b;
                                if (kotlin.jvm.internal.j.a(a11, str)) {
                                    if (i12 == b0Var2.a && kotlin.jvm.internal.j.a((String) d0Var.d.getValue(), b0Var2.b)) {
                                    }
                                } else if (i12 != b0Var2.a) {
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
                boolean d = d1Var.d(j0Var);
                if (z10) {
                    map = d0Var.b(hd.o.a);
                } else if (d) {
                    map = d0Var.b(map);
                }
                n0 n0Var = z10 ? null : j0Var.a;
                if (!e10 && !z10) {
                    return d ? j0.a(j0Var, null, null, d0Var.b(map), 3) : j0Var;
                }
                n0 a12 = d1Var.b.a(n0Var);
                t0 t0Var = (t0) d1Var.c;
                zd.b0.q(zd.b0.b(t0Var.e), new r0(t0Var, a12, null));
                d0Var.f = true;
                return new j0(a12, null, map);
        }
    }
}
