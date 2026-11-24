// default package

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class fia extends eeb implements fs4 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ hia c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fia(hia hiaVar, px2 px2Var, byte b) {
        super(2, px2Var);
        this.a = b;
        this.c = hiaVar;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        byte b = this.a;
        hia hiaVar = this.c;
        switch (b) {
            case 0:
                fia fiaVar = new fia(hiaVar, px2Var, (byte) 0);
                fiaVar.b = obj;
                return fiaVar;
            default:
                fia fiaVar2 = new fia(hiaVar, px2Var, (byte) 1);
                fiaVar2.b = obj;
                return fiaVar2;
        }
    }

    @Override // fs4
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g7c g7cVar = g7c.a;
        y7a y7aVar = (y7a) obj;
        px2 px2Var = (px2) obj2;
        switch (b) {
        }
        return ((fia) create(y7aVar, px2Var)).invokeSuspend(g7cVar);
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        boolean z;
        byte b = this.a;
        hia hiaVar = this.c;
        switch (b) {
            case 0:
                tue.b(obj);
                y7a y7aVar = (y7a) this.b;
                hiaVar.d.getClass();
                return y7a.a(y7aVar, null, tpb.a(), null, 5);
            default:
                tue.b(obj);
                y7a y7aVar2 = (y7a) this.b;
                zm8 zm8Var = hiaVar.f;
                boolean d = hiaVar.d(y7aVar2);
                Map map = y7aVar2.c;
                if (map != null) {
                    zm8Var.getClass();
                    z = false;
                    if (!zm8Var.f) {
                        ArrayList c = s4.c(zm8Var.a);
                        ArrayList arrayList = new ArrayList();
                        int size = c.size();
                        int i = 0;
                        while (i < size) {
                            Object obj2 = c.get(i);
                            i++;
                            bn8 bn8Var = (bn8) obj2;
                            xm8 xm8Var = (xm8) map.get(bn8Var.a);
                            lw7 lw7Var = xm8Var != null ? new lw7(bn8Var, xm8Var) : null;
                            if (lw7Var != null) {
                                arrayList.add(lw7Var);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            int size2 = arrayList.size();
                            int i2 = 0;
                            while (i2 < size2) {
                                Object obj3 = arrayList.get(i2);
                                i2++;
                                lw7 lw7Var2 = (lw7) obj3;
                                bn8 bn8Var2 = (bn8) lw7Var2.a;
                                xm8 xm8Var2 = (xm8) lw7Var2.b;
                                boolean a = rr5.a(zm8Var.a(), bn8Var2.a);
                                int i3 = bn8Var2.b;
                                if (a) {
                                    if (i3 == xm8Var2.a && rr5.a((String) zm8Var.d.getValue(), xm8Var2.b)) {
                                    }
                                } else if (i3 != xm8Var2.a) {
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
                boolean c2 = hiaVar.c(y7aVar2);
                if (z) {
                    map = zm8Var.b(o34.a);
                } else if (c2) {
                    map = zm8Var.b(map);
                }
                c8a c8aVar = z ? null : y7aVar2.a;
                if (!d && !z) {
                    return c2 ? y7a.a(y7aVar2, null, null, zm8Var.b(map), 3) : y7aVar2;
                }
                c8a a2 = hiaVar.b.a(c8aVar);
                i8a i8aVar = hiaVar.c;
                srd.b(ibe.a(i8aVar.e), new g8a(i8aVar, a2, null));
                zm8Var.f = true;
                return new y7a(a2, null, map);
        }
    }
}
