package gb;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class d1 extends kd.j implements rd.p {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ f1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(f1 f1Var, id.c cVar, int i7) {
        super(2, cVar);
        this.a = i7;
        this.c = f1Var;
    }

    @Override // kd.a
    public final id.c create(Object obj, id.c cVar) {
        switch (this.a) {
            case 0:
                d1 d1Var = new d1(this.c, cVar, 0);
                d1Var.b = obj;
                return d1Var;
            default:
                d1 d1Var2 = new d1(this.c, cVar, 1);
                d1Var2.b = obj;
                return d1Var2;
        }
    }

    @Override // rd.p
    public final Object invoke(Object obj, Object obj2) {
        k0 k0Var = (k0) obj;
        id.c cVar = (id.c) obj2;
        switch (this.a) {
        }
        return ((d1) create(k0Var, cVar)).invokeSuspend(gd.k.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x00a4  */
    @Override // kd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z9;
        int i7 = this.a;
        f1 f1Var = this.c;
        switch (i7) {
            case 0:
                jd.a aVar = jd.a.a;
                af.b.c(obj);
                return k0.a((k0) this.b, null, f1Var.d.a(), null, 5);
            default:
                jd.a aVar2 = jd.a.a;
                af.b.c(obj);
                k0 k0Var = (k0) this.b;
                d0 d0Var = f1Var.f;
                boolean e10 = f1Var.e(k0Var);
                Map map = k0Var.c;
                if (map != null) {
                    d0Var.getClass();
                    if (!d0Var.f) {
                        ArrayList a10 = g0.a(d0Var.a);
                        ArrayList arrayList = new ArrayList();
                        int size = a10.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj2 = a10.get(i10);
                            i10++;
                            f0 f0Var = (f0) obj2;
                            b0 b0Var = (b0) map.get(f0Var.a);
                            gd.e eVar = b0Var != null ? new gd.e(f0Var, b0Var) : null;
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
                                b0 b0Var2 = (b0) eVar2.b;
                                String a11 = d0Var.a();
                                String str = f0Var2.a;
                                int i12 = f0Var2.b;
                                if (kotlin.jvm.internal.j.a(a11, str)) {
                                    if (i12 == b0Var2.a && kotlin.jvm.internal.j.a((String) d0Var.d.getValue(), b0Var2.b)) {
                                    }
                                } else if (i12 != b0Var2.a) {
                                }
                                if (z9) {
                                    Log.d("FirebaseSessions", "Cold app start detected");
                                }
                            }
                        }
                        z9 = true;
                        if (z9) {
                        }
                    }
                    z9 = false;
                    if (z9) {
                    }
                } else {
                    Log.d("FirebaseSessions", "No process data map");
                    z9 = true;
                }
                boolean d = f1Var.d(k0Var);
                if (z9) {
                    map = d0Var.b(hd.o.a);
                } else if (d) {
                    map = d0Var.b(map);
                }
                o0 o0Var = z9 ? null : k0Var.a;
                if (!e10 && !z9) {
                    return d ? k0.a(k0Var, null, null, d0Var.b(map), 3) : k0Var;
                }
                o0 a12 = f1Var.b.a(o0Var);
                u0 u0Var = (u0) f1Var.c;
                zd.b0.q(zd.b0.b(u0Var.e), new s0(u0Var, a12, null));
                d0Var.f = true;
                return new k0(a12, null, map);
        }
    }
}
