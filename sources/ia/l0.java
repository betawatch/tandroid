package ia;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import h7.k6;
import h7.k7;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class l0 implements h0 {
    public static final double f = Math.random();
    public static final /* synthetic */ int g = 0;
    public final t8.h a;
    public final z9.d b;
    public final ka.h c;
    public final ae.b d;
    public final rc.h e;

    public l0(t8.h hVar, z9.d dVar, ka.h hVar2, ae.b bVar, rc.h hVar3) {
        this.a = hVar;
        this.b = dVar;
        this.c = hVar2;
        this.d = bVar;
        this.e = hVar3;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(l0 l0Var, tc.c cVar) {
        i0 i0Var;
        int i10;
        try {
            if (cVar instanceof i0) {
                i0Var = (i0) cVar;
                int i11 = i0Var.c;
                if ((i11 & TLObject.FLAG_31) != 0) {
                    i0Var.c = i11 - TLObject.FLAG_31;
                    Object obj = i0Var.a;
                    sc.a aVar = sc.a.a;
                    i10 = i0Var.c;
                    if (i10 != 0) {
                        k6.b(obj);
                        Task d = ((z9.c) l0Var.b).d();
                        kotlin.jvm.internal.j.d(d, "firebaseInstallations.id");
                        i0Var.c = 1;
                        obj = k7.a(d, i0Var);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        k6.b(obj);
                    }
                    return (String) obj;
                }
            }
            if (i10 != 0) {
            }
            return (String) obj;
        } catch (Exception e9) {
            Log.e("SessionFirelogPublisher", "Error getting Firebase Installation ID. Using an empty ID", e9);
            return "";
        }
        i0Var = new i0(l0Var, cVar);
        Object obj2 = i0Var.a;
        sc.a aVar2 = sc.a.a;
        i10 = i0Var.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(l0 l0Var, tc.c cVar) {
        k0 k0Var;
        int i10;
        boolean z10;
        Boolean b10;
        if (cVar instanceof k0) {
            k0Var = (k0) cVar;
            int i11 = k0Var.d;
            if ((i11 & TLObject.FLAG_31) != 0) {
                k0Var.d = i11 - TLObject.FLAG_31;
                Object obj = k0Var.b;
                sc.a aVar = sc.a.a;
                i10 = k0Var.d;
                z10 = true;
                if (i10 != 0) {
                    k6.b(obj);
                    Log.d("SessionFirelogPublisher", "Data Collection is enabled for at least one Subscriber");
                    ka.h hVar = l0Var.c;
                    k0Var.a = l0Var;
                    k0Var.d = 1;
                    if (hVar.b(k0Var) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    l0Var = k0Var.a;
                    k6.b(obj);
                }
                ka.h hVar2 = l0Var.c;
                b10 = hVar2.a.b();
                if (b10 == null) {
                    z10 = b10.booleanValue();
                } else {
                    Boolean a2 = hVar2.b.a();
                    if (a2 != null) {
                        z10 = a2.booleanValue();
                    }
                }
                if (z10) {
                    Log.d("SessionFirelogPublisher", "Sessions SDK disabled. Events will not be sent.");
                    return Boolean.FALSE;
                }
                if (f <= l0Var.c.a()) {
                    return Boolean.TRUE;
                }
                Log.d("SessionFirelogPublisher", "Sessions SDK has dropped this session due to sampling.");
                return Boolean.FALSE;
            }
        }
        k0Var = new k0(l0Var, cVar);
        Object obj2 = k0Var.b;
        sc.a aVar2 = sc.a.a;
        i10 = k0Var.d;
        z10 = true;
        if (i10 != 0) {
        }
        ka.h hVar22 = l0Var.c;
        b10 = hVar22.a.b();
        if (b10 == null) {
        }
        if (z10) {
        }
    }
}
