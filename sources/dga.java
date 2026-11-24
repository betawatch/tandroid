// default package

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class dga extends ccb implements eq4 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ fga c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dga(fga fgaVar, fw2 fw2Var, byte b) {
        super(2, fw2Var);
        this.a = b;
        this.c = fgaVar;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        byte b = this.a;
        fga fgaVar = this.c;
        switch (b) {
            case 0:
                dga dgaVar = new dga(fgaVar, fw2Var, (byte) 0);
                dgaVar.b = obj;
                return dgaVar;
            default:
                dga dgaVar2 = new dga(fgaVar, fw2Var, (byte) 1);
                dgaVar2.b = obj;
                return dgaVar2;
        }
    }

    @Override // eq4
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g5c g5cVar = g5c.a;
        w5a w5aVar = (w5a) obj;
        fw2 fw2Var = (fw2) obj2;
        switch (b) {
        }
        return ((dga) create(w5aVar, fw2Var)).invokeSuspend(g5cVar);
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        boolean z;
        byte b = this.a;
        fga fgaVar = this.c;
        switch (b) {
            case 0:
                qse.b(obj);
                w5a w5aVar = (w5a) this.b;
                fgaVar.d.getClass();
                return w5a.a(w5aVar, null, snb.a(), null, 5);
            default:
                qse.b(obj);
                w5a w5aVar2 = (w5a) this.b;
                xk8 xk8Var = fgaVar.f;
                boolean d = fgaVar.d(w5aVar2);
                Map map = w5aVar2.c;
                if (map != null) {
                    xk8Var.getClass();
                    z = false;
                    if (!xk8Var.f) {
                        ArrayList c = s4.c(xk8Var.a);
                        ArrayList arrayList = new ArrayList();
                        int size = c.size();
                        int i = 0;
                        while (i < size) {
                            Object obj2 = c.get(i);
                            i++;
                            zk8 zk8Var = (zk8) obj2;
                            vk8 vk8Var = (vk8) map.get(zk8Var.a);
                            ku7 ku7Var = vk8Var != null ? new ku7(zk8Var, vk8Var) : null;
                            if (ku7Var != null) {
                                arrayList.add(ku7Var);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            int size2 = arrayList.size();
                            int i2 = 0;
                            while (i2 < size2) {
                                Object obj3 = arrayList.get(i2);
                                i2++;
                                ku7 ku7Var2 = (ku7) obj3;
                                zk8 zk8Var2 = (zk8) ku7Var2.a;
                                vk8 vk8Var2 = (vk8) ku7Var2.b;
                                boolean a = rp5.a(xk8Var.a(), zk8Var2.a);
                                int i3 = zk8Var2.b;
                                if (a) {
                                    if (i3 == vk8Var2.a && rp5.a((String) xk8Var.d.getValue(), vk8Var2.b)) {
                                    }
                                } else if (i3 != vk8Var2.a) {
                                }
                            }
                        }
                        z = true;
                    }
                    if (z) {
                        Log.d("FirebaseSessions", "Cold app start detected");
                    }
                } else {
                    Log.d("FirebaseSessions", "No process data map");
                    z = true;
                }
                boolean c2 = fgaVar.c(w5aVar2);
                if (z) {
                    map = xk8Var.b(d24.a);
                } else if (c2) {
                    map = xk8Var.b(map);
                }
                a6a a6aVar = z ? null : w5aVar2.a;
                if (!d && !z) {
                    return c2 ? w5a.a(w5aVar2, null, null, xk8Var.b(map), 3) : w5aVar2;
                }
                a6a a2 = fgaVar.b.a(a6aVar);
                g6a g6aVar = fgaVar.c;
                ppd.b(h9e.a(g6aVar.e), new e6a(g6aVar, a2, null));
                xk8Var.f = true;
                return new w5a(a2, null, map);
        }
    }
}
