package ab;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import org.telegram.tgnet.TLObject;
import v7.i8;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final class k0 implements g0 {
    public static final double f = Math.random();
    public static final /* synthetic */ int g = 0;
    public final l9.h a;
    public final ra.d b;
    public final cb.h c;
    public final qb.c d;
    public final kd.h e;

    public k0(l9.h hVar, ra.d dVar, cb.h hVar2, qb.c cVar, kd.h hVar3) {
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
    public static final Object a(k0 k0Var, md.c cVar) {
        h0 h0Var;
        int i10;
        try {
            if (cVar instanceof h0) {
                h0Var = (h0) cVar;
                int i11 = h0Var.c;
                if ((i11 & TLObject.FLAG_31) != 0) {
                    h0Var.c = i11 - TLObject.FLAG_31;
                    Object obj = h0Var.a;
                    ld.a aVar = ld.a.a;
                    i10 = h0Var.c;
                    if (i10 != 0) {
                        i8.b(obj);
                        Task d = ((ra.c) k0Var.b).d();
                        kotlin.jvm.internal.i.d(d, "firebaseInstallations.id");
                        h0Var.c = 1;
                        obj = w7.o.a(d, h0Var);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i8.b(obj);
                    }
                    return (String) obj;
                }
            }
            if (i10 != 0) {
            }
            return (String) obj;
        } catch (Exception e) {
            Log.e("SessionFirelogPublisher", "Error getting Firebase Installation ID. Using an empty ID", e);
            return "";
        }
        h0Var = new h0(k0Var, cVar);
        Object obj2 = h0Var.a;
        ld.a aVar2 = ld.a.a;
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
    public static final Object b(k0 k0Var, md.c cVar) {
        j0 j0Var;
        int i10;
        boolean z10;
        Boolean k10;
        if (cVar instanceof j0) {
            j0Var = (j0) cVar;
            int i11 = j0Var.d;
            if ((i11 & TLObject.FLAG_31) != 0) {
                j0Var.d = i11 - TLObject.FLAG_31;
                Object obj = j0Var.b;
                ld.a aVar = ld.a.a;
                i10 = j0Var.d;
                z10 = true;
                if (i10 != 0) {
                    i8.b(obj);
                    Log.d("SessionFirelogPublisher", "Data Collection is enabled for at least one Subscriber");
                    cb.h hVar = k0Var.c;
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
                    i8.b(obj);
                }
                cb.h hVar2 = k0Var.c;
                k10 = hVar2.a.k();
                if (k10 == null) {
                    z10 = k10.booleanValue();
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
        ld.a aVar2 = ld.a.a;
        i10 = j0Var.d;
        z10 = true;
        if (i10 != 0) {
        }
        cb.h hVar22 = k0Var.c;
        k10 = hVar22.a.k();
        if (k10 == null) {
        }
        if (z10) {
        }
    }
}
