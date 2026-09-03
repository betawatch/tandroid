package la;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import k7.i8;
import k7.q7;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class h0 implements d0 {
    public static final double f = Math.random();
    public static final /* synthetic */ int g = 0;
    public final w8.g a;
    public final ca.d b;
    public final na.h c;
    public final o5.i d;
    public final uc.h e;

    public h0(w8.g gVar, ca.d dVar, na.h hVar, o5.i iVar, uc.h hVar2) {
        this.a = gVar;
        this.b = dVar;
        this.c = hVar;
        this.d = iVar;
        this.e = hVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(h0 h0Var, wc.c cVar) {
        e0 e0Var;
        int i10;
        try {
            if (cVar instanceof e0) {
                e0Var = (e0) cVar;
                int i11 = e0Var.c;
                if ((i11 & TLObject.FLAG_31) != 0) {
                    e0Var.c = i11 - TLObject.FLAG_31;
                    Object obj = e0Var.a;
                    vc.a aVar = vc.a.a;
                    i10 = e0Var.c;
                    if (i10 != 0) {
                        q7.b(obj);
                        Task d = ((ca.c) h0Var.b).d();
                        kotlin.jvm.internal.j.d(d, "firebaseInstallations.id");
                        e0Var.c = 1;
                        obj = i8.a(d, e0Var);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        q7.b(obj);
                    }
                    return (String) obj;
                }
            }
            if (i10 != 0) {
            }
            return (String) obj;
        } catch (Exception e6) {
            Log.e("SessionFirelogPublisher", "Error getting Firebase Installation ID. Using an empty ID", e6);
            return "";
        }
        e0Var = new e0(h0Var, cVar);
        Object obj2 = e0Var.a;
        vc.a aVar2 = vc.a.a;
        i10 = e0Var.c;
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
    public static final Object b(h0 h0Var, wc.c cVar) {
        g0 g0Var;
        int i10;
        boolean z4;
        Boolean e6;
        if (cVar instanceof g0) {
            g0Var = (g0) cVar;
            int i11 = g0Var.d;
            if ((i11 & TLObject.FLAG_31) != 0) {
                g0Var.d = i11 - TLObject.FLAG_31;
                Object obj = g0Var.b;
                vc.a aVar = vc.a.a;
                i10 = g0Var.d;
                z4 = true;
                if (i10 != 0) {
                    q7.b(obj);
                    Log.d("SessionFirelogPublisher", "Data Collection is enabled for at least one Subscriber");
                    na.h hVar = h0Var.c;
                    g0Var.a = h0Var;
                    g0Var.d = 1;
                    if (hVar.b(g0Var) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h0Var = g0Var.a;
                    q7.b(obj);
                }
                na.h hVar2 = h0Var.c;
                e6 = hVar2.a.e();
                if (e6 == null) {
                    z4 = e6.booleanValue();
                } else {
                    Boolean a2 = hVar2.b.a();
                    if (a2 != null) {
                        z4 = a2.booleanValue();
                    }
                }
                if (z4) {
                    Log.d("SessionFirelogPublisher", "Sessions SDK disabled. Events will not be sent.");
                    return Boolean.FALSE;
                }
                if (f <= h0Var.c.a()) {
                    return Boolean.TRUE;
                }
                Log.d("SessionFirelogPublisher", "Sessions SDK has dropped this session due to sampling.");
                return Boolean.FALSE;
            }
        }
        g0Var = new g0(h0Var, cVar);
        Object obj2 = g0Var.b;
        vc.a aVar2 = vc.a.a;
        i10 = g0Var.d;
        z4 = true;
        if (i10 != 0) {
        }
        na.h hVar22 = h0Var.c;
        e6 = hVar22.a.e();
        if (e6 == null) {
        }
        if (z4) {
        }
    }
}
