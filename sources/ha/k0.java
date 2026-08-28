package ha;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import g7.h7;
import g7.y5;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class k0 implements g0 {
    public static final double f = Math.random();
    public static final /* synthetic */ int g = 0;
    public final s8.h a;
    public final y9.d b;
    public final ja.h c;
    public final android.support.v4.media.c d;
    public final qc.h e;

    public k0(s8.h hVar, y9.d dVar, ja.h hVar2, android.support.v4.media.c cVar, qc.h hVar3) {
        this.a = hVar;
        this.b = dVar;
        this.c = hVar2;
        this.d = cVar;
        this.e = hVar3;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(k0 k0Var, sc.c cVar) {
        h0 h0Var;
        int i9;
        try {
            if (cVar instanceof h0) {
                h0Var = (h0) cVar;
                int i10 = h0Var.c;
                if ((i10 & TLObject.FLAG_31) != 0) {
                    h0Var.c = i10 - TLObject.FLAG_31;
                    Object obj = h0Var.a;
                    rc.a aVar = rc.a.a;
                    i9 = h0Var.c;
                    if (i9 != 0) {
                        y5.b(obj);
                        Task d = ((y9.c) k0Var.b).d();
                        kotlin.jvm.internal.i.d(d, "firebaseInstallations.id");
                        h0Var.c = 1;
                        obj = h7.a(d, h0Var);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i9 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y5.b(obj);
                    }
                    return (String) obj;
                }
            }
            if (i9 != 0) {
            }
            return (String) obj;
        } catch (Exception e10) {
            Log.e("SessionFirelogPublisher", "Error getting Firebase Installation ID. Using an empty ID", e10);
            return "";
        }
        h0Var = new h0(k0Var, cVar);
        Object obj2 = h0Var.a;
        rc.a aVar2 = rc.a.a;
        i9 = h0Var.c;
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
    public static final Object b(k0 k0Var, sc.c cVar) {
        j0 j0Var;
        int i9;
        boolean z10;
        Boolean H;
        if (cVar instanceof j0) {
            j0Var = (j0) cVar;
            int i10 = j0Var.d;
            if ((i10 & TLObject.FLAG_31) != 0) {
                j0Var.d = i10 - TLObject.FLAG_31;
                Object obj = j0Var.b;
                rc.a aVar = rc.a.a;
                i9 = j0Var.d;
                z10 = true;
                if (i9 != 0) {
                    y5.b(obj);
                    Log.d("SessionFirelogPublisher", "Data Collection is enabled for at least one Subscriber");
                    ja.h hVar = k0Var.c;
                    j0Var.a = k0Var;
                    j0Var.d = 1;
                    if (hVar.b(j0Var) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    k0Var = j0Var.a;
                    y5.b(obj);
                }
                ja.h hVar2 = k0Var.c;
                H = hVar2.a.H();
                if (H == null) {
                    z10 = H.booleanValue();
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
                if (f <= k0Var.c.a()) {
                    return Boolean.TRUE;
                }
                Log.d("SessionFirelogPublisher", "Sessions SDK has dropped this session due to sampling.");
                return Boolean.FALSE;
            }
        }
        j0Var = new j0(k0Var, cVar);
        Object obj2 = j0Var.b;
        rc.a aVar2 = rc.a.a;
        i9 = j0Var.d;
        z10 = true;
        if (i9 != 0) {
        }
        ja.h hVar22 = k0Var.c;
        H = hVar22.a.H();
        if (H == null) {
        }
        if (z10) {
        }
    }
}
