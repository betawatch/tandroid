package ja;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import i7.c7;
import i7.w7;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class k0 implements g0 {
    public static final double f = Math.random();
    public static final /* synthetic */ int g = 0;
    public final u8.g a;
    public final aa.d b;
    public final la.h c;
    public final za.c d;
    public final sc.h e;

    public k0(u8.g gVar, aa.d dVar, la.h hVar, za.c cVar, sc.h hVar2) {
        this.a = gVar;
        this.b = dVar;
        this.c = hVar;
        this.d = cVar;
        this.e = hVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(k0 k0Var, uc.c cVar) {
        h0 h0Var;
        int i10;
        try {
            if (cVar instanceof h0) {
                h0Var = (h0) cVar;
                int i11 = h0Var.c;
                if ((i11 & TLObject.FLAG_31) != 0) {
                    h0Var.c = i11 - TLObject.FLAG_31;
                    Object obj = h0Var.a;
                    tc.a aVar = tc.a.a;
                    i10 = h0Var.c;
                    if (i10 != 0) {
                        c7.b(obj);
                        Task d = ((aa.c) k0Var.b).d();
                        kotlin.jvm.internal.j.d(d, "firebaseInstallations.id");
                        h0Var.c = 1;
                        obj = w7.a(d, h0Var);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c7.b(obj);
                    }
                    return (String) obj;
                }
            }
            if (i10 != 0) {
            }
            return (String) obj;
        } catch (Exception e10) {
            Log.e("SessionFirelogPublisher", "Error getting Firebase Installation ID. Using an empty ID", e10);
            return "";
        }
        h0Var = new h0(k0Var, cVar);
        Object obj2 = h0Var.a;
        tc.a aVar2 = tc.a.a;
        i10 = h0Var.c;
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
    public static final Object b(k0 k0Var, uc.c cVar) {
        j0 j0Var;
        int i10;
        boolean z10;
        Boolean G;
        if (cVar instanceof j0) {
            j0Var = (j0) cVar;
            int i11 = j0Var.d;
            if ((i11 & TLObject.FLAG_31) != 0) {
                j0Var.d = i11 - TLObject.FLAG_31;
                Object obj = j0Var.b;
                tc.a aVar = tc.a.a;
                i10 = j0Var.d;
                z10 = true;
                if (i10 != 0) {
                    c7.b(obj);
                    Log.d("SessionFirelogPublisher", "Data Collection is enabled for at least one Subscriber");
                    la.h hVar = k0Var.c;
                    j0Var.a = k0Var;
                    j0Var.d = 1;
                    if (hVar.b(j0Var) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    k0Var = j0Var.a;
                    c7.b(obj);
                }
                la.h hVar2 = k0Var.c;
                G = hVar2.a.G();
                if (G == null) {
                    z10 = G.booleanValue();
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
        tc.a aVar2 = tc.a.a;
        i10 = j0Var.d;
        z10 = true;
        if (i10 != 0) {
        }
        la.h hVar22 = k0Var.c;
        G = hVar22.a.G();
        if (G == null) {
        }
        if (z10) {
        }
    }
}
